package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewUserPage {
    public NewUserPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"firstName\"]")
    WebElement firstNameField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"lastName\"]")
    WebElement lastNameField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    WebElement emailField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
    WebElement phoneField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    WebElement passwordField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"action\"]")
    WebElement saveButton;

    public void setFirstNameField(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }
    public void setLastNameField(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }
    public void setEmailField(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void setPhoneField(String phone) {
        phoneField.clear();
        phoneField.sendKeys(phone);
    }
    public void setPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void clickSaveButton() {
        saveButton.click();
    }
    public void createNewUser(String firstName,String lastName,String email,String phone,String password) {
        setFirstNameField(firstName);
        setLastNameField(lastName);
        setEmailField(email);
        setPhoneField(phone);
        setPasswordField(password);
        clickSaveButton();
    }
}
