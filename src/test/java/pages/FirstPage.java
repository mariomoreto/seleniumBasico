package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import setup.Setup;

public class FirstPage {

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    public void fillSearchField(String value){
        searchBox.sendKeys(value);
    }
}
