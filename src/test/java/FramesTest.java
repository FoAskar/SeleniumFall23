import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.FrameHelper;
import com.fall23.ui.pages.FramesPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest {

    WebDriver driver;
    FramesPage framesPage;
    FrameHelper frameHelper;




    @BeforeClass
    void seTupDriver(){
        driver = Driver.getDriver();
        framesPage = new FramesPage();
        frameHelper = new FrameHelper(driver,framesPage);

    }

    @Test
    void frameTest() throws InterruptedException {
        framesPage.openFRPage();
        frameHelper.switchToFrame(framesPage.frame1);

        String actualFrame1Text = framesPage.getActualTextFrame1();
        assertEquals(actualFrame1Text, "This is a sample page");

        //frameHelper.switchToFrame2(framesPage.frame2);

        Thread.sleep(7000);
    }
        @Test
        void nestedFrameTest() throws InterruptedException {
            framesPage.openNFRPage();
            frameHelper.switchToParentFrame(framesPage.parentFrame1);
            System.out.println("Parent frame");
            //frameHelper.switchToChildFrame(framesPage.childFrame);
            Thread.sleep(5000);
        }
}

