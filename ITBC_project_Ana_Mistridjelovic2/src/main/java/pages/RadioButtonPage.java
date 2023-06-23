package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage{
    private WebElement yes;
    private WebElement impressive;
    private WebElement yesMessage;
    private WebElement impressiveMessage;


    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getYes(){
        yes = getDriver().findElement(By.xpath("//label[@for='yesRadio']"));
        return yes;
    }
    public WebElement getImpressive(){
        impressive = getDriver().findElement(By.xpath("//label[@for='impressiveRadio']"));
        return impressive;
    }
    public WebElement getYesMessage(){
        yesMessage = getDriver().findElement(By.xpath("//span[contains(text(),'Yes')]"));
        return yesMessage;
    }
    public WebElement getImpressiveMessage(){
        impressiveMessage = getDriver().findElement(By.xpath("//span[contains(text(),'Impressive')]"));
        return impressiveMessage;
    }
    public RadioButtonPage clickYes() {
        getYes().click();
        return this;
    }
    public RadioButtonPage clikImpressive(){
        getImpressive().click();
        return this;
    }
    public RadioButtonPage openRadioPage(){
        getDriver().get("https://demoqa.com/radio-button");
        return this;
    }
}
