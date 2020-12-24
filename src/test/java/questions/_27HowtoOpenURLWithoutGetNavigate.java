package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _27HowtoOpenURLWithoutGetNavigate {

    @Test
    public void openWithoutGetNavigate() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // We need to downcast WebDriver reference variable to use JavascriptExecutor methods
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://www.google.com";
        String script = "window.location = \'"+url+"\'";
        js.executeScript(script);
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}

