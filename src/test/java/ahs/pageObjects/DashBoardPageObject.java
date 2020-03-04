package ahs.pageObjects;

import ahs.Screens.MenubarElements;
import ahs.support.BrowserFactory;
import ahs.support.Utilites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoardPageObject extends basePage
{
    MenubarElements menubarElements = new MenubarElements();

    public DashBoardPageObject()
    {
        driver = BrowserFactory.getBrowser();
        PageFactory.initElements(driver,menubarElements);
    }

    public void clickDesiredMenuOption(String tab_name)
    {
        List<WebElement> names_of_tabs =driver.findElements(By.cssSelector("li[id*='"+tab_name+"']"));
         for (WebElement tabsToclick:names_of_tabs)
         {
             System.out.println("The values of the tab are" +tabsToclick.getAttribute("id").contains(tab_name));
             if (tabsToclick.getAttribute("id").contains(tab_name))
             {
                 tabsToclick.click();
                 break;
             }
         }
    }


    //for(int i = 0;valuex.getLength()>i;i++)
    // {
        //
    // }
}
