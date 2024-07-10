package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Cart {
    WebDriver driver;
    public Cart(WebDriver driver){
        this.driver = driver;
    }

    public String nameOfProduct(int productNum){
        return driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div["+(productNum+2)+"]/div[2]/a/div")).getText();
    }

    public int contItemsOfCart(){
        List<WebElement> cartItems = driver.findElements(By.className("cart_item"));
        return cartItems.size();
    }

    public boolean productIsNotDisplayed(String productName){
        try {
            return driver.findElement(By.xpath("//*[text()='"+productName+"']")).isDisplayed();
        }
        catch (Exception e){
            return true;
        }
    }

    public WebElement removeProductFromCartScreen(String productName){
        try {
            return  driver.findElement(By.xpath("//*[@id=\"remove-"+productName+"\"]"));
        }
        catch (Exception e) {
            System.out.println("Exception caught while trying to remove to cart button more than once: " + e.getMessage());
            return null;
        }
    }

    public WebElement checkoutButton(){
        return driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
    }

    public int numberOfItemsAppearOnCartIcon(){
        return Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
    }

}
