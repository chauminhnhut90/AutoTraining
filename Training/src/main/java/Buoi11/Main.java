package Buoi11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Training_SE/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://demo.guru99.com/v1/");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        WebElement clickUser = webDriver.findElement(By.xpath("//input[@name='uid']"));
        clickUser.click();

        WebElement clickPass = webDriver.findElement(By.xpath("//input[@name='password']"));
        clickPass.click();

        WebElement clickReset = webDriver.findElement(By.xpath("//input[@name='btnReset']"));
        clickReset.click();

        //follwing -- lay tat ca thanh phan phia sau khong phai anh em cua no
      /*  List<WebElement> element= webDriver.findElements(By.xpath("//input[@name='uid']/following::label"));
        for(int i = 0; i< element.size(); i++){
            WebElement element1 = element.get(i);
            System.out.println(element1.getText());
        }*/

        //WebElement element1 = webDriver.findElement(By.xpath("//input[@name='password']/following::label"));

        //xpath : follwing-sibling -- lay tat ca thanh phan phia sau ma la anh em cua no
        //input[@name='uid']/following-sibling::label
       /* WebElement element1= webDriver.findElement(By.xpath("//input[@name='uid']/following-sibling::label"));
        System.out.println(element1.getText());*/

        //xpath - preceding-- lay tat ca thanh phan truoc no
       /* List<WebElement> elements= webDriver.findElements(By.xpath("//input[@type='reset']/preceding::label"));
        for(int i = 0; i< elements.size(); i++){
            WebElement element2 = elements.get(i);
            System.out.println(element2.getText());
        }*/

        //xpath - preceding-sibling - lay tat ca thanh phan anh em truoc no
        WebElement element3 = webDriver.findElement(By.xpath("//input[@type='reset']/preceding-sibling::input"));
        System.out.println(element3.getAttribute("value"));

        //xpath= child: tim thanh phan ben trong
        List<WebElement> elements= webDriver.findElements(By.xpath("//form[@name='frmLogin']//child::label"));
        for(int i = 0; i< elements.size(); i++){
            WebElement element2 = elements.get(i);
            System.out.println(element2.getText());
        }

        //xpath = ancestor: to tien
        List<WebElement> element4= webDriver.findElements(By.xpath("//input[@type='submit']/ancestor::*"));
        for(int i = 0; i< element4.size(); i++){
            WebElement element5 = element4.get(i);
            System.out.println(element5.getTagName());
        }

        //xpath = ancestor-or-self: to tien va chinh no
        List<WebElement> element6= webDriver.findElements(By.xpath("//input[@type='submit']/ancestor-or-self::*"));
        for(int i = 0; i< element6.size(); i++){
            WebElement element7 = element6.get(i);
            System.out.println(element7.getTagName());
        }

        //xpath = descendant - lay con chau cua no
        List<WebElement> element8= webDriver.findElements(By.xpath("//form[@name='frmLogin']/descendant::label"));
        for(int i = 0; i< element8.size(); i++){
            WebElement element9 = element8.get(i);
            System.out.println(element9.getText());
        }

        //xpath = parent
        //input[@type='reset']/parent::*
        //input[@type='submit' or @type='reset' ]
        //*[contains(text(),'mandatory field')]//following::input
    }
}
