package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ColorAssertion {
    static WebDriver driver;

    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void colorAssertionMethod(){

        String url = "https://www.tutorialspoint.com/index.htm";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String color=driver.findElement(By.xpath("/html/body/div[8]/div[1]/div/div[1]/a/img"))
                .getCssValue("color");

        System.out.println(color);

        driver.close();
    }

    @Test
    public void colorAssertionMethod2(){

        String url = "https://www.etsy.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String color=driver.findElement(By.xpath("//div[@class='wt-pb-xs-1 wt-pb-lg-0 wt-pt-sm-1 wt-pt-lg-0 wt-pr-xs-0 wt-pr-sm-1']/a/span[2]"))
                .getCssValue("color");

        System.out.println(color);

        driver.close();
    }
}
