package edureka;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class _1RedirectBrowsing {
    @Test
    public void redirectBrowsing(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        String PROXY="52.91.233.86:8080";
        org.openqa.selenium.Proxy proxy=new org.openqa.selenium.Proxy();
        proxy.setHttpProxy(PROXY)
                .setFtpProxy(PROXY)
                .setSslProxy(PROXY);
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(CapabilityType.PROXY, proxy);
         driver=new ChromeDriver(cap);

    }
}
