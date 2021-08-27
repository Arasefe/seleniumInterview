package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HiddenWebElementHandling {
    @Test
    public void handlingHiddenWebElements1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // We need to downcast WebDriver reference variable to use JavascriptExecutor methods
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // identify element and click
        driver.findElement(By.id("hide-textbox")).click();
        // Javascript executor class with executeScript method
        JavascriptExecutor j = (JavascriptExecutor) driver;
        // identify element and set value
        j.executeScript("document.getElementById('displayed-text').value='Selenium';");
        String s = (String) j.executeScript("return document.getElementById('displayed-text').value");
        System.out.print("Value entered in hidden field: " + s);
        Assert.assertEquals(s, "Selenium");
        driver.close();
    }

    @Test
    public void handlingHiddenWebElements2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // identify element and click
        driver.findElement(By.id("hide-textbox")).click();
        // Javascript executor class with executeScript method
        JavascriptExecutor j = (JavascriptExecutor) driver;
        // identify element and set value
        j.executeScript("document.getElementById('displayed-text').value='Hide/Show Example';");
        String s = (String) j.executeScript("return document.getElementById('displayed-text').value");
        System.out.print("Value entered in hidden field: " + s);
        Assert.assertEquals(s, "Hide/Show Example");
        driver.close();

    }
}
