package automation.functionality.steps;

import io.cucumber.java.en.Given;

import automation.functionality.cart.CartPageInteractions;

public class CartPageStepDefinitions {

    CartPageInteractions cartPageInteractions = new CartPageInteractions();

    @Given("^I am able to verify the item in my cart$")
    public void navigateToMyWishListPage() {

        cartPageInteractions.verifyAddedProductsInCart();
    }
}
