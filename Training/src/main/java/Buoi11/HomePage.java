package Buoi11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver webDriver;

    public HomePage(WebDriver driver){
        this.webDriver = driver;
        PageFactory.initElements(webDriver,this);
    }

    public void navigate(){
        webDriver.get("https://www.fahasa.com");
    }
}
