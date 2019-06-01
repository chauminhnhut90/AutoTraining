package Fahasha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeThongFahashaPage {
    WebDriver webDriver;

    @FindBy(xpath = "//h1")
    private  WebElement title;

    public HeThongFahashaPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public String getTitle(){
        return title.getText();
    }
}
