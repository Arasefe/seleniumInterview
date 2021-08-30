package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxes {
    static WebDriver driver;
    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void checkBoxHandling() {
        // Toggling a check box on/off is also done using the click() method.
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1=driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
        WebElement checkbox2=driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
        // isSelected() gives the Toggle status of the checkbox
        if(!checkbox1.isSelected()){
            checkbox1.click();
            Assert.assertTrue(checkbox1.isDisplayed());
            checkbox1.click();
            Assert.assertFalse(checkbox1.isSelected());
        }else if(checkbox1.isSelected()){
            Assert.assertTrue(checkbox1.isDisplayed());
        }else if(!checkbox2.isSelected()){
            checkbox2.click();
            Assert.assertTrue(checkbox1.isDisplayed());
            checkbox2.click();
            Assert.assertFalse(checkbox1.isDisplayed());
        }else if(checkbox2.isSelected()){
            Assert.assertFalse(checkbox1.isSelected());
        }

        driver.close();
    }
}
