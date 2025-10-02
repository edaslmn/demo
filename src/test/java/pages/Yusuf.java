package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yusuf {

    WebDriver driver;

    public Yusuf(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ---------- LOGIN ALANI ----------
    @FindBy(xpath = "//a[normalize-space()='Giriş Yap' or normalize-space()='Login']")
    public WebElement loginBtn;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit' or contains(text(),'Giriş Yap') or contains(text(),'Login')]")
    public WebElement loginSubmitBtn;

    // ---------- LOGOUT ALANI ----------
    @FindBy(xpath = "//a[normalize-space()='Çıkış' or normalize-space()='Log out']")
    public WebElement logoutLink;

    @FindBy(xpath = "//button[contains(text(),'Çıkış') or contains(text(),'Log out')]")
    public WebElement logoutButton;

    // ---------- DİNAMİK LOCATOR YARDIMCILARI ----------
    public WebElement linkByText(String text) {
        return driver.findElement(By.xpath("//*[@id=\"panel-sidebar-scroll\"]/div[1]/div[2]/div/div/div/li[5]/a/span[2]"));
    }

    public WebElement buttonByText(String text) {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div[2]/div/form/button"));
    }
    public WebElement buttonBySertifika(String text) {
        return driver.findElement(By.xpath("//*[@id=\"panel-sidebar-scroll\"]/div[1]/div[2]/div/div/div/li[5]/a/span[2]"));
    }

    public WebElement byExactText(String text) {
        return driver.findElement(By.xpath("//*[@id=\"certificatesCollapse\"]/ul/li[1]/a"));
    }

    // ---------- FRAME / OVERLAY / MENU OPSİYONEL ----------
    public void dismissOverlaysIfPresent() {
        try {
            WebElement overlay = driver.findElement(By.cssSelector(".overlay, .popup, .modal"));
            if (overlay.isDisplayed()) {
                overlay.click();
            }
        } catch (Exception ignored) {}
    }

    public void openMobileMenuIfPresent() {
        try {
            WebElement menu = driver.findElement(By.cssSelector(".menu-toggle, .mobile-menu"));
            if (menu.isDisplayed()) {
                menu.click();
            }
        } catch (Exception ignored) {}
    }

    public WebElement getLoginTrigger() {
        try {
            return driver.findElement(By.xpath("//a[contains(@href,'login') or text()='Giriş Yap' or text()='Login']"));
        } catch (Exception e) {
            return null;
        }
    }

    public boolean switchIntoLoginFrameIfAny() {
        try {
            driver.switchTo().frame("loginFrame");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void switchDefault() {
        driver.switchTo().defaultContent();
    }
}
