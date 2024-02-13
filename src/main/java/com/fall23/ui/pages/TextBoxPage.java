package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.Constants;
import com.fall23.ui.helper.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    WebDriver driver = Driver.getDriver();
    public TextBoxPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(id = "name")
    public WebElement fullNameText;

    @FindBy(id = "email")
    public WebElement emailText;

    @FindBy(xpath = "//p[@id='currentAddress']")
    public WebElement currentAddressText;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    public WebElement permanentAddressText;


    public String getActualFullName() {
        return fullNameText.getText();
    }

    public String getActualEmail() {
        return emailText.getText();
    }

    public String getActualCurrentAddressText() {
        return currentAddressText.getText();
    }

    public String getActualPermanentAddressText() {
        return permanentAddressText.getText();
    }

    WebElementHelper webElementHelper = new WebElementHelper();


    public TextBoxPage fillUpFullName(String fullName) {
        webElementHelper.sendKeys(fullNameInput, fullName);
        return this;

    }

    public TextBoxPage fillUpEmail(String email) {
        webElementHelper.sendKeys(emailInput, email);
        return this;


    }

    public TextBoxPage fillUpCurrentAddress(String currentAddress) {
        webElementHelper.sendKeys(currentAddressInput, currentAddress);
        return this;
    }

    public TextBoxPage fillUpPermanentAddress(String permanentAddress) {
        webElementHelper.sendKeys(permanentAddressInput, permanentAddress);
        return this;
    }
    public TextBoxPage openTBPage (){
        driver.get(Constants.TB_URL);
        return this;
    }
    public void clickSubmitBtn (){
        webElementHelper
                .scrollToElement(submitBtn)
                .click(submitBtn);
    }
}