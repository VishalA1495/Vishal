package a11a_PopUp_Handling_ALERT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_Dismiss_Alert {

	public static void main(String[] args) {
		
		                        // Dismiss/ Reject PopUp for Deleting customer
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement cust_id = driver.findElement(By.xpath("//input[@name='cusid']"));
		cust_id.sendKeys("13");
		
		WebElement btn_submit = driver.findElement(By.xpath("//input[@name='submit']"));
		btn_submit.click();
		
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println(text);                  // Do you really want to delete this Customer?
		
		alt.dismiss();                          // Reject the PopUp
		
		

	}

}
