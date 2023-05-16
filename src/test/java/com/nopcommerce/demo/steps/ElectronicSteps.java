package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectronicSteps {
    @When("^I hover mouse on Electronics tab$")
    public void iHoverMouseOnElectronicsTab() {
        new TopMenuPage().hoverOverMenu("Electronics");
    }

    @And("^I hover mouse on cell phone$")
    public void iHoverMouseOnCellPhone() throws InterruptedException {
        new TopMenuPage().selectMenu("Cell phones");
    }


    @Then("^I verify cell phone text$")
    public void iVerifyCellPhoneText() {
        Assert.assertEquals("incorrect message", "Cell phones", new TopMenuPage().textOnEachPage());
    }


    @And("^I click on list view tab$")
    public void iClickOnListViewTab() {
        new ProductSelectionPage().clickOnListViewIcon();
    }

    @And("^I click on product name Nokia Lumia (\\d+) link$")
    public void iClickOnProductNameNokiaLumiaLink(String phone) throws InterruptedException {
        Thread.sleep(1500);
        new ProductSelectionPage().clickOnNokiaLumia();
    }

    @And("^I verify phone name text$")
    public void iVerifyPhoneNameText() {
        Assert.assertEquals("incorrect phone", "Nokia Lumia 1020", new OrderPage().getProductName());
    }

    @And("^I verify the price of the phone$")
    public void iVerifyThePriceOfThePhone() {
        Assert.assertEquals("wrong price", "$349.00", new OrderPage().getPrice());
    }

    @And("^I change the quantity (\\d+)$")
    public void iChangeTheQuantity(int qty) {
        new OrderPage().sentTextToQuantityField("2");
    }

    @And("^I click on add to cart tab on order page$")
    public void iClickOnAddToCartTabOnOrderPage() {
        new OrderPage().clickOnAddToCartButton();
    }

    @And("^I verify the added to cart text$")
    public void iVerifyTheAddedToCartText() {
        String nameText = "The product has been added to your shopping cart";
        Assert.assertEquals("error", nameText, new OrderPage().getMessageAfterAddingToCart());

    }

    @And("^I click on close add to cart message$")
    public void iClickOnCloseAddToCartMessage() {
        new OrderPage().clickOnCloseButtonOnMessage();
    }

    @And("^I click on shopping cart link$")
    public void iClickOnShoppingCartLink() {
        new HomePage().hoverMouseOverShoppingCartLink();
        new HomePage().clickOnGoToCartLink();
    }


    @And("^I verify the total price of the phone$")
    public void iVerifyTheTotalPriceOfThePhone() {
        new ShoppingCartPage().getTotalPrice();
    }


    @And("^I click on checkbox terms and condition$")
    public void iClickOnCheckboxTermsAndCondition() {
        new ShoppingCartPage().clickOnTermAndConditions();
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @And("^I verify the welcome sign in text$")
    public void iVerifyTheWelcomeSignInText() {
        Assert.assertEquals("error", "Welcome, Please Sign In!", new LoginPage().getWelcomeText());
    }

    @And("^I click on register$")
    public void iClickOnRegister() {
        new LoginPage().clickOnRegisterButton();
    }

    @And("^I verify the register text$")
    public void iVerifyTheRegisterText() {
        Assert.assertEquals("incorrect message", "Register", new RegisterPage().getRegisterPageText());
    }

    @And("^I select gender$")
    public void iSelectGender() {
        new RegisterPage().selectGenderOnRegistrationPage("Male");
    }

    @And("^I enter \"([^\"]*)\" in the first name field RegisterPage$")
    public void iEnterInTheFirstNameFieldRegisterPage(String firstNme) {
        new RegisterPage().sendTextToFirstNameField("Prime");

    }

    @And("^I enter \"([^\"]*)\" in the last name field RegisterPage$")
    public void iEnterInTheLastNameFieldRegisterPage(String lastName) {
        new RegisterPage().sendTextToLastNameField("Testing");

    }

    @And("^I select \"([^\"]*)\" from day of birth dropdown RegisterPage$")
    public void iSelectFromDayOfBirthDropdownRegisterPage(String dateBirth) {
        new RegisterPage().selectDayOfBirth("15");

    }

    @And("^I select \"([^\"]*)\" from month of birth dropdown RegisterPage$")
    public void iSelectFromMonthOfBirthDropdownRegisterPage(String birthMonth) {
        new RegisterPage().selectDayOfMonth("5");
    }

    @And("^I select \"([^\"]*)\" from year of birth dropdown RegisterPage$")
    public void iSelectFromYearOfBirthDropdownRegisterPage(String birthYear) {
        new RegisterPage().selectDayOfYear("1990");
    }

    @And("^I enter \"([^\"]*)\" in the email field RegisterPage$")
    public void iEnterInTheEmailFieldRegisterPage(String email) {
        new RegisterPage().sendTextToEmailField("prime");

    }

    @And("^I enter \"([^\"]*)\" in the password field RegisterPage$")
    public void iEnterInThePasswordFieldRegisterPage(String password) {
        new RegisterPage().sendTextToPasswordField("prime123");

    }

    @And("^I enter \"([^\"]*)\" in the confirm password field RegisterPage$")
    public void iEnterInTheConfirmPasswordFieldRegisterPage(String confirmpass) {
        new RegisterPage().sendTextToConfirmPasswordField("prime123");
    }


    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();

    }

    @And("^I verify registration complete text$")
    public void iVerifyRegistrationCompleteText() {
        Assert.assertEquals("incorrect message", "Register", new RegisterPage().getRegisterPageText());
    }

    @And("^I click on continue tab$")
    public void iClickOnContinueTab() {
        new RegisterPage().clickOnContinueButtonAfterRegistrationComplete();
    }

    @And("^I verify shopping card text$")
    public void iVerifyShoppingCardText() {
        Assert.assertEquals("incorrect text", "Shopping cart", new ShoppingCartPage().getShoppingCartText());
    }

    @And("^I click on terms of service checkbox$")
    public void iClickOnTermsOfServiceCheckbox() {
        new ShoppingCartPage().clickOnTermAndConditions();
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
        new ShoppingCartPage().clickOnCheckoutButton();

        //country details and city details missing
    }

    @And("^I click on continue to checkout button$")
    public void iClickOnContinueToCheckoutButton() {

    }


    @And("^I click on (\\d+)nd Day Air radio button$")
    public void iClickOnNdDayAirRadioButton() {
        new CheckOutPage().clickOnSecondDayAirDelivery();

    }

    @And("^I click on contiune to delivery button$")
    public void iClickOnContiuneToDeliveryButton() {
        new CheckOutPage().clickOnContinueButtonDelivery();
    }

    @And("^I click on credit card radio button$")
    public void iClickOnCreditCardRadioButton() {
        new CheckOutPage().clickOnCreditCardPaymentMethod();
    }

    @And("^I click on continue to credit card payment option$")
    public void iClickOnContinueToCreditCardPaymentOption() {
        new CheckOutPage().clickOnContinueButtonPayment();
    }

    @And("^I select visa payment option from dropdown$")
    public void iSelectVisaPaymentOptionFromDropdown() {
        new CheckOutPage().selectCreditCard(0);
    }

    @And("^I select \"([^\"]*)\" from expire month from dropdown$")
    public void iSelectFromExpireMonthFromDropdown(String expireMonth) {
        new CheckOutPage().sendTextToCardholderNameField("7");
    }

    @And("^I select \"([^\"]*)\" from expire year from dropdown$")
    public void iSelectFromExpireYearFromDropdown(String expireYear) {
        new CheckOutPage().selectExpiryYear("2025");
    }

    @And("^I click on continue credit card button$")
    public void iClickOnContinueCreditCardButton() {
        new CheckOutPage().clickOnContinueButtonCreditCard();
    }

    @And("^I verify payment method text$")
    public void iVerifyPaymentMethodText() {
        Assert.assertEquals("incorrect payment", "Payment Method: Credit Card", new CheckOutPage().getPaymentMethodText());
    }

    @And("^I verify shipping method text$")
    public void iVerifyShippingMethodText() {
        Assert.assertEquals("incorrect shipping type", "Shipping Method: 2nd Day Air", new CheckOutPage().getDeliveryMethodText());
    }

    @And("^I verify the total price text$")
    public void iVerifyTheTotalPriceText() {
        Assert.assertEquals("incorrect Price", "$698.00", new CheckOutPage().getTotalPriceText());
    }

    @And("^I click on confirm button$")
    public void iClickOnConfirmButton() {
        new CheckOutPage().clickOnConfirmButton();
    }

    @And("^I verify the Thank You text after placing the order$")
    public void iVerifyTheThankYouTextAfterPlacingTheOrder() {
        Assert.assertEquals("Incorrect message", "Thank You", new CheckOutPage().getThankYouTextAfterOrderConfirmation());
    }

    @And("^I verify order placed text$")
    public void iVerifyOrderPlacedText() {
        Assert.assertEquals("incorrect text", "Your order has been successfully processed!", new CheckOutPage().getOrderProcessedSuccessfullyTextAfterOrderConfirmation());
    }

    @And("^I click on continue button after placing order$")
    public void iClickOnContinueButtonAfterPlacingOrder() {
        new CheckOutPage().clickOnContinueButtonOnThankYouNote();
    }

    @And("^I verify store welcome text$")
    public void iVerifyStoreWelcomeText() {
        Assert.assertEquals("incorrect message", "Welcome to our store", new HomePage().getWelcomeTextMessage());
    }

    @And("^I click on logout link$")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("^I verify the url$")
    public void iVerifyTheUrl() {
        Assert.assertEquals("incorrect url", "https://demo.nopcommerce.com/", new HomePage().currentUrl());
    }

}

