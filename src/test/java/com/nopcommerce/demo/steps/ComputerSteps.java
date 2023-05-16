package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerSteps {
    @When("^I click on Computers from topmenu$")
    public void iClickOnComputersFromTopmenu() {
        new TopMenuPage().selectMenu("Computers");

    }

    @And("^I click on Desktops$")
    public void iClickOnDesktops() {
        new CategoriesPage().selectCategory("Desktops");
    }

    @And("^I change the sort by to Z-A$")
    public void iChangeTheSortByToZA() {
        new ProductSelectionPage().selectSortByType("Name: Z to A");
    }

    @Then("^I should be able to see the products in descending order$")
    public void iShouldBeAbleToSeeTheProductsInDescendingOrder() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new ProductSelectionPage().afterSortingTheProducts(), new ProductSelectionPage().beforeSortTheProducts());

    }

    @And("^I change the sort by to A-Z$")
    public void iChangeTheSortByToAZ() {
        new ProductSelectionPage().selectSortByType("Name: A to Z");

    }

    @And("^I verify the products are arranged in ascending order$")
    public void iVerifyTheProductsAreArrangedInAscendingOrder() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new ProductSelectionPage().afterSortingTheProducts(), new ProductSelectionPage().beforeSortTheProducts());
    }

    @And("^I click on build your computer options$")
    public void iClickOnBuildYourComputerOptions() {
        new ProductSelectionPage().selectAddToCartProduct("Build your own computer");
    }

    @And("^I select processer$")
    public void iSelectProcesser() {
        new OrderPage().selectAProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
    }

    @And("^I select Ram$")
    public void iSelectRam() {
        new OrderPage().SelectARam("8GB [+$60.00]");
    }

    @And("^I select HDD$")
    public void iSelectHDD() {
        new OrderPage().clickAndSelectHDD();
    }

    @And("^I select OS$")
    public void iSelectOS() {
        new OrderPage().clickAndSelectOsPremium();
    }

    @And("^I select software$")
    public void iSelectSoftware() {
        new OrderPage().clickAndSelectTotalCommander();
    }


    @And("^I verify the price$")
    public void iVerifyThePrice() throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertEquals("error", "$1,475.00", new OrderPage().getPrice());
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new OrderPage().clickOnAddToCartButton();
    }

    @And("^I verify product has been added to shopping cart$")
    public void iVerifyProductHasBeenAddedToShoppingCart() {
        String shoppinText = "The product has been added to your shopping cart";
        Assert.assertEquals("incorrect text", shoppinText, new OrderPage().getMessageAfterAddingToCart());
    }

    @And("^I click on x from shopping cart link$")
    public void iClickOnXFromShoppingCartLink() {
        new OrderPage().clickOnCloseButtonOnMessage();
    }

    @And("^I hover mouse on shopping cart link$")
    public void iHoverMouseOnShoppingCartLink() {
        new HomePage().hoverMouseOverShoppingCartLink();
    }

    @And("^I click on Go To Cart$")
    public void iClickOnGoToCart() {
        new HomePage().clickOnGoToCartLink();
    }

    @And("^I verify the Shopping cart text$")
    public void iVerifyTheShoppingCartText() {
        Assert.assertEquals("incorrect text", "Shopping cart", new ShoppingCartPage().getShoppingCartText());
    }

    @And("^I change the quantity to (\\d+)$")
    public void iChangeTheQuantityTo(int quantity) {
        new ShoppingCartPage().sendTextToQuantityField("2");
    }

    @And("^I click on Update Shopping cart$")
    public void iClickOnUpdateShoppingCart() {
        new ShoppingCartPage().clickOnUpdateCartButton();
    }

    @And("^I verify the total price$")
    public void iVerifyTheTotalPrice() {
        Assert.assertEquals("incorrect price", "$2,950.00", new ShoppingCartPage().getTotalPrice());
    }

    @And("^I click on terms and conditions$")
    public void iClickOnTermsAndConditions() {
        new ShoppingCartPage().clickOnTermAndConditions();
    }

    @And("^I click on continue button on Cart page$")
    public void iClickOnContinueButtonOnCartPage() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @And("^I verify the Welcome text$")
    public void iVerifyTheWelcomeText() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("incorrect Text", "Welcome, Please Sign In!", new LoginPage().getWelcomeText());
    }

    @And("^I click on Checkout AS GUEST tab$")
    public void iClickOnCheckoutASGUESTTab() {
        new LoginPage().clickOnCheckoutAsGuestButton();
    }

    @And("^I enter \"([^\"]*)\" in the first name field$")
    public void iEnterInTheFirstNameField(String firstName) {
        new CheckOutPage().sendTextToFirstNameField("Prime");

    }

    @And("^I enter \"([^\"]*)\" in the last name field$")
    public void iEnterInTheLastNameField(String lastName) {
        new CheckOutPage().sendTextToLastNameField("Testing");

    }

    @And("^I enter \"([^\"]*)\" in the email field$")
    public void iEnterInTheEmailField(String email) {
        new CheckOutPage().sendTextTOEmailField("prime");

    }

    @And("^I select country \"([^\"]*)\" from country filed$")
    public void iSelectCountryFromCountryFiled(String UK) {
        new CheckOutPage().selectACountryInCountryField("United Kingdom");

    }

    @And("^I enter \"([^\"]*)\" in the city field$")
    public void iEnterInTheCityField(String city) {
        new CheckOutPage().sendTextToCityField("London");

    }

    @And("^I enter \"([^\"]*)\" in the address field$")
    public void iEnterInTheAddressField(String address) {
        new CheckOutPage().sendTextToAddressField("1 London Road ");

    }

    @And("^I enter \"([^\"]*)\" in the post code field$")
    public void iEnterInThePostCodeField(String postCode) {
        new CheckOutPage().sendTextToPostCodeField("LL1 LL2");

    }

    @And("^I enter \"([^\"]*)\" in the phone field$")
    public void iEnterInThePhoneField(String phoneNumb) {
        new CheckOutPage().sendTextToPhoneField("02089856920");

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinueButtonCheckout();
    }

    @And("^I click on Next Day Air radio button$")
    public void iClickOnNextDayAirRadioButton() {
        new CheckOutPage().clickOnNextDayAirDelivery();
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new CheckOutPage().clickOnContinueButtonDelivery();
    }

    @And("^I select credit card radio$")
    public void iSelectCreditCardRadio() {
        new CheckOutPage().clickOnCreditCardPaymentMethod();
    }


    @And("^I select master card from dropdown$")
    public void iSelectMasterCardFromDropdown() {
        new CheckOutPage().selectCreditCard(1);
    }

    @And("^I click on continue button payment on payment page$")
    public void iClickOnContinueButtonPaymentOnPaymentPage() {
        new CheckOutPage().clickOnContinueButtonPayment();
    }

    @And("^I enter the \"([^\"]*)\" in the cardholder name$")
    public void iEnterTheInTheCardholderName(String namee) {
        new CheckOutPage().sendTextToCardholderNameField("Prime");

    }

    @And("^I enter \"([^\"]*)\" in the card number field$")
    public void iEnterInTheCardNumberField(String cardnum) {
        new CheckOutPage().sendTextToCardNumberField("5425233430109903");

    }

    @And("^I select \"([^\"]*)\" from dropdown$")
    public void iSelectFromDropdown(String expiryMonth) {
        new CheckOutPage().selectExpiryMonth("5");
    }

    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String expiryYear) {
        new CheckOutPage().selectExpiryYear("2024");

    }

    @And("^I enter \"([^\"]*)\" in card code field$")
    public void iEnterInCardCodeField(String cardCode) {
        new CheckOutPage().sendTextToCardCodeField("123");

    }

    @And("^I click on continue payment page$")
    public void iClickOnContinuePaymentPage() {
        new CheckOutPage().clickOnContinueButtonCreditCard();
    }

    @And("^I verify the Payment Method$")
    public void iVerifyThePaymentMethod() {
        Assert.assertEquals("incorrect payment method", "Payment Method: Credit Card", new CheckOutPage().getPaymentMethodText());
    }

    @And("^I verify the Shipping Method$")
    public void iVerifyTheShippingMethod() {
        Assert.assertEquals("incorrect shipping method", "Shipping Method: Next Day Air", new CheckOutPage().getDeliveryMethodText());
    }

    @And("^I verify the total$")
    public void iVerifyTheTotal() {
        Assert.assertEquals("incorrect Total", "$2,950.00", new CheckOutPage().getTotalPriceText());
    }

    @And("^I click on confirm$")
    public void iClickOnConfirm() {
        new CheckOutPage().clickOnConfirmButton();
    }

    @And("^I verify the Thank You text$")
    public void iVerifyTheThankYouText() {
        Assert.assertEquals("Incorrect message", "Thank you", new CheckOutPage().getThankYouTextAfterOrderConfirmation());
    }

    @And("^I verify your order have been placed text$")
    public void iVerifyYourOrderHaveBeenPlacedText() {
        Assert.assertEquals("order not processed", "Your order has been successfully processed!", new CheckOutPage().getOrderProcessedSuccessfullyTextAfterOrderConfirmation());
    }

    @And("^I click on continue after placing the order$")
    public void iClickOnContinueAfterPlacingTheOrder() {
        new CheckOutPage().clickOnContinueButtonOnThankYouNote();
    }

    @Then("^I verify i should be navigated back to homepage successfully$")
    public void iVerifyIShouldBeNavigatedBackToHomepageSuccessfully() {
        Assert.assertEquals("not navigated to homePage", "Welcome to our store", new HomePage().getWelcomeTextMessage());
    }

}
