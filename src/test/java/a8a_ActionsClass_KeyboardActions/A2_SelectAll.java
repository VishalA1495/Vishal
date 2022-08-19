package a8a_ActionsClass_KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_SelectAll {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email = driver.findElement(By.xpath("//input[@id='email']"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(txt_email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();    // upper case 
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();      // CONTROL + a
		

	}

}
