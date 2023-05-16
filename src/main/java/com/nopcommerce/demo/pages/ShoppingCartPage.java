package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/input")
    WebElement quantityField;
    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCartButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary'][1]/strong")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termAndConditions;

    @CacheLookup
    @FindBy(name = "checkout")
    WebElement checkoutButton;


    public String getShoppingCartText() {
        log.info("shopping cart text"+ shoppingCartText.toString());
        return shoppingCartText.getText();
    }

    public void sendTextToQuantityField(String qty) {
        quantityField.clear();
        sendTextToElement(quantityField, qty);
    }

    public void clickOnUpdateCartButton() {
        log.info("Update cart " + updateCartButton.toString());
        clickOnElement(updateCartButton);
    }

    public String getTotalPrice() {
        log.info("Total price  " + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermAndConditions() {
        log.info("Terms and condition " + termAndConditions.toString());
        clickOnElement(termAndConditions);
    }

    public void clickOnCheckoutButton() {
        log.info("Checkout button" + checkoutButton.toString());
        clickOnElement(checkoutButton);
    }

    public String getQuantityInQtyField() {
        WebElement actualQuantity = quantityField;
        String actual = actualQuantity.getAttribute("value");
        log.info("Quantity " + quantityField.toString());

        return actual;
    }
}
