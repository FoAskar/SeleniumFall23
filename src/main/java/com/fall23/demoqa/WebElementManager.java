package com.fall23.demoqa;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class WebElementManager {

    static WebDriver driver = Driver.getDriver();

    public static WebElement findByLink (String link){

        return driver.findElement(By.linkText(link));
    }
    public static WebElement findByPartial (String partial){

        return driver.findElement(By.partialLinkText(partial));
    }
    public static WebElement findByID (String id){

        return driver.findElement(By.id(id));
    }
    public static WebElement findByXPATH (String xpath){

        return driver.findElement(By.xpath(xpath));
    }
    public static WebElement findByClassName (String classname){

        return driver.findElement(By.className(classname));
    }
    public static void scrollBy (){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
    }
}



