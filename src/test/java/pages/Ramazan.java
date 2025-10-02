package pages;


import utilities.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Ramazan {

    public Ramazan() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "(//*[.='Bronze'])[1]")
    public WebElement bronzeButton;

    @FindBy(xpath = "(//*[.='Gold'])[1]")
    public WebElement goldButton;

    @FindBy(xpath = "(//*[.='Silver'])[1]")
    public WebElement silverButton;

    @FindBy(xpath = "(//*[.='Purchase'])[1]")
    public WebElement purchaseBronzeButton;

    @FindBy(xpath = "(//*[.='Purchase'])[2]")
    public WebElement purchaseGoldButton;

    @FindBy(xpath = "(//*[.='Purchase'])[3]")
    public WebElement purchaseSilverButton;

    @FindBy(xpath = "//*[.='Subscribe Now!']")
    public WebElement subscribeNowText;

    @FindBy(xpath = "//*[.='Login']")
    public WebElement loginButon;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "password")
    public WebElement passWordTextBox;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-block mt-20']")
    public WebElement LoginButton_Under_emailandPassword;

    /// /*[@class='btn btn-primary btn-block mt-20']

    @FindBy(xpath = "//*[@alt='Certificate validation - Home']")
    public WebElement certificateValidationLink;

    //*[@alt='Certificate validation - Home']

    @FindBy(xpath = "(//*[@class='img-cover rounded-sm'])[2]")
    public WebElement validatinText;

    @FindBy(xpath = "(//*[.='Dashboard'])[1]")
    public WebElement DashboardLink;

    @FindBy(xpath = "(//*[.='Courses'])[3]")
    public WebElement CourcesLinkUnderDasboardText;

    @FindBy(xpath = "(//*[.='Meetings'])[1]")
    public WebElement MeetingsLinkUnderDasboardText;

    @FindBy(xpath = "//*[.='Quizzes']")
    public WebElement QuizzesLinkUnderDasboardText;

    @FindBy(xpath = "//*[.='Certificates']")
    public WebElement CertificatesLinkUnderDasboardText;

    @FindBy(xpath = "//*[@class='font-14 text-dark-blue font-weight-500']")
    public List<WebElement> dashBoardAltındakiTumElementer;






    //  @FindBy(className = "btn btn-primary btn-block mt-50")
    //y  public WebElement purchaseButtonList;


}
