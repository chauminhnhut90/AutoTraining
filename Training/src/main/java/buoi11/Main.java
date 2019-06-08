package buoi11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Downloads/chromedriver");
        c2();
    }

    private static void c1() {

    }

    private static void c2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.fahasa.com");

        WebElement eNoiBat = driver.findElement(By.id("categorytab-gia-noi-bat"));
        Actions actions = new Actions(driver);
        actions.moveToElement(eNoiBat).perform();

        By by = By.xpath("//*[@id='tabkm-gia-noi-bat']//li[contains(@class,'item')]");
        List<WebElement> elements = driver.findElements(by);

        for (WebElement element : elements) {

            WebElement eName = element.findElement(By.xpath(".//h2//a[@title]"));
            String title = getTextOfHiddenElement(driver, eName);
            inText(title);

            WebElement ePrice = element.findElement(By.xpath("//span[starts-with(@id,'product-price')]"));
            String price = getTextOfHiddenElement(driver, ePrice);
            inText(price);
        }

        driver.quit();
    }

    private static void inText(String text) {
        System.out.println(text);
    }

    private static String getTextOfHiddenElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = js.executeScript("return arguments[0].innerHTML", element).toString();
        return text;
    }
}
