package a10_ExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_fb_NumericLogin {

	public static void main(String[] args) throws Exception {
		
		// if password is number then we use double data type but double give extra '.0' so we need to convert it into String
		
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
		double pass = wb.getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue(); // it is number
		
		String p = String.valueOf(pass);         // 1234567.0
		
		String p1 = p.replace(".0", "");
		
		txt_email.sendKeys(mail);
		txt_pass.sendKeys(p1);

		// but instead of this we can use another way which is given in A3 class
		
	}

}
