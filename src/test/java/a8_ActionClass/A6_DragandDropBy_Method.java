package a8_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A6_DragandDropBy_Method {
	
	public static void draganddrop(WebDriver driver, WebElement drag, WebElement drop) {
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop);
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement destn1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

		draganddrop(driver,src1,destn1);
		
	}

}
