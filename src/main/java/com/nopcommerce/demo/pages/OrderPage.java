package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends Utility {
    private static final Logger log = LogManager.getLogger(OrderPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']/h1")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement selectHDD400GB;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement selectVistaPremium;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement selectTotalCommander;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']")
    WebElement price;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantityField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 add-to-cart-button']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement messageAfterAddingToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeButtonOnMessage;


    public String getProductName() {
        log.info("Product name " + productName.toString());
        return getTextFromElement(productName);
    }

    public void selectAProcessor(String process) {
        log.info("select Processor " + selectProcessor.toString());
        selectByVisibleTextFromDropDown(selectProcessor, process);

    }

    public void SelectARam(String ram) {
        log.info("select ram " + selectRam.toString());
        selectByVisibleTextFromDropDown(selectRam, ram);

    }

    public void clickAndSelectHDD() {
        log.info("select HDD " + selectHDD400GB.toString());
        clickOnElement(selectHDD400GB);

    }

    public void clickAndSelectOsPremium() {
        log.info("select vista premium " + selectVistaPremium.toString());
        clickOnElement(selectVistaPremium);

    }

    public void clickAndSelectTotalCommander() {
        log.info("select total commander " + selectTotalCommander.toString());
        clickOnElement(selectTotalCommander);

    }

    public String getPrice() {
        log.info("get price " + price.toString());

        return getTextFromElement(price);
    }

    public void clickOnAddToCartButton() {
        log.info("add To Cart Button " + addToCartButton.toString());
        clickOnElement(addToCartButton);

    }

    public String getMessageAfterAddingToCart() {
        log.info("Message After Adding To Cart " + messageAfterAddingToCart.toString());
        return getTextFromElement(messageAfterAddingToCart);
    }

    public void clickOnCloseButtonOnMessage() {
        log.info("Close Button On Message " + closeButtonOnMessage.toString());
        clickOnElement(closeButtonOnMessage);

    }

    public void sentTextToQuantityField(String qty) {
        log.info("Send text to quantity " + quantityField.toString());
        quantityField.clear();
        sendTextToElement(quantityField, qty);
    }

}
