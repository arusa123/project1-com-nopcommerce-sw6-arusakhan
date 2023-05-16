package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoriesPage extends Utility {
    private static final Logger log = LogManager.getLogger(CategoriesPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']/child::*")
    List<WebElement> categoriesList;

    public void selectCategory(String cat) {

        List<WebElement> catList = categoriesList;
        try {
            for (WebElement list : catList) {
                if (list.getText().equalsIgnoreCase(cat)) {
                    list.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            catList = categoriesList;
        }
    }
}
