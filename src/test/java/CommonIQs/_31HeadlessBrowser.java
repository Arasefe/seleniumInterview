package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class _31HeadlessBrowser {

    @Test
    public  void methodName1(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        // option.setHeadless(true);
        // option.addArguments("--headless", "--disable-gpu", "--window-size=1400,800","--ignore-certificate-errors");
        option.addArguments("--headless");
        WebDriver driver = new ChromeDriver(option);
        // Set headless chrome
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));

    }

    @Test
    public  void methodName2(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
         option.setHeadless(true);

        // options.addArguments("--headless", "--disable-gpu", "--window-size=1400,800","--ignore-certificate-errors");
        //option.addArguments("--headless");
        WebDriver driver = new ChromeDriver(option);
        // Set headless chrome
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
    }

    @Test
    public  void methodName3(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        // option.addArguments("--headless", "--disable-gpu", "--window-size=1400,800","--ignore-certificate-errors");
        //option.addArguments("--headless");
        WebDriver driver = new ChromeDriver(option);
        // Set headless chrome
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
    }

    @Test
    public  void methodName4(){
        WebDriverManager.chromedriver().setup();

        //WebDriver driver=new ChromeDriver();
        // Set headless chrome
        WebDriver hDriver=new HtmlUnitDriver(true);

        hDriver.get("https://www.amazon.com");
        Assert.assertTrue(hDriver.getTitle().equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
    }
}
