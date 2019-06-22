package BaiTapBuoi15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class VanHocB15 {

    WebDriver webDriver;

    public VanHocB15(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div[@id='categorytab-block-van-hoc']")
    private WebElement vanhoc;

    @FindBy(xpath = "//*[@id='tabcomingsoonvh-block-van-hoc']//div[contains(@class,'products-row')]//div[contains(@class,'product-col')]")
    private List<WebElement> itemVH;

    public void movetoVH() {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(vanhoc).perform();
    }

    public void getItemVH() {

        for (WebElement element : itemVH) {
            By byName = By.xpath(".//h3/a");
            WebElement eName = element.findElement(byName);
            String title = getTextOfHiddenElement(webDriver, eName);
            inText(title);

            By byPrice = By.xpath(".//span[starts-with(@id,'product-price')]");
            WebElement ePrice = element.findElement(byPrice);
            String Price = getTextOfHiddenElement(webDriver, ePrice);
            inText(Price);

        }

    }

    public static String getTextOfHiddenElement(WebDriver driver, WebElement element) {
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        String text = JS.executeScript("return arguments[0].innerHTML", element).toString();
        return text;

    }

    public void inText(String text) {
        System.out.println(text);
    }


}
