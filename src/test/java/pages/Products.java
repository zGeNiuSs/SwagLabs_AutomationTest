package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products {
    WebDriver driver;
    public Products(WebDriver driver){
        this.driver = driver;
    }

    public WebElement openCart(){
        return  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
    }
    public WebElement sortListNameAToZ(){
        return  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]"));
    }
    public WebElement sortListNameZToA(){
        return  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]"));
    }
    public WebElement sortListPriceLowToHigh(){
        return  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
    }
    public WebElement sortListPriceHighToLow(){
        return  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
    }
    public WebElement sortStatus(){
        return  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/span"));
    }
    public WebElement firstProductName(){
        return  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]"));
    }
    public WebElement firstProductPrice(){
        return  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
    }
    public WebElement secondProductName(){
        return  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]"));
    }
    public WebElement secondProductPrice(){
        return  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div"));
    }
    public WebElement addProductToCart(String productName){
        return  driver.findElement(By.xpath("//*[@id=\"add-to-cart-"+productName+"\"]"));
    }




}
