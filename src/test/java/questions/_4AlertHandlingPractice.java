package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _4AlertHandlingPractice {

    @Test
    public void handlingAlert() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("");
        Alert alert = driver.switchTo().alert();
        // For Information alert
        alert.accept();
        // For Confirmation alert
        alert.dismiss();
        // For Prompt alert
        alert.sendKeys("This is prompt alert");
    }
}
