Feature: Kataloq

  Scenario: Clickabiility of Kataloq button
    Given User is in "irshad.az" website
    When  Clicks on Kataloq button
    Then Dropdown menu should be shown


    Scenario Outline: Check the display of items in the kataloq section
      Given  User is in "irshad.az" website
      When Clicks on Kataloq button
      And Hovers mouse over "<Kataloq>" buttons
      Then "<Kataloq>" items dropdown menu should be shown
      Examples:
        | Kataloq                               |
        | Telefon və aksesuarlar                |
        | Böyük məişət texnikası                |
        | Kiçik məişət texnikası                |
        | TV və Audio                           |
        | Foto texnika                          |
        | Notbuk, planşet və kompüter texnikası |
        | Outlet                                |
        | Evə uyğun məhsullar                   |
        | Mebellər və tekstil                   |
        | Nəqliyyat və Əyləncə                  |
        | Avtomobil üçün məhsullar              |
        | İdman və sağlamlıq                    |
        | İnşaat                                |
        | Dəftərxana ləvazimatları              |
        | Şəxsi əşyalar                         |
        | Hədiyyə kartları                      |

  Scenario: Clickabiility of Yalnız onlayn məhsullar button
    Given User is in "irshad.az" website
    When Clicks on Kataloq button
    And Clicks on "Yalnız onlayn məhsullar" button in the Kataloq dropdown
    Then User should be navigated to the "Yalnız onlayn məhsullar" page



