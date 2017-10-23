package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignupForGatheringPage {
    public SignupForGatheringPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS, using = "#on")
    WebElement selectKommer;
    @FindBy(how = How.XPATH, using = "//*[@id=\"action\"]")
    WebElement signupButton;

    public void clickSelectKommer() {
        selectKommer.click();
    }
    public void clickSignupButton() {
        signupButton.click();
    }
}
