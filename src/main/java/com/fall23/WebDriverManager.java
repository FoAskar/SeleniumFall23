package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverManager {

    public static WebDriver driver;

    public static WebDriver initChromeDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
    public static void closeDriver(){
        driver.close();
        driver.quit();
    }
    public static void openTheSite (String URL){
        driver.get(URL);
    }
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
}
