Feature: Search functionality

  Scenario: User searches for a valid product
    Given User is on the Home page
    When User enters valid product "HP" in the search box field
    And User clicks on Search button
    Then User should get valid products displayed in search results

  Scenario: User searches for an invalid product
    Given User is on the Home page
    When User enters invalid product "Dell" in the search box field
    And User clicks on Search button
    Then User should get proper message about no product matching

  Scenario: User searches without any product
    Given User is on the Home page
    When User does not enter any product in the search box field
    And User clicks on Search button
    Then User should get proper message about no product matching
