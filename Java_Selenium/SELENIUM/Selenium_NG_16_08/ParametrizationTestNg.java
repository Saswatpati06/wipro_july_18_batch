package TestNG_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametrizationTestNg {

    WebDriver driver;

    @Parameters({ "browser", "platform" })
    @Test
    public void testParameters(String browser, String platform) throws InterruptedException {

        // Browser setup
        if (browser.equalsIgnoreCase("chrome")) {
            if (platform.equalsIgnoreCase("windows")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
            }
        } else if (browser.equalsIgnoreCase("edge")) {
            if (platform.equalsIgnoreCase("windows")) {
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                driver = new EdgeDriver(edgeOptions);
            }
        } else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }

        // Open Application
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}


