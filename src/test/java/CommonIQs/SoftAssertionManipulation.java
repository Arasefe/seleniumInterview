package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class SoftAssertionManipulation {

    @Test
    public void softAssert() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        List<WebElement> links = driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']"));

        SoftAssert a = new SoftAssert();

        for (WebElement link : links) {

            String url = link.getAttribute("href");

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

            conn.setRequestMethod("HEAD");

            conn.connect();

            int respCode = conn.getResponseCode();

            System.out.println(respCode);

            a.assertTrue(respCode > 400, "The link with Text" + link.getText() + " is broken with code" + respCode);

        }
        a.assertAll();
    }

    private static Object getReturnCode(WebElement link) {
        return null;

    }

}
