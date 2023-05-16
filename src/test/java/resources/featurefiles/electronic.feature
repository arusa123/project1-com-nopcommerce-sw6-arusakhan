Feature: Electronic Test

  Background:
    Given I am on homepage

  @sanity @regression
  Scenario: Verify user should navigate to cell phone pages successfully
    When I hover mouse on Electronics tab
    And I hover mouse on cell phone
    Then I verify cell phone text

  @smoke @regression
  Scenario: verify that the product added successfully and place order successfully
    When I hover mouse on Electronics tab
    And I hover mouse on cell phone
    Then I verify cell phone text
    And I click on list view tab
    And I click on product name Nokia Lumia 1020 link
    And I verify phone name text
    And I verify the price of the phone
    And I change the quantity 2
    And I click on add to cart tab on order page
    And I verify the added to cart text
    And I click on close add to cart message
    And I click on shopping cart link
    And I verify the total price of the phone
    And I click on checkbox terms and condition
    And I click on checkout button
    And I verify the welcome sign in text
    And I click on register
    And I verify the register text
    And I select gender
    And I enter "<Prime>" in the first name field RegisterPage
    And I enter "<Testing>" in the last name field RegisterPage
    And I select "<15>" from day of birth dropdown RegisterPage
    And I select "<5>" from month of birth dropdown RegisterPage
    And I select "<1990>" from year of birth dropdown RegisterPage
    And I enter "<prime@gmail.com>" in the email field RegisterPage
    And I enter "<pass123>" in the password field RegisterPage
    And I enter "<pass123>" in the confirm password field RegisterPage
    And I click on register button
    And I verify registration complete text
    And I click on continue tab
    And I verify shopping card text
    And I click on terms of service checkbox
    And I click on checkout
    And I select country "<United Kingdom>" from country filed
    And I enter "<London>" in the city field
    And I enter "<Oxford Street>" in the address field
    And I enter "<SE1 8NH>" in the post code field
    And I enter "<02086854375>" in the phone field
    And I click on continue to checkout button
    And I click on 2nd Day Air radio button
    And I click on contiune to delivery button
    And I click on credit card radio button
    And I click on continue to credit card payment option
    And I select visa payment option from dropdown
    And I enter "<5425233430109903>" in the card number field
    And I select "<7>" from expire month from dropdown
    And I select "<2025>" from expire year from dropdown
    And I enter "<893>" in card code field
    And I click on continue credit card button
    And I verify payment method text
    And I verify shipping method text
    And I verify the total price text
    And I click on confirm button
    And I verify the Thank You text after placing the order
    And I verify order placed text
    And I click on continue button after placing order
    And I verify store welcome text
    And I click on logout link
    Then I verify the url