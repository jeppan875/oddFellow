package steps;

import Helpers.BrowserFactory;
import Pages.CreateGroupPage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import models.Group;
import org.openqa.selenium.WebDriver;

public class CreateGroupStep {

    public CreateGroupStep () {}

    WebDriver driver = BrowserFactory.getDriver("firefox");

    LoginPage loginPage = new LoginPage(driver);
    CreateGroupPage createGroupPage = new CreateGroupPage(driver);

    @Given("^logged in as admin$")
    public void loggedInAsAdmin () {
        BrowserFactory.openBrowser(BrowserFactory.BASE_URL);
        String email = "admin@crisp.se";
        String password = "admin";
        loginPage.login(email,password);
    }
    @When("^admin creates a group$")
    public void adminCreatesAGroup () {
        Group newGroup = new Group("namn","beskrivning","avsändare","rubrik prefix");

    }
}
