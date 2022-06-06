package com.NextBaseCRM.pages;

import com.NextBaseCRM.utilities.BrowserUtils;
import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class MainPage {

   public MainPage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

    @FindBy (xpath = "//span[@class=\"user-img user-default-avatar\"]")
    public WebElement avatarButton;

    @FindBy (xpath = "(//a[@class=\"menu-popup-item menu-popup-no-icon \"])[3]")
    public WebElement logoutButton;

    @FindBy (xpath = "//span[@class='menu-popup-item-icon']")
    public List<WebElement> fiveOptions;

    @FindBy (xpath = "//body[@contenteditable=\"true\"]")
    public WebElement messageBody;

    @FindBy (xpath = "//iframe[@class=\"bx-editor-iframe\"]")
    public WebElement iframe;

    @FindBy (id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy (xpath = "//div[@class=\"feed-add-error\"]")
    public WebElement errorMessage;

    @FindBy (xpath = "//div[@class=\"menu-popup\"]//span[@class='menu-popup-item-text']")
    public List<WebElement> moreDropDown;

    @FindBy (xpath = "//div[.='Which programming language to select?']")
    public WebElement pollVote;

    @FindBy (xpath = "//td//label[@class=\"bx-vote-block-input-wrap-inner\"]")
    public List<WebElement> pollOptions;

    @FindBy(xpath = "//div[@class=\"bx-vote-buttons\"]//button[@class='ui-btn ui-btn-lg ui-btn-primary']")
    public WebElement voteButton;

    @FindBy (xpath = "//div[@class=\"bx-desktop-appearance-tab\"]//div//div")
    public List<WebElement> chatAndCalls4subs;

    @FindBy (id = "blog-submit-button-save")
    public WebElement taskSendButton;

    @FindBy (xpath = "//div[@class=\"task-message-label error\"]")
    public WebElement taskMessageNotSpecifiedMessage;

    @FindBy (xpath = "//iframe[@class=\"bx-editor-iframe\"]")
    public WebElement announcementIframe;

    @FindBy (xpath = "//body[@contenteditable=\"true\"]")
    public WebElement announcementBody;

    @FindBy (xpath = "//div[@class=\"feed-add-error\"]")
    public WebElement announcementErrorMessage;

    @FindBy (xpath = "(//div[@class=\"b24-app-block-header\"])[1]")
    public WebElement desktopClient;

    public void navigateToModule(String module){
        Driver.getDriver().findElement(By.xpath("//span//span[.='"+module+"']")).click();
    }

    public void navigateToSubModule(String subModule){
         String xpath = "//a[@title='"+subModule+"']";
         Driver.getDriver().findElement(By.xpath(xpath)).click();
    }
    public void navigateToTab(String tab){
          String xpath = "//span//span[.='"+tab+"']";
          Driver.getDriver().findElement(By.xpath(xpath)).click();
    }
    public void desktopClientVerification(String str){
     String xpath = "//span[.='"+str+"']";
     Driver.getDriver().findElement(By.xpath(xpath));
    }
}
