package buoi16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
public class DemoScript {

    @Test(priority = 1)
    public void setUpChrome() throws Exception {
        WebDriver driver;
        String nodeUrl = "http://192.168.0.110:5566/wd/hub";

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");

        driver = new RemoteWebDriver(new URL(nodeUrl), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver = new RemoteWebDriver(new URL(nodeUrl), cap);

        driver.get("https://www.fahasa.com");
        inText(driver.getTitle());

        driver.quit();
    }

    @Test(priority = 2)
    public void setUpFirefox() throws Exception {
        WebDriver driver;
        String nodeUrl = "http://192.168.0.110:5567/wd/hub";

        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setBrowserName("firefox");

        driver = new RemoteWebDriver(new URL(nodeUrl), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver = new RemoteWebDriver(new URL(nodeUrl), cap);

        driver.get("https://www.fahasa.com");
        inText(driver.getTitle());

        driver.quit();
    }

    private static void inText(String text) {
        System.out.println(text);
    }

}
