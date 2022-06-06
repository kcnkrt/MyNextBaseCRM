package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.MainPage;
import com.NextBaseCRM.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US5 {

    MainPage mainPage = new MainPage();
    Faker faker = new Faker();

    @When("User navigates to the {string} tab")
    public void user_navigates_to_the_tab(String string) {
        mainPage.navigateToModule(string);
    }
    @Then("Message body should open up")
    public void message_body_should_open_up() {
        Driver.getDriver().switchTo().frame(mainPage.iframe);
        mainPage.messageBody.isDisplayed();
    }

    @Then("User should write a message and post it")
    public void user_should_write_a_message_and_post_it() {
        mainPage.messageBody.sendKeys(faker.artist().name());
        Driver.getDriver().switchTo().parentFrame();
        mainPage.sendButton.click();
    }


    @Then("User leave the message body blank and post it")
    public void user_leave_the_message_body_blank_and_post_it() {
        Driver.getDriver().switchTo().parentFrame();
        mainPage.sendButton.click();
    }
    @Then("User should see {string} error message")
    public void user_should_see_error_message(String string) {
        Assert.assertTrue(mainPage.errorMessage.isDisplayed());
    }

}
