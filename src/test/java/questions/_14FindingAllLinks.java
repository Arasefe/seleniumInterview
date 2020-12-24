package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _14FindingAllLinks {

    @Test
    public void findAllLinks(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());
        //driver.close();


    }
}
