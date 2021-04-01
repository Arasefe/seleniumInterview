package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _45ClickOperation {
    @Test
    public void clickOperation() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        try {
            WebElement chkBx = driver.findElement(By.className("mycheckbox"));
            wait.until(ExpectedConditions.elementToBeClickable(chkBx));
            Assert.assertTrue(chkBx.isSelected());

        } catch (NoSuchElementException e) {
            e.getStackTrace();
        }
    }
}
