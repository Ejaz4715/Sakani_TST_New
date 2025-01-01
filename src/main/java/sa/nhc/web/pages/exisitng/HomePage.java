package sa.nhc.web.pages.exisitng;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;
import sa.nhc.web.objects.exisitng.*;
import sa.nhc.web.pages.FullBookingJourneyPage;


public class HomePage {

    public void clickOnLoginButton(String username, String password, String OTP) throws Exception {
     Browser.waitUntilVisibilityOfElement(By.xpath("//span[contains (text(), 'التسجيل والدخول')]/parent::a"), 40);
     Browser.waitUntilElementToBeClickable(By.xpath("//span[contains (text(), 'التسجيل والدخول')]/parent::a"), 40);
     Browser.click(By.xpath("//span[contains (text(), 'التسجيل والدخول')]/parent::a"));

        closeAllSakaniPopups();
        new LoginPage().changeLanguageForUser();
        new LoginPage().userLogin(username, password);
        new LoginPage().enterOTPForUser(OTP);
        new LoginPage().clickOnVerifyOTPButton();
        new LoginPage().clickOnCancelButtonOfPopup();
        new FullBookingJourneyPage().cancelTheExistingBookingProcess();
    }
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
