package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {

    private WebElement firstNameFiled;
    private WebElement lastNameField;
    private WebElement emailFiled;
    private WebElement mobileFiled;
    private WebElement countryField;
    private WebElement cityField;
    private WebElement yourMessageField;
    private WebElement captchaField;
    private WebElement sendButtonFiled;
    private WebElement displayed;
   // private WebElement captchaField;


    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getFirstNameField(){
        firstNameFiled = getDriver().findElement(By.id("first-name"));
        return firstNameFiled;
    }
    public WebElement getLastNameField(){
        lastNameField = getDriver().findElement(By.id("last-name"));
        return lastNameField;
    }
    public WebElement getEmailField(){
        emailFiled = getDriver().findElement(By.id("email"));
        return emailFiled;
    }
    public WebElement getMobileField(){
        mobileFiled = getDriver().findElement(By.id("mobile"));
        return mobileFiled;
    }

    public WebElement getCountryField(){
        countryField = getDriver().findElement(By.id("country"));
        return countryField;
    }
    public WebElement getCityField(){
        cityField = getDriver().findElement(By.id("city"));
        return cityField;
    }
    public WebElement getYourMessageField(){
        yourMessageField = getDriver().findElement(By.id("message"));
        return  yourMessageField;
    }
    public WebElement getCaptchaField(){
        captchaField = getDriver().findElement(By.id("code"));
        return captchaField;
    }
    public WebElement getSendButtonFiled(){
        sendButtonFiled = getDriver().findElement(By.xpath("//button[contains(text(),'Send')]"));
        return sendButtonFiled;
    }

    public SignUpPage enterFirstNameToField(String firstName){
        getFirstNameField().sendKeys(firstName);
        return this;
    }
    public SignUpPage enterLastNameToField(String lastName){
        getLastNameField().sendKeys(lastName);
        return this;
    }
    public SignUpPage enterEmailToField(String email){
        getEmailField().sendKeys(email);
        return this;
    }
    public SignUpPage enterMobileToFiled(String mobile){
        getMobileField().sendKeys(mobile);
        return this;
    }
    public SignUpPage enterCountryToField(String country){
        getCountryField().sendKeys(country);
        return this;
    }
    public SignUpPage enterCityToField(String city){
        getCountryField().sendKeys(city);
        return this;
    }
    public SignUpPage enterMessageToField(String message){
        getMobileField().sendKeys(message);
        return this;
    }
    public SignUpPage enterCodeToField(String code){
        getCaptchaField().sendKeys(code);
        return this;
    }
    public SignUpPage clickOnButtonField(){
        getSendButtonFiled().click();
        return this;
    }

    public SignUpPage openSignUpPage(){
        getDriver().get("https://www.toolsqa.com/selenium-training/#enroll-form");
        return this;
    }
    public boolean signUpButtonIsDisplayed(){
        return getSendButtonFiled().isDisplayed();
    }
    public boolean emailFieldIsEmpty(){
        return getEmailField().isDisplayed();
    }

}
