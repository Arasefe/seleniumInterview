package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _39AuthenticationPopUp {
    @Test
    public void authenticate(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        // open webpage
        // driver.get(protocol://Username:Password@URL Address);
        driver.get("https://selenium:webdriver@chercher.tech/auth");
        // verify the title
        if(driver.getTitle().equals("Authentication Successful")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        }
    }
}
