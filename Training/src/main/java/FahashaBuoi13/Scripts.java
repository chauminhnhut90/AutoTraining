package FahashaBuoi13;
import FahashaBuoi11.Deals24H;
import FahashaBuoi11.NoiBatPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
//@Test(retryAnalyzer = RetryAnalyzer.class)
public class Scripts {

    @BeforeSuite
    public void setUpWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
    }

    @Test (retryAnalyzer = RetryAnalyzer.class)
    public void getNoiBatItems() {

        WebDriver webDriver = createWebdriver();
        webDriver.get("https://www.fahasa.com/");

        NoiBatPage noiBatPage = new NoiBatPage(webDriver);
        noiBatPage.moveTo();
        noiBatPage.getItems();
        Assert.assertTrue(true);
        webDriver.quit();

    }

    @Test (retryAnalyzer = RetryAnalyzer.class)
    public void getDeals24HItems() {

        WebDriver webDriver = createWebdriver();
        webDriver.get("https://www.fahasa.com/");
        Deal24 deal24 = new Deal24(webDriver);
        deal24.moveToDeal();
        deal24.getDeal24();
        webDriver.quit();
        //Assert.assertEquals(false,true);
        Assert.assertTrue(true);
    }


    private WebDriver createWebdriver() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        return webDriver; //return vi dung kieu du lieu webdriver phai return
    }
}
