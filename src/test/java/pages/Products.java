package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products {
    WebDriver driver;
    String[] srtArray = {"az", "za", "lohi", "hilo"};

    public Products(WebDriver driver){
        this.driver = driver;
    }

    public WebElement openCart(){
        return  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
    }
    public WebElement sortList(int option){
        return  driver.findElement(By.xpath("//option[@value='"+srtArray[option]+"']"));
    }
    public WebElement sortStatus(){
        return  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/span"));
    }
    public WebElement productName(int productNum){
        return  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div["+productNum+"]/div[2]/div[1]/a/div"));
    }
    public WebElement productPrice(int productNum){
        return  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div["+productNum+"]/div[2]/div[2]/div"));
    }
    public WebElement productImg(int productNum){
        return  driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div/div/div["+productNum+"]/div/a/img"));
    }
    public WebElement addProductToCart(String productName){
        try {
            return  driver.findElement(By.xpath("//*[@id=\"add-to-cart-"+productName+"\"]"));
        }
        catch (Exception e) {
            System.out.println("Exception caught while trying to add to cart button more than once: " + e.getMessage());
            Assert.fail();
            return null;
        }
    }

    public WebElement removeProductFromProductsScreen(String productName){
        try {
            return  driver.findElement(By.xpath("//*[@id=\"remove-"+productName+"\"]"));
        }
        catch (Exception e) {
            System.out.println("Exception caught while trying to remove to cart button more than once: " + e.getMessage());
            return null;
        }
    }

    public int numberOfItemsAppearOnCartIcon(){
        return Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());
    }

}
