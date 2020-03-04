package ahs.pageObjects;

import ahs.Screens.LoginScreen;
import ahs.support.AutomationContants;
import ahs.support.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject extends basePage {

    LoginScreen loginScreen = new LoginScreen();

    public LoginPageObject(){
        driver = BrowserFactory.getBrowser();
        PageFactory.initElements(driver,loginScreen);
    }

    public void login(String user) {
        if(user.toLowerCase().equals("superadmin")){
            loginScreen.username_TextBox.sendKeys(AutomationContants.SUPERADMIN_USERNAME);
            loginScreen.password_TextBox.sendKeys(AutomationContants.SUPERADMIN_PASSWORD);
            loginScreen.login_Button.click();
        }
    }
}
