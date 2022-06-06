package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.MainPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US6 {

    MainPage mainPage = new MainPage();

    @Then("User should see four options displayed in the dropdown")
    public void user_should_see_four_options_displayed_in_the_dropdown() {
        for (WebElement each : mainPage.moreDropDown) {
            Assert.assertTrue(each.isDisplayed());
        }
    }

}
