package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling_down {
	public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the home page
        driver.get("https://www.example.com/");

        // Scroll to the bottom of the page
        driver.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}
