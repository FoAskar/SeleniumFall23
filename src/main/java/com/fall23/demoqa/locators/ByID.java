package com.fall23.demoqa.locators;

import com.fall23.demoqa.BaseTest;
import com.fall23.demoqa.WebElementManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import static com.fall23.demoqa.WebDriverManager.openTheSite;
import static com.fall23.demoqa.WebElementManager.findByID;


public class ByID extends BaseTest {

    @Test
    void byIdTest () throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");


        WebElement usernameInput = findByID("userName");
        WebElement emailInput = findByID("userEmail");
        WebElement currentAddressInput = findByID("currentAddress");
        WebElement permanentAddressInput = findByID("permanentAddress");
        WebElement submitBtn = findByID("submit");

        usernameInput.sendKeys("John");
        emailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("Baker street 70");
        permanentAddressInput.sendKeys("Seven avenue 17");
        WebElementManager.scrollBy();
        submitBtn.click();
        Thread.sleep(7000);
    }
}
