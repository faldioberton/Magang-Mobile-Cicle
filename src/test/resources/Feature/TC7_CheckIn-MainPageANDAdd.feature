Feature: Check In - Main Page and Add Check In

  @FirstRelease
  Scenario: TC-75 Ensure user successfully use feature Check In
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In

  @Positive
  Scenario: TC-76 Ensure user successfully create new post check in with valid format and set to public
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user input field question
    And user choose the day want to ask question
    And user tag all member
    And user set time
    And user click button start collecting answer

  @Positive
  Scenario: TC-77 Ensure user successfully create new post check in with valid format and set to private
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user input field question
    And user choose the day want to ask question
    And user tag all member
    And user set time
    And user click button switch private
    And user click button start collecting answer

  @Positive
  Scenario: TC-78 Ensure user successfully input question with character and emoji
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user input field question with character and emoji
    And user choose the day want to ask question
    And user set time
    And user click button start collecting answer

  @Positive
  Scenario: TC-79 Ensure user successfully input every day to ask
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user input field question
    And user input every day to ask
    And user set time
    And user click button start collecting answer

  @Positive
  Scenario: TC-80 Ensure user successfully input three day to ask
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user input field question
    And user input three day to ask
    And user set time
    And user click button start collecting answer

  @Negative
  Scenario: TC-81 Ensure user failed create new post with null field question
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user choose the day want to ask question
    And user set time
    And user click button start collecting answer

  @Negative
  Scenario: TC-82 Ensure user failed create new post with not set the day to ask
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user input field question
    And user set time
    And user click button start collecting answer

  @Negative
  Scenario: TC-83 Ensure user failed create new post with not set the time
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user input field question
    And user choose the day want to ask question
    And user click button start collecting answer

  @Negative
  Scenario: TC-84 Ensure user failed create new post with no member to tag
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user input field question
    And user choose the day want to ask question
    And user set time
    And user click button start collecting answer

  @Negative
  Scenario: TC-85 Ensure user failed create new post with nothing to input
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user click button start collecting answer

  @Negative
  Scenario: TC-86 Ensure user failed input field question with only emoji
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user input field question with only emoji
    And user choose the day want to ask question
    And user set time
    And user click button start collecting answer

  @Negative
  Scenario: TC-87 Ensure user failed input question less than 5 character
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    Then user is on page Check In
    And user click button plus
    And user input field question less than 5 character
    And user choose the day want to ask question
    And user set time
    And user click button start collecting answer

  @Negative
  Scenario: TC-88 Ensure user failed create same posts
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Check In
    And user click button plus
    And user input field questions
    And user choose the day want to ask question
    And user tag all member
    And user set time
    And user click button start collecting answer
    And user click button plus
    And user input field questions
    And user choose the day want to ask question
    And user tag all member
    And user set time
    And user click button start collecting answer