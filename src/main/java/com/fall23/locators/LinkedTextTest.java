package com.fall23.locators;

import com.fall23.BaseTest;
import com.fall23.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;

import static com.fall23.WebDriverManager.*;

public class LinkedTextTest extends BaseTest {

       @Test
       void byLinkedTest() throws InterruptedException {
           openTheSite("https://demoqa.com/links");
           WebElement home = findByLink("Home");
           home.click();
           Thread.sleep(5000);

       }
}
