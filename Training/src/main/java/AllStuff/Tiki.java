package AllStuff;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
public class Tiki {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://tiki.vn/");
        webDriver.manage().window().maximize();
        CategoriesTiKi(webDriver);
        webDriver.quit();

    }

    private static void CategoriesTiKi(WebDriver webDriver) {
        By listitem = By.xpath("//*[@id= '__next' ]//main//div/ul[@class='Navigation__Wrapper-s3youc-0 hWakax']/li//span[2]");
        List<WebElement> elements = webDriver.findElements(listitem);

        int size = elements.size();
        for (int i = 0; i < size; i++) {

            WebElement element = elements.get(i);
            new Actions(webDriver)
                    .keyDown(Keys.COMMAND)
                    .click(element).keyUp(Keys.COMMAND)
                    .build()
                    .perform();

            String title = element.getText();
            System.out.println("Category name: " + title);

            ArrayList<String> dsTabs = new ArrayList<String>(webDriver.getWindowHandles());
            System.out.println(dsTabs);
            webDriver.switchTo().window(dsTabs.get(1));
            System.out.println("URL " + webDriver.getCurrentUrl());
            webDriver.close();
            webDriver.switchTo().window(dsTabs.get(0));

        }
    }
}




