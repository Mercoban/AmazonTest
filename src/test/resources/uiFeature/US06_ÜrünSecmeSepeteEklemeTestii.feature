@sepet

Feature: US06 Kullanıcı rastgele ürünler seçmeli ve sepete ekleyebilmeli.
              Eklenen ürünlerin fiyat toplamı ile sepetteki toplamın aynı olduğunu görmeli


  @ürünSecme

Scenario Outline: Kullanıcı bir menü sayfasında ürünlerden seçerek sepete ekleyebilmeli
    Given kullanici amazon sayfasina gider
    Then Arama kutusuna "<arananUrun>" yazar ve arama yapar
    And Acilan sayfada gelen ilk urun tiklanir,sepete eklenir ve fiyatlari yazdirilir
    And Sepetteki urunler ile secilen urunler karsilastirilarak dogrulanir.
    And sayfayi kapatir


    Examples:
      |arananUrun  |
      | java |
      | mutfak |

