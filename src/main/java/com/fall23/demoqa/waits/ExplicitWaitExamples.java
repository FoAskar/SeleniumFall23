package com.fall23.demoqa.waits;

import com.fall23.demoqa.BaseTest;
import com.fall23.demoqa.WebDriverManager;
import com.fall23.demoqa.WebElementManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.fall23.demoqa.WebDriverManager.openTheSite;
import static com.fall23.demoqa.WebElementManager.findByID;

public class ExplicitWaitExamples extends BaseTest {

    @Test
    void waitForElementToBeClickAble(){
        openTheSite("https://demoqa.com/dynamic-properties");
        WebElement willEnableAfter5SecondBtn = findByID("enableAfter");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.elementToBeClickable(willEnableAfter5SecondBtn)).click();


        WebElement visibleAfter5SecondBtn = findByID("visibleAfter");
        wait.until(ExpectedConditions.visibilityOf(visibleAfter5SecondBtn)).click();

        WebElement dangerColor = findByID("colorChange");
        wait.until(ExpectedConditions.attributeContains(dangerColor,"class","danger"));
        System.out.println(dangerColor.getAttribute("class"));
    }
}
