package TestNG_Selenium_19_08;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Wait;

public class TestNGSoftAssertion {

    private static final SoftAssert soft = null;

	@Test
    public void testLogin() throws InterruptedException {

        // Setup Chrome driver
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Open OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

        // Get and validate page title using Soft Assertion
        String actualTitle = driver.getTitle();
        String expectedTitle = "Orange";  // Intentionally incorrect for demo
        System.out.println("Page Title: " + actualTitle);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotEquals(actualTitle, expectedTitle, "❌ Title should not match 'Orange'");

        // Locate username field with explicit wait
        WebElement username = driver.findElement(By.name("username"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> username.isDisplayed());
        username.sendKeys("Admin");

        Thread.sleep(2000);

        // Locate password field with fluent wait
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);

        fluentWait.until(d -> {
            password.sendKeys("Displayed"); // Just to test wait
            return true;
        });

        password.sendKeys("admin123");

        Thread.sleep(2000);

        // Click login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        Thread.sleep(2000);

        // Assert all soft assertions at the end
        softAssert.assertAll();

        // Close browser
        driver.quit();
        //VERY IMPORTANT: Collect all soft assertion results
        soft.assertAll();

    }
}

