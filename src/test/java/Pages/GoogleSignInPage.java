package Pages;

import Base.BaseForm;
import Base.Button;
import Base.Input;
import Logging.Logging;
import org.openqa.selenium.By;

public class GoogleSignInPage extends BaseForm {
    public GoogleSignInPage() {
        super(new Button(By.id("identifierId"), "uniqueElement"), "GoogleSignInPage");
        Logging.getLogger().info("Google SignIn Page");
    }

    private Input emailInput = new Input(By.xpath("//*[@type='email']"),"emailInput");
    private Input passwordInput = new Input(By.xpath("//*[@type='password']"),"passwordInput");
    private Button continueForEmailButton = new Button(By.id("identifierNext"),"continueForEmailButton");
    private Button continueForPasswordButton = new Button(By.id("passwordNext"),"continueForPasswordButton");

    public void fillEmail(String email){
        emailInput.sendText(email);
    }
    public void fillPassword(String password){
        passwordInput.sendText(password);
    }
    public void clickContinueForEmailButton(){
        continueForEmailButton.clickElement();
    }
    public void clickContinueForPasswordButton(){
        continueForPasswordButton.clickElement();
    }
}
