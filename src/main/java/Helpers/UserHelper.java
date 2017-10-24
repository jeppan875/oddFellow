package Helpers;

import Pages.LoginPage;
import Pages.SpecificUserPage;
import Pages.UserPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper {
    public static void deleteUser(String name, WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AdminHelper.email,AdminHelper.password);
        UserPage userPage = new UserPage(driver);
        userPage.navigateToUserPage();
        driver.findElement(By.linkText(name)).click();
        SpecificUserPage specificUserPage = new SpecificUserPage(driver);
        specificUserPage.clickDeleteUser();
    }
}
