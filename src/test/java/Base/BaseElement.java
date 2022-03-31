package Base;

import Driver.Driver;
import Driver.DriverUtility;
import Logging.Logging;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class BaseElement {
    private By locator;
    protected String elementName;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.elementName = name;
    }

    public void waitVisibility() {
        DriverUtility.getWait().until(ExpectedConditions.visibilityOfElementLocated(this.locator));
    }
    protected WebElement findElement() {
        waitVisibility();
        return Driver.getDriver().findElement(this.locator);
    }
    public void scrollToElement(){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", this.findElement());
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0,-150)", "");
        waitVisibility();
    }
    public int findElementsSize() {
        waitVisibility();
        return Driver.getDriver().findElements(this.locator).size();
    }
    public void clickElement() {
        scrollToElement();
        findElement().click();
        Logging.getLogger().info(this.elementName + " is clicked");
    }
    public String getText() {
         return findElement().getText();
    }
    public void sendText(String text) {
        findElement().sendKeys(text);
        Logging.getLogger().info("Send text to " + this.elementName);
    }
    public String getElementName() {
        return this.elementName;
    }
    public boolean isVisible(){
        try{
            findElement();
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }
    public String getAttributeValue(String attribute){
       return this.findElement().getAttribute(attribute);
    }
}
