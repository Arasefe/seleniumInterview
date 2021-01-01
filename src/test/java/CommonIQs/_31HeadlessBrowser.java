package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _31HeadlessBrowser {

    @Test
    public  void methodName1(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        // option.setHeadless(true);
        // options.addArguments("--headless", "--disable-gpu", "--window-size=1400,800","--ignore-certificate-errors");
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
}
