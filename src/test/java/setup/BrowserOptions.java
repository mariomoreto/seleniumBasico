package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

    public static WebDriver SelectBrowser(Browser browser){
        WebDriver webDriver;
        switch (browser){
            case Chrome:{
                ChromeOptions chromeOptions = new ChromeOptions();
                return webDriver = new ChromeDriver(chromeOptions);
            }

        }
        return null;
    }
}
