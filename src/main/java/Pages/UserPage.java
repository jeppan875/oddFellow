package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

    public UserPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"signup_navbar\"]/ul[1]/li[2]/a")
    WebElement navigateToUserPage;
    @FindBy(how = How.CSS, using = "body > div.container > div.btn-row > a")
    WebElement createNewUserButton;

    public void navigateToUserPage() {
        navigateToUserPage.click();
    }
    public void clickCreateNewUser() {
        createNewUserButton.click();
    }
}
