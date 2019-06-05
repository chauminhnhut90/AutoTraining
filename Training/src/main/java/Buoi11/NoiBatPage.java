package Buoi11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NoiBatPage {
    private WebDriver webDriver;

    @FindBy(xpath = "//*[@id='categorytab-gia-noi-bat']")
    public WebElement tabNoiBat;

    @FindBy(xpath = "//*[@id='categorytab-gia-noi-bat']//*[@class='ma-box-content']")
    public List<WebElement> productName;

    @FindBy(xpath ="//*[@id='categorytab-gia-noi-bat']//div[@class='bx-controls-direction']//following-sibling::a")
    public WebElement next;

    public NoiBatPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void tabNoiBat(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(tabNoiBat).perform();
    }

    public void getProductName(){
        for(int i = 0; i < productName.size();i++){
            WebElement element = productName.get(i);

            String title = element.getText();
            System.out.println(title);

            Actions actions = new Actions(webDriver);
            actions.moveToElement(next).click(next).build().perform();

        }


    }


}
