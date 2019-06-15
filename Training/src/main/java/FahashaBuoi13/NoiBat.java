package FahashaBuoi13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

@SuppressWarnings("all")
public class NoiBat {
    WebDriver webDriver;

    @FindBy(xpath = "//div[@id='tabkm-gia-noi-bat']//div[contains(@class,'item-inner')]")
    private List<WebElement> elementsNB;

    @FindBy(xpath = "//div[@class='tabslider-header']")
    private WebElement nbtitle;

    @FindBy(xpath = "//*[@id='categorytab-gia-noi-bat']//a[@class='bx-next']")
    private WebElement btnnext;

    public NoiBat(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void moveTo() {
        Actions action = new Actions(webDriver);
        action.moveToElement(nbtitle).perform();
    }

    public void getItems() {
        //   int size = elementsNB.size();
//           for (int i = 0; i<size; i++){
//            WebElement element = noibat.get(i);

        for (WebElement element : elementsNB) {
            By byName = By.xpath(".//h2[@class='product-name']/a");
            WebElement eName = element.findElement(byName);
            String title = getTextOfHiddenElement(webDriver, eName);
            intext(title);

            By byPrice = By.xpath(".//span[starts-with(@id,'product-price')]");
            WebElement ePrice = element.findElement(byPrice);
            // System.out.println(ePrice.getText());
            String price = getTextOfHiddenElement(webDriver,ePrice);
            intext(price);


//            By byRating = By.xpath(".//div[@class='rating']");
//            WebElement eRating = element.findElement(byRating);
//            //System.out.println(eRating.getAttribute("style"));
//            String rating = getTextOfHiddenElement(webDriver, eRating);
//            intext(rating);
        }
    }

    public void clickNext() {
        btnnext.click();

    }

    //option+enter import thu vien

    private static String getTextOfHiddenElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = js.executeScript("return arguments[0].innerHTML", element).toString();
        return text;
    }

    private static void intext(String text) {
        System.out.println(text);
    }


}
