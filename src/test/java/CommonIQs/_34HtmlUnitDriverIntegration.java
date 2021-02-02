package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _34HtmlUnitDriverIntegration {

    @Test
    public void testA(){
        WebDriverManager.chromedriver().setup();

        HtmlUnitDriver driver=new HtmlUnitDriver(true);

        JavascriptExecutor executor = driver;


    }
    @Test
    public void testB(){
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.etsy.com");

        WebElement textBox=driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));
        textBox.sendKeys(null);





    }
}
