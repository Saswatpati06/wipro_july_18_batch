package TestNG_Selenium_19_08;



	/*import java.time.Duration;
	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.ElementNotInteractableException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;
	 
	 
	@Listeners(TestNGListners.class)	
	public class TestNG_ListnerTestcase {

		@Test
		public void testlogin() throws InterruptedException {

			ChromeOptions chromeOptions = new ChromeOptions();
	 
			WebDriverManager.chromedriver().setup();
	 
			WebDriver driver = new ChromeDriver(chromeOptions);
	 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			// name locator 
			// enter text in username field 
			Thread.sleep(2000);

				WebElement username = driver.findElement(By.name("username"));
			// explicit wait - applicable for single web element - selenium 4
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			 wait.until(d -> username.isDisplayed());

			username.sendKeys("Admin");
			Thread.sleep(2000);
			// enter text in password field
			WebElement password = driver.findElement
					(By.xpath("//input[@name = 'password']"));
			// fluent wait 
			 Wait<WebDriver> wait1 =
				        new FluentWait<>(driver)
				            .withTimeout(Duration.ofSeconds(2))
				            .pollingEvery(Duration.ofMillis(300))
				            .ignoring(ElementNotInteractableException.class);
	 
				    wait1.until(
				        d -> {
				        	password.sendKeys("Displayed");
				          return true;
				        });
			password.sendKeys("admin123");
			// click on login button
			Thread.sleep(2000);
			WebElement loginbutton = driver.findElement
					(By.xpath("//button[@type = 'submit']"));

			loginbutton.click();
			Thread.sleep(2000);

		}
	 
	}*/





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGListners.class)  // Attach the custom TestNG listener
public class TestNG_ListnerTestcase {

    @Test
    public void testLogin() {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open OrangeHRM demo site
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Explicit wait for username field
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement username = wait.until(d -> driver.findElement(By.name("username")));
            username.sendKeys("Admin");

            // Fluent wait for password field
            WebElement password = driver.findElement(By.name("password"));
            Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(5))
                    .pollingEvery(Duration.ofMillis(500))
                    .ignoring(ElementNotInteractableException.class);

            fluentWait.until(d -> {
                password.sendKeys("admin123");
                return true;
            });

            // Click login button
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();

        } finally {
            // Ensure browser closes after test execution
            driver.quit();
        }
    }
}



