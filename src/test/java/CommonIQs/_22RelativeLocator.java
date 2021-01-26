package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class _22RelativeLocator {
    /*
    above       Web element to be searched/located appears above the specified element.
    below       Web element to be searched/located appears below the specified element.
    toLeftOf    Web element to be searched/located appears to the left of the specified element.
    toRightOf   Web element to be searched/located appears to the right of the specified element.
    near        Web element to be searched/located is at most 50 pixels away from the specified element.
     */

    @Test
    public void relativeLocator() {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://accounts.lambdatest.com/login");
        driver.manage().window().maximize();

        // Find the label element above the login text box
        WebElement signIn = driver.findElement(By.cssSelector("span[class='orsignup']"));

        // Locate the username box

        WebElement userNameBox = driver.findElement(withTagName("input")
                .below(signIn));

        userNameBox.sendKeys("user-name");

        // Locate the textbox where password should be inputted

        WebElement heightPasswordBox = driver.findElement(withTagName("input")
                .below(userNameBox));

        heightPasswordBox.sendKeys("password");

        // Locate the submit button

        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));

        submitButton.click();

        //Wait for 10 seconds to observe the output

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

