package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin {
	public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the Facebook login page
        driver.get("https://www.facebook.com/login");

        // Find the username input field
        WebElement usernameInput = driver.findElement(By.id("email"));

        // Enter your username
        usernameInput.sendKeys("your_username");

        // Find the password input field
        WebElement passwordInput = driver.findElement(By.id("pass"));

        // Enter your password
        passwordInput.sendKeys("your_password");

        // Click the login button
        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        loginButton.click();

        // Wait for the login to complete
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));

        // Close the browser
        driver.quit();
    }
}
