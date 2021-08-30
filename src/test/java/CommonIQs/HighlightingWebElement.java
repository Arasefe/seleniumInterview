package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HighlightingWebElement {
    static WebDriver driver;

    @BeforeClass
    private void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void highLight() {
        String url = "https://www.tutorialspoint.com/index.htm";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath(""));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 2px solid yellow;");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
    }

    @Test
    public void test() {
        driver = new FirefoxDriver();
        String url = "https://www.google.com";
        driver.get(url);
        new Actions(driver).sendKeys("some_text").perform();
    }
}
