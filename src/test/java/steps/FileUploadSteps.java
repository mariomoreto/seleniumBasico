package steps;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.FileUpload.FileUploadPage;
import pages.FileUpload.FileUploadedPage;
import pages.MainPage;
import setup.Setup;

import java.io.File;

public class FileUploadSteps extends Setup {

    FileUploadPage fileUploadPage;
    FileUploadedPage fileUploadedPage;
    MainPage mainPage;

    @Before
    public void setup(){
        fileUploadPage = PageFactory.initElements(driver, FileUploadPage.class);
        fileUploadedPage = PageFactory.initElements(driver, FileUploadedPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void realizarUpload(){
        String caminho = new File("src/main/resources/teste").getAbsolutePath();
        mainPage.abrirFileUpload();
        fileUploadPage.anexarArquivo(caminho);
        fileUploadPage.clicarBotaoUpload();
        Assert.assertEquals("File Uploaded!", fileUploadedPage.getTextoSucesso());
        Assert.assertEquals("teste", fileUploadedPage.getArquivoAnexado());
    }
}
