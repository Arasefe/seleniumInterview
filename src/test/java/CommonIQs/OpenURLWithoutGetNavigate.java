package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenURLWithoutGetNavigate {
    static WebDriver driver;
    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @Test
    public void openWithoutGetNavigate1() {
        // We need to downcast WebDriver reference variable to use JavascriptExecutor methods
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://www.amazon.com";
        String script = "window.location= \'"+url+"\'";
        js.executeScript(script);
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(),"Amazon.com. Spend less. Smile more.");
        driver.quit();
    }

    @Test
    public void openWithoutGetNavigate2() {
        // We need to downcast WebDriver reference variable to use JavascriptExecutor methods
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://www.google.com";
        String script = "window.location=\'"+url+"\'";
        js.executeScript(script);

        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.quit();
    }

    @Test
    public void openWithoutGetNavigate3() {
        // We need to downcast WebDriver reference variable to use JavascriptExecutor methods
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://www.carvana.com";
        String script = "window.location=\'"+url+"\'";
        js.executeScript(script);

        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(),"Carvana | Buy & Finance Used Cars Online | At Home Delivery");
        driver.quit();
    }
}

