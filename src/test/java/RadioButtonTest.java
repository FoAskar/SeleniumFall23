import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.RadioButtonPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
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

    @AfterClass
    void closeResources(){
        driver.close();
        driver.quit();
    }
    @Test
    void clickRadioButtons() throws InterruptedException {
        radioButtonPage.openRBPage()
                .clickYes()
                .clickImpressive()
                .clickNo();

        String actualYes = radioButtonPage.getActualYesText();
        Assert.assertEquals(actualYes,"Yes");

        String actualImpressive = radioButtonPage.getActualImpressiveText();
        Assert.assertEquals(actualImpressive,"Impressive");

        String actualNo = radioButtonPage.getActualNoText();
        Assert.assertEquals(actualNo,"No");


    }
}
