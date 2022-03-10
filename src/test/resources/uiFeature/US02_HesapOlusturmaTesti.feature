@account

Feature: US02 Kullanıcı valid bilgilerle giriş yapabilmeli, invalid bilgilerle giriş yapamamalı

  Scenario: Kullanıcı amazon sayfasına gider Sign in bölümünde hesap olusturur

    Given kullanici amazon sayfasina gider
    And Sign in bolumune gider
    And New customer? Start here. kismina tiklar
    And Kullanici Your name yazar
    And Kullanici Mobile number or email yazar
    And Kullanici Password olusturur
    And Kullanici Re-enter password yazar
    And Continue kismina tiklar
    And Hesabin olustugunu gorur
    And sayfayi kapatir

