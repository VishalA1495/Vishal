package a16_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_MethodFor_Scrolling {
	
	public static void customeScroll(WebDriver driver, WebElement element) throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(4000);
		element.click();
	}
	
	@Test
	public void scroll() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		
		customeScroll(driver,signup);
		
		
		

	}
}
