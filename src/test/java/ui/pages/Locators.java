package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class Locators {
    public Locators() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Account & Lists']")
    public WebElement accountAndListsButton;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[text()='Hello, TEAM15']")
    public WebElement helloUsernameYazisiElementi;

    @FindBy(xpath = "//div[@id='auth-error-message-box']")
    public WebElement errorMessageBox;

    @FindBy(xpath = "//a[@aria-label='Open Menu']")
    public WebElement allMenuButton;

    @FindBy(xpath = "//div[contains(text(), 'Computers')]")
    public WebElement computersMenuButton;

    @FindBy(xpath = "//li//div[text()='computers']")
    public WebElement computersMenuYazisiElementi;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[6]/li[*]/a")
    public List<WebElement> computersSublistWebElement;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[*]//*/h2/a/span")
    public List <WebElement> searcResultDescriptionsList;

    @FindBy(xpath = "//h4[text()='Important Message!']")
    public WebElement importantMessageBox;

    @FindBy(xpath = "//span[text()='Toys & Games']")
    public WebElement toysAndGamesFilterButton;

    @FindBy(xpath = "//span[text()='Baby & Toddler Toys']")
    public WebElement babyToysFilterButton;

    @FindBy(xpath = "//select[@name='s']")
    public WebElement sortBySelectObject;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[text()='Currently unavailable.']")
    public WebElement currentlyUnavailableText;

    @FindBy(xpath = "//a[@id='attach-close_sideSheet-link']")
    public WebElement cartCloseButton;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    public WebElement cartItemCount;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
    public List <WebElement> itemCountPriceList;

    @FindBy(xpath = "//a[@id='nav-cart']")
    public WebElement cartIcon;

    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]")
    public WebElement subTotalText;

    @FindBy(xpath = "//tbody//a[text()='Fabric']")
    public WebElement fabricLink;

    @FindBy(xpath = "//span[text()='Create a List']")
    public WebElement createListButton;

    @FindBy(xpath = "//input[@id='list-name']")
    public WebElement listNameTextBox;

    @FindBy(xpath = "(//div[@class='wl-list-entry-row-wrapper'])[3]")
    public WebElement newListNameElement;

    @FindBy(xpath = "//input[@id='add-to-wishlist-button']")
    public WebElement wishlistOptionsButton;

    @FindBy(xpath = "(//span[@class='a-size-small atwl-hz-dd-list-name a-nowrap'])[2]")
    public WebElement wishListSecondOption;

    @FindBy(xpath = "//span[@id='WLHUC_result_action_add']")
    public WebElement addedListAssert;

    @FindBy(xpath = "//span[text()='Samet Yeni Liste 1']")
    public WebElement sametYeniListeButton;

    @FindBy(xpath = "(//input[@name='submit.deleteItem'])[1]")
    public WebElement deleteItemButton;

    @FindBy(xpath = "//div[text()='Deleted']")
    public WebElement deletedAlert;
}
