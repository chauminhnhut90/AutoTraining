import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@SuppressWarnings("all")
public class LearnException {
    public static void main(String[] args) {
        //exception1();
        //exception2();
        //exception3();
        SelectCategories();
    }

    private static void exception1() {
        //Exception1: NoSuchelementException: sai xpath
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com/");
        webDriver.manage().window().maximize();
        By by = By.xpath("//*[@title='Đăng nập']");
        WebElement dangnhap = webDriver.findElement(by);
        Actions actions = new Actions(webDriver);
        actions.click(dangnhap).perform();
        webDriver.quit();
    }

    private static void exception2() {
        //ElementNotVisibleException : tuy xpath co nhung khong click duoc do bi an duoi 1 cai khac
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com/");

        By by = By.xpath("//button//span[contains(text(),'Đăng nhập')]");
        WebElement dangnhap = webDriver.findElement(by);
        dangnhap.click();

        webDriver.quit();

    }

    private static void exception3() {
        //StaleExceptionNot ....: do khi back lai thi sinh ra element xpath khac nen phai lay lai xpath
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com/");

        By by = By.xpath("//*[@title='Tài khoản']");
        WebElement taikhoan = webDriver.findElement(by);
        taikhoan.click();

        sleep(3000);

        webDriver.navigate().back();

        sleep(3000);

        webDriver.manage().window().maximize();

        sleep(3000);

        webDriver.navigate().back();

        sleep(3000);

        taikhoan.click();


    }

    private static void SelectCategories() {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com/");
        webDriver.manage().window().maximize();

        By listitem = By.xpath("//div[@id='verticalmenu']//a[@title]");
        List<WebElement> elements = webDriver.findElements(listitem);

        int size = elements.size();
        for (int i = 0; i < size; i++) {
            //moi lan back ve thi lay danh sach moi
            By listitemnew = By.xpath("//div[@id='verticalmenu']//a[@title]");
            List<WebElement> elementsnew = webDriver.findElements(listitemnew);
            WebElement element = elementsnew.get(i);
            String title = element.getAttribute("title");
            System.out.println(title);

            element.click();

            String url = webDriver.getCurrentUrl();
            System.out.println(url);

            webDriver.navigate().back();

            webDriver.quit();
        }

    }

    private static void sleep(long miliseconds) {
        try {
            Thread.currentThread().sleep(miliseconds);
        } catch (Exception ex) {
        }
    }

}
