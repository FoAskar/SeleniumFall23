package com.fall23.ui.drivers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeWebDriver {

    public static WebDriver loadEdgeDriver(){
        System.setProperty("webdriver.msedge.driver","src/main/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}
