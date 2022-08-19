package a5_Relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_By_Attribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email = driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Test@1234");
		
		WebElement txt_password = driver.findElement(By.xpath("//input[@id='pass']"));
		txt_password.sendKeys("12345678");
		
		WebElement btn_login = driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.click();

	}

}
