package CommonIQs;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class _20HandlingSSLCertifications {
    @Test
    public void handlingSSLCertifications() {
        DesiredCapabilities ch = DesiredCapabilities.chrome();
        //ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //Belows to your local browser
        ChromeOptions c = new ChromeOptions();
        c.merge(ch);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(c);


    }

    public void handlingSSLCertifications1(){
        DesiredCapabilities ch=DesiredCapabilities.chrome();
        //ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //Belows to your local browser
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(c);


    }
}
