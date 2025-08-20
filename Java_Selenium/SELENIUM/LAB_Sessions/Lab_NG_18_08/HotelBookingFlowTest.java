package Labs_NG_18_08;

/*import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBookingFlowTest {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @BeforeClass
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
        Thread.sleep(3000); // wait for homepage
    }

    @Test
    public void bookHotel() throws InterruptedException {
        System.out.println("STEP 1: Navigate to Hotels tab");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-name='hotels']"))).click();
        Thread.sleep(3000);

        System.out.println("STEP 2: Enter Destination (Dubai)");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-hotels_city-container"))).click();
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("select2-search__field")));
        searchBox.sendKeys("Dubai");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("select2-hotels_city-results"), "Dubai,United Arab Emirates"));
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        System.out.println("STEP 3 & 4: Select Check-in and Check-out dates from calendar");
        driver.findElement(By.id("checkin")).click();
        WebElement checkinDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hotels-checkin-calendar']//div[text()='20']")));
        checkinDate.click();
        Thread.sleep(2000);
        WebElement checkoutDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hotels-checkout-calendar']//div[text()='25']")));
        checkoutDate.click();
        Thread.sleep(3000);

        System.out.println("STEP 5: Add one child guest");
        driver.findElement(By.xpath("//a[contains(@class, 'travellers')]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'dropdown-item') and .//div[text()='Child']]//button[contains(@class,'bootstrap-touchspin-up')]"))).click();
        Thread.sleep(3000);

        System.out.println("STEP 6: Click Search");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);

        System.out.println("STEP 7: Select the first hotel from results");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h4[contains(@class,'title')]/a)[1]"))).click();
        Thread.sleep(5000);

        System.out.println("STEP 8: Switch to the new browser tab");
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);

        System.out.println("STEP 9: Book the first available room");
        WebElement availableRoomsHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Available Rooms']")));
        actions.moveToElement(availableRoomsHeader).perform();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//form[contains(@class,'book-form')]//button[normalize-space()='Book Now'])[1]"))).click();
        Thread.sleep(4000);

        System.out.println("STEP 10: Fill booking details");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("Saswat");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Pati");
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("saswat@test.com");
        Thread.sleep(1000);
        driver.findElement(By.name("phone")).sendKeys("9876543210");
        Thread.sleep(1000);
        driver.findElement(By.name("address")).sendKeys("Bhubaneswar, Odisha");
        Thread.sleep(3000);

        System.out.println("STEP 11: Confirm Booking");
        WebElement confirmBtn = driver.findElement(By.id("booking"));
        WebElement termsCheckbox = driver.findElement(By.id("agreechb"));
        actions.moveToElement(termsCheckbox).click().perform();
        Thread.sleep(2000);
        confirmBtn.click();
        Thread.sleep(5000);

        System.out.println("STEP 12: Verifying final invoice page");
        wait.until(ExpectedConditions.urlContains("invoice"));
        System.out.println("✅ Booking flow executed successfully without JavaScript!");
        Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            System.out.println("🔴 Closing Browser in 5 seconds...");
            Thread.sleep(5000);
            driver.quit();
        }
    }
}*/




import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBookingFlowTest {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    // ================== SETUP ==================
    @BeforeClass
    @Parameters({"url"})  // 🔹 PARAMETERIZATION: URL passed from testng.xml
    public void setup(String url) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        actions = new Actions(driver);

        driver.manage().window().maximize();
        driver.get(url);
        System.out.println("\n============================");
        System.out.println("Opened Website: " + url);
        System.out.println("============================\n");
        Thread.sleep(3000);
    }

    // ================== MULTIPLE TEST CASES ==================
    @Test(priority = 1)
    @Parameters({"destination"})  // 🔹 PARAMETERIZATION
    public void searchHotel(String destination) throws InterruptedException {
        System.out.println("STEP 1: Navigate to Hotels tab");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-name='hotels']"))).click();

        System.out.println("STEP 2: Enter Destination: " + destination);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-hotels_city-container"))).click();
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("select2-search__field")));
        searchBox.sendKeys(destination);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("select2-hotels_city-results"), destination));
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Test(priority = 2, dependsOnMethods = {"searchHotel"})  // 🔹 DEPENDENCIES
    @Parameters({"checkinDate", "checkoutDate"})  // 🔹 PARAMETERIZATION
    public void selectDates(String checkinDate, String checkoutDate) throws InterruptedException {
        System.out.println("STEP 3 & 4: Selecting Check-in: " + checkinDate + " and Check-out: " + checkoutDate);
        driver.findElement(By.id("checkin")).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='hotels-checkin-calendar']//div[text()='" + checkinDate + "']"))).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='hotels-checkout-calendar']//div[text()='" + checkoutDate + "']"))).click();
        Thread.sleep(3000);
    }

    @Test(priority = 3, dependsOnMethods = {"selectDates"})  // 🔹 DEPENDENCIES
    @Parameters({"addChild"})  // 🔹 PARAMETERIZATION
    public void selectGuests(String addChild) throws InterruptedException {
        System.out.println("STEP 5: Selecting Guests");
        driver.findElement(By.xpath("//a[contains(@class, 'travellers')]")).click();

        if (addChild.equalsIgnoreCase("yes")) {
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[contains(@class,'dropdown-item') and .//div[text()='Child']]//button[contains(@class,'bootstrap-touchspin-up')]"))).click();
            System.out.println("Added a child guest.");
        } else {
            System.out.println("No child guest selected.");
        }
        Thread.sleep(2000);
    }

    @Test(priority = 4, dependsOnMethods = {"selectGuests"})  // 🔹 DEPENDENCIES
    public void searchAndSelectHotel() throws InterruptedException {
        System.out.println("STEP 6: Click Search");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);

        System.out.println("STEP 7: Selecting first hotel from results");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h4[contains(@class,'title')]/a)[1]"))).click();
        Thread.sleep(5000);

        System.out.println("STEP 8: Switching to hotel details tab");
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    @Test(priority = 5, dependsOnMethods = {"searchAndSelectHotel"})  // 🔹 DEPENDENCIES
    public void bookRoom() throws InterruptedException {
        System.out.println("STEP 9: Booking first available room");
        WebElement availableRoomsHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Available Rooms']")));
        actions.moveToElement(availableRoomsHeader).perform();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//form[contains(@class,'book-form')]//button[normalize-space()='Book Now'])[1]"))).click();
        Thread.sleep(4000);
    }

    @Test(priority = 6, dependsOnMethods = {"bookRoom"})  // 🔹 DEPENDENCIES
    @Parameters({"firstname", "lastname", "email", "phone", "address"})  // 🔹 PARAMETERIZATION
    public void fillBookingDetails(String firstname, String lastname, String email, String phone, String address) throws InterruptedException {
        System.out.println("STEP 10: Filling Booking Details");

        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name("lastname")).sendKeys(lastname);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("phone")).sendKeys(phone);
        driver.findElement(By.name("address")).sendKeys(address);
        Thread.sleep(3000);
    }

    @Test(priority = 7, dependsOnMethods = {"fillBookingDetails"})  // 🔹 DEPENDENCIES
    @Parameters({"skipBooking"})  // 🔹 PARAMETERIZATION
    public void confirmBooking(String skipBooking) throws InterruptedException {
        if (skipBooking.equalsIgnoreCase("yes")) {
            // 🔹 SKIPPING TEST CASE dynamically using SkipException
            throw new SkipException("Skipping confirm booking as per parameter.");
        }

        System.out.println("STEP 11: Confirming Booking");
        WebElement confirmBtn = driver.findElement(By.id("booking"));
        WebElement termsCheckbox = driver.findElement(By.id("agreechb"));
        actions.moveToElement(termsCheckbox).click().perform();
        confirmBtn.click();

        wait.until(ExpectedConditions.urlContains("invoice"));
        System.out.println("✅ Booking confirmed, invoice page displayed.");
    }

    // ================== TEAR DOWN ==================
    @AfterClass
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            System.out.println("🔴 Closing Browser...");
            Thread.sleep(3000);
            driver.quit();
        }
    }
}





