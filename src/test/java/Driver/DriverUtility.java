package Driver;

import org.openqa.selenium.support.ui.WebDriverWait;
import ConfigManager.ConfigManager;

public class DriverUtility {
    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Long.parseLong(ConfigManager.getInfoFromJSON("config","timeOutInSeconds")), Long.parseLong(ConfigManager.getInfoFromJSON("config","sleepInMillis")));

    public static WebDriverWait getWait() {
     return wait;
    }
    public static void openURL(String url) {
        Driver.getDriver().get(url);
    }
    public static String  getWindowHandle() {
        return Driver.getDriver().getWindowHandle();
    }
    public static void   switchToWindow(String window) {
        Driver.getDriver().switchTo().window(window);
    }
}

