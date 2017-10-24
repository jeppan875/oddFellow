package Helpers;

import Pages.GroupPage;
import Pages.SpecificGroupPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
    public static void deleteGroup(String name, WebDriver driver) {
        GroupPage groupPage = new GroupPage(driver);
        groupPage.navigateToGroups();
        driver.findElement(By.linkText(name)).click();
        SpecificGroupPage specificGroupPage = new SpecificGroupPage(driver);
        specificGroupPage.clickDeleteButton();

    }
}
