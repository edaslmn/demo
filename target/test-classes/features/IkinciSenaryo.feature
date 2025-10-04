@evet
Feature:
  Scenario: Eğitmen geçerli datalarla login olup, ödeme bölümünde geçerli datalarla ödeme yapıp kurs satın alabilmeli
    Given İlgili URL ile ana sayfaya ulaşır.
    And Kullanici Login linkine tıklar
    And Kullanici Email ve Password text box larına data girmez
    Then login butonuna tıklar
    And Kullanıcı uyarı mesajini görüntüler negatif login testi başarılı
    And Kullanici Email ve Password text box larına geçersiz data girer
    Then login butonuna tıklar
    And Kullanıcı uyarı mesajini görüntüler negatif login testi başarılı
    When Kullanıcı Email textbox'ına geçerli E-posta Password text box'ına geçersiz şifre girer
    Then login butonuna tıklar
    And Kullanıcı uyarı mesajini görüntüler negatif login testi başarılı
    When Kullanıcı Email textbox'ına geçersiz E-posta Password text box'ına geçerli şifre girer
    Then login butonuna tıklar
    And Kullanıcı uyarı mesajini görüntüler negatif login testi başarılı
    When Kullanıcı Email textbox'ına geçersiz formatta data girer
    Then login butonuna tıklar
    And Kullanıcı uyarı mesajini görüntüler negatif login testi başarılı
    When Kullanıcı Password textbox'ına geçersiz uzunlukta data girer
    Then login butonuna tıklar
    And Kullanıcı uyarı mesajini görüntüler negatif login testi başarılı
    And Kullanici Email textbox'ına geçerli E-posta Password textbox'ına geçerli şifre girer
    Then login butonuna tıklar
    And Kullanıcı sitenin Dashboard sayfasına erişir.
    Then Kullanici Courses linkine tıklar kurslar sayfasın yönlenir
    Then Kullanici Search text box'ında arama yapar
    Then Kullanici aradığı kurs linkine tıklar
    Then Kullanici Buy Now butonuna tıklar
    And Kullanıcı ödeme yöntemini seçer.
    And Kullanıcı Start Payment butonuna tıklar.
    Given kullanıcı ödeme sayfasına yönlenir
    And kullanıcı ödeme formuna data girmez
    And Kullanıcı Payment butonuna tıklar
    Then Kullanıcı uyarı mesajını görüntüler negatif ödeme testi başarılı
    When Kullanici Geçersiz e-posta girer
    And Kullanıcı Payment butonuna tıklar
    Then Kullanıcı uyarı mesajını görüntüler negatif ödeme testi başarılı
    When kullanıcı Eksik kart numarası girer
    And Kullanıcı Payment butonuna tıklar
    Then Kullanıcı uyarı mesajını görüntüler negatif ödeme testi başarılı
    And Kullanıcı son kullanımı tarihi dolmuş kart bilgisi girer
    And Kullanıcı Payment butonuna tıklar
    Then Kullanıcı uyarı mesajını görüntüler negatif ödeme testi başarılı
    And Kullanıcı tüm alanları geçerli bilgileri girer.
    And Kullanıcı Payment butonuna tıklar
    Then Kullanıcı ödeme yapıldığını görüntüler.
    When Kullanıcı My Panel düğmesine tıklar.
    And Kullanıcı sitenin Dashboard sayfasına erişir.
    And Kullanıcı çıkış yapar.

