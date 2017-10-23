package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewGroupMemberPage {

    public NewGroupMemberPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"userId\"]")
    WebElement memberName;
    @FindBy(how = How.CSS, using = "#action")
    WebElement addMember;

    public void setMemberName (String member) {
        memberName.sendKeys(member);
    }
    public void clickAddMember () {
        addMember.click();
    }
}
