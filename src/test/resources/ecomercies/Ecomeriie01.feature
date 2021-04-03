Feature: ecommercie
  Scenario:
    Given general stora gidilir
    And ulke dropdownundan "France" secilir
    And name girilir
    And cinsiyet secilir
    And Letsstep butonu tiklanir
    Then signin yapildigi assert edilir

