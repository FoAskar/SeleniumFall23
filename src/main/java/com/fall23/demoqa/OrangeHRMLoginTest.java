package com.fall23.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLoginTest extends BaseTest {



    @Test(description = "Login with valid username and valid password")
    void loginWithValidUsernameAndValidPasswordTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        String actualLoginText = driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText,expectedLoginText);

        String username = "Admin";
        String password = "admin123";



        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();
        Thread.sleep(5000);

        String actualDashboardText = driver.findElement(By.tagName("h6")).getText();
        String expectedDashboardText = "Dashboard";
        Assert.assertEquals(actualDashboardText,expectedDashboardText);


    }
    @DataProvider(name="testHRMData")
    public Object [][] testHRMData (){
        return new Object[][]{
                {"Admim","admin123"},
                {"Admin","admin125"},
                {"Admim","admin125"},
        };
    }
    @Test(dataProvider = "testHRMData")
    void loginWithinValidUsernameOrinValidPasswordTest(String username,String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();
        Thread.sleep(5000);
        String actualInvalidcredentialsText = driver.findElement(By.tagName("p")).getText();
        String expectedInvalidcredentialsText = "Invalid credentials";
        Assert.assertEquals(actualInvalidcredentialsText,expectedInvalidcredentialsText);

        //driver.quit();

    }

}
