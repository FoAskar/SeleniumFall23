package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.Constants;
import com.fall23.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserWinPage {

    public BrowserWinPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "tabButton")
    public WebElement tabButton;

    @FindBy(xpath = "//h1[text()='This is a sample page']")
    public WebElement newTabText;

    public String getActualNewTabText(){

        return newTabText.getText();
    }

    public void openBWPage() {

        Driver.getDriver().get(Constants.BW_URL);
    }

    WebElementHelper webElementHelper = new WebElementHelper();

    public void openNewTab() {
        for (int i = 0; i < 5; i++) {
            webElementHelper.click(tabButton);

        }

    }

}