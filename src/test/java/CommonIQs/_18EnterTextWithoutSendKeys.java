package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _18EnterTextWithoutSendKeys {
    @Test
    public void enterTextWithoutSendKeys() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        // 1. To initialize js object
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        // 2. Use executeScript() method to enter username
        JS.executeScript("document.getElementById('twotabsearchtextbox').value='Best toy'");

    }

    @Test
    public void enterTextWithoutSendKeys2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        // 1. To initialize js object
        //Javascript also provides some methods to find the elements:
        //getElementById
        //getElementsByName
        //getElementsByClass
        //getElementsByTagName
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        // 2. Use executeScript() method to enter item in the search box
        JS.executeScript("document.getElementByName('q').value='multifunctional tool'");


    }
    @Test
    public void enterTextWithOutSendKeys2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        // 2. Use executeScript() method to enter item in the search box
        JS.executeScript("document.getElementById('global-enhancements-search-query').value='I love Banu'");


    }

}