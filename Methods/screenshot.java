package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class screenshot {
	public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the home page
        driver.get("https://www.example.com/");

        // Take a screenshot of the page
        WebDriverWait wait = new WebDriverWait(driver, 10);
        File screenshot = wait.until(
            ExpectedConditions.elementToBeClickable(By.id("screenshot"))
        ).getScreenshotAs(OutputType.FILE);

        // Save the screenshot to a file
        System.out.println("Saving screenshot to file...");
        Files.copy(screenshot, new File("screenshot.png"));
    }
}
