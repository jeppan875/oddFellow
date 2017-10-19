package steps;

import Helpers.BrowserFactory;
import Pages.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Gathering;
import models.Group;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class NewGatheringStep {

    public NewGatheringStep () {}

    WebDriver driver = BrowserFactory.getDriver("firefox");

    LoginPage loginPage = new LoginPage(driver);
    GroupPage groupPage = new GroupPage(driver);
    CreateGroupPage createGroupPage = new CreateGroupPage(driver);
    SpecificGroupPage specificGroupPage = new SpecificGroupPage(driver);
    NewGatheringPage newGatheringPage = new NewGatheringPage(driver);
    GatheringPage gatheringPage = new GatheringPage(driver);

    Group newGroup = new Group("namn","beskrivning","admin@crisp.se","rubrik prefix");
    Gathering newGathering = new Gathering("gathering","plattan","2022-07-07","06:06","07:07");

    @Given("^a new group is created$")
    public void aNewGroupIsCreated () {
        BrowserFactory.openBrowser(BrowserFactory.BASE_URL);
        String email = "admin@crisp.se";
        String password = "admin";
        loginPage.login(email,password);
        groupPage.navigateToGroups();
        groupPage.clickNewGroup();
        createGroupPage.createNewGroup(newGroup.getName(),newGroup.getDescription(),newGroup.getSender(),newGroup.getRubrikPrefix());
    }
    @When("^a new gathering is created$")
    public void aNewGatheringIsCreated () {
        specificGroupPage.clickNewGatheringButton();
        newGatheringPage.createNewGathering(newGathering.getNameOfGathering(),newGathering.getPlace(),newGathering.getDate(),newGathering.getStartTime(),newGathering.getEndTime());
    }
    @Then("^the gathering exists$")
    public void theGroupExists () {
        assertEquals("equals ",newGathering.getNameOfGathering(),gatheringPage.getNameOfGathering());
        driver.quit();
    }
}
