import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.PracticeFormPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class PracticeFormTest {

    WebDriver driver;
    PracticeFormPage practiceFormPage;


    @BeforeClass
    void seTupDriver() {
        driver = Driver.getDriver();
        practiceFormPage = new PracticeFormPage();
    }

//    @AfterClass
//    void closeResources (){
//        driver.close();
//        driver.quit();
//    }


    Faker faker = new Faker();

    @Test
    void fillUpPracticeFormTest() throws InterruptedException {
        practiceFormPage.openAPFPage().generateAndFillRandomData();

        // Генерируем случайные данные для даты рождения
        String[] months = DateFormatSymbols.getInstance(Locale.ENGLISH).getMonths();
        int randomDay = faker.number().numberBetween(1, 31);
        String randomMonth = months[faker.random().nextInt(0, months.length - 1)];
        int randomYear = faker.number().numberBetween(1900, 2023);

        // Вызываем метод selectDateMonthYear с передачей случайных значений
        PracticeFormPage.selectDateMonthYear(randomDay, randomMonth, randomYear);

        // Генерируем и вводим случайный предмет
        practiceFormPage.selectSubjects();
        practiceFormPage.selectHobbies();
        practiceFormPage.uploadFile();
        practiceFormPage.currentAddressRandom();


        Thread.sleep(10000);
    }
}