package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class ChromeOptionsPractice {
    static WebDriver driver;
    static ChromeOptions option = new ChromeOptions();
    @BeforeClass
    private void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void methodName1() {

        option.setHeadless(true);
        // option.addArguments("--headless");
        //option.addArguments("--headless");
        driver = new ChromeDriver(option);
        // Set headless chrome
        driver.get("https://www.amazon.com");
        Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
        driver.close();
    }

    @Test
    public void methodName2() {
        option.setHeadless(true);
        // options.addArguments("--headless");
        // option.addArguments("--headless");
        driver = new ChromeDriver(option);
        // Set headless chrome
        driver.get("https://www.amazon.com");
        Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
        driver.close();
    }

    @Test
    public void methodName3() {

        option.addArguments("--headless");
        //option.addArguments("--headless");
        driver = new ChromeDriver(option);
        // Set headless chrome
        driver.get("https://www.amazon.com");
        Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
        driver.close();
    }

    @Test
    public void method() {
        option = new ChromeOptions();
        option.addArguments("--incognito");
        driver = new ChromeDriver(option);
        driver.get("https://www.tutorialspoint.com/index.htm");
        driver.close();

    }
}
