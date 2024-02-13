package com.fall23.ui.helper;


import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.FramesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FrameHelper {
    WebDriver driver;
    FramesPage framesPage;

    public FrameHelper(WebDriver driver, FramesPage framesPage) {
        this.driver = Driver.getDriver();
        this.framesPage = framesPage;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void switchToFrame(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(webElement));
    }

    public void switchToFrame2(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(webElement));
    }
    public void switchToParentFrame(WebElement webElement) {

        driver.switchTo().parentFrame();
    }
    public void switchToChildFrame(WebElement webElement) {

        driver.switchTo().frame(FramesPage.childFrame);
    }

}





