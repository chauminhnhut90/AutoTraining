package Fahasha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DieuKhoanPage {
    WebDriver webDriver;

    @FindBy(xpath = "//h1")
    private WebElement title;

    @FindBy(xpath = "//*[contains(text(), 'Chính sách bảo mật')]")
    private WebElement chinhsachlnk;

    public DieuKhoanPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public String getTitle(){
        return title.getText();
    }

    public void moveToFooter(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(chinhsachlnk).perform();
    }

    public String getCSTitle(){
        return chinhsachlnk.getText();
    }

    public void clickChinhSachLink(){
        chinhsachlnk.click();
    }
}
