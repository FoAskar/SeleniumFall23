package com.fall23.demoqa.locators;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebDriverManager.openTheSite;

public class CssSelectorDemo extends BaseTest {

    @Test
    void demo123(){
        openTheSite("https://demoqa.com/text-box");

        driver.findElement(By.cssSelector("#userName")).sendKeys("John Doe");

    }
}
