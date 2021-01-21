package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _2Actions_ContextClick {

    @Test
    public void contextClick1(){
        /*
        1. Go to https://the-internet.herokuapp.com/context_menu
        2. Right click to the box.
        3. Alert will open.
        4. Accept alert
        No assertion needed for this practice.
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Go to website
        driver.get("https://the-internet.herokuapp.com/context_menu");
        // Right click to the box.
        WebElement box=driver.findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions=new Actions(driver);
        // Right click to the box.
        actions.contextClick(box).build().perform();
        // Accept alert
        driver.switchTo().alert().accept();
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
    public void contextClick(){

        WebDriver driver = new ChromeDriver();
        try {
            // Navigate to Url
            driver.get("https://google.com");

            // Store 'google search' button web element
            WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
            Actions actionProvider = new Actions(driver);
            // Perform context-click action on the element
            actionProvider.contextClick(searchBtn).build().perform();
        } finally {
            driver.quit();
        }

    }


}
