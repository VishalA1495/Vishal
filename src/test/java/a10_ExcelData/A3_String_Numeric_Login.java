package a10_ExcelData;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_String_Numeric_Login {

	public static void main(String[] args) throws Exception {
		
// in this method we use numeric data as a String-->for this we write date in excel sheet as ( '12345678 ) then it is consider as a String 

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement txt_pass = driver.findElement(By.xpath("//input[@id='pass']"));

		String path = "C:\\Users\\Hp\\eclipse-workspace\\Automation\\TestData\\Data.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		String mail = wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String pass = wb.getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();   // it is numeric value 
		
		txt_email.sendKeys(mail);
		txt_pass.sendKeys(pass);
		
		
	}

}
