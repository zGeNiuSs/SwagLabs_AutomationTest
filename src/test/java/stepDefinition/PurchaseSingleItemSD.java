package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.Arrays;

public class PurchaseSingleItemSD {
    public static WebDriver driver = null;

    public static Login login = null;
    public static Products products = null;
    public static Cart cart = null;
    public static CheckoutInfo checkoutinfo = null;
    public static CheckoutOverview checkoutoverview = null;
    public static CheckoutComplete checkoutcomplete = null;

    String[] option = {"Name (A to Z)",
                        "Name (Z to A)",
                        "Price (low to high)",
                        "Price (high to low)"};


    @Given("the user is on the SwagLabs login page")
    public void loginPage(){
        driver = new ChromeDriver();
        login = new Login(driver);
        products = new Products(driver);
        cart = new Cart(driver);
        checkoutinfo = new CheckoutInfo(driver);
        checkoutoverview = new CheckoutOverview(driver);
        checkoutcomplete = new CheckoutComplete(driver);
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @When("user logs in with username {string} and password {string}")
    public void loginValidData(String username, String password){
        login.userName().sendKeys(username);
        login.password().sendKeys(password);
    }

    @And("user press on Login button")
    public void loginButton(){
        login.loginButton().click();
    }

    @Then("user could login successful and should be redirected to the products page")
    public void loginStatusSuccessful(){
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        Assert.assertEquals("Swag Labs", driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText());
    }

    @When("user press on the sorting dropdown list")
    public void pressSortList(){}

    @And("user choose Name A to Z")
    public void chooseNameAToZSort(){
        products.sortList(Arrays.asList(option).indexOf("Name (A to Z)")).click();
    }

    @Then("Products are sorted from A to Z successfully")
    public void sortAToZStatusSuccessful(){
        String first = products.productName(1).getText();
        String second = products.productName(2).getText();
        int res = first.compareTo(second); // When first < second -> result is Negative Number
        Assert.assertTrue(res<0);
        Assert.assertEquals(option[0], products.sortStatus().getText());
    }

    @And("user choose Name Z to A")
    public void chooseNameZToASort(){
        products.sortList(Arrays.asList(option).indexOf("Name (Z to A)")).click();
    }

    @Then("Products are sorted from Z to A successfully")
    public void sortZToAStatusSuccessful(){
        String first = products.productName(1).getText();
        String second = products.productName(2).getText();
        int res = first.compareTo(second); // When first > second -> result is Positive Number
        Assert.assertTrue(res>=0);
        Assert.assertEquals(option[1], products.sortStatus().getText());
    }

    @And("user choose Price low to high")
    public void choosePriceLowToHighSort(){
        products.sortList(Arrays.asList(option).indexOf("Price (low to high)")).click();
    }

    @Then("Products are sorted from low to high price successfully")
    public void sortLowToHighStatusSuccessful(){
        String first = products.productPrice(1).getText();
        String second = products.productPrice(2).getText();
        int res = first.compareTo(second); // When first < second -> result is Negative Number
        Assert.assertTrue(res<0);
        Assert.assertEquals(option[2], products.sortStatus().getText());
    }

    @And("user choose Price High to Low")
    public void choosePriceHighToLowSort(){
        products.sortList(Arrays.asList(option).indexOf("Price (high to low)")).click();
    }

    @Then("Products are sorted from High to Low price successfully")
    public void sortHighToLowStatusSuccessful(){
        String first = products.productPrice(1).getText();
        String second = products.productPrice(2).getText();
        int res = first.compareTo(second); // When first > second -> result is Positive Number
        Assert.assertTrue(res>=0);
        Assert.assertEquals(option[3], products.sortStatus().getText());
    }

    @When("user press on Add to cart button to add product {string} in cart")
    public void addProduct(String productName){
        products.addProductToCart(productName).click();
    }

    @And("user press on the cart icon on the top right of the page")
    public void openCart(){
        products.openCart().click();
    }

    @Then("product {string} should appear on the cart page")
    public void productNameIsAppear(String productName){
        Assert.assertEquals(productName,cart.nameOfProduct(1));
    }

    @When("user press on Checkout button")
    public void checkoutButton(){
        cart.checkoutButton().click();
    }

    @Then("user should be redirect to Checkout Information page")
    public void checkoutInfoIsDisplay(){
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-one.html"));
        Assert.assertEquals("Checkout: Your Information", checkoutinfo.checkoutInfoIsDisplay().getText());
    }

    @When("user enter firstname {string}, lastname {string} and postal code {string}")
    public void yourInfoValidData(String firstName, String lastName, String postalCode){
        checkoutinfo.firstName().sendKeys(firstName);
        checkoutinfo.lastName().sendKeys(lastName);
        checkoutinfo.postalCode().sendKeys(postalCode);
    }

    @And("user press on Continue button")
    public void continueButton(){
        checkoutinfo.continueButton().click();
    }

    @Then("user should be redirect to Checkout Overview page")
    public void checkoutOverviewIsDisplay(){
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-two.html"));
        Assert.assertEquals("Checkout: Overview", checkoutoverview.checkoutOverviewIsDisplay().getText());
    }

    @When("user press on Finish button")
    public void finishButton(){
        checkoutoverview.finishButton().click();
    }

    @Then("user should see a message {string}")
    public void orderMsgIsDisplay(String orderMsg){
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete.html"));
        Assert.assertEquals("Checkout: Complete!", checkoutcomplete.checkoutCompleteIsDisplay().getText());
        Assert.assertEquals(orderMsg, checkoutcomplete.orderMsg().getText());
    }



}
