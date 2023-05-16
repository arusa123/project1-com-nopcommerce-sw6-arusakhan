Feature: Topmenu Test

  @sanity @regression
  Scenario Outline: Verify that user can select different menu from top menu
    Given I am on homepage
    When I click on "<submenu>" link
    Then I should navigate to "<selected page>" successfully
    Examples:
      | submenu           | selected page     |
      | Computers         | Computers         |
      | Electronics       | Electronics       |
      | Apparel           | Apparel           |
      | Digital downloads | Digital downloads |
      | Books             | Books             |
      | Jewelry           | Jewelry           |
      | Gift Cards        | Gift Cards        |

