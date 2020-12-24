package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class _33Hierarchy {

    @Test
    public void hierarchy(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();

//        SearchContext driver1=new SafariDriver();   //polymorphism
//        WebDriver driver2=new FirefoxDriver();
//        RemoteWebDriver driver = new ChromeDriver();//Polymorphism
//        JavascriptExecutor JS= (JavascriptExecutor) driver.executeScript("");
//
//        // Set headless chrome
//        ChromeOptions option=new ChromeOptions();
//        //option.setHeadless(true);
//        option.setHeadless(true);
//        // OR -
//        //option.addArguments("headless");
//        // You should set window size for better resolution and screen capture
//        option.addArguments("window-size=1200x600");

//        ChromeDriver browser = new ChromeDriver();
        //browser.get("https://chromedriver.chromium.org/downloads");
        driver.get("https://www.google.com");

        WebElement el=driver.findElement(By.name("q"));

        el.sendKeys(null);

    }



}
