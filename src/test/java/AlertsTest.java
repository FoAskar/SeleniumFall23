import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.AlertHelper;
import com.fall23.ui.pages.AlertsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTest {

    WebDriver driver;
    AlertsPage alertsPage;
    AlertHelper alertHelper;


    @BeforeClass
    void seTupDriver(){
        driver = Driver.getDriver();
        alertsPage = new AlertsPage();
        alertHelper = new AlertHelper();
    }

    @Test
    void newAlerts() throws InterruptedException {
        alertsPage.openALTPage();
        alertsPage.clickFirst();
        alertHelper.acceptAlert();
        alertsPage.clickTime();
        alertHelper.acceptAlert();
        alertsPage.clickConfirm();
        alertHelper.acceptAlert();

        String actualOkText = alertsPage.getActualText();
        assertEquals(actualOkText,"You selected Ok");

        alertsPage.clickConfirm();
        alertHelper.dismissAlert();

//        String actualCanselText = alertsPage.getActualCanselText();
//        Assert.assertEquals(actualCanselText,"You selected Cansel");

        alertsPage.clickPromt();
        alertHelper.sendKeysAlert("Hi");
        alertHelper.acceptAlert();

        String actualPromtText = alertsPage.getActualPromtText();
        assertEquals(actualPromtText,"You entered Hi");

        alertsPage.clickPromt();
        alertHelper.dismissAlert();

        String actualPromtDisText = alertsPage.getActualPromtDismiss();
        assertEquals(actualPromtDisText,"On button click, prompt box will appear");

        Thread.sleep(5000);

    }
}
