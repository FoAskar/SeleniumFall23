import com.fall23.ui.config.ConfigReader;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBoxTest {

    WebDriver driver;
    TextBoxPage textBoxPage;

    @BeforeClass
    void seTupDriver(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
    }

    @Test
    void fillUpTheFormPositiveTest(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage
                .fillUpFullName("John Connor")
                .fillUpEmail("john@gmail.com")
                .fillUpCurrentAddress("Baker street 70")
                .fillUpPermanentAddress("7 avenue")
                .clickSubmitBtn();

        String actualFullName = driver.findElement(By.id("name")).getText();
        Assert.assertEquals(actualFullName,"Name:John Connor");
        String actualEmail = driver.findElement(By.id("email")).getText();
        Assert.assertEquals(actualEmail,"Email:john@gmail.com");
        String actualCurrentAddress = driver.findElement(By.id("email")).getText();
        Assert.assertEquals(actualCurrentAddress,"Current Address :Baker street 70");
        String actualPermanentAddress = driver.findElement(By.id("email")).getText();
        Assert.assertEquals(actualPermanentAddress,"Permananet Address :7 avenue");


    }
}
