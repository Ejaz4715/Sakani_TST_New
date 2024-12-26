package sa.nhc.web;

import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.EligibilityPageObject;
import sa.nhc.web.objects.MOHLandBookingJourneyPageObjects;
import sa.nhc.web.objects.UploadAllLicensePageObject;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class UploadAllLicense extends NHCWebTest {
    
    /**
     * Prerequisite user login / The user check the eligibility / No booked project
     * The user book MOH Land Project
     * TC_01
     */

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_01(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on terms and conditions checkbox");
        app.mohLandBookingJourneyPage.clickOnTermsAndConditionsCheckbox();
        logger.info("Step 11: Click on accept and sign button");
        app.mohLandBookingJourneyPage.clickOnAcceptAndSignButton();
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        logger.info("Step 12: Verify the user navigate to \"تهانينا!\" page");
        app.mohLandBookingJourneyPage.verifyBookingLandCompletePageIsDisplayed();
    }

    /**
     * Prerequisite user login / The user check the eligibility / No booked project
     * The user upload the licenses
     * TC_02 to TC_16
     */
    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_02(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Verify the user navigate to \"تصريح البناء\" page");
        app.uploadAllLicensePage.verifyBuildingPermitIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_03(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Click on cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 09: Verify a \"هل تود الاستمرار\" popup window will display");
        app.uploadAllLicensePage.verifyAreYouSurePopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_04(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Click on cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 09: Click on continue button");
        app.registrationPage.clickOnContinueButton();
        logger.info("Step 10: Verify the user remains in the same page");
        app.uploadAllLicensePage.verifyBuildingPermitIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_05(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Click on cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 09: Click on cancel button");
        app.uploadAllLicensePage.clickOnCancelPopupButton();
        logger.info("Step 10: Verify the user navigate back to the \"تفاصيل الحجز\" page");
        app.mohLandBookingJourneyPage.verifyBookingDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_06(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 09: Verify the validation message \"الحقل مطلوب\" displayed");
        app.objectionPage.verifyTheRequiredFieldMsg(EligibilityPageObject.requiredFieldValidationMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_07(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Upload building permit file");
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), UploadAllLicensePageObject.uploadBuildingPermitFile());
        logger.info("Step 09: Verify the file is uploaded");
        app.objectionPage.checkTheFileIsUploaded(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup());
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_08(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Upload building permit file");
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), UploadAllLicensePageObject.uploadBuildingPermitFile());
        logger.info("Step 09: Click on x delete button");
        app.uploadAllLicensePage.clickOnXDeleteButton();
        logger.info("Step 10: Verify the file is deleted");
        app.uploadAllLicensePage.verifyTheBuildingPermitFileIsDeleted();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_09(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Enter building permit number input field");
        app.uploadAllLicensePage.enterBuildingPermitNumberInputFiled(data.get("Invalid_Building_Permit_Number"));
        logger.info("Step 09: Verify no value has been entered");
        CommonUtilityPage.verifyValueIsNotEntered(data.get("Invalid_Building_Permit_Number"), UploadAllLicensePageObject.buildingPermitNumberInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_10(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Enter building permit number input field");
        app.uploadAllLicensePage.enterBuildingPermitNumberInputFiled(data.get("Building_Permit_Number"));
        logger.info("Step 09: Verify the data is entered");
        CommonUtilityPage.verifyValueIsEntered(data.get("Building_Permit_Number"), UploadAllLicensePageObject.buildingPermitNumberInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_11(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Enter building permit date input field before signing date");
        app.uploadAllLicensePage.enterBuildingPermitDateInputFiled(data.get("Building_Permit_Date_Before_Signing_Date"));
        app.uploadAllLicensePage.clickOnCalenderIconButton();
        logger.info("Step 09: Verify the validation message يجب أن يكون التاريخ المحدد بعد تاريخ التوقيع. displays");
        app.objectionPage.verifyTheRequiredFieldMsg(EligibilityPageObject.requiredFieldValidationMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_12(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Enter building permit date input field in future date");
        app.uploadAllLicensePage.enterBuildingPermitDateInputFiled(data.get("Building_Permit_Date_In_Future"));
        app.uploadAllLicensePage.clickOnCalenderIconButton();
        logger.info("Step 09: Verify the validation message يجب أن يكون التاريخ المحدد قبل تاريخ اليوم displays");
        app.objectionPage.verifyTheRequiredFieldMsg(EligibilityPageObject.requiredFieldValidationMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_13(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Enter building permit date input field in present date");
        app.uploadAllLicensePage.enterBuildingPermitDateInputFiled(data.get("Building_Permit_Date"));
        app.uploadAllLicensePage.clickOnCalenderIconButton();
        logger.info("Step 09: Verify the present date is entered");
        CommonUtilityPage.verifyValueIsEntered(data.get("Building_Permit_Date"), UploadAllLicensePageObject.buildingPermitDateInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_14(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Click on calender icon");
        app.uploadAllLicensePage.clickOnCalenderIconButton();
        logger.info("Step 09: Verify the calender is visible");
        app.uploadAllLicensePage.verifyTheDatePickerIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_15(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Upload building permit file");
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), UploadAllLicensePageObject.uploadBuildingPermitFile());
        logger.info("Step 09: Enter building permit number input field");
        app.uploadAllLicensePage.enterBuildingPermitNumberInputFiled(data.get("Building_Permit_Number"));
        logger.info("Step 10: Enter building permit date input field in present date");
        app.uploadAllLicensePage.enterBuildingPermitDateInputFiled(data.get("Building_Permit_Date"));
        logger.info("Step 11: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 12: Verify the user navigate to \"تهانينا!\" page");
        app.uploadAllLicensePage.verifySuccessfulBuildingPermitIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_16(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on view building permit icon button");
        app.uploadAllLicensePage.clickOnViewBuildingPermitIconButton();
        logger.info("Step 08: Verify the user able to view \"رخصة البناء\"");
        app.uploadAllLicensePage.verifyTheBuildingPermitIsDisplayed();
    }

    /**
     * Prerequisite the user upload the building permit licenses
     * The admin reject the licenses
     * TC_17 to TC_27
     */
    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_17(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
    public void Upload_All_Licenses_TC_18(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
    public void Upload_All_Licenses_TC_19(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
    public void Upload_All_Licenses_TC_20(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
    public void Upload_All_Licenses_TC_21(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
    public void Upload_All_Licenses_TC_22(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
    public void Upload_All_Licenses_TC_23(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on building permit dropdown button");
        app.uploadAllLicensePage.clickOnBuildingPermitDropdownButton();
        logger.info("Step 11: Verify the admin able to view the \"تصريح البناء\" details");
        app.uploadAllLicensePage.verifyTheBuildingPermitDetailsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_24(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on building permit dropdown button");
        app.uploadAllLicensePage.clickOnBuildingPermitDropdownButton();
        logger.info("Step 11: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 12: Verify a \"تصريح البناء رفض\" popup window will display");
        app.mohLandBookingJourneyPage.verifyTheRejectCancelBookingPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_25(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on building permit dropdown button");
        app.uploadAllLicensePage.clickOnBuildingPermitDropdownButton();
        logger.info("Step 11: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 12: Click on cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 13: Verify the admin remains in the same page");
        app.uploadAllLicensePage.verifyTheBuildingPermitDetailsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_26(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on building permit dropdown button");
        app.uploadAllLicensePage.clickOnBuildingPermitDropdownButton();
        logger.info("Step 11: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 12: Enter reject building permit reason");
        app.mohLandBookingJourneyPage.enterRejectCancelBookingTextarea(data.get("Reject_Reason"));
        logger.info("Step 13: Verify the text is entered");
        CommonUtilityPage.verifyValueIsEntered(data.get("Reject_Reason"), MOHLandBookingJourneyPageObjects.rejectCancelBookingTextarea());
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_27(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on building permit dropdown button");
        app.uploadAllLicensePage.clickOnBuildingPermitDropdownButton();
        logger.info("Step 11: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 12: Enter reject building permit reason");
        app.mohLandBookingJourneyPage.enterRejectCancelBookingTextarea(data.get("Reject_Reason"));
        logger.info("Step 13: Click confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 14: Verify the status will change to \"مرفوض\"");
        Browser.waitForSeconds(2);
        CommonUtilityPage.verifyValueIsDisplayed("مرفوض", "Rejected", UploadAllLicensePageObject.buildingPermitStatus());
    }

    /**
     * Prerequisite the user upload the building permit licenses
     * The admin approve the licenses
     * TC_28 to TC_31
     */
    @Test(dataProvider = "testDataProvider")
    public void Upload_Building_Permit_ForApproval(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload building permit button");
        app.uploadAllLicensePage.clickOnUploadBuildingPermitButton();
        logger.info("Step 08: Upload building permit file");
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), UploadAllLicensePageObject.uploadBuildingPermitFile());
        logger.info("Step 09: Enter building permit number input field");
        app.uploadAllLicensePage.enterBuildingPermitNumberInputFiled(data.get("Building_Permit_Number"));
        logger.info("Step 10: Enter building permit date input field in present date");
        app.uploadAllLicensePage.enterBuildingPermitDateInputFiled(data.get("Building_Permit_Date"));
        logger.info("Step 11: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 12: Verify the user navigate to \"تهانينا!\" page");
        app.uploadAllLicensePage.verifySuccessfulBuildingPermitIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_28(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on building permit dropdown button");
        app.uploadAllLicensePage.clickOnBuildingPermitDropdownButton();
        logger.info("Step 11: Click on approve button");
        app.mohLandBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 12: Verify a \"تصريح البناء قبول\" popup window will display");
        app.mohLandBookingJourneyPage.verifyTheRejectCancelBookingPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_29(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on building permit dropdown button");
        app.uploadAllLicensePage.clickOnBuildingPermitDropdownButton();
        logger.info("Step 11: Click on approve button");
        app.mohLandBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 12: Click on cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 13: Verify the admin remains in the same page");
        app.uploadAllLicensePage.verifyTheBuildingPermitDetailsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_30(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on building permit dropdown button");
        app.uploadAllLicensePage.clickOnBuildingPermitDropdownButton();
        logger.info("Step 11: Click on approve button");
        app.mohLandBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 12: Click confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 13: Verify the status will change to \"مقبول\"");
        Browser.waitForSeconds(2);
        CommonUtilityPage.verifyValueIsDisplayed("مقبول", "Approved", UploadAllLicensePageObject.buildingPermitStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_31(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on building permit dropdown button");
        app.uploadAllLicensePage.clickOnBuildingPermitDropdownButton();
        logger.info("Step 11: Click on download button");
        app.uploadAllLicensePage.clickOnDownloadButton();
        logger.info("Step 12: Verify the building permit file is downloaded");
        CommonUtilityPage.verifyNewTabIsOpened();
    }

    /**
     * The user upload construction completion certificate
     * The admin approve the construction completion certificate
     * TC_32 to TC_33
     */
    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_32(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 07: Click on upload construction completion certificate button");
        app.uploadAllLicensePage.clickOnConstructionCompletionCertificateButton();
        logger.info("Step 08: Upload building permit file");
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), UploadAllLicensePageObject.uploadBuildingPermitFile());
        logger.info("Step 09: Enter certificate number input field");
        app.uploadAllLicensePage.enterCertificateNumberInputFiled(data.get("Certificate_Number"));
        logger.info("Step 10: Enter certificate date input field in present date");
        app.uploadAllLicensePage.enterCertificateDateInputFiled(data.get("Certificate_Date"));
        logger.info("Step 11: Click on save and continue button");
        app.mohLandBookingJourneyPage.clickOnSaveAndContinueButton();
        logger.info("Step 12: Verify the user navigate to \"تهانينا!\" page");
        app.uploadAllLicensePage.verifySuccessfulBuildingPermitIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Upload_All_Licenses_TC_33(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
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
        logger.info("Step 10: Click on construction completion dropdown button");
        app.uploadAllLicensePage.clickOnConstructionCompletionDropdownButton();
        logger.info("Step 11: Click on approve button");
        app.mohLandBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 12: Click confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 13: Verify the status will change to \"مقبول\"");
        Browser.waitForSeconds(2);
        CommonUtilityPage.verifyValueIsDisplayed("مقبول", "Approved", UploadAllLicensePageObject.constructionCompletionCertificateStatus());
    }
}
