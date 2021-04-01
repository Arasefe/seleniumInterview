package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _29EnterNullWithSendKeys {

    @Test
    public void sendNull1(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement el=driver.findElement(By.name("q"));
        el.sendKeys("null");
        el.sendKeys(Keys.ENTER);            //IllegalArgumentException: Keys to send should be a not null CharSequence

    }
    @Test
    public void sendNull2(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        JavascriptExecutor JS=(JavascriptExecutor) driver;
        String url="https://www.amazon.com";
        String script = "window.location= \'"+url+"\'";
        JS.executeScript(script);
        WebElement el=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        el.sendKeys(null);
        el.sendKeys(Keys.ENTER);        //IllegalArgumentException: Keys to send should be a not null CharSequence

    }

}
