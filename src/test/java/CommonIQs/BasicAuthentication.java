package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class BasicAuthentication {
    static WebDriver driver;
    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void basicAuthentication1(){
        // driver.get(protocol://Username:Password@URL Address);
        // Username:admin Password:admin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement msg=driver.findElement(By.xpath("//*[@id='content']/div/p"));
        Assert.assertEquals(msg.getText(),"Congratulations! You must have the proper credentials.");
        driver.close();
    }


    @Test
    public void basicAuthentication2(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        // open webpage
        // driver.get(protocol://Username:Password@URL Address);
        // Username:selenium Password:webdriver
        driver.get("https://selenium:webdriver@chercher.tech/auth");
        // verify the title
        Assert.assertEquals(driver.getTitle(),"Authentication Successful");
    }




}
