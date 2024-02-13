package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.Constants;
import com.fall23.ui.helper.DropDownHelper;
import com.fall23.ui.helper.WebElementHelper;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeFormPage {

    WebDriver driver = Driver.getDriver();
    Faker faker= new Faker();
    public PracticeFormPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="firstName")
    public WebElement firstNameInput;

    @FindBy(id="lastName")
    public WebElement lastNameInput;

    @FindBy(id="userEmail")
    public WebElement userEmailInput;

    @FindBy(xpath = "//div[@class='custom-control custom-radio custom-control-inline']")
    public List<WebElement> genderRadioButtons;

    @FindBy(id="userNumber")
    public WebElement userNumberInput;

    @FindBy(className = "react-datepicker__input-container")
    public static WebElement datePickerButton;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;



      WebElementHelper webElementHelper = new WebElementHelper();
      public PracticeFormPage fillUpPersonalInformation() {
        firstNameInput.sendKeys(faker.name().firstName());
        lastNameInput.sendKeys(faker.name().lastName());
        userEmailInput.sendKeys(faker.internet().emailAddress());
        return this;
    }

    public PracticeFormPage selectRandomGender() {
        int randomNumber = faker.random().nextInt(genderRadioButtons.size());
        webElementHelper.click(genderRadioButtons.get(randomNumber));
        return this;
    }
    public void fillUpUserNumber() {
        userNumberInput.sendKeys(faker.number().digits(10));
    }
    public void generateAndFillRandomData() {
        fillUpPersonalInformation()
                .selectRandomGender()
                .fillUpUserNumber();
    }

    public static final void selectDateMonthYear(int day, String month, int year) {
    WebElementHelper webElementHelper = new WebElementHelper();
    webElementHelper.click(datePickerButton);
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.className("react-datepicker__month-select")
    ));
    WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.className("react-datepicker__year-select")));
    DropDownHelper dropDownHelper = new DropDownHelper();

    // Select Month
    dropDownHelper.selectByText(monthDropDown, month);

    // Select Year
    dropDownHelper.selectByText(yearDropDown, Integer.toString(year));

    WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath(
                    "//div[contains(@class,'react-datepicker__day') and not(contains(" +
                            "@class,'react-datepicker__day--outside-month')) and text()='" + day + "']")));
    webElementHelper.click(dayElement);
}

    public void selectSubjects() {
        List<String> subjects = Arrays.asList("Maths", "Science", "English", "History", "Chemistry",
                "Computer Science", "Biology", "Physics", "Arts", "Accounting", "Social Studies");
        for (int i = 0; i < 5; i++) {
            int randomIndex = faker.random().nextInt(subjects.size());
            String subject = subjects.get(randomIndex);
            subjectsInput.sendKeys(subject);
            subjectsInput.sendKeys(Keys.TAB); // Попробуйте использовать Keys.RETURN вместо Keys.TAB
        }
    }
    public PracticeFormPage selectHobbies() {
        // Assuming hobbies are near gender radio buttons(Предполагая, что увлечения находятся рядом с гендерными радиокнопками)
        webElementHelper.scrollToElement(genderRadioButtons.get(0));
        List<WebElement> hobbyCheckboxes = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
        // Shuffle the checkboxes to select random ones(Перемешайте флажки, чтобы выбрать случайные.)
        Collections.shuffle(hobbyCheckboxes);
        for (int i = 0; i < 2; i++) {
            webElementHelper.click(hobbyCheckboxes.get(i));
        }
        return this;
    }
    public PracticeFormPage uploadFile(){
        driver.findElement(By.id("uploadPicture")).sendKeys("D:\\курс\\курс\\ZOOM.txt");
        return this;
    }
    public PracticeFormPage currentAddressRandom(){
          currentAddress.sendKeys(faker.address().streetAddress());
          return this;
    }

    public PracticeFormPage openAPFPage() {
        driver.get(Constants.APF_URL);
        return this;
    }
}