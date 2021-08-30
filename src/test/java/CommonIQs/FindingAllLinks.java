package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class FindingAllLinks {
    static WebDriver driver;

    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void findAllLinks() {
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        List<WebElement> list=driver.findElements(By.tagName("a"));
        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
        }
        System.out.println("Total Link "+list.size());
        driver.close();
    }
}
