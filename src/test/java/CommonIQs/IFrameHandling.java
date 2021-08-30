package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IFrameHandling {
    static WebDriver driver;
    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public void handlingIframes(){
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        // By Index
        // By Name of ID
        // By WebElement
        WebElement iframe=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
        driver.switchTo().frame(iframe);


        Actions actions=new Actions(driver);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        actions.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();
        //driver.switchTo().parentFrame();
        //driver.close();
    }
    @Test
    public void handlingIFrames2(){
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames= " + size);
        WebElement iframe=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        WebElement box=driver.findElement(By.xpath("//body[@id='tinymce']"));
        box.clear();
        box.sendKeys("Bu sefer tamam....");
        driver.switchTo().defaultContent();
    }
}
