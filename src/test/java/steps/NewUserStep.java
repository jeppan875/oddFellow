package steps;

import Helpers.BrowserFactory;
import Pages.LoginPage;
import Pages.NewUserPage;
import Pages.UserPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.User;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class NewUserStep {

    public NewUserStep () {}

    WebDriver driver = BrowserFactory.getDriver("firefox");

    LoginPage loginPage = new LoginPage(driver);
    UserPage userPage = new UserPage(driver);
    NewUserPage newUserPage = new NewUserPage(driver);
    User newUser = new User("förnamn","efternamn","epost@dt.se","078955214","12345");

    @Given("^is logged in as admin$")
    public void isLoggedInAsAdmin () {
        BrowserFactory.openBrowser(BrowserFactory.BASE_URL);
        String email = "admin@crisp.se";
        String password = "admin";
        loginPage.login(email,password);
    }

    @When("^a new user is created$")
    public void aNewUserIsCreated () {
        userPage.navigateToUserPage();
        userPage.clickCreateNewUser();
        newUserPage.createNewUser(newUser.getFirstName(),newUser.getLastName(),newUser.getEmail(),newUser.getPhone(),newUser.getPassword());
    }
    @Then("^the user should exist$")
    public void theUserShouldExist () {

        //assertEquals("equals ","Admin Istratör",);
        driver.quit();
    }

}
