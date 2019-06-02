package Buoi11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@SuppressWarnings("all")
public class XpathNangCao {
    //xpath động, nâng cao xpath Axes

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/newuser/AutoTraining/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://demo.guru99.com/v1/");


        //following-sibling cung cap voi no
        //input[@name='uid']/following-sibling::label
        //lay message động được sinh ra khi ko gõ username

        //Following(webDriver);
        //PrecedingSibling(webDriver);
        //Preceding(webDriver);

        //Child(webDriver);
        //Ancestor(webDriver);
        Desendant(webDriver);
        Desendantorself(webDriver);

        webDriver.quit();

        ////*[@type='submit' or @type='reset'  ]
        //*[contains(text(),'* mandatory field')]/following::input
    }

    public static void FollowingSibling(WebDriver webDriver) {
        By byuser = By.xpath("//input[@name='uid']");
        WebElement username = webDriver.findElement(byuser);
        username.click();

        By bypass = By.xpath("//input[@name='password']");
        WebElement pass = webDriver.findElement(bypass);
        pass.click();


        By by = By.xpath("//input[@name='uid']/following-sibling::*");
        WebElement userblank = webDriver.findElement(by);

        String message = userblank.getText();

        System.out.println(message);
    }

    public static void PrecedingSibling(WebDriver webDriver) {
        By byuser = By.xpath("//input[@name='uid']");
        WebElement username = webDriver.findElement(byuser);
        username.click();

        By bypass = By.xpath("//input[@name='password']");
        WebElement pass = webDriver.findElement(bypass);
        pass.click();

        By byreset = By.xpath("//input[@name='btnReset']");
        WebElement reset = webDriver.findElement(byreset);
        reset.click();


        By bylogin = By.xpath("//input[@name='btnReset']/preceding-sibling::input");
        WebElement login = webDriver.findElement(bylogin);

        String message = login.getAttribute("value");

        System.out.println(message);
    }

    public static void Preceding(WebDriver webDriver) {
        //Following tim tat ca the phia sau thang hien tai
        By byuser = By.xpath("//input[@name='uid']");
        WebElement username = webDriver.findElement(byuser);
        username.click();

        By bypass = By.xpath("//input[@name='password']");
        WebElement pass = webDriver.findElement(bypass);
        pass.click();

        By byreset = By.xpath("//input[@name='btnReset']");
        WebElement reset = webDriver.findElement(byreset);
        reset.click();


        By bylist = By.xpath("//input[@name='btnReset']/preceding::label");
        List<WebElement> elements = webDriver.findElements(bylist);

        int size = elements.size();
        for (int i = 0; i < size; i++) {

            WebElement element = elements.get(i);
            String message = element.getText();

            System.out.println(message);
        }
    }

    public static void Following(WebDriver webDriver) {
        //Following tim tat ca the phia sau thang hien tai
        By byuser = By.xpath("//input[@name='uid']");
        WebElement username = webDriver.findElement(byuser);
        username.click();

        By bypass = By.xpath("//input[@name='password']");
        WebElement pass = webDriver.findElement(bypass);
        pass.click();

        By byreset = By.xpath("//input[@name='btnReset']");
        WebElement reset = webDriver.findElement(byreset);
        reset.click();


        By bylist = By.xpath("//input[@name='uid']/following::label");
        List<WebElement> elements = webDriver.findElements(bylist);

        int size = elements.size();
        for (int i = 0; i < size; i++) {

            WebElement element = elements.get(i);
            String message = element.getText();

            System.out.println(message);
        }
    }

    public static void Child(WebDriver webDriver) {
        //Child: lay tat ca cac thang con đi từ thằng cha => va lay the label, * là lay het
        //form[@name='frmLogin']//child::label
        By byuser = By.xpath("//input[@name='uid']");
        WebElement username = webDriver.findElement(byuser);
        username.click();

        By bypass = By.xpath("//input[@name='password']");
        WebElement pass = webDriver.findElement(bypass);
        pass.click();

        By byreset = By.xpath("//input[@name='btnReset']");
        WebElement reset = webDriver.findElement(byreset);
        reset.click();


        By bylist = By.xpath("//form[@name='frmLogin']//child::label");
        List<WebElement> elements = webDriver.findElements(bylist);

        int size = elements.size();
        for (int i = 0; i < size; i++) {

            WebElement element = elements.get(i);
            String message = element.getText();

            System.out.println(message);
        }


    }

    public static void Ancestor(WebDriver webDriver) {

        //Preceding là lấy phía trước nhưng không phải tổ tiên ngoại trừ thằng tổ tiên trực
        //Ancestor là lấy phía trước những thằng là tổ tiên trực


        By bylist = By.xpath("//input[@name='btnLogin']/ancestor::*");
        List<WebElement> elements = webDriver.findElements(bylist);

        int size = elements.size();
        for (int i = 0; i < size; i++) {

            WebElement element = elements.get(i);
            String tenthe = element.getTagName();

            System.out.println(tenthe);
        }


    }

    public static void Ancestororself(WebDriver webDriver) {

        //Preceding là lấy phía trước nhưng không phải tổ tiên ngoại trừ thằng tổ tiên trực
        //Ancestor-or-self là lấy phía trước những thằng là tổ tiên trực + chinh no


        By bylist = By.xpath("//input[@name='btnLogin']/ancestor-or-self::*");
        List<WebElement> elements = webDriver.findElements(bylist);

        int size = elements.size();
        for (int i = 0; i < size; i++) {

            WebElement element = elements.get(i);
            String tenthe = element.getTagName();

            System.out.println(tenthe);
        }
    }

    public static void Desendant(WebDriver webDriver) {

        //Preceding là lấy phía trước nhưng không phải tổ tiên ngoại trừ thằng tổ tiên trực
        //Ancestor là lấy phía trước những thằng là tổ tiên trực
        By byuser = By.xpath("//input[@name='uid']");
        WebElement username = webDriver.findElement(byuser);
        username.click();

        By bypass = By.xpath("//input[@name='password']");
        WebElement pass = webDriver.findElement(bypass);
        pass.click();

        By byreset = By.xpath("//input[@name='btnReset']");
        WebElement reset = webDriver.findElement(byreset);
        reset.click();

        By bylist = By.xpath("//form[@name='frmLogin']/descendant::label");
        List<WebElement> elements = webDriver.findElements(bylist);

        int size = elements.size();
        for (int i = 0; i < size; i++) {

            WebElement element = elements.get(i);
            String tenthe = element.getText();

            System.out.println(tenthe);
        }


    }

    public static void Desendantorself(WebDriver webDriver) {

        //Preceding là lấy phía trước nhưng không phải tổ tiên ngoại trừ thằng tổ tiên trực
        //Ancestor-or-self là lấy phía trước những thằng là tổ tiên trực + chinh no

        By byuser = By.xpath("//input[@name='uid']");
        WebElement username = webDriver.findElement(byuser);
        username.click();

        By bypass = By.xpath("//input[@name='password']");
        WebElement pass = webDriver.findElement(bypass);
        pass.click();

        By byreset = By.xpath("//input[@name='btnReset']");
        WebElement reset = webDriver.findElement(byreset);
        reset.click();
        By bylist = By.xpath("//form[@name='frmLogin']/descendant::label");
        List<WebElement> elements = webDriver.findElements(bylist);

        int size = elements.size();
        for (int i = 0; i < size; i++) {

            WebElement element = elements.get(i);
            String tenthe = element.getText();

            System.out.println(tenthe);
        }
    }

    public static void Parent(WebDriver webDriver) {

        //Preceding là lấy phía trước nhưng không phải tổ tiên ngoại trừ thằng tổ tiên trực
        //Ancestor là lấy phía trước những thằng là tổ tiên trực
        By byuser = By.xpath("//input[@name='uid']");
        WebElement username = webDriver.findElement(byuser);
        username.click();

        By bypass = By.xpath("//input[@name='password']");
        WebElement pass = webDriver.findElement(bypass);
        pass.click();

        By byreset = By.xpath("//input[@name='btnReset']");
        WebElement reset = webDriver.findElement(byreset);
        reset.click();

        By bylist = By.xpath("//input[@type='reset']/parent::*");
        List<WebElement> elements = webDriver.findElements(bylist);

        int size = elements.size();
        for (int i = 0; i < size; i++) {

            WebElement element = elements.get(i);
            String tenthe = element.getText();

            System.out.println(tenthe);
        }


    }
}
