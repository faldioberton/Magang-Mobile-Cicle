Feature: Create Company

  Scenario: TC-1 Ensure user successfully create new company
    Given user in page Home
    When user click Create New Company
    And user input field name
    And user input field description
    And user click create
    Then user successfully create company


  Scenario: TC-2 Ensure user failed create new company with null name and description
    Given user in page Home
    When user click Create New Company
    And user click create

