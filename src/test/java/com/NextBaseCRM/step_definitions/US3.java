package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.LoginPage;
import com.NextBaseCRM.pages.MainPage;
import com.NextBaseCRM.utilities.BrowserUtils;
import com.NextBaseCRM.utilities.ConfigurationReader;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US3 {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        loginPage.login();
    }

    @When("User clicks on the avatar button")
    public void user_clicks_on_the_avatar_button() {
        mainPage.avatarButton.click();
    }
    @Then("User clicks on the log out option")
    public void user_clicks_on_the_log_out_option() {
        mainPage.logoutButton.click();
    }
    @Then("User navigates back to the login page")
    public void user_navigates_back_to_the_login_page() {
        loginPage.titleVerification("Authorization");
    }

}
