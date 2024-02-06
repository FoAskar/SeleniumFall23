package com.fall23.demoqa.locators;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebDriverManager.openTheSite;

public class ByXpathDemo extends BaseTest {

    @Test
    void demo () throws InterruptedException {
        openTheSite("https://demoqa.com/text-box");
        WebElement fullnameInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        fullnameInput.sendKeys("John Connor");
        Thread.sleep(5000);
    }
}
