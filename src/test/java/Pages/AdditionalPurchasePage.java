package Pages;

import Base.BaseForm;
import Base.Button;
import Logging.Logging;
import org.openqa.selenium.By;

public class AdditionalPurchasePage extends BaseForm {
    public AdditionalPurchasePage() {
        super(new Button(By.xpath("//div[contains(@class,'additional-plan')]"), "uniqueElement"), "AdditionalPurchasePage");
        Logging.getLogger().info("Additional Purchase Page");
    }

    private Button skipButton = new Button(By.id("skip-button"),"skipButton");

    public void clickSkipButton(){
        skipButton.clickElement();
    }
}
