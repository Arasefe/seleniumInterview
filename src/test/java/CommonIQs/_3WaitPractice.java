package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class _3WaitPractice {
    @Test
    public static void implicitWaitPractice() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement element = driver.findElement(By.cssSelector("[id='start'] button"));
        //button[text()='Start']
        element.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement text=driver.findElement(By.xpath("//h4[.='Hello World!']"));
        wait.until(ExpectedConditions.elementToBeClickable(text));
        Assert.assertEquals(text.getText(),"Hello World!");


    }

    @Test
    public void explicitWait(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        WebElement element=driver.findElement(By.cssSelector(""));
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.invisibilityOfAllElements(element));


    }

    @Test
    public void alertToBeVisible(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());

    }

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
