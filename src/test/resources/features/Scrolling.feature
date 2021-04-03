Feature: Scrolling
 Background:
   Given kullanici API Demos sayfasina gidecek
   Given kullanici Views sayfasina gider

  Scenario: Scrolling with TouchAction
    Given kullanici webview sayfasına gider

Scenario:Scrolling with UiScrollable

  Given kullanici Ui ile webview sayfasina gider


 Scenario: text switcher
   And kullanici textSwitcher sayfasine gider
   And kullanici 3 kez  next butonunu tiklar
   Then kullnici sayiyiyi kontrol eder


   Scenario: Tab 17
     And kullanici Tabs sekmesine gider
     And kullanici scrolling sekmesine gider
     And kullanici TABonyedi sekmesine gider
     Then kullanici yaziyi kontrol eder


     Scenario:
       And tabonyedi