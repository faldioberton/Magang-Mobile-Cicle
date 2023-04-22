Feature: Edit Blast & Archive Blast

  @FirstRelease
  Scenario: TC-49 Ensure user successfully use feature edit Blast
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user click vertikal icon
    And user click button edit
    Then user is on page Edit

  @Positive
  Scenario: TC-50 Ensure user successfully edit date
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user click vertikal icon
    And user click button edit
    And user click icon due dates
    And user input due date tommorow
    And user click button ok
    And user click ok
    And user scroll down
    Then user click button publish changes

  @Positive
  Scenario: TC-51 Ensure user successfully edit and add file picture
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user click vertikal icon
    And user click button edit
    And user scroll down
    And user click field description
    And user click icon attach file
    And user click button allow
    And user choose one file picture
    And user click field description
    And user scroll down
    Then user click button publish changes

  @Positive
  Scenario: TC-52 Ensure user successfully archive blast
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user click vertikal icon
    And user click button archive
    And user click Ok to delete

  @Negative
  Scenario: TC-53 Ensure user failed archive blast
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user click vertikal icon
    And user click button archive
    And user click cancel to not delete post

