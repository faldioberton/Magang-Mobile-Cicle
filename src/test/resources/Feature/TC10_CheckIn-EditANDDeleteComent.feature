Feature: Check In - Edit & Delete Coment

  @FirstRelease
  Scenario: TC-101 Ensure user successfully use feature edit
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis horizontal
    And user click button edit coment
    Then user directed to field edit coment

  @Positive
  Scenario: TC-102 Ensure user successfully edit coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis horizontal
    And user click button edit coment
    And user edit coment
    Then user click button submit

  @Positive
  Scenario: TC-103 Ensure user successfully tag member in edit coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis horizontal
    And user click button edit coment
    And user click button at
    And user click button mention all
    And user click buton oke
    Then user click button submit

  @Negative
  Scenario: TC-104 Ensure user failed edit coment with null coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis horizontal
    And user click button edit coment
    Then user click button submit

  @Negative
  Scenario: TC-105 Ensure user failed tag member in edit coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click icon elipsis horizontal
    And user click button edit coment
    And user click button at
    And user click button mention all
    Then user click cancel

