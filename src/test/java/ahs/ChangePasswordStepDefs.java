package ahs;

import ahs.pageObjects.ChangePasswordObject;
import ahs.support.AutomationContants;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ChangePasswordStepDefs {

    public static WebDriver browser;

    ChangePasswordObject changePasswordObject;

    @When("^he click on Superadmin button and select Change Password option$")
    public void heClickOnSuperadminButtonAndSelectChangePasswordOption() {
        changePasswordObject = new ChangePasswordObject();
        changePasswordObject.selectUser();
    }

    @Then("^he should be nevigate to change password page$")
    public void he_should_be_nevigate_to_change_password_page() {
        changePasswordObject.changepasswordpage();
    }

    @When("^he enter old password and new password and confirm new password$")
    public void heEnterOldPasswordAndNewPasswordAndConfirmNewPassword() {
        changePasswordObject.newPasswordPage();
    }

    @When("^click on save button$")
    public void click_on_save_button()  {
        changePasswordObject.savebutton();

    }

    @Then("^he should navigate to home page$")
    public void he_should_navigate_to_home_page() {
        browser.get(AutomationContants.URL);

    }

}
