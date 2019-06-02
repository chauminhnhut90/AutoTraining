package buoi10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    private WebDriver webDriver;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement pass;

    @FindBy(id = "send2")
    public WebElement send2;

    @FindBy(xpath = "//span[text()='Danh Mục']")
    public WebElement danhmuc;

    public AccountPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

    public void enterUserPass(String user, String pw){
        email.sendKeys(user);
        pass.sendKeys(pw);
    }

    public void clickLogin(){
        send2.click();
    }

    public void hoverDanhMuc(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(danhmuc).perform();
    }
}
