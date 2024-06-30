package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutComplete {
    WebDriver driver;
    public CheckoutComplete(WebDriver driver){
        this.driver = driver;
    }

    public WebElement checkoutCompleteIsDisplay(){

        return driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
    }

    public WebElement orderMsg(){
        return driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
    }
}
