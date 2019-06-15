package AllStuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("all")
public class LoginPage {

    WebDriver webDriver;

    @FindBy(xpath = "//*[@title='Đăng nhập']")
    private WebElement dangnhap;

    @FindBy(xpath = "//*[@id='youama-email']")
    private WebElement email;

    @FindBy(xpath = "//*[@id='youama-password']")
    private WebElement password;

    @FindBy(xpath = "//button//span[contains(text(),'Đăng nhập')]")
    private WebElement clickDN;

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void clickDangNhap() {

        Actions actions = new Actions(webDriver);
        actions.click(dangnhap).perform();
    }

    public void enterEmail() {

        Actions actions = new Actions(webDriver);
        actions.click(email).perform();
        actions.sendKeys(email, "trinhnguyen190488@gmail.com").perform();
    }

    public void enterPassword() {

        Actions actions = new Actions(webDriver);
        actions.sendKeys(password, "super@2019").perform();

    }

    public void clickDangNhapbtn() {


        Actions actions = new Actions(webDriver);
        actions.click(clickDN).perform();
        sleep(5000);
    }


    public static void sleep(long miliseconds) {
        try {
            Thread.currentThread().sleep(miliseconds);
        } catch (Exception ex) {
        }
    }
}
