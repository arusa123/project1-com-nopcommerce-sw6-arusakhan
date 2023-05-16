package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenuPage extends Utility {
    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']//ul/child::*")
    List<WebElement> topMenuBar;

    @CacheLookup
    @FindBy(css = "div.page-title")
    WebElement pageTitles;
    // By pageTitles = By.cssSelector("div.page-title");

    //This method will choose the options from main menu
    public void selectMenu(String menu) {
        log.info("Top menu");
        List<WebElement> topMenuList = topMenuBar;
        try {
            for (WebElement list : topMenuList) {
                if (list.getText().equalsIgnoreCase(menu)) {
                    list.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuBar;
        }
    }

    public void hoverOverMenu(String mMenu) {
        Actions actions = new Actions(driver);
        List<WebElement> topMenuList = topMenuBar;
        try {
            for (WebElement list : topMenuList) {
                if (list.getText().equalsIgnoreCase(mMenu)) {
                    actions.moveToElement(list).build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuBar;
        }
    }

    //This method will return title of each page for verification purpose
    public String textOnEachPage() {
        log.info("gettig title of each page"+ pageTitles.toString());
        return pageTitles.getText();
    }
}
