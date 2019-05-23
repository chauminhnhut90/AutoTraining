import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author trinhnguyen
 * <<<<<<< HEAD
 */

public class Main {

    public static void main(String[] args) {

        //sua chromedriver dia chi
        // Step 0 :  Config Webdriver
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
        // Step 1
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com/");
        webDriver.manage().window().maximize();
        By by = By.xpath("//*[@title='Đăng nhập']");
        WebElement dangnhap = webDriver.findElement(by);
        Actions actions = new Actions(webDriver);
        actions.click(dangnhap).perform();

        By byEmail = By.xpath("//*[@id='youama-email']");
        WebElement email = webDriver.findElement(byEmail);

        By byPass = By.xpath("//*[@id='youama-password']");
        WebElement pass = webDriver.findElement(byPass);

        By byDangNhap = By.xpath("//button//span[contains(text(),'Đăng nhập')]");
        WebElement btndangnhap = webDriver.findElement(byDangNhap);

        By bybody = By.xpath("//*[@id=\"offcanvas-container\"]");
        WebElement body = webDriver.findElement(bybody);

        actions.click(email).perform();

        actions.sendKeys(email, "trinhnguyen190488@gmail.com").perform();
        actions.sendKeys(pass, "super@2019").perform();
        actions.click(btndangnhap).perform();
        sleep(5000);

        By bydailydeal = By.xpath("//span[contains(text(),'Daily Deals')]");
        WebElement dailydeal = webDriver.findElement(bydailydeal);
        actions.click(dailydeal).perform();

        sleep(5000);

        By byitem = By.xpath("//div[@class='item-inner']");
        WebElement item = webDriver.findElement(byitem);

        actions.moveToElement(item).perform();

        actions.click(item).perform();
        //actions.click(dailydeal).perform();

        webDriver.manage().window().fullscreen();

        By byyeuthich = By.xpath("//*[@class='fa fa-heart']");
        WebElement yeuthich = webDriver.findElement(byyeuthich);
        actions.click(yeuthich).perform();
        sleep(5000);

        By byxem = By.xpath("//*[contains(text(), 'Xem Yêu Thích')]");
        WebElement xem = webDriver.findElement(byxem);
        actions.click(xem).perform();

        By byItemdisplay = By.xpath("//*[@id='wishlist-table']");
        WebElement itemdisplay = webDriver.findElement(byItemdisplay);

        Boolean isDisplayed = itemdisplay.isDisplayed();
        if (isDisplayed) {
            System.out.println("Verification successfull - San pham hien thi trong trang yeu thich");
        } else {
            System.out.println("Verification failed");
        }


        sleep(5000);
        webDriver.quit();
    }

    private static void sleep(long milisecond) {
        try {
            Thread.currentThread().sleep(milisecond);
        } catch (Exception ex) {

        }

    }

    private static void ActionsLearning(WebDriver webDriver) {

        webDriver.get("http://demo.guru99.com/test/drag_drop.html");

        Actions actions = new Actions(webDriver);

        By bank = By.xpath("//a[contains(text(),'BANK')]");
        WebElement elementSource = webDriver.findElement(bank);

        By target = By.xpath("//div[@id='shoppingCart1']//li[@class='placeholder']");
        WebElement elementTarget = webDriver.findElement(target);

        actions.dragAndDrop(elementSource, elementTarget).perform();
    }


    //webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //driver.manage().timeouts().pageLoadTimeout(TIME_OUT, TimeUnit.SECONDS);
    //driver.manage().timeouts().setScriptTimeout(TIME_OUT, TimeUnit.SECONDS);

}
