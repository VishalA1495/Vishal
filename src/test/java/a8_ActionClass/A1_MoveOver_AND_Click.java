package a8_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_MoveOver_AND_Click {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement drp_selenium = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));

		Actions act = new Actions(driver);
		
		act.moveToElement(drp_selenium).click().build().perform();

	}

}
