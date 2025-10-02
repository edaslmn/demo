
  Feature: US028 Kayıtlı bir kullanıcı olarak sitede teknik destek alabileceğim bir alan olmasını istiyorum

    Scenario: TC01 Kullanıcı dashboard sayfasındaki Support başlığı altında "New"
    linki görünebilirlik testi

      Given kullanici anasayfaya gider
      And login butonuna basar
      And senkronizasyon icin 2 saniye bekler
      Then email kutusuna "rilirip378@protonza.com" yazar
      And password kutusuna "Learn.1406" yazar
      Then login butonuna basarak giris yapar
      When support butonunu gorene kadar asagi iner
      Then support butonuna tiklar
      And senkronizasyon icin 2 saniye bekler
      And New linkinin gorunebildigini test eder

    Scenario: TC02 Kullanıcı dashboard sayfasındaki Support başlığı altında "Courses Support"
    linki görünebilirlik testi

      Given kullanici anasayfaya gider
      And login butonuna basar
      And senkronizasyon icin 2 saniye bekler
      Then email kutusuna "rilirip378@protonza.com" yazar
      And password kutusuna "Learn.1406" yazar
      Then login butonuna basarak giris yapar
      When support butonunu gorene kadar asagi iner
      Then support butonuna tiklar
      And senkronizasyon icin 2 saniye bekler
      And Courses support linkinin gorunebildigini test eder

    Scenario: TC03 Kullanıcı dashboard sayfasındaki Support başlığı altında "Tickets"
    linki görünebilirlik testi

      Given kullanici anasayfaya gider
      And login butonuna basar
      And senkronizasyon icin 2 saniye bekler
      Then email kutusuna "rilirip378@protonza.com" yazar
      And password kutusuna "Learn.1406" yazar
      Then login butonuna basarak giris yapar
      When support butonunu gorene kadar asagi iner
      Then support butonuna tiklar
      And senkronizasyon icin 2 saniye bekler
      And Tickets linkinin gorunebildigini test eder

      