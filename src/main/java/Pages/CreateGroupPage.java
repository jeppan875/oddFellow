package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateGroupPage {

    public CreateGroupPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"name\"]")
    WebElement nameField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
    WebElement descriptionField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mail_from\"]")
    WebElement senderField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mail_subject_prefix\"]")
    WebElement rubrikPrefixField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"action\"]")
    WebElement saveButton;

    public void setNameField (String name) {
        nameField.clear();
        nameField.sendKeys(name);
    }
    public void setDescriptionField (String description) {
        descriptionField.clear();
        descriptionField.sendKeys(description);
    }
    public void setSenderField (String sender) {
        senderField.clear();
        senderField.sendKeys(sender);
    }
    public void setRubrikPrefixField (String rubrikPrefix) {
        rubrikPrefixField.clear();
        rubrikPrefixField.sendKeys(rubrikPrefix);
    }
    public void clickSaveButton () {
        saveButton.click();
    }
    public void createNewGroup (String name,String description,String sender,String rubrikPrefix) {
        setNameField(name);
        setDescriptionField(description);
        setSenderField(sender);
        setRubrikPrefixField(rubrikPrefix);
        clickSaveButton();
    }
}
