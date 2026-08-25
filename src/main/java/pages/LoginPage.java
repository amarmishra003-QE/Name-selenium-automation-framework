package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    // Locators encapsulated (private)
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public LoginPage enterUsername(String user) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(user);
        return this;
    }

    public LoginPage enterPassword(String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(pass);
        return this;
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
