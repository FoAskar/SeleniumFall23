package com.fall23.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.fall23.demoqa.WebDriverManager.driver;

public class WebElementManager {

    public static WebElement findByLink (String link){

        return driver.findElement(By.linkText(link));
    }
    public static WebElement findByPartial (String partial){

        return driver.findElement(By.partialLinkText(partial));
    }
    public static WebElement findByID (String id){

        return driver.findElement(By.id(id));
    }
    public static WebElement findByClassName (String classname){

        return driver.findElement(By.className(classname));
    }
    public static void scrollBy (){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
    }
}



