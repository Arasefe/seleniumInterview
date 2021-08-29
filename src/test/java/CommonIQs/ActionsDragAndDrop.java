package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsDragAndDrop {
    static WebDriver driver;
    @BeforeClass
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @Test
    public void dragAndDrop1(){

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions actions=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
        actions.dragAndDrop(source,target).build().perform();
        driver.close();

    }


    @Test
    public void dragAndDrop2(){
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/drag_and_drop");
        Actions actions=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='column-b']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='column-a']"));
        actions.dragAndDrop(source,target).perform();
        driver.close();

    }
    @Test
    public void dragAndDropAdvanced(){
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        Actions actions = new Actions(driver);
        WebElement bestSellers = driver.findElement(By.xpath("//a[.='Best Sellers']"));
        bestSellers.click();
        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(bestSellers));
        WebElement el = driver.findElement(By.xpath("//a[.='Conditions of Use']"));
        wait.until(ExpectedConditions.visibilityOf(el));

        actions.moveToElement(el).doubleClick().build().perform();
    }


}
