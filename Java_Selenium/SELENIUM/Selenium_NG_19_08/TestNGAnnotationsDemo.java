package TestNG_Selenium_19_08;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsDemo {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Opening the DB connections");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Closing the DB connections");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Checking products");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Removing products");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Opening the API connections");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Closing the API connections");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Launching browser");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Closing the browser");
    }

    @Test
    public void testCase1() {
        System.out.println("✅ Testcase1 is executed");
    }

    @Test
    public void testCase2() {
        System.out.println("✅ Testcase2 is executed");
    }

    @Test
    public void testCase3() {
        System.out.println("✅ Testcase3 is executed");
    }
}
