package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {
//comment
    @FindBy(id = "searchTerm")
    WebElement searchbox;

    @FindBy(xpath = "//span[@class='_1gqeQ']")
    WebElement searchbutton;

    @FindBy(xpath = "//h1[@class='search-title__term']")
    WebElement resultspage;

    @FindBy(xpath = "//div[@class='_3-aaF']//a[2]//*[local-name()='svg']")
    WebElement accountbutton;

    public void doSearch(String item){
        searchbox.sendKeys(item);
        searchbutton.click();
    }

    public void homePageURL(){
        String actualurl = driver.getCurrentUrl();
        Assert.assertThat(actualurl, Matchers.containsString("argos"));
    }

    public void resultOfSearch() {
        String resultUrl = driver.getCurrentUrl();
        Assert.assertThat(resultUrl, Matchers.containsString("nike"));
    }

    public void clickOnAccountButton(){
       accountbutton.click();
    }

    public void accountResult(){
    }

//pull practice


}
