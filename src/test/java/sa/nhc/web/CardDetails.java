package sa.nhc.web;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.CardDetailsPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class CardDetails extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void TC_01_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on a card to show the project details");
        app.cardDetailsPage.ClickOnCard();
        logger.info("Step 04: Check that the project details page is displayed");
        app.cardDetailsPage.ProjectDetails();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the project Name is displayed on the projects cards Details Page");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.NameLabelCardDetailsPageExistence(), "Project Name");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the project address is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.AddressLabelCardDetailsPageExistence(), "Project Address");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the project Details is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.DetailsLabelCardDetailsPageExistence(), "Project Details");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the project Type is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.ProjectTypeLabelCardDetailsPageExistence(), "Project Type");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Target Audience is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.TargetAudienceLabelCardDetailsPageExistence(), "Target Audience");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Sakani Market Price from is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.MarketPriceFromLabelCardDetailsPageExistence(), "Market Price from");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Sakani Beneficiary price from is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.SakaniBeneficiaryFromLabelCardDetailsPageExistence(), "Sakani Beneficiary price from");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Tag is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.TagLabelCardDetailsPageExistence(), "Tag");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Number of Views is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.NumberOfViewsLabelCardDetailsPageExistence(), "Number of Views");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Eye of Number of Views is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.EyeOfNumberOfViewsLabelCardDetailsPageExistence(), "Eye of Number of Views");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Directions Button is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.DirectionsButtonCardDetailsPageExistence(), "Directions Button");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the icon of directions button is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.IconOfDirectionsButtonCardDetailsPageExistence(), "icon of directions button");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Share button is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.ShareButtonCardDetailsPageExistence(), "Share button");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Icon of the Share button is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.IconOfShareButtonCardDetailsPageExistence(), "Icon of the Share button");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Project Details is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.ProjectDetailsExistence(), "Project Details");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Unit list is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.UnitListExistence(), " Unit list ");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Offplan units in the project Details Content is displayed");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.OffplanUnitsExistence(), "Offplan units");
        logger.info("Step 08: Check that if the Project developer in the project Details Content is displayed");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.ProjectDeveloperExistence(), "Project developer");
        logger.info("Step 09: Check that if the MasterPlan in the project Details Content is displayed");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.ParticipatingBanksExistence(), "Participating banks");
        logger.info("Step 10: Check that if the Brochure & MasterPlan in the project Details Content is displayed");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.MasterplanExistence(), "Brochure & MasterPlan");
        logger.info("Step 11: Check that if the Facilities in the project Details Content is displayed");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.FacilitiesExistence(), "Facilities");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Check that if the Unit list Number is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.UnitListNumberExistence(), "Unit List Number");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on the Brochure view Button");
        app.cardDetailsPage.ClickOnTheBrochureViewButton();
        logger.info("Step 08: Check that if the Brochure View Button Opens the preview pop up");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.BrochurePreviewPopUpExistence(), "Brochure Preview Pop Up");
        logger.info("Step 09: Close the Brochure Preview Pop Up");
        app.cardDetailsPage.CloseTheBrochurePopUp();
        logger.info("Step 10: Click on the Brochure view Button");
        app.cardDetailsPage.ClickOnTheMasterPlanViewButton();
        logger.info("Step 11: Check that if the Master Plan View Button Opens the preview pop up");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.MasterPlanPreviewPopUpExistence(), "Master Plan Preview Pop Up");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Check that if the Uploaded Files in Land Projects are shown or not");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.UploadedFilesExistence(), "Uploaded Files in Land Projects");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Check that if the Number of the Uploaded Files in Land Projects are shown or not");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.NumberOfUploadedFilesExistence(), "Number of the Uploaded Files in Land Projects");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Click on the Brochure view Button");
        app.cardDetailsPage.ClickOnTheMedia();
        logger.info("Step 07: Check that if the media preview pop up is able to be viewed");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.MediaPreviewPopUpExistence(), "media Preview Pop Up");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Check that if the media is scrolling as expected or not");
        app.cardDetailsPage.mediaScrollChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Check that if the project Name is displayed on the projects cards Details Page");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.LandProjectNameExistence(), "Project Name");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Check that if the project Type is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.LandProjectTypeExistence(), "Project Type");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Check that if the project address is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.LandProjectAddressExistence(), "Project Address");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Check that if the Land Project Price is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.LandProjectPriceExistence(), "Land Project Price");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Check that if the project Details is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.LandProjectDetailsExistence(), "Project Details");
        logger.info("Step 07: Check that if the Plot List is displayed on the projects cards");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.LandProjectPlotListExistence(), "Plot List");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Click on The Project Details");
        app.cardDetailsPage.ClickOnTheLandProjectDetails();
        logger.info("Step 07: Check that if the Availability in the project Details Content is displayed");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.AvailabilityExistence(), "Availability");
        logger.info("Step 08: Check that if the Brochure in the project Details Content is displayed");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.BrochureExistence(), "Brochure");
        logger.info("Step 09: Check that if the MasterPlan in the project Details Content is displayed");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.MasterplanExistence(), "MasterPlan");
        logger.info("Step 10: Check that if the Facilities in the project Details Content is displayed");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.FacilitiesExistence(), "Facilities");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_31_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Click on The Project Details");
        app.cardDetailsPage.ClickOnTheLandProjectDetails();
        logger.info("Step 07: Click on The Brochure and MasterPlan View Button");
        app.cardDetailsPage.ClickOnBrochureAndMasterPlanViewButton();
        logger.info("Step 08: Check that if the Brochure and MasterPlan View Button Opens the preview pop up");
        app.cardDetailsPage.LabelCardDetailsPageExistenceChecker(CardDetailsPageObjects.BrochureAndMasterPlanPreviewPopUpExistence(), "Brochure And MasterPlan Preview Pop Up");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Click on The Project Details");
        app.cardDetailsPage.ClickOnTheLandProjectDetails();
        logger.info("Step 07: Check that if the Facilities numbers in the project Details Content are displayed");
        app.cardDetailsPage.LabelExistenceChecker_List(CardDetailsPageObjects.FacilitiesNumberExistence(), "Facilities numbers");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_Cards_Details(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
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
        app.homePage.SearchForAProjectWithEnter(data.get("LandProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Check that if the Plot List number in the project Details Content is displayed");
        app.cardDetailsPage.LabelExistenceChecker_List(CardDetailsPageObjects.PlotListNumberExistence(), "Plot List number");
    }
}
