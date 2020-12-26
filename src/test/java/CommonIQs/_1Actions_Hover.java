package CommonIQs;

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
        WebElement picOne=driver.findElement(By.xpath("//div[@id='hot-spot']"));
        actions.moveToElement(picOne).perform();

    }
    @Test
    public void hoverOver2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/hovers");

        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//img[@src='/img/avatar-blank.jpg'][1]"));
        actions.moveToElement(element).perform();
        String expected="name: user1";
        String actual=driver.findElement(By.xpath("//h5[.='name: user1']")).getText();
        Assert.assertEquals(actual,expected);

    }

}
