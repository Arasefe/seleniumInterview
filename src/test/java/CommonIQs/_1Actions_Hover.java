package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _1Actions_Hover {
    static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

   /*
    Go to http://practice.cybertekschool.com/hovers
    Hover over to first image
    Assert that “name: user1” is displayed
    */
    @Test
    public void hoverOver1(){

        driver.get("http://practice.cybertekschool.com/hovers");
        WebDriverWait wait=new WebDriverWait(driver,15);
        WebElement picOne=driver.findElement(By.xpath("//div[@class='figure']/img[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(picOne));
        Actions actions=new Actions(driver);
        actions.moveToElement(picOne).perform();

        WebElement userOne=driver.findElement(By.xpath("//div[@class='figure'][1]/div/h5"));
        Assert.assertTrue(userOne.getText().equals("name: user1"));
        driver.close();
    }
    @Test
    public void hoverOver2(){
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//div[@id='content']/div/div[2]/img"));
        actions.moveToElement(element).perform();
        String expected="name: user2";
        String actual=driver.findElement(By.xpath("//h5[.='name: user2']")).getText();
        Assert.assertEquals(actual,expected);
        driver.close();

    }

    @Test
    public void hoverOver3(){
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions=new Actions(driver);

        WebElement element=driver.findElement(By.xpath("//div[@id='content']/div/div[1]/img"));
        actions.moveToElement(element).perform();
        String expected="name: user3";
        WebElement picThree=driver.findElement(By.xpath("//h5[.='name: user3']"));
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(picThree));

        Assert.assertEquals(picThree.getText(),expected);

        driver.close();
    }



}
