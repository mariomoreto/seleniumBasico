package setup;

import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

    public static void SelectBrowser(Browser browser){
        switch (browser){
            case Chrome:
                ChromeOptions chromeOptions = new ChromeOptions();
                break;
        }
    }
}
