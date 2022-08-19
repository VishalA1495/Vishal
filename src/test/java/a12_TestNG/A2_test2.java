package a12_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_test2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void m1() {
		System.out.println("test1");
	}
	@Test
	public void m2() {
		System.out.println("test2");
	}
	@Test
	public void m3() {
		System.out.println("test3");
	}
	@Test
	public void m4() {
		System.out.println("test4");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
