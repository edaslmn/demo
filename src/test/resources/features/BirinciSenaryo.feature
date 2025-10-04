@hmm
Feature:
  Scenario: Eğitmenin Toplantı oluşturup öğrencinin randevu talebinin başarılı şekilde oluşturulması
    Given İlgili URL ile ana sayfaya ulaşır.
    And Giriş Yap’a tıklar geçerli öğretmen e-posta ve şifresiyle giriş yapar.
    And Kullanıcı sitenin Dashboard sayfasına erişir.
    And Kullanıcı Meetings linkine tıklar
    And Kullanıcı Settings linkine tıklar
    And Kullanıcı time sheet linkine tıklar
    And Kullanıcı add time buttona tıklar
    Then Kullanıcı toplantı başlangıc ve bitis saatini ayarlar
    And Kullanıcı meetingType'ı seçer
    And Kulanıcı Description alanına not yazar
    And Kullanici toplantı zamanını kaydeder
    And Kullanici toplantı saatlik ücreti belirler
    And Kullanici toplantı indirim oranını belirler
    And Kullanici toplantı ayarlarını kaydeder
    And Kullanıcı çıkış yapar.
    And Giriş Yap’a tıklar ve geçerli öğrenci e-posta ve şifresiyle giriş yapar.
    And Kullanıcı sitenin Dashboard sayfasına erişir.
    When Kullanıcı Instructors başlığına tıklar.
    And Kullanıcı Discount düğmesine tıklar.
    When Kullanıcı SDET(Software Development Engineer in Test) düğmesine tıklar.
    And Kullanıcı egitimci linkine tıklar düğmesine tıklar.
    And Kullanıcı takvimden ay seçer.
    And Kullanıcı takvimden gun seçer.
    And Kullanıcı saat seçer.
    And Kullanıcı Meeting Type başlığı altında turu seçer.
    And Kullanıcı Reserve a Meeting Description'a not yazar.
    And Kullanıcı Reserve A Meeting düğmesine tıklar.
    And Kullanıcı Checkout düğmesine basar.
    And Kullanıcı ödeme yöntemini seçer.
    And Kullanıcı Start Payment butonuna tıklar.
    And Kullanıcı gerekli bilgileri girer.
    And Kullanıcı Payment butonuna tıklar
    Then Randevu talebi başarıyla oluşturulmuş olmalıdır.
    Then My Panel metni görünür olmalıdır.
    When Kullanıcı My Panel düğmesine tıklar.
    And Kullanıcı sitenin Dashboard sayfasına erişir.
    Then Kullanıcı Meetings linkine tıklar
    Then Kullanıcı My reservations linkine tıklar
    When Kullanıcı filtreleme yapar
    When Kullanıcı toplantıya status seçer
    Then Kullanıcı status onaylar
    And Kullanıcı çıkış yapar.







