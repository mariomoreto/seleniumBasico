package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage  {

    @FindBy(how = How.LINK_TEXT, using = "Form Authentication")
    private WebElement menuFormAuthenthication;

    @FindBy(how = How.LINK_TEXT, using = "Checkboxes")
    private WebElement menuCheckboxes;

    public MainPage abrirFormAuthenthication(){
        menuFormAuthenthication.click();
        return this;
    }

    public MainPage abrirCheckboxes(){
        menuCheckboxes.click();
        return this;
    }

}
