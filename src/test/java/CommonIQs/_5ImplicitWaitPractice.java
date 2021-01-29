package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _5ImplicitWaitPractice {
    @Test
    public static void implicitWaitPractice() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement element = driver.findElement(By.cssSelector("[id='start'] button"));
        //button[text()='Start']
        element.click();
        WebElement text=driver.findElement(By.xpath("//h4[.='Hello World!']"));
        Assert.assertEquals(text.getText(),"Hello World!");


    }

}
