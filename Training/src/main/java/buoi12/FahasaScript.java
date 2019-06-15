package buoi12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
public class FahasaScript {

    @BeforeSuite(alwaysRun = true)
    public void setUpWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Downloads/chromedriver");
    }

    @Test(invocationCount = 10, invocationTimeOut = 10000, threadPoolSize = 5, enabled = false)
    public void testLoop() {
        System.out.println(Thread.currentThread().getName());
    }

    @Test
    public void verifyDKSD() {
        WebDriver driver = createWebDriver();
        driver.manage().window().maximize();
        driver.get("https://www.fahasa.com");

        WebElement eNoiBat = driver.findElement(By.id("categorytab-gia-noi-bat"));
        Actions actions = new Actions(driver);
        actions.moveToElement(eNoiBat).perform();

        By by = By.xpath("//*[@id='tabkm-gia-noi-bat']//li[contains(@class,'item')]");
        List<WebElement> elements = driver.findElements(by);

        for (WebElement element : elements) {

            By byName = By.xpath(".//h2//a[@title]");
            WebElement eName = element.findElement(byName);
            String title = getTextOfHiddenElement(driver, eName);
            inText(title);

            String attr = getAttributeValueOfHiddenElement(driver, element, "aria-hidden");
            inText(attr);
        }

        driver.quit();
    }

    private WebDriver createWebDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    private static void inText(String text) {
        System.out.println(text);
    }

    public static String getTextOfHiddenElement(WebDriver driver, WebElement element) {
        String jsScript = "return arguments[0].innerHTML";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = js.executeScript(jsScript, element).toString();
        return text;
    }

    public static String getAttributeValueOfHiddenElement(WebDriver driver, WebElement element, String attr) {
        String jsScript = String.format("return arguments[0].getAttribute('%s')", attr);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = js.executeScript(jsScript, element).toString();
        return text;
    }
}
