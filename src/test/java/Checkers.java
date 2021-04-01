import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkers {

    static RemoteWebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void method() throws InterruptedException {
        String url="https://www.gamesforthebrain.com/game/checkers/";
        driver.get(url);

        WebElement first=driver.findElement(By.xpath("//img[@onclick='didClick(6, 2)']"));
        first.click();
        WebElement second=driver.findElement(By.xpath("//img[@onclick='didClick(5, 3)']"));
        second.click();

        Thread.sleep(3000);
        WebElement third=driver.findElement(By.xpath("//img[@onclick='didClick(5, 3)']"));
        third.click();

        WebElement fourth=driver.findElement(By.xpath("//img[@onclick='didClick(6, 4)']"));
        fourth.click();
        Thread.sleep(3000);
        String str=fourth.getAttribute("src").toString();
        Assert.assertFalse(str.contains("grey.gif"));

    }
}
