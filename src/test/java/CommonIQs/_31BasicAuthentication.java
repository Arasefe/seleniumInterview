package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.security.UserAndPassword;
//import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _31BasicAuthentication {

    @Test @Beta
    public void basicAuthentication(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        //alert.authenticateUsing(new UserAndPassword("username","password"));
        //alert.authenticateUsing() works with Selenium 2.50.1 but does not work with Selenium 3

    }

    @Test
    public void basicAuthentication1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement basicAuth=driver.findElement(By.xpath("//a[.='Basic Auth']"));
        basicAuth.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        //alert.authenticateUsing(new UserAndPassword("admin","admin"));

    }

    @Test
    public void basicAuthentication4(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        // open webpage
        // driver.get(protocol://Username:Password@URL Address);
        driver.get("https://selenium:webdriver@chercher.tech/auth");
        // verify the title
        Assert.assertEquals(driver.getTitle(),"Authentication Successful");
    }


}
