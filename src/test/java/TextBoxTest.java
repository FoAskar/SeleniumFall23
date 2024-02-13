import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TextBoxTest {

    WebDriver driver;
    TextBoxPage textBoxPage;

    @BeforeClass
    void seTupDriver(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
    }

    @AfterClass
    void closeResources (){
        driver.close();
        driver.quit();
    }


    @Test
    void fillUpTheFormPositiveTest(){

        textBoxPage.openTBPage()
                .fillUpFullName("John Connor")
                .fillUpEmail("john@gmail.com")
                .fillUpCurrentAddress("Baker street 70")
                .fillUpPermanentAddress("7 avenue")
                .clickSubmitBtn();

        String actualFullName = textBoxPage.getActualFullName();
        assertEquals(actualFullName,"Name:John Connor");
        String actualEmail = textBoxPage.getActualEmail();
        assertEquals(actualEmail,"Email:john@gmail.com");
        String actualCurrentAddressText =textBoxPage.getActualCurrentAddressText();
        assertEquals(actualCurrentAddressText,"Current Address :Baker street 70");
        String actualPermanentAddressText = textBoxPage.getActualPermanentAddressText();
        assertEquals(actualPermanentAddressText,"Permananet Address :7 avenue");



    }
}
