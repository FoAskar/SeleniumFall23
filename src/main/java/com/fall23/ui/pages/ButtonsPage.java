package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {

    WebDriver driver;
    public Actions actions;

    public ButtonsPage() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClick;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClick;

    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement dynamicClick;

    @FindBy(id="doubleClickMessage")
    public WebElement doubleClickText;

    @FindBy(id="rightClickMessage")
    public WebElement rightClickText;

    @FindBy(id="dynamicClickMessage")
    public WebElement dynamicClickText;

    public String getActualDoubleClickMessage() {
        return doubleClickText.getText();
    }

    public String getActualRightClickMessage() {
        return rightClickText.getText();
    }

    public String getActualDynamicClickMessage() {
        return dynamicClickText.getText();
    }



    public ButtonsPage clickDouble() throws InterruptedException {
        actions.doubleClick(doubleClick).perform();
        Thread.sleep(3000);
        return this;
    }

    public ButtonsPage clickRight() throws InterruptedException {
        actions.contextClick(rightClick).perform();
        Thread.sleep(3000);
        return this;

    }

    public void clickDynamic() throws InterruptedException {
        actions.click(dynamicClick).perform();
        Thread.sleep(3000);
    }
    public ButtonsPage openBPage(){
        driver.get(Constants.BP_URL);
        return this;
    }
}