package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeClass;

public class _36HtmlUnitDriverIntegration {

    @BeforeClass
    public void testA(){
        WebDriverManager.chromedriver().setup();

        HtmlUnitDriver driver=new HtmlUnitDriver(true);

        JavascriptExecutor executor = driver;


    }
}
