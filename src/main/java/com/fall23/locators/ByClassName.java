package com.fall23.locators;

import com.fall23.BaseTest;
import com.fall23.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.findByClassName;
import static com.fall23.WebDriverManager.openTheSite;

public class ByClassName extends BaseTest {

    @Test
    void byClassNameTest() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");
        WebElement submitBtn = findByClassName("btn-primary");
        submitBtn.click();
        Thread.sleep(5000);

    }
}
