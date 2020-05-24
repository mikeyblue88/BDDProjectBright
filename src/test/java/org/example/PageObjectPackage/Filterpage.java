package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Filterpage extends DriverFactory {

    @FindBy (xpath = "//a[contains(text(),'Nike Lean Armbands')]")
        WebElement clickProduct;
    @FindBy (xpath = "//div[@class='xs-8--none']//button[@class='Buttonstyles__Button-q93iwm-2 enxOSK']")
    WebElement trolley;
    @FindBy (linkText = "Go to Trolley")
    WebElement goToTrolley;

    public void clickProduct(){
        clickProduct.click();
    }

    public void addToTrolley(){
        trolley.click();
    }

    public void confirmTrolley(){
        goToTrolley.click();
    }
    public void basket(){
        String actualBasket = driver.getCurrentUrl();
        Assert.assertThat(actualBasket, Matchers.containsString("basket"));

    }
    }
