package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.TopMenuPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TopMenuSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on \"([^\"]*)\" link$")
    public void iClickOnLink(String subMenu) {
        new TopMenuPage().selectMenu(subMenu);

    }

    @Then("^I should navigate to \"([^\"]*)\" successfully$")
    public void iShouldNavigateToSuccessfully(String selectedPage) {
    }
}
