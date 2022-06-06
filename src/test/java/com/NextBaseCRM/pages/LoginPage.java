package com.NextBaseCRM.pages;

import com.NextBaseCRM.utilities.BrowserUtils;
import com.NextBaseCRM.utilities.ConfigurationReader;
import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    
   public LoginPage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }
    
    @FindBy (xpath = "//input[@type='text']")
    public WebElement usernameTab;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement passwordTab;

    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement rememberMeButton;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//div[@class='errortext']")
    public WebElement errorText;

    public boolean titleVerification(String expectedTitle){
        String actualTitle = Driver.getDriver().getTitle();
        return actualTitle.equals(expectedTitle);
    }
    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtils.waitForPageToLoad(1);
        usernameTab.sendKeys(ConfigurationReader.getProperty("username"));
        passwordTab.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
}
