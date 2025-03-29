package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class BrowserStackTest {


    public static String Username = "test_2QBmSW";
    public static String AccessKey = "GWN4PvmHqRzQbnT1Dhdx";
    public static final String URL = "https://" + Username +":" + AccessKey +"@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void loginTest() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("bstack:options", new HashMap<String, Object>() {{
            put("os", "Windows");
            put("osVersion", "10");
            put("buildName", "Build Number 1.0.0");
            put("sessionName", "Sample Test");
        }});
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("browserVersion", "134");

        WebDriver driver = new RemoteWebDriver(new URL(URL),caps);
        driver.get("https://www.shophighlinewarren.com/");
        HomePage homePage = new HomePage(driver);
        //Assert.assertTrue(homePage.isBrowseByCategoryVisible(), "Browse By Category link not visible.");
        Thread.sleep(5000);
        driver.quit();

    }
}
