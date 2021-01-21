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
        //Getting the page
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/upload");

        // get the path of the file you want to upload
        // MAC: right click on the file you want to upload
        // Click and hold "OPTION" button and select "copy as path name"

        //Windows: Right click -> properties -> copy from location
        //OR SHIFT + RIGHT CLICK --> Copy as path
        String path = "/Users/banuyildirim/Desktop/AUTO/BMW.webp";

        //String windowsPath = "C:\\Users\\direc\\Desktop\\Sample.xlsx";

        //Locate the upload web element
        WebElement uploadInput = driver.findElement(By.id("file-upload"));

        //send the path of the file to uploadInput webElement
        BrowserUtils.wait(3);
        uploadInput.sendKeys(path);

        //locate the UPLOAD button
        WebElement uploadButton = driver.findElement(By.id("file-submit"));

        //click to upload button
        BrowserUtils.wait(2);
        uploadButton.click();
    }
}
