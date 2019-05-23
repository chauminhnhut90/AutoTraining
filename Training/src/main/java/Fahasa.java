import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fahasa {
    /**
     * @author tuyennguyen
     * @since 23/05/2019
     * */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Training_SE/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.fahasa.com");
        login(webDriver);
        sleep(5000);
        clickproduct(webDriver);
        sleep(5000);
        like(webDriver);
        sleep(5000);
        checkProduct(webDriver);

    }

    /*
    * + Đăng nhập vào trang fahasa.com,
	+ Click vào 1 sản phẩm bất kỳ
	+ Click vào yêu thích của sản phầm đó (hình trái tim)
	+ Sau đó vào mục yêu thích của tk đó, check xem đã có sảm phẩm đó chưa, nếu có in ra chuỗi "THÀNH CÔNG",
	* ngược lại in ra "THẤT BẠI"*/

    private static void sleep(long milisecond) {
        try {
            Thread.currentThread().sleep(milisecond);
        } catch (Exception ex) {

        }
    }

    private static void login(WebDriver webDriver){
        Actions actions = new Actions(webDriver);

        By byDangnhap = By.xpath("//*[@id='topbar']/div/div[2]/div[1]/div/ul/li[3]/a");
        WebElement Dangnhap = webDriver.findElement(byDangnhap);
        actions.click(Dangnhap).perform();

        By byEmail = By.xpath("//*[@id='youama-email']");
        WebElement Email = webDriver.findElement(byEmail);
        actions.click(Email).perform();
        actions.sendKeys(Email, "thanhtuyen2790@gmail.com").perform();

        By byPwd = By.xpath("//*[@id='youama-password']");
        WebElement Pass = webDriver.findElement(byPwd);
        actions.sendKeys(Pass,"tuyen279@").perform();

        By byButton = By.xpath("//button[@type='button']");
        WebElement Button = webDriver.findElement(byButton);
        actions.click(Button).perform();

    }

    private static void clickproduct(WebDriver webDriver){
        Actions actions = new Actions(webDriver);

        By byMenu = By.xpath("//ul[contains(@class,'nav navbar-nav megamenu')]//span[contains(@class,'menu-title')][contains(text(),'FAHASA Book Award')]");
        WebElement Menu = webDriver.findElement(byMenu);
        actions.click(Menu).perform();

        By byGoods = By.xpath("//a[contains(text(),'Anh Không Muốn Để Em Một Mình')]");
        WebElement Goods = webDriver.findElement(byGoods);
        actions.moveToElement(Goods).build().perform();
        actions.click(Goods).perform();
    }

    private static void like(WebDriver webDriver){
        Actions actions = new Actions(webDriver);

        By byLike = By.xpath("//i[@class='fa fa-heart']");
        WebElement Like = webDriver.findElement(byLike);
        actions.click(Like).perform();
    }

    private static void checkProduct(WebDriver webDriver) {
        Actions actions = new Actions(webDriver);

        By bywishlist = By.xpath("//body[@id='offcanvas-container']/div[@class='wrapper_box pop_wishlist1']/div[4]/a[1]");
        WebElement wishList = webDriver.findElement(bywishlist);
        actions.click(wishList).perform();

        WebElement strvalue = webDriver.findElement(By.xpath("//a[contains(text(),'Anh Không Muốn Để Em Một Mình')]"));
        String expected = "Anh Không Muốn Để Em Một Mình";
        String actual = strvalue.getText();
        System.out.println(actual);

        if(expected.equals(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }


}
