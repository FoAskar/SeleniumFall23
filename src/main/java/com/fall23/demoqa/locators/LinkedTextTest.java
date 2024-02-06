package com.fall23.demoqa.locators;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebDriverManager.*;
import static com.fall23.demoqa.WebElementManager.findByLink;

public class LinkedTextTest extends BaseTest {

       @Test
       void byLinkedTest() throws InterruptedException {
           openTheSite("https://demoqa.com/links");
           WebElement home = findByLink("Home");
           home.click();
           Thread.sleep(5000);

       }
}
