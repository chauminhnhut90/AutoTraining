import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author trinhnguyen
 **/
public class Main {


    public static void main(String[] args) {

        //sua chromedriver dia chi
        // Step 0 :  Config Webdriver
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Documents/AutoTranning/chromedriver");

        // Step 1
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://demo.guru99.com/test/drag_drop.html");

        Actions actions = new Actions(webDriver);

        By bank = By.xpath("//a[contains(text(),'BANK')]");
        WebElement elementSource = webDriver.findElement(bank);

        By target = By.xpath("//div[@id='shoppingCart1']//li[@class='placeholder']");
        WebElement elementTarget = webDriver.findElement(target);

        actions.dragAndDrop(elementSource, elementTarget).perform();

        sleep(50000);

        webDriver.quit();
    }

    private static void sleep(long milisecond) {
        try {
            Thread.currentThread().sleep(milisecond);
        } catch (Exception ex) {

        }
    }


    //        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(TIME_OUT, TimeUnit.SECONDS);
//        driver.manage().timeouts().setScriptTimeout(TIME_OUT, TimeUnit.SECONDS);

}
