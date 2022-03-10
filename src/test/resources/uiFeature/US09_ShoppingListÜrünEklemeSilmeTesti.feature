
@paralel1

@sepetSil

Feature: US09 Kullanıcı shoppingListe ürünler ekleyip, silebilmeli

  Scenario: Kullanici istedigi urunleri istedigi listeye ekleyebilmeli.
    Given kullanici amazon sayfasina gider
    And Sign in butonuna tiklar
    And Kullanici email adresini yazar
    And Continue butonuna basar
    And Kullanici Password yazar
    And Signin butonuna  tiklar
    And  Arama butonuna aranan kelime yazilir ve aranir.
    And  Istenilen urune tiklanir ve Add to List butonundan secerek istenilen listeye eklenir.
    Then Listede eklenen urunun varligi kontrol edilir.

  Scenario: Kullanici istedigi urunleri istedigi listeden silebilmeli.
    Given kullanici amazon sayfasina gider
    And Sign in butonuna tiklar
    And Kullanici email adresini yazar
    And Continue butonuna basar
    And Kullanici Password yazar
    And Signin butonuna  tiklar
    And  Accounts & Lists sekmesinden urun silinmesi istenilen listeye tiklar.
    Then Silmek istedigi urune ait Delete butonuna basar. Ilgili satirda Deleted yazisinin goruldugu test

