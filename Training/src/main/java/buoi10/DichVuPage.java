package buoi10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DichVuPage {
    private WebDriver webDriver;

    @FindBy(xpath = "//a[text()='Điều khoản sử dụng']")
    public WebElement dksd;

    @FindBy(xpath = "//a[text()='Chính sách bảo mật']")
    public WebElement csbm;

    @FindBy(xpath = "//a[text()='Giới thiệu Fahasa']")
    public WebElement gtfahasa;

    @FindBy(xpath = "//a[text()='Hệ thống trung tâm - nhà sách']")
    public WebElement httt;

    public DichVuPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

    public void navigate() {
        webDriver.get("https://www.fahasa.com/");
    }

    public void clickDKSD(){
        dksd.click();
    }

    public String getDKSDTText(){
        return dksd.getText();
    }
}
