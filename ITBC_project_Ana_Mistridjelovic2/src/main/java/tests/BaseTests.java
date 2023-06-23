package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;



public class BaseTests {
    private WebDriver driver;
    private WebDriverWait wait;
    private SignUpPage signUpPage;
    private IndexPage indexPage;
    private TextBoxPage elementPage;
    private BookStorePage bookStorePage;
    private JavascriptExecutor js;
    private RadioButtonPage radioButtonPage;
    private TextBoxPage textBoxPage;
    private WebDriver.Navigation navigation;


    public WebDriver getDriver(){
        return driver;
    }
    public WebDriverWait getWait(){
        return wait;
    }
    public SignUpPage getSignUpPage(){
        return signUpPage;
    }
    public IndexPage getIndexPage(){
        return indexPage;
    }
    public TextBoxPage getElementPage() {
        return elementPage;
    }
    public BookStorePage getBookStorePage(){
        return bookStorePage;
    }
    public JavascriptExecutor getJs() {
        return js;
    }
    public RadioButtonPage getRadioButtonPage(){
        return radioButtonPage;
    }
    public TextBoxPage getTextBoxPage(){
        return textBoxPage;
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C://SELENIUM//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        signUpPage = new SignUpPage(driver, wait);
        textBoxPage = new TextBoxPage(driver,wait);
        indexPage = new IndexPage(driver, wait);
        elementPage = new TextBoxPage(driver, wait);
        bookStorePage = new BookStorePage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);
        js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        radioButtonPage = new RadioButtonPage(driver, wait);
    }

    @BeforeMethod
    public void beforeEachTest(){
        getDriver().manage().window().maximize();
    }

    @AfterClass
    public void cleanUp(){
        getDriver().close();
    }

  public void scrollDown(int numberOfPixels){
        getJs().executeScript("windows.scrollBy(0" + numberOfPixels + ")", "150");

    }

    public void assertVisibilityOfElements(WebElement element) {
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }
}
