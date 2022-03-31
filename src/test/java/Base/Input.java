package Base;


import Logging.Logging;
import org.openqa.selenium.By;

public class Input extends BaseElement {
    public Input(By locator, String name) {
        super(locator, name);
    }

    public void clear() {
        findElement().clear();
        Logging.getLogger().info(this.elementName + " is cleared");
    }
}
