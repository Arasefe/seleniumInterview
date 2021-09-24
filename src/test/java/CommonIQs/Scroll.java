package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.BrowserUtils;


public class Scroll {
    static WebDriver driver;

    @BeforeClass
    private void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void scrollDown() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        JS.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        // or
        //JS.executeScript("scroll(0,1000);");
        driver.close();

    }

    @Test
    public void scrollToParticularElement(){
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 5; i++) {
            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0,1000)");
        }
        WebElement element = driver.findElement(By.xpath("//a[.='Home']"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("arguments[0].scrollIntoView();", element);
        driver.close();
    }

    @Test
    public void scrollingInfinite() {
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        BrowserUtils.wait(2);

        for (int i = 0; i < 10; i++) {
            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0,300)");
        }

        for (int i = 0; i < 5; i++) {
            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0,1000)");
        }
        driver.close();
    }
}
