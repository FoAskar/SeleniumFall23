
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.ButtonsPage;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static com.fall23.demoqa.WebElementManager.findByID;
import static org.testng.Assert.assertEquals;

public class ButtonsTest {

    WebDriver driver;
    ButtonsPage buttonsPage;

    @BeforeClass
    void seTupDriver() {
        driver = Driver.getDriver();
        buttonsPage = new ButtonsPage();
    }
    @AfterClass
    void closeResources(){
        driver.close();
        driver.quit();
    }

    @Test
    void clickButtons() throws InterruptedException {
        buttonsPage.openBPage()
        .clickDouble()
        .clickRight()
        .clickDynamic();
        String actualDoubleClickMessage = buttonsPage.getActualDoubleClickMessage();
        assertEquals(actualDoubleClickMessage, "You have done a double click");
        Thread.sleep(3000);


        String actualRightClickMessage = buttonsPage.getActualRightClickMessage();
        assertEquals(actualRightClickMessage, "You have done a right click");
        Thread.sleep(3000);



        String actualDynamicClickMessage = buttonsPage.getActualDynamicClickMessage();
        assertEquals(actualDynamicClickMessage, "You have done a dynamic click");
        Thread.sleep(3000);

    }
}
