import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.RadioButtonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioButtonTest {


    WebDriver driver;

    RadioButtonPage radioButtonPage;

    @BeforeClass
    void seTupDriver(){
        driver = Driver.getDriver();
        radioButtonPage = new RadioButtonPage();
    }
    @Test
    void clickRadioButtons() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage.clickYes();
        String actualYes = driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).getText();
        Assert.assertEquals(actualYes,"Yes");
        radioButtonPage.clickImpressive();
        String actualImpressive = driver.findElement(By.xpath("//span[contains(text(),'Impressive')]")).getText();
        Assert.assertEquals(actualImpressive,"Impressive");
        radioButtonPage.clickNo();
        String actualNo = driver.findElement(By.xpath("//label[contains(text(),'No')]")).getText();
        Assert.assertEquals(actualNo,"No");


    }
}
