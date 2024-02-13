import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.ModalDialogPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalDialogTest {

    WebDriver driver;

    ModalDialogPage modalDialogPage;

    @BeforeClass
    void seTupDriver() {
        driver = Driver.getDriver();
        modalDialogPage = new ModalDialogPage();
    }

    @Test
    void clickAllModalDialog() throws InterruptedException {
        modalDialogPage.openMDPage()
                .smallBtnClick();
        String actualSmallMDText = modalDialogPage.getSmallMDText();
        assertEquals(actualSmallMDText, "This is a small modal. It has very less content");
        modalDialogPage.smallCloseClick()
                .largeBtnClick()
                .largeCloseClick();
        Thread.sleep(5000);

    }
}
