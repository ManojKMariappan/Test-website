package automation.functionality.cart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.functionality.utils.CommonUtils;
import automation.functionality.utils.DriverUtils;
import automation.functionality.utils.WebElementUtils;

import static automation.functionality.utils.CommonUtils.*;
import static automation.functionality.utils.WebElementUtils.*;
import static org.junit.Assert.assertTrue;

public class CartPageInteractions {
    public CartPageInteractions() {
        PageFactory.initElements(DriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "//div//td[@class = 'product-name']//a[contains (@href, 'bikini')]")
    public WebElement lowestPriceProductInCart;

    @FindBy(xpath = "//div[@class = 'header-right col-md-3 hidden-xs']//a[@class = 'cart-contents']")
    public WebElement headerCartIcon;

    public void verifyAddedProductsInCart() {

        waitForVisible(headerCartIcon);
        clickOnElement(headerCartIcon);

        waitForVisible(lowestPriceProductInCart);
        boolean verifyLowestPriceProductInCart = lowestPriceProductInCart.isDisplayed();
        assertTrue("Lowest price product not in cart", verifyLowestPriceProductInCart);
    }
}
