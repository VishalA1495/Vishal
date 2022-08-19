package a9_ScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class A2_fb_DynamicName {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@1234");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		String path = "C:\\Users\\Hp\\eclipse-workspace\\Automation\\ScreenShot";
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		String rm = RandomString.make(3);
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destn = new File(path+"\\"+rm+".png");
		
		FileUtils.copyFile(src, destn);

	}

}
