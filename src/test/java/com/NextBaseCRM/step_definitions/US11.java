package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.MainPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US11 {
    MainPage mainPage = new MainPage();
    @Then("User writes message in announcement body")
    public void user_writes_message_in_announcement_body() {
        Driver.getDriver().switchTo().frame(mainPage.announcementIframe);
        mainPage.announcementBody.sendKeys("Announcing 1-2");
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("User leaves message body blank")
    public void userLeavesMessageBodyBlank() {
        Driver.getDriver().switchTo().frame(mainPage.announcementIframe);
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("User verifies the error message")
    public void userVerifiesTheErrorMessage() {
        Assert.assertTrue(mainPage.announcementErrorMessage.isDisplayed());
    }
}
