package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class _38ChromeOptions {
    @Test
    public void method(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--incognito");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("https://www.tutorialspoint.com/index.htm");


    }
}
