package stepdefinitions;

import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DemoPage;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class DemoSteps {

    DemoPage demoPage = new DemoPage();

    public static void scroll(WebElement element){
        JSUtilities.scrollToElement(DriverManager.getDriver(), element);}

    public static void execute(WebElement element){
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", element);}


    @Given("İlgili URL ile ana sayfaya ulaşır.")
    public void ilgili_url_ile_ana_sayfaya_ulaşır() {
        DriverManager.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(2);
    }

    @Given("Giriş Yap’a tıklar geçerli öğretmen e-posta ve şifresiyle giriş yapar.")
    public void giriş_yap_a_tıklar_geçerli_öğretmen_e_posta_ve_şifresiyle_giriş_yapar() {
        demoPage.loginLink.click();
        ReusableMethods.waitFor(1);
        demoPage.userNameLoginTextBox.sendKeys(ConfigReader.getProperty("teaEdaEmail"));
        ReusableMethods.waitFor(2);
        demoPage.passwordLoginTextBox.sendKeys(ConfigReader.getProperty("edaPassword"));
        ReusableMethods.waitFor(2);
        demoPage.loginButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanıcı Meetings linkine tıklar")
    public void kullanıcıMeetingsLinkineTıklar() {
        scroll(demoPage.meetingsLink);
        ReusableMethods.waitFor(2);
        execute(demoPage.meetingsLink);
        ReusableMethods.waitFor(2);
    }

    @And("Kullanıcı Settings linkine tıklar")
    public void kullanıcıSettingsLinkineTıklar() {
        scroll(demoPage.settingsLink);
        execute(demoPage.settingsLink);
        ReusableMethods.waitFor(2);
    }

    @Given("Giriş Yap’a tıklar ve geçerli öğrenci e-posta ve şifresiyle giriş yapar.")
    public void giriş_yap_a_tıklar_ve_geçerli_öğrenci_e_posta_ve_şifresiyle_giriş_yapar() {
        demoPage.loginLink.click();
        ReusableMethods.waitFor(2);
        demoPage.userNameLoginTextBox.sendKeys(ConfigReader.getProperty("stuEdaEmail"));
        ReusableMethods.waitFor(2);
        demoPage.passwordLoginTextBox.sendKeys(ConfigReader.getProperty("edaPassword"));
        ReusableMethods.waitFor(2);
        demoPage.loginButton.click();
        ReusableMethods.waitFor(2);

    }

    @Given("Kullanıcı sitenin Dashboard sayfasına erişir.")
    public void kullanıcı_sitenin_ana_sayfasına_erişir() {
        Assert.assertEquals(ConfigReader.getProperty("dashboardPageUrl"), DriverManager.getDriver().getCurrentUrl());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanıcı Instructors başlığını görmelidir.")
    public void kullanıcı_ınstructors_başlığını_görmelidir() {
        Assert.assertTrue(demoPage.instructors.isDisplayed());
    }

    @When("Kullanıcı Instructors başlığına tıklar.")
    public void kullanıcı_ınstructors_başlığına_tıklar() {
        demoPage.instructors.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Search... placeholder’lı arama kutusu görünür ve aktif olmalıdır.")
    public void search_placeholder_lı_arama_kutusu_görünür_ve_aktif_olmalıdır() {
        Assert.assertTrue(demoPage.searchBoxIns.isDisplayed());
        Assert.assertTrue(demoPage.searchBoxIns.isEnabled());
    }

    @When("Kullanıcı Search düğmesine tıklar.")
    public void kullanıcı_search_düğmesine_tıklar() {
        demoPage.searchButton.click();
    }

    @When("Kullanıcı Available for Meetings düğmesine tıklar.")
    public void kullanıcı_available_for_meetings_düğmesine_tıklar() {
        execute(demoPage.availableForMeetings);
    }

    @When("Kullanıcı Free Meetings düğmesine tıklar.")
    public void kullanıcı_free_meetings_düğmesine_tıklar() {
        execute(demoPage.freeMeetings);
    }
    @When("Kullanıcı Discount düğmesine tıklar.")
    public void kullanıcı_discount_düğmesine_tıklar() {
        execute(demoPage.discountInstructorsStore);
        ReusableMethods.waitFor(2);
    }

    @When("Kullanıcı Management düğmesine tıklar.")
    public void kullanıcı_management_düğmesine_tıklar() {
        execute(demoPage.managementCheckBox);
        ReusableMethods.waitFor(2);
    }

    @Then("Instructor görünür olmalıdır.")
    public void instructorPerson_metni_görünür_olmalıdır() {
        Assert.assertTrue(demoPage.instructorPerson.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Eğitmen puanı {double} olarak görünmelidir.")
    public void eğitmen_puanı_olarak_görünmelidir(Double double1) {
       Assert.assertTrue(demoPage.instructorPoint.isDisplayed());
    }

    @Then("Kullanıcı Sawyer Emerson metnine tıklar.")
    public void kullanıcı_sawyer_emerson_metnine_tıklar() {
        demoPage.instructorPerson.click();
    }

    @When("Kullanıcı Courses düğmesine tıklar.")
    public void kullanıcı_courses_düğmesine_tıklar() {
       execute(demoPage.inctructorCourses);
    }

    @Then("Kullanıcı egitimci linkine tıklar düğmesine tıklar.")
    public void kullanıcı_egitimci_linkine_tıklar() {
        scroll(demoPage.instructorPerson);
        ReusableMethods.waitFor(2);
        execute(demoPage.instructorPerson);
    }

    @Then("Kullanıcı takvimden gun seçer.")
    public void kullanıcı_takvimden_gun_seçer() {
        scroll(demoPage.day);
       execute(demoPage.day);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanıcı saat seçer.")
    public void kullanıcı_saat_seçer() {
            demoPage.time.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanıcı Meeting Type başlığı altında turu seçer.")
    public void kullanıcı_meeting_type_başlığı_altında_turu_seçer() {
       scroll(demoPage.meetingType);
        execute(demoPage.meetingType);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanıcı Description alanına not girer.")
    public void kullanıcı_description_alanına_not_girer() {
        scroll(demoPage.descriptionCreatMeeting);
        demoPage.descriptionCreatMeeting.sendKeys("GEÇ KALMAMAYA GAYRET EDECEĞİM (:");
    }

    @And("Kullanıcı Reserve A Meeting düğmesine tıklar.")
    public void kullanıcıReserveAMeetingDüğmesineTıklar() {
       scroll(demoPage.creatReserveMeeting);
        execute(demoPage.creatReserveMeeting);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanıcı Checkout düğmesine basar.")
    public void kullanıcı_checkout_düğmesine_basar() {
       scroll(demoPage.checkOutButton);
        execute(demoPage.checkOutButton);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanıcı ödeme yöntemini seçer.")
    public void kullanıcı_ödeme_yöntemini_seçer() {
       demoPage.stripe.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanıcı Start Payment butonuna tıklar.")
    public void kullanıcı_start_payment_tıklar() {
        scroll(demoPage.startPayment);
        execute(demoPage.startPayment);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanıcı gerekli bilgileri girer.")
    public void kullanıcı_gerekli_bilgileri_girer() {
        demoPage.paymentEmail.sendKeys(ConfigReader.getProperty("stuEdaEmail"));
        ReusableMethods.waitFor(2);
        demoPage.paymentCardNo.sendKeys("4242424242424242");
        ReusableMethods.waitFor(2);
        demoPage.paymentCardExpiry.sendKeys("1228");
        ReusableMethods.waitFor(2);
        demoPage.paymentCardCvc.sendKeys("123");
        ReusableMethods.waitFor(2);
        demoPage.paymentBillingName.sendKeys("nihat öztürk");
        ReusableMethods.waitFor(2);
    }

    @And("Kullanıcı Payment butonuna tıklar")
    public void kullanıcıÖdemeYapar() {
        demoPage.payment.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Randevu talebi başarıyla oluşturulmuş olmalıdır.")
    public void randevu_talebi_başarıyla_oluşturulmuş_olmalıdır() {
        Assert.assertTrue(demoPage.congratulationsText.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("My Panel metni görünür olmalıdır.")
    public void myPanelMetniGörünürOlmalıdır() {
        Assert.assertTrue(demoPage.myPanelButton.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @When("Kullanıcı My Panel düğmesine tıklar.")
    public void kullanıcıMyPanelDüğmesineTıklar() {
        demoPage.myPanelButton.click();
        ReusableMethods.waitFor(3);
    }



    @Then("Kullanıcı My reservations linkine tıklar")
    public void kullanıcıMyReservationsLinkineTıklar() {
        demoPage.myReservationsLink.click();
        ReusableMethods.waitFor(2);
    }

    @When("Kullanıcı filtreleme yapar")
    public void kullanıcıFiltrelemeYapar() {
        Select select = new Select(demoPage.dayFiltre);
        select.selectByValue("monday");
        ReusableMethods.waitFor(3);
        select = new Select(demoPage.instructorFiltre);
        select.selectByValue("1708");
        ReusableMethods.waitFor(3);
        demoPage.showResultsButton.click();
    }

    @When("Kullanıcı toplantıya status seçer")
    public void kullanıcıToplantıyaStatusSeçer() {
        scroll(demoPage.strokesLinejoin);
        execute(demoPage.strokesLinejoin);
        ReusableMethods.waitFor(1);
        demoPage.finishMeeting.click();
        ReusableMethods.waitFor(2);

    }

    @Then("Kullanıcı status onaylar")
    public void kullanıcıStatusOnaylar() {
        demoPage.statusConfirmation.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı çıkış yapar.")
    public void kullanıcıÇıkışYapar() {
        scroll(demoPage.logOutLink);
        ReusableMethods.waitFor(2);
        execute(demoPage.logOutLink);
        ReusableMethods.waitFor(2);
    }


    @And("Kullanıcı takvimden ay seçer.")
    public void kullanıcıTakvimdenAySeçer() {
        scroll(demoPage.month);
        execute(demoPage.month);
        ReusableMethods.waitFor(2);
    }

    @And("Then Search arama kutusunda arama yapar")
    public void thenSearchAramaKutusundaAramaYapar() {
        demoPage.searchBoxIns.sendKeys("eda");
        demoPage.searchButton.click();
    }
//----------------------------------------------------------------------------------------------

    @And("Kullanıcı time sheet linkine tıklar")
    public void kullanıcıTimeSheetLinkineTıklar() {
        execute(demoPage.timeSheet);
        ReusableMethods.waitFor(2);
    }

    @And("Kullanıcı add time buttona tıklar")
    public void kullanıcıAddTimeButtonaTıklar() {
        execute(demoPage.addTimeButton);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanıcı toplantı başlangıc ve bitis saatini ayarlar")
    public void kullanıcıToplantıBaşlangıcVeBitisSaatiniAyarlar() {
        demoPage.startHour.click();
        ReusableMethods.waitFor(3);
        demoPage.startMinute.click();
        ReusableMethods.waitFor(3);
        demoPage.finishHour.click();
        ReusableMethods.waitFor(3);
        demoPage.finishMinute.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı meetingType'ı seçer")
    public void kullanıcıMeetingTypeISeçer() {
        Select select = new Select(demoPage.meetingTypeSelect);
        select.selectByValue("online");
        ReusableMethods.waitFor(2);
    }


    @And("Kulanıcı Description alanına not yazar")
    public void kulanıcıDescriptionAlanınaNotYazar() {
        demoPage.descriptionNote.sendKeys("LÜTFEN TOPLANTIYA GEÇ KALMAYINIZ :)");
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici toplantı zamanını kaydeder")
    public void kullaniciToplantıZamanınıKaydeder() {
        execute(demoPage.saveTimeButton);
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici toplantı saatlik ücreti belirler")
    public void kullaniciToplantıSaatlikÜcretiBelirler() {
        scroll(demoPage.amountTextBox);
        demoPage.amountTextBox.clear();
        demoPage.amountTextBox.sendKeys("25");
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici toplantı indirim oranını belirler")
    public void kullaniciToplantıIndirimOranınıBelirler() {
        scroll(demoPage.discountRateTextBox);
        demoPage.discountRateTextBox.clear();
        demoPage.discountRateTextBox.sendKeys("5");
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici toplantı ayarlarını kaydeder")
    public void kullaniciToplantıAyarlarınıKaydeder() {
        scroll(demoPage.meetingSettingSaveButton);
        execute(demoPage.meetingSettingSaveButton);
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici my profile linkine tıklar")
    public void kullaniciMyProfileLinkineTıklar() {

        scroll(demoPage.myProfileLink);
        execute(demoPage.myProfileLink);
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici açılan sayfada meetings ikonunu görüntüler")
    public void kullaniciAçılanSayfadaMeetingsIkonunuGörüntüler() {
        scroll(demoPage.meetingsIcon);
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici sağ üstteki profil ikonuna tıklar")
    public void kullaniciSağÜsttekiProfilIkonunaTıklar() {
        demoPage.profileIcon.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici açılır menüden logOut a tıklayıp çıkış yapar")
    public void kullaniciAçılırMenüdenLogOutATıklayıpÇıkışYapar() {
        demoPage.selectLogOut.click();
        ReusableMethods.waitFor(2);
    }

    @When("Kullanıcı SDET\\(Software Development Engineer in Test) düğmesine tıklar.")
    public void kullanıcıSDETSoftwareDevelopmentEngineerInTestDüğmesineTıklar() {
        scroll(demoPage.testerCheckBox);
        execute(demoPage.testerCheckBox);
        ReusableMethods.waitFor(2);
    }

    @And("Kullanıcı Reserve a Meeting baslıgına goruntuler.")
    public void kullanıcıReserveAMeetingBaslıgıniGoruntuler() {
        scroll(demoPage.reserveMeeting);
        ReusableMethods.waitFor(2);

    }

    @And("Kullanıcı Reserve a Meeting Description'a not yazar.")
    public void kullanıcıReserveAMeetingDescriptionANotYazar() {
        demoPage.reserveDescriptionTextBox.sendKeys("TOPLANTIYA GEÇ KALMAMAYA ÇALIŞACAĞIM (:");
        ReusableMethods.waitFor(2);
    }

    //---------------------------------------------------------------------------------------------

    @Given("Kullanici Login linkine tıklar")
    public void kullanici_login_linkine_tıklar() {
       demoPage.loginLink.click();
    }
    @Given("Kullanici Email ve Password text box larına data girmez")
    public void kullanici_email_ve_password_text_box_larına_data_girmez() {
    }

    @Then("login butonuna tıklar")
    public void login_butonuna_tıklar() {
        execute(demoPage.loginButton);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanıcı uyarı mesajini görüntüler negatif login testi başarılı")
    public void kullanıcı_uyarı_mesajini_görüntüler_negatif_login_testi_başarılı() {
    }

    @Then("Kullanici Email ve Password text box larına geçersiz data girer")
    public void kullanici_email_ve_password_text_box_larına_geçersiz_data_girer() {
        demoPage.userNameLoginTextBox.sendKeys("negatif@test");
        ReusableMethods.waitFor(2);
        demoPage.passwordLoginTextBox.sendKeys("hsgdfsfd");
        ReusableMethods.waitFor(2);
    }

    @When("Kullanıcı Email textbox'ına geçerli E-posta Password text box'ına geçersiz şifre girer")
    public void kullanıcı_email_textbox_ına_geçerli_e_posta_password_text_box_ına_geçersiz_şifre_girer() {
        demoPage.userNameLoginTextBox.clear();
        demoPage.userNameLoginTextBox.sendKeys(ConfigReader.getProperty("teaEdaEmail"));
        ReusableMethods.waitFor(2);
        demoPage.passwordLoginTextBox.clear();
        demoPage.passwordLoginTextBox.sendKeys("hsgdfsfd");
        ReusableMethods.waitFor(2);
    }
    @When("Kullanıcı Email textbox'ına geçersiz E-posta Password text box'ına geçerli şifre girer")
    public void kullanıcı_email_textbox_ına_geçersiz_e_posta_password_text_box_ına_geçerli_şifre_girer() {
        demoPage.userNameLoginTextBox.clear();
        demoPage.userNameLoginTextBox.sendKeys("negatif@test");
        ReusableMethods.waitFor(2);
        demoPage.passwordLoginTextBox.clear();
        demoPage.passwordLoginTextBox.sendKeys(ConfigReader.getProperty("edaPassword"));
        ReusableMethods.waitFor(2);
    }
    @When("Kullanıcı Email textbox'ına geçersiz formatta data girer")
    public void kullanıcı_email_textbox_ına_geçersiz_formatta_data_girer() {
        demoPage.userNameLoginTextBox.clear();
        demoPage.userNameLoginTextBox.sendKeys("negatif test");
        ReusableMethods.waitFor(2);
    }
    @When("Kullanıcı Password textbox'ına geçersiz uzunlukta data girer")
    public void kullanıcı_password_textbox_ına_geçersiz_uzunlukta_data_girer() {
        demoPage.userNameLoginTextBox.clear();
        demoPage.userNameLoginTextBox.sendKeys(ConfigReader.getProperty("teaEdaEmail"));
        ReusableMethods.waitFor(1);
        demoPage.passwordLoginTextBox.clear();
        demoPage.passwordLoginTextBox.sendKeys("1");
        ReusableMethods.waitFor(1);
    }
    @Then("Kullanici Email textbox'ına geçerli E-posta Password textbox'ına geçerli şifre girer")
    public void kullanici_email_textbox_ına_geçerli_e_posta_password_textbox_ına_geçerli_şifre_girer() {
        demoPage.userNameLoginTextBox.clear();
        demoPage.userNameLoginTextBox.sendKeys(ConfigReader.getProperty("teaEdaEmail"));
        ReusableMethods.waitFor(1);
        demoPage.passwordLoginTextBox.clear();
        demoPage.passwordLoginTextBox.sendKeys(ConfigReader.getProperty("edaPassword"));
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Courses linkine tıklar kurslar sayfasın yönlenir")
    public void kullanici_courses_linkine_tıklar_kurslar_sayfasın_yönlenir() {
        execute(demoPage.courses);
        ReusableMethods.waitFor(1);
    }
    @Then("Kullanici Search text box'ında arama yapar")
    public void kullanici_search_text_box_ında_arama_yapar() {
        demoPage.courseSearch.sendKeys("Cyber");
        ReusableMethods.waitFor(1);
        execute(demoPage.courseSearchButton);
        ReusableMethods.waitFor(1);
    }
    @Then("Kullanici aradığı kurs linkine tıklar")
    public void kullanici_aradığı_kurs_linkine_tıklar() {
        scroll(demoPage.sdetCourseLink);
        ReusableMethods.waitFor(1);
        execute(demoPage.sdetCourseLink);
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici Buy Now butonuna tıklar")
    public void kullanici_buy_now_butonuna_tıklar() {
        execute(demoPage.buyNowButton);
        ReusableMethods.waitFor(2);
    }
    @Given("kullanıcı ödeme sayfasına yönlenir")
    public void kullanıcı_ödeme_sayfasına_yönlenir() {
        ReusableMethods.waitFor(1);
    }

    @Given("kullanıcı ödeme formuna data girmez")
    public void kullanıcı_ödeme_formuna_data_girmez() {

    }
    @Then("Kullanıcı uyarı mesajını görüntüler negatif ödeme testi başarılı")
    public void kullanıcı_uyarı_mesajını_görüntüler_negatif_ödeme_testi_başarılı() {
        ReusableMethods.waitFor(2);
    }
    @When("Kullanici Geçersiz e-posta girer")
    public void kullanici_geçersiz_e_posta_girer() {
       demoPage.paymentEmail.sendKeys("eda");
        ReusableMethods.waitFor(2);
    }
    @When("kullanıcı Eksik kart numarası girer")
    public void kullanıcı_eksik_kart_numarası_girer() {
        demoPage.userNameLoginTextBox.sendKeys("@gmail.com");
        ReusableMethods.waitFor(2);
        demoPage.paymentCardNo.sendKeys("42424242");
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanıcı son kullanımı tarihi dolmuş kart bilgisi girer")
    public void kullanıcı_son_kullanımı_tarihi_dolmuş_kart_bilgisi_girer() {
        demoPage.paymentCardNo.clear();
        demoPage.paymentCardNo.sendKeys(ConfigReader.getProperty("cardNo"));
        ReusableMethods.waitFor(2);
        demoPage.paymentCardExpiry.sendKeys("1210");
        ReusableMethods.waitFor(2);
        demoPage.paymentCardExpiry.sendKeys(Keys.CONTROL + "a");
        demoPage.paymentCardExpiry.sendKeys(Keys.DELETE);
    }

    @And("Kullanıcı tüm alanları geçerli bilgileri girer.")
    public void kullanıcıTümAlanlarıGeçerliBilgileriGirer() {
        demoPage.paymentCardExpiry.sendKeys(Keys.CONTROL + "a");
        demoPage.paymentCardExpiry.sendKeys(Keys.DELETE);
        demoPage.paymentCardExpiry.sendKeys("1026");
        ReusableMethods.waitFor(2);
        demoPage.paymentCardCvc.sendKeys("123");
        ReusableMethods.waitFor(2);
        demoPage.paymentBillingName.sendKeys("Eda Salman");
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanıcı ödeme yapıldığını görüntüler.")
    public void kullanıcı_ödeme_yapıldığını_görüntüler() {
    }


}




















