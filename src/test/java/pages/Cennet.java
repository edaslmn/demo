package pages;

import utilities.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cennet extends BasePage {
    public Cennet(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@class='py-5 px-10 text-dark-blue font-14']")
    public   WebElement registerButton;

    @FindBy(xpath= "(//*[@class='img-cover'])[2]")
    public   WebElement registerImage;

    @FindBy(className= "login-card")
    public   WebElement signupForm;

    @FindBy(xpath= "(//*[@class='form-control '])[1]")
    public   WebElement emailtexbox;

    @FindBy(xpath= "//*[@class='btn btn-primary btn-block mt-20']")
    public   WebElement signupButton;

    @FindBy(xpath= "(//*[@name='full_name'])[2]")
    public   WebElement fullNameTexbox  ;

    @FindBy(xpath= "(//*[@class='wizard-custom-radio-item flex-grow-1'])[1]")
    public   WebElement studentButton ;

    @FindBy(xpath= "(//*[@id='password'])[3]")
    public   WebElement passwordTexbox  ;

    @FindBy(xpath= "(//*[@id='confirm_password'])[2]")
    public   WebElement rtypePasswordTexbox  ;

    @FindBy(id= "select2-timezone-g4-container")
    public   WebElement timeZoneDropDown  ;

    @FindBy(className= "custom-control-input")
    public   WebElement  termsRulesCheckbox  ;




    @FindBy(className= "invalid-feedback")
    public   WebElement  TheEmailMustBeAValidEmailAddressMesaji ;

    @FindBy(xpath= "//*[@class='invalid-feedback']")
    public   WebElement  ThePasswordConfirmationDoesNotMatchMesaji ;


    @FindBy(xpath= "//*[@class='ml-4 text-lg text-gray-500 uppercase tracking-wider']")
    public   WebElement pageExpiredHataKodu  ;




}
