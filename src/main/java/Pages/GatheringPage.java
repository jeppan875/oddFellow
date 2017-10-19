package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GatheringPage {
    public GatheringPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/h2")
    WebElement nameOfGathering;

    public String getNameOfGathering() {
        return nameOfGathering.getText();
    }
}
