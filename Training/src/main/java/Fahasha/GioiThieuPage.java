package Fahasha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GioiThieuPage {
    WebDriver webDriver;

    @FindBy(xpath = "//h1")
    private WebElement title;

    @FindBy(xpath = "//*[contains(text(), 'Hệ thống trung tâm - nhà sách')]")
    private WebElement hethonglnk;

    public GioiThieuPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public String getTitle(){
        return title.getText();
    }

    public String getHTTitle(){
        return hethonglnk.getText();
    }

    public void clickHeThongFahashaLink(){
        hethonglnk.click();
    }
}
