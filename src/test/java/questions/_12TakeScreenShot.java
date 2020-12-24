package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

public class _12TakeScreenShot {

    @Test
    public void tearDown() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //byte[] scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(scrFile,new File("D:\\savescreen.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
