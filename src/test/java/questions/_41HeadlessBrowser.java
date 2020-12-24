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

public class _41HeadlessBrowser {

    @Test
    public  void methodName() throws IOException {

        WebDriverManager.chromedriver().setup();



        ChromeOptions option=new ChromeOptions();
        //option.setHeadless(true);
        // OR -
        option.addArguments("--headless");
        // You should set window size for better resolution and screen capture
        //option.addArguments("window-size=1200x600");

        WebDriver driver = new ChromeDriver(option);
        // Set headless chrome

        driver.get("https://www.amazon.com");



    }
}
