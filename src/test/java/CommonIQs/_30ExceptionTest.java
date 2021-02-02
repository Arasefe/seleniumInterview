package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _30ExceptionTest {
    @Test(expectedExceptions = NoSuchElementException.class)
    public void exceptionTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions actions=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='column-c']"));
        actions.dragAndDrop(source,target).perform();

    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void exceptionTest1(){
        int a=9,b=0;
        int c=a/b;
    }
    @Test(expectedExceptions = ArithmeticException.class)
    public void exceptionTest2(){
        try{
            int a=9,b=0;
            int c=a/b;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception is fetched"+e.getStackTrace());
        }
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void exceptionTest3(){
        int[]arr=new int[]{1,2,3};

        for (int i = 0; i <=arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    @Test(expectedExceptions = NullPointerException.class)
    public void exceptionTest4(){
        String a=null;

        System.out.println(a);
    }
}
