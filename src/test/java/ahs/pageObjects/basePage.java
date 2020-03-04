package ahs.pageObjects;

import ahs.Screens.LoginScreen;
import ahs.Screens.MenubarElements;
import ahs.support.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class basePage {

    WebDriver driver;

    MenubarElements menubarElements = new MenubarElements();

    public basePage(){
        driver = BrowserFactory.getBrowser();
        PageFactory.initElements(driver,menubarElements);
    }

    public void navigateTo(String page) throws Exception {

        for(WebElement link:menubarElements.menu_links){
            if(page.equals(link.getText())){
                link.click();
                return;
            }
        }
        throw new Exception("Menu item not found"+page);
    }


//    public basePage(WebDriver browser) {
//        this.driver = browser;
//    }
}
