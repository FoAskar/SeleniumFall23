import com.fall23.ui.config.ConfigReader;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.TextBoxPage;
import org.openqa.selenium.WebDriver;
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


    }
}
