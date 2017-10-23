package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MinSidaPage {

    public MinSidaPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/h2")
    WebElement fullName;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/a")
    WebElement editButton;
    @FindBy(how = How.CSS, using = "body > div.container > div.media.list-row > div.media-right > span > a > span")
    WebElement status;

    public String getFullName () {
        return fullName.getText();
    }
    public void clickEditButton() {
        editButton.click();
    }
    public String getStatus () {
        return status.getText();
    }
}
