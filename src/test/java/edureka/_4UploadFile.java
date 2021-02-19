package edureka;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

import java.sql.Driver;

public class _4UploadFile {
    @Test
    public void uploading_file_test(){
        /*
        1. Find the Upload Button on the web
        2. Copy the file path as path name and assign it to a String variable
        3. Send the path to the Upload Button with sendKeys()
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/upload");
        driver.manage().window().maximize();
        // get the path of the file you want to upload
        // MAC: right click on the file you want to upload
        // Click and hold "OPTION" button and select "copy as path name"

        // Locate the upload web element
        WebElement uploadInput = driver.findElement(By.id("file-upload"));
        // Copy the file path
        String path = "/Users/banuyildirim/Desktop/AUTO/maxresdefault.jpg";
        //send the path of the file to uploadInput webElement
        BrowserUtils.wait(3);
        uploadInput.sendKeys(path);

    }
}
