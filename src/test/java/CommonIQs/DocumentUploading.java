package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DocumentUploading {
    /*
        1) Using sendKeys method
        2) Using AutoIT
        3) With The Help Of Robot Class
     */
    static WebDriver driver;

    @BeforeClass
    private void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void upload() throws InterruptedException {
        driver.get("https://smallpdf.com/pdf-to-word");
        driver.manage().window().maximize();

        WebElement uploadBtn=driver.findElement(By.xpath("//span[.='Choose Files']"));
        uploadBtn.click();
        Thread.sleep(3000);
        uploadBtn.sendKeys("/Users/banuyildirim/Desktop/Responsibilities.pdf");

    }

    @Test
    public void upload2() throws InterruptedException{
        driver.get("https://blueimp.github.io/jQuery-File-Upload/");
        Thread.sleep(2000);
        WebElement addFile = driver.findElement(By.xpath("//span[.='Add files...']"));
        addFile.sendKeys("/Users/banuyildirim/Desktop/Responsibilities.pdf");
        driver.findElement(By.xpath(".//span[text()='Start upload']")).click();
        Thread.sleep(2000);
        if(driver.findElement(By.xpath(".//a[text()='c1.jpeg']")).isDisplayed()) {
            Assert.assertTrue(true, "Image Uploaded");
        }else {
            Assert.fail("Image not Uploaded");
        }
    }
}
