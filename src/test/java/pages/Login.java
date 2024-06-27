package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

    WebDriver driver;
    public Login(WebDriver driver){
        this.driver = driver;
    }

    public WebElement userName(){
        return  driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
    }
    public WebElement password(){
        return  driver.findElement(By.xpath("//*[@id=\"password\"]"));
    }
    public WebElement loginButton(){
        return  driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
    }
    public WebElement messageError(){
        return  driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
    }

//    public WebElement loginStatus(){
//        return  driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"));
//    }



}
