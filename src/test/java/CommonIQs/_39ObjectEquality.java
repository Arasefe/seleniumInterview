package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _39ObjectEquality {
    @Test
    public void objectEquality(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--incognito");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("https://www.tutorialspoint.com/index.htm");
        String str1=new String("Aras");
        String str2=new String("Aras");

        Object []arr1=new Object[]{1,2,3,4};
        Object []arr2=new Object[]{1,2,3,4};

        //Assert.assertEquals(str1,str2);
        Assert.assertTrue(str1.equals(str2));
        Assert.assertTrue(arr1.equals(arr2));
    }
}
