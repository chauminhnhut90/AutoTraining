import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
public class Buoi9 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Downloads/chromedriver");
        callCustomClick();
    }

    // Implicit Waits, Explicit Waits
    private static void waits() {
        WebDriver driver = new ChromeDriver();

        // Đợi không từng minh
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.fahasa.com");

        // Click Đăng nhập để show popup đang nhạp
        By by = By.xpath("//a[@title='Đăng nhập']");
        WebElement element = driver.findElement(by);
        element.click();

        // Enter email
        By byEmail = By.id("youama-email");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(byEmail));

        WebElement elEmail = driver.findElement(byEmail);
        elEmail.sendKeys("chauminhnhut90@gmail.com");

        // Enter Pw
        By byPw = By.id("youama-password");
        WebElement elPw = driver.findElement(byPw);
        elPw.sendKeys("123456a@@");

        // Click nut ĐĂNG NHẬP
        By byLogin = By.xpath("//span[contains(text(),'Đăng nhập')]");
        WebElement elLogin = driver.findElement(byLogin);
        elLogin.click();
    }

    private static void ClickCat() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://www.fahasa.com");

        By by = By.xpath("//*[@id='verticalmenu']//a[@title]");
        List<WebElement> elements = webDriver.findElements(by);

        int size = elements.size();
        for (int i = 0; i < size; i++) {
            WebElement element = elements.get(i);

            String title = element.getAttribute("title");
            System.out.println(title);

            String url = element.getAttribute("href");

            openTabBlank(webDriver);

            // Lấy ds tabs
            ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());

            // Switch qua tab thứ 2
            webDriver.switchTo().window(tabs.get(1));

            // Load url trên tab thứ 2
            webDriver.get(url);

            System.out.println(webDriver.getCurrentUrl());

            // Đóng tab thứ 2
            webDriver.close();

            // Switch về tab đầu tiên
            webDriver.switchTo().window(tabs.get(0));
        }
    }

    private static void callCustomClick() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.fahasa.com");

        By by = By.xpath("//a[text()='Quên mật khẩu?']");
        WebElement element = driver.findElement(by);

        customClick(driver, element);
    }

    private static void openTabBlank(WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.open()");
    }

    private static void customClick(WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}
