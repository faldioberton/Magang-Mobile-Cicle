Feature: Add & Reply Coment

  @FirstRelease
  Scenario: TC-54 Ensure user successfully add valid coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user add coment with character
    Then user click submit

  @Positive
  Scenario: TC-55 Ensure user successfully add valid coment and mention all member (disini path id semua tidak dapat ditemukan)
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user click icon tags
    And user click mention all
    And user click okee
    Then user click submit

  @Positive
  Scenario: TC-56 Ensure user successfully add coment with feature bold
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user click icon bold
    And user add coment character with bold
    Then user click submit

  @Positive
  Scenario: TC-57 Ensure user successfully add coment with feature italic
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user click icon italic
    And user add coment character with italic
    Then user click submit

  @Positive
  Scenario: TC-58 Ensure user successfully add coment with feature strikethrough
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user click icon strikthrough
    And user add coment character with strikthrough
    Then user click submit

  @Positive
  Scenario: TC-59 Ensure user successfully add file in coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user click icon add
    And user add file by image
    And user click by upload
    And user choose one photo
    And user add coment with character
    Then user click submit

  @Positive
  Scenario: TC-60 Ensure user successfully add coment with numbering list
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user click icon numbering
    And user add coment character with numbering
    Then user click submit

  @Positive
  Scenario: TC-61 Ensure user successfully add coment with bullet list
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user click icon bullet
    And user add coment character with bullet
    Then user click submit

  @Positive
  Scenario: TC-62 Ensure user successfully add coment character with emoji
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user add coment character with emoji
    Then user click submit

  @Positive
  Scenario: TC-63 Ensure user successfully add coment character with symbol math
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user add coment character with symbol math
    Then user click submit

  @Positive
  Scenario: TC-64 Ensure user successfully reply coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click button reply
    And user click add new coments
    And user add reply
    Then user click submit

  @Positive
  Scenario: TC-65 Ensure user successfully add cheers in coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click button cheers
    And user input field coment
    Then user click checklist

  @Negative
  Scenario: TC-66 Ensure user failed reply with null coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click button reply
    And user click add new coments
    Then user click submit

  @Negative
  Scenario: TC-67 Ensure user failed add cheers in coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click button cheers
    And user input field coment
    Then user click button cancel

  @Negative
  Scenario: TC-68 Ensure user failed add coment with null field coment
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    Then user click submit

  @Negative
  Scenario: TC-69 Ensure user failed add coment less than 2 character
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user add coment with one character
    Then user click submit

  @Negative
  Scenario: TC-70 Ensure user failed add coment just simbol math
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user open ones post
    And user click add new coment
    And user add coment simbol math
    Then user click submit