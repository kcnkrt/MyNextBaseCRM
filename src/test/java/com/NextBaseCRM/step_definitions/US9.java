package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.LoginPage;
import com.NextBaseCRM.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US9 {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @When("User clicks on {string}")
    public void user_clicks_on(String string) {
        mainPage.navigateToSubModule(string);
    }
    @Then("User should see {string}")
    public void user_should_see(String string) {
        loginPage.titleVerification(string);
    }


}
