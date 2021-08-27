package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsHover {
    static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

   /*
    Go to http://practice.cybertekschool.com/hovers
    Hover over to first image
    Assert that “name: user1” is displayed
    */
    @Test
    public void hoverOver1(){

        driver.get("http://practice.cybertekschool.com/hovers");
        WebDriverWait wait=new WebDriverWait(driver,15);
        WebElement picOne=driver.findElement(By.xpath("//div[@class='figure']/img[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(picOne));
        Actions actions=new Actions(driver);
        actions.moveToElement(picOne).perform();

        WebElement userOne=driver.findElement(By.xpath("//div[@class='figure'][1]/div/h5"));
        Assert.assertTrue(userOne.getText().equals("name: user1"));
        driver.close();
    }
    @Test
    public void hoverOver2(){
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//div[@id='content']/div/div[2]/img"));
        actions.moveToElement(element).perform();
        String expected="name: user2";
        String actual=driver.findElement(By.xpath("//h5[.='name: user2']")).getText();
        Assert.assertEquals(actual,expected);
        driver.close();

    }

    @Test
    public void hoverOver3(){
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions=new Actions(driver);

        WebElement element=driver.findElement(By.xpath("//div[@id='content']/div/div[1]/img"));
        actions.moveToElement(element).perform();
        String expected="name: user3";
        WebElement picThree=driver.findElement(By.xpath("//h5[.='name: user3']"));
        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(picThree));

        Assert.assertEquals(picThree.getText(),expected);

        driver.close();
    }

    @Test
    public void hoverOver4(){

        driver.navigate().to("http://practice.cybertekschool.com/hovers");
        WebDriverWait wait=new WebDriverWait(driver,15);
        WebElement picOne=driver.findElement(By.xpath("//div[@class='figure']/img[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(picOne));
        Actions actions=new Actions(driver);
        actions.moveToElement(picOne).perform();

        WebElement userOne=driver.findElement(By.xpath("//div[@class='figure'][1]/div/h5"));
        Assert.assertTrue(userOne.getText().equals("name: user1"));
        //driver.close();
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
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Go to website
        driver.get("https://the-internet.herokuapp.com/context_menu");
        // Right click to the box.
        WebElement box = driver.findElement(By.cssSelector("div[id='hot-spot']"));
        Actions actions = new Actions(driver);
        // Right click to the box.
        actions.contextClick(box).build().perform();
        // Accept alert
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();
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

    @Test
    public void dragAndDrop1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions actions=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
        actions.dragAndDrop(source,target).build().perform();

    }


    @Test
    public void dragAndDrop2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/drag_and_drop");
        Actions actions=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
        actions.dragAndDrop(source,target).perform();

    }
    @Test
    public void dragAndDropAdvanced(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        Actions actions = new Actions(driver);
        WebElement bestSellers = driver.findElement(By.xpath("//a[.='Best Sellers']"));
        bestSellers.click();
        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(bestSellers));
        WebElement el = driver.findElement(By.xpath("//a[.='Conditions of Use']"));
        wait.until(ExpectedConditions.visibilityOf(el));

        actions.moveToElement(el).doubleClick().build().perform();
    }

}
