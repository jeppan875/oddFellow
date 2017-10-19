package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewGatheringPage {
    public NewGatheringPage (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"name\"]")
    WebElement nameOfGatheringField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"venue\"]")
    WebElement placeField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"start_date\"]")
    WebElement dateField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"start_time\"]")
    WebElement startTimeField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"end_time\"]")
    WebElement endTimeField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"action\"]")
    WebElement saveGatheringButton;

    public void setNameOfGatheringField (String nameOfGathering) {
        nameOfGatheringField.clear();
        nameOfGatheringField.sendKeys(nameOfGathering);
    }
    public void setPlaceField (String place) {
        placeField.clear();
        placeField.sendKeys(place);
    }
    public void setDateField (String date) {
        dateField.clear();
        dateField.sendKeys(date);
    }
    public void setStartTimeField (String startTime) {
        startTimeField.clear();
        startTimeField.sendKeys(startTime);
    }
    public void setEndTimeField (String endTime) {
        endTimeField.clear();
        endTimeField.sendKeys(endTime);
    }
    public void clickSaveGatheringButton () {
        saveGatheringButton.click();
    }
    public void createNewGathering (String nameOfGathering,String place,String date,String startTime,String endTime) {
        setNameOfGatheringField(nameOfGathering);
        setPlaceField(place);
        setDateField(date);
        setStartTimeField(startTime);
        setEndTimeField(endTime);
        clickSaveGatheringButton();
    }
}
