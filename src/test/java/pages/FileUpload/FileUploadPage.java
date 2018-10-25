package pages.FileUpload;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FileUploadPage {

    @FindBy(how = How.ID, using = "file-upload")
    private WebElement cmpUpload;

    @FindBy(how = How.ID, using = "file-submit")
    private WebElement btnUpload;

    public FileUploadPage anexarArquivo(String caminho){
        cmpUpload.sendKeys(caminho);
        return this;
    }

    public FileUploadPage clicarBotaoUpload(){
        btnUpload.click();
        return this;
    }
}
