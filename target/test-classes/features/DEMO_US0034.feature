@demo
Feature: Kayıtlı bir kullanıcı olarak ana sayfada eğitmenleri görüp bilgi alabilmek ve randevu oluşturabilmek istiyorum.

  Background:
    Given İlgili URL ile ana sayfaya ulaşır.
    And Giriş Yap’a tıklar ve geçerli öğrenci e-posta ve şifresiyle giriş yapar.
    And Kullanıcı sitenin Dashboard sayfasına erişir.

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
    Then Sawyer Emerson metni görünür olmalıdır.
    And Eğitmen puanı 4.69 olarak görünmelidir.
    And Kullanıcı Sawyer Emerson metnine tıklar.
    When Kullanıcı Courses düğmesine tıklar.

  Scenario: Eğitmenden randevu talebinin başarılı şekilde oluşturulması
    When Kullanıcı Instructors başlığına tıklar.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı Available for Meetings düğmesine tıklar.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı Discount düğmesine tıklar.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı Management düğmesine tıklar.
    And senkronizasyon icin 3 saniye bekler
    Then Sawyer Emerson metni görünür olmalıdır.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı Reserve a Meeting düğmesine tıklar.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı takvimden ay seçer.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı takvimden tarih seçer.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı saat seçer.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı Meeting Type başlığı altında turu seçer.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı Reserve A Meeting düğmesine tıklar.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı Checkout düğmesine basar.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı ödeme yöntemini seçer.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı Start Payment düğmesine basar.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı gerekli bilgileri girer.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı ödeme yapar
    And senkronizasyon icin 3 saniye bekler
    Then Randevu talebi başarıyla oluşturulmuş olmalıdır.
    And senkronizasyon icin 3 saniye bekler
    Then My Panel metni görünür olmalıdır.
    And senkronizasyon icin 3 saniye bekler
    When Kullanıcı My Panel düğmesine tıklar.
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı sitenin Dashboard sayfasına erişir.
    And senkronizasyon icin 3 saniye bekler
    Then Kullanıcı Meetings linkine tıklar
    And senkronizasyon icin 3 saniye bekler
    Then Kullanıcı My reservations linkine tıklar
    And senkronizasyon icin 3 saniye bekler
    When Kullanıcı filtreleme yapar
    And senkronizasyon icin 3 saniye bekler
    When Kullanıcı toplantıya status seçer
    And senkronizasyon icin 3 saniye bekler
    Then Kullanıcı status onaylar
    And senkronizasyon icin 3 saniye bekler
    And Kullanıcı çıkış yapar.
    And senkronizasyon icin 3 saniye bekler