package automation.functionality.steps;

import io.cucumber.java.en.Given;

import automation.functionality.wishList.WishListPageInteractions;

public class WishListPageStepDefinitions {

    WishListPageInteractions wishListPageInteractions = new WishListPageInteractions();

    @Given("^I view my wishlist table$")
    public void navigateToMyWishListPage() {

        wishListPageInteractions.navigateToMyWishListPageTable();
    }

    @Given("^I find total four selected items in my wishlist$")
    public void verifyWishListTable(){

        wishListPageInteractions.verifyProductsInWishListPageTable();
    }
}
