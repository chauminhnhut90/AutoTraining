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
        //Assert.assertEquals(false, true);
        //Assert.assertEquals(false, true);
        //Assert.assertTrue(true);
        //Assert.fail();
        webDriver.quit();

    }

    @Test (retryAnalyzer = RetryAnalyzer.class)
    public void getDeals24HItems() {

        WebDriver webDriver = createWebdriver();
        webDriver.get("https://www.ahasa.com/");
        Deals24H deals24H = new Deals24H(webDriver);
        deals24H.moveToDeal();
        deals24H.getDeal();
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
