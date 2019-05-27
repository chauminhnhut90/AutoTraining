import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
public class Tiki {
    /**
     * @author tuyennguyen
     * @since 27/05/2019
     * */

   public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:/Training_SE/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("https://tiki.vn/");
        menu(webDriver);
    }
    /*Viết chương trình liệt kê tất cả các danh mục cha của trang web tiki.vn.
    In ra tên danh mục kèm theo url của danh mục đó.*/

    private static void menu(WebDriver webDriver){
        By byMenu = By.xpath("//li[@class='MenuItem-tii3xq-0 krWJFU']/a/span[2]");
        List<WebElement> elementList = webDriver.findElements(byMenu);

        for(int i = 0; i < elementList.size();i++){
            By byNew = By.xpath("//li[@class='MenuItem-tii3xq-0 krWJFU']/a/span[2]");
            List<WebElement> elementNew = webDriver.findElements(byNew);

            //in danh sach menu
            WebElement element = elementNew.get(i);
            System.out.println(element.getText());

            //Click, open tab and get url --> print url
            new Actions(webDriver).keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
            ArrayList<String> dsTabs = new ArrayList<String>(webDriver.getWindowHandles());
            webDriver.switchTo().window(dsTabs.get(1));
            System.out.println(webDriver.getCurrentUrl());
            webDriver.close();
            webDriver.switchTo().window(dsTabs.get(0));

        }
    }
}
