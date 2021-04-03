Feature: Spinner
  Scenario:
    Given kullanici API Demos sayfasina gidecek
    Given kullanici Views sayfasina gider
    And kullanici spinner sayfasina gider

    And kullanici ilk dropdownda "Blue" secer
    Then "red" secildigini onaylar

    And kullanici ikinci dtopdownda "Mars" secer
    Then "Venus" secildigini onayla