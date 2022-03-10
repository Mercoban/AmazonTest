@amazon
Feature: US01 Kullanıcı Amazon.com sayfasına ulaşabilmeli


  Scenario: TC01 amazon ana sayfaya gider sayfa logosunu ve başlığı test eder

    When kullanici amazon sayfasina gider
    And Açılan sayfada firma logosunun görünürlüğünü test eder
    Then Açılan sayfada site başlığının(title) 'Amazon.com. Spend less. Smile more.' yazdığını doğrular
    And sayfayi kapatir
