package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SpecificGroupPage {

    public SpecificGroupPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/h2")
    WebElement nameOfGroup;
    @FindBy(how = How.CSS, using = "body > div.container > div.list-row > h4 > a")
    WebElement firstGathering;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/a")
    WebElement newGatheringButton;
    @FindBy(how = How.CSS, using = "body > div.container > div:nth-child(11) > a")
    WebElement newMemberButton;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/button")
    WebElement deleteButton;
    @FindBy(how = How.CSS, using = "button.btn:nth-child(2)")//firefox use css-väljare
    WebElement confirmDeleteButton;

    public String getNameofGroup() {
       return nameOfGroup.getText();
    }
    public void clickFirstGathering() {
        firstGathering.click();
    }
    public void clickNewGatheringButton () {
        newGatheringButton.click();
    }
    public void clickNewMemberButton () {
        newMemberButton.click();
    }
    public void clickDeleteButton () {
        deleteButton.click();
    }
    public void clickConfirmDelete () {
        confirmDeleteButton.click();
    }

}
