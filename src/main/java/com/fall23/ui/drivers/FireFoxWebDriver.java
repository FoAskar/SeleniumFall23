package com.fall23.ui.drivers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static com.fall23.demoqa.WebDriverManager.driver;

public class FireFoxWebDriver {

    public static WebDriver loadFireFoxDriver(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}

