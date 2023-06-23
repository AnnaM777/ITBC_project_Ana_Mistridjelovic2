package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BookStoreTests extends BaseTests {

    @Test (priority = 0)
    public void verifyIfBokPageIsDisplayed(){
        getBookStorePage().openBookStorePage();
        Assert.assertTrue(getBookStorePage().booksPageIsDisplayed());
    }

    @Test (priority = 1)
    public void verifyBookCardIsClickable(){
        getBookStorePage().openBookStorePage();
        Assert.assertTrue(getBookStorePage().loginButtonisClickable(), "Login button is not clickable");
    }

    @Test (priority = 2)
    public void verifyBookSorePage(){
        getBookStorePage().openBookStorePage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("books"));
    }
    @Test (priority = 3)
    public void verifyLoginButtonClickable() {
        getBookStorePage().openBookStorePage();
        Assert.assertTrue(getBookStorePage().loginButtonisClickable(), "Login button is not clickable");
    }
    @Test (priority = 4)
    public void navigateBack(){
        getBookStorePage().openBookStorePage();
        getDriver().navigate().back();
    }


}
