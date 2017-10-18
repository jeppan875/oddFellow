package steps;

import Helpers.BrowserFactory;
import Pages.LoginPage;
import Pages.MinSidaPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    public LoginSteps () {}

    WebDriver driver = BrowserFactory.getDriver("firefox");

    LoginPage loginPage = new LoginPage(driver);
    MinSidaPage minSidaPage = new MinSidaPage(driver);
    String email = "admin@crisp.se";
    String password = "admin";

    @Given("^is not logged in$")
    public void verifyNotLoggedIn () {
        BrowserFactory.openBrowser(BrowserFactory.BASE_URL);
        loginPage.navigateToLogin();
    }

    @When("^Admin logs in$")
    public void adminLogsIn () {
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickLoginButton();
    }
    @Then("^the user should be logged in$")
    public void verifyLoggedIn () {
        loginPage.navigateToLogin();
        loginPage.navigateToMinSidaWhenLoggedIn();
        minSidaPage.getFullName();
    }
}
