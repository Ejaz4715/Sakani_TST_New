package sa.nhc.web;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.FullBookingJourneyPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class RegisterOfInterest extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void TC_01_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter a project name then search for it");
        app.registerOfInterestPage.ProjectNameSearch(data.get("ProjectName"));
        logger.info("Step 06: Access The Searched Project and On the is bookable toggle");
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.clickOnIsBookableToggle();
        app.fullBookingJourneyPage.verifyIsBookableToggleIsOn();
        logger.info("Step 07: Save the Changes");
        app.registerOfInterestPage.saveChanges();
        logger.info("Step 08: Changes are saved successfully");
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Record saved successfully", "تم الحفظ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter a project name then search for it");
        app.registerOfInterestPage.ProjectNameSearch(data.get("ProjectName"));
        logger.info("Step 06: Access The Searched Project and On the is bookable toggle then save");
//        app.registerOfInterestPage.accessAndOnBookableToggle();
        logger.info("Step 07: Check that the Register Your Interest toggle is not appeared");
        app.registerOfInterestPage.registerYourInterestFalseExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter a project name then search for it");
        app.registerOfInterestPage.ProjectNameSearch(data.get("ProjectName"));
        logger.info("Step 06: Access The Searched Project and Off the is bookable toggle");
//        app.registerOfInterestPage.accessAndOffBookableToggle();
        logger.info("Step 07: Save the Changes");
        app.registerOfInterestPage.saveChanges();
        logger.info("Step 08: Changes are saved successfully");
        app.registerOfInterestPage.verifySaveChangesSuccessMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter a project name then search for it");
        app.registerOfInterestPage.ProjectNameSearch(data.get("ProjectName"));
        logger.info("Step 06: Access The Searched Project and Off the is bookable toggle");
//        app.registerOfInterestPage.accessAndOffBookableToggle();
        logger.info("Step 07: Check that the Register Your Interest toggle is appeared");
        app.registerOfInterestPage.registerYourInterestTrueExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter a project name then search for it");
        app.registerOfInterestPage.ProjectNameSearch(data.get("ProjectName"));
        logger.info("Step 06: Access The Searched Project and Off the is bookable toggle and On the Register Your interest");
//        app.registerOfInterestPage.accessAndOnRegisterYourInterest();
        logger.info("Step 07: Save the Changes");
        app.registerOfInterestPage.saveChanges();
        logger.info("Step 08: Changes are saved successfully");
        app.registerOfInterestPage.verifySaveChangesSuccessMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search for an inactive project and access it");
        app.registerOfInterestPage.accessAnInActiveProjectNameSearch();
        logger.info("Step 06: Off the is bookable toggle and Check the action is done");
        app.registerOfInterestPage.turnOffBookableToggleAndVerifyOffState();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search for an inactive project and access it");
        app.registerOfInterestPage.accessAnInActiveProjectNameSearch();
        logger.info("Step 06: Off the is bookable toggle");
        app.registerOfInterestPage.offBookableToggle();
        logger.info("Step 07: Check that the Register Your Interest toggle is not appeared");
        app.registerOfInterestPage.registerYourInterestFalseExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search for an inactive project and access it");
        app.registerOfInterestPage.accessAnInActiveProjectNameSearch();
        logger.info("Step 06: On the is bookable toggle and Check The Action Is Done");
        app.registerOfInterestPage.turnOnBookableToggleAndVerify();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Check the existence of the Register Your Interest Label");
        app.registerOfInterestPage.registerYourInterestLabelExistenceChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Check the existence of the Register Your Interest Label");
        app.registerOfInterestPage.registerYourInterestLabelExistenceChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Enter The inValid Email and submit");
        app.registerOfInterestPage.EnterTheInValidEmail(data.get("inValidEMail"));
        logger.info("Step 09: Verify the invalid Email message existence");
        app.registerOfInterestPage.verifyValidationMessageOfInvalidEmail();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Enter The inValid Email and submit");
        app.registerOfInterestPage.EnterTheInValidEmail(data.get("inValidEMail"));
        logger.info("Step 09: Verify the invalid Email message Content is matching");
        app.registerOfInterestPage.TheInValidEmailMSGContentChecker(data.get("inValidEMailValidationMSG"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Leave the Email Field Empty and try to submit");
        app.registerOfInterestPage.leaveTheEmailEmpty();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        logger.info("Step 03: Click on Filter");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Enter The inValid Email and submit");
        app.registerOfInterestPage.EnterTheInValidEmail(data.get("inValidEMail"));
        logger.info("Step 09: Checking that the user is unable to submit with invalid email");
        app.registerOfInterestPage.verifyUnsuccessfulRegistrationInvalidEmail();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Entering valid email and check if the user is able to submit");
        app.registerOfInterestPage.enterAnyValidEmailValidation(data.get("ValidEMail"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Enter The Email with spaces and try to submit");
        app.registerOfInterestPage.EnterEmailWithSpaces(data.get("EMailWithSpaces"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Enter The Email with Special Characters and try to submit");
        app.registerOfInterestPage.EnterEmailWithSpecialCharacters(data.get("EMailWithSpecialCharacters"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Entering valid email and submit");
        app.registerOfInterestPage.enterTheValidEmail(data.get("ValidEMail"));
        logger.info("Step 09: Check if that the user has a successful Submission");
        app.registerOfInterestPage.verifyValidationMessageOfSuccessRegistered();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Entering valid email and submit");
        app.registerOfInterestPage.enterTheValidEmail(data.get("ValidEMail"));
        logger.info("Step 09: Check if that the user is unable to register his interest twice for the same project");
        app.registerOfInterestPage.unableRegisteringTwice();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Entering valid email and submit");
        app.registerOfInterestPage.enterTheValidEmail(data.get("ValidEMail"));
        logger.info("Step 09: Check the validation MSG existence while the user trying to register his interest twice for the same project");
        app.registerOfInterestPage.ValidationMessageExistenceOfRegisteringTwice();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_Register_Of_Interest(Map<String, String> data) throws Exception {
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
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Entering valid email and submit");
        app.registerOfInterestPage.enterTheValidEmail(data.get("ValidEMail"));
        logger.info("Step 09: Check the validation MSG Content while the user trying to register his interest twice for the same project");
        app.registerOfInterestPage.RegisteringTwiceMSGContentChecker(data.get("TwiceRegsterationValidationMSG"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Accessing The MarketPlace");
        app.registerOfInterestPage.AccessWebsiteAndClickOnMarketPlaceAsAGuest();
        logger.info("Step 03: Click on Filter");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Login from the Button exist in the register your interest label");
        app.registerOfInterestPage.visitorLogin(data.get("Username"), data.get("Password"), data.get("OTP"));
        logger.info("Step 09: Check the existence of the Email Field");
        app.registerOfInterestPage.emailFieldExistenceChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Accessing The MarketPlace");
        app.registerOfInterestPage.AccessWebsiteAndClickOnMarketPlaceAsAGuest();
        logger.info("Step 03: Click on Filter");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Login from the Button exist in the register your interest label");
        app.registerOfInterestPage.visitorLogin(data.get("Username"), data.get("Password"), data.get("OTP"));
        logger.info("Step 09: Check the existence of the Submit Button");
        app.registerOfInterestPage.submitBTNExistenceChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Accessing The MarketPlace");
        app.registerOfInterestPage.AccessWebsiteAndClickOnMarketPlaceAsAGuest();
        logger.info("Step 03: Click on Filter");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Check the existence of the Register Your Interest Label");
        app.registerOfInterestPage.registerYourInterestLabelExistenceChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Accessing The MarketPlace");
        app.registerOfInterestPage.AccessWebsiteAndClickOnMarketPlaceAsAGuest();
        logger.info("Step 03: Click on Filter");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Check the existence of the Login BTN in Register Your Interest Label");
        app.registerOfInterestPage.LoginBTNExistenceChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_Register_Of_Interest(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Alert box login");
//app.loginPage.alertBoxLogin();
        logger.info("Step 02: Accessing The MarketPlace");
        app.registerOfInterestPage.AccessWebsiteAndClickOnMarketPlaceAsAGuest();
        logger.info("Step 03: Click on Filter");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProject(data.get("ProjectName"));
        logger.info("Step 05: Click on 'عرض النتائج'");
        app.homePage.ClickToShowResults();
        logger.info("Step 06: Click on 'المشروع الذي تم البحث عنه'");
        app.registerOfInterestPage.ResultProjectDiv();
        logger.info("Step 07: Click on 'قائمة الوحدات '");
        app.registerOfInterestPage.ListOfApartments();
        logger.info("Step 08: Click Login Button that exist in the register your interest label and Go back");
        app.registerOfInterestPage.visitorNotLogin();
        logger.info("Step 09: Check the existence of the Login BTN in Register Your Interest Label");
        app.registerOfInterestPage.LoginBTNExistenceChecker();
    }
}
