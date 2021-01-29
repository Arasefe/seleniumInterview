package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

import java.util.concurrent.TimeUnit;

public class _9DynamicPopup {


    @Test
    public void popUp1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
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
    public void popUp2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
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
    public void popUp3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //Locating the warning/information alert button to click it
        try {
            WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
            //click to the button
            warningAlertButton.click();

            //Switch to alert
            Alert alert = driver.switchTo().alert();

            //We can either accept(), or dismiss() the confirmation alert
            alert.accept();
        } catch (Exception exception) {
            exception.getStackTrace();
        }
        //Locating the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Assert
        Assert.assertTrue(resultText.isDisplayed(), "Verification FAILED!!!");

        // Task
        WebElement jsPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsPrompt.sendKeys("Tulpar" + Keys.ENTER);

    }

}

