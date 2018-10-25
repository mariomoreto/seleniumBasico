package steps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.FormAuthentication.FormAuthenticationPage;
import pages.MainPage;
import pages.FormAuthentication.SecureAreaPage;
import setup.Setup;

public class FormAuthenticationSteps extends Setup {

    private FormAuthenticationPage formAuthenticationPage;
    private MainPage mainPage;
    private SecureAreaPage secureAreaPage;

    @Before
    public void setup() {
        mainPage = PageFactory.initElements(driver, MainPage.class);
        formAuthenticationPage = PageFactory.initElements(driver, FormAuthenticationPage.class);
        secureAreaPage = PageFactory.initElements(driver, SecureAreaPage.class);
        mainPage.abrirFormAuthenthication();
    }


    @Test
    public void autenticacaoComSucesso() {
        formAuthenticationPage.preencherCampoUsuario("tomsmith");
        formAuthenticationPage.preencherCampoSenha("SuperSecretPassword!");
        formAuthenticationPage.clicarBotaoLogin();
        Assert.assertEquals("You logged into a secure area!\n×", secureAreaPage.getMensagemSucesso());
    }

    @Test
    public void autenticacaoInvalida() {
        formAuthenticationPage.preencherCampoUsuario("aaaaa");
        formAuthenticationPage.preencherCampoSenha("123");
        formAuthenticationPage.clicarBotaoLogin();
        Assert.assertEquals("Your username is invalid!\n×", formAuthenticationPage.getMensagem());
    }

}
