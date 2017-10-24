package steps;

import Helpers.BrowserFactory;
import Helpers.UserHelper;
import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Gathering;
import models.Group;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class SignupToGatheringSteps {

    public SignupToGatheringSteps () {}

    WebDriver driver = BrowserFactory.getDriver("firefox");

    LoginPage loginPage = new LoginPage(driver);
    GroupPage groupPage = new GroupPage(driver);
    CreateGroupPage createGroupPage = new CreateGroupPage(driver);
    SpecificGroupPage specificGroupPage = new SpecificGroupPage(driver);
    NewGatheringPage newGatheringPage = new NewGatheringPage(driver);
    NewUserPage newUserPage = new NewUserPage(driver);
    UserPage userPage = new UserPage(driver);
    NewGroupMemberPage newGroupMemberPage = new NewGroupMemberPage(driver);
    GatheringPage gatheringPage = new GatheringPage(driver);
    SignupForGatheringPage signupForGatheringPage = new SignupForGatheringPage(driver);
    MinSidaPage minSidaPage = new MinSidaPage(driver);

    Group newGroup = new Group(UUID.randomUUID().toString(),"beskrivning","admin@crisp.se","rubrik prefix");
    Gathering newGathering = new Gathering("gathering","plattan","2022-07-07","06:06","07:07");
    User newUser = new User(UUID.randomUUID().toString(),"efternamn", UUID.randomUUID().toString()+"@dt.se","078955214","12345678");

    @Given("^logged in as an administrator$")
    public void aNewGroupIsCreated () {
        BrowserFactory.openBrowser(BrowserFactory.BASE_URL);
        String email = "admin@crisp.se";
        String password = "admin";
        loginPage.login(email,password);
    }
    @And("^administrator creates a new group$")
    public void adminCreatesANewGroup () {
        groupPage.navigateToGroups();
        groupPage.clickNewGroup();
        createGroupPage.createNewGroup(newGroup.getName(),newGroup.getDescription(),newGroup.getSender(),newGroup.getRubrikPrefix());
    }
    @And("^a new gathering is added to the group$")
    public void aNewGatheringIsAddedToTheGroup () {
        specificGroupPage.clickNewGatheringButton();
        newGatheringPage.createNewGathering(newGathering.getNameOfGathering(),newGathering.getPlace(),newGathering.getDate(),newGathering.getStartTime(),newGathering.getEndTime());
    }
    @And("^admin creates a new user$")
    public void adminCreatesAnewUser () {
        userPage.navigateToUserPage();
        userPage.clickCreateNewUser();
        newUserPage.createNewUser(newUser.getFirstName(),newUser.getLastName(),newUser.getEmail(),newUser.getPhone(),newUser.getPassword());
    }
    @And("^admin adds user to new group$")
    public void adminAddsUserToNewGroup () throws InterruptedException {
        groupPage.navigateToGroups();
        driver.findElement(By.linkText(newGroup.getName())).click();
        specificGroupPage.clickNewMemberButton();
        newGroupMemberPage.setMemberName(newUser.getFirstName()+" "+newUser.getLastName());
        Thread.sleep(2000);
        newGroupMemberPage.clickAddMember();

    }
    @And("^admin logs out and logs in as new user$")
    public void adminLogsOutAndLogsInAsNewUser () {
        loginPage.navigateToLogin();
        loginPage.clickLogOutButton();
        loginPage.login(newUser.getEmail(),newUser.getPassword());
    }
    @When("^user signup for the gathering$")
    public void userSignupForGathering () {
        loginPage.navigateToLogin();
        loginPage.navigateToMinSidaWhenLoggedIn();
        driver.findElement(By.linkText(newGathering.getNameOfGathering())).click();
        signupForGatheringPage.clickSelectKommer();
        signupForGatheringPage.clickSignupButton();
    }
    @Then("^the user should be registred for the gathering$")
    public void theUserShouldBeregisteredForTheGathering () {
        assertEquals("equals","Kommer",minSidaPage.getStatus());
        UserHelper.deleteUser(newUser.getFirstName()+" "+newUser.getLastName(),driver);
        driver.quit();
    }
}
