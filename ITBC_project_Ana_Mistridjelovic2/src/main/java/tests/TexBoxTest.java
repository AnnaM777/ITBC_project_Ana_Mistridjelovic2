package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TexBoxTest extends BaseTests {

    @Test
    public void verifyElementPageContainsString(){
        getTextBoxPage().openTextBoxPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("text-box"));
    }
    @Test
    public void verifyPageSource(){
        getTextBoxPage().openTextBoxPage();
        Assert.assertFalse(getDriver().getPageSource().isEmpty());
    }
    @Test
    public void checkCheckBoxCard() {
        getTextBoxPage().openTextBoxPage();
        Assert.assertEquals(getDriver().findElement(By.id("item-1")).getAttribute("class"), "btn btn-light ");
    }

}