package Labs_NG_18_08;

/*import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomationTest {

    WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        System.out.println("\n============================");
        System.out.println("✅ Opened Practice Test Login Page");
        System.out.println("============================\n");
        Thread.sleep(4000); // to see page load
    }

    @Test(priority = 1)
    public void validLogin() throws InterruptedException {
        System.out.println("➡ Test 1: Performing VALID login...");

        // Enter username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        Thread.sleep(3000);

        // Enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        Thread.sleep(3000);

        // Click Submit
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(5000);

        // Verify successful login by checking logout button
        WebElement logoutBtn = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        if (logoutBtn.isDisplayed()) {
            System.out.println("✅ Valid Login Passed: User logged in successfully!");
        } else {
            System.out.println("❌ Valid Login Failed!");
        }
        Thread.sleep(4000);
    }

    @Test(priority = 2)
    public void invalidLogin() throws InterruptedException {
        System.out.println("➡ Test 2: Performing INVALID login...");

        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(4000);

        // Enter invalid username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("wrongUser");
        Thread.sleep(3000);

        // Enter invalid password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("wrongPass");
        Thread.sleep(3000);

        // Click Submit
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(5000);

        // Verify error message
        WebElement errorMsg = driver.findElement(By.xpath("//div[@id='error']"));
        if (errorMsg.isDisplayed()) {
            System.out.println("✅ Invalid Login Passed: Error message displayed - " + errorMsg.getText());
        } else {
            System.out.println("❌ Invalid Login Failed!");
        }
        Thread.sleep(4000);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        System.out.println("🔴 Closing Browser in 5 seconds...");
        Thread.sleep(5000);
        driver.quit();
    }
}*/





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.SkipException;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomationTest {

    WebDriver driver;

    // -----------------------------
    // Setup & Teardown
    // -----------------------------
    @BeforeClass(alwaysRun = true)
    public void setup() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        System.out.println("\n============================");
        System.out.println("✅ Opened Practice Test Login Page");
        System.out.println("============================\n");
        Thread.sleep(2000);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        System.out.println("🔴 Closing Browser in 3 seconds...");
        Thread.sleep(3000);
        driver.quit();
    }

    // -----------------------------
    // VALID LOGIN (Parameterized)
    // -----------------------------
    @Test(priority = 1, groups = {"Sanity"})
    @Parameters({"validUser", "validPass"})
    public void validLogin(String user, String pass) throws InterruptedException {
        System.out.println("➡ Test 1: Performing VALID login...");

        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(user);
        Thread.sleep(1000);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(pass);
        Thread.sleep(1000);

        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        // Verify successful login by checking logout button
        WebElement logoutBtn = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        if (logoutBtn.isDisplayed()) {
            System.out.println("✅ Valid Login Passed: User logged in successfully!");
        } else {
            System.out.println("❌ Valid Login Failed!");
        }
        Thread.sleep(2000);

        // Navigate back for next test
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    // -----------------------------
    // INVALID LOGIN (Parameterized + Dependency)
    // -----------------------------
    @Test(priority = 2, dependsOnMethods = {"validLogin"}, groups = {"Regression"})
    @Parameters({"invalidUser", "invalidPass"})
    public void invalidLogin(String user, String pass) throws InterruptedException {
        System.out.println("➡ Test 2: Performing INVALID login...");

        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(user);
        Thread.sleep(1000);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(pass);
        Thread.sleep(1000);

        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        // Verify error message
        WebElement errorMsg = driver.findElement(By.id("error"));
        if (errorMsg.isDisplayed()) {
            System.out.println("✅ Invalid Login Passed: Error message displayed - " + errorMsg.getText());
        } else {
            System.out.println("❌ Invalid Login Failed!");
        }
        Thread.sleep(2000);
    }

    // -----------------------------
    // SKIP TEST EXAMPLE
    // -----------------------------
    @Test(priority = 3, groups = {"Sanity"})
    public void skipTestExample() {
        boolean skip = true; // toggle to false to run
        if (skip) {
            throw new SkipException("⏭ Skipping this test intentionally.");
        }
        System.out.println("✅ This test ran because skip = false.");
    }
}


