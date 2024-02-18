Feature: Body
@Ayliq
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


 @ChatBox
  Scenario: Chatbox yoxlanilmasi
    Given User is in "irshad.az" website
    Then Chatbox achildimi


@IrshadButton
  Scenario: Checking the irshad button
    Given User is in "irshad.az" website
    When  User click Kampaniyalar button
    And User click irshad button
    Then Website is being updated




