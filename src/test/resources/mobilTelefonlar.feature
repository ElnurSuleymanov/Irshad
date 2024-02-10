Feature: MobilTelefonlar
  Background:
    Given User is in "irshad.az" website
    When Clicks on Kataloq button
    And Hovers mouse over "Telefon və aksesuarlar" buttons
    And Clicks on the Mobil telefonlar button


   Scenario Outline: Check Qiymət aralığı section in the Mobil Telefonlar Ve Aksesuarlar page
     Given Puts the value from "<from>" to "<to>" the price
     Then Items in the page should be ordered according from "<from>" to "<to>"
     Examples:
       | from | to   |
       | 0    | 100  |
       | 100  | 500  |
       | 500  | 1000 |
       | 1000 | 1500 |
       | 1500 | 2000 |
       | 2000 | 2500 |
       | 2500 | 5000 |

  Scenario Outline: Check Brend checkbox in the Telefon Ve Aksesuarlar page
    When Choose "<Brend>" in the Brend checkbox
    Examples:
      | Brend   |
      | Apple   |
      | Samsung |
# THEN YAZILMALIDI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!



  Scenario Outline: Check credit offers in Telefon Ve Aksesuarlar page
    When Clicks on the "<Ayliq>" button in the item's description
    Then The monthly payment for the item should be displayed according to taksit "<Ayliq>".
    Examples:
      | Ayliq |
      | 6     |


