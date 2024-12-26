package sa.nhc.web;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.FullBookingJourneyPageObjects;
import sa.nhc.web.objects.PriceQuotationPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class PriceQuotation extends NHCWebTest {
    @Test(dataProvider = "testDataProvider")
    public void TC_01_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on 'السوق العقاري'");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("ProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Click on The Unit List Button");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 07: Click On Start Booking");
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Click On Any Apartment to book");
        app.priceQuotationPage.ClickOnApartment();
        logger.info("Step 09: Check for the Low Power warning MSG Existence");
        app.priceQuotationPage.priceExceedsFinancialWarningMSGExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Click on 'السوق العقاري'");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("ProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Click on The Unit List Button");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 07: Click On Start Booking");
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Click On Any Apartment to book");
        app.priceQuotationPage.ClickOnApartment();
        logger.info("Step 09: Check for the Update Financial Advisory Link Existence");
        app.priceQuotationPage.UpdateFinancialAdvisoryLinkExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on 'السوق العقاري'");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("ProjectName"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Click on The Unit List Button");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 07: Click On Start Booking");
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Click On Any Apartment to book");
        app.priceQuotationPage.ClickOnApartment();
        logger.info("Step 09: Check that the user is able to click on the financial advisory link");
        app.priceQuotationPage.clickOnFinancialAdvisoryLink();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on 'السوق العقاري'");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("ProjectName1-3"));
        logger.info("Step 05: Click on 'المشروع الذي تم البحث عنه'");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Click on The Unit List Button");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 07: Click On Start Booking");
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.mohLandBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Click On Any Apartment to book");
        app.priceQuotationPage.ClickOnApartment();
        logger.info("Step 09: Check for the Low Power warning MSG Existence");
        app.priceQuotationPage.LowPowerWarningMSGExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form and login");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on Filters ");
        CommonUtilityPage.ClickOnFilter();
        logger.info("Step 04: Click on 'وحدة او مشروع للبحث' and Search for a Specific Project");
        app.homePage.SearchForAProjectWithEnter(data.get("ProjectName1-3"));
        logger.info("Step 05: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 06: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 07: Click Start Booking button ");
        app.fullBookingJourneyPage.clickOnStartBookingButton();
        logger.info("Step 08: Click on unit from available displayed units ");
        app.priceQuotationPage.ClickOnApartment();
        logger.info("Step 09: Click on Book unit button");
        app.fullBookingJourneyPage.clickOnBookUnitButton();
        logger.info("Step 10: Click Terms and conditions checkbox");
        app.fullBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 11: Click on Continue button");
        app.fullBookingJourneyPage.clickOnContinueButton();
        logger.info("Step 12: Click on Continue button");
        app.priceQuotationPage.ClickOnContinueButton();
        logger.info("Step 13: Click on Confirm Booking button");
        app.priceQuotationPage.ClickOnConfirmBooking();
        logger.info("Step 14: Close Rating Pop-UP");
        app.priceQuotationPage.cLoseRatingPopUp();
        logger.info("Step 15: Verify that the booking is done successfully");
        app.priceQuotationPage.verifySuccessMessageForUnitBooking();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Click on My Activities");
        app.priceQuotationPage.ClickOnMyActivities();
        logger.info("Step 05: Click on Bookings");
        app.priceQuotationPage.ClickOnBookings();
        logger.info("Step 06: Click on View Booking");
        app.priceQuotationPage.ClickOnViewBookings();
        logger.info("Step 07: Click on Cancel for the Sign Contract Pop UP");
        app.priceQuotationPage.ClickOnCancelForSignContract();
        logger.info("Step 08: Verify that the Price Quotation is displayed");
        app.priceQuotationPage.ExistenceChecker(PriceQuotationPageObjects.PriceQuotationLabel(), "Price Quotation Label");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Click on My Activities");
        app.priceQuotationPage.ClickOnMyActivities();
        logger.info("Step 05: Click on Bookings");
        app.priceQuotationPage.ClickOnBookings();
        logger.info("Step 06: Click on View Booking");
        app.priceQuotationPage.ClickOnViewBookings();
        logger.info("Step 07: Click on Cancel for the Sign Contract Pop UP");
        app.priceQuotationPage.ClickOnCancelForSignContract();
        logger.info("Step 08: Verify that the price quotation view button is disabled");
        app.priceQuotationPage.PriceQuotationViewBTNisDisabledChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        app.fullBookingJourneyPage.clickOnCancelButtonOnPopup();
        logger.info("Step 07: Click on Sign Contract Button");
        app.fullBookingJourneyPage.clickOnSignContractButton();
        logger.info("Step 08: Click on Approve Button");
        app.priceQuotationPage.ClickOnApproveContract();
        logger.info("Step 09: Input OTP ");
        app.loginPage.enterOTPForUser(data.get("OTP"));
        logger.info("Step 10: Click on verify OTP ");
        app.fullBookingJourneyPage.clickOnVerifyOTPButton();
        CommonUtilityPage.verifyValueIsDisplayed("تهانينا", "Congratulations", FullBookingJourneyPageObjects.SignSaleContractSuccessMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Click on My Activities");
        app.priceQuotationPage.ClickOnMyActivities();
        logger.info("Step 05: Click on Bookings");
        app.priceQuotationPage.ClickOnBookings();
        logger.info("Step 06: Click on View Booking");
        app.priceQuotationPage.ClickOnViewBookings();
        logger.info("Step 07: Verify that the price quotation view button is Enabled");
        app.priceQuotationPage.PriceQuotationViewBTNisEnabledChecker();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Click on My Activities");
        app.priceQuotationPage.ClickOnMyActivities();
        logger.info("Step 05: Click on Bookings");
        app.priceQuotationPage.ClickOnBookings();
        logger.info("Step 06: Click on View Booking");
        app.priceQuotationPage.ClickOnViewBookings();
        logger.info("Step 07: Click On Quotation Price View BTN");
        app.priceQuotationPage.ClickOnQuotationPriceViewBTN();
        logger.info("Step 08: Verify that the price quotation pop up is displayed");
        app.priceQuotationPage.ExistenceChecker(PriceQuotationPageObjects.ContractPopUp(), "Price Quotation Pop up");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Click on My Activities");
        app.priceQuotationPage.ClickOnMyActivities();
        logger.info("Step 05: Click on Bookings");
        app.priceQuotationPage.ClickOnBookings();
        logger.info("Step 06: Click on View Booking");
        app.priceQuotationPage.ClickOnViewBookings();
        logger.info("Step 07: Click On Quotation Price View BTN");
        app.priceQuotationPage.ClickOnQuotationPriceViewBTN();
        logger.info("Step 08: Download The Document");
        app.priceQuotationPage.DocumentDownload();
        logger.info("Step 09: Verify that the Document is downloaded successfully");
        app.priceQuotationPage.isDocumentDownloaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Verify that the Eligible and non eligible user type is exist");
        app.priceQuotationPage.VerifyUserTypeExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Verify that the user is eligible");
        app.priceQuotationPage.VerifyUserEligibleExistence();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Click on My Activities");
        app.priceQuotationPage.ClickOnMyActivities();
        logger.info("Step 05: Click on Bookings");
        app.priceQuotationPage.ClickOnBookings();
        logger.info("Step 06: Click on View Booking");
        app.priceQuotationPage.ClickOnViewBookings();
        logger.info("Step 07: Click On Quotation Price View BTN");
        app.priceQuotationPage.ClickOnQuotationPriceViewBTN();
        logger.info("Step 08: Verify that the Developer Name is exist in the document");
        app.priceQuotationPage.readTheDownloadedFileAndVerifyDeveloperNameExistence(data);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Click on My Activities");
        app.priceQuotationPage.ClickOnMyActivities();
        logger.info("Step 05: Click on Bookings");
        app.priceQuotationPage.ClickOnBookings();
        logger.info("Step 06: Click on View Booking");
        app.priceQuotationPage.ClickOnViewBookings();
        logger.info("Step 07: Click On Quotation Price View BTN");
        app.priceQuotationPage.ClickOnQuotationPriceViewBTN();
        logger.info("Step 08: Verify that the Unit Code is exist in the document");
        app.priceQuotationPage.readTheDownloadedFileAndVerifyUnitCodeExistence(data);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Click on My Activities");
        app.priceQuotationPage.ClickOnMyActivities();
        logger.info("Step 05: Click on Bookings");
        app.priceQuotationPage.ClickOnBookings();
        logger.info("Step 06: Click on View Booking");
        app.priceQuotationPage.ClickOnViewBookings();
        logger.info("Step 07: Click On Quotation Price View BTN");
        app.priceQuotationPage.ClickOnQuotationPriceViewBTN();
        logger.info("Step 08: Verify that the Project Type is exist in the document");
        app.priceQuotationPage.readTheDownloadedFileAndVerifyProjectTypeExistence(data);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_Price_Quotation(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        logger.info("Step 03: Click on the user profile name");
        app.priceQuotationPage.ClickOnUserProfileName();
        logger.info("Step 04: Click on My Activities");
        app.priceQuotationPage.ClickOnMyActivities();
        logger.info("Step 05: Click on Bookings");
        app.priceQuotationPage.ClickOnBookings();
        logger.info("Step 06: Click on View Booking");
        app.priceQuotationPage.ClickOnViewBookings();
        logger.info("Step 07: Click On Quotation Price View BTN");
        app.priceQuotationPage.ClickOnQuotationPriceViewBTN();
        logger.info("Step 08: Verify that the total price is exist in the document");
        app.priceQuotationPage.readTheDownloadedFileAndVerifyTotalPriceExistenceURL(data);
    }
}
