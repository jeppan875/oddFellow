package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver driver;
    public static final String BASE_URL = "https://signup-ci-test.herokuapp.com/";

    public static WebDriver getDriver(String browserName)
    {
        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
            driver=new FirefoxDriver();
        }
        if(browserName.equalsIgnoreCase("chrome")){
            ChromeOptions chromeOptions = new ChromeOptions();
            System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--disable-gpu");
            driver=new ChromeDriver(chromeOptions);
        }

        return driver;
    }
    public static void openBrowser(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }
}
