package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchProductDaraz {
	public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the Daraz home page
        driver.get("https://www.daraz.com.bd/");

        // Find the search input field
        WebElement searchInput = driver.findElement(By.id("search-input"));

        // Enter the search term "selenium"
        searchInput.sendKeys("Fantech H11");

        // Click the search button
        WebElement searchButton = driver.findElement(By.id("searchbutton"));
        searchButton.click();

        // Wait for the search results to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product-list-container")));

        // Print the number of search results
        WebElement numberOfResults = driver.findElement(By.id("product-list-count"));
        System.out.println(numberOfResults.getText());

        // Close the browser
        driver.quit();
    }
}
