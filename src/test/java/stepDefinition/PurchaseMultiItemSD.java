package stepDefinition;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.*;

import static stepDefinition.PurchaseSingleItemSD.products;

public class PurchaseMultiItemSD {

    @When("user press on Add to cart button to add same product {string} {int} times in cart")
    public void addSameProductMoreThanOnce(String productName, int productCont) {
        for (int i = 1; i <= productCont; i++) {
            products.addProductToCart(productName).click();
        }
    }

}
