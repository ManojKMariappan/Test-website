package automation.functionality.steps;

import io.cucumber.java.en.Given;

import automation.functionality.searchProducts.SearchProductsPageInteractions;

public class AddProductsToWishListStepDefinitions {

    SearchProductsPageInteractions searchProductsPageInteractions = new SearchProductsPageInteractions();

    @Given("^I add four different products to my wish list$")
    public void addProductsToMyWishList() {

        searchProductsPageInteractions.addProductsToMyWishList();
    }

    @Given("^I search for lowest price product$")
    public void searchForProducts() {

        searchProductsPageInteractions.searchForLowestPriceProduct();
    }

    @Given("^I am able to add the lowest price item to my cart$")
    public void addLowestPriceItemToMyCart() {

        searchProductsPageInteractions.addLowestPriceItemToMyCart();
    }
}
