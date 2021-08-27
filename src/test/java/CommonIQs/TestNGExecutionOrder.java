package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGExecutionOrder {
    @BeforeClass
    public void test(){
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
    }


    @Test(priority = 0)
    public void testA(){
        Assert.assertEquals(3,3);
    }
    @Test(priority = 1)
    public void testB(){
        Assert.assertEquals("A","A");
    }
    @Test(priority = 2)
    public void test1(){
        Assert.assertEquals(4,4);
    }

    @Test(priority = 3)
    public void testC(){
        Assert.assertEquals(4,4);
    }
    @Test(priority=4)
    public void test3(){
        Assert.assertEquals(4,4);
    }
    @Test(priority = 5)
    public void testD(){
        Assert.assertEquals("B","B");
    }



}
