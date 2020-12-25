package questions;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class _31HeadlessBrowser {

    @Test
    public  void methodName(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        // option.setHeadless(true);
        // options.addArguments("window-size=1400,800");
        // options.addArguments("disable-gpu")
        // options.addArguments("--headless", "--disable-gpu", "--window-size=1400,800","--ignore-certificate-errors");
        option.addArguments("--headless");
        WebDriver driver = new ChromeDriver(option);
        // Set headless chrome

        driver.get("https://www.amazon.com");



    }
}
