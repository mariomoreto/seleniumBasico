package pages.Checkboxes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckboxesPage {

    @FindBy(how = How.CSS, using = "#checkboxes > input[type=\"checkbox\"]:nth-child(1)")
    private WebElement checkOne;

    @FindBy(how = How.CSS, using = "#checkboxes > input[type=\"checkbox\"]:nth-child(3)")
    private WebElement checkTwo;

    public CheckboxesPage clicarCheckOne(){
        checkOne.click();
        return this;
    }

    public CheckboxesPage clicarCheckTwo(){
        checkTwo.click();
        return this;
    }

    public boolean verificaCheckOneSelecionado(){
        return checkOne.isSelected();
    }

    public boolean verificaCheckTwoSelecionado(){
        return checkTwo.isSelected();
    }
}
