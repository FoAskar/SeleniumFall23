import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.CheckBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBoxTest {


    WebDriver driver;

    CheckBoxPage checkBoxPage;

    @BeforeClass
    void seTupDriver() {
        driver = Driver.getDriver();
        checkBoxPage = new CheckBoxPage();
    }

    @AfterClass
    void closeResources() {
        driver.close();
        driver.quit();
    }

    @Test
    void clickRadioButtons() throws InterruptedException {
        checkBoxPage.openCBPage()
                .clickHome()
                .clickIconHome()
                .clickDesktop()
                .clickIconDesktop()
                .clickDocs()
                .clickIconDocs()
                .clickDownloads()
                .clickIconDownloads();
    }
}