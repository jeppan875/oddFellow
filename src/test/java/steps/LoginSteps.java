package steps;

import Helpers.AdminHelper;
import Helpers.BrowserFactory;
import Pages.LoginPage;
import Pages.MinSidaPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    public LoginSteps () {}

    WebDriver driver = BrowserFactory.getDriver("chrome");

    LoginPage loginPage = new LoginPage(driver);
    MinSidaPage minSidaPage = new MinSidaPage(driver);

    @Given("^is not logged in$")
    public void verifyNotLoggedIn () {
        BrowserFactory.openBrowser(BrowserFactory.BASE_URL);
        loginPage.navigateToLogin();
    }

    @When("^Admin logs in$")
    public void adminLogsIn () {
        loginPage.setEmailField(AdminHelper.email);
        loginPage.setPasswordField(AdminHelper.password);
        loginPage.clickLoginButton();
    }
    @Then("^the user should be logged in$")
    public void verifyLoggedIn () {
        loginPage.navigateToLogin();
        loginPage.navigateToMinSidaWhenLoggedIn();
        assertEquals("equals ","Admin Istratör",minSidaPage.getFullName());
        driver.quit();
    }
}
