package stepDefinition;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.*;

import static stepDefinition.PurchaseSingleItemSD.cart;
import static stepDefinition.PurchaseSingleItemSD.checkoutinfo;

public class CheckoutPurchaseSD {

    @Then("user should see an error message {string}")
    public void errorMsgOnInfoScreen(String msg) {
        Assert.assertEquals(msg, checkoutinfo.messageError().getText());
    }

}
