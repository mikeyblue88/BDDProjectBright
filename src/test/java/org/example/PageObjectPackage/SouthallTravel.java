package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.print.attribute.standard.Destination;
import java.util.List;

public class SouthallTravel extends DriverFactory {
        public void southallUrl(){
        String southallUrl = driver.getCurrentUrl();
        Assert.assertThat(southallUrl, Matchers.containsString("southalltravel"));}

        public void departBox(){
        WebElement Departurebox = driver.findElement(By.cssSelector("#DestinationFrom1"));
        System.out.println(Departurebox.isEnabled());
        Departurebox.sendKeys("Lhr");

        List<WebElement> Departs = driver.findElements(By.className("ui-menu-item"));
        for (WebElement Depart : Departs){
            System.out.println(Depart.getText());
            if(Depart.getText().contains("Heathrow"));
            Depart.click();
        }}

        public void destinationBox(){
            WebElement DestinationBox = driver.findElement(By.cssSelector("#DestinationTo"));
            System.out.println(DestinationBox.isEnabled());
            DestinationBox.sendKeys("Jfk");

            List<WebElement> Destinations = driver.findElements(By.className("ui-menu-item-wrapper"));
            for (WebElement Destination : Destinations){
                System.out.println(Destination.getText());
                if(Destination.getText().contains("Kennedy"));
                Destination.click();
            }
        }
        public void departureDate(){
            WebElement departDate = driver.findElement(By.id("deptdt"));
            List<WebElement> allDates = driver.findElements(By.cssSelector(".ui-state-default"));
            for (WebElement allDate: allDates){
                System.out.println(allDate.getText());
                if (allDate.getText().contains("27"));
                allDate.click();
            }
        }
        public void returnDate(){

        }
}


