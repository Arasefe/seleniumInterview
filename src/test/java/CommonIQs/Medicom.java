package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Medicom {

    static WebDriver driver;
    @BeforeClass
    public static void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://home.medicom.us/");
        driver.manage().window().maximize();
    }


    @Test
    public void contextClick1() {
        WebElement facilityLogin=driver.findElement(By.xpath("//a[.='Facility Login']"));
        facilityLogin.click();

    }

}
