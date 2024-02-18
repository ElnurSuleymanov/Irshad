

@MobilTelefonlar
Feature: MobilTelefonlar
  Background:
    Given User is in "irshad.az" website
    When Clicks on Kataloq button
    And Hovers mouse over "Telefon və aksesuarlar" buttons
    And Clicks on the Mobil telefonlar button

@price
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
@brand
  Scenario Outline: Check Brend checkbox in the Telefon Ve Aksesuarlar page
    When Choose "<Brend>" in the Brend checkbox
    Then Items in the "Telefon Ve Aksesuarlar" page should be ordered according to the "<Brend>" checkbox
    Examples:
      | Brend   |
      | Apple   |
      | Samsung |
      | Xiaomi  |

  @NFC
  Scenario Outline: Check NFC checkbox in the Telefon Ve Aksesuarlar page
    When Choose "<NFC>" in the NFC checkbox
    And Clicks on any product in the page
    Then In product details NFC should be "<NFC>"
    Examples:
      | NFC |
      | Yox |
      | Var |


@DaxiliYaddas
Scenario Outline: Check DaxiliYaddas checkbox in the Telefon Ve Aksesuarlar page
  When Choose "<DaxiliYaddas>" in the DaxiliYaddas checkbox
  And  Clicks on any product in the page
  Then In product details DaxiliYaddas should be "<DaxiliYaddas>"
  Examples:
    | DaxiliYaddas |
    | 32 GB        |
    | 64 GB        |
    | 128 GB       |
    | 256 GB       |


@Operativyaddas
Scenario Outline: Check Operativyaddaş checkbox in the Telefon Ve Aksesuarlar page
  When Choose "<Operativyaddaş>" in the OperativYaddas checkbox
  And  Clicks on any product in the page
  Then In product details OperativYaddas should be "<Operativyaddaş>"
  Examples:
    | Operativyaddaş |
    | 2 GB           |
    | 3 GB           |
    | 4 GB           |
    | 6 GB           |

  @Akkumulyatorunhecmi
  Scenario Outline: Check Akkumulyatorunhecmi checkbox in the Telefon Ve Aksesuarlar page
    When Choose "<Akkumulyatorunhecmi>" in the Akkumulyatorunhecmi checkbox
    And  Clicks on any product in the page
    Then In product details Akkumulyatorunhecmi should be "<Akkumulyatorunhecmi>"
    Examples:
      | Akkumulyatorunhecmi |
      | 4780 mAh            |
      | 4800 mAh            |
      | 5000 mAh            |
      | 5050 mAh            |

    @Ekranölçüsü
    Scenario Outline: Check Ekranölçüsü  checkbox in the Telefon Ve Aksesuarlar page
      When Choose "<Ekranölçüsü>" in the Ekranölçüsü checkbox
      And  Clicks on any product in the page
      Then In product details Ekranölçüsü should be "<Ekranölçüsü>"
      Examples:
        | Ekranölçüsü |
        | 6.2         |
        | 6.7         |
        | 6.9         |
        | 6.8         |

      @Əməliyyatsistemi
      Scenario Outline: Check Əməliyyatsistemi  checkbox in the Telefon Ve Aksesuarlar page
        When Choose "<Əməliyyatsistemi>" in the Əməliyyatsistemi checkbox
        And  Clicks on any product in the page
        Then In product details Əməliyyatsistemi should be "<Əməliyyatsistemi>"
        Examples:
          | Əməliyyatsistemi    |
          | iOS 15              |
          | Android 12          |
          | Android 10, MIUI 12 |
          | Android 14          |

        @Prosessor
        Scenario Outline: Check  Prosessor  checkbox in the Telefon Ve Aksesuarlar page
          When Choose "<Prosessor>" in the Prosessor checkbox
          And  Clicks on any product in the page
          Then In product details Prosessor should be "<Prosessor>"
          Examples:
            | Prosessor         |
            | Apple A15 Bionic  |
            | Apple A16 Bionic  |
            | Helio G88         |
            | Mediatek MT6739   |
            | Snapdragon 695 5G |

  @MovcuddurCheckBox
  Scenario Outline: Check Mövcuddur checkbox in the Telefon Ve Aksesuarlar page
      When Choose "<Mövcuddur>" in the Mövcuddur checkbox
      Then Items should be ordered according to the "<Mövcuddur>" checkbox
      Examples:
        | Mövcuddur     |
        | Yalnız Onlayn |
        | Mağazada      |

  @taksit
  Scenario Outline: Check credit offers in Telefon Ve Aksesuarlar page
    When Clicks on the "<Ayliq>" button in the item's description
    Then The monthly payment for the item should be displayed according to taksit "<Ayliq>".
    Examples:
      | Ayliq |
      | 6     |
      | 12    |


  @discount
  Scenario: Endirimde olan mehsullar in Telefon Ve Aksesuarlar page
    When Click to discount checkbox
    Then Only discounted items are visible

@basket
  Scenario: Adding item to basket successfully in Telefon Ve Aksesuarlar page
    When User clicks add to card btn for random item
    And Clicks to basket button
    Then selected item should be shown in basket

  @deleteItem
  Scenario: Delete item to basket successfully in Telefon Ve Aksesuarlar page
    When User clicks add to card btn for random item
    And Clicks to basket button
    And Click the Delete button
    And Clicks to basket button
    Then Product has been removed from the page



  @favorit
  Scenario: Adding item to favorit successfully in Telefon Ve Aksesuarlar page
    When User clicks favorit btn for random item
    And Clicks to favorit button
    Then selected item should be shown in favorit



  @deleteFavorit
  Scenario: Delete item to favorit successfully in Telefon Ve Aksesuarlar page
    When User clicks favorit btn for random item
    And Clicks to favorit button
    And Click the favorite button to delete
    And Clicks to favorit button
    Then Product has been removed from the page






