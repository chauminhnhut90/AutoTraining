package BaiTapBuoi15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@SuppressWarnings("all")
public class NoiBatB15 {
    WebDriver webDriver;

    @FindBy(xpath = "//div[@id='tabkm-gia-noi-bat']//div[contains(@class,'item-inner')]")
    private List<WebElement> elementsNBB15;

    @FindBy(xpath = "//div[@class='tabslider-header']")
    private WebElement nbtitleNB;

    public NoiBatB15(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void moveToNBB15() {
        Actions action = new Actions(webDriver);
        action.moveToElement(nbtitleNB).perform();
    }

    public void getItemsNBB15() {

        for (WebElement element : elementsNBB15 ) {
            By byName = By.xpath(".//h2[@class='product-name']/a");
            WebElement eName = element.findElement(byName);
            String title = getTextOfHiddenElement(webDriver, eName);
            intext(title);

            By byPrice = By.xpath(".//span[starts-with(@id,'product-price')]");
            WebElement ePrice = element.findElement(byPrice);
            String price = getTextOfHiddenElement(webDriver,ePrice);
            intext(price);

        }
    }

    private static String getTextOfHiddenElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = js.executeScript("return arguments[0].innerHTML", element).toString();
        return text;
    }

    private static void intext(String text) {
        System.out.println(text);
    }
}
