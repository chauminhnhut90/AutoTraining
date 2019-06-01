package Fahasha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DichVuPage {

    //Khai bao Webdriver
    WebDriver webDriver;
    @FindBy(xpath = "//*[contains(text(), 'Điều khoản sử dụng')]")
    private WebElement dieukhoanlnk;

    @FindBy(xpath = "//*[contains(text(), 'Chính sách bảo mật')]")
    private WebElement chinhsachlnk;

    @FindBy(xpath = "//*[contains(text(), 'Giới thiệu Fahasa')]")
    private WebElement gioithieulnk;

    @FindBy(xpath = "//*[contains(text(), 'Hệ thống trung tâm - nhà sách')]")
    private WebElement hethonglnk;

    public DichVuPage(WebDriver webDriver) {

        //Khai bao ham khoi tao
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void clickDieuKhoanLink(){
        dieukhoanlnk.click();
    }






    public void navigate(){
        webDriver.get("https://www.fahasa.com/");
    }

    public String getDKTitle(){
        return dieukhoanlnk.getText();
    }






}
