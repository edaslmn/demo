
Feature: Kayıtlı bir kullanıcı olarak ana sayfada eğitmenleri görüp bilgi alabilmek ve randevu oluşturabilmek istiyorum.

  Scenario: Ana sayfada Instructors linki görünür ve aktif olmalı
    Then Kullanıcı Instructors başlığını görmelidir.
    When Kullanıcı Instructors başlığına tıklar.

  Scenario: Instructors sayfasında arama kutusu ve arama düğmesi görünür ve aktif olmalıdır
    When Kullanıcı Instructors başlığına tıklar.
    Then Search... placeholder’lı arama kutusu görünür ve aktif olmalıdır.
    When Kullanıcı Search düğmesine tıklar.

  Scenario: Eğitmenleri seçmeden önce kategoriler seçilebilmelidir
    When Kullanıcı Instructors başlığına tıklar.
    And Kullanıcı Available for Meetings düğmesine tıklar.
    And Kullanıcı Free Meetings düğmesine tıklar.
    And Kullanıcı Discount düğmesine tıklar.
    And Kullanıcı Management düğmesine tıklar.

  Scenario: Seçilen eğitmenin fiyatı, ders adı ve beğeni bilgileri görünür olmalıdır
    When Kullanıcı Instructors başlığına tıklar.
    And Kullanıcı Available for Meetings düğmesine tıklar.
    And Kullanıcı Discount düğmesine tıklar.
    And Kullanıcı Management düğmesine tıklar.
    And Eğitmen puanı 4.69 olarak görünmelidir.
    And Kullanıcı Sawyer Emerson metnine tıklar.
    When Kullanıcı Courses düğmesine tıklar.

  @demo
  Scenario: Eğitmenin Toplantı oluşturup öğrencinin randevu talebinin başarılı şekilde oluşturulması
    Given İlgili URL ile ana sayfaya ulaşır.
    And senkronizasyon icin 1 saniye bekler
    And Giriş Yap’a tıklar ve geçerli öğrenci e-posta ve şifresiyle giriş yapar.
    And Kullanıcı sitenin Dashboard sayfasına erişir.
    When Kullanıcı Instructors başlığına tıklar.
    And Kullanıcı Available for Meetings düğmesine tıklar.
    And Kullanıcı Discount düğmesine tıklar.
    And senkronizasyon icin 3 saniye bekler
    Then Instructor görünür olmalıdır.
    And Kullanıcı egitimci linkine tıklar düğmesine tıklar.
    And Kullanıcı Reserve a Meeting baslıgına goruntuler.
    And Kullanıcı takvimden ay seçer.
    And Kullanıcı takvimden gun seçer.
    And Kullanıcı saat seçer.
    And Kullanıcı Meeting Type başlığı altında turu seçer.
    And Kullanıcı Reserve A Meeting düğmesine tıklar.
    And Kullanıcı Checkout düğmesine basar.
    And Kullanıcı ödeme yöntemini seçer.
    And Kullanıcı Start Payment düğmesine basar.
    And Kullanıcı gerekli bilgileri girer.
    And Kullanıcı ödeme yapar
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