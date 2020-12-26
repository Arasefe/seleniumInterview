package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class _13SetBrowserSizeWithJSExecutor {
    @Test
    public void resizeWindow1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize(); if this does not work

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("window-size=1400,900");
        options.addArguments("window-size=1400,600");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

        driver.quit();
    }
    @Test
    public void resizeWindow2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Dimension d=new Dimension(1400,600);
        driver.manage().window().setSize(d);
    }


}
