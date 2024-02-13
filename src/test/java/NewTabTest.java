import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.WindowHelper;
import com.fall23.ui.pages.BrowserWinPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTabTest {


    WebDriver driver;
    BrowserWinPage browserWinPage;
    WindowHelper windowHelper;

   @BeforeClass
    void seTupDriver(){
       driver = Driver.getDriver();
       browserWinPage = new BrowserWinPage();
       windowHelper = new WindowHelper();
   }

   @AfterClass
    void closeResources(){
       driver.close();
       driver.quit();
   }

   @Test
   void NewTabAll() throws InterruptedException {
       browserWinPage.openBWPage();
       browserWinPage.openNewTab();
       WindowHelper.switchToWindow(3);
       String actualNewTabText = browserWinPage.getActualNewTabText();
       Assert.assertEquals(actualNewTabText,"This is a sample page");
       WindowHelper.switchToParent();
       WindowHelper.switchToParentWithChildClose();

       Thread.sleep(5000);

   }

}
