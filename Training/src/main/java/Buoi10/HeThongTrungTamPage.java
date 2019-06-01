package Buoi10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeThongTrungTamPage {
    private WebDriver webDriver;

    @FindBy(tagName = "h1")
    public WebElement title;
    public HeThongTrungTamPage(WebDriver webDriver){
        this.webDriver= webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public String getTitle(){
        return title.getText();
    }

}
