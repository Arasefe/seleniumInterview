package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _38MultipleKeyPress {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://etsy.com");
        driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']")).sendKeys(Keys.chord("A",Keys.ENTER));

    }
}