package com.fall23.ui.helper;


import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    public WebDriver driver;

    public Alert getAlert() {
        return Driver.getDriver().switchTo().alert();
    }

    public void acceptAlert() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if (isAlertPresent()){
            return;
        }
        getAlert().accept();

    }

    public void dismissAlert() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if (isAlertPresent()){
            return;
        }
        getAlert().dismiss();

    }
    public void sendKeysAlert(String txt){
        getAlert().sendKeys(txt);
        if (isAlertPresent()){
            return;
        }


    }
    public boolean isAlertPresent(){
        try{
            Driver.getDriver().switchTo().alert();
            return false;
        }catch (NoAlertPresentException e){
            e.printStackTrace();
            return true;
        }
    }


}