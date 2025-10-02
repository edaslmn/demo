package stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.DriverManager;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Ramazan;
import utilities.JSUtilities;

import java.util.List;

public class RamazanSteps {

    Ramazan ramazan=new Ramazan();


    @Given("user goes to {string}")
    public void user_goes_to(String string) throws InterruptedException {

        DriverManager.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(5000);


    }

    @Given("user waits {int} seconds")
    public void userWaitsSeconds(int arg0) throws InterruptedException {

        Thread.sleep(2000);
        Thread.dumpStack();
    }



    @When("user scrolls the page until {string} text")
    public void user_scrolls_the_page_until_text(String string) throws InterruptedException {

        JSUtilities.scrollToElement(DriverManager.getDriver(),ramazan.subscribeNowText);
       // JSUtilities.scrollToElement(DriverManager.getDriver(),ramazan.validatinText);
        Thread.sleep(2000);





    }

    @Then("page should display {string}")
    public void page_should_display(String string)  {

        String expectedText="Subscribe Now!";
        String actualText=ramazan.subscribeNowText.getText();

        Assert.assertEquals(expectedText,actualText);


    }


    @Then("membership cards should display")
    public void membershipCardsShouldDisplay() {

        Assert.assertTrue(ramazan.bronzeButton.isDisplayed());
        Assert.assertTrue(ramazan.goldButton.isDisplayed());
        Assert.assertTrue(ramazan.silverButton.isDisplayed());


    }

    @Then("purchase button under membership cards should clickable")
    public void purchaseButtonUnderMembershipCardsShouldClickable() {



        Assert.assertTrue(ramazan.purchaseBronzeButton.isEnabled()&&ramazan.purchaseBronzeButton.isDisplayed());
        Assert.assertTrue(ramazan.purchaseGoldButton.isEnabled()&&ramazan.purchaseGoldButton.isDisplayed());
        Assert.assertTrue(ramazan.purchaseSilverButton.isEnabled()&&ramazan.purchaseSilverButton.isDisplayed());

    }

    @Then("user clicks the login button in the Header")
    public void userClicksTheLoginButton() throws InterruptedException {

        Thread.sleep(2000);
        ramazan.loginButon.click();
    }

    @And("user write {string} in email textBox")
    public void userWriteInEmailTextBox(String arg0) {

        ramazan.emailTextBox.sendKeys(ConfigReader.getProperty("emailRamazan"));

    }

    @And("user write {string} in passWord texBox")
    public void userWriteInPassWordTexBox(String arg0) {

        ramazan.passWordTextBox.sendKeys(ConfigReader.getProperty("passWordRamazan"));

    }

    @Then("user clicks the login button under emailTextBox")
    public void userClicksTheLoginButtonUnderEmailTextBox() {

        ramazan.LoginButton_Under_emailandPassword.click();

    }

    @Then("page should display  dasboard Menu")
    public void pageShouldDisplayDasboardMenu() {


        Assert.assertTrue(ramazan.DashboardLink.isDisplayed()&&ramazan.DashboardLink.isEnabled());



    }

    @And("user click all link under the dashBoar Menu")
    public void userClickTheDashBoardLink() throws InterruptedException {

ramazan.DashboardLink.click();
JSUtilities.scrollToElement(DriverManager.getDriver(),ramazan.CourcesLinkUnderDasboardText);
Thread.sleep(2000);
ramazan.CourcesLinkUnderDasboardText.click();
JSUtilities.clickWithJS(DriverManager.getDriver(),ramazan.MeetingsLinkUnderDasboardText);





        }












    }

