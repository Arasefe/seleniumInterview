package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JsAlerts {
    WebDriver driver;
    public JsAlerts(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    private WebElement jsAlertInfo;

    @FindBy(css = "[title='Create Calendar event']")
    private WebElement jsAlertConfirm;

    @FindBy(css = "[title='Create Calendar event']")
    private WebElement jsAlertPrompt;
}
