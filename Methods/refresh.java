package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class refresh {
	public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the Google home page
        driver.get("https://www.google.com/");

        // Refresh the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }
}
