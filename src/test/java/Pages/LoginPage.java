package Pages;

import Base.BaseForm;
import Base.Button;
import Logging.Logging;
import org.openqa.selenium.By;

public class LoginPage extends BaseForm {
    public LoginPage() {
        super(new Button(By.className("tutorial-login"), "uniqueElement"), "LoginPage");
        Logging.getLogger().info("Login Page");
    }

    private Button googleSignInButton = new Button(By.id("google-signin-link"),"googleSignInButton");
    private Button continueButton = new Button(By.xpath("//button[@type='submit']"),"continueButton");

    public boolean isLoginScreen(){
        if(googleSignInButton.isVisible()){
            return true;
        }
        return false;
    }
    public void clickGoogleSignInButton(){
        googleSignInButton.clickElement();
    }
    public void clickContinueButton(){
        continueButton.clickElement();
    }

}
