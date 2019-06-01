package buoi10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.clickButtonTaiKhoan();

        AccountPage accountPage = new AccountPage(driver);
        accountPage.enterUserPass("chauminhnhut90@gmail.com", "123456a@@");
        accountPage.clickLogin();
    }
}
