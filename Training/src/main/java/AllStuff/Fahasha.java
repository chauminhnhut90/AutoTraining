package AllStuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("all")
public class Fahasha {

    public static void main(String[] args) {
        FahashaFavorite();

    }

    public static void FahashaFavorite() {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com/");
        webDriver.manage().window().maximize();
        clickDangNhap(webDriver);
        enterEmail(webDriver);
        enterPassword(webDriver);
        clickDangNhapbtn(webDriver);
        clickDailyDeal(webDriver);
        clickItem(webDriver);
        clickYeuThich(webDriver);
        xemYeuThich(webDriver);
        isDisplay(webDriver);
        webDriver.quit();
    }

    private static void clickDangNhap(WebDriver webDriver) {
        By by = By.xpath("//*[@title='Đăng nhập']");
        WebElement dangnhap = webDriver.findElement(by);
        Actions actions = new Actions(webDriver);
        actions.click(dangnhap).perform();
    }

    private static void enterEmail(WebDriver webDriver) {
        By byEmail = By.xpath("//*[@id='youama-email']");
        WebElement email = webDriver.findElement(byEmail);
        Actions actions = new Actions(webDriver);
        actions.click(email).perform();
        actions.sendKeys(email, "trinhnguyen190488@gmail.com").perform();
    }

    private static void enterPassword(WebDriver webDriver) {
        By byPass = By.xpath("//*[@id='youama-password']");
        WebElement pass = webDriver.findElement(byPass);
        Actions actions = new Actions(webDriver);
        actions.sendKeys(pass, "super@2019").perform();

    }

    private static void clickDangNhapbtn(WebDriver webDriver) {

        By byDangNhap = By.xpath("//button//span[contains(text(),'Đăng nhập')]");
        WebElement btndangnhap = webDriver.findElement(byDangNhap);
        Actions actions = new Actions(webDriver);
        actions.click(btndangnhap).perform();
        sleep(5000);
    }

    private static void clickDailyDeal(WebDriver webDriver) {
        By bydailydeal = By.xpath("//span[contains(text(),'Daily Deals')]");
        WebElement dailydeal = webDriver.findElement(bydailydeal);
        Actions actions = new Actions(webDriver);
        actions.click(dailydeal).perform();
    }

    private static void clickItem(WebDriver webDriver) {
        By byitem = By.xpath("//div[@class='item-inner']");
        WebElement item = webDriver.findElement(byitem);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(item).perform();
        actions.click(item).perform();
        webDriver.manage().window().fullscreen();
    }

    private static void clickYeuThich(WebDriver webDriver){
        By byyeuthich = By.xpath("//*[@class='fa fa-heart']");
        WebElement yeuthich = webDriver.findElement(byyeuthich);
        Actions actions = new Actions(webDriver);
        actions.click(yeuthich).perform();
        sleep(5000);
    }

    private static void xemYeuThich(WebDriver webDriver){
        By byxem = By.xpath("//*[contains(text(), 'Xem Yêu Thích')]");
        WebElement xem = webDriver.findElement(byxem);
        Actions actions = new Actions(webDriver);
        actions.click(xem).perform();
    }

    private static  boolean isDisplay(WebDriver webDriver){

        By byItemdisplay = By.xpath("//*[@id='wishlist-table']");
        WebElement itemdisplay = webDriver.findElement(byItemdisplay);

        Boolean isDisplayed = itemdisplay.isDisplayed();
        if (isDisplayed) {
            System.out.println("Verification successfull - San pham hien thi trong trang yeu thich");
        } else {
            System.out.println("Verification failed");
        }

        sleep(5000);

        return  isDisplayed;
    }

    private static void sleep(long miliseconds) {
        try {
            Thread.currentThread().sleep(miliseconds);
        } catch (Exception ex) {
        }
    }
}

