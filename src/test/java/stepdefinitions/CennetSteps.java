package stepdefinitions;


import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.Cennet;
import utilities.WaitHelper;




public class CennetSteps {
    //  private static final Logger logger = LogManager.getLogger(GoogleSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Cennet cennet = new Cennet(driver);
    BasePage basepage = new BasePage(driver);
    Actions actions = new Actions(driver);


    @Given("Kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String url) {
        DriverManager.getDriver().get(ConfigReader.getProperty(url));
        // logger.info("Kullanici InstuLearn anasayfaya gider");

    }

    @Given("Kullanici senkronizasyon için {int} saniye bekler")
    public void kullanici_senkronizasyon_için_saniye_bekler(Integer saniye) {
        WaitHelper.bekle(3);

    }


    @Then("Kullanici title in {string} oldugunu test eder")
    public void kullaniciTitleInOldugunuTestEder(String expectedTitle) {
        String actualTitle = DriverManager.getDriver().getTitle();
        System.out.println(DriverManager.getDriver().getTitle());
        Assertions.assertEquals(expectedTitle, actualTitle);
        // logger.info("Kullanici title in \"Home | InstuLearn\" oldugunu test eder");
    }

    //---------------------------------------------------------------------------------------------------------
    //US004   tc001
    @Given("Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder")
    public void kullaniciAnaSayfaBarindaRegisterLinkiniGorurVeGoruldugunuTestEder() {
        Assertions.assertTrue(cennet.registerButton.isDisplayed());
        //  logger.info("Kullanici ana sayfa barinda register linkini gorur ve goruldugunu test eder");
    }

    //Tc002
    @And("Kullanici  register linkini tiklar")
    public void kullaniciRegisterLinkiniTiklar() {
        basepage.click(cennet.registerButton);
        //  logger.info("Kullanici  register linkini tiklar");
    }

    //TC003

    @Then("Kullanici register sayfasının sol bolumunde ilgili resmin gorunur oldugunu test eder")
    public void kullanici_register_sayfasının_sol_bolumunde_ilgili_resmin_gorunur_oldugunu_test_eder() {

        Assertions.assertTrue(cennet.registerImage.isDisplayed());

    }

    //Tc004
    @Given("Kullanici register sayfasının sag bolumunde signup formunu gorur")
    public void kullanici_register_sayfasının_sag_bolumunde_signup_formunu_gorur() {
        Assertions.assertTrue(cennet.signupForm.isDisplayed());

    }

    @Given("Kullanici email texboxını görür")
    public void kullanici_email_texboxını_görür() {
        Assertions.assertTrue(cennet.emailtexbox.isDisplayed());

    }

    @Given("Kullanici email texboxına tıklar ve aktifligini test eder")
    public void kullanici_email_texboxına_tıklar_ve_aktifligini_test_eder() {
        cennet.emailtexbox.click();

    }

    //Tc005
    @When("Kullanici register sayfasinda signup butonunu gorur ve goruldugunu test eder")
    public void kullanici_register_sayfasinda_signup_butonunu_gorur_ve_goruldugunu_test_eder() {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Assertions.assertTrue(cennet.signupButton.isDisplayed());

    }

    @Then("Kullanici register sayfasinda signup butonunu tiklar ve aktifligini test eder")
    public void kullanici_register_sayfasinda_signup_butonunu_tiklar_ve_aktifligini_test_eder() {
        cennet.signupButton.click();

    }

    //TC006
    @Then("Kullanıcı account type nı  student olarak secer ve tıklar")
    public void kullanıcı_account_type_nı_student_olarak_secer_ve_tıklar() {
        cennet.studentButton.click();

    }

    @Then("Kullanici  email olarak {string} girer")
    public void kullanici_email_olarak_girer(String gecerliEmail) {
      cennet.emailtexbox.sendKeys(ConfigReader.getProperty(gecerliEmail));

    }
    @Then("Kullanici  fullName olarak {string} girer")
    public void kullanici_full_name_olarak_girer(String gecerliFullName) {
        cennet.fullNameTexbox.sendKeys(ConfigReader.getProperty(gecerliFullName));

    }
    @Then("Kullanici  password olarak {string} girer")
    public void kullanici_password_olarak_girer(String gecerliPassword) {
        cennet.passwordTexbox.sendKeys(ConfigReader.getProperty(gecerliPassword));

    }
    @Then("Kullanici  retype password olarak {string} girer")
    public void kullanici_retype_password_olarak_girer(String gecerliRetypePassword) {
        cennet.rtypePasswordTexbox.sendKeys(ConfigReader.getProperty(gecerliRetypePassword));

    }
    @Then("Kullanici time zone alanina tiklar")
    public void kullanici_time_zone_alanina_tiklar() {
        cennet.timeZoneDropDown.click();

    }
    @Then("Kullanici acilan menuden America\\/New_York  secenegini tiklar")
    public void kullanici_acilan_menuden_america_new_york_secenegini_tiklar() {
        Select select =new Select( cennet.timeZoneDropDown);
        select.selectByValue("America/New_York");

    }
    @Then("Kullanici I agree with terms & rules checbox ını tiklar")
    public void kullanici_ı_agree_with_terms_rules_checbox_ını_tiklar() {
        cennet.termsRulesCheckbox.click();
    }
    @When("Kullanici signup butonuna tiklar")
    public void kullanici_signup_butonuna_tiklar() {
        cennet.signupButton.click();
    }
    @When("basarili giris yapabildigini test eder")
    public void basarili_giris_yapabildigini_test_eder() {

    }
}