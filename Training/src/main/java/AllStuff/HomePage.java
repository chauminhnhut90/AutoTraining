package AllStuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
@SuppressWarnings("all")
public class HomePage {
    WebDriver webDriver;

    @FindBy(xpath = "//span[contains(text(),'Daily Deals')]")
    private WebElement dailydeal;

    @FindBy(xpath = "//div[@class='item-inner']")
    private WebElement item;

    @FindBy(xpath = "//*[@class='fa fa-heart']")
    private WebElement yeuthich;

    @FindBy(xpath = "//*[contains(text(), 'Xem Yêu Thích')]")
    private WebElement xem;

    @FindBy(xpath = "//*[@id='wishlist-table']")
    private WebElement itemdisplay;


   @FindBy(xpath = "//div[@id='verticalmenu']//a[@title]")
   private List<WebElement> elements;// = webDriver.findElements(listitem);

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }



    public void clickDailyDeal() {

        Actions actions = new Actions(webDriver);
        actions.click(dailydeal).perform();
    }

    public void clickItem() {

        Actions actions = new Actions(webDriver);
        actions.moveToElement(item).perform();
        actions.click(item).perform();
        webDriver.manage().window().fullscreen();
    }

    public void clickYeuThich() {

        Actions actions = new Actions(webDriver);
        actions.click(yeuthich).perform();
        //sleep(5000);
    }

    public void xemYeuThich() {

        Actions actions = new Actions(webDriver);
        actions.click(xem).perform();
    }

    public boolean isDisplay() {


        Boolean isDisplayed = itemdisplay.isDisplayed();
        if (isDisplayed) {
            System.out.println("Verification successfull - San pham hien thi trong trang yeu thich");
        } else {
            System.out.println("Verification failed");
        }

        // sleep(5000);

        return isDisplayed;
    }

    public void SelectCategories() {


        int size = elements.size();
        for (int i = 0; i < size; i++) {
            WebElement element = elements.get(i);
            String title = element.getAttribute("title");
            System.out.println(title);
        }
    }
}
