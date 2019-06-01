package Buoi10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.PortUnreachableException;

public class DichVuPage {
    private WebDriver webDriver;

    @FindBy(xpath = "//a[contains(text(),'Điều khoản sử dụng')]")
    public WebElement dieuKhoanSuDung;

    @FindBy(xpath = "//a[contains(text(),'Chính sách bảo mật')]")
    public  WebElement chinhSachBaoMat;

    @FindBy(xpath = "//a[contains(text(),'Giới thiệu Fahasa')]")
    public  WebElement gioiThieuFahasa;

    @FindBy(xpath = "//a[contains(text(),'Hệ thống trung tâm - nhà sách')]")
    public WebElement heThongTrungTam;

    public DichVuPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    //Dieu khoan su dung
    public String getTextDieuKhoanSuDung(){
        return dieuKhoanSuDung.getText();
    }

    public void clickDieuKhoanSuDung(){
        dieuKhoanSuDung.click();
    }

    //Chinh sach bao mat
    public String getTextChinhSachBaoMat(){
        return chinhSachBaoMat.getText();
    }

    public void clickChinhSachBaoMat(){
        chinhSachBaoMat.click();
    }

    //Gioi thieu Fahasa
    public String getGTFahasa(){
        return gioiThieuFahasa.getText();
    }

    public void ClickGioiThieuFahasa(){
        gioiThieuFahasa.click();
    }

    // He thong trung tam - nha sach
    public String getHTTT(){
        return heThongTrungTam.getText();
    }

    public void ClickHeThongTrungTam(){
        heThongTrungTam.click();
    }
}
