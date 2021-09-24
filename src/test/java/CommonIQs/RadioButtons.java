package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioButtons {
    static WebDriver driver;
    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public void radioButtons1(){
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

        WebElement male=driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/div/div[2]/label[1]/input"));
        WebElement feMale=driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/div/div[2]/label[2]/input"));

        if(male.isEnabled()){
            feMale.click();
        }

        WebElement getCheckedValue=driver.findElement(By.xpath("//*[@ID='buttoncheck']"));
        getCheckedValue.click();
        WebElement msg=driver.findElement(By.xpath("//*[@class='radiobutton']"));
        Assert.assertEquals(msg.getText(),"Radio button 'Female' is checked");

        driver.close();

    }

    @Test
    public void radioButtons2(){
        /*
        isSelected(): Checks whether a radio button is selected or not.
        isDisplayed(): Checks whether a radio button is displayed on the web page or not.
        isEnabled(): Checks whether a radio button is enabled or not
         */
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

        WebElement male=driver.findElement(By.xpath("//div[@class='panel panel-default'][2]/div[2]/div[1]/label[1]"));
        WebElement feMale=driver.findElement(By.xpath("//div[@class='panel panel-default'][2]/div[2]/div[1]/label[2]"));
        male.click();
        // isSelected() gives the Toggle status of the radioButton
        // click() is used to toggle the element on/off
        if(male.isSelected()){
            WebElement firstP=driver.findElement(By.xpath("//*[@class='panel panel-default'][2]/div[2]/div[2]/label[1]"));
            firstP.click();
            WebElement getValues=driver.findElement(By.xpath("//*[.='Get values']"));
            getValues.click();
            WebElement msgLine1=driver.findElement(By.xpath("//*[@class='groupradiobutton']/text()[1]"));
            WebElement msgLine2=driver.findElement(By.xpath("//*[@class='groupradiobutton']/text()[2]"));
            Assert.assertEquals(msgLine1.getText(),"Sex : Female");
            Assert.assertEquals(msgLine2.getText(),"Age group: 0-5");
        }else if(feMale.isSelected()){
            male.click();
            Assert.assertTrue(male.isSelected());
        }

        driver.quit();

    }

    @Test
    public void radioButtons3(){
        /*
        isSelected(): Checks whether a radio button is selected or not.
        isDisplayed(): Checks whether a radio button is displayed on the web page or not.
        isEnabled(): Checks whether a radio button is enabled or not
         */
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioBtn1=driver.findElement(By.id("radio-button-1"));
        radioBtn1.click();
        WebElement radioBtn2=driver.findElement(By.cssSelector("input[value='option2']"));
        radioBtn2.click();
        WebElement radioBtn3=driver.findElement(By.cssSelector("input[value='option3']"));
        radioBtn3.click();
        driver.close();


    }

}
