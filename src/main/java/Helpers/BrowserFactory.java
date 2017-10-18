package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver driver;
    public static final String BASE_URL = "https://signup-ci-test.herokuapp.com/";


    public static WebDriver startBrowser(String browserName, String url)
    {
        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
            driver=new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
    public static WebDriver getDriver(String browserName)
    {
        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
            driver=new FirefoxDriver();
        }

        return driver;
    }
    public static void openBrowser(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }
}
