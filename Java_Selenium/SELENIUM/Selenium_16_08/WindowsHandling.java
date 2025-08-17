package com.wipro.JavaSelenium_16_08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;



public class WindowsHandling {
    public static void main(String[] args) throws InterruptedException {
        
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");

        // Click the link to open a new window
        WebElement clickHere = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
        clickHere.click();
        Thread.sleep(3000);

        // Get all window handles (main = [0], child = [1])
        Object[] windowHandles = driver.getWindowHandles().toArray();

        // Switch to child window
        driver.switchTo().window(windowHandles[1].toString());
        System.out.println("Child Window Title: " + driver.getTitle());
        Thread.sleep(3000);

        // Close child window
        driver.close();

        // Switch back to main window
        driver.switchTo().window(windowHandles[0].toString());
        System.out.println("Main Window Title: " + driver.getTitle());

        // Quit driver
        driver.quit();
    }
}

