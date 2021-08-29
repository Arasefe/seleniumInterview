package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsContextClick {
    static WebDriver driver;
    @BeforeClass
    public static void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void contextClick1() {
        /*
        1. Go to https://the-internet.herokuapp.com/context_menu
        2. Right click to the box.
        3. Alert will open.
        4. Accept alert
        No assertion needed for this practice.
         */
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //WebElement box = driver.findElement(By.cssSelector("div[id='hot-spot']"));
        WebElement box = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        // Right click to the box.
        actions.contextClick(box).build().perform();
        // Accept alert
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();
        driver.close();
    }


    @Test
    public void contextClick2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        Actions actions = new Actions(driver);
        WebElement signIn = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

        actions.contextClick(signIn).build().perform();

        driver.close();
    }

    @Test
    public void contextClick3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Navigate to Url
        driver.get("https://google.com");
        // Store 'google search' button web element
        WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
        Actions action = new Actions(driver);
        // Perform context-click action on the element
        action.contextClick(searchBtn).build().perform();

    }
}
