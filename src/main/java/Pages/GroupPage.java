package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GroupPage {

    public GroupPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"signup_navbar\"]/ul[1]/li[1]/a")
    WebElement groupIcon;
    @FindBy(how = How.CSS, using = "body > div.container > div.btn-row > a")
    WebElement newGroup;

    public void navigateToGroups() {
        groupIcon.click();
    }
    public void clickNewGroup() {
        newGroup.click();
    }
}
