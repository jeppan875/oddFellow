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

    public String getNameofGroup() {
       return nameOfGroup.getText();
    }
}
