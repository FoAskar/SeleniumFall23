package com.fall23.demoqa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebDriverManager.openTheSite;

public class DownloadFileTest extends BaseTest {


    @Test
    void downloadTest () throws InterruptedException {
        openTheSite("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\User\\Pictures\\Screenshots\\Снимок экрана (21).png");
        Thread.sleep(5000);
    }
}
