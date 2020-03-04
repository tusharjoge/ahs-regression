package ahs.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ChangePasswordScreen {


    @FindBy(how = How.CLASS_NAME,using = "img-circle")
    public WebElement select_user;

    @FindBy(how = How.XPATH,using = "/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    public WebElement select_changePassword;

    @FindBy(how = How.CLASS_NAME,using = "control-label col-md-4")
    public WebElement changer_passwordPpage;

    @FindBy(how = How.ID,using = "Old_Password")
    public WebElement old_password;

    @FindBy(how = How.ID,using = "New_Password")
    public WebElement new_password;

    @FindBy(how = How.ID, using = "C_New_Password")
    public WebElement confirm_New_Password;

    @FindBy(how = How.XPATH,using = "/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/button[1]")
    public WebElement save_button;


}
