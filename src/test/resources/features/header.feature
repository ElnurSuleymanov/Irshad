Feature: Header

  Scenario Outline: Checking  by clicking the buttons in the header.
    Given User is in "irshad.az" website
    When  Clicks on "<header>" button in the "header"
    Then Should be navigated to "<header>" page
    Examples:
      | header       |
      | Kampaniyalar |
      | Mağazalar    |
      | Korporativ   |
      | Samsung      |
      | Apple        |
      | Outlet       |


  Scenario: Availability of language in options
      Given User is in "irshad.az" website
      When Hovers mouse over "language" button
      Then Should language options


      Scenario: Checking clickability of User profile button in the header.
        Given User is in "irshad.az" website
        When Clicks on User profile button
        Then User should be navigated to the sighning page