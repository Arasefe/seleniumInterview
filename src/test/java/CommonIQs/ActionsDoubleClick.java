package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsDoubleClick {
    static WebDriver driver;
    @BeforeClass
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @Test
    public void doubleClick1(){

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        Actions actions=new Actions(driver);
        WebElement target=driver.findElement(By.xpath("//div[@id='column-a']"));

        //actions.doubleClick(target).build().perform();

    }


    @Test
    public void doubleClick2(){
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        Actions actions=new Actions(driver);
        WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
        actions.doubleClick(target).perform();

    }

}
