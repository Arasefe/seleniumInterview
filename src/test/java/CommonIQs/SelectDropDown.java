package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SelectDropDown {
    private static WebDriver driver;
    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }


    @Test
    public void method1() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        String choice = select.getFirstSelectedOption().getText();
        Assert.assertEquals(choice, "Option 1");
        select.selectByIndex(2);
    }

    @Test
    public void method2() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select select = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        String selected = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selected, "2021");
        List<WebElement> list = select.getOptions();
        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
        }
        System.out.println();

    }

    @Test
    public void method3() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select select = new Select(driver.findElement(By.id("state")));
        String selected = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selected, "Select a State");
        Set<WebElement> set = (Set<WebElement>) select.getOptions();
        for (WebElement webElement : set) {
            System.out.println(webElement.getText());
        }
        System.out.println();

    }

    @Test
    public void method4() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.cvs.com/minuteclinic");
        WebElement vv=driver.findElement(By.xpath("//span[.='Video Visit']"));
        vv.click();
        Select select = new Select(driver.findElement(By.xpath("//select[@id='state-label']")));
        String chosen=select.getFirstSelectedOption().getText();
        Assert.assertEquals(chosen,"Select a state");
        select.selectByVisibleText("Nevada");
        String choice = select.getFirstSelectedOption().getText();
        Assert.assertEquals(choice, "Nevada");
        driver.close();

    }

    @Test
    public void method5() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement selectMenu=driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select select=new Select(selectMenu);
        String selected=select.getFirstSelectedOption().getText();
        Assert.assertEquals(selected,"Please select an option");
        select.selectByVisibleText("Option 1");
        select.selectByIndex(2);
        selected=select.getFirstSelectedOption().getText();
        Assert.assertEquals(selected,"Option 2");
        driver.close();
    }
}
