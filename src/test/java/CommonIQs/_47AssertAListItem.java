package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _47AssertAListItem {


    @Test
    public void assertListItem(){
        List list= new ArrayList<>(Arrays.asList("Aras","Tulpar","Efe","Ege"));
        Assert.assertEquals(list.get(0),"Aras");
    }
}
