package setup;

import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class Setup {

    public static WebDriver driver = BrowserOptions.SelectBrowser(Browser.Chrome);


    @Before
    public void initialize(){
        driver.manage().deleteAllCookies();
        driver.navigate().to("http://the-internet.herokuapp.com");
        driver.manage().window().maximize();
    }


    @AfterClass
    public static void cleanUp(){
        driver.quit();
    }
}
