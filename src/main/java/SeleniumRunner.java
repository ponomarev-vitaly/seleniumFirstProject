import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRunner {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/mrgraymatter/IdeaProjects/SeleniumFirstProject/src/main/resources/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com");

        WebElement searchInput = driver.findElement(By.cssSelector("[name='q']"));
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);

        driver.quit();
    }
}
