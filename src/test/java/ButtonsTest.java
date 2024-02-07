import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.ButtonsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.fall23.demoqa.WebElementManager.findByID;
import static org.testng.Assert.assertEquals;

public class ButtonsTest {

    WebDriver driver;
    ButtonsPage buttonsPage;

    @BeforeClass
    void seTupDriver(){
        driver = Driver.getDriver();
        buttonsPage = new ButtonsPage();
    }
    @Test
    void clickButtons() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        buttonsPage.clickDouble();

        buttonsPage.clickRight();

        buttonsPage.clickDynamic();

    }
}
