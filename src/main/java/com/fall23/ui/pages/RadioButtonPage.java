package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.Constants;
import com.fall23.ui.helper.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {
    WebDriver driver= Driver.getDriver();
    public RadioButtonPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "label[for=yesRadio]")
    public WebElement yesInput;

    @FindBy(css = "label[for=impressiveRadio]")
    public WebElement impressiveInput;

    @FindBy(css = "label[for=noRadio]")
    public WebElement noInput;

    @FindBy(xpath = "//span[@class='text-success']")
    public WebElement actualYesText;


    @FindBy(xpath = "//span[text()='Impressive']")
    public WebElement actualImpressiveText;

    @FindBy(xpath = "//label[contains(text(),'No')]")
    public WebElement actualNoText;

    public String getActualYesText(){
        return actualYesText.getText();
    }

    public String getActualImpressiveText(){
        return actualImpressiveText.getText();
    }

    public String getActualNoText(){
        return actualNoText.getText();
    }

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

    public void clickNo() throws InterruptedException {
        webElementHelper.click(noInput);
        Thread.sleep(3000);
    }
    public RadioButtonPage openRBPage (){
        driver.get(Constants.RBP_URL);
        return this;
    }

}