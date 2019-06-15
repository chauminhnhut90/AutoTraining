package FahashaBuoi11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com/?attempt=1");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //getNoiBatItems(webDriver);
       // getDeals24HItems(webDriver);
        NoiBatPage noiBatPage = new NoiBatPage(webDriver);
        noiBatPage.moveTo();
        noiBatPage.getItems();

    }

    public static void getNoiBatItems(WebDriver webDriver) {

        NoiBatPage noiBatPage = new NoiBatPage(webDriver);
        noiBatPage.moveTo();

        for (int i = 0; i < 6; i++) {
            noiBatPage.getItems();
            noiBatPage.clickNext();
        }

    }

//    public static void getDeals24HItems(WebDriver webDriver) {
//
//        Deals24H deals24H = new Deals24H(webDriver);
//        deals24H.moveToDeal();
//
//        for (int i = 0; i < 2; i++) {
//            deals24H.getDeal();
//            deals24H.clickNext();
//        }
//        webDriver.quit();
//    }

}
