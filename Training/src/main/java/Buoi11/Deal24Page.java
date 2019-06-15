package Buoi11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
@SuppressWarnings("all")
public class Deal24Page {
    private WebDriver webDriver;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']")
    public WebElement tabDeal24;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']//*[@id='tabdeal-vh-deal-qv1']//li")
    public List<WebElement> productsVH;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']//*[@id='tabdeal-kn-deal-qv1']")
    public WebElement linkKN;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']//*[@id='tabdeal-kn-deal-qv1']//li")
    public List<WebElement> productsKN;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']//*[@id='tabdeal-ndc-deal-qv1']")
    public WebElement linkNDC;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']//*[@id='tabdeal-ndc-deal-qv1']//li")
    public List<WebElement> productsNDC;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']//*[@id='tabdeal-kt-deal-qv1']//li")
    public WebElement linkKT;

    @FindBy(xpath = "//*[@id='categorytab-deal-qv1']//*[@id='tabdeal-kt-deal-qv1']//li")
    public List<WebElement> productsKT;

    public Deal24Page(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void TabDeal24(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(tabDeal24).perform();
    }

    public void getProductVH(){
        for(WebElement product : productsVH ){
            By byProductName = By.xpath(".//h2[@class='product-name']/a");
            WebElement productName = product.findElement(byProductName);
            String title = getTextOfHiddenElement(webDriver,productName);
            System.out.println(title);

            By byPrice = By.xpath(".//span[starts-with(@id,'product-price')]");
            WebElement price = product.findElement(byPrice);
            String p = getTextOfHiddenElement(webDriver,price);
            System.out.println(p);
        }
    }

    public void LinkKN(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(linkKN).click().build().perform();
    }

    public void getProductKN(){
        for(WebElement product : productsKN ){
            By byProductName = By.xpath(".//h2[@class='product-name']/a");
            WebElement productName = product.findElement(byProductName);
            String title = getTextOfHiddenElement(webDriver,productName);
            System.out.println(title);

            By byPrice = By.xpath(".//span[starts-with(@id,'product-price')]");
            WebElement price = product.findElement(byPrice);
            String p = getTextOfHiddenElement(webDriver,price);
            System.out.println(p);
        }
    }

    public void LinkNDC(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(linkNDC).click().build().perform();
    }

    public void getProductNDC(){
        for(WebElement product : productsNDC ){
            By byProductName = By.xpath(".//h2[@class='product-name']/a");
            WebElement productName = product.findElement(byProductName);
            String title = getTextOfHiddenElement(webDriver,productName);
            System.out.println(title);

            By byPrice = By.xpath(".//span[starts-with(@id,'product-price')]");
            WebElement price = product.findElement(byPrice);
            String p = getTextOfHiddenElement(webDriver,price);
            System.out.println(p);
        }
    }

    public void LinkKT(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(linkKT).click().build().perform();
    }

    public void getProductKT(){
        for(WebElement product : productsKT ){
            By byProductName = By.xpath(".//h2[@class='product-name']/a");
            WebElement productName = product.findElement(byProductName);
            String title = getTextOfHiddenElement(webDriver,productName);
            System.out.println(title);

            By byPrice = By.xpath(".//span[starts-with(@id,'product-price')]");
            WebElement price = product.findElement(byPrice);
            String p = getTextOfHiddenElement(webDriver,price);
            System.out.println(p);
        }
    }

    private static String getTextOfHiddenElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = js.executeScript("return arguments[0].innerHTML", element).toString();
        return text;
    }
}
