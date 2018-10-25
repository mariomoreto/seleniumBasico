package setup;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    public static WebDriver driver = BrowserOptions.SelectBrowser(Browser.Chrome);
    @Before
    public void initialize(){
        driver.manage().deleteAllCookies();
        driver.navigate().to("http://the-internet.herokuapp.com");
    }


    @AfterClass
    public static void cleanUp(){
        driver.quit();
    }
}
