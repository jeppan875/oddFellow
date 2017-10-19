package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class EditUserPage {
    public EditUserPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"lastName\"]")
    WebElement setLastNameField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"action\"]")
    WebElement saveButton;

    public void setLastNameField(String lastName) {
        setLastNameField.clear();
        setLastNameField.sendKeys(lastName);
    }
    public void clickSaveButton() {
        saveButton.click();
    }
}
