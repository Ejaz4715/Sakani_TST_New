package sa.nhc.web;

import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.EligibilityPageObject;
import sa.nhc.web.objects.MOHLandBookingJourneyPageObjects;
import sa.nhc.web.objects.exisitng.BookingPageObjects;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class MOHLandBookingJourney extends NHCWebTest {

    /**
     * Prerequisite user login / The user check the eligibility / No booked project
     * The user book MOH land
     * TC_01 to TC_16
     */

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_01(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Verify the \"تصفية النتائج\" popup window will display");
        app.mohLandBookingJourneyPage.verifyFilterResultPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_02(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 05: Verify the enter text will display");
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Name"), MOHLandBookingJourneyPageObjects.projectInputFiled());
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_03(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on clear button");
        app.mohLandBookingJourneyPage.clickOnClearButton();
        logger.info("Step 06: Verify the searched result will removed");
        CommonUtilityPage.verifyValueIsNotEntered(data.get("Project_Name"), MOHLandBookingJourneyPageObjects.projectInputFiled());
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_04(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Verify the searched project will display");
        CommonUtilityPage.verifyValueIsDisplayed(data.get("Project_Name"),BookingPageObjects.projectTitle());
//        app.mohLandBookingJourneyPage.verifyTheSearchProjectIsDisplayed(data.get("Project_Name"));
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_05(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Verify the user navigate to searched project details");
        app.mohLandBookingJourneyPage.verifyTheSearchedProjectDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_06(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on the project details");
        app.mohLandBookingJourneyPage.clickOnTheProjectDetailsTabButton();
        logger.info("Step 08: Verify the\"تفاصيل المشروع\" will display");
        app.mohLandBookingJourneyPage.verifyTheProjectDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_07(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on start booking button");
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Verify the \"الوحدات المتاحة\" will display");
        app.mohLandBookingJourneyPage.verifyTheAvailableUnitsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_08(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on start booking button");
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Select available unit");
        app.mohLandBookingJourneyPage.selectAvailableUnit();
        logger.info("Step 09: Verify the user navigate to searched unit details");
        app.mohLandBookingJourneyPage.verifyTheUnitDetailsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_09(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.cancelBookingButton())) {
            Browser.click(MOHLandBookingJourneyPageObjects.cancelBookingButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.confirmCancellationButton(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.confirmCancellationButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup());
        }
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on start booking button");
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Select available unit");
        app.mohLandBookingJourneyPage.selectAvailableUnit();
        logger.info("Step 09: Click on reserve plot button");
        app.mohLandBookingJourneyPage.clickOnReservePlotButton();
        logger.info("Step 10: Verify the user navigate to \"الشروط و الأحكام\" page");
        app.mohLandBookingJourneyPage.verifyTermsAndConditionsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_10(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.cancelBookingButton())) {
            Browser.click(MOHLandBookingJourneyPageObjects.cancelBookingButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.confirmCancellationButton(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.confirmCancellationButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup());
        }
        app.mohLandBookingJourneyPage.cancelTheLand(data.get("Cancel_Reason"));
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on start booking button");
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Select available unit");
        app.mohLandBookingJourneyPage.selectAvailableUnit();
        logger.info("Step 09: Click on reserve plot button");
        app.mohLandBookingJourneyPage.clickOnReservePlotButton();
        logger.info("Step 10: Verify the \"قبول وتوقيع\" button is not clickable/disabled");
        app.mohLandBookingJourneyPage.verifyAcceptAndSignButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_11(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.cancelBookingButton())) {
            Browser.click(MOHLandBookingJourneyPageObjects.cancelBookingButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.confirmCancellationButton(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.confirmCancellationButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup());
        }
        app.mohLandBookingJourneyPage.cancelTheLand(data.get("Cancel_Reason"));
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on start booking button");
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Select available unit");
        app.mohLandBookingJourneyPage.selectAvailableUnit();
        logger.info("Step 09: Click on reserve plot button");
        app.mohLandBookingJourneyPage.clickOnReservePlotButton();
        logger.info("Step 10: Click on download land contract button");
        app.mohLandBookingJourneyPage.clickOnDownloadLandContractButton();
        logger.info("Step 11: Verify the \"عقد الأرض\" is downloaded");
        CommonUtilityPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_12(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.cancelBookingButton())) {
            Browser.click(MOHLandBookingJourneyPageObjects.cancelBookingButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.confirmCancellationButton(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.confirmCancellationButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup());
        }
        app.mohLandBookingJourneyPage.cancelTheLand(data.get("Cancel_Reason"));
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on start booking button");
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Select available unit");
        app.mohLandBookingJourneyPage.selectAvailableUnit();
        logger.info("Step 09: Click on reserve plot button");
        app.mohLandBookingJourneyPage.clickOnReservePlotButton();
        logger.info("Step 10: Click on terms and conditions checkbox");
        app.mohLandBookingJourneyPage.clickOnTermsAndConditionsCheckbox();
        logger.info("Step 11: Verify the \"قبول وتوقيع\" button is clickable/enabled");
        app.mohLandBookingJourneyPage.verifyAcceptAndSignButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_13(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.cancelBookingButton())) {
            Browser.click(MOHLandBookingJourneyPageObjects.cancelBookingButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.confirmCancellationButton(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.confirmCancellationButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup());
        }
        app.mohLandBookingJourneyPage.cancelTheLand(data.get("Cancel_Reason"));
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on start booking button");
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Select available unit");
        app.mohLandBookingJourneyPage.selectAvailableUnit();
        logger.info("Step 09: Click on reserve plot button");
        app.mohLandBookingJourneyPage.clickOnReservePlotButton();
        logger.info("Step 10: Click on terms and conditions checkbox");
        app.mohLandBookingJourneyPage.clickOnTermsAndConditionsCheckbox();
        logger.info("Step 11: Click on accept and sign button");
        app.mohLandBookingJourneyPage.clickOnAcceptAndSignButton();
        logger.info("Step 12: Verify the \"رمز التحقق\" popup window will display");
        app.mohLandBookingJourneyPage.verifyOtpPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_14(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.cancelBookingButton())) {
            Browser.click(MOHLandBookingJourneyPageObjects.cancelBookingButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.confirmCancellationButton(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.confirmCancellationButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup(), 50);
            Browser.click(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup());
        }
        app.mohLandBookingJourneyPage.cancelTheLand(data.get("Cancel_Reason"));
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on start booking button");
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Select available unit");
        app.mohLandBookingJourneyPage.selectAvailableUnit();
        logger.info("Step 09: Click on reserve plot button");
        app.mohLandBookingJourneyPage.getPlotCode();
        app.mohLandBookingJourneyPage.clickOnReservePlotButton();
        logger.info("Step 10: Click on terms and conditions checkbox");
        app.mohLandBookingJourneyPage.clickOnTermsAndConditionsCheckbox();
        logger.info("Step 11: Click on accept and sign button");
        app.mohLandBookingJourneyPage.clickOnAcceptAndSignButton();
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        logger.info("Step 12: Verify the user navigate to \"تهانينا!\" page");
        app.mohLandBookingJourneyPage.verifyBookingLandCompletePageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_15(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify the user navigate to \"تفاصيل الحجز\" page");
        app.mohLandBookingJourneyPage.verifyBookingDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_16(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify the user able to view:\"عقد البيع\" - \"تنزيل الملحق\" - \"القرار المساحي\"");
        app.mohLandBookingJourneyPage.verifyTheViewIconButtonsAreClickable();
    }

    /**
     * Prerequisite user login / The user check the eligibility / booked project
     * The user cancel MOH land
     * TC_17 to TC_27
     */

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_17(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        logger.info("Step 08: Verify the user navigate to \"إلغاء العقد\" page");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        app.mohLandBookingJourneyPage.verifyCancelTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_18(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        logger.info("Step 08: Click on save and continue button");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 09: Verify the validation message \"الحقل مطلوب\" displays");
        CommonUtilityPage.verifyValueIsDisplayed("الحقل مطلوب", "This field is required", EligibilityPageObject.requiredFieldValidationMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_19(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        logger.info("Step 08: Click on cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 09: Verify the user navigate back to \"تفاصيل الحجز\" page");
        app.mohLandBookingJourneyPage.verifyBookingDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_20(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        logger.info("Step 08: Select reason for cancellation");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        app.eligibilityPage.selectFromTheLists(data.get("Cancel_Reason_Dropdown_AR"), data.get("Cancel_Reason_Dropdown_EN"), MOHLandBookingJourneyPageObjects.cancelReasonDropdownList());
        if (Browser.isElementPresent(BookingPageObjects.cancellationReasonInput())) {
            app.mohLandBookingJourneyPage.enterCancelReasonTextarea(data.get("Cancel_Reason"));
        }
        logger.info("Step 09: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 10: Verify the\"يرجى قراءة إخلاء المسؤولية وتنزيله للرجوع إليه في المستقبل.\" will display");
        app.mohLandBookingJourneyPage.verifyCancelLandDisclaimerPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_21(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        logger.info("Step 08: Select reason for cancellation");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        app.eligibilityPage.selectFromTheLists(data.get("Cancel_Reason_Dropdown_AR"), data.get("Cancel_Reason_Dropdown_EN"), MOHLandBookingJourneyPageObjects.cancelReasonDropdownList());
        if (Browser.isElementPresent(BookingPageObjects.cancellationReasonInput())) {
            app.mohLandBookingJourneyPage.enterCancelReasonTextarea(data.get("Cancel_Reason"));
        }
        logger.info("Step 09: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 10: Verify the \"الاستمرار\" button is not clickable/disabled");
        app.mohLandBookingJourneyPage.verifyProcessButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_22(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        logger.info("Step 08: Select reason for cancellation");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        app.eligibilityPage.selectFromTheLists(data.get("Cancel_Reason_Dropdown_AR"), data.get("Cancel_Reason_Dropdown_EN"), MOHLandBookingJourneyPageObjects.cancelReasonDropdownList());
        if (Browser.isElementPresent(BookingPageObjects.cancellationReasonInput())) {
            app.mohLandBookingJourneyPage.enterCancelReasonTextarea(data.get("Cancel_Reason"));
        }
        logger.info("Step 09: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 10: Click on cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 11: Verify the user navigate back to \"تفاصيل الحجز\" page");
        app.mohLandBookingJourneyPage.verifyBookingDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_23(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        logger.info("Step 08: Select reason for cancellation");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        app.eligibilityPage.selectFromTheLists(data.get("Cancel_Reason_Dropdown_AR"), data.get("Cancel_Reason_Dropdown_EN"), MOHLandBookingJourneyPageObjects.cancelReasonDropdownList());
        if (Browser.isElementPresent(BookingPageObjects.cancellationReasonInput())) {
            app.mohLandBookingJourneyPage.enterCancelReasonTextarea(data.get("Cancel_Reason"));
        }
        logger.info("Step 09: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 10: Click on disclaimer checkbox");
        app.mohLandBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 11: Verify the \"الاستمرار\" button is clickable/enabled");
        app.mohLandBookingJourneyPage.verifyProcessButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_24(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        logger.info("Step 08: Select reason for cancellation");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        app.eligibilityPage.selectFromTheLists(data.get("Cancel_Reason_Dropdown_AR"), data.get("Cancel_Reason_Dropdown_EN"), MOHLandBookingJourneyPageObjects.cancelReasonDropdownList());
        if (Browser.isElementPresent(BookingPageObjects.cancellationReasonInput())) {
            app.mohLandBookingJourneyPage.enterCancelReasonTextarea(data.get("Cancel_Reason"));
        }
        logger.info("Step 09: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 10: Click on disclaimer checkbox");
        app.mohLandBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 11: Click on process button");
        app.mohLandBookingJourneyPage.clickOnProcessButton();
        logger.info("Step 12: Verify the user navigate to \"رمز التحقق\" step");
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.UserOTP(), 40);
        Browser.executeJSScroll(-500);
        app.mohLandBookingJourneyPage.verifyOtpPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_25(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        logger.info("Step 08: Select reason for cancellation");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        app.eligibilityPage.selectFromTheLists(data.get("Cancel_Reason_Dropdown_AR"), data.get("Cancel_Reason_Dropdown_EN"), MOHLandBookingJourneyPageObjects.cancelReasonDropdownList());
        if (Browser.isElementPresent(BookingPageObjects.cancellationReasonInput())) {
            app.mohLandBookingJourneyPage.enterCancelReasonTextarea(data.get("Cancel_Reason"));
        }
        logger.info("Step 09: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 10: Click on disclaimer checkbox");
        app.mohLandBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 11: Click on process button");
        app.mohLandBookingJourneyPage.clickOnProcessButton();
        logger.info("Step 12: Click on cancel button");
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.UserOTP(), 40);
        Browser.executeJSScroll(-500);
        app.objectionPage.clickCancelButton();
        logger.info("Step 13: Verify the user navigate back to \"تفاصيل الحجز\" page");
        app.mohLandBookingJourneyPage.verifyBookingDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_26(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        logger.info("Step 08: Select reason for cancellation");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        app.eligibilityPage.selectFromTheLists(data.get("Cancel_Reason_Dropdown_AR"), data.get("Cancel_Reason_Dropdown_EN"), MOHLandBookingJourneyPageObjects.cancelReasonDropdownList());
        if (Browser.isElementPresent(BookingPageObjects.cancellationReasonInput())) {
            app.mohLandBookingJourneyPage.enterCancelReasonTextarea(data.get("Cancel_Reason"));
        }
        logger.info("Step 09: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 10: Click on disclaimer checkbox");
        app.mohLandBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 11: Click on process button");
        app.mohLandBookingJourneyPage.clickOnProcessButton();
        logger.info("Step 12: Enter OTP");
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.UserOTP(), 40);
        Browser.executeJSScroll(-500);
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.mohLandBookingJourneyPage.clickOnVerifyOTPButton();
        logger.info("Step 13: Verify the user navigate to \"تم الإلغاء بنجاح!\" page");
        app.mohLandBookingJourneyPage.verifyCancelLandCompletePageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_27(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify the request \"طلب الإلغاء الخاص بك قيد المراجعة.\"");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.bookingDetailsPage(), 40);
        Browser.executeJSScroll(800);
        Browser.waitForSeconds(2);
        CommonUtilityPage.verifyValueIsDisplayed("طلب الإلغاء الخاص بك قيد المراجعة.", "Your cancellation request is under review.", MOHLandBookingJourneyPageObjects.requestUnderReview());
    }

    /**
     * Prerequisite the user cancel the book
     * The admin reject the cancellation request
     * TC_28 to TC_38
     */

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_28(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Verify admin is able to view \"الحجوزات\"page");
        app.mohLandBookingJourneyPage.verifyBookingsAdminPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_29(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Verify the \"البحث عن طريق\" dropdown list is visible");
        app.mohLandBookingJourneyPage.verifySearchBookingByDropdownListIsVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_30(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Verify the \"بحث\" button is not clickable/disabled");
        app.mohLandBookingJourneyPage.verifySearchButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_31(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        logger.info("Step 07: Enter search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Search_Value"));
        logger.info("Step 08: Verify the admin able to enter text \"أدخل قيمة البحث\"");
        CommonUtilityPage.verifyValueIsEntered(data.get("Search_Value"), MOHLandBookingJourneyPageObjects.searchValueInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_32(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        logger.info("Step 07: Enter invalid search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Invalid_Search_Value"));
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        logger.info("Step 08: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 09: Verify the admin able to enter text \"أدخل قيمة البحث\"");
        CommonUtilityPage.verifyValueIsDisplayed("لايوجد نتيجه", "No data to display", MOHLandBookingJourneyPageObjects.InvalidSearchValueResult());
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_33(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        app.eligibilityPage.selectFromTheLists(data.get("Status_AR"), data.get("Status_EN"), MOHLandBookingJourneyPageObjects.statusDropdownList());
        logger.info("Step 07: Enter search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Search_Value"));
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        logger.info("Step 08: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 09: Verify the search result will display");
        app.mohLandBookingJourneyPage.verifyTheSearchValueResultIsDisplayed(data);
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_34(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        app.eligibilityPage.selectFromTheLists(data.get("Status_AR"), data.get("Status_EN"), MOHLandBookingJourneyPageObjects.statusDropdownList());
        logger.info("Step 07: Enter search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Search_Value"));
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        logger.info("Step 08: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 09: Click on search value result");
        app.mohLandBookingJourneyPage.clickOnSearchValueResult(data);
        logger.info("Step 10: Click on request result dropdown button");
        app.mohLandBookingJourneyPage.clickOnRequestCancelDropdownButton();
        logger.info("Step 11: Verify the admin able to view the \"طلب إلغاء\" details");
        app.mohLandBookingJourneyPage.verifyTheRequestCancelDetailsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_35(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        app.eligibilityPage.selectFromTheLists(data.get("Status_AR"), data.get("Status_EN"), MOHLandBookingJourneyPageObjects.statusDropdownList());
        logger.info("Step 07: Enter search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Search_Value"));
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        logger.info("Step 08: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 09: Click on search value result");
        app.mohLandBookingJourneyPage.clickOnSearchValueResult(data);
        logger.info("Step 10: Click on request result dropdown button");
        app.mohLandBookingJourneyPage.clickOnRequestCancelDropdownButton();
        logger.info("Step 11: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 12: Verify a \"رفض إلغاءالحجز\" popup window will display");
        app.mohLandBookingJourneyPage.verifyTheRejectCancelBookingPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_36(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        app.eligibilityPage.selectFromTheLists(data.get("Status_AR"), data.get("Status_EN"), MOHLandBookingJourneyPageObjects.statusDropdownList());
        logger.info("Step 07: Enter search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Search_Value"));
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        logger.info("Step 08: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 09: Click on search value result");
        app.mohLandBookingJourneyPage.clickOnSearchValueResult(data);
        logger.info("Step 10: Click on request result dropdown button");
        app.mohLandBookingJourneyPage.clickOnRequestCancelDropdownButton();
        logger.info("Step 11: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 12: Click on cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 13: Verify the admin remains in the same page");
        app.mohLandBookingJourneyPage.verifyTheRequestCancelDetailsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_37(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        app.eligibilityPage.selectFromTheLists(data.get("Status_AR"), data.get("Status_EN"), MOHLandBookingJourneyPageObjects.statusDropdownList());
        logger.info("Step 07: Enter search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Search_Value"));
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        logger.info("Step 08: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 09: Click on search value result");
        app.mohLandBookingJourneyPage.clickOnSearchValueResult(data);
        logger.info("Step 10: Click on request result dropdown button");
        app.mohLandBookingJourneyPage.clickOnRequestCancelDropdownButton();
        logger.info("Step 11: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 12: Enter reject cancel booking reason");
        app.mohLandBookingJourneyPage.enterRejectCancelBookingTextarea(data.get("Cancel_Reason"));
        logger.info("Step 13: Verify the text is entered");
        CommonUtilityPage.verifyValueIsEntered(data.get("Cancel_Reason"), MOHLandBookingJourneyPageObjects.rejectCancelBookingTextarea());
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_38(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        app.eligibilityPage.selectFromTheLists(data.get("Status_AR"), data.get("Status_EN"), MOHLandBookingJourneyPageObjects.statusDropdownList());
        logger.info("Step 07: Enter search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Search_Value"));
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        logger.info("Step 08: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 09: Click on search value result");
        app.mohLandBookingJourneyPage.clickOnSearchValueResult(data);
        logger.info("Step 10: Click on request result dropdown button");
        app.mohLandBookingJourneyPage.clickOnRequestCancelDropdownButton();
        logger.info("Step 11: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 12: Enter reject cancel booking reason");
        app.mohLandBookingJourneyPage.enterRejectCancelBookingTextarea(data.get("Cancel_Reason"));
        logger.info("Step 13: Click confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 14: Verify the status will change to \"مرفوض\"");
        Browser.waitForSeconds(2);
        CommonUtilityPage.verifyValueIsDisplayed("مرفوض", "Rejected", MOHLandBookingJourneyPageObjects.cancellationStatus());
    }

    /**
     * Prerequisite the user cancel the book
     * The admin approve the cancellation request
     * TC_39 to TC_43
     */
    @Test(dataProvider = "testDataProvider")
    public void CancelBooking(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on cancel booking button");
        app.mohLandBookingJourneyPage.clickOnCancelBookingFromProfileButton();
        logger.info("Step 08: Select reason for cancellation");
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.executeJSScroll(-500);
        app.eligibilityPage.selectFromTheLists(data.get("Cancel_Reason_Dropdown_AR"), data.get("Cancel_Reason_Dropdown_EN"), MOHLandBookingJourneyPageObjects.cancelReasonDropdownList());
        if (Browser.isElementPresent(BookingPageObjects.cancellationReasonInput())) {
            app.mohLandBookingJourneyPage.enterCancelReasonTextarea(data.get("Cancel_Reason"));
        }
        logger.info("Step 09: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 10: Click on disclaimer checkbox");
        app.mohLandBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 11: Click on process button");
        app.mohLandBookingJourneyPage.clickOnProcessButton();
        logger.info("Step 12: Enter OTP");
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.UserOTP(), 40);
        Browser.executeJSScroll(-500);
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.mohLandBookingJourneyPage.clickOnVerifyOTPButton();
        logger.info("Step 13: Verify the user navigate to \"تم الإلغاء بنجاح!\" page");
        app.mohLandBookingJourneyPage.verifyCancelLandCompletePageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_39(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        app.eligibilityPage.selectFromTheLists(data.get("Status_AR"), data.get("Status_EN"), MOHLandBookingJourneyPageObjects.statusDropdownList());
        logger.info("Step 07: Enter search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Search_Value"));
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        logger.info("Step 08: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 09: Click on search value result");
        app.mohLandBookingJourneyPage.clickOnSearchValueResult(data);
        logger.info("Step 10: Click on request result dropdown button");
        app.mohLandBookingJourneyPage.clickOnRequestCancelDropdownButton();
        logger.info("Step 11: Click on approve button");
        app.mohLandBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 12: Verify a \"إلغاء الحجز\" popup window will display with message \"هل أنت متأكد؟\" ");
        app.mohLandBookingJourneyPage.verifyTheRejectCancelBookingPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_40(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        app.eligibilityPage.selectFromTheLists(data.get("Status_AR"), data.get("Status_EN"), MOHLandBookingJourneyPageObjects.statusDropdownList());
        logger.info("Step 07: Enter search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Search_Value"));
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        logger.info("Step 08: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 09: Click on search value result");
        app.mohLandBookingJourneyPage.clickOnSearchValueResult(data);
        logger.info("Step 10: Click on request result dropdown button");
        app.mohLandBookingJourneyPage.clickOnRequestCancelDropdownButton();
        logger.info("Step 11: Click on approve button");
        app.mohLandBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 12: Click on cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 13: Verify the admin remains in the same page");
        app.mohLandBookingJourneyPage.verifyTheRequestCancelDetailsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_41(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
//        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Hover to the main menu");
        app.objectionPage.hoverToMainMenu();
        logger.info("Step 04: Click on beneficiaries side menu button");
        app.mohLandBookingJourneyPage.clickOnBeneficiariesSidMenuButton();
        logger.info("Step 05: Click on bookings side menu button");
        app.mohLandBookingJourneyPage.clickOnBookingsSidMenuButton();
        logger.info("Step 06: Select search booking by dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Search_Booking_By_AR"), data.get("Search_Booking_By_EN"), MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        app.eligibilityPage.selectFromTheLists(data.get("Status_AR"), data.get("Status_EN"), MOHLandBookingJourneyPageObjects.statusDropdownList());
        logger.info("Step 07: Enter search value input field");
        app.mohLandBookingJourneyPage.enterSearchValueInputField(data.get("Search_Value"));
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        logger.info("Step 08: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 09: Click on search value result");
        app.mohLandBookingJourneyPage.clickOnSearchValueResult(data);
        logger.info("Step 10: Click on request result dropdown button");
        app.mohLandBookingJourneyPage.clickOnRequestCancelDropdownButton();
        logger.info("Step 11: Click on approve button");
        app.mohLandBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 12: Click confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 13: Verify the status will change to \"مقبول\"");
        Browser.waitForSeconds(5);
        CommonUtilityPage.verifyValueIsDisplayed("مقبول", "Approved", MOHLandBookingJourneyPageObjects.cancellationStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_42(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on cancelled nav button");
        app.mohLandBookingJourneyPage.clickOnCancelledNavButton();
        logger.info("Step 07: Verify the cancelled bookings list will display");
        app.mohLandBookingJourneyPage.verifyTheCancelledBookingsListIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void MOH_Land_Booking_Journey_TC_43(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
//        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on my activities button");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on bookings button");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on cancelled nav button");
        app.mohLandBookingJourneyPage.clickOnCancelledNavButton();
        logger.info("Step 07: Click on view cancelled booking button");
        app.mohLandBookingJourneyPage.clickOnViewCancelledBookingButton(data);
        logger.info("Step 08: Verify a \"تم إلغاء هذا الحجز\" message will display is \"الإجراءات والمستندات\" section");
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        Browser.executeJSScroll(500);
        Browser.waitForSeconds(2);
        CommonUtilityPage.verifyValueIsDisplayed("تم إلغاء هذا الحجز", "This booking has been cancelled", MOHLandBookingJourneyPageObjects.cancelledMessage());

    }
}
