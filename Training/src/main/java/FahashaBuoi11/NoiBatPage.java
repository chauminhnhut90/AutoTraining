package FahashaBuoi11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

@SuppressWarnings("all")
public class NoiBatPage {
    WebDriver webDriver;

    @FindBy(xpath = "//div[@id='tabkm-gia-noi-bat']//div[contains(@class,'item-inner')]")
    private List<WebElement> noibat;

    @FindBy(xpath = "//div[@class='tabslider-header']")
    private WebElement nbtitle;

    @FindBy(xpath = "//*[@id='categorytab-gia-noi-bat']//a[@class='bx-next']")
    private WebElement btnnext;

    public NoiBatPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void moveTo(){
        Actions action = new Actions(webDriver);
        action.moveToElement(nbtitle).perform();
    }

    public void getItems(){
        int size = noibat.size();
        for (int i = 0; i<size; i++){
            WebElement element = noibat.get(i);

            By byName = By.xpath(".//h2[@class='product-name']/a");
            WebElement eName = element.findElement(byName);
            System.out.println(eName.getText());

            By byPrice = By.xpath(".//div[@class='price-label']//p[@class='special-price']");
            WebElement ePrice = element.findElement(byPrice);
            System.out.println(ePrice.getText());

            By byRating = By.xpath(".//div[@class='fhs-rating-container']");
            WebElement eRating = element.findElement(byRating);
            System.out.println(eRating.getAttribute("style"));
        }
    }

    public void clickNext(){
        btnnext.click();

    }


}
