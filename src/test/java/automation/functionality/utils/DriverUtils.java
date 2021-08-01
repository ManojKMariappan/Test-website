package automation.functionality.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverUtils {
    static WebDriver driver;

    private DriverUtils() {
    }

    public static void initDriver() {
        System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testscriptdemo.com/");
    }

    public static WebDriver getDriver() {

        if (driver == null ) {
            initDriver();
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
