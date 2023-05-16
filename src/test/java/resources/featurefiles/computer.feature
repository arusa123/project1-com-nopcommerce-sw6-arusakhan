Feature: Computer Test

  Background:
    Given  I am on homepage

  @sanity @regression
  Scenario: verify Product arranged in alphabeticalOrder
    When I click on Computers from topmenu
    And I click on Desktops
    And I change the sort by to Z-A
    Then I should be able to see the products in descending order

@smoke @regression
  Scenario: Verify product added to shopping cart successFully
    When I click on Computers from topmenu
    And I click on Desktops
    And I change the sort by to A-Z
    And I verify the products are arranged in ascending order
    And I click on build your computer options
    And I select processer
    And I select Ram
    And I select HDD
    And I select OS
    And I select software
    And I click on add to cart
    And I verify the price
    And I verify product has been added to shopping cart
    And I click on x from shopping cart link
    And I hover mouse on shopping cart link
    And I click on Go To Cart
    And I verify the Shopping cart text
    And I change the quantity to 2
    And I click on Update Shopping cart
    And I verify the total price
    And I click on terms and conditions
    And I click on continue button on Cart page
    And I verify the Welcome text
    And I click on Checkout AS GUEST tab
    And I enter "<Prime>" in the first name field
    And I enter "<Testing>" in the last name field
    And I enter "<prime>" in the email field
    And I select country "<United Kingdom>" from country filed
    And I enter "<London>" in the city field
    And I enter "<1 London Road>" in the address field
    And I enter "<LL1 LL2>" in the post code field
    And I enter "<02087687802>" in the phone field
    And I click on continue button
    And I click on Next Day Air radio button
    And I click on continue
    And I select credit card radio
    And I click on continue button payment on payment page
    And I select master card from dropdown
    And I enter the "<Prime>" in the cardholder name
    And I enter "<5425233430109903>" in the card number field
    And I select "<5>" from dropdown
    And I select "<2024> from dropdown"
    And I enter "<123>" in card code field
    And I click on continue payment page
    And I verify the Payment Method
    And I verify the Shipping Method
    And I verify the total
    And I click on confirm
    And I verify the Thank You text
    And I verify your order have been placed text
    And I click on continue after placing the order
    Then I verify i should be navigated back to homepage successfully








