package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.MainPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;

public class US12 {

    MainPage mainPage = new MainPage();

    @Then("User writes message in appreciation body")
    public void user_writes_message_in_appreciation_body() {
        Driver.getDriver().switchTo().frame(mainPage.announcementIframe);
        mainPage.announcementBody.sendKeys("I appreciate you");
        Driver.getDriver().switchTo().parentFrame();
    }

}
