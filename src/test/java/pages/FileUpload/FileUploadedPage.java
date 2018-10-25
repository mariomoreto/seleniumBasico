package pages.FileUpload;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FileUploadedPage {

    @FindBy(how = How.CSS, using = "#content > div > h3")
    private WebElement textoSucesso;

    @FindBy(how = How.ID, using = "uploaded-files")
    private WebElement arquivoAnexado;

    public String getTextoSucesso() {
        return textoSucesso.getText();
    }

    public String getArquivoAnexado() {
        return arquivoAnexado.getText();
    }

}
