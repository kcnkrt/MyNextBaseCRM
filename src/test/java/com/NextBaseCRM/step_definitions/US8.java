package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.MainPage;
import com.NextBaseCRM.utilities.BrowserUtils;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US8 {

    MainPage mainPage = new MainPage();

    @When("User navigates to the {string} submodule")
    public void user_navigates_to_the_submodule(String string) {
      mainPage.navigateToSubModule(string);
    }

    @Then("User sees the Chat and Calls pop-up and verifies four sub-modules")
    public void userSeesTheChatAndCallsPopUpAndVerifiesFourSubModules() {
        for (WebElement eachSub : mainPage.chatAndCalls4subs) {
            Assert.assertTrue(eachSub.isDisplayed());
        }
    }

}
