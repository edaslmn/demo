package stepdefinitions;

import utilities.ConfigReader;
import utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import pages.Melih;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class MelihSteps {

    Melih melih = new Melih();



    @Given("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        DriverManager.getDriver().get(ConfigReader.getProperty("instuLearnUrl"));

    }

    @Then("kullanici anasayfadaki yaziya kadar iner")
    public void kullaniciAnasayfadakiYaziyaKadarIner() throws InterruptedException {


        // Elementi scroll et
        JSUtilities.scrollToElement(DriverManager.getDriver(), melih.becomeAnInstructorIsimElementi);


    }

    @When("Become an Instructor basliginin gorundugunu test eder")
    public void becomeAnInstructorBasligininGorundugunuTestEder() {

        Assert.assertTrue(melih.becomeAnInstructorIsimElementi.isDisplayed());
    }
  


    @When("Become an Instructor butonunun kullanılabilirligini test eder")
    public void becomeAnInstructorButonununKullanılabilirliginiTestEder() {

        Assertions.assertTrue(melih.becomeAnInstructorButonElementi.isDisplayed());
    }


    @Then("kullanici Become An Instructor butonuna kadar iner")
    public void kullaniciBecomeAnInstructorButonunaKadarIner() throws InterruptedException {

        // Elementi scroll et
        JSUtilities.scrollToElement(DriverManager.getDriver(), melih.becomeAnInstructorButonElementi);

    }


    @And("senkronizasyon icin {int} saniye bekler")
    public void senkronizasyonIcinSaniyeBekler(int saniye) {
        ReusableMethods.waitFor(saniye);
    }

    @When("Become an Instructor butonuna tıklar")
    public void kullanici_butona_js_ile_tiklar() {
        JSUtilities.clickWithJS(DriverManager.getDriver(), melih.becomeAnInstructorButonElementi);
    }

    @And("login sayfasına ulaşabildiğini test eder")
    public void loginSayfasınaUlaşabildiğiniTestEder() {

        Assertions.assertTrue(melih.logInToYourAccountYaziElementi.isDisplayed());
    }

    @And("login butonuna basar")
    public void loginButonunaBasar() {
        melih.loginButon.click();
    }

    @Then("email kutusuna {string} yazar")
    public void email_kutusuna_yazar(String email) {
        melih.emailBox.sendKeys(email);
    }

    @And("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String password) {
        melih.passwordBox.sendKeys(password);
    }

    @Then("login butonuna basarak giris yapar")
    public void loginButonunaBasarakGirisYapar() {
        melih.girisIcinLoginButonu.click();
    }

    @When("support butonunu gorene kadar asagi iner")
    public void supportButonunuGoreneKadarAsagiIner() {
        // Elementi scroll et
        JSUtilities.scrollToElement(DriverManager.getDriver(), melih.supportButonu );
    }

    @Then("support butonuna tiklar")
    public void supportButonunaTiklar() {
        JSUtilities.clickWithJS(DriverManager.getDriver(), melih.supportButonu);
    }

    @And("New linkinin gorunebildigini test eder")
    public void newLinkininGorunebildiginiTestEder() {
        Assertions.assertTrue(melih.supportNewButonu.isDisplayed());
    }

    @And("Courses support linkinin gorunebildigini test eder")
    public void coursesSupportLinkininGorunebildiginiTestEder() {
        Assertions.assertTrue(melih.supportCoursesSupoortButonu.isDisplayed());
    }

    @And("Tickets linkinin gorunebildigini test eder")
    public void ticketsLinkininGorunebildiginiTestEder() {
        Assertions.assertTrue(melih.supportTicketsButonu.isDisplayed());
    }
}
