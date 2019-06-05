package Buoi11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Deal24Page {
    private WebDriver webDriver;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']")
    public WebElement tabDeal24;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']//*[@class='ma-box-content']")
    public List<WebElement> productName;

    public Deal24Page(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void TabDeal24(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(tabDeal24).perform();
    }

    public void getProductName(){
        for(int i = 0; i < productName.size();i++){
            WebElement element = productName.get(i);

            String title = element.getText();
            System.out.println(title);
        }
    }

}
