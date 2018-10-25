package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage  {

    @FindBy(how = How.LINK_TEXT, using = "Form Authentication")
    private WebElement menuFormAuthenthication;

    @FindBy(how = How.LINK_TEXT, using = "Checkboxes")
    private WebElement menuCheckboxes;

    @FindBy(how = How.LINK_TEXT, using = "Dropdown")
    private WebElement menuDropDownList;

    @FindBy(how = How.LINK_TEXT, using = "File Upload")
    private WebElement menuFileUpload;

    public MainPage abrirFormAuthenthication(){
        menuFormAuthenthication.click();
        return this;
    }

    public MainPage abrirCheckboxes(){
        menuCheckboxes.click();
        return this;
    }

    public MainPage abrirDropDownList(){
        menuDropDownList.click();
        return this;
    }

    public MainPage abrirFileUpload(){
        menuFileUpload.click();
        return this;
    }
}
