package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _40Linkedin {
    @Test
    public void linkedinAutomate() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.linkedin.com/in/sam-y-11abaa1a4/";
        driver.get(url);
        driver.manage().window().maximize();
        
        int i=0;
        while (i!=100) {
            WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
            searchBox.sendKeys("people");
            WebElement connect = driver.findElement(By.xpath("//span[@class='artdeco-button__text']"));
            connect.click();
            WebElement addNote = driver.findElement(By.xpath("//button[@id='ember5012']/span"));
            addNote.click();

            WebElement textArea = driver.findElement(By.xpath("//textarea[@name='message']"));
            String message = "I want to thank you for accepting my connection request.+" +
                    "Sam Y";
            textArea.sendKeys(message);

            WebElement send = driver.findElement(By.xpath("//button[@id='ember5013']/span"));
            send.click();
            i++;
        }
    }
}
