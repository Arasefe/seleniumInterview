package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _24OpenLinksInDifferentTabs {
    @Test
    public void openLinksInDifferentTabs() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");

        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));            // Limiting webDriver scope
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        WebElement columnDriver = footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
            String clinkOnLink = Keys.chord(Keys.COMMAND, Keys.ENTER);            //
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clinkOnLink);
        }


    }
}
