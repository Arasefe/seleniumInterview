package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class _7FluentWaitPractice {
    @Test
    public void fluentWaitPr() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement start = driver.findElement(By.xpath("//div[@id='start']/button"));
        start.click();
//         Waiting 30 seconds for an element to be present on the page, checking
//         for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement aras = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement result = driver.findElement(By.xpath("//div[@id='finish']/h4"));
                if (!result.isDisplayed()) {
                    return null;
                }
                Assert.assertTrue(result.getText().equals("Hello World!"), "Assertion FAILED");
                return driver.findElement(By.xpath("//div[@id='finish']/h4"));
            }
        });
        driver.close();
    }
}

