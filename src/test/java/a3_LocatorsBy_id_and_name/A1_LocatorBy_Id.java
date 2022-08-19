package a3_LocatorsBy_id_and_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_LocatorBy_Id {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email = driver.findElement(By.id("email"));
		txt_email.sendKeys("Test@1234");
		
		WebElement txt_password = driver.findElement(By.id("pass"));
		txt_password.sendKeys("12345678");
		
		

	}

}
