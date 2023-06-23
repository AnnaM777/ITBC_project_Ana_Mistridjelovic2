package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage {

    private WebElement bookPage;
    private WebElement bookStore;
    private WebElement elements;
    private WebElement forms;



    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public IndexPage openIndexPage(){
        getDriver().get("https://demoqa.com/");
        return this;
    }

    public WebElement getBookStore(){
        bookStore = getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]"));
        return bookStore;
    }

    public WebElement getElements(){
        elements = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        return elements;
    }

    public WebElement getForms(){
        forms = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]"));
        return forms;
    }

    public boolean formsIsClickable(){
        return getForms().isEnabled();
    }
    public boolean bookStoresIsClickable(){
        return getBookStore().isEnabled();
    }
    public boolean elementsIsCklickable(){
        return getElements().isEnabled();
    }

    public boolean indexPageIsDisplayed(){
        return  getElements().isDisplayed();
    }


}
