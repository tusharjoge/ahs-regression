package ahs.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegistrationElements
{
    @FindBy(css = "div[class='md-radio'] label")
    public List<WebElement> radioButtons;
}


