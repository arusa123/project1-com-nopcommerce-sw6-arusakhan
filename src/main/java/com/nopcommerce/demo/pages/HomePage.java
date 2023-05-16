package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //Adding all the elements on homepage
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(id = "small-searchterms")
    WebElement searchStore;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartLink;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeTextMessage;

    public void clickOnLoginLink() {

        log.info("Login link " + loginLink.toString());
        clickOnElement(loginLink);

    }

    public void clickOnRegisterLink() {
        log.info("Register link " + loginLink.toString());
        clickOnElement(registerLink);

    }

    public void enterTextInSearchStoreField(String searchProduct) {
        log.info("Search store " + searchStore.toString());
        sendTextToElement(searchStore, searchProduct);

    }

    public void hoverMouseOverShoppingCartLink() {
        log.info("Shopping cart " + shoppingCartLink.toString());
        mouseHoverToElement(shoppingCartLink);

    }

    public void clickOnGoToCartLink() {
        log.info("Search store " + goToCartLink.toString());
        clickOnElement(goToCartLink);
    }

    public String getWelcomeTextMessage() {
        log.info("Welcome text " + welcomeTextMessage.toString());
        return welcomeTextMessage.getText();
    }

    public void clickOnLogOutLink() {
        log.info("Logout link " + logoutLink.toString());
        clickOnElement(logoutLink);


    }

    public String currentUrl() {
        String url = driver.getCurrentUrl();
        log.info("current url " + url.toString());
        return url;
    }

}
