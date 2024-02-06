Feature: MobilTelefonlar
  



 Scenario Outline: Check clickability of "<Telefon>" button in Mobil telefonlar section
   Given User is in "irshad.az" website
   When Clicks on Kataloq button
   And Hovers mouse over "Telefon və aksesuarlar" buttons
    And Clicks on the "<Telefon>" button
    Then User should be navigated to  "<Telefon>" page
   Examples:
     | Telefon |
     | Apple   |
     | Samsung |
     | Xiaomi  |
     | Google  |
