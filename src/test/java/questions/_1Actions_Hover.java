package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _1Actions_Hover {
   /*
    Go to http://practice.cybertekschool.com/hovers
    Hover over to first image
    Assert that “name: user1” is displayed
    */
    @Test
    public void hoverOver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/context_menu");

        Actions actions=new Actions(driver);
        //actions.moveToElement()
    }

}
