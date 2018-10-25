package steps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.Checkboxes.CheckboxesPage;
import pages.MainPage;
import setup.Setup;

public class CheckboxesSteps extends Setup {

    private CheckboxesPage checkboxesPage;
    private MainPage mainPage;

    @Before
    public void setup(){
        checkboxesPage = PageFactory.initElements(driver, CheckboxesPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.abrirCheckboxes();
    }

    @Test
    public void checkBoxOneNaoComecaCheckado(){
        Assert.assertFalse(checkboxesPage.verificaCheckOneSelecionado());
    }

    @Test
    public void checkBoxOnecheckado(){
        checkboxesPage.clicarCheckOne();
        Assert.assertTrue(checkboxesPage.verificaCheckOneSelecionado());
    }

    @Test
    public void checkBoxTwoComecaCheckado(){
        Assert.assertTrue(checkboxesPage.verificaCheckTwoSelecionado());
    }

    @Test
    public void checkBowTwoDeschecado(){
        checkboxesPage.clicarCheckTwo();
        Assert.assertFalse(checkboxesPage.verificaCheckTwoSelecionado());
    }
}
