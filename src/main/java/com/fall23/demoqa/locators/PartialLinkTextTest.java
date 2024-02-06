package com.fall23.demoqa.locators;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.fall23.demoqa.WebDriverManager.openTheSite;
import static com.fall23.demoqa.WebElementManager.findByPartial;

public class PartialLinkTextTest extends BaseTest {

    @Test
    void byPartialLink () throws InterruptedException {
        openTheSite("https://demoqa.com/links");
        WebElement partial = findByPartial("Unauth");
        partial.click();
        Thread.sleep(5000);
        String actualLinkhasrespondedText = driver.findElement(By.tagName("p")).getText();
        String expectedLinkhasrespondedText = "Link has responded with staus 401 and status text Unauthorized";
        Assert.assertEquals(actualLinkhasrespondedText,expectedLinkhasrespondedText);
    }
}
