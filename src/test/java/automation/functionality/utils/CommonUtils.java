package automation.functionality.utils;

import org.openqa.selenium.WebElement;

import static automation.functionality.utils.WebElementUtils.waitForVisible;

public final class CommonUtils {

    private CommonUtils() {
    }

    public static void clickOnElement(WebElement element) {
        waitForVisible(element);
        element.click();
    }

    public static void clickOnElementWithoutWait(WebElement element) {
        element.click();
    }

    public static void sendKeysTo(WebElement element, String text){
        waitForVisible(element);
        element.clear();
        element.sendKeys(text);
    }
}
