package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStorePage extends BasePage{


    private WebElement loginButton;
    private WebElement bookPage;

    public BookStorePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public BookStorePage openBookStorePage(){
        getDriver().get("https://demoqa.com/books");
        return this;
    }

    public WebElement getLoginButton(){
        loginButton = getDriver().findElement(By.id("login"));
        return loginButton;
    }

    public boolean loginButtonisClickable(){
        return getLoginButton().isEnabled();
    }

    public boolean booksPageIsDisplayed(){
        return getLoginButton().isDisplayed();
    }

}
