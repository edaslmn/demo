package pages;

import utilities.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Melih {

    public Melih(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"app\"]/section[13]/div/div[1]/div/h2")
    public WebElement becomeAnInstructorIsimElementi;

    @FindBy(xpath = "//*[@id=\"app\"]/section[13]/div/div[1]/div/div/a")
    public WebElement becomeAnInstructorButonElementi;


    @FindBy(xpath = "//*[@class='font-20 font-weight-bold']")
    public WebElement logInToYourAccountYaziElementi;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[2]/div[2]/a[1]")
    public WebElement loginButon;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div[2]/div/form/button")
    public WebElement girisIcinLoginButonu;

    @FindBy(xpath = "//*[@id=\"panel-sidebar-scroll\"]/div[1]/div[2]/div/div/div/li[10]/a/span[2]")
    public WebElement supportButonu;

    @FindBy(xpath = "//*[@id=\"supportCollapse\"]/ul/li[1]/a")
    public WebElement supportNewButonu;

    @FindBy(xpath = "//*[@id=\"supportCollapse\"]/ul/li[2]/a")
    public WebElement supportCoursesSupoortButonu;

    @FindBy(xpath = "//*[@id=\"supportCollapse\"]/ul/li[3]/a")
    public WebElement supportTicketsButonu;








}
