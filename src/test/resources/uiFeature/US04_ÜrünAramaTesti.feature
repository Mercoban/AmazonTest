@arananUrun

Feature: US04 Kullanıcı bir ürün aradığında, listelenen tüm ürünler aranan kelimeyi içermeli


  Scenario: Kullanıcı Arama kutusuna herhangi bir karakter yazdığında o karakter ile ilgili önerileri görmelidir.

    Given kullanici amazon sayfasina gider
    And Kullanıcı arama çubuğuna "ipad" yazar ve arama yapar
    Then Kullanıcı listelenen tum urunlerin "ipad" ismini icerdigini gorur
    And sayfayi kapatir


