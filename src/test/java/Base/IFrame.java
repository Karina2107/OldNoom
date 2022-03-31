package Base;

import Driver.Driver;
import Logging.Logging;

public class IFrame extends BaseForm {

    public IFrame(BaseElement element, String name) {
        super(element, name);
    }

    public static void goToFrame(BaseElement element){
         Driver.getDriver().switchTo().frame(element.findElement());
         Logging.getLogger().info("Go to " + element.elementName);
    }
}
