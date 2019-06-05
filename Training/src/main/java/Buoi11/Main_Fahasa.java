package Buoi11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author tuyennguyen
 * @since 19/05/2019
 * */

public class Main_Fahasa {
    /*Liệt kê toàn bộ sách trong các mục bên dưới, mỗi sách phải liêt kê ra đầy đủ thông tin mà sách đó đang hiển thị.
    VD: Tên sách, giá tiền, rating… (áp dụng POM) của trang https://www.fahasa.com
    * NỔI BẬT,
    * DEALS 24H - SÁCH TIẾNG VIỆT,
    * VĂN HỌC
    * LỚP HỌC MẬT NGỮ*/
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:/Training_SE/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        HomePage homePage = new HomePage(webDriver);
        homePage.navigate();

        NoiBatPage noiBatPage = new NoiBatPage(webDriver);
        noiBatPage.tabNoiBat();
        noiBatPage.getProductName();

        System.out.println("-----------------------------------------");

        Deal24Page deal24Page = new Deal24Page(webDriver);
        deal24Page.TabDeal24();
        deal24Page.getProductName();

        System.out.println("-----------------------------------------");

        VanHocPage vanHocPage = new VanHocPage(webDriver);
        vanHocPage.TabVanHoc();
        vanHocPage.getProductName();

        System.out.println("-----------------------------------------");

        LopHocMatNguPage lopHocMatNguPage = new LopHocMatNguPage(webDriver);
        lopHocMatNguPage.TabLopHocMatNgu();
        lopHocMatNguPage.getProductName();



    }



}
