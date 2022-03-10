@paralel1

@shoppingList

Feature: US08 Kullanıcı shoppingList oluşturabilmeli ve silebilmeli


  Scenario: Kullanici bir Shopping List olusturabilmeli.


    When kullanici amazon sayfasina gider
    And Sign in butonuna tiklar
    And Kullanici email adresini yazar
    And Continue butonuna basar
    And Kullanici Password yazar
    And Signin butonuna  tiklar
    And  Account & Lists acilir sekmesinde Create a List linkine tiklar.
    And  Yeni Shopping List'e isim verir ve Create List butonuna tiklar.
    Then Your Lists sekmesi altinda yeni olusturulan listenin gorunurlugu test edilir.
    And sayfayi kapatir




