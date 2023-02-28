Feature: Blast

  @Positive
  Scenario: TC-5 Ensure user successfully create new list with Status Public
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user click feature Blast
    And user create new post
    And user input title
    And user input description
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-6 Ensure user successfully create new list with Status Private
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user scroll down
    And user click switch to private
    And user click publish

  @Positive
  Scenario: TC-7 Ensure user successfully create new list with tag one member
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose one member
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-8 Ensure user successfully create new list with tag all member
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose all member
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-9 Ensure user successfully create new list with add all member to notified
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose all member
    And user scroll down
    And user click icon notice
    And user choose all member to notice
    And user click done
    And user click publish

  @Positive
  Scenario: TC-10 Ensure user successfully input title with valid format
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with character
    And user input description
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-11 Ensure user successfully input description with valid format
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with character
    And user input description with character
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-12 Ensure user successfully create new list with valid due date
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose all member
    And user scroll down
    And user click icon notice
    And user choose all member to notice
    And user click done
    And user click icon due date
    And user input next week date
    And user click button ok
    And user set due time
    And user set hour
    And user set minute
    And user choose format time
    And user click ok
    And user click publish

  @Positive
  Scenario: TC-13 Ensure user successfully input field title with feature bold
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user click icon Bold
    And user input title
    And user input description
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-14 Ensure user successfully input field description with feature bold
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user click icon At
    And user choose all member
    And user click icon Bold
    And user input description with bold
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-15 Ensure user successfully input field title with feature italic
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user click icon Italic
    And user input title
    And user input description
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-16 Ensure user successfully input field description with feature italic
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user click icon Italic
    And user input description with italic
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-17 Ensure user successfully input field title with feature underline
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user click icon underline
    And user input title
    And user input description
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-18 Ensure user successfully input field description with feature underline
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user click icon underline
    And user input description with underline
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-19 Ensure user successfully input field description with feature underline
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user click icon underline
    And user input description with underline
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-20 Ensure user successfully input field title with feature dapper whacks (bug)
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user click icon slash through
    And user input title
    And user input description
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-21 Ensure user successfully input field description with feature dapper whacks (bug/tidak bisa dipencet)
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user click icon slash through
    And user input description
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-22 Ensure user successfully input field title with feature strikethrough
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user click icon strikethrough
    And user input title
    And user input description
    And user scroll down
    And user click publish

  @FirstRelease
  Scenario: TC-23 Ensure user successfully input field description with feature strikethrough
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user click icon strikethrough
    And user input description with strikethrough
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-24 Ensure user successfully input field title with character and emoji
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with character and emoji
    And user input description
    And user scroll down
    And user click publish

  @Positive
  Scenario: TC-25 Ensure user successfully input field description with character and emoji
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with character and emoji
    And user input description with character and emoji
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-26 Ensure user failed create new list with invalid due date
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose all member
    And user scroll down
    And user click icon notice
    And user choose all member to notice
    And user click done
    And user click icon due date
    And user input last week date
    And user click button ok
    And user click ok
    And user click publish

  @Negative
  Scenario: TC-27 Ensure user failed create new list with valid date but invalid due month
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose all member
    And user scroll down
    And user click icon due date
    And user click edit
    And user input last month
    And user click button ok
    And user click ok
    And user click publish

  @Negative
  Scenario: TC-28 Ensure user failed create new list with valid date and month but invalid due year
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose all member
    And user scroll down
    And user click icon due date
    And user click edit
    And user input last year
    And user click button ok
    And user click ok
    And user click publish

  @Negative
  Scenario: TC-29 Ensure user failed create new list with valid date but time has passed
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose all member
    And user scroll down
    And user click icon notice
    And user choose all member to notice
    And user click done
    And user click icon due date
    And user click button ok
    And user set hours that have been passed
    And user set minute
    And user click ok
    And user click publish

  @Negative
  Scenario: TC-30 Ensure user failed input invalid hour
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose all member
    And user scroll down
    And user click icon notice
    And user choose all member to notice
    And user click done
    And user click icon due date
    And user click button ok
    And user set invalid hour
    And user set minute
    And user click ok
    And user click publish

  @Negative
  Scenario: TC-31 Ensure user failed input invalid minute
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose all member
    And user scroll down
    And user click icon notice
    And user choose all member to notice
    And user click done
    And user click icon due date
    And user click button ok
    And user set hour
    And user set invalid minute
    And user click ok
    And user click publish

  @Negative
  Scenario: TC-32 Ensure user failed create new list with null field title and description
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-33 Ensure user failed create new list with null field title
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input description
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-34 Ensure user failed create new list with null field description
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-35 Ensure user failed create new list with null member to notified
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description
    And user click icon At
    And user choose all member
    And user scroll down
    And user click icon notice
    And user unchecklist all member
    And user click done
    And user click publish

  @Negative
  Scenario: TC-36 Ensure user failed to input title with number
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with number
    And user input description
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-37 Ensure user failed to input description with number
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description with number
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-38 Ensure user failed to input field title with special character
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with special character
    And user input description
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-39 Ensure user failed to input field title less than 3 character
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with three character
    And user input description
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-40 Ensure user failed to input field title more than 200 character
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with more than 200 character
    And user input description
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-41 Ensure user failed to input field description less than 2 character
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description with one character
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-42 Ensure user failed to input field title with symbol math
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with symbol math
    And user input description
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-43 Ensure user failed to input field description with symbol math
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description with symbol math
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-44 Ensure user failed to input field title with emoji
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with emoji
    And user input description
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-45 Ensure user failed to input field description with emoji
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description with emoji
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-46 Ensure user failed to input field title with dot
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title with dot
    And user input description
    And user scroll down
    And user click publish

  @Negative
  Scenario: TC-47 Ensure user failed to input field description with dot
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    And user open ones blast
    And user create new post
    And user input title
    And user input description with dot
    And user scroll down
    And user click publish




