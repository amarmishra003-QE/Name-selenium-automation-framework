package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop;

    @BeforeMethod
    public void setUp() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Case-insensitive check to avoid null issues
        String browser = prop.getProperty("Browser", "chrome");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        
        // Timeout handling
        int timeout = Integer.parseInt(prop.getProperty("timeout", "10"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));

        driver.get(prop.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
