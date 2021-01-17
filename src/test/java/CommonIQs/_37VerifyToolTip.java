package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _37VerifyToolTip {
    /* This is the first way to verify the tooltip
    1. Find the WebElement representing the "github" icon.
    2. Get its "title" attribute using the getAttribute() method.
    3. Assert the value against the expected tooltip value.
     */
    @Test
    public void toolTipVerification() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/social-icon.html";
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String expectedTooltip = "Github";
        // Find the Github icon at the top right of the header
        WebElement github = driver.findElement(By.xpath("//*[@class='soc-ico show-round']/a[4]"));

        //get the value of the "title" attribute of the github icon
        String actualTooltip = github.getAttribute("title");

        //Assert the tooltip's value is as expected
        System.out.println("Actual Title of Tool Tip" + actualTooltip);
        if (actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }
        // driver.close();
    }

    /* This is the second way to verify the tooltip Using Action Class
       1. Find the WebElement representing the "github" icon.
       2. Get its "title" attribute using the getAttribute() method.
       3. Assert the value against the expected tooltip value.
    */
    @Test
    public void toolTipVerification2() {

        //Set system properties for geckodriver This is required since Selenium 3.0
        WebDriverManager.chromedriver().setup();
        // Create a new instance of the Chrome

        RemoteWebDriver driver = new ChromeDriver();

        //CASE 2 : Using Actions class method
        driver.get("https://jqueryui.com/tooltip/");

        //Maximise browser window
        driver.manage().window().maximize();

        //Instantiate Action Class
        Actions actions = new Actions(driver);

        //Retrieve WebElement
        WebElement element = driver.findElement(By.cssSelector("input[id='age']"));

        // Using the action class to mimic mouse hover over
        actions.moveToElement(element).perform();

        WebElement toolTip = driver.findElement(By.xpath("//input[@id='age']"));
        //Verify the tooltip text
        Assert.assertEquals(toolTip.getText(),"We ask for your age only for statistical purposes.");
        // Close the main window
        driver.close();
    }
}


