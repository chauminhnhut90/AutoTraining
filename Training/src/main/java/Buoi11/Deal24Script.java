package Buoi11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Deal24Script {
    @BeforeSuite
    public void setUpWebDriver(){
        System.setProperty("webdriver.chrome.driver", "D:/Training_SE/chromedriver.exe");
    }

    private WebDriver createWebDriver(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        return webDriver;
    }
    @Test(retryAnalyzer = MyRetry.class)
    public void test(){
        System.out.println("test");
        Assert.assertTrue(false);
    }
    @Test
    public void productsVH(){
        WebDriver webDriver= createWebDriver();
        HomePage homePage = new HomePage(webDriver);
        homePage.navigate();

        Deal24Page deal24Page = new Deal24Page(webDriver);
        deal24Page.TabDeal24();
        deal24Page.getProductVH();
        webDriver.quit();
    }


    public void productsKN(){
        WebDriver webDriver= createWebDriver();
        HomePage homePage = new HomePage(webDriver);
        homePage.navigate();

        Deal24Page deal24Page = new Deal24Page(webDriver);
        deal24Page.LinkKN();
        deal24Page.getProductKN();
        webDriver.quit();
    }


    public void productsNDC(){
        WebDriver webDriver= createWebDriver();
        HomePage homePage = new HomePage(webDriver);
        homePage.navigate();

        Deal24Page deal24Page = new Deal24Page(webDriver);
        deal24Page.LinkNDC();
        deal24Page.getProductNDC();
        webDriver.quit();
    }


    public void productsKT(){
        WebDriver webDriver= createWebDriver();
        HomePage homePage = new HomePage(webDriver);
        homePage.navigate();

        Deal24Page deal24Page = new Deal24Page(webDriver);
        deal24Page.LinkKT();
        deal24Page.getProductKT();
        webDriver.quit();
    }
}
