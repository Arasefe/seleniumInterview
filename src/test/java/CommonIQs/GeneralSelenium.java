package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class GeneralSelenium {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.applitools.com/");
        WebElement userName=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.id("log-in"));
        userName.sendKeys("Test1");
        password.sendKeys("test1");
        login.click();

        //print the total row of recent transactions
        //table[@class='table table-padded']//tr/td
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-padded']/tbody/tr"));
        System.out.println("Total rows in table "+rows.size());
        //print hyperlink present on page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links on the page "+links.size());
        driver.close();

    }
    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement iframe=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        WebElement textBox=driver.findElement(By.xpath("//body[@id='tinymce']/p"));
        String text="Amat victoriya curam";
        textBox.clear();
        textBox.sendKeys(text);
        driver.close();
    }
    @Test
    public void test3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        String item="T-SHIRT";
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='search_query_top']"));
        searchBox.sendKeys(item+ Keys.ENTER);
        //Scroll down
        JavascriptExecutor JS=(JavascriptExecutor)driver;
        JS.executeScript("window.scrollBy(0,500)");

        //Actions class must be used to hoverOver
        Actions action=new Actions(driver);
        WebElement target=driver.findElement(By.xpath("//a[@class='product_img_link']"));
        action.moveToElement(target).perform();
        WebElement addToCart=driver.findElement(By.xpath("//a[@title='Add to cart']/span"));
        addToCart.click();
        Thread.sleep(2000);
        WebElement proceedToCheckOut=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        proceedToCheckOut.click();

        WebElement total=driver.findElement(By.xpath("//span[@class='ajax_cart_quantity'][1]"));
        System.out.println(total.getText());
        driver.close();

    }
}
