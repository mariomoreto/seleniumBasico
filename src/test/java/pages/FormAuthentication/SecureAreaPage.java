package pages.FormAuthentication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SecureAreaPage {

    @FindBy(how = How.ID, using = "flash-messages")
    private WebElement mensagemSucesso;

    public String getMensagemSucesso (){
        return mensagemSucesso.getText();
    }
}
