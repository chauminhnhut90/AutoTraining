package buoi10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        DichVuPage dichVuPage = new DichVuPage(driver);
        dichVuPage.navigate();

        String title1 = dichVuPage.getDKSDTText().toLowerCase();

        dichVuPage.clickDKSD();

        DieuKhoanSuDungPage dksd = new DieuKhoanSuDungPage(driver);
        String title2 = dksd.getTtitle().toLowerCase();

        if (title1.equals(title2)) {
            System.out.println("OK");
        } else {
            System.out.println("Ko OK");
        }

    }
}
