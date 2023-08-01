package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatingForm {
	public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the contact form
        driver.get("https://www.example.com/contact");

        // Enter the name
        driver.findElement(By.name("name")).sendKeys("Your Name");

        // Enter the email address
        driver.findElement(By.name("gmail")).sendKeys("your@gmail.com");

        // Enter the message
        driver.findElement(By.name("message")).sendKeys("Your message here");

        // Validate the form
        boolean isValid = driver.findElement(By.id("submit_button")).isEnabled();

        // If the form is valid, click the submit button
        if (isValid) {
            driver.findElement(By.id("submit_button")).click();
        }
    }
}
