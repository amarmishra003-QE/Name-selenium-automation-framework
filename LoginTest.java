import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        // Set ChromeDriver path (you can ignore path for now)
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://example.com");

        // Maximize window
        driver.manage().window().maximize();

        // Get page title
        String title = driver.getTitle();

        // Validate title
        if (title.contains("Example")) {
            System.out.println("Title validation PASSED");
        } else {
            System.out.println("Title validation FAILED");
        }

        // Example element interaction (for future use)
        // driver.findElement(By.id("username")).send
