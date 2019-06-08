package Buoi11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class NoiBatPage {
    private WebDriver webDriver;

    @FindBy(xpath = "//*[@id='categorytab-gia-noi-bat']")
    public WebElement tabNoiBat;

    @FindBy(xpath = "//*[@id='categorytab-gia-noi-bat']//*[@id='tabkm-gia-noi-bat']//li")
    public List<WebElement> products;

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

    public void getProduct() {
        for(WebElement product : products ){
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
