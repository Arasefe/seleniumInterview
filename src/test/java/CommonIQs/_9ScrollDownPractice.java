package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _9ScrollDownPractice {
    @Test
    public void scrollDown() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");

        JavascriptExecutor JS = (JavascriptExecutor) driver;
        JS.executeScript("window.scrollBy(0,500)", "");
        // or
        //JS.executeScript("scroll(0,250);");
    }
    @Test
    public void scrollToParticularElement() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        for (int i = 0; i <10; i++) {
            JS.executeScript("scroll(0,500);");
            Thread.sleep(1000);
        }
        WebElement element=driver.findElement(By.xpath("//a[.='Home']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);

    }
}
