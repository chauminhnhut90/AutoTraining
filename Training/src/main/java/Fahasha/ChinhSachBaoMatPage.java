package Fahasha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChinhSachBaoMatPage {

    WebDriver webDriver;

    @FindBy(xpath ="//h1" )
    private WebElement title;

    @FindBy(xpath = "//*[contains(text(), 'Giới thiệu Fahasa')]")
    private WebElement gioithieulnk;

    public ChinhSachBaoMatPage(WebDriver webDriver){

        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);

    }

    public String getTitle(){
        return title.getText();
    }

    public String getGTTitle(){
        return gioithieulnk.getText();
    }

    public void clickGioiThieuLink(){
        gioithieulnk.click();
    }
}
