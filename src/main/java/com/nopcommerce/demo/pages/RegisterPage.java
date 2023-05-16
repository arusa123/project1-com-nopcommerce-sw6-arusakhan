package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-fields']/div[1]/div/span[1]")
    WebElement maleGenderButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='form-fields']/div[1]/div/span[2]")
    WebElement femaleGenderButton;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dateOfBirthMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement dateOfBirthYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailId;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationSuccessfulText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonAfterRegistrationComplete;


    public String getRegisterPageText() {
        log.info("Register text " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void selectGenderOnRegistrationPage(String gender) {

        if (gender.equalsIgnoreCase("Male")) {
            clickOnElement(maleGenderButton);
        } else if (gender.equalsIgnoreCase("Female")) {
            clickOnElement(femaleGenderButton);
        }

    }

    public void sendTextToFirstNameField(String fName) {
        log.info("First name " + firstNameField.toString());
        sendTextToElement(firstNameField, fName);
    }

    public void sendTextToLastNameField(String lName) {
        log.info("last name " + lastNameField.toString());
        sendTextToElement(lastNameField, lName);
    }

    public void selectDayOfBirth(String day) {
        log.info("First name " + dateOfBirthDay.toString());
        selectByValueFromDropDown(dateOfBirthDay, day);
    }

    public void selectDayOfMonth(String month) {
        log.info("Month of birth " + dateOfBirthMonth.toString());
        selectByValueFromDropDown(dateOfBirthMonth, month);
    }

    public void selectDayOfYear(String year) {
        log.info("Year of birth " + dateOfBirthYear.toString());
        selectByValueFromDropDown(dateOfBirthYear, year);

    }

    public void sendTextToEmailField(String email) {
        log.info("Email " + emailId.toString());
        sendTextToElement(emailId, email + randomNumbers(1000) + "@gmail.com");

    }

    public void sendTextToPasswordField(String rPassword) {
        log.info("password " + password.toString());
        sendTextToElement(password, rPassword);
    }

    public void sendTextToConfirmPasswordField(String cPassword) {
        log.info("confirm password " + confirmPassword.toString());
        sendTextToElement(confirmPassword, cPassword);
    }

    public void clickOnRegisterButton() {
        log.info("Register button " + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String getRegistrationSuccessfulText() {
        log.info("Registration successful " + registrationSuccessfulText.toString());
        return getTextFromElement(registrationSuccessfulText);
    }

    public void clickOnContinueButtonAfterRegistrationComplete() {
        log.info(" continue aftetr Registration " + continueButtonAfterRegistrationComplete.toString());
        clickOnElement(continueButtonAfterRegistrationComplete);
    }
}
