package ahs.pageObjects;

import ahs.Screens.RegistrationElements;
import ahs.support.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterPageObject extends basePage
{
    RegistrationElements registrationElements = new RegistrationElements();

    public RegisterPageObject()
    {
        driver = BrowserFactory.getBrowser();
        PageFactory.initElements(driver,registrationElements);
    }

    public void clickDesiredRadioButton(String radioButton)
    {
        for(WebElement radio:registrationElements.radioButtons)
        {
            if (radio.getText().trim().equalsIgnoreCase(radioButton))
            {
                radio.click();
                break;
            }
        }
    }

    public void selectField(String desired_text)
    {
       WebElement field_Type = driver.findElement(By.cssSelector("select[id*='"+desired_text+"']"));
       if (field_Type.getAttribute("id").contains(desired_text));
       field_Type.click();
    }

    public void selectPreferredTime(String preferredTime)
    {
        WebElement timeOfChoise = driver.findElement(By.cssSelector("select[id*='Time'] '"+preferredTime+"'"));

        if (timeOfChoise.getText().equalsIgnoreCase(preferredTime))
        {
            timeOfChoise.click();
        }
    }
}
