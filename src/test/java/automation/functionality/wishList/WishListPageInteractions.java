package automation.functionality.wishList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.functionality.utils.DriverUtils;

import static automation.functionality.utils.CommonUtils.clickOnElement;
import static org.junit.Assert.assertTrue;

public class WishListPageInteractions {
    public WishListPageInteractions() {
        PageFactory.initElements(DriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class = 'header-right col-md-3 hidden-xs']//i[@class = 'lar la-heart']")
    public WebElement headerWishListHeartIcon;

    @FindBy(xpath = "//div//tr[@id  = 'yith-wcwl-row-16']")
    public WebElement eveningTrousersProductWishListTableRow;

    @FindBy(xpath = "//div//tr[@id  = 'yith-wcwl-row-15']")
    public WebElement blackTrousersProductWishListTableRow;

    @FindBy(xpath = "//div//tr[@id  = 'yith-wcwl-row-20']")
    public WebElement singleShirtProductWishListTableRow;

    @FindBy(xpath = "//div//tr[@id  = 'yith-wcwl-row-18']")
    public WebElement hardTopProductWishListTableRow;

    public void navigateToMyWishListPageTable() {

        clickOnElement(headerWishListHeartIcon);
    }

    public void verifyProductsInWishListPageTable() {

        boolean eveningTrousersProductAvailableInWishList = eveningTrousersProductWishListTableRow.isDisplayed();
        assertTrue("Evening trousers product not in wish list", eveningTrousersProductAvailableInWishList);

        boolean blackTrousersProductAvailableInWishList = blackTrousersProductWishListTableRow.isDisplayed();
        assertTrue("Black trousers product not in wish list", blackTrousersProductAvailableInWishList);

        boolean singleShirtProductAvailableInWishList = singleShirtProductWishListTableRow.isDisplayed();
        assertTrue("Single Shirt product not in wish list", singleShirtProductAvailableInWishList);

        boolean hardTopProductAvailableInWishList = hardTopProductWishListTableRow.isDisplayed();
        assertTrue("Hard top product not in wish list", hardTopProductAvailableInWishList);
    }
}
