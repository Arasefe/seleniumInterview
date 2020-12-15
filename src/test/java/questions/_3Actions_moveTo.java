package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _3Actions_moveTo {
    @Test
    public void actionPractice2() {

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
