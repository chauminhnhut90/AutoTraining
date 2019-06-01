import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nhutcm
 * @since 19/05/2019
 */
@SuppressWarnings("all")
public class Main {

    // 3 types of exception in Selenium
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Downloads/chromedriver");

        ClickCat2();
    }

    // 1. NoSuchElementException
    private static void exception1() {
        // Step 1
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com");

        By by = By.xpath("//a[text()='Đăng nhập']");
        WebElement element = webDriver.findElement(by);
        element.click();

        sleep(50000);
        webDriver.quit();
    }

    // 2. ElementNotVisibleException
    private static void exception2() {
        // Step 1
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com");

        By by = By.xpath("//span[contains(text(),'Đăng nhập')]");
        WebElement element = webDriver.findElement(by);
        element.click();

        sleep(50000);
        webDriver.quit();
    }

    // 3. StaleElementReferenceException
    private static void exception3() {
        // Step 1
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://www.fahasa.com");

        By by = By.xpath("//a[text()='Tài khoản']");
        WebElement elementTK = webDriver.findElement(by);

        elementTK.click();

        sleep(3000);
        webDriver.navigate().back();

        elementTK.click();

        sleep(50000);
        webDriver.quit();
    }

    private static void ClickCat() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://www.fahasa.com");

        By by = By.xpath("//*[@id='verticalmenu']//a[@title]");
        List<WebElement> elements = webDriver.findElements(by);

        int size = elements.size();
        for (int i = 0; i < size; i++) {

            // Lấy lại ds mới
            By byNew = By.xpath("//*[@id='verticalmenu']//a[@title]");
            List<WebElement> elementsNew = webDriver.findElements(byNew);

            WebElement element = elementsNew.get(i);

            String title = element.getAttribute("title");
            System.out.println(title);

            element.click();

            String url = webDriver.getCurrentUrl();
            System.out.println(url);

            webDriver.navigate().back();
        }
    }

    /**
     * Link tham khao:
     * <p>
     * https://loadfocus.com/blog/2017/02/how-to-open-a-new-tab-using-selenium-webdriver-with-java/
     */
    private static void ClickCat2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://tiki.vn/");

        By by = By.xpath("//li[contains(@class,'MenuItem')]/a/span[@class='text']");
        List<WebElement> elements = webDriver.findElements(by);

        int size = elements.size();
        for (int i = 0; i < size; i++) {
            WebElement element = elements.get(i);

            String text = element.getText();
            System.out.println(text);

            new Actions(webDriver)
                    .keyDown(Keys.COMMAND)
                    .click(element)
                    .keyUp(Keys.COMMAND)
                    .build() // .build là để kết hợp tất cả các hành động trên thành 1 lệnh
                    .perform(); // thực hiện lệnh


            // Lấy ds các tab đang có
            ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());

            // Switch qua tab cuối cùng (tab vừa mở)
            webDriver.switchTo().window(tabs.get(1));

            // lấy Url và in ra
            String url = webDriver.getCurrentUrl();
            System.out.println(url);

            // Đóng tab vừa mở
            webDriver.close();

            // Switch về tab đầu tien
            webDriver.switchTo().window(tabs.get(0));
        }
    }

    private static void ClickCat3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://tiki.vn/");

        String path = "//li[contains(@class,'MenuItem')]/a";
        By by = By.xpath(path);
        List<WebElement> elements = webDriver.findElements(by);

        int size = elements.size();
        for (int i = 0; i < size; i++) {
            WebElement element = elements.get(i);

            // In text của danh mục
            WebElement elTitle = element.findElement(By.xpath("./span[@class='text']"));
            String text = elTitle.getText();
            System.out.println(text);

            String url = element.getAttribute("href");

            openTab(webDriver);

            // Lấy ds các tab đang có
            ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());

            // Switch qua tab cuối cùng (tab vừa mở)
            webDriver.switchTo().window(tabs.get(1));

            // Load url ở tab mới
            webDriver.get(url);

            // lấy Url và in ra
            url = webDriver.getCurrentUrl();
            System.out.println(url);

            // Đóng tab vừa mở
            webDriver.close();

            // Switch về tab đầu tien
            webDriver.switchTo().window(tabs.get(0));
        }
    }

    /**
     * Link tham khao JavascriptExecutor
     * <p>
     * https://www.guru99.com/execute-javascript-selenium-webdriver.html
     */
    private static void openTab(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.open()");
    }

    private static void sleep(long milisecond) {
        try {
            Thread.currentThread().sleep(milisecond);
        } catch (Exception ex) {
        }
    }
}
