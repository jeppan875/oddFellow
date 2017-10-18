package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GroupPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"signup_navbar\"]/ul[1]/li[1]/a")
    WebElement groupIcon;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[6]/a")
    WebElement newGroup;

    public void navigateToGroups() {
        groupIcon.click();
    }
    public void clickNewGroup() {
        newGroup.click();
    }
}
