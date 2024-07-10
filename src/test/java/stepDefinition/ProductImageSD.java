package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static stepDefinition.PurchaseSingleItemSD.products;
import static stepDefinition.PurchaseSingleItemSD.cart;

public class ProductImageSD {

    @And("product image for {int} products should be displayed correctly")
    public void productIsAppearOnProductsScreen(int productCont){
        for (int i = 1; i <= productCont; i++) {
            // Verify the alt attribute of image with Name of product
            Assert.assertEquals(products.productName(i).getText(),products.productImg(i).getAttribute("alt"));
        }
    }

    @When("user press on Add to cart button for each product to add {int} products in cart")
    public void addProductsToCart(int productCont){
        for (int i = 1; i <= productCont; i++) {
            products.addProductToCart(products.productName(i).getText().toLowerCase().replace(" ", "-")).click();
        }
    }

    @Then("Verify that all {int} products appear in the cart")
    public void productsCountOnCartScreen(int productCont) {
        Assert.assertEquals(productCont, cart.contItemsOfCart());
        Assert.assertEquals(productCont, cart.numberOfItemsAppearOnCartIcon());

    }


}
