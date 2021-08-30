package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsKeys {
    static WebDriver driver;
    @BeforeClass
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @Test
    public void dragAndDrop1(){
        // keyDown(), keyUp(), sendKeys()
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        Actions action=new Actions(driver);

        //driver.close();

    }
}
