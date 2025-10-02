package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {

    public DemoPage(){
        PageFactory.initElements(utilities.DriverManager.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"navbarContent\"]/ul/li[4]/a")
    public WebElement instructors;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/div[2]/div[2]/a[1]")
    public WebElement loginLink;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement userNameLoginTextBox;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement passwordLoginTextBox;

    @FindBy (xpath = "//*[@id=\"app\"]/div[3]/div/div[2]/div/form/button")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"panelSidebar\"]/div[1]/a/img")
    public WebElement profileIcon;


    @FindBy (xpath = "//*[@id=\"app\"]/section/div/div/div/div/div/form/div/input")
    public WebElement searchBoxIns;

    @FindBy (xpath = "//*[@id=\"app\"]/section/div/div/div/div/div/form/div/button")
    public WebElement searchButton;

    @FindBy (xpath = "//*[@id=\"navbarContent\"]/ul/li[1]/div/ul/li")
    public WebElement categories;

    @FindBy (xpath = "//*[@id=\"filtersForm\"]/div[2]/div/div[1]")
    public WebElement categoriesCheckBox;

    @FindBy (xpath = "//*[@id=\"filtersForm\"]/div[2]/div/div[7]/label")
    public WebElement managementCheckBox;

    //filtering icons > Instructors------------------------------------------------------------------------------------------------
    @FindBy (xpath = "//*[@id=\"topFilters\"]/div/div[1]/div[1]/label")
    public WebElement availableForMeetings;

    @FindBy (xpath = "//*[@id=\"topFilters\"]/div/div[1]/div[2]/label")
    public WebElement freeMeetings;

    @FindBy (xpath = "//*[@id=\"topFilters\"]/div/div[1]/div[3]/label")
    public WebElement discountInstructorsStore;

    @FindBy (xpath = "//*[@id=\"topFilters\"]/div/div[2]/select")
    public WebElement sortByInstructorsStore;
//-----------------------------------------------------------------------------------------------------------------------------

    @FindBy (xpath = "//*[@id=\"bestRateInstructorsSwiper\"]/div/div[1]/div/a/h3" )
    public WebElement sawyerEmerson;

    @FindBy (xpath = "//*[@id=\"bestRateInstructorsSwiper\"]/div/div[1]/div/div[2]/div")
    public WebElement instructorPoint;

    @FindBy (xpath = "//*[@id=\"webinars-tab\"]")
    public WebElement inctructorCourses;

    @FindBy (xpath = "//*[@id=\"bestRateInstructorsSwiper\"]/div/div[1]/div/div[5]/a")
    public WebElement reserveMeeting;

    @FindBy (xpath = "//*[@id=\"plotId\"]/div[1]/div[3]")
    public WebElement month;

    @FindBy (xpath = "//*[@id=\"plotId\"]/div[2]/div/div/table/tbody/tr[3]/td[4]/span")
    public WebElement date;

    @FindBy (xpath = "//*[@id=\"availableTimes\"]/div/label")
    public WebElement time;

    @FindBy (xpath = "//*[@id=\"PickTimeBody\"]/div[4]/div/div/div[2]/label")
    public WebElement meetingType;

    @FindBy (xpath = "//*[@id=\"PickTimeBody\"]/div[5]/textarea")
    public WebElement descriptionCreatMeeting;

    @FindBy (xpath = "//*[@id=\"PickTimeBody\"]/div[6]/button")
    public WebElement creatReserveMeeting;

    @FindBy (xpath = "//*[@id=\"cartForm\"]/div/div[2]/section/div/button")
    public WebElement checkOutButton;

    @FindBy (xpath = "//*[@id=\"app\"]/section[2]/form/div[1]/div[1]/label")
    public WebElement stripe;

    @FindBy (xpath = "//*[@id=\"paymentSubmit\"]")
    public WebElement startPayment;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement paymentEmail;

    @FindBy (xpath = "//*[@id=\"cardNumber\"]")
    public WebElement paymentCardNo;

    @FindBy (xpath = "//*[@id=\"cardExpiry\"]")
    public WebElement paymentCardExpiry;

    @FindBy (xpath = "//*[@id=\"cardCvc\"]")
    public WebElement paymentCardCvc;

    @FindBy (xpath = "//*[@id=\"billingName\"]")
    public WebElement paymentBillingName;

    @FindBy (xpath = "//*[@id=\"payment-form\"]/div/div/div/div[3]/div/div[2]/div/button/div[3]")
    public WebElement payment;

    @FindBy (xpath = "//*[@id=\"app\"]/div[3]/div[2]/h2")
    public WebElement congratulationsText;

     @FindBy (xpath = "//*[@id=\"app\"]/div[3]/div[2]/a")
    public WebElement myPanelButton;

    @FindBy (xpath = "//*[@id=\"panel-sidebar-scroll\"]/div[1]/div[2]/div/div/div/li[15]/a/span[2]")
    public WebElement logOutLink;

    @FindBy (xpath = "//*[@id=\"panel-sidebar-scroll\"]/div[1]/div[2]/div/div/div/li[4]/a/span[2]")
    public WebElement meetingsLink;

    @FindBy (xpath = "//*[@id=\"meetingCollapse\"]/ul/li[1]/a")
    public WebElement myReservationsLink;

    @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[3]/div[2]/div/div/div/table/tbody/tr[1]/td[9]/div/button")
    public WebElement strokesLinejoin;

    @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[3]/div[2]/div/div/div/table/tbody/tr[2]/td[9]/div/div/button[2]")
    public WebElement finishMeeting;

    @FindBy (xpath = "//*[@id=\"day\"]")
    public WebElement dayFiltre;

     @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[2]/div/form/div[2]/div/div[2]/div/div[1]/div/select")
    public WebElement instructorFiltre;

    @FindBy (xpath = "//*[@id=\"panel_app\"]/div[2]/div[3]/section[2]/div/form/div[3]/button")
    public WebElement showResultsButton;

    @FindBy (xpath = "//*[@id=\"finishReserve\"]")
    public WebElement statusConfirmation;


/*
    @FindBy (xpath = "")
    public WebElement;

     @FindBy (xpath = "")
    public WebElement;

    @FindBy (xpath = "")
    public WebElement;

    @FindBy (xpath = "")
    public WebElement;

    @FindBy (xpath = "")
    public WebElement;

    @FindBy (xpath = "")
    public WebElement;

    @FindBy (xpath = "")
    public WebElement;

 */

}
