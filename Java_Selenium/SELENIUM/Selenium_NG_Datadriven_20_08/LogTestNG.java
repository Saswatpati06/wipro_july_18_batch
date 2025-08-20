package DatadrivenTestNG_20_08;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerHelper;

import org.apache.logging.log4j.Logger;

public class LogTestNG {

    private static final Logger log = LoggerHelper.getLogger(LogTestNG.class);

    @Test
    public void launchbrowser() {
        log.info("===== Test Started: launchbrowser =====");

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/windows");
        log.info("Invoking the browser and navigating to The Internet website");

        driver.manage().window().maximize();
        log.info("Browser window maximized");

        driver.quit();
        log.info("Browser closed");
        log.info("===== Test Finished: launchbrowser =====");
    }

    @Test
    public void login() throws InterruptedException {
        log.info("===== Test Started: login =====");

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        log.info("Navigated to OrangeHRM login page");

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.name("username"));
        log.info("Entering the username");
        username.sendKeys("Admin");

        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        log.info("Entering the password");
        password.sendKeys("admin123");

        Thread.sleep(2000);

        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        log.info("Clicking on the login button");
        loginbutton.click();

        Thread.sleep(2000);

        driver.quit();
        log.info("Browser closed");
        log.info("===== Test Finished: login =====");
    }
}

