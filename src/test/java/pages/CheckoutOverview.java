package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverview {
    WebDriver driver;
    public CheckoutOverview(WebDriver driver){
        this.driver = driver;
    }

    public WebElement checkoutOverviewIsDisplay(){

        return driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
    }

    public WebElement finishButton(){
        return  driver.findElement(By.xpath("//*[@id=\"finish\"]"));
    }

}
