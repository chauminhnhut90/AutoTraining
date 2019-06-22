package BaiTapBuoi15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class LopHocMatNguB15 {

    WebDriver webDriver;

    public LopHocMatNguB15(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//*[@id='categorytab-highly-recommendation']")
    private WebElement tamly;

    @FindBy(xpath = "//*[@id='categorytab-highly-recommendation']//div[contains(@class,'products-row')]//*[contains(@class,'product-col')]")
    private List<WebElement> itemTamLy;


    public void moveToTamLy(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(tamly).perform();
    }

    public void getItemTamLy(){

        for (WebElement element: itemTamLy){

            By byName = By.xpath(".//h3/a");
            WebElement eName = element.findElement(byName);
            String title = getItemOfHiddenElement(webDriver, eName);
            inText(title);

            By byPrice = By.xpath(".//span[starts-with(@id,'product-price')]");
            WebElement ePrice = element.findElement(byPrice);
            String price = getItemOfHiddenElement(webDriver, ePrice);
            inText(price);

        }

    }

    public static String getItemOfHiddenElement(WebDriver driver, WebElement element){
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        String text = JS.executeScript("return arguments[0].innerHTML", element).toString();
        return text;
    }

    public void inText(String text){
        System.out.println(text);
    }
}
