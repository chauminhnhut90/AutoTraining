package Fahasha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FahashaScripts {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","/Users/newuser/AutoTraining/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        checkDieuKhoan(webDriver);
        checkChinhSach(webDriver);
        checkGioiThieu(webDriver);
        checkHeThong(webDriver);

        webDriver.quit();

    }

    public static void checkDieuKhoan(WebDriver webDriver){
        DichVuPage dichVuPage = new DichVuPage(webDriver);
        dichVuPage.navigate();
        String title1 = dichVuPage.getDKTitle().toLowerCase();
        dichVuPage.clickDieuKhoanLink();

        DieuKhoanPage dieuKhoanPage = new DieuKhoanPage(webDriver);
        String title2 = dieuKhoanPage.getTitle().toLowerCase();

        if (title1.equals(title2)){
            System.out.println("Title của Điều Khoản Sử dụng hiện thị đúng.");
        }else {
            System.out.println("Title hiển thị chưa ");
        }

    }
    public static void checkChinhSach(WebDriver webDriver){
        DieuKhoanPage dieuKhoanPage = new DieuKhoanPage(webDriver);
        dieuKhoanPage.moveToFooter();
        String title1 = dieuKhoanPage.getCSTitle().toLowerCase();
        dieuKhoanPage.clickChinhSachLink();

        ChinhSachBaoMatPage chinhSachBaoMatPage = new ChinhSachBaoMatPage(webDriver);
        String title2 = chinhSachBaoMatPage.getTitle().toLowerCase();

        if (title1.equals(title2)){
            System.out.println("Title của chính sách bảo mật page hiển thị dung ");
        }else {
            System.out.println("Title hiển thị không dung ");
        }

    }

    public static void checkGioiThieu(WebDriver webDriver){
        ChinhSachBaoMatPage chinhSachBaoMatPage = new ChinhSachBaoMatPage(webDriver);

        String title1 = chinhSachBaoMatPage.getGTTitle().toLowerCase();

        chinhSachBaoMatPage.clickGioiThieuLink();
        GioiThieuPage gioiThieuPage = new GioiThieuPage(webDriver);
        String title2 = gioiThieuPage.getTitle().toLowerCase();

        if (title1.equals(title2)){
            System.out.println("Title cua Trang Gioi Thieu Fahasha hien thi dung");
        }else {
            System.out.println("Title hien thi sai");
        }
    }


    public static void checkHeThong(WebDriver webDriver){
        GioiThieuPage gioiThieuPage = new GioiThieuPage(webDriver);

        String title1 = gioiThieuPage.getHTTitle().toLowerCase();

        gioiThieuPage.clickHeThongFahashaLink();
        HeThongFahashaPage heThongFahashaPage = new HeThongFahashaPage(webDriver);
        String title2 = heThongFahashaPage.getTitle().toLowerCase();

        if (title1.equals(title2)){
            System.out.println("Title cua Trang He Thong Fahasha hien thi dung");
        }else {
            System.out.println("Title hien thi sai");
        }
    }


}
