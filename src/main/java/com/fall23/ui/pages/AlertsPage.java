package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.Constants;
import com.fall23.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {

    public AlertsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "alertButton")
    public WebElement click1;

    @FindBy(id = "timerAlertButton")
    public WebElement click2;

    @FindBy(id = "confirmButton")
    public WebElement click3;

    @FindBy(id = "promtButton")
    public WebElement click4;

    @FindBy(id = "confirmResult")
    public WebElement okResult;

    @FindBy(xpath = "//span[contains(text(), 'selected')]")
    public WebElement canselResult;

    @FindBy(xpath = "(//span[@class='text-success'])[2]")
    public WebElement promtResult;

    @FindBy(xpath = "(//span[@class='mr-3'])[4]")
    public WebElement promtDissResult;

    public String getActualPromtText(){
        return promtResult.getText();
    }

    public String getActualPromtDismiss(){
        return promtDissResult.getText();
    }

    public String getActualText(){
        return okResult.getText();
    }
    public String getActualCanselText(){
        return canselResult.getText();
    }

    WebElementHelper webElementHelper = new WebElementHelper();
    public void openALTPage(){
        Driver.getDriver().get(Constants.ALT_URL);
    }
    public void clickFirst() {
        webElementHelper.click(click1);
    }

    public void clickTime() {
        webElementHelper.click(click2);
    }

    public void clickConfirm() {
        webElementHelper.click(click3);
    }

    public void clickPromt() {
        webElementHelper.click(click4);
    }
}