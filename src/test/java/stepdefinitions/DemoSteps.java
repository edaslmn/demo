package stepdefinitions;

import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
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
    }

    @Given("Giriş Yap’a tıklar ve geçerli öğrenci e-posta ve şifresiyle giriş yapar.")
    public void giriş_yap_a_tıklar_ve_geçerli_öğrenci_e_posta_ve_şifresiyle_giriş_yapar() {
        demoPage.loginLink.click();
        demoPage.userNameLoginTextBox.sendKeys(ConfigReader.getProperty("edaEmail"));
        demoPage.passwordLoginTextBox.sendKeys(ConfigReader.getProperty("edaPassword"));
        demoPage.loginButton.click();

    }

    @Given("Kullanıcı sitenin Dashboard sayfasına erişir.")
    public void kullanıcı_sitenin_ana_sayfasına_erişir() {
        Assert.assertEquals(ConfigReader.getProperty("dashboardPageUrl"), DriverManager.getDriver().getCurrentUrl());
    }

    @Then("Kullanıcı Instructors başlığını görmelidir.")
    public void kullanıcı_ınstructors_başlığını_görmelidir() {
        Assert.assertTrue(demoPage.instructors.isDisplayed());
    }

    @When("Kullanıcı Instructors başlığına tıklar.")
    public void kullanıcı_ınstructors_başlığına_tıklar() {
        demoPage.instructors.click();
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
    }

    @When("Kullanıcı Management düğmesine tıklar.")
    public void kullanıcı_management_düğmesine_tıklar() {
        execute(demoPage.managementCheckBox);
        ReusableMethods.waitFor(2);
    }

    @Then("Sawyer Emerson metni görünür olmalıdır.")
    public void sawyer_emerson_metni_görünür_olmalıdır() {
        Assert.assertTrue(demoPage.sawyerEmerson.isDisplayed());
    }

    @Then("Eğitmen puanı {double} olarak görünmelidir.")
    public void eğitmen_puanı_olarak_görünmelidir(Double double1) {
       Assert.assertTrue(demoPage.instructorPoint.isDisplayed());
    }

    @Then("Kullanıcı Sawyer Emerson metnine tıklar.")
    public void kullanıcı_sawyer_emerson_metnine_tıklar() {
        demoPage.sawyerEmerson.click();
    }

    @When("Kullanıcı Courses düğmesine tıklar.")
    public void kullanıcı_courses_düğmesine_tıklar() {
       execute(demoPage.inctructorCourses);
    }

    @Then("Kullanıcı Reserve a Meeting düğmesine tıklar.")
    public void kullanıcı_reserve_a_meeting_düğmesine_tıklar() {
        scroll(demoPage.reserveMeeting);
        execute(demoPage.reserveMeeting);
    }

    @Then("Kullanıcı takvimden tarih seçer.")
    public void kullanıcı_takvimden_tarih_seçer() {
        scroll(demoPage.date);
       execute(demoPage.date);
    }

    @Then("Kullanıcı saat seçer.")
    public void kullanıcı_saat_seçer() {
        execute(demoPage.time);
    }

    @Then("Kullanıcı Meeting Type başlığı altında turu seçer.")
    public void kullanıcı_meeting_type_başlığı_altında_turu_seçer() {
       execute(demoPage.meetingType);
    }

    @Then("Kullanıcı Description alanına not girer.")
    public void kullanıcı_description_alanına_not_girer() {
        scroll(demoPage.descriptionCreatMeeting);
        demoPage.descriptionCreatMeeting.sendKeys("sgsggs");
    }

    @And("Kullanıcı Reserve A Meeting düğmesine tıklar.")
    public void kullanıcıReserveAMeetingDüğmesineTıklar() {
       execute(demoPage.creatReserveMeeting);
    }

    @Then("Kullanıcı Checkout düğmesine basar.")
    public void kullanıcı_checkout_düğmesine_basar() {
       execute(demoPage.checkOutButton);
    }

    @Then("Kullanıcı ödeme yöntemini seçer.")
    public void kullanıcı_ödeme_yöntemini_seçer() {
       demoPage.stripe.click();
    }

    @Then("Kullanıcı Start Payment düğmesine basar.")
    public void kullanıcı_start_payment_düğmesine_basar() {
       execute(demoPage.startPayment);
    }

    @Then("Kullanıcı gerekli bilgileri girer.")
    public void kullanıcı_gerekli_bilgileri_girer() {
        demoPage.paymentEmail.sendKeys(ConfigReader.getProperty("edaEmail"));
        demoPage.paymentCardNo.sendKeys("4242424242424242");
        demoPage.paymentCardExpiry.sendKeys("1228");
        demoPage.paymentCardCvc.sendKeys("123");
        demoPage.paymentBillingName.sendKeys("nihat öztürk");
    }

    @And("Kullanıcı ödeme yapar")
    public void kullanıcıÖdemeYapar() {
        demoPage.payment.click();
    }

    @Then("Randevu talebi başarıyla oluşturulmuş olmalıdır.")
    public void randevu_talebi_başarıyla_oluşturulmuş_olmalıdır() {
        Assert.assertTrue(demoPage.congratulationsText.isDisplayed());
    }

    @Then("My Panel metni görünür olmalıdır.")
    public void myPanelMetniGörünürOlmalıdır() {
        Assert.assertTrue(demoPage.myPanelButton.isDisplayed());
    }

    @When("Kullanıcı My Panel düğmesine tıklar.")
    public void kullanıcıMyPanelDüğmesineTıklar() {
        demoPage.myPanelButton.click();
    }

    @Then("Kullanıcı Meetings linkine tıklar")
    public void kullanıcıMeetingsLinkineTıklar() {
        demoPage.meetingsLink.click();
    }

    @Then("Kullanıcı My reservations linkine tıklar")
    public void kullanıcıMyReservationsLinkineTıklar() {
        demoPage.myReservationsLink.click();
    }

    @When("Kullanıcı filtreleme yapar")
    public void kullanıcıFiltrelemeYapar() {
        Select select = new Select(demoPage.dayFiltre);
        select.selectByValue("wednesday");

        select = new Select(demoPage.instructorFiltre);
        select.selectByValue("923");

        demoPage.showResultsButton.click();
    }

    @When("Kullanıcı toplantıya status seçer")
    public void kullanıcıToplantıyaStatusSeçer() {
        scroll(demoPage.strokesLinejoin);
        execute(demoPage.strokesLinejoin);
        scroll(demoPage.finishMeeting);
        execute(demoPage.finishMeeting);

    }

    @Then("Kullanıcı status onaylar")
    public void kullanıcıStatusOnaylar() {
        demoPage.statusConfirmation.click();
    }

    @And("Kullanıcı çıkış yapar.")
    public void kullanıcıÇıkışYapar() {
        execute(demoPage.logOutLink);
    }


    @And("Kullanıcı takvimden ay seçer.")
    public void kullanıcıTakvimdenAySeçer() {
        execute(demoPage.month);
    }
}
