package ahs;

import ahs.pageObjects.DashBoardPageObject;
import ahs.pageObjects.LoginPageObject;
import ahs.pageObjects.RegisterPageObject;
import ahs.support.BrowserFactory;
import ahs.support.Utilites;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;

public class MyStepdefs {

    WebDriver browser;
    LoginPageObject loginPageObject;
    DashBoardPageObject dashBoardPageObject = new DashBoardPageObject();
    RegisterPageObject registerPageObject = new RegisterPageObject();

    @Then("^User should see \"([^\"]*)\"$")
    public void userShouldSee(String msg) throws Throwable {
        // WebElement body = browser.findElement(By.tagName("body"));
        WebElement errmsg =
                browser.findElement(By.className("screennotifications"));
        String msg_text = errmsg.getText();
        Assert.assertEquals(msg, msg_text);
    }

    @Given("^super admin is logged in$")
    public void superAdminIsLoggedIn() {

    }

    @When("^he navigate to User details$")
    public void heNavigateToUserDetails() {

    }

    @And("^create a new user \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void createANewUserAnd(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the user should be created successfully$")
    public void theUserShouldBeCreatedSuccessfully() {

    }

    @And("^when he navigate to list of user$")
    public void whenHeNavigateToListOfUser() {

    }

    @Then("^admin should see the record with \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void adminShouldSeeTheRecordWithAnd(String arg0, String arg1, String arg2) throws Throwable {

    }

    @Given("^\"([^\"]*)\" logs into the application$")
    public void logsIntoTheApplication(String user) throws Throwable {
        loginPageObject = new LoginPageObject();
        loginPageObject.login(user);
        Utilites.waitFor(1);
    }

    @Given("^Patients logged into the patient portal$")
    public void patientsLoggedIntoThePatientPortal() {

    }

    @When("^he navigate to invoices menu$")
    public void heNavigateToInvoicesMenu() {

    }

    @Given("^Super admin logged in$")
    public void super_admin_logged_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Given("^he navigated to group test page$")
    public void he_navigated_to_group_test_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @When("^he opens the add group test page$")
    public void he_opens_the_add_group_test_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //  throw new PendingException();
    }

    @When("^enter Group Test Name as \"(.*?)\" and Price as \"(.*?)\"$")
    public void enter_Group_Test_Name_as_and_Price_as(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @When("^submit the data to create new group test$")
    public void submit_the_data_to_create_new_group_test() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Then("^he should be navigated to list of group test age$")
    public void he_should_be_navigated_to_list_of_group_test_age() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Then("^the \"(.*?)\" should be available in the list$")
    public void the_should_be_available_in_the_list(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Then("^the \"(.*?)\" should match$")
    public void the_should_match(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @When("^he navigate to \"([^\"]*)\" page$")
    public void heNavigateToPage(String tab_name)
    {
      dashBoardPageObject.clickDesiredMenuOption(tab_name);

    }

    @And("^user confirms his status if he is \"([^\"]*)\"$")
    public void userConfirmsHisStatusIfHeIs(String radioButton)
    {
       registerPageObject.clickDesiredRadioButton(radioButton);
    }

    @And("^user clicks on \"([^\"]*)\" field$")
    public void userClicksOnField(String fieldName)
    {
        registerPageObject.selectField(fieldName);
    }

    @And("^user prefers \"([^\"]*)\" as a prefered time$")
    public void userPrefersAsAPreferedTime(String preferredTime)
    {
        registerPageObject.selectPreferredTime(preferredTime);
    }
}
