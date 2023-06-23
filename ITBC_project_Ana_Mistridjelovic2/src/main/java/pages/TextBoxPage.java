package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage{

    private WebElement fullNameFiled;
    private WebElement emailField;
    private WebElement currentAddressField;
    private WebElement permanentAddressField;
    private WebElement submitButton;
    private WebElement filledForm;
    private WebElement clickTextBox;

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFullNameFiled(){
        fullNameFiled = getDriver().findElement(By.xpath("//input[@placeholder='Full Name']"));
        return fullNameFiled;
    }
    public WebElement getEmailField(){
        emailField = getDriver().findElement(By.id("userEmail"));
        return emailField;
    }
    public WebElement getCurrentAddressField(){
        currentAddressField = getDriver().findElement(By.id("currentAddress"));
        return currentAddressField;
    }
    public WebElement getPermanentAddressField(){
        permanentAddressField = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddressField;
    }
    public WebElement getSubmitButton(){
        submitButton = getDriver().findElement(By.xpath("//button[@id='submit']"));
                return submitButton;
    }
    public WebElement getFilledForm(){
        filledForm = getDriver().findElement(By.id("output"));
        return filledForm;
    }

    public TextBoxPage openTextBoxPage(){
        getDriver().get("https://demoqa.com/text-box");
        return this;
    }

    public TextBoxPage enterFullName(String fullName){
        getFullNameFiled().sendKeys(fullName);
        return this;
    }
    public TextBoxPage enterEmail(String email){
        getEmailField().sendKeys(email);
        return this;
    }
    public TextBoxPage enterCurrentAddress(String currentAddress){
        getCurrentAddressField().sendKeys(currentAddress);
        return this;
    }
    public TextBoxPage enterPermanentAddress(String permanentAddress){
        getPermanentAddressField().sendKeys(permanentAddress);
        return this;
    }
    public TextBoxPage clickSubmitButton(){
        getSubmitButton().click();
        return this;
    }



}
