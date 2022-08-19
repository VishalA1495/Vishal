package a5_Relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_By_Contains {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement link_signup = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		link_signup.click();
		
		WebElement txt_first = driver.findElement(By.xpath("//input[contains(@id,'u_0_b_')]"));  // xpath contains 'u_0_b_'     
		txt_first.sendKeys("Vishal");

	}

}
