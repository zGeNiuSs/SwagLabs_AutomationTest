package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInfo {
    WebDriver driver;
    public CheckoutInfo(WebDriver driver){
        this.driver = driver;
    }

    public WebElement checkoutInfoIsDisplay(){

        return driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
    }

    public WebElement firstName(){
        return  driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
    }

    public WebElement lastName(){
        return  driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
    }

    public WebElement postalCode(){
        return  driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
    }

    public WebElement continueButton(){
        return  driver.findElement(By.xpath("//*[@id=\"continue\"]"));
    }

    public WebElement messageError(){
        return  driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3"));
    }
}
