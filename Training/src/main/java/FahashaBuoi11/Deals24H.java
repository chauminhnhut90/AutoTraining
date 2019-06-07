package FahashaBuoi11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Deals24H {
    WebDriver webDriver;

    @FindBy(xpath = "//div[@id='tabdeal-vh-deal-qv1']//div[contains(@class,'item-inner')]")
    private List<WebElement> deallist;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']")
    private WebElement deals24;

    @FindBy(xpath = "//*[@id='tabdeal-vh-deal-qv1']//a[@class='bx-next']")
    private WebElement btnnext;


    public Deals24H(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void moveToDeal() {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(deals24).perform();
    }

    public void getDeal() {

        int size = deallist.size();
        for (int i = 0; i < size; i++) {

            WebElement element = deallist.get(i);

            By byName = By.xpath(".//h2[@class='product-name']/a");
            WebElement eName = element.findElement(byName);
            System.out.println(eName.getText());

            By byPrice = By.xpath(".//div[@class='price-label']//span[@class='price m-price-font']");
            WebElement ePrice = element.findElement(byPrice);
            System.out.println(ePrice.getText());

        }
    }

    public void clickNext() {
        btnnext.click();
    }


}
