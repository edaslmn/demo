package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Yusuf;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.List;

public class YusufSteps {

    WebDriver driver = DriverManager.getDriver();
    Yusuf yusuf = new Yusuf(driver);
// bitti
    @Given("İlgili URL ile ana sayfaya ulaşır")
    public void ilgili_url_ile_ana_sayfaya_ulaşır() {
        driver.get(ConfigReader.getProperty("loginPageUrl_Yusuf"));
        ReusableMethods.waitFor(2);
    }
// bitti
    @Given("Giriş Yap'a tıklar ve geçerli eğitmen e-postası ve şifresiyle giriş yapar")
    public void giriş_yap_a_tıklar_ve_geçerli_eğitmen_e_postası_ve_şifresiyle_giriş_yapar() {
        ReusableMethods.waitForVisibility(yusuf.emailBox, 10).sendKeys(ConfigReader.getProperty("team2InstructorEmail_Yusuf"));
        ReusableMethods.waitForVisibility(yusuf.passwordBox, 10).sendKeys(ConfigReader.getProperty("team2Password_Yusuf"));
        yusuf.buttonByText("Giriş Yap").click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanıcı Sertifikalar butonuna tıklar")
    public void kullanıcı_sertifikalar_butonuna_tıklar() {
        WebElement btn = yusuf.buttonBySertifika("Sertifikalar");
        JSUtilities.scrollToElement(driver, btn);
        btn.click();
        ReusableMethods.waitFor(5);
    }

    @Then("Kullanıcı {string} başlığına tıklar")
    public void kullanıcı_başlığına_tıklar(String string) {
        WebElement el = yusuf.byExactText(string);
        JSUtilities.scrollToElement(driver, el);
        el.click();
    }

    @Then("Kullanıcı sayfada geri döner")
    public void kullanıcı_sayfada_geri_döner() {
        driver.navigate().back();
    }

    @Then("Kullanıcı çıkış bağlantısını görene kadar sayfa aşağı kaydırılır")
    public void kullanıcı_çıkış_bağlantısını_görene_kadar_sayfa_aşağı_kaydırılır() {
        WebElement logout = yusuf.logoutLink;
        JSUtilities.scrollToElement(driver, logout);
    }

    @Then("Kullanıcı Çıkış düğmesine tıklar")
    public void kullanıcı_çıkış_düğmesine_tıklar() {
        yusuf.logoutButton.click();
    }

    @Given("Kullanıcı Liste'ye tıklar")
    public void kullanıcı_liste_ye_tıklar() {
        WebElement el = yusuf.byExactText("Liste");
        el.click();
        ReusableMethods.waitFor(3);
    }

    @Then("{string} bağlantısının görünür ve etkin olduğunu onaylar")
    public void bağlantısının_görünür_ve_etkin_olduğunu_onaylar(String string) {
        WebElement link = yusuf.linkByText(string);
        Assert.assertTrue(link.isDisplayed() && link.isEnabled());
    }

    @Then("Kullanıcı filtreleme simgelerini görür ve tıklar")
    public void kullanıcı_filtreleme_simgelerini_görür_ve_tıklar() {
        List<WebElement> filters = driver.findElements(By.cssSelector("[data-testid*='filter'], [class*='filter']"));
        for (WebElement f : filters) {
            if (f.isDisplayed() && f.isEnabled()) f.click();
        }
    }

    @Then("Kullanıcı {string} başlığını görür")
    public void kullanıcı_başlığını_görür(String string) {
        WebElement el = yusuf.byExactText(string);
        Assert.assertTrue(el.isDisplayed());
    }

    @Then("Kullanıcı {string} butonuna tıklar")
    public void kullanıcı_butonuna_tıklar(String string) {
        WebElement btn = yusuf.buttonByText(string);
        btn.click();
    }

    @Then("Kullanıcı {string} bağlantısını görene kadar sayfa aşağı kaydırılır")
    public void kullanıcı_bağlantısını_görene_kadar_sayfa_aşağı_kaydırılır(String string) {
        WebElement link = yusuf.linkByText(string);
        JSUtilities.scrollToElement(driver, link);
    }

    @Then("Kullanıcı Çıkış butonuna tıklar")
    public void kullanıcı_çıkış_butonuna_tıklar() {
        yusuf.logoutButton.click();
    }

    @Given("Kullanıcı kimlik ve captcha'yı görür")
    public void kullanıcı_kimlik_ve_captcha_yı_görür() {
        WebElement idField = driver.findElement(By.id("certificateId"));
        WebElement captchaField = driver.findElement(By.id("captcha"));
        Assert.assertTrue(idField.isDisplayed() && captchaField.isDisplayed());
    }

    @Then("Kullanıcı sayfaya geri döner")
    public void kullanıcı_sayfaya_geri_döner() {
        driver.navigate().back();
    }

    @Then("Kullanıcı sayfayı kapatır")
    public void kullanıcı_sayfayı_kapatır() {
        DriverManager.quitDriver();
    }
}
