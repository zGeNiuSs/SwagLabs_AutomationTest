package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
    WebDriver driver;
    public Cart(WebDriver driver){
        this.driver = driver;
    }

    public String nameOfProduct(){

        return driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]")).getText().split("\\r?\\n")[0];
    }

    public WebElement checkoutButton(){
        return driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
    }

}
