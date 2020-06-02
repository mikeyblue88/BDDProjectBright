package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
    public DriverFactory(){
        PageFactory.initElements(driver,this); }

    public static final String USERNAME = "michaelsullivan19";
    public static final String AUTOMATE_KEY = "wyQDXAnccuqv3VdnXhpR";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public void openBrowser() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "11.0");
        caps.setCapability("project", "click on button");
        caps.setCapability("build", "1.1");
        caps.setCapability("name", "homepage functionality");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.5.2");

        driver = new RemoteWebDriver(new URL("https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub"), caps);

        //WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
        //driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk");
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        //driver.quit();
    }
}
