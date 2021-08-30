package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FindingNthElement {
    static WebDriver driver;

    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void nthElementXpath1(){
        String url = "https://www.tutorialspoint.com/index.htm";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // xpath using position() targeting the first element with type text
        driver.findElement(By.xpath("//input[@type='text'][position()=1]"))
                .click();

        driver.close();
    }
    @Test
    public void nthElementXpath2(){
        String url = "https://www.tutorialspoint.com/index.htm";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // xpath using position() targeting the first element with type text
        driver.findElement(By.xpath("//input[@type='text'][1]"))
                .click();
        driver.close();
    }
    @Test
    public void nthElementCSSSelector1(){
        String url = "https://www.tutorialspoint.com/index.htm";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*
         xpath using position() targeting the first element with type text
        To find nth-child css.
        	<ul id="automation">
            <li>Selenium</li>
            <li>QTP</li>
            <li>Sikuli</li>
            </ul>
        ul#automation li:nth-child(n)
        ul#automation li:nth-of-type(2)
        */
        driver.findElement(By.xpath("//input[@type='text'][1]"))
                .click();
        driver.close();
    }

}
