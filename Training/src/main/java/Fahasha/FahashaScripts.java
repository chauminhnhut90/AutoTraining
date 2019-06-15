package Fahasha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FahashaScripts {

//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        webDriver.manage().window().maximize();
//
////        checkDieuKhoan(webDriver);
////        checkChinhSach(webDriver);
////        checkGioiThieu(webDriver);
////        checkHeThong(webDriver);
//
//
//
//    }


    @BeforeSuite
    public void setUpWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
    }


    @Test
    public void checkDieuKhoan() {

        WebDriver webDriver = createWebdriver();
        webDriver.get("https://www.fahasa.com/");

        DichVuPage dichVuPage = new DichVuPage(webDriver);
        //dichVuPage.navigate();


        String title1 = dichVuPage.getDKTitle().toLowerCase();
        dichVuPage.clickDieuKhoanLink();

        DieuKhoanPage dieuKhoanPage = new DieuKhoanPage(webDriver);
        String title2 = dieuKhoanPage.getTitle().toLowerCase();

        if (title1.equals(title2)) {
            Assert.assertTrue(true);
            System.out.println("Title của Điều Khoản Sử dụng hiện thị đúng.");
        } else {
            Assert.assertTrue(false);
            System.out.println("Title hiển thị chưa ");
        }

        webDriver.quit();

    }

    @Test
    public void checkChinhSach() {


        WebDriver webDriver = createWebdriver();
        webDriver.get("https://www.fahasa.com/");

        DieuKhoanPage dieuKhoanPage = new DieuKhoanPage(webDriver);
        dieuKhoanPage.moveToFooter();
        String title1 = dieuKhoanPage.getCSTitle().toLowerCase();
        dieuKhoanPage.clickChinhSachLink();

        ChinhSachBaoMatPage chinhSachBaoMatPage = new ChinhSachBaoMatPage(webDriver);
        String title2 = chinhSachBaoMatPage.getTitle().toLowerCase();

        if (title1.equals(title2)) {
            Assert.assertTrue(true);
            System.out.println("Title của chính sách bảo mật page hiển thị dung ");
        } else {
            Assert.assertTrue(false);
            System.out.println("Title hiển thị không dung ");
        }

//        Boolean kq = title1.equals(title2);
//        Assert.assertTrue(kq, "Verify Title hiển thị không dung");
        webDriver.quit();
    }

    @Test
    public void checkGioiThieu() {

        WebDriver webDriver = createWebdriver();
        webDriver.get("https://www.fahasa.com/");

        ChinhSachBaoMatPage chinhSachBaoMatPage = new ChinhSachBaoMatPage(webDriver);
        String title1 = chinhSachBaoMatPage.getGTTitle().toLowerCase();

        chinhSachBaoMatPage.clickGioiThieuLink();
        GioiThieuPage gioiThieuPage = new GioiThieuPage(webDriver);
        String title2 = gioiThieuPage.getTitle().toLowerCase();

        if (title1.equals(title2)) {
            Assert.assertTrue(true);
            System.out.println("Title cua Trang Gioi Thieu AllStuff.Fahasha hien thi dung");
        } else {
            Assert.assertTrue(false);
            System.out.println("Title hien thi sai");
        }
        webDriver.quit();
    }

    @Test
    public void checkHeThong() {

        WebDriver webDriver = createWebdriver();
        webDriver.get("https://www.fahasa.com/");

        GioiThieuPage gioiThieuPage = new GioiThieuPage(webDriver);
        String title1 = gioiThieuPage.getHTTitle().toLowerCase();

        gioiThieuPage.clickHeThongFahashaLink();
        HeThongFahashaPage heThongFahashaPage = new HeThongFahashaPage(webDriver);
        String title2 = heThongFahashaPage.getTitle().toLowerCase();

        if (title1.equals(title2)) {
            Assert.assertTrue(true);
            System.out.println("Title cua Trang He Thong AllStuff.Fahasha hien thi dung");
        } else {
            Assert.assertTrue(false);
            System.out.println("Title hien thi sai");
        }
        webDriver.quit();
    }

    private WebDriver createWebdriver() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        return webDriver; //return vi dung kieu du lieu webdriver phai return
    }





}
