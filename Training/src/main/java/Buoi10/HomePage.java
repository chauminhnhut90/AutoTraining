package Buoi10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    private WebDriver webDriver;

    @FindBy(xpath = "//a[contains(text(),'Tài khoản')]")
    public WebElement btTaiKhoan;

    @FindBy(xpath = "//a[text()='Blog'")
    public WebElement btBlog;

    @FindBy(xpath = "//*[@id='verticalmenu']//a[@title]")
    public List<WebElement> listMenu;

    public HomePage(WebDriver driver){
        this.webDriver = driver;
        PageFactory.initElements(webDriver,this);
    }

    public void navigate(){
        webDriver.get("https://www.fahasa.com");
    }

    public void clickButtonTaiKhoan(){
        btTaiKhoan.click();
    }

    public void listMenu(){
        for(int i = 0; i < listMenu.size();i++){
            WebElement element = listMenu.get(i);

            String title = element.getAttribute("title");
            System.out.println(title);
        }
    }



}
