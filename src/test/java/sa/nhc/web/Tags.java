package sa.nhc.web;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class Tags extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void TC_01_Tags(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
       // app.loginPage.alertBoxLogin();
       app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Check the Existence of the labels");
        app.tagsPage.LabelExistenceChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Tags(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
       // app.loginPage.alertBoxLogin();
       app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on 'السوق العقاري'");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("AvailableForReservationProjectName"));
        logger.info("Step 05: Check the Existence of the Bookings Open label");
        app.tagsPage.BookingsOpenLabelChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_Tags(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
       // app.loginPage.alertBoxLogin();
       app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on 'السوق العقاري'");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("NumberOfAvailableLandsTagProjectName"));
        logger.info("Step 05: Check the Existence of the Number Of Available Lands Tag");
        app.tagsPage.NumberOfAvailableLandsLabel();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Tags(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
       // app.loginPage.alertBoxLogin();
       app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on 'السوق العقاري'");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("NumberOfAvailableUnitsTagProjectName"));
        logger.info("Step 05: Check the Existence of the Number Of Available Units Tag");
        app.tagsPage.NumberOfAvailableUnitsLabel();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Tags(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
       // app.loginPage.alertBoxLogin();
       app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Check the Existence of the labels");
        app.tagsPage.PromotedLabelsInFirst(data.get("ExpectedFirstLabelValueAR"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Tags(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
       // app.loginPage.alertBoxLogin();
       app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on 'السوق العقاري'");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("SoldOutTagProjectName"));
        logger.info("Step 05: Check the Existence of the Sold Out Label Existence");
        app.tagsPage.SoldOutLabelExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Tags(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
       // app.loginPage.alertBoxLogin();
       app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on 'السوق العقاري'");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("FullyBookedTagProjectName"));
        logger.info("Step 05: Check the Existence of the  Fully booked Label Existence");
        app.tagsPage.FullyBookedLabelExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Tags(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
       // app.loginPage.alertBoxLogin();
       app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Check the Existence of the  Promoted Label Existence");
        app.tagsPage.PromotedLabelExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Tags(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
       // app.loginPage.alertBoxLogin();
       app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on 'السوق العقاري'");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("RegisteringInterestTagProjectName"));
        logger.info("Step 05: Check the Existence of the  Registering Interest Label Existence");
        app.tagsPage.RegisteringInterestLabelExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Tags(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
       // app.loginPage.alertBoxLogin();
       app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on 'السوق العقاري'");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("WaitingListTagProjectName"));
        logger.info("Step 05: Check the Existence of the Waiting List Label Existence");
        app.tagsPage.WaitingListLabelExistence();
    }
}
