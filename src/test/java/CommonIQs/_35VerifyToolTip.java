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

public class _35VerifyToolTip {
    /* This is the first way to verify the tooltip
    1. Find the WebElement representing the "github" icon.
    2. Get its "title" attribute using the getAttribute() method.
    3. Assert the value against the expected tooltip value.
     */
    @Test
    public void toolTipVerification() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/social-icon.html");
        String expectedTooltip = "Github";
        // Find the Github icon at the top right of the header
        WebElement github = driver.findElement(By.xpath("//*[@class='soc-ico show-round']/a[4]"));
        //get the value of the "title" attribute of the github icon
        String actualTooltip = github.getAttribute("title");        // getAttribute("title")
        //Assert the tooltip's value is as expected
        Assert.assertEquals(actualTooltip,"Github");
        // driver.close();
    }

    @Test
    public void toolTipVerification2() {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();
        //Instantiate Actions Class
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


    public void toolTip(){
        /* This is the second way to verify the tooltip
         1. Find the Tooltip
         2. Using the Actions class mimic mouse hover over
         3. Assert the value against the expected tooltip value.
     */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/tooltip/");
        //Find the Tooltip
        WebElement toolTip=driver.findElement(By.xpath("//a[.='Tooltips']"));
        Actions actions=new Actions(driver);
        // Using the action class to mimic mouse hover over
        actions.moveToElement(toolTip).build().perform();

        //iframe[class='demo-frame']
    }
}


