package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.Constants;
import com.fall23.ui.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogPage {

    public ModalDialogPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="showSmallModal")
    public WebElement smallBtn;

    @FindBy(id="closeSmallModal")
    public WebElement smallClose;

    @FindBy(id="showLargeModal")
    public WebElement largeBtn;

    @FindBy(id="closeLargeModal")
    public WebElement largeClose;

    @FindBy(xpath="//div[@class='modal-body']")
    public WebElement smallMDText;

    public String getSmallMDText(){
        return smallMDText.getText();
    }

    WebElementHelper webElementHelper = new WebElementHelper();

    public ModalDialogPage smallBtnClick(){
        webElementHelper.click(smallBtn);
        return this;
    }
    public ModalDialogPage smallCloseClick(){
        webElementHelper.click(smallClose);
        return this;
    }
    public void largeCloseClick(){
        webElementHelper.click(largeClose);
    }
    public ModalDialogPage largeBtnClick(){
        webElementHelper.click(largeBtn);
        return this;
    }
    public ModalDialogPage openMDPage() throws InterruptedException {
        Driver.getDriver().get(Constants.MD_URL);
        return this;
    }
}
