package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailIdField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;

    @CacheLookup
    @FindBy(name = "BillingNewAddress.City")
    WebElement cityField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement telephoneNoField;
    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButtonCheckout;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayDelivery;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement nextSecondDayDelivery;
    @CacheLookup
    @FindBy(xpath = "//button[@class ='button-1 shipping-method-next-step-button']")
    WebElement continueButtonDelivery;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButtonPayment;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectCreditCardFiled;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardholderNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberFiled;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expiryMonthFiled;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expiryYearFiled;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeFiled;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButtonCreditCard;

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement paymentMethodText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethod;

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]")
    WebElement totalFinalPrice;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement orderProcessedMessage;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButtonOnThankYouNote;

    public void sendTextToFirstNameField(String fName) {
        log.info("first name " + firstNameField.toString());
        sendTextToElement(firstNameField, fName);
    }

    public void sendTextToLastNameField(String lName) {
        log.info("Last name " + lastNameField.toString());
        sendTextToElement(lastNameField, lName);
    }

    public void sendTextTOEmailField(String gEmail) {
        log.info("Email field " + emailIdField.toString());
        sendTextToElement(emailIdField, gEmail + randomNumbers(1000) + "@gmail.com");
    }

    public void sendTextToCityField(String gCity) {
        sendTextToElement(cityField, gCity);

       log.info("city name " + cityField.toString());
    }

    public void selectACountryInCountryField(String gCountry) {

        log.info("Country name " + countryField.toString());
        selectByVisibleTextFromDropDown(countryField, gCountry);
    }

    public void sendTextToAddressField(String gAddress) {
        sendTextToElement(addressField, gAddress);

        log.info("city name " + cityField.toString());
    }

    public void sendTextToPostCodeField(String gPostCode) {

        log.info("Post Code " + postCodeField.toString());
        sendTextToElement(postCodeField, gPostCode);
    }


    public void sendTextToPhoneField(String gtele) {
        log.info("contact number " + cityField.toString());
        sendTextToElement(telephoneNoField, gtele);
    }

    public void clickOnContinueButtonCheckout() {
        log.info("continue " + continueButtonCheckout.toString());
        clickOnElement(continueButtonCheckout);
    }

    public void clickOnNextDayAirDelivery() {
        log.info("Next day delivery " + nextDayDelivery.toString());
        clickOnElement(nextDayDelivery);
    }

    public void clickOnSecondDayAirDelivery() {
        log.info("Second day delivery " + nextSecondDayDelivery.toString());
        clickOnElement(nextSecondDayDelivery);
    }

    public void clickOnContinueButtonDelivery() {
        log.info("continue button " + continueButtonDelivery.toString());
        clickOnElement(continueButtonDelivery);
    }

    public void clickOnCreditCardPaymentMethod() {
        log.info("credit card payment method " + creditCardPaymentMethod.toString());
        clickOnElement(creditCardPaymentMethod);
    }

    public void clickOnContinueButtonPayment() {
        log.info("contiune button " + continueButtonPayment.toString());
        clickOnElement(continueButtonPayment);
    }

    public void selectCreditCard(int cCard) {

        log.info("payment method " + selectCreditCardFiled.toString());
        selectByIndexFromDropDown(selectCreditCardFiled, cCard);
    }

    public void sendTextToCardholderNameField(String cardholder) {
        log.info("Card holder name " + cardholderNameField.toString());
        sendTextToElement(cardholderNameField, cardholder);
    }

    public void sendTextToCardNumberField(String cardNumber) {
        log.info("card number " + cardNumberFiled.toString());
        sendTextToElement(cardNumberFiled, cardNumber);

    }

    public void selectExpiryMonth(String month) {
        log.info("Expiry month " + expiryMonthFiled.toString());
        selectByValueFromDropDown(expiryMonthFiled, month);

    }

    public void selectExpiryYear(String year) {
       log.info("Expiry year " + expiryYearFiled.toString());
        selectByValueFromDropDown(expiryYearFiled, year);

    }

    public void sendTextToCardCodeField(String cardCode) {
        log.info("card code " + cardCodeFiled.toString());
        sendTextToElement(cardCodeFiled, cardCode);

    }

    public void clickOnContinueButtonCreditCard() {
       log.info("continue with payment " + continueButtonCreditCard.toString());
        clickOnElement(continueButtonCreditCard);
    }

    public String getPaymentMethodText() {
       log.info("continue with payment " + continueButtonCreditCard.toString());
        return paymentMethodText.getText();
    }

    public String getDeliveryMethodText() {
        log.info("shipping method " + shippingMethod.toString());
        return shippingMethod.getText();
    }

    public String getTotalPriceText() {
        log.info("Total price text " + totalFinalPrice.toString());
        return totalFinalPrice.getText();
    }

    public void clickOnConfirmButton() {
        log.info("confirm button " + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String getThankYouTextAfterOrderConfirmation() {
        log.info("Thank you text " + thankYouText.toString());
        return thankYouText.getText();
    }

    public String getOrderProcessedSuccessfullyTextAfterOrderConfirmation() {
        log.info("Order processed " + orderProcessedMessage.toString());
        return orderProcessedMessage.getText();
    }

    public void clickOnContinueButtonOnThankYouNote() {
        log.info("thank you " + continueButtonOnThankYouNote.toString());
        clickOnElement(continueButtonOnThankYouNote);
    }

}
