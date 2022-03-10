@signIn

Feature: US02 Kullanıcı valid bilgilerle giriş yapabilmeli, invalid bilgilerle giriş yapamamalı



  Background: amazon sayfasina gitme
    Given kullanici amazon sayfasina gider

  Scenario: Kullanıcı amazon sayfasına gider Sign in bölümünden giris yapar

    And Sign in butonuna tiklar
    And Kullanici email adresini yazar
    And Continue butonuna basar
    And Kullanici Password yazar
    And Signin butonuna  tiklar
    And Siteye dogru bilgilerle girebildigini dogrular
    And sayfayi kapatir

@negatif1

Scenario: Hatalı mail ile test

  And Sign in butonuna tiklar
  And Kullanici yanlis email adresi girer
  And Continue butonuna basar
  And Hata mesaji gorur
  And sayfayi kapatir

  @negatif2

  Scenario: Hatalı password ile test

    And Sign in butonuna tiklar
    And Kullanici email adresini yazar
    And Continue butonuna basar
    And Kullanici hatali Password yazar
    And Signin butonuna  tiklar
    And hatali sifre mesaji gorur
    And sayfayi kapatir