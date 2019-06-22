package BaiTapBuoi15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ScriptsB15 {

    @BeforeSuite
    public void setUpWebdrvier(){
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
    }

    public WebDriver createWebdriver(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        return webDriver;
    }

    @Test(retryAnalyzer = RetryAnalyzerB15.class)
    public void getItemNBB15(){
       WebDriver webDriver = createWebdriver();
       webDriver.get("https://www.fahasa.com");

       NoiBatB15 noiBatB15 = new NoiBatB15(webDriver);
       noiBatB15.moveToNBB15();
       noiBatB15.getItemsNBB15();
       Assert.assertTrue(true);
       webDriver.quit();
    }

    @Test(retryAnalyzer = RetryAnalyzerB15.class)
    public void getItemDeal24B15(){
        WebDriver webDriver = createWebdriver();
        webDriver.get("https://www.fahasa.com");

        Deal24B15 deal24B15 = new Deal24B15(webDriver);
        deal24B15.moveToDeal();
        deal24B15.getDeal24();
        Assert.assertTrue(true);
        webDriver.quit();
    }

    @Test(retryAnalyzer = RetryAnalyzerB15.class)
    public void getItemVHB15(){
        WebDriver webDriver = createWebdriver();
        webDriver.get("https://www.fahasa.com");

        VanHocB15 vanHocB15 = new VanHocB15(webDriver);
        vanHocB15.movetoVH();
        vanHocB15.getItemVH();
        Assert.assertTrue(true);
        webDriver.quit();
    }

    @Test(retryAnalyzer = RetryAnalyzerB15.class)
    public void getItemTamLyB15(){
        WebDriver webDriver = createWebdriver();
        webDriver.get("https://www.fahasa.com");

        LopHocMatNguB15 lopHocMatNguB15 = new LopHocMatNguB15(webDriver);
        lopHocMatNguB15.moveToTamLy();
        lopHocMatNguB15.getItemTamLy();
        Assert.assertTrue(true);
        webDriver.quit();

    }
}
