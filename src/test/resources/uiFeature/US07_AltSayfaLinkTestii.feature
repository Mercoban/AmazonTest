@paralel1
@altMenu
Feature: US07 Kullanıcı ana sayfanın alt kısmındaki linklerden herhangi
  bir satır ya da sutundaki linklerin doğru sayfaya yönlendirdiğinden emin olmalı


  Scenario: Kullanıcı alt menülerden doğru sayfayı açabilmeli

    When kullanici amazon sayfasina gider
    And Kullanici en alt tarafta bulunan Web Table kisminda herhangi bir linke tikladiginda ilgili dogru sayfanin acildigini gorur.
    Then Dogru sayfa acildigini dogrular.
    And sayfayi kapatir



