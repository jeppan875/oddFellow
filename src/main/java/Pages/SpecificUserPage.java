package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SpecificUserPage {
    public SpecificUserPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/button")
    WebElement deleteUser;
    @FindBy(how = How.CSS, using = "button.btn:nth-child(2)")//firefox use css-väljare
    WebElement confirmDeleteUser;

    public void clickDeleteUser() {
        deleteUser.click();
    }
    public void clickConfirmDeleteUser () {
        confirmDeleteUser.click();
    }

}
