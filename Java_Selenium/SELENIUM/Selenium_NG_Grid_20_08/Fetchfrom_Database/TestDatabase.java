package FetchFromDatabase_20_08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerHelper;

public class TestDatabase {

    private static final Logger log = LoggerHelper.getLogger(TestDatabase.class);

    @Test
    public void readfromDBTest() throws ClassNotFoundException, SQLException, InterruptedException {

        // ✅ Database credentials
        String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb"; // change DB if needed
        String username = "root";  // adjust according to your MySQL
        String password = "123456789"; // adjust according to your MySQL

        // ✅ Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // ✅ Connect to DB
        Connection con = DriverManager.getConnection(dbURL, username, password);
        log.info("Connected to Database Successfully!");

        // ✅ Create statement
        Statement st = con.createStatement();

        // ✅ Query to fetch data
        String query = "SELECT * FROM persons";

        ResultSet rs = st.executeQuery(query);

        // ✅ Iterate through DB records
        while (rs.next()) {
            String usrname = rs.getString("firstName"); // column name from table
            String paswd = rs.getString("lastName");   // column name from table

            log.info("Fetched from DB → Username: " + usrname + ", Password: " + paswd);

            // ✅ Launch browser
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriver driver = new ChromeDriver(chromeOptions);

            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(4000);
            log.info("Browser Launched Successfully!");

            // ✅ Enter Username
            WebElement us1 = driver.findElement(By.xpath("//input[@name = 'username']"));
            us1.sendKeys(usrname);
            log.info("Username Entered");

            Thread.sleep(2000);

            // ✅ Enter Password
            WebElement pwd1 = driver.findElement(By.xpath("//input[@name = 'password']"));
            pwd1.sendKeys(paswd);
            log.info("Password Entered");

            Thread.sleep(2000);

            // ✅ Click Login
            WebElement loginbutton = driver.findElement(By.xpath("//button[@type = 'submit']"));
            loginbutton.click();
            log.info("Clicked on Login Button");

            Thread.sleep(3000);

            driver.quit(); // ✅ Close browser after each iteration
            log.info("Browser Closed Successfully!");
        }

        // ✅ Close DB connection
        con.close();
        log.info("Database Connection Closed!");
    }
}
