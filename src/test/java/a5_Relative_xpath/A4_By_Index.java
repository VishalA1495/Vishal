package a5_Relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4_By_Index {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement link_signup = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		link_signup.click();
		
		WebElement txt_last = driver.findElement(By.xpath("(//input[@data-type='text'])[2]")); // here we provide index of particular field
		txt_last.sendKeys("Aher");

	}

}
