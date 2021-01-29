package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class _11SetBrowserSize {

    @Test
    public void resizeWindow1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        //driver.manage().window().maximize(); if this does not work
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1600,800");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

    }

    @Test
    public void resizeWindow2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Dimension size = new Dimension(1400, 600);
        driver.manage().window().setSize(size);
    }

    @Test
    public void resizeWindow3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().fullscreen();


    }

}
