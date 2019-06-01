package Buoi10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] agrs){
        System.setProperty("webdriver.chrome.driver", "D:/Training_SE/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        HomePage homePage = new HomePage(webDriver);
        homePage.navigate();
        homePage.clickButtonTaiKhoan();
        //homePage.listMenu();

        AccountPage accountPage = new AccountPage(webDriver);
        accountPage.textboxEmail();
        accountPage.textboxPass();
        accountPage.buttonLOgin();

        InfoAccount infoAccount = new InfoAccount(webDriver);
        infoAccount.hoverMenu();
        infoAccount.listMenu();

        DichVuPage dichVuPage = new DichVuPage(webDriver);
        //Dieu khoan su dung
        String title1 = dichVuPage.getTextDieuKhoanSuDung().toLowerCase();
        dichVuPage.clickDieuKhoanSuDung();

        DieuKhoanSuDungPage dieuKhoanSuDungPage = new DieuKhoanSuDungPage(webDriver);
        String title2 = dieuKhoanSuDungPage.getTitle().toLowerCase();

        if(title1.equals(title2)){
            System.out.println("OK");
        }else {
            System.out.println("NOK");
        }

        //Chinh sach bao mat
        String title3 = dichVuPage.getTextChinhSachBaoMat().toLowerCase();
        dichVuPage.clickChinhSachBaoMat();

        ChinhSachBaoMatPage csbm = new ChinhSachBaoMatPage(webDriver);
        String title4 = csbm.GetTitle().toLowerCase();

        if(title3.equals(title4)){
            System.out.println("OK");
        }else {
            System.out.println("NOK");
        }

        //Gioi thieu Fahasa
        String title5 = dichVuPage.getGTFahasa().toLowerCase();
        dichVuPage.ClickGioiThieuFahasa();

        GioiThieuFahasaPage gtFahasa = new GioiThieuFahasaPage(webDriver);
        String title6 = gtFahasa.getTitle().toLowerCase();

        if(title5.equals(title6)){
            System.out.println("OK");
        }else {
            System.out.println("NOK");
        }

        // He thong trung tam - nha sach
        String title7= dichVuPage.getHTTT().toLowerCase();
        dichVuPage.ClickHeThongTrungTam();

        HeThongTrungTamPage httt = new HeThongTrungTamPage(webDriver);
        String title8 = httt.getTitle().toLowerCase();

        if(title7.equals(title8)){
            System.out.println("OK");
        }else {
            System.out.println("NOK");
        }
    }
}
