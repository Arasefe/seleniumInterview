package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Metabolon {
     WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();


    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/");

        WebElement jsA=driver.findElement(By.xpath("//a[.='JavaScript Alerts']"));
        jsA.click();

        WebElement jsP=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsP.click();

        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("You mf");
        alert.accept();


    }
}
