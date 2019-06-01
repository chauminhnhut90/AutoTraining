package Buoi10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    private WebDriver webDriver;

    @FindBy(id="email")
    public WebElement textboxEmail;

    @FindBy(id="pass")
    public  WebElement textboxPass;

    @FindBy(id="send2")
    public  WebElement buttonLogin;


    public AccountPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void textboxEmail(){
        textboxEmail.sendKeys("thanhtuyen2790@gmail.com");
    }

    public void textboxPass(){
        textboxPass.sendKeys("tuyen279@");
    }

    public void buttonLOgin(){
        buttonLogin.click();
    }

}
