Feature: Edit & Delete Coment

  @FirstRelease
  Scenario: TC-71 Ensure user successfully edit coment with add new coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click flutter icon
    And user click Edit coment
    And user add coments with character
    Then user click submit

  @Positive
  Scenario: TC-72 Ensure user successfully delete coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click flutter icon
    And user click archive
    And user click Okk
    Then user click submit

  @Negative
  Scenario: TC-73 Ensure user failed edit coment with null coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click flutter icon
    And user click Edit coment
    And user delete coment
    Then user click submit

  @Negative
  Scenario: TC-74 Ensure user failed delete coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click flutter icon
    And user click archive
    And user click cancel