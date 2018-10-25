package steps;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.DropDown.DropDownPage;
import pages.MainPage;
import setup.Setup;

public class DropDownStep extends Setup {

    private DropDownPage dropDownPage;
    private MainPage mainPage;

    @Before
    public void setup()
    {
        dropDownPage = PageFactory.initElements(driver, DropDownPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void dropDownSelecionado()
    {
        mainPage.abrirDropDownList();
        dropDownPage.selecionarValorDesejado("Option 1");
        Assert.assertEquals("Option 1", dropDownPage.retornaValorSelecionado());
    }
}
