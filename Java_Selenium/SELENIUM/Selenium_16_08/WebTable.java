package com.wipro.JavaSelenium_16_08;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
    public static void main(String[] args) {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();

        // ✅ Find the rows present in table1
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        int rowCount = rows.size();
        System.out.println("Number of rows: " + rowCount);

        // ✅ Find the columns present in table1
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/thead/tr[1]/th"));
        int colCount = cols.size();
        System.out.println("Number of columns: " + colCount);

        // ✅ Get text of a specific cell (Row 4, Column 3 → Email)
        WebElement cellText = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[3]"));
        String actualCellText = cellText.getText();
        String expectedCellText = "tconway@earthlink.net";

        // ✅ Validate the cell text
        if (actualCellText.equalsIgnoreCase(expectedCellText)) {
            System.out.println("The text matches");
        } else {
            System.out.println("The text does not match");
        }

        // Close browser
        driver.quit();
    }
}
