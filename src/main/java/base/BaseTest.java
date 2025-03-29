package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class BaseTest {
    protected WebDriver driver;
    public static String Username = "test_2QBmSW";
    public static String AccessKey = "GWN4PvmHqRzQbnT1Dhdx";
    public static final String URL = "https://" + Username +":" + AccessKey +"@hub-cloud.browserstack.com/wd/hub";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("bstack:options", new HashMap<String, Object>() {{
            put("os", "Windows");
            put("osVersion", "10");
            put("buildName", "Build Number 1.0.0");
            put("sessionName", "BasicUITest");
        }});
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("browserVersion", "134");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        caps.merge(options);

        //driver = new ChromeDriver(options);

        driver = new RemoteWebDriver(new URL(URL),caps);
        driver.get("https://www.shophighlinewarren.com/");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}