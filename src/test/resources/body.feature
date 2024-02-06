Feature: Body

  Scenario Outline: Check Ayliq odenish button in the homepage
    Given User is in "irshad.az" website
    When Clicks on Ayliq Odenish button
    And Clicks on "<Aylıq Odənish Yolu>" button
    Then Should be navigated to the "<Aylıq Odənish Yolu>" page
    Examples:
      | Aylıq Odənish Yolu |
      | Million            |
      | E-pul              |
      | Hesab.az           |
