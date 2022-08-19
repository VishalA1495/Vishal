package a6_AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_By_ForLoop {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");
		
		Thread.sleep(3000);
		
		List <WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		for(int i=0; i<=list.size(); i++) {
			
			if(list.get(i).getText().equals("maven repository")) {
				
				list.get(i).click();
				break;
				
			}
		}

		
		
		
		
	}

}
