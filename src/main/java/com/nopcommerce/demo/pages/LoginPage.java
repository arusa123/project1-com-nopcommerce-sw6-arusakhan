package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkoutAsGuestButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement registerButton;

    public String getWelcomeText() {
        return welcomeMessage.getText();
    }

    public void enterEmailId(String userEmail) {
        log.info("email" + emailField.toString());
        sendTextToElement(emailField, userEmail);

    }

    public void enterPassword(String userPassword) {
        log.info("Password" + passwordField.toString());
        sendTextToElement(passwordField, userPassword);

    }

    public void clickOnLogInButton() {
        log.info("Login button" + loginButton.toString());
        clickOnElement(loginButton);

    }

    public String getErrorMessage() {
        log.info("Error message " + errorMessage.toString());

        return errorMessage.getText();
    }

    public void clickOnCheckoutAsGuestButton() {
        log.info("Guest checkout " + checkoutAsGuestButton.toString());
        clickOnElement(checkoutAsGuestButton);
    }

    public void clickOnRegisterButton() {
        log.info("Register button " + registerButton.toString());
        clickOnElement(registerButton);

    }
}
