package stepdefinitions;

import utilities.ConfigReader;
import utilities.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Enes;
import utilities.JSUtilities;

import java.time.Duration;
import java.util.List;

public class EnesSteps {
    Enes enes = new Enes();
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    WebElement firstCard;
    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));

    @Given("I am on the homepage {string}")
    public void i_am_on_the_homepage(String url) throws InterruptedException {
        DriverManager.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(5000);
    }

    @When("I scroll to the body store section")
    public void i_scroll_to_the_body_store_section() {
        JSUtilities.scrollToElement(driver, enes.storeProductsYazisi);
        wait.until(ExpectedConditions.visibilityOf(enes.storeProductsYazisi));
        Assert.assertTrue("Store Products heading is not visible!", enes.storeProductsYazisi.isDisplayed());

    }
    @Then("the Store Products heading should be visible")
    public void the_store_products_heading_should_be_visible() {
        enes.storeProductsYazisi.isDisplayed();

    }
    @Then("a product slider should be visible with at least one product card")
    public void a_product_slider_should_be_visible_with_at_least_one_product_card() {
        List<WebElement> productCards = enes.productCards;
        if (productCards == null || productCards.isEmpty()) {
            productCards = driver.findElements(By.cssSelector(".product-card, .products .product-card, .product-slider .product-card, .products .swiper-slide, .product-slider .swiper-slide"));
        }


        Assert.assertTrue("No product cards found in the slider!", productCards.size() >= 1);
    }


    @When("I inspect the first product card")
    public void i_inspect_the_first_product_card() {
        WebElement firstCard1 = enes.firstProductPrice;
        JSUtilities.scrollToElement(driver, firstCard1);
        wait.until(ExpectedConditions.visibilityOf(firstCard1));
    }

    @Then("the card should display a price")
    public void the_card_should_display_a_price() {
        WebElement price = enes.firstProductPrice;
        wait.until(ExpectedConditions.visibilityOf(price));
        Assert.assertTrue("Price is not visible", price.isDisplayed());
        Assert.assertFalse("Price text is empty", price.getText().trim().isEmpty());
    }

    @Then("the card should display a rating")
    public void the_card_should_display_a_rating() {
        WebElement rating = enes.ratingBox;
        wait.until(ExpectedConditions.visibilityOf(rating));
        Assert.assertTrue("Rating is not visible", rating.isDisplayed());



    }

    @Then("the card should display an add to cart icon")
    public void the_card_should_display_an_add_to_cart_icon() throws InterruptedException {
        JSUtilities.scrollToElement(driver, enes.storeProductsYazisi);
        JSUtilities.waitForPageLoadWithJS(driver, Duration.ofSeconds(10));
        enes.firstProductCard.click();
        Thread.sleep(3000);
        Assert.assertTrue(enes.addCartButton.isDisplayed());

    }
    @When("I click the first product card")
    public void i_click_the_first_product_card() {
        enes.storeHeader.click();

    }
    @Then("the product detail page should open")
    public void the_product_detail_page_should_open() {
        enes.productLink.click();
        Assert.assertTrue("description part is not visible",enes.descriptionYazisi.isDisplayed());
    }
    @Then("the product title should be visible")
    public void the_product_title_should_be_visible() {
        Assert.assertTrue(enes.urunBaslikYazisi.isDisplayed());

    }

    @When("I click the All product button")
    public void i_click_the_button() {
        enes.allProductsLinki.click();


    }
    @Then("the product listing page should open")
    public void the_product_listing_page_should_open() {
        Assert.assertTrue(enes.productsYazisi.isDisplayed());

    }
    @Then("all products should be listed")
    public void all_products_should_be_listed() {
        List<WebElement> allProducts = driver.findElements(
                By.xpath("//*[@id='filtersForm']//figure/div/a/img")
        );

        int productCount = allProducts.size();
        System.out.println("Bulunan ürün sayısı = " + productCount);

        Assert.assertTrue("Birden fazla ürün bekleniyordu!", productCount >= 1);

    }

}
