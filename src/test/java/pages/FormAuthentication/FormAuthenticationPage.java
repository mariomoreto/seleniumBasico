package pages.FormAuthentication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormAuthenticationPage {

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.ID, using = "username")
    private WebElement cmpUsuario;

    @FindBy(how = How.ID, using = "password")
    private WebElement cmpSenha;

    @FindBy(how = How.CSS, using = "#login > button > i")
    private WebElement btnLogin;

    @FindBy(how = How.ID, using = "flash")
    private WebElement mensagem;

    public FormAuthenticationPage preencherCampoUsuario(String usuario){
        cmpUsuario.sendKeys(usuario);
        return this;
    }

    public FormAuthenticationPage preencherCampoSenha(String senha){
        cmpSenha.sendKeys(senha);
        return this;
    }

    public FormAuthenticationPage clicarBotaoLogin(){
        btnLogin.click();
        return this;
    }

    public String getMensagem(){
        return mensagem.getText();
    }
}
