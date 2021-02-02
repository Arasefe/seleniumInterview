package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class _15HandlingMultipleWindows {
    @Test
    public void handlingMultipleWindows() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        // Limiting webDriver scope
        WebElement columnDriver = footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td"));
        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
            // Keys.CONTROL-->Windows
            String clinkOnLink = Keys.chord(Keys.COMMAND, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clinkOnLink);
            Thread.sleep(5000);
        }
        //1 Step I store all windows to a String Set
        Set<String> handles = driver.getWindowHandles();
        //2 Step I create String Iterator
        Iterator<String> it = handles.iterator();
        //3 Step I iterate through and switchTo()
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
        //driver.close();
    }

    @Test
    public void handlingMultipleWindows2() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://rahulshettyacademy.com/angularpractice/");
        //Switching Window
        //driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentWindowId = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/");
        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
                .get(1).getText();
        driver.switchTo().window(parentWindowId);
        WebElement name = driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(courseName);
        //Screenshot
        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));
        //driver.quit();
        //Get Height & Width
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());

    }

    @Test
    public void openMultipleWindow() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));            // Limiting webDriver scope
        WebElement columnDriver = footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td"));
        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
            String clinkOnLink = Keys.chord(Keys.COMMAND, Keys.ENTER);                    // Keys.CONTROL-->Windows
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clinkOnLink);
            Thread.sleep(5000);
        }
        //1 Step I store all windows to a String Set
        Set<String> handles = driver.getWindowHandles();
        //2 Step I create String Iterator
        Iterator<String> it = handles.iterator();
        //3 Step I iterate through and switchTo()
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
        driver.close();
    }
}



