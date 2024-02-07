package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {

    public ButtonsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClick;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClick;

    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement dynamicClick;

    WebElementHelper webElementHelper = new WebElementHelper();

    public ButtonsPage clickDouble() throws InterruptedException {
        webElementHelper.click(doubleClick);
        Thread.sleep(5000);
        return this;
    }

    public ButtonsPage clickRight() throws InterruptedException {
        webElementHelper.click(rightClick);
        Thread.sleep(5000);
        return this;

    }

    public ButtonsPage clickDynamic() throws InterruptedException {
        webElementHelper.click(dynamicClick);
        Thread.sleep(5000);
        return this;
    }
}