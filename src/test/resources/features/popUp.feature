Feature: popUp
 Background:
  Given kullanici API Demos sayfasina gidecek
  Given kullanici Views sayfasina gider
  Scenario:
  Expandable list
  Given  click Expandable Lists
  Given  click Custom Adapter
  Given  then long pres People NamesGiven click sample action popup
  Then   verify toast message

    Scenario: Popup
      Given  kullanici popup menu sayfasina gider
      Given  make  popup tikla
      Then   popup acildimi onayla
      And   kullanici add tiklar
     Then     toast mesaj onayla "Clicked popup menu item Add"