package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _43NetworkLatency {
    @Test
    public void methodLatency(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.tutorialspoint.com/index.htm";
        driver.get(url);
        driver.manage().window().maximize();
        //driver.manage().pageLoadingTime();
    }
}
