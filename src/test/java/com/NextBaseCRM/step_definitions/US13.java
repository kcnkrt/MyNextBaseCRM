package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.MainPage;
import com.NextBaseCRM.utilities.BrowserUtils;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.gherkin.Main;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class US13 {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    MainPage mainPage = new MainPage();

    @When("User scrolls down to Desktop Client")
    public void user_scrolls_down_to_desktop_client() {
        js.executeScript("arguments[0].scrollIntoView();", mainPage.desktopClient);
        BrowserUtils.sleep(2);
    }
    @Then("User should see the {string}")
    public void user_should_see_the(String string) {
        mainPage.desktopClientVerification(string);
    }

}
