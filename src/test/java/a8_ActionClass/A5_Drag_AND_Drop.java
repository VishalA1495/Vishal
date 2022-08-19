package a8_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_Drag_AND_Drop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement destn1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(src1, destn1).build().perform();
		
		WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destn2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		act.dragAndDrop(src2, destn2).build().perform();
		
		WebElement src3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement destn3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		act.dragAndDrop(src3, destn3).build().perform();
		
		WebElement src4 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement destn4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		act.dragAndDrop(src4, destn4).build().perform();
		
		
		
	}

}
