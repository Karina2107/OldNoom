import Base.BaseTest;
import ConfigManager.ConfigManager;
import Pages.*;
import org.testng.Assert;

public class Test extends BaseTest {
    private String email = ConfigManager.getInfoFromJSON("testinfo","email");
    private String password = ConfigManager.getInfoFromJSON("testinfo","password");

    @org.testng.annotations.Test
    public void quizTest(){
        QuizPages quizPages = new QuizPages();
        quizPages.quizStep1idealWeight();
        quizPages.quizStep2WeightHeight();
        quizPages.quizStep3gender();
        quizPages.quizStep4age();
        quizPages.quizStep5experience();
        quizPages.quizStep6focus();
        quizPages.quizStep7gotIT();
        quizPages.quizStep8backIssues();
        quizPages.quizStep9diabetes();
        quizPages.quizStep10antibiotic();
        quizPages.quizStep11liveArea();
        quizPages.quizStep12email();
        quizPages.quizStep13();
        quizPages.quizStep14focus();
        quizPages.quizStep15physicalLimitations();
        quizPages.quizStep16restrictionsAllergies();
        quizPages.quizStep17schedule();
        quizPages.quizStep18mealsPreparation();
        quizPages.quizStep19workoutTime();
        quizPages.quizStep20desiredSpeed();
        quizPages.quizStep21goal();
        quizPages.quizStep22trafficSource();
        quizPages.progress();
        SubScreen subScreen = new SubScreen();
        Assert.assertTrue(subScreen.isSubScreen(),"SubScreen is invisible");
        subScreen.subscribe();
        AdditionalPurchasePage additionalPurchasePage = new AdditionalPurchasePage();
        additionalPurchasePage.clickSkipButton();
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isLoginScreen(),"LoginScreen is invisible");
        loginPage.clickGoogleSignInButton();
        GoogleSignInPage googleSignInPage = new GoogleSignInPage();
        googleSignInPage.fillEmail(email);
        googleSignInPage.clickContinueForEmailButton();
        googleSignInPage.fillPassword(password);
        googleSignInPage.clickContinueForPasswordButton();
        loginPage.clickContinueButton();
        DownloadPage downloadPage = new DownloadPage();
        Assert.assertTrue(downloadPage.isDownloadPage(),"DownloadPage is invisible");
    }
}
