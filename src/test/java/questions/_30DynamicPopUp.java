package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

public class _30DynamicPopUp {
    @Test
    public void p3_information_alert_practice() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Locating the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        //click to the button
        warningAlertButton.click();
        //1- Create Alert instance and switch to alert
        Alert alert = driver.switchTo().alert();
        BrowserUtils.wait(2);
        //2- Use "alert" instance to accept the javascript alert(popup)
        alert.accept();
        //Locating the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        //assert "resultText" is displayed
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed. Verification failed!!!");

    }

    @Test
    public void dynamic_pop_up(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Locating the warning/information alert button to click it
        try {
            WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
            //click to the button
            warningAlertButton.click();
            //Create alert instance
            Alert alert = driver.switchTo().alert();
            //We can either accept(), or dismiss() the confirmation alert
            alert.accept();
        }catch(Exception exception){
            exception.getStackTrace();
        }
        //Locating the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        //Assert
        Assert.assertTrue(resultText.isDisplayed(), "Text is not displayed. Verification FAILED!!!");
        // Task
        WebElement jsPrompt= driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsPrompt.sendKeys("Tulpar"+ Keys.ENTER);


    }
}
