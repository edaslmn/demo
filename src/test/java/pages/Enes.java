package pages;

import utilities.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Enes {

    public Enes(){
        //Page classı
        PageFactory.initElements(DriverManager.getDriver(),this);


    }
    @FindBy(xpath = "//h2[@class='section-title']")
    public WebElement storeProductsYazisi;

    @FindBy(css = ".product-card, .products .product-card, .product-slider .product-card, .products .swiper-slide, .product-slider .swiper-slide")
    public List<WebElement> productCards;


    @FindBy (xpath = "(//div[contains(@class,'product-card')]//div[contains(@class,'product-price-box') and contains(@class,'mt-25')])[1]")
    public WebElement firstProductPrice;

    @FindBy(css = ".stars-card")
    public WebElement ratingBox;

    @FindBy(xpath = "(//div[contains(@class,'product-card')])[1]")
    public WebElement firstProductCard;

    @FindBy(xpath = "(//div[contains(@class,'product-card')])[1]//button[descendant::svg[contains(@class, 'feather-shopping-cart')]]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//button[contains(@class, 'btn-primary')]")
    public WebElement addCartButton;

    @FindBy(xpath = "//*[@id=\"navbarContent\"]/ul/li[5]/a")
    public WebElement storeHeader;

    @FindBy(xpath = "//*[@id=\"filtersForm\"]/div[2]/div[1]/div/div/div/figure/div/a/img")
    public WebElement productLink;

    @FindBy(xpath = "//*[@id=\"description-tab\"]")
    public WebElement descriptionYazisi;

    @FindBy(xpath = "//*[@id=\"productAddToCartForm\"]/div/h1")
    public WebElement urunBaslikYazisi;
    @FindBy(xpath = "//*[@id=\"app\"]/section[11]/div[1]/a")
    public WebElement allProductsLinki;

    @FindBy(xpath = "//*[@id=\"app\"]/section/div/div/div/div/h1")
    public WebElement productsYazisi;

}
