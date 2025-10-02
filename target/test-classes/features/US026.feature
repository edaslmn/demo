@yusuf
Feature: Kayıtlı bir kullanıcı olarak, sitede sertifikalarımı görüntüleyip yönetebileceğim bir alan olmasını istiyorum.


  Scenario: TC-001 Sertifikalar sayfasına erişim
    Given İlgili URL ile ana sayfaya ulaşır
    And Giriş Yap'a tıklar ve geçerli eğitmen e-postası ve şifresiyle giriş yapar
    Then Kullanıcı "Sertifikalarım" bağlantısını görene kadar sayfa aşağı kaydırılır
    And Kullanıcı Sertifikalar butonuna tıklar

  Scenario: TC-002 Kontrol Paneli kenar çubuğunda Sertifikaların görülmesi
    Given Kullanıcı Liste'ye tıklar
    Then Kullanıcı "Başarılar" başlığına tıklar
    And Kullanıcı "Sertifika Doğrulama" başlığına tıklar
    And Kullanıcı sayfada geri döner
    Then Kullanıcı "Tamamlama Sertifikaları" başlığına tıklar
    And Kullanıcı çıkış bağlantısını görene kadar sayfa aşağı kaydırılır
    And Kullanıcı Çıkış düğmesine tıklar

  Scenario: TC-003 Listeye tıklandığında sertifika istatistiklerinin görülmesi
    Given Kullanıcı Liste'ye tıklar
    Then "Sertifika istatistikleri" bağlantısının görünür ve etkin olduğunu onaylar
    And "Sertifikaları filtrele" bağlantısının görünür ve etkin olduğunu onaylar
    And Kullanıcı filtreleme simgelerini görür ve tıklar
    And Kullanıcı çıkış bağlantısını görene kadar sayfa aşağı kaydırılır
    And Kullanıcı Çıkış düğmesine tıklar

  Scenario: TC-004 Başarılar bağlantısında başarı istatistiklerinin görülmesi
    Given Kullanıcı "Başarılar" başlığına tıklar
    Then Kullanıcı "Sertifika istatistiklerim" başlığını görür
    And Kullanıcı "Sertifikaları filtrele" başlığını görür
    And Kullanıcı filtreleme simgelerini görür ve tıklar
    Then Kullanıcı "10 adımda Fransızca öğrenin" başlığına tıklar
    And Kullanıcı "Fransızcayı öğrendin mi? Hoş geldin!" başlığına tıklar
    And Kullanıcı "Sonuçları Göster" başlığına tıklar
    And Kullanıcı "Sertifikalar" butonuna tıklar
    And Kullanıcı "Sertifikalarım" bağlantısını görene kadar sayfa aşağı kaydırılır
    And Kullanıcı çıkış bağlantısını görene kadar sayfa aşağı kaydırılır
    And Kullanıcı Çıkış butonuna tıklar

  Scenario: TC-005 Sertifika Doğrulama ekranı
    Given Kullanıcı "Sertifika Doğrulama" başlığına tıklar
    And Kullanıcı kimlik ve captcha'yı görür
    Then Kullanıcı "Doğrula" başlığını görür
    And Kullanıcı sayfaya geri döner
    And Kullanıcı çıkış bağlantısını görene kadar sayfa aşağı kaydırılır
    And Kullanıcı Çıkış düğmesine tıklar

  Scenario: TC-006 Tamamlanmış Sertifikaların listelenmesi
    Given Kullanıcı "Tamamlama Sertifikaları" başlığına tıklar
    Then Kullanıcı "Sertifikaları filtrele" başlığını görür
    And Kullanıcı "10 adımda Fransızca öğrenin" başlığına tıklar
    And Kullanıcı "Sonuçları Göster" başlığına tıklar
    And Kullanıcı çıkış bağlantısını görene kadar sayfa aşağı kaydırılır
    And Kullanıcı Çıkış düğmesine tıklar
    And Kullanıcı sayfayı kapatır
