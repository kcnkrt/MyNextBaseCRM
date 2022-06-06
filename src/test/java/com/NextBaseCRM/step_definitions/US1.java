package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.LoginPage;
import com.NextBaseCRM.utilities.ConfigurationReader;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class US1 {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("env"));
    }
    @When("User should verify the title is {string}")
    public void user_should_verify_the_title_is(String string) {
        loginPage.titleVerification(string);
    }
    @Then("User enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.usernameTab.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordTab.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @Then("User checks the checkbox label {string}")
    public void user_verifies_the_checkbox_label(String string) {
        loginPage.rememberMeButton.click();
    }
    @Then("User clicks on the log in button")
    public void user_clicks_on_the_log_in_button() {
        loginPage.loginButton.click();
    }

    @Then("User enters {string}")
    public void user_enters(String string) {
        loginPage.usernameTab.sendKeys(string);
        loginPage.passwordTab.sendKeys(string);
    }
    @Then("User should see the error message")
    public void user_should_see_the_error_message() {
        Assert.assertTrue(loginPage.errorText.isDisplayed());
    }


}
