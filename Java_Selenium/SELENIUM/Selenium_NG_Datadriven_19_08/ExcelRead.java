package DatadrivenTesting_19_08;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

    WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;

    @Test
    public void login() throws IOException {

        // Load Excel file
    	File src = new File("C:\\Users\\HP\\eclipse-workspacewipro\\JavaSelenium\\src\\test\\java\\DatadrivenTesting_19_08\\TestData.xlsx");

        FileInputStream fis = new FileInputStream(src);

        // Load workbook & sheet
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);

        // Loop through rows
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            // Setup Chrome
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(chromeOptions);

            // Open Facebook login
            driver.get("https://www.facebook.com/login");
            driver.manage().window().maximize();

            // Read Username
            cell = sheet.getRow(i).getCell(0);
            WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
            email.sendKeys(cell.getStringCellValue());

            // Read Password
            cell = sheet.getRow(i).getCell(1);
            WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
            password.sendKeys(cell.getStringCellValue());
        }
    }
}

