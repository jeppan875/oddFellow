package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"logged_in_user\"]")
    WebElement loginIcon;
    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    WebElement emailTextField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    WebElement passwordTextField;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/fieldset/button")
    WebElement loginButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"signup_navbar\"]/ul[2]/li/ul/li[1]/a")
    WebElement minSida;
    @FindBy(how = How.XPATH, using = "//*[@id=\"signup_navbar\"]/ul[2]/li/ul/li[2]/a")
    WebElement loginOutButton;


    public void navigateToLogin() {
        loginIcon.click();
    }
    public void setEmailField (String email) {
        emailTextField.clear();
        emailTextField.sendKeys(email);
    }
    public void setPasswordField (String password) {
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }
    public void clickLoginButton () {
        loginButton.click();
    }
    public void navigateToMinSidaWhenLoggedIn() {
        minSida.click();
    }
    public void clickLogOutButton() {
        loginOutButton.click();
    }
    public void login (String email,String password) {
        navigateToLogin();
        setEmailField(email);
        setPasswordField(password);
        clickLoginButton();
    }
}
