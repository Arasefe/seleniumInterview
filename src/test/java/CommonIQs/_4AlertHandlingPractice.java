package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _4AlertHandlingPractice {

    @Test
    public void handlingAlert1() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        Thread.sleep(2000);
        // For Information alert
        WebElement infoAlert=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        infoAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        // For Confirmation alert
        WebElement conAlert=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        conAlert.click();
        alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(2000);
        // For Prompt alert
        WebElement promptAlert=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptAlert.click();
        driver.switchTo().alert().sendKeys("This is prompt alert");
        Thread.sleep(2000);
        alert.accept();

    }
    @Test
    public void handlingAlert2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().fullscreen();
        // For Information alert
        WebElement infoAlert=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        infoAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
