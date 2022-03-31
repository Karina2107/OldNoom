package Pages;

import Base.*;
import ConfigManager.ConfigManager;
import Driver.DriverUtility;
import org.openqa.selenium.By;

public class SubScreen extends BaseForm {
    public SubScreen() {
        super(new Button(By.className("page-is-loaded"), "uniqueElement"), "SubScreen");
    }

    private String firstName = ConfigManager.getInfoFromJSON("testinfo","firstName");
    private String lastName = ConfigManager.getInfoFromJSON("testinfo","lastName");
    private String cardNumber = ConfigManager.getInfoFromJSON("testinfo","cardNumber");
    private String cardMonth = ConfigManager.getInfoFromJSON("testinfo","cardMonth");
    private String cardYear = ConfigManager.getInfoFromJSON("testinfo","cardYear");
    private String CVV = ConfigManager.getInfoFromJSON("testinfo","CVV");

    private Button continueButton = new Button(By.xpath("//button[@type='submit']"),"continueButton");
    private Button getMyPlanButton = new Button(By.id("continue-button"),"getMyPlanButton");
    private Input firstNameInput = new Input(By.id("first_name"),"firstNameInput");
    private Input lastNameInput = new Input(By.id("last_name"),"lastNameInput");
    private Input cardNumberInput = new Input(By.xpath("//*[contains(@class,'recurly-element-number')]//iframe"),"cardNumberInput");
    private Input cardMonthInput = new Input(By.xpath("//*[contains(@class,'recurly-element-month')]//iframe"),"cardMonthInput");
    private Input cardYearInput = new Input(By.xpath("//*[contains(@class,'recurly-element-year')]//iframe"),"cardYearInput");
    private Input cardCVVInput = new Input(By.xpath("//*[contains(@class,'recurly-element-cvv')]//iframe"),"cardCVVInput");
    private Input input = new Input(By.xpath("//input"),"cardCVVInput");

    public boolean isSubScreen(){
        if(getMyPlanButton.isVisible()){
            return true;
        }
        return false;
    }
    public void clickContinueButton(){
        continueButton.clickElement();
    }
    public void clickGetMyPlanButton(){
        getMyPlanButton.scrollToElement();
        getMyPlanButton.clickElement();
    }
    public void fillCardInfo(){
        String mainWindow = DriverUtility.getWindowHandle();
        firstNameInput.sendText(firstName);
        lastNameInput.sendText(lastName);
        IFrame.goToFrame(cardNumberInput);
        input.sendText(cardNumber);
        DriverUtility.switchToWindow(mainWindow);
        IFrame.goToFrame(cardMonthInput);
        input.sendText(cardMonth);
        DriverUtility.switchToWindow(mainWindow);
        IFrame.goToFrame(cardYearInput);
        input.sendText(cardYear);
        DriverUtility.switchToWindow(mainWindow);
        IFrame.goToFrame(cardCVVInput);
        input.sendText(CVV);
        DriverUtility.switchToWindow(mainWindow);
    }
    public void subscribe(){
        clickGetMyPlanButton();
        fillCardInfo();
        clickContinueButton();
    }
}
