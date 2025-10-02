Feature: US004 Kullanici  sitenin islevlerinden yararlanmak icin siteye kayit olabilmeli


  Scenario: Kullanici ilgili url i yazdığında anasayfaya erişebilmeli
    Given Kullanici "url" anasayfaya gider



  Scenario: Kullanici  ana sayfa barında register linkini gorup tiklayabilmeli
    Given Kullanici "url" anasayfaya gider
    And Kullanici senkronizasyon için 5 saniye bekler
    When Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder
    And Kullanici senkronizasyon için 5 saniye bekler
    Then Kullanici  register linkini tiklar




  Scenario:Kullanici  register sayfasının sol bolumunde ilgili resmi goruyor olmali    //3
    Given Kullanici "url" anasayfaya gider
    When Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder
    And Kullanici senkronizasyon için 3 saniye bekler
    Then Kullanici  register linkini tiklar
    And Kullanici senkronizasyon için 3 saniye bekler
    Then Kullanici register sayfasının sol bolumunde ilgili resmin gorunur oldugunu test eder


  Scenario: Kullanici register sayfasının sag bolumunde signup formunun gorunur ve aktif olduğunu test eder
    Given Kullanici "url" anasayfaya gider
    When Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder
    And Kullanici senkronizasyon için 3 saniye bekler
    Then Kullanici  register linkini tiklar
    And Kullanici senkronizasyon için 3 saniye bekler
    And Kullanici register sayfasının sag bolumunde signup formunu gorur
    And Kullanici senkronizasyon için 3 saniye bekler
    And Kullanici email texboxını görür
    And  Kullanici email texboxına tıklar ve aktifligini test eder



  Scenario: Kullanici register sayfasında  signup butonunun  gorunur ve aktif olduğunu test eder
    Given Kullanici "url" anasayfaya gider
    When Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder
    And Kullanici senkronizasyon için 3 saniye bekler
    Then Kullanici  register linkini tiklar
    And Kullanici senkronizasyon için 3 saniye bekler
    When Kullanici register sayfasinda signup butonunu gorur ve goruldugunu test eder
    Then Kullanici register sayfasinda signup butonunu tiklar ve aktifligini test eder

  @cenn
  Scenario:Kullanici geçerli bilgilerle giris yapabilmeli               //6
    Given Kullanici "url" anasayfaya gider
    When Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder
    And Kullanici senkronizasyon için 3 saniye bekler
    Then Kullanici  register linkini tiklar
    And Kullanici senkronizasyon için 3 saniye bekler
    And Kullanıcı account type nı  student olarak secer ve tıklar
    And Kullanici senkronizasyon için 3 saniye bekler
    Then Kullanici  email olarak "gecerliEmail" girer
    Then Kullanici  fullName olarak "gecerliFullName" girer
    Then Kullanici  password olarak "gecerliPassword" girer
    Then Kullanici  retype password olarak "gecerliRetypePassword" girer
    And Kullanici time zone alanina tiklar
    Then Kullanici acilan menuden America/New_York  secenegini tiklar
    And Kullanici I agree with terms & rules checbox ını tiklar
    When Kullanici signup butonuna tiklar
    And basarili giris yapabildigini test eder



  Scenario: Kullanici gecersiz email ile giris yapamamali        //7

    Given Kullanici "url" anasayfaya gider
    When Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder
    And Kullanici senkronizasyon için 3 saniye bekler
    Then Kullanici  register linkini tiklar
    And Kullanici senkronizasyon için 3 saniye bekler
    And Kullanıcı account type nı  student olarak secer ve tıklar
    And Kullanici email texboxına tıklar ve aktifligini test eder
    Then Kullanici  email olarak "gecersizEmail" girer
    Then Kullanici  fullName olarak "gecerliFullName" girer
    Then Kullanici  password olarak "gecerliPassword" girer
    Then Kullanici  retype password olarak "gecerliRetypePassword" girer
    And Kullanici time zone alanina tiklar
    Then Kullanici acilan menuden America/New_York  secenegini tiklar
    And Kullanici I agree with terms & rules checbox ını tiklar
    When Kullanici signup butonuna tiklar
    And basarili giris yapılamadıgını  test eder




  Scenario:  Kullanici gecersiz password ile giris yapamamali     //8
    Given Kullanici "instLUrl" anasayfaya gider
    When Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder
    And Kullanici senkronizasyon için 3 saniye bekler
    Then Kullanici  register linkini tiklar
    And Kullanici senkronizasyon için 3 saniye bekler
    And Kullanıcı account type nı  student olarak secer ve tıklar
    And  Kullanici email texboxına tıklar  ve aktifligini test eder
    Then Kullanici  email olarak "gecerliEmail" girer
    And Kullanici fullName texbox ina tiklar
    Then Kullanici  fullName olarak "gecerliFullName" girer
    And Kullanici password texbox ina tiklar
    Then Kullanici  password olarak "gecersizPassword" girer
    And Kullanici retype password texbox ina tiklar
    Then Kullanici  retype password olarak "gecerliRetypePassword" girer
    And Kullanici time zone alanina tiklar
    Then  Kullanici acilan menuden America/New_York  secenegini tıklar
    And Kullanici I agree with terms & rules checbox ını tiklar
    When Kullanici signup butonuna tiklar
    And basarili giris yapılamadıgını  test eder

  Scenario:Kullanici email alanini bos biraktiginda uyarı mesaji almali       //9
    Given Kullanici "instLUrl" anasayfaya gider
    When Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder
    And Kullanici senkronizasyon için 3 saniye bekler
    Then Kullanici  register linkini tiklar
    And Kullanici senkronizasyon için 3 saniye bekler
    And Kullanıcı account type nı  student olarak secer ve tıklar
    And  Kullanici email texboxına tıklar  ve aktifligini test eder
    Then Kullanici  email alanini bos birakir
    And Kullanici fullName texbox ina tiklar
    Then Kullanici  fullName olarak "gecerliFullName" girer
    And Kullanici password texbox ina tiklar
    Then Kullanici  password olarak "gecersizPassword" girer
    And Kullanici retype password texbox ina tiklar
    Then Kullanici  retype password olarak "gecerliRetypePassword" girer
    And Kullanici time zone alanina tiklar
    Then  Kullanici acilan menuden America/New_York  secenegini tıklar
    And Kullanici I agree with terms & rules checbox ını tiklar
    When Kullanici signup butonuna tiklar
    And uyari mesaji aldıgini test eder


  Scenario: Kullanici  full name  alanini bos biraktiginda uyari mesaji almali   //10
    Given Kullanici "instLUrl" anasayfaya gider
    When Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder
    And Kullanici senkronizasyon için 3 saniye bekler
    Then Kullanici  register linkini tiklar
    And Kullanici senkronizasyon için 3 saniye bekler
    And Kullanıcı account type nı  student olarak secer ve tıklar
    And  Kullanici email texboxına tıklar  ve aktifligini test eder
    Then Kullanici  email olarak "gecerliEmail" girer
    And Kullanici fullName texbox ina tiklar
    Then Kullanici  fullName alanini bos birakir
    And Kullanici password texbox ina tiklar
    Then Kullanici  password olarak "gecersizPassword" girer
    And Kullanici retype password texbox ina tiklar
    Then Kullanici  retype password olarak "gecerliRetypePassword" girer
    And Kullanici time zone alanina tiklar
    Then  Kullanici acilan menuden America/New_York  secenegini tıklar
    And Kullanici I agree with terms & rules checbox ını tiklar
    When Kullanici signup butonuna tiklar
    And uyari mesaji aldıgini test eder


  Scenario: Kullanici password  alanini bos biraktiginda uyari mesaji almali    //11
  Scenario: Kullanici retype password alanini bos biraktiginda uyari mesaji almali     //12
  Scenario: Kullanici "I agree with terms & rules" alanini bos biraktiginda uyari mesaji almali   //13
  Scenario:  Kullanici  signup butonuna tikladiginda  login sayfasina ulasabilmeli   //14
























