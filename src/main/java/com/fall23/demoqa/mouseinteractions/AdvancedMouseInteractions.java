package com.fall23.demoqa.mouseinteractions;

import com.fall23.demoqa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import static com.fall23.demoqa.WebDriverManager.openTheSite;
import static com.fall23.demoqa.WebElementManager.findByID;
import static org.testng.Assert.assertEquals;

public class AdvancedMouseInteractions extends BaseTest {

    @Test
    void doubleClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement doubleClickBtn = findByID("doubleClickBtn");
        actions.doubleClick(doubleClickBtn).perform();

        String actualDoubleClickMessage = findByID("doubleClickMessage").getText();
        assertEquals(actualDoubleClickMessage, "You have done a double click");
        Thread.sleep(5000);
    }

    @Test
    void rightClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement rightClickBtn = findByID("rightClickBtn");
        actions.contextClick(rightClickBtn).perform();

        String actualRightClickMessage = findByID("rightClickMessage").getText();
        assertEquals(actualRightClickMessage, "You have done a right click");
        Thread.sleep(5000);


    }

    @Test
    void dynamicClickTest() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickBtn).perform();

        String actualDynamicClickMessage = findByID("dynamicClickMessage").getText();
        assertEquals(actualDynamicClickMessage, "You have done a dynamic click");
        Thread.sleep(5000);
    }
}