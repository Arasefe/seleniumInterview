package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _28HandlingHiddenWebElements {
    @Test
    public void handlingHiddenWebElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // We need to downcast WebDriver reference variable to use JavascriptExecutor methods
        JavascriptExecutor js = (JavascriptExecutor) driver;
    }
}
