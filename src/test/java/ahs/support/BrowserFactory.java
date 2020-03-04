package ahs.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver getBrowser(){

        if(driver == null){
            driver = invokeBrowser();
            return  driver;
        }
        else {
            return driver;
        }
    }




    private static WebDriver invokeBrowser() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
