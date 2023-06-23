package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class IndexTest extends BaseTests {

    @Test (priority = 0)
    public void verifyIndexPageIsDisplayed(){
        getIndexPage().openIndexPage();
        Assert.assertTrue(getIndexPage().indexPageIsDisplayed());
    }
    @Test(priority = 1)
    public void verifyOpenIndexPage() {
        getIndexPage().openIndexPage();
        Assert.assertFalse(getDriver().getCurrentUrl().contains("index"), "the URL of index page doesn't contain index word.");
    }
    @Test (priority = 3)
    public void verifyElementIsClickable(){
        getIndexPage().openIndexPage();
        Assert.assertTrue(getIndexPage().elementsIsCklickable(), "Login button is not clickable");
    }
    @Test (priority = 2)
    public void verifyCardBookStoreAppIsClickable(){
        getIndexPage().openIndexPage();
        Assert.assertTrue(getIndexPage().bookStoresIsClickable(),"Login button is not clickable" );
    }
    @Test (priority = 4)
    public void verifyFormsIsClickable(){
        getIndexPage().openIndexPage();
        Assert.assertTrue(getIndexPage().formsIsClickable(), "Login button is not clickable");
    }




}
