package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {

    public RadioButtonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "label[for=yesRadio]")
    public WebElement yesInput;

    @FindBy(css = "label[for=impressiveRadio]")
    public WebElement impressiveInput;

    @FindBy(css = "label[for=noRadio]")
    public WebElement noInput;

    WebElementHelper webElementHelper = new WebElementHelper();

    public RadioButtonPage clickYes() throws InterruptedException {
        webElementHelper.click(yesInput);
        Thread.sleep(3000);
        return this;
    }

    public RadioButtonPage clickImpressive() throws InterruptedException {
        webElementHelper.click(impressiveInput);
        Thread.sleep(3000);
        return this;
    }

    public RadioButtonPage clickNo() throws InterruptedException {
        webElementHelper.click(noInput);
        Thread.sleep(3000);
        return this;

    }
}