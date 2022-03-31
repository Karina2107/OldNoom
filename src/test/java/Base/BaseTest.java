package Base;

import ConfigManager.ConfigManager;
import Driver.Driver;
import Driver.DriverUtility;
import Logging.Logging;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public void startTest(){
        Logging.getLogger().info("Start Test");
        DriverUtility.openURL(ConfigManager.getInfoFromJSON("config","URL"));
    }

    @AfterMethod
    public void endTest() {
        Driver.finishingWorkWithDriver();
        Logging.getLogger().info("Test is ended");
    }
}
