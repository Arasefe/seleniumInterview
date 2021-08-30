package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ColorAssertion {
    static WebDriver driver;
    private void before(){

    }

    @Test
    public void colorAssertionMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.tutorialspoint.com/index.htm";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String color=driver.findElement(By.xpath("//button[.='Check it Now']"))
                .getCssValue("color");

        System.out.println(color);

        driver.close();
    }
}
