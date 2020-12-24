package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _5ImplicitWaitPr {
    @Test
    public static void implicitWaitPractice() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement element = driver.findElement(By.cssSelector("[id='start'] button"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        /*
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(element));
         */

        WebElement el1=driver.findElement(By.xpath(""));
        WebElement el2=driver.findElement(By.xpath(""));
        WebElement el3=driver.findElement(By.xpath(""));
        WebElement el4=driver.findElement(By.xpath(""));

        List<WebElement> list=driver.findElements(By.xpath(""));

    }

}
