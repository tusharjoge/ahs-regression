package ahs.support;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    static WebDriver browser;

    @BeforeClass
    public static void initBrowser(){
        browser = BrowserFactory.getBrowser();
    }
    @AfterClass
    public static void close(){
        browser.quit();
        browser = null;
    }

    @Before
    public static void setwindows() {
        browser = BrowserFactory.getBrowser();
        browser.manage().timeouts().implicitlyWait(AutomationContants.TIMEOUT, TimeUnit.SECONDS);
        browser.get(AutomationContants.URL);
        browser.manage().window().maximize();
    }

    @After
    public void close(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) browser).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
        }
    }
}
