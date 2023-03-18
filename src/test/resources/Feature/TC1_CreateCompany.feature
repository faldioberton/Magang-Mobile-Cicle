Feature: Create Company

  Scenario: Ensure user successfully create new company
    Given user in page Home
    When user click Create New Company
    And user input field name
    And user input field description
    And user click create
    Then user successfully create company


  Scenario: Ensure user failed create new company with null name and description
    Given user in page Home
    When user click Create New Company
    And user click create

