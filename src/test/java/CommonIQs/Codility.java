package CommonIQs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Codility {
    /*
      !!! Do not create your own WebDriver. !!!

      You can copy credentials from here:
       - login@codility.com    password
       - unknown@codility.com  password
    */
    @Test
    public void checkFields(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
        WebElement emailBox=driver.findElement(By.id("email-input"));
        WebElement passwordBox=driver.findElement(By.id("password-input"));
        WebElement loginBox=driver.findElement(By.id("login-button"));

        Assert.assertEquals(driver.getTitle(),"ARR");
        Assert.assertTrue(emailBox.isEnabled());
        Assert.assertTrue(passwordBox.isEnabled());
        Assert.assertTrue(loginBox.isEnabled());
        driver.close();


    }

    @Test
    public void positiveLogin(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
        WebElement emailBox=driver.findElement(By.id("email-input"));
        WebElement passwordBox=driver.findElement(By.id("password-input"));
        WebElement loginBox=driver.findElement(By.id("login-button"));
        String email="login@codility.com";
        String password="password";
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginBox.click();
        WebElement message=driver.findElement(By.xpath("//div[@id='container']/div"));
        Assert.assertEquals("Welcome to Codility",message.getText());
        driver.close();


    }

    @Test
    public void negativeLogin(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
        WebElement emailBox=driver.findElement(By.id("email-input"));
        WebElement passwordBox=driver.findElement(By.id("password-input"));
        WebElement loginBox=driver.findElement(By.id("login-button"));
        String email="unknown@codility.com";
        String password="password";
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginBox.click();
        WebElement message=driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div"));
        Assert.assertEquals(message.getText(),"You shall not pass! Arr!");
        driver.close();


    }


    @Test
    public void emailValidation(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
        WebElement emailBox=driver.findElement(By.id("email-input"));
        WebElement passwordBox=driver.findElement(By.id("password-input"));
        WebElement loginBox=driver.findElement(By.id("login-button"));
        String email="login#codility.com";
        String password="password";
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginBox.click();
        WebElement message=driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div"));
        Assert.assertEquals(message.getText(),"Enter a valid email");
        driver.close();


    }

    @Test
    public void emptyCredentials(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
        WebElement emailBox=driver.findElement(By.id("email-input"));
        WebElement passwordBox=driver.findElement(By.id("password-input"));
        WebElement loginBox=driver.findElement(By.id("login-button"));
        String email="";
        String password="";
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginBox.click();
        WebElement message=driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div[2]"));
        Assert.assertTrue(message.getText().contains("Password is required"));
        driver.close();

    }






    @Test
    public void testLoginFormPresent() {
        // below you can find already setup webDriver
        //webDriver.findElement(By.id("element_id"));
    }
}
