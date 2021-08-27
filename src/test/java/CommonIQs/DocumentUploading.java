package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DocumentUploading {

    @Test
    public void upload() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-to-word");
        driver.manage().window().maximize();

        WebElement uploadBtn=driver.findElement(By.xpath("//button[@type='button'][1]"));
        uploadBtn.click();
        Thread.sleep(3000);
        uploadBtn.sendKeys("/Users/banuyildirim/Desktop/SDET/IsmailYildirim_CoverLetter.pdf"+ Keys.ENTER);

    }
}
