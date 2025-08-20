package com.wipro.JavaSeleniumGrid_20_08;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HelperClassFirefox {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public static String remote_url = "http://192.168.29.10:4444/wd/hub";

    @BeforeMethod
    public void setDriver() throws MalformedURLException {
        FirefoxOptions options = new FirefoxOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url), options));
        driver.get().get("https://opensource-demo.orangehrmlive.com/");
        driver.get().manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @Test
    public void loginTest() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        // Wait for username field
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");

        // Password field
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("admin123");

        // Login button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}

