package sa.nhc.web.pages.exisitng;

import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import sa.nhc.web.objects.exisitng.*;


public class HomePage {

    public void closeAllSakaniPopups() throws Exception {
        if (Browser.isElementPresent(HomePageObjects.Register_Your_interest_Close_BTN()) && Browser.isElementPresent(HomePageObjects.Cookies_BTN())) {
            Browser.click(HomePageObjects.Cookies_BTN());
            Browser.click(HomePageObjects.Register_Your_interest_Close_BTN());
        } else if (Browser.isElementPresent(HomePageObjects.Register_Your_interest_Close_BTN())) {
            Browser.click(HomePageObjects.Register_Your_interest_Close_BTN());
        }
        else if (Browser.isElementPresent(HomePageObjects.Cookies_BTN())) {
            Browser.click(HomePageObjects.Cookies_BTN());
        }
    }

    public void clickOnLoginButtonInHomePage() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.BTNHomeLogin(), 40);
        Browser.moveToElement(HomePageObjects.BTNHomeLogin());
        Browser.click(HomePageObjects.BTNHomeLogin());
    }

    public void clickOnMyProfileButton() throws Exception {
        Browser.click(HomePageObjects.BTNMyProfile());
    }

    public void SearchForAProject(String ProjectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.SearchForProject(), 50);
        Browser.waitForSeconds(1);
        WebElement Input_Project = Browser.getWebElement(HomePageObjects.InputProjectName());
        Input_Project.sendKeys(ProjectName);
        Browser.waitUntilVisibilityOfElement(HomePageObjects.SearchedProjectResult(), 50);
        Browser.click(HomePageObjects.SearchedProjectResult());
    }

    public void SearchForAProjectWithEnter(String ProjectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.SearchForProject(), 50);
        Browser.waitForSeconds(1);
        WebElement Input_Project = Browser.getWebElement(HomePageObjects.InputProjectName());
        Input_Project.sendKeys(ProjectName);
        Browser.waitUntilVisibilityOfElement(HomePageObjects.SearchedProjectForTags(), 50);
        Browser.click(HomePageObjects.SearchedProjectForTags());
        Browser.waitUntilVisibilityOfElement(HomePageObjects.ShowSearchedBTN(), 50);
        Browser.click(HomePageObjects.ShowSearchedBTN());
    }

    public void ClickToShowResults() throws Exception {
        Browser.waitUntilElementToBeClickable(HomePageObjects.ShowSearchedBTN(), 50);
        Browser.click(HomePageObjects.ShowSearchedBTN());
    }
}
