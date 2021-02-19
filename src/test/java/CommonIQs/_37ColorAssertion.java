package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _37ColorAssertion {
    @Test
    public void colorAssertionMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.tutorialspoint.com/index.htm";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //getting color attribute with getCssValue()
        String color = driver.findElement(By.xpath("//*[text()=’GATE Exams’]"))
                .getCssValue("color");
        //getting background color attribute with getCssValue()
        String bColor = driver.findElement(By.xpath("//*[text()=’ ’GATE Exams’]"))
                .getCssValue("background-color");
        System.out.println(color);
        System.out.println(bColor);
        driver.close();
    }
}
