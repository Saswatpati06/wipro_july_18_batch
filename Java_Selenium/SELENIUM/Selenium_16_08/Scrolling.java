package com.wipro.JavaSelenium_16_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        // Locate "About Amazon" link in the footer
        WebElement aboutAmazon = driver.findElement(By.xpath("//a[text()='About Amazon']"));

        // Use Actions class to scroll to the element
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.scrollToElement(aboutAmazon).perform();

        // Click on the "About Amazon" link
        aboutAmazon.click();

        // Just to verify the navigation
        System.out.println("Navigated to: " + driver.getTitle());

        // Close browser
        driver.quit();
    }

}
