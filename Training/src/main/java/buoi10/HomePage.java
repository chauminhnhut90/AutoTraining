package buoi10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver webDriver;

    @FindBy(xpath = "//a[text()='Tài khoản']")
    public WebElement btTaiKhoan;

    @FindBy(xpath = "//a[text()='Blog']")
    public WebElement btBlog;

    public HomePage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

    public void navigate() {
        webDriver.get("https://www.fahasa.com/");
    }

    public void clickButtonTaiKhoan() {
        btTaiKhoan.click();
    }
}
