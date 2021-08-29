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

public class AATest {
    static WebDriver driver;
    @BeforeClass
    public static void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    private void method(){
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement box=driver.findElement(By.xpath("//*[@id='hot-spot']"));
        Actions action=new Actions(driver);
        action.contextClick(box).build().perform();

        Alert alert=driver.switchTo().alert();
        String alertMsg=alert.getText();
        Assert.assertEquals(alertMsg,"You selected a context menu");
        alert.accept();
    }
}
