package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTests extends BaseTests{
    @Test(priority = 0)
    public void verifyYesMessage(){
        getRadioButtonPage().openRadioPage()
                .clickYes();
        assertVisibilityOfElements(getRadioButtonPage().getYesMessage());

    }
    @Test (priority = 1)
    public void verifyImpressiveMessage(){
        getRadioButtonPage().openRadioPage()
                .clikImpressive();
        assertVisibilityOfElements(getRadioButtonPage().getImpressiveMessage());
    }
}
