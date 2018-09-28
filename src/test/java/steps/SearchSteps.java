package steps;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.FirstPage;
import setup.Setup;

public class SearchSteps extends Setup {

    private FirstPage firstPage;

    @Before
    public void setup(){
        firstPage = PageFactory.initElements(driver,FirstPage.class);
    }

    @Test
    public void preencherCampo()
    {
        firstPage.fillSearchField("aaaa");
    }

}
