package Buoi10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InfoAccount {
    private WebDriver webDriver;

    @FindBy(xpath = "//span[contains(text(),'Danh Mục')]")
    public WebElement Menu;

    @FindBy(xpath = "//*[@id='verticalmenu']//span[contains(@class,'menu-title')]")
    public List<WebElement> listMenu;

    public InfoAccount(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void hoverMenu(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(Menu).perform();
    }

    public void listMenu(){
        for(int i = 0; i < listMenu.size();i++){
            WebElement element = listMenu.get(i);

            String title = element.getText();
            System.out.println(title);
        }
    }
}
