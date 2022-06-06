package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.MainPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US10 {

    MainPage mainPage = new MainPage();

    @When("User clicks on {string} tab")
    public void user_clicks_on_tab(String string) {
        mainPage.navigateToTab(string);
    }
    @Then("User leaves the title blank")
    public void user_leaves_the_title_blank() {

    }
    @Then("User writes message in message body")
    public void user_writes_message_in_message_body() {
        WebElement iframe = Driver.getDriver().findElement(By.xpath("(//iframe[@class=\"bx-editor-iframe\"])[2]"));
        Driver.getDriver().switchTo().frame(iframe);
        Driver.getDriver().findElement(By.xpath("//body[@contenteditable=\"true\"]")).sendKeys("Test 1-2");
        Driver.getDriver().switchTo().parentFrame();
    }
    @Then("User clicks on the send button")
    public void user_clicks_on_the_send_button() {
        mainPage.taskSendButton.click();
    }
    @Then("User should see the Task name not specified error message")
    public void user_should_see_the_task_name_not_specified_error_message() {
        Assert.assertTrue(mainPage.taskMessageNotSpecifiedMessage.isDisplayed());
    }

}
