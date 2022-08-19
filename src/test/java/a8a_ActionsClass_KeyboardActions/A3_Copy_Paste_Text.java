package a8a_ActionsClass_KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_Copy_Paste_Text {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email = driver.findElement(By.xpath("//input[@id='email']"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(txt_email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();    // upper case 
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();      // CONTROL + a
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();    // CONTROL + c
		
		// identify password field - click on it - paste the text
		WebElement txt_password = driver.findElement(By.xpath("//input[@id='pass']"));
		txt_password.click();
		
		act.keyDown(txt_password, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();   // CONTROL + v
		

	}

}
