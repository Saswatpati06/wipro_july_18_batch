package DatadrivenTesting_19_08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
    WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;

    @Test
    public void login() throws IOException {
    	File src = new File("C:\\Users\\HP\\eclipse-workspacewipro\\JavaSelenium\\src\\test\\java\\DatadrivenTesting_19_08\\TestData.xlsx");


        // Load the workbook
        FileInputStream fis = new FileInputStream(src);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);

        // Iterate rows
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            // Setup browser
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(chromeOptions);

            try {
                // Launch URL
                driver.get("https://www.facebook.com/login");
                driver.manage().window().maximize();

                // Get Title
                String title = driver.getTitle();
                System.out.println("Row " + i + " → " + title);

                // Write title into Excel
                sheet.getRow(i).createCell(2).setCellValue(title);

            } finally {
                driver.quit();  // Close browser each iteration
            }
        }

        // Close input stream before writing
        fis.close();

        // Save updated Excel
        FileOutputStream fos = new FileOutputStream(src);
        workbook.write(fos);
        fos.close();
        workbook.close();
    }
}
