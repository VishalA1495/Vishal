package a11b_PopUp_ChildBrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_Child_Browser_PopUp {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentWindowAdd = driver.getWindowHandle();
		System.out.println(parentWindowAdd);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllAdd = driver.getWindowHandles();
		System.out.println(AllAdd);
		
		Iterator<String> it = AllAdd.iterator();
		
		while(it.hasNext()) {
			
			String ChildWindowAdd = it.next();
			
			if(!parentWindowAdd.equals(ChildWindowAdd)) {
				
				driver.switchTo().window(ChildWindowAdd);    // switch to child window
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@1234");
				Thread.sleep(3000);
				driver.close();                           // close child window
			}
		}
		
		driver.switchTo().window(parentWindowAdd);        // switch to parent window
		Thread.sleep(3000);
		driver.close();                                   // close parent window
		
		
		
		

	}

}
