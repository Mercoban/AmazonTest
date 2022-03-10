
@allMenü

Feature: US03 Kullanıcı ALL menusunden herhangi bir kategori seçebilmeli ve alt kategorilerin listelendiğini görebilmeli


  Scenario: Kullanıcı amazon sayfasına gider all menüsü altında bulunan ürünleri kontrol eder.

    Given kullanici amazon sayfasina gider
    And Kullanici All butonuna tiklar
    And Kullanici "Computers" menusunu secer
    Then Kullanici baslik sayisinin 15 oldugunu dogrular
    And sayfayi kapatir


