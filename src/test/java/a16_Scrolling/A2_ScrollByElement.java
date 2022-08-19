package a16_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_ScrollByElement {
	
	@Test
	public void scroll() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		js.executeScript("arguments[0].scrollIntoView()", signup);                 // scroll up to the webElement
		//signup.click();
	}
}
