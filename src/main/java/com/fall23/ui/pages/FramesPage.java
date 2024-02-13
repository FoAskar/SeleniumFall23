package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {

    public FramesPage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "frame1")
    public WebElement frame1;
    @FindBy(id = "frame2")
    public WebElement frame2;
    @FindBy(id = "sampleHeading")
    public WebElement getFrame1Text;
    @FindBy(id="frame1")
    public WebElement parentFrame1;

    @FindBy(xpath="//iframe[@srcdoc='<p>Child Iframe</p>']")
    public static WebElement childFrame;


    public String getActualTextFrame1(){

        return getFrame1Text.getText();
    }

    public  void openFRPage(){
        Driver.getDriver().get(Constants.FR_URL);

    }
    public  void openNFRPage(){
        Driver.getDriver().get(Constants.NFR_URL);

    }

}


