package buoi16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
public class FahasaScript {

    @BeforeSuite
    public void setUpWebDriver() {
        // System.setProperty("webdriver.chrome.driver", "/Users/macbook/Downloads/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/Users/macbook/Documents/KolabsLLC/geckodriver");
    }

    @Test
    public void verifyDKSD() {
        WebDriver driver = createFirefoxWebDriver();
        driver.get("https://www.fahasa.com");

        inText(driver.getTitle());

        driver.quit();
    }

    private WebDriver createFirefoxWebDriver() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    private WebDriver createChromeWebDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    private static void inText(String text) {
        System.out.println(text);
    }
}
