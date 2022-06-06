package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.MainPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US4 {

    MainPage mainPage = new MainPage();

    @Then("User has access to 5 options under the avatar button")
    public void user_has_access_to_options_under_the_avatar_button() {
        for (WebElement eachOption : mainPage.fiveOptions) {
            Assert.assertTrue(eachOption.isEnabled());
        }
    }

}
