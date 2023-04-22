Feature: Check In - Add & Reply Coment

  @FirstRelease
  Scenario: TC-95 Ensure user successfully add coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click ad new coment
    And user add new coment
    And user click submit

  @Positive
  Scenario: TC-96 Ensure user input character and emoji in field coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click ad new coment with emoji
    And user add new coment
    And user click submit

  @Positive
  Scenario: TC-97 Ensure user successfully reply coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click button Reply coment
    And user click button add new coments
    And user add coment in field reply
    And user click submit

  @Positive
  Scenario: TC-98 Ensure user successfully tag member in reply coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click button Reply coment
    And user click button add new coments
    And user click icon at to tag member
    And user click mentions all
    And user click buton ok
    And user click submit

  @Negative
  Scenario: TC-99 Ensure user failed add coment with null coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click ad new coment
    And user click submit

  @Negative
  Scenario: TC-100 Ensure user failed reply null coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones check in
    And user open ones posts
    And user click button Reply coment
    And user click button add new coments
    And user click submit