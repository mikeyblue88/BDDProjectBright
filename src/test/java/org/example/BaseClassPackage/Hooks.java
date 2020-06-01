package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.net.MalformedURLException;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setup() throws MalformedURLException {
        driverFactory.openBrowser();
    }
    @After
    public void teardown(){
        //driverFactory.closeBrowser();
    }
}
