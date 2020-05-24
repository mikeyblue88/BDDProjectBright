package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resultpage extends DriverFactory {

    @FindBy(xpath = "//span[contains(text(),'Running')]")
    WebElement runningFilter;

    @FindBy (xpath = "//h1[contains(text(),'Running')]")
    WebElement runningResult;

    public void runningFilter(){
        runningFilter.click();
    }

   public void resultPageReturn() {
       String actualRunningResult = runningResult.getText();
       Assert.assertThat(actualRunningResult, Matchers.containsString("Running"));
   }}








