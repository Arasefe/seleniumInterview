package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class _14FindingAllLinks {

    @Test
    public void findAllLinks() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        List<WebElement> list=driver.findElements(By.tagName("a"));
        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
        }
        driver.close();


    }
}
