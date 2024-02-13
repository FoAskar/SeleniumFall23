package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.Constants;
import com.fall23.ui.helper.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
    WebDriver driver = Driver.getDriver();

    public CheckBoxPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button)[4]")
    public WebElement dropDownHome;

    @FindBy(xpath = "(//span[@class='rct-node-icon'])[1]")
    public WebElement iconHome;

    @FindBy(xpath = "(//span[@class='rct-node-icon'])[2]")
    public WebElement iconDesktop;

    @FindBy(xpath = "(//span[@class='rct-node-icon'])[3]")
    public WebElement iconDocs;

    @FindBy(xpath = "(//span[@class='rct-node-icon'])[4]")
    public WebElement iconDownloads;



    @FindBy(xpath = "(//button)[5]")
    public WebElement dropDownDesktop;

    @FindBy(xpath = "(//button)[6]")
    public WebElement dropDownDocs;

    @FindBy(xpath = "(//button[@class='rct-collapse rct-collapse-btn'])[6]")
    public WebElement dropDownDownloads;

    WebElementHelper webElementHelper = new WebElementHelper();

    public CheckBoxPage clickHome() throws InterruptedException {
        webElementHelper.click(dropDownHome);
        Thread.sleep(3000);
        return this;
    }

    public CheckBoxPage clickIconHome() throws InterruptedException {
        webElementHelper.click(iconHome);
        Thread.sleep(3000);
        return this;
    }

    public CheckBoxPage clickDesktop() throws InterruptedException {
        webElementHelper.click(dropDownDesktop);
        Thread.sleep(3000);
        return this;
    }

    public CheckBoxPage clickIconDesktop() throws InterruptedException {
        webElementHelper.click(iconDesktop);
        Thread.sleep(3000);
        return this;
    }

    public CheckBoxPage clickDocs() throws InterruptedException {
        webElementHelper.click(dropDownDocs);
        Thread.sleep(3000);
        return this;
    }

    public CheckBoxPage clickIconDocs() throws InterruptedException {
        webElementHelper.click(iconDocs);
        Thread.sleep(3000);
        return this;
    }

    public CheckBoxPage clickDownloads() throws InterruptedException {
        webElementHelper.click(dropDownDownloads);
        Thread.sleep(3000);
        return this;
    }

    public void clickIconDownloads() throws InterruptedException {
        webElementHelper.click(iconDownloads);
        Thread.sleep(3000);
    }

    public CheckBoxPage openCBPage() {
        driver.get(Constants.CB_URL);
        return this;
    }
}

