package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertHandling {
    static WebDriver driver;

    @BeforeClass
    private void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void handlingAlert1() {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // For Information alert
        WebElement infoAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        infoAlert.click();
        Alert alert = driver.switchTo().alert();
        // Accept the alert
        alert.accept();
        String result=driver.findElement(By.xpath("//*[@id='result']")).getText();
        Assert.assertEquals(result, "You successfuly clicked an alert");
        driver.close();
    }
    @Test
    public void handlingAlert3() {
        // For Confirmation alert
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement conAlert = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        conAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        String result=driver.findElement(By.xpath("//*[@id='result']")).getText();
        Assert.assertEquals(result,"You clicked: Cancel");
        driver.close();
    }
    @Test
    public void handlingAlert4(){
        // For Prompt alert
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement promptAlert = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptAlert.click();
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("This is prompt alert");
        alert.accept();
        String result=driver.findElement(By.xpath("//*[@id='result']")).getText();
        Assert.assertEquals(result,"You entered: This is prompt alert");
        driver.close();
    }


    @Test
    public void handlingAlert2() {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().fullscreen();
        // For Information alert
        WebElement infoAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        infoAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.close();
    }
}
