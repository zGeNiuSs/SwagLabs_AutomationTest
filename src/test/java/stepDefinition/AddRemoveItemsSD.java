package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static stepDefinition.PurchaseSingleItemSD.cart;

public class AddRemoveItemsSD {
    @When("user remove product {string} from the cart")
    public void removeProductFromCart(String productName) throws InterruptedException {
        cart.removeProductFromCartScreen(productName).click();
        Thread.sleep(1000);
    }

    @And("Verify that product {string} is not appear in the cart")
    public void productNotAppear(String productName) {
        Assert.assertTrue("product "+productName+" is appear in the cart", cart.productIsNotDisplayed(productName));
    }
}
