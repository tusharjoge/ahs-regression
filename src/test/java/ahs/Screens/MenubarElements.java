package ahs.Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MenubarElements {


    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Masters")
    public List<WebElement> menu_links;

//   @FindBy(how = How.CSS, using = "li[id*='"+tab_name+"']")
//    List<WebElement> listOfMenuTitles;
//
//   @FindBy(xpath = "//*[contains(text(),'" + emailtitle + "')]")
//    public WebElement menuItems;

}
