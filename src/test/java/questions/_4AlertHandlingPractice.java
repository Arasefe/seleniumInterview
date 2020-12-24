package questions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _4AlertHandlingPractice {

    @Test
    public void handlingAlert() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        // For Information alert
        WebElement infoAlert=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        infoAlert.click();                             // if click() does not work
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // For Confirmation alert
        WebElement conAlert=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        conAlert.click();
        alert = driver.switchTo().alert();
        alert.dismiss();
        // For Prompt alert
        WebElement promptAlert=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptAlert.click();
        alert = driver.switchTo().alert();
        alert.sendKeys("This is prompt alert");
    }
}
