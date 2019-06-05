package Buoi11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LopHocMatNguPage {
    private WebDriver webDriver;

    @FindBy(xpath = "//*[@id='categorytab-highly-recommendation']")
    public WebElement tabLopHocMatNgu;

    @FindBy(xpath = "//*[@id='categorytab-highly-recommendation']//*[@class='col-lg-6 col-md-6 col-sm-6 padd-l-r']")
    public List<WebElement> productName;

    public LopHocMatNguPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void TabLopHocMatNgu(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(tabLopHocMatNgu).perform();
    }

    public void getProductName(){
        for(int i = 0; i < productName.size();i++){
            WebElement element = productName.get(i);

            String title = element.getText();
            System.out.println(title);
        }
    }

}
