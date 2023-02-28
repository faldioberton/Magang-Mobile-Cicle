Feature: Blast

  @Positive
  Scenario: Ensure user create new list
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team