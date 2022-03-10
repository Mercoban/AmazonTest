@urunFıltreleme

Feature: US05 Kullanıcı ürün listeleme işleminde filtrelemeleri ve sıralamaları kullanabilmeli


  Scenario: Kullanıcı bir ürün seçtiğinde gelen sayfada bu ürünleri fiyatına göre sıralayabilmeli

    Given kullanici amazon sayfasina gider
    And Kullanıcı arama çubuğuna "iphone13" yazar ve arama yapar
    Then Kullanıcı listelenen tüm ürünleri fiyatlarına göre sıralar.
    And Kullanıcı aradıgı ürün fiyatlarını dusukten yuksege sıralandıgını dogrular
    And sayfayi kapatir


