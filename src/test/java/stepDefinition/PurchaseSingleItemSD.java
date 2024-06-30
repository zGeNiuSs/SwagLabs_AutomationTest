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

public class PurchaseSingleItemSD {
    WebDriver driver = null;

    Login login = null;
    Products products = null;
    Cart cart = null;
    CheckoutInfo checkoutinfo = null;
    CheckoutOverview checkoutoverview = null;
    CheckoutComplete checkoutcomplete = null;

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
        Thread.sleep(2000);
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
        products.sortListNameAToZ().click();
    }

    @Then("Products are sorted from A to Z successfully")
    public void sortAToZStatusSuccessful(){
        String first = products.firstProductName().getText();
        String second = products.secondProductName().getText();
        int res = first.compareTo(second); // When A < Z -> result is Negative Number
        Assert.assertTrue(res<0);
        Assert.assertEquals("Name (A to Z)", products.sortStatus().getText());
    }

    @When("user press on Add to cart button to add product {string} in cart")
    public void addProduct(String productName){
        products.addProductToCart(productName).click();
    }

    @And("user press on the cart icon on the top right of the page")
    public void openCart(){
        products.openCart().click();
    }

    @Then("product {string} should appear in the cart page")
    public void productIsAppear(String productName){
        Assert.assertEquals(productName,cart.nameOfProduct());
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
