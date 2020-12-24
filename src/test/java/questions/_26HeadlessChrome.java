package questions;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class _26HeadlessChrome {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Set headless chrome
        ChromeOptions option=new ChromeOptions();
        //option.setHeadless(true);
        option.setHeadless(true);
        // OR -
        //option.addArguments("headless");
        // You should set window size for better resolution and screen capture
        option.addArguments("window-size=1200x600");

        ChromeDriver browser = new ChromeDriver(option);
        browser.get("https://chromedriver.chromium.org/downloads");

        // Capturing screenshot
//        File file = browser.getScreenshotAs(OutputType.FILE);
//        Files.copy(file, new File(System.getProperty("user.home")+"\\Downloads\\chromedriver_win32 (4)\\ss.png"));
//
//        browser.close();


    }
}
