package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectBrowsing {
    static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void redirectBrowsing(){
        driver.manage().window().maximize();
        String PROXY="52.91.233.86:8080";
        Proxy proxy=new Proxy();
        proxy.setHttpProxy(PROXY);
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(CapabilityType.PROXY, proxy);
         driver=new ChromeDriver(cap);

    }
}
