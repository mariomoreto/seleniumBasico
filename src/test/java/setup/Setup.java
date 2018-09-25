package setup;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    public static WebDriver driver = BrowserOptions.SelectBrowser(Browser.Chrome);
    @BeforeClass
    public static void initialize(){

        driver.manage().deleteAllCookies();
        driver.navigate().to("http://www.google.com.br");
    }

    @AfterClass
    public static void cleanUp(){
        driver.quit();
    }
}
