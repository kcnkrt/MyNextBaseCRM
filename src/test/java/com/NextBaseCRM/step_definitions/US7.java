package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.LoginPage;
import com.NextBaseCRM.pages.MainPage;
import com.NextBaseCRM.utilities.BrowserUtils;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class US7 {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @When("User scrolls down to poll")
    public void user_scrolls_down_to_poll() {
       js.executeScript("arguments[0].scrollIntoView();", mainPage.pollVote);
        BrowserUtils.sleep(2);
    }
    @Then("User selects an option")
    public void user_selects_an_option() {
        mainPage.pollOptions.get(1).click();
//       WebElement[] optionsArray = mainPage.pollOptions.toArray(new WebElement[0]);
//       optionsArray[1].click();
       BrowserUtils.sleep(2);
    }
    @Then("User votes")
    public void user_votes() {
        mainPage.voteButton.click();
    }
}
