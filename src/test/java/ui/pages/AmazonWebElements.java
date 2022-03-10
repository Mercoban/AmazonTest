package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class AmazonWebElements {

public AmazonWebElements(){

PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath= "//a[@class='nav-logo-link nav-progressive-attribute']")
    public WebElement amazonLogo;

   @FindBy (xpath = "//a[@id='nav-link-accountList']/span")
   public WebElement signIn;

    @FindBy (linkText = "Start here.")
    public WebElement newCustomer;

    @FindBy (xpath = "//input[@id='ap_customer_name']")
    public WebElement yourName;

    @FindBy (xpath = "//input[@id='ap_email']")
    public  WebElement mailAdresi;

    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    public WebElement rePassword;

    @FindBy(xpath = "//input[@id='continue']")
    public  WebElement continueButon;

    @FindBy (linkText = "Verify email address")
    public WebElement mailDogrulamaYazisi;

    @FindBy (xpath = "//span[@id='auth-signin-button']")
    public WebElement signinPassword;

     @FindBy (xpath = "(//span[@class='nav-line-1 nav-progressive-content'])[2]")
    public WebElement girisDogrulama;

     @FindBy (xpath="//a[@id='nav-hamburger-menu']")
     public WebElement allButonu;

     @FindBy (xpath = "//ul[@class='hmenu hmenu-visible']//li")
     public List<WebElement> menu;

     @FindBy (xpath="//ul[@class='hmenu hmenu-visible hmenu-translateX']//li")
     public List<WebElement> altMenu;

     @FindBy (xpath = "//h4[text()='There was a problem']")
     public WebElement mailHataYazisi;

     @FindBy (xpath = "//*[contains(text(),'Your password is incorrect')]")
     public WebElement passwordHataYazisi;

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    public WebElement filtreButton;

    @FindBy(xpath = "//li[@class='a-dropdown-item'][2]")
    public WebElement dusukFiyat;

    @FindBy (xpath = "//span[@class='a-dropdown-prompt']")
    public WebElement dusukFiyatYazisi;

 @FindBy (xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
 public WebElement ilkUrunBir;

 @FindBy (xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
 public WebElement ikinciUrunBir;

 @FindBy (xpath = "//input[@id='add-to-cart-button']")
 public WebElement sepeteEkle;

 @FindBy (xpath = "//div[@class='s-card-container s-overflow-hidden aok-relative s-expand-height s-include-content-margin s-latency-cf-section s-card-border']")
 public List<WebElement> productListOnThePage;

 @FindBy (xpath = "//span[@class='nav-cart-icon nav-sprite']")
 public WebElement sepet;

 @FindBy (xpath = "//span[@class='a-price a-text-price a-size-medium']")
 public WebElement priceText;

 @FindBy (xpath = "//tbody//tr[5]//td[1]")
 public WebElement bookDepository;

 @FindBy (xpath = "//img[@alt='Bookdepository.com']")
 public WebElement bookDepositoryYazisi;

 @FindBy (xpath = "//div[@class='a-section a-spacing-base']")
 public List <WebElement> randomProduct;

 @FindBy(xpath = "//span[text()='Account & Lists']")
 public WebElement accountAndListsButton;

 @FindBy(xpath = "//span[text()='Create a List']")
 public WebElement createListButton;


 @FindBy(xpath = "//input[@class='a-button-input']")
 public WebElement createList;


 @FindBy(xpath = "//input[@class='a-input-text fix-width-x-large']")
 public WebElement listNameTextBox;

 @FindBy (xpath="(//span[@class='a-declarative'])[1]")
 public WebElement shopListTextBox;

 @FindBy(xpath = "//span[@id='profile-list-name']")
 public WebElement newListNameElement;

 @FindBy(xpath = "//a[@class='a-link-normal aok-inline-block aok-align-center overflow-menu-popover-trigger-with-more-label']")
 public WebElement moreYazisi;

 @FindBy(xpath = "//a[@id='editYourList']")
 public WebElement manageList;

 @FindBy(xpath = "//span[@class='a-button a-spacing-base a-button-base full-width-element']")
 public WebElement deleteButonu;

 @FindBy(xpath = "//input[@name='submit.save']")
 public WebElement confirmDeleteButonu;

 @FindBy(xpath = "//*[text()='Create List']")
 public WebElement create;

 @FindBy(xpath = "(//input[@name='submit.deleteItem'])[1]")
 public WebElement deleteItemButton;

 @FindBy(xpath = "//div[text()='Deleted']")
 public WebElement deletedAlert;

 @FindBy(xpath = "//div[@id='WLHUC_result_success']")
 public WebElement addedListAssert;

 @FindBy(xpath = "//span[text()='Murat Liste 2']")
 public WebElement muratYeniListButton;

 @FindBy(xpath = "//input[@id='add-to-wishlist-button']")
 public WebElement wishlistOptionsButton;

 @FindBy(xpath = "(//span[@class='a-size-small atwl-hz-dd-list-name a-nowrap'])[1]")
 public WebElement wishListSecondOption;

 @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[*]//*/h2/a/span")
 public List <WebElement> searcResultDescriptionsList;
}
