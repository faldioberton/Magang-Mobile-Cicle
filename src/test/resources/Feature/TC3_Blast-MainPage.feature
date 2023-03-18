Feature: Blast

  @Positive
  Scenario: Ensure user create new list
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Blast
    And user create new post
    And user input title
    And user input description
    And user click switch to public or private
    And user click publish