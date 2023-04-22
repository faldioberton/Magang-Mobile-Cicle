Feature: Check In - Edit & Archive Feature

  @FirstRelease
  Scenario: TC-89 Ensure user successfully use feature edit
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis
    And user click button Edit
    Then user is on page Edit Check In

  @Positive
  Scenario: TC-90 Ensure user successfully changed question
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis
    And user click button Edit
    And user change to new question in field question
    Then user click save changes

  @Positive
  Scenario: TC-91 Ensure user successfully changed time
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis
    And user click button Edit
    And user click set time
    And user click switch
    And user set hours
    And user set minutes
    And user click button okks
    Then user click save changes

  @Positive
  Scenario: TC-92 Ensure user successfully changed day to ask
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis
    And user click button Edit
    And user change the day want to ask
    Then user click save changes

  @Positive
  Scenario: TC-93 Ensure user successfully archive post
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis
    And user click button Archive
    Then user click yes

  @Negative
  Scenario: TC-94 Ensure user failed archive post
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis
    And user click button Archive
    Then user click Cancel
