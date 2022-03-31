package Pages;

import Base.BaseForm;
import Base.Button;
import Base.Input;
import ConfigManager.ConfigManager;
import Logging.Logging;
import org.openqa.selenium.By;

public class QuizPages extends BaseForm {
    public QuizPages() {
        super(new Button(By.className("tutorial-progressbar"),"uniqueElement"), "QuizPages");
        Logging.getLogger().info("Quiz Started");
    }

    private int idealWeight = Integer.parseInt(ConfigManager.getInfoFromJSON("testinfo","idealWeight"));
    private int weight = Integer.parseInt(ConfigManager.getInfoFromJSON("testinfo","weight"));
    private int height = Integer.parseInt(ConfigManager.getInfoFromJSON("testinfo","height"));
    private String gender = ConfigManager.getInfoFromJSON("testinfo","gender");
    private String email = ConfigManager.getInfoFromJSON("testinfo","email");

    private Button continueButton = new Button(By.xpath("//button[@type='submit']"),"continueButton");
    private Input idealWeightInput = new Input(By.name("idealWeight"),"idealWeightInput");
    private Input currentHeightInput = new Input(By.name("currentHeight"),"currentHeightInput");
    private Input currentWeightInput = new Input(By.name("currentWeight"),"currentWeightInput");
    private Button genderButton = new Button(By.xpath("//*[@id='" + gender + "']/following::span"),"genderButton");
    private Button ageButton = new Button(By.xpath("//*[@name='age']/following::span"),"ageButton");
    private Button experienceButton = new Button(By.xpath("//*[@name='experience']/following::span"),"experienceButton");
    private Button focusButton = new Button(By.xpath("//*[@name='focus']/following::span"),"focusButton");
    private Button backIssuesButton = new Button(By.xpath("//*[@name='backIssues']/following::span"),"backIssuesButton");
    private Button diabetesButton = new Button(By.xpath("//*[@name='diabetes']/following::span"),"diabetesButton");
    private Button antibioticButton = new Button(By.xpath("//*[@name='antibiotic']/following::span"),"antibioticButton");
    private Button liveAreaButton = new Button(By.xpath("//*[@name='liveArea']/following::span"),"liveAreaButton");
    private Button physicalLimitationsButton = new Button(By.xpath("//*[@name='physicalLimitations']/following::span"),"physicalLimitationsButton");
    private Button restrictionsAllergiesButton = new Button(By.xpath("//*[@name='restrictionsAllergies']/following::span"),"restrictionsAllergiesButton");
    private Button scheduleButton = new Button(By.xpath("//*[@name='schedule']/following::span"),"scheduleButton");
    private Button mealsPreparationButton = new Button(By.xpath("//*[@name='mealsPreparation']/following::span"),"mealsPreparationButton");
    private Button workoutTimeButton = new Button(By.xpath("//*[@name='workoutTime']/following::span"),"workoutTimeButton");
    private Button desiredSpeedButton = new Button(By.xpath("//*[@name='desiredSpeed']/following::span"),"desiredSpeedButton");
    private Button goalButton = new Button(By.xpath("//*[@name='goal']/following::span"),"goalButton");
    private Button trafficSourceButton = new Button(By.xpath("//*[@name='trafficSource']/following::span"),"trafficSourceButton");
    private Button progressButton = new Button(By.xpath("//*[contains(@class,'tutorial-popup__button ')]"),"progressButton");
    private Input emailInput = new Input(By.name("email"),"emailInput");

    public void fillIdealWeightInput(int weight){
        idealWeightInput.sendText(String.valueOf(weight));
    }
    public void fillCurrentHeightInput(int height){
        currentHeightInput.sendText(String.valueOf(height));
    }
    public void fillCurrentWeightInput(int weight){
        currentWeightInput.sendText(String.valueOf(weight));
    }
    public void clickContinueButton(){
        continueButton.clickElement();
    }
    public void quizStep1idealWeight(){
        fillIdealWeightInput(idealWeight);
        clickContinueButton();
        Logging.getLogger().info("Quiz Step 1, check.");
    }
    public void quizStep2WeightHeight(){
        fillCurrentHeightInput(height);
        fillCurrentWeightInput(weight);
        clickContinueButton();
        Logging.getLogger().info("Quiz Step 2, check.");
    }
    public void quizStep3gender(){
        genderButton.clickElement();
        Logging.getLogger().info("Quiz Step 3, check.");
    }
    public void quizStep4age(){
        ageButton.clickElement();
        Logging.getLogger().info("Quiz Step 4, check.");
    }
    public void quizStep5experience(){
        experienceButton.clickElement();
        Logging.getLogger().info("Quiz Step 5, check.");
    }
    public void quizStep6focus(){
        focusButton.clickElement();
        Logging.getLogger().info("Quiz Step 6, check.");
    }
    public void quizStep7gotIT(){
        clickContinueButton();
        Logging.getLogger().info("Quiz Step 7, check.");
    }
    public void quizStep8backIssues(){
        backIssuesButton.clickElement();
        Logging.getLogger().info("Quiz Step 8, check.");
    }
    public void quizStep9diabetes(){
        diabetesButton.clickElement();
        Logging.getLogger().info("Quiz Step 9, check.");
    }
    public void quizStep10antibiotic(){
        antibioticButton.clickElement();
        Logging.getLogger().info("Quiz Step 10, check.");
    }
    public void quizStep11liveArea(){
        liveAreaButton.clickElement();
        Logging.getLogger().info("Quiz Step 11, check.");
    }
    public void fillEmailInput(String email){
        emailInput.sendText(email);
    }
    public void quizStep12email(){
        fillEmailInput(email);
        continueButton.waitVisibility();
        clickContinueButton();
        Logging.getLogger().info("Quiz Step 12, check.");
    }
    public void quizStep13(){
        clickContinueButton();
        Logging.getLogger().info("Quiz Step 13, check.");
    }
    public void quizStep14focus(){
        focusButton.clickElement();
        Logging.getLogger().info("Quiz Step 14, check.");
    }
    public void quizStep15physicalLimitations(){
        physicalLimitationsButton.clickElement();
        Logging.getLogger().info("Quiz Step 15, check.");
    }
    public void quizStep16restrictionsAllergies(){
        restrictionsAllergiesButton.clickElement();
        Logging.getLogger().info("Quiz Step 16, check.");
    }
    public void quizStep17schedule(){
        scheduleButton.clickElement();
        Logging.getLogger().info("Quiz Step 17, check.");
    }
    public void quizStep18mealsPreparation(){
        mealsPreparationButton.clickElement();
        Logging.getLogger().info("Quiz Step 18, check.");
    }
    public void quizStep19workoutTime(){
        workoutTimeButton.clickElement();
        Logging.getLogger().info("Quiz Step 19, check.");
    }
    public void quizStep20desiredSpeed(){
        desiredSpeedButton.clickElement();
        Logging.getLogger().info("Quiz Step 20, check.");
    }
    public void quizStep21goal(){
        goalButton.clickElement();
        Logging.getLogger().info("Quiz Step 21, check.");
    }
    public void quizStep22trafficSource(){
        trafficSourceButton.clickElement();
        Logging.getLogger().info("Quiz Step 22, check.");
    }
    public void progress(){
        for(int i = 0; i < 3; i++) {
            progressButton.clickElement();
            int stepNumber = i+1;
            Logging.getLogger().info("Progress step " + stepNumber + " , check.");
        }
    }
}
