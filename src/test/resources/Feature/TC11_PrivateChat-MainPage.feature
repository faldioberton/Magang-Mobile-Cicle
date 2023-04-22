Feature: Private Chat - Main Page

  @FirstRelease
  Scenario: TC-106 Ensure user successfully use feature private chat
    Given user in page Home
    When user open ones company
    Then user in page Company
    When user click button Menu
    And user click button Inbox
    And user click button add chat
    Then user choose member want to chat

  @Positive
  Scenario: TC-107 Ensure user successfully send private chat
    Given user in page Home
    When user open ones company
    Then user in page Company
    When user click button Menu
    And user click button Inbox
    And user click button add chat
    And user choose member want to chat
    And user click field type message
    And user click button send

  @Positive
  Scenario: TC-108 Ensure user successfully tag member by private chat
    Given user in page Home
    When user open ones company
    Then user in page Company
    When user click button Menu
    And user click button Inbox
    And user click button add chat
    And user choose member want to chat
    And user click field message
    And user click icon tag
    And user click member want to add
    And user click button send

  @Positive
  Scenario: TC-109 Ensure user successfully attach file by private chat
    Given user in page Home
    When user open ones company
    Then user in page Company
    When user click button Menu
    And user click button Inbox
    And user click button add chat
    And user choose member want to chat
    And user click field message
    And user click button attach file
    And user click button image from Gallery
    And user choose image from gallery

  @Negative
  Scenario: TC-110 Ensure user failed send chat with null message
    Given user in page Home
    When user open ones company
    Then user in page Company
    When user click button Menu
    And user click button Inbox
    And user click button add chat
    And user choose member want to chat
    And user click button send