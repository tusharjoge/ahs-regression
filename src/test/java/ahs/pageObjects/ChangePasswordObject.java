package ahs.pageObjects;

import ahs.Screens.ChangePasswordScreen;
import ahs.Screens.LoginScreen;
import ahs.support.AutomationContants;
import ahs.support.BrowserFactory;
import gherkin.lexer.Pa;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class ChangePasswordObject extends basePage {

   ChangePasswordScreen changePassword = new ChangePasswordScreen();


    public ChangePasswordObject() {
        driver = BrowserFactory.getBrowser();
        PageFactory.initElements(driver,changePassword);
    }

    public void selectUser(){
        changePassword.select_user.click();
        changePassword.select_changePassword.click();
    }

    public void changepasswordpage(){
        changePassword.changer_passwordPpage.getText();
        Assert.assertTrue(String.valueOf(changePassword.changer_passwordPpage),true);
    }

    public void newPasswordPage(){
        changePassword.old_password.sendKeys(AutomationContants.Old_Password);
        changePassword.new_password.sendKeys(AutomationContants.New_Password);
        changePassword.confirm_New_Password.sendKeys(AutomationContants.Confirm_New_password);
    }

    public void savebutton(){
        changePassword.save_button.click();}
}
