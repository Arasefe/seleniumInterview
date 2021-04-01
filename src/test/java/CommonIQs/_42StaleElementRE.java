package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class _42StaleElementRE {
    /*
    You mostly encounter StaleElementReferenceException
    when you try to REUSE already located web element/s.
    Do not REUSE already located web element.
    You should always find a web element before performing action on it
    even you already found previously and have referenced to it.
    The element has been deleted
    The element no longer attached to DOM
    Change in the DOM structure
     */
    @Test
    public void staleElementMethod() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("");
        List<WebElement> d=driver.findElements(By.className("store-name"));
        System.out.println(d.size());
        for(WebElement d1:d) {
            System.out.println(d1.getText());
            d1.click();

            WebElement e=driver.findElement(By.id("comp-contact"));
            e.getText();
            System.out.println(e.getText());
            Thread.sleep(500);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.history.go(-1)");
        }
    }
}
