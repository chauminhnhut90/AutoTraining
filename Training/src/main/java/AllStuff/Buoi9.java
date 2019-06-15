package AllStuff;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
//Implicit Waits: tuong minh (cho tat ca item) and Explicit wait: khong tuong minh (cho 1 item)
//Sleep: dung chuong trinh, ngu doi dung 5000 milisecond chong trinh moi tiep tuc

@SuppressWarnings("all")
public class Buoi9 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        //Doi khong tuong minh, item nao cung doi cho tao mot xiu cho no load len roi moi chay tiep
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //loginFahasha(webDriver);

       // SelectCategoriesNewTab(webDriver);
        allCustomClick(webDriver);

    }

    public static void loginFahasha(WebDriver webDriver){

        webDriver.get("https://www.fahasa.com/");
        By bydangnhap = By.xpath("//*[@title='Đăng nhập']");
        WebElement dangnhap = webDriver.findElement(bydangnhap);
        dangnhap.click();

        //Wait for element loaded (doi tuong minh)
        WebDriverWait wait = new  WebDriverWait(webDriver, 30);

        By byEmail = By.id("youama-email");
        wait.until(ExpectedConditions.visibilityOfElementLocated(byEmail));

        WebElement elEmail = webDriver.findElement(byEmail);
        elEmail.click();
        elEmail.sendKeys("trinhnguyen190488@gmail.com");

        By byPass = By.id("youama-password");
        WebElement elPass = webDriver.findElement(byPass);
        elPass.sendKeys("super@2019");

        By byDN = By.xpath("//button//span[contains(text(),'Đăng nhập')]");
        WebElement  elDangnhap = webDriver.findElement(byDN);
        elDangnhap.click();

    }

    private static void SelectCategoriesNewTab(WebDriver webDriver) {
      //  System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
       // WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com/");
        webDriver.manage().window().maximize();

        By listitem = By.xpath("//div[@id='verticalmenu']//a[@title]");
        List<WebElement> elements = webDriver.findElements(listitem);

        int size = elements.size();
        for (int i = 0; i < size; i++) {
            //moi lan back ve thi lay danh sach moi
           // By listitemnew = By.xpath("//div[@id='verticalmenu']//a[@title]");
            //List<WebElement> elementsnew = webDriver.findElements(listitemnew);

            WebElement element = elements.get(i);
            new Actions(webDriver)
                    .keyDown(Keys.COMMAND)
                    .click(element).keyUp(Keys.COMMAND)
                    .build() //Dung build de gom nhieu lenh vao mot
                    .perform();


            String title = element.getAttribute("title");
            System.out.println(title);

            String urlHref = element.getAttribute("href");
            //System.out.println(urlHref);

            opentab(webDriver);

            ArrayList<String> dsTabs = new ArrayList<String>(webDriver.getWindowHandles());
            //System.out.println(dsTabs);

            //focus sang tab thu 2 sau khi duoc mo ra
            webDriver.switchTo().window(dsTabs.get(1));//get 1 la index vi tri thu 2 (tab dau tien 0, tab thu 2 la 1)

            //paste url qua tab thu 2
            webDriver.get(urlHref);

            System.out.println(webDriver.getCurrentUrl());

            //dong tab thu 2
            webDriver.close();

            //Focus ve tab dau tien sau khi dong tab thu 2
            webDriver.switchTo().window(dsTabs.get(0));



//            element.click();
//
//            String url = webDriver.getCurrentUrl();
//            System.out.println(url);
//
//            webDriver.navigate().back();

        }

        webDriver.quit();

    }

    private static void opentab(WebDriver webDriver){

        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("window.open()");

        //((JavascriptExecutor)webDriver).executeScript("window.open()"); //Ky thuat ep kieu
    }

    private static void customClick(WebDriver webDriver, WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
    }

    private static void allCustomClick(WebDriver webDriver){
        webDriver.get("https://www.fahasa.com/");

        By taoTK = By.xpath("//*[contains(text(),'Quên mật khẩu?')]");
        WebElement taiKhoan = webDriver.findElement(taoTK);

        customClick(webDriver,taiKhoan);
    }



}
