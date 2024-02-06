package com.fall23.demoqa.locators;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import static com.fall23.demoqa.WebDriverManager.openTheSite;
import static com.fall23.demoqa.WebElementManager.findByClassName;

public class ByClassName extends BaseTest {

    @Test
    void byClassNameTest() throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");
        WebElement submitBtn = findByClassName("btn-primary");
        submitBtn.click();
        Thread.sleep(5000);

    }
}
