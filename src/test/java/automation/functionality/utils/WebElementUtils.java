package automation.functionality.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static automation.functionality.utils.DriverUtils.getDriver;

public final class WebElementUtils {
    static Long timeout = Long.parseLong("60");
    static WebDriverWait wait = new WebDriverWait(getDriver(), timeout);

    private WebElementUtils() {
    }

    public static void waitForVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static  void selectValueFromDropDown(WebElement element, String value) {
        Select option = new Select(element);
        option.selectByValue(value);
    }
}
