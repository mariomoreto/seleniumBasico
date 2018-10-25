package pages.DropDown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    @FindBy(how = How.ID, using = "dropdown")
    private WebElement dropList;

    private String valorSelecionado;


    public DropDownPage selecionarValorDesejado(String valor){
        Select select = new Select(dropList);
        select.selectByVisibleText(valor);
        valorSelecionado = select.getFirstSelectedOption().getText();
        return this;
    }

    public String retornaValorSelecionado(){
        return valorSelecionado;
    }
}
