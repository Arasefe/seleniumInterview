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
import org.testng.annotations.Test;

public class _3ActionsDragAndDrop {

    @Test
    public void dragAndDrop1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions actions=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
        actions.dragAndDrop(source,target).build().perform();

    }


    @Test
    public void dragAndDrop2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/drag_and_drop");
        Actions actions=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
        actions.dragAndDrop(source,target).perform();

    }
    @Test
    public void dragAndDropAdvanced(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        Actions actions = new Actions(driver);
        WebElement bestSellers = driver.findElement(By.xpath("//a[.='Best Sellers']"));
        bestSellers.click();
        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(bestSellers));
        WebElement el = driver.findElement(By.xpath("//a[.='Conditions of Use']"));
        wait.until(ExpectedConditions.visibilityOf(el));
        //actions.doubleClick(signIn).perform();
        //actions.contextClick().perform();
        //actions.moveToElement(el).click();
        //actions.doubleClick().perform();
        actions.moveToElement(el).doubleClick().build().perform();
    }

}
