package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetAttributeGetValue {
    static WebDriver driver;

    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void getAttributeMethod1(){
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement el=driver.findElement(By.xpath("//a[@class='nav-a']"));
        System.out.println(el.getAttribute("className"));
        driver.close();
    }

    @Test
    public void getAttributeMethod2(){
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement el=driver.findElement(By.xpath("//a[@class='nav-a']"));
        System.out.println(el.getAttribute("className"));
        driver.close();
    }
}
