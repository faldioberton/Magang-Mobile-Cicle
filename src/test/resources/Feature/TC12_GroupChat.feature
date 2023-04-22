Feature: Group Chat - Main Page

  @FirstRelease
  Scenario: TC-111 Ensure user successfully use feature Group Chat
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click Group Chat
    Then user in page Group Chat

  @Positive
  Scenario: TC-112 Ensure user successfully send message in Group Chat
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click Group Chat
    And user click field type mesage
    And user ad coment in field type mesage
    And user click send

  @Positive
  Scenario: TC-113 Ensure user successfully attach image from gallery in Group chat
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click Group Chat
    And user click field type mesage
    And user click button attach
    And user click button image from galery
    And user choose image to send

  @Positive
  Scenario: TC-114 Ensure user successfully attach image from camera in Group chat
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click Group Chat
    And user click field type mesage
    And user click button attach
    And user click button image from camera
    And user click button tap
    And user click ceklist

  @Positive
  Scenario: TC-115 Ensure user successfully attach document from document & video in Group chat
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click Group Chat
    And user click field type mesage
    And user click button attach
    And user click button document and video
    And user click button alow
    And user choose document
    And user choose one file to upload

  @Negative
  Scenario: TC-116 Ensure user failed send null message in Group Chat
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click Group Chat
    And user click field type mesage



