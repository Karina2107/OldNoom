package Driver;

import ConfigManager.ConfigManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.HashMap;
import java.util.Map;

public class Driver {
    private static WebDriver driver;
    private static ChromeOptions chromeOptions = new ChromeOptions();
    private static Map<String, Object> prefs = new HashMap<String, Object>();
    private static FirefoxOptions firefoxOptions = new FirefoxOptions();

    public static WebDriver getDriver() {
        if (driver == null) {
                setDriver();
            }
            return driver;
    }
    private static  void setDriver() {
        String browser = ConfigManager.getInfoFromJSON("config","browser");
        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                prefs.put("intl.accept_languages", ConfigManager.getInfoFromJSON("config","locale"));
                firefoxOptions.addArguments(String.format("--window-size=%s,%s", ConfigManager.getInfoFromJSON("config","windowWidth"), ConfigManager.getInfoFromJSON("config","windowHeight")));
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                WebDriverManager.chromedriver().setup();
                prefs.put("intl.accept_languages", ConfigManager.getInfoFromJSON("config","locale"));
                chromeOptions.setExperimentalOption("prefs", prefs);
                chromeOptions.addArguments(String.format("--window-size=%s,%s", ConfigManager.getInfoFromJSON("config","windowWidth"), ConfigManager.getInfoFromJSON("config","windowHeight")));
                driver = new ChromeDriver(chromeOptions);
                break;
        }
    }
    public static void finishingWorkWithDriver() {
            driver.quit();
            driver = null;
        }
}
