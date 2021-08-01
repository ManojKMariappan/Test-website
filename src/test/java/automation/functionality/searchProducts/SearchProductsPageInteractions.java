package automation.functionality.searchProducts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.functionality.utils.DriverUtils;

import static automation.functionality.utils.CommonUtils.clickOnElement;
import static automation.functionality.utils.CommonUtils.sendKeysTo;
import static automation.functionality.utils.WebElementUtils.selectValueFromDropDown;

public class SearchProductsPageInteractions {
    public SearchProductsPageInteractions() {
        PageFactory.initElements(DriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class = 'header-search-form']//input[@class = 'header-search-input']")
    public WebElement searchProducts;

    @FindBy(xpath = "//div//i[@class = 'la la-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class = 'summary entry-summary']//a[@class = 'add_to_wishlist single_add_to_wishlist']")
    public WebElement addToWishList;

    @FindBy(xpath = "//div//a[@title = 'Shop']")
    public WebElement shopMenuBar;

    @FindBy(xpath = "//div//select[@class = 'orderby']")
    public WebElement sortingDropDown;

    @FindBy(xpath = "//div//a[@class = 'cc-btn cc-accept-all cc-btn-no-href']")
    public WebElement cookiesAcceptAllButton;

    @FindBy(xpath = "//div//a[@aria-label = 'Add “Bikini” to your cart']")
    public WebElement addToCartLowestPriceProduct;

    public void addProductsToMyWishList() {

        if (cookiesAcceptAllButton.isDisplayed()) {
            clickOnElement(cookiesAcceptAllButton);
        }

        //add first product to my wish list
        clickOnElement(searchProducts);
        sendKeysTo(searchProducts, "Hard top");
        clickOnElement(searchButton);
        clickOnElement(addToWishList);

        //add second product to my wish list
        clickOnElement(searchProducts);
        sendKeysTo(searchProducts, "Single Shirt");
        clickOnElement(searchButton);
        clickOnElement(addToWishList);

        //add third product to my wish list
        clickOnElement(searchProducts);
        sendKeysTo(searchProducts, "Black trousers");
        clickOnElement(searchButton);
        clickOnElement(addToWishList);

        //add fourth product to my wish list
        clickOnElement(searchProducts);
        sendKeysTo(searchProducts, "Evening trousers");
        clickOnElement(searchButton);
        clickOnElement(addToWishList);
    }

    public void searchForLowestPriceProduct() {

        clickOnElement(shopMenuBar);
        selectValueFromDropDown(sortingDropDown, "price");
        clickOnElement(addToCartLowestPriceProduct);
    }

    public void addLowestPriceItemToMyCart() {

        clickOnElement(addToCartLowestPriceProduct);
    }
}
