package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinksHandling {
    static WebDriver driver;
    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @Test
    public void brokenLinkHandling() throws IOException {
        driver.manage().window().maximize();

        //Step 1 - Get all urls tied up to the links using Selenium
        //Step 2 - Java methods will call URL's and get you the status code
        //Step 3 - if status code >400 then that url is not working. Link which tied to url is broken a[href*="soapui"]

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a =new SoftAssert();                                     // SoftAssert
        for(WebElement link : links) {
            String url= link.getAttribute("href");
            HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);
            a.assertTrue(respCode==200, "The link with Text"+link.getText()+" is broken with code " +respCode);
        }
        a.assertAll();
    }

    private static Object getReturnCode(WebElement link) {
        return null;

    }
}
