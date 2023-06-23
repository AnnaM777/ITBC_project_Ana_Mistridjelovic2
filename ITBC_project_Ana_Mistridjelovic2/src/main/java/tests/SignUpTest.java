package tests;


import com.sun.net.httpserver.Authenticator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SignUpTest extends BaseTests{
    @Test
    public void verifyIfTitleIsDisplayed(){
        getSignUpPage().open();
        Assert.assertFalse(getDriver().getTitle().isEmpty());
    }
    @Test
    public void verifySignUpWithValidCredentials(){
        getSignUpPage().openSignUpPage()
                .enterFirstNameToField("Petar")
                .enterLastNameToField("Petrovic")
                .enterEmailToField("nekiemail123@gmail.com")
                .enterMobileToFiled("062333444")
                .enterCountryToField("Serbia")
                .enterCityToField("Belgrade")
                .enterMessageToField("Some text")
                .enterCodeToField("S9E8")
                .clickOnButtonField();
        Assert.assertTrue(getSignUpPage().signUpButtonIsDisplayed());

    }
    @Test
    public void verifySignUpWithEmptyEmailField(){
        getSignUpPage().openSignUpPage()
                .enterFirstNameToField("Jean-Paul")
                .enterLastNameToField("Sartre")
                .enterEmailToField("")
                .enterMobileToFiled("06677888")
                .enterCountryToField("France")
                .enterCityToField("Paris")
                .enterMessageToField("Some text2")
                .enterCodeToField("Zt7f")
                .clickOnButtonField();
        Assert.assertTrue(getSignUpPage().emailFieldIsEmpty(), "Email field is empty");
    }

}
