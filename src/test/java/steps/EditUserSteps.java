package steps;

import Helpers.BrowserFactory;
import Helpers.UserHelper;
import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.User;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;
import java.util.UUID;

public class EditUserSteps {
    public EditUserSteps () {}

    WebDriver driver = BrowserFactory.getDriver("firefox");

    LoginPage loginPage = new LoginPage(driver);
    UserPage userPage = new UserPage(driver);
    NewUserPage newUserPage = new NewUserPage(driver);
    MinSidaPage minSidaPage = new MinSidaPage(driver);
    EditUserPage editUserPage = new EditUserPage(driver);
    User newUser = new User("förnamn","efternamn", UUID.randomUUID().toString()+"@dt.se","078955214","12345678");

    @Given("^user is created$")
    public void userIsCreated () {
        BrowserFactory.openBrowser(BrowserFactory.BASE_URL);
        String email = "admin@crisp.se";
        String password = "admin";
        loginPage.login(email,password);
        userPage.navigateToUserPage();
        userPage.clickCreateNewUser();
        newUserPage.createNewUser(newUser.getFirstName(),newUser.getLastName(),newUser.getEmail(),newUser.getPhone(),newUser.getPassword());
    }
    @And("^logged in as new user$")
    public void loggedInAsUser() {
        loginPage.navigateToLogin();
        loginPage.clickLogOutButton();
        loginPage.login(newUser.getEmail(),newUser.getPassword());
    }
    @When("^user is edited$")
    public void userIsEdited () {
        loginPage.navigateToLogin();
        loginPage.navigateToMinSidaWhenLoggedIn();
        minSidaPage.clickEditButton();
        editUserPage.setLastNameField("nytt efternman");
        editUserPage.clickSaveButton();
    }
    @Then("^new changes take effect$")
    public void newChangesTakeEffect () {
        assertEquals("equals",minSidaPage.getFullName(),"förnamn nytt efternman");
    }
    @And("^delete edited user$")
    public void deleteNewUser () {
        loginPage.navigateToLogin();
        loginPage.clickLogOutButton();
        UserHelper.deleteUser(newUser.getFirstName()+" "+newUser.getLastName(),driver);
        driver.quit();
    }    
}
