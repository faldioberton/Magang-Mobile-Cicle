Feature: Create Team

  @Positive
  Scenario: Ensure user successfully create new team
    Given user in page Home
    When user open ones company
    Then user in page Company
    When user click icon plus
    And user click add new team
    And user input field_name
    And user input field_description
    And user click create button
    Then user successfully create team

  @Negative
  Scenario: Ensure user failed create new team with null name and description
    Given user in page Home
    When user open ones company
    Then user in page Company
    When user click icon plus
    And user click add new team
    And user click create button