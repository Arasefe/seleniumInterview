package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class UploadingFile {

    @Test
    public void uploadFile1() throws InterruptedException, IOException {

        String downloadPath = System.getProperty("user.dir");

        //System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

        chromePrefs.put("profile.default_content_settings.popups", 0);

        chromePrefs.put("download.default_directory", downloadPath);

        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("prefs", chromePrefs);

        driver = new ChromeDriver(options);

        driver.get("https://altoconvertpdftojpg.com/");

        driver.findElement(By.cssSelector("[class*='btn--choose']")).click();

        Thread.sleep(3000);

        Runtime.getRuntime().exec("C:\\Users\\rahul\\Documents\\check\\fileupload.exe");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));

        driver.findElement(By.cssSelector("button[class*='medium']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

        driver.findElement(By.linkText("Download Now")).click();

        Thread.sleep(5000);

        File f = new File(downloadPath + "/converted.zip");

        if (f.exists()) {

            Assert.assertTrue(f.exists());

            if (f.delete())

                System.out.println("file deleted");

        }
    }

    @Test
    public void uploadingFile2(){
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
