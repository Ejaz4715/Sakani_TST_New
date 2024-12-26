package sa.nhc.web;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.WaiverPageObject;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class Waiver extends NHCWebTest {

    /**
     * Prerequisite new user must be register / the user is eligible (check eligibility) and have family
     * The user process the eligibility waiver
     * TC_01 to TC_14
     */

    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_01(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Verify the user is eligible");
        CommonUtilityPage.verifyValueIsDisplayed("تهانينا، أنت الآن مستحق للدعم السكني!", "You are eligible for housing support.", WaiverPageObject.eligibleStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_02(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Verify the user navigate to \"التنازل عن استحقاق الدعم السكني\" page");
        app.waiverPage.verifyEligibilityWaiverPageIsDisplayed();
    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_03(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Click on waiver of eligibility button");
        app.waiverPage.clickOnWaiverOfEligibilityButton();
        logger.info("Step 06: Verify a \"هل أنت متأكد؟\" popup window displays");
        CommonUtilityPage.verifyValueIsDisplayed("هل أنت متأكد؟", "Are you sure?", WaiverPageObject.areYouSurePopup());
    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_04(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Click on waiver of eligibility button");
        app.waiverPage.clickOnWaiverOfEligibilityButton();
        logger.info("Step 06: Click on cancel button");
        app.uploadAllLicensePage.clickOnCancelPopupButton();
        logger.info("Step 07: Verify the user remains in the same page");
        app.waiverPage.verifyEligibilityWaiverPageIsDisplayed();
    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_05(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Click on waiver of eligibility button");
        app.waiverPage.clickOnWaiverOfEligibilityButton();
        logger.info("Step 06: Click on continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 07: Verify the user navigate to \"يرجى تحديد فرد من عائلتك للتنازل عن استحقاقك للحصول على الدعم السكني\" page");
        app.waiverPage.verifySelectFamilyMemberPageIsDisplayed();
    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_06(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Click on waiver of eligibility button");
        app.waiverPage.clickOnWaiverOfEligibilityButton();
        logger.info("Step 06: Click on continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 07: Click on cancel button");
        app.uploadAllLicensePage.clickOnCancelPopupButton();
        logger.info("Step 08: Verify the user navigate to \"لوحة البيانات\" page");
        app.waiverPage.verifyTheDashboardPageIsDisplayed();
    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_07(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Click on waiver of eligibility button");
        app.waiverPage.clickOnWaiverOfEligibilityButton();
        logger.info("Step 06: Click on continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 07: Verify the \"تأكيد\" button is not clickable/disabled");
        app.waiverPage.verifyTheConfirmButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_08(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Click on waiver of eligibility button");
        app.waiverPage.clickOnWaiverOfEligibilityButton();
        logger.info("Step 06: Click on continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 07: Select family member radio button");
        app.waiverPage.selectFamilyMemberRadioButton(data.get("Family_Member"));
        logger.info("Step 08: Click on confirm button");
        app.waiverPage.clickOnConfirmButton();
        logger.info("Step 09: Verify the user navigate to \"الأقرار بالتنازل عن الدعم السكني\" page");
        app.waiverPage.verifyTheDeclarationPageIsDisplayed();
    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_09(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Click on waiver of eligibility button");
        app.waiverPage.clickOnWaiverOfEligibilityButton();
        logger.info("Step 06: Click on continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 07: Select family member radio button");
        app.waiverPage.selectFamilyMemberRadioButton(data.get("Family_Member"));
        logger.info("Step 08: Click on confirm button");
        app.waiverPage.clickOnConfirmButton();
        logger.info("Step 09: Click on agree terms and conditions checkbox");
        app.waiverPage.clickOnAgreeTermsAndConditionsCheckbox();
        logger.info("Step 10: Verify the \"تأكيد\" button is clickable/enabled");
        app.waiverPage.verifyTheConfirmButtonIsEnabled();
    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_10(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Click on waiver of eligibility button");
        app.waiverPage.clickOnWaiverOfEligibilityButton();
        logger.info("Step 06: Click on continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 07: Select family member radio button");
        app.waiverPage.selectFamilyMemberRadioButton(data.get("Family_Member"));
        logger.info("Step 08: Click on confirm button");
        app.waiverPage.clickOnConfirmButton();
        logger.info("Step 09: Verify the \"تأكيد\" button is not clickable/disabled");
        app.waiverPage.verifyTheConfirmButtonIsDisabled();
    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_11(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Click on waiver of eligibility button");
        app.waiverPage.clickOnWaiverOfEligibilityButton();
        logger.info("Step 06: Click on continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 07: Select family member radio button");
        app.waiverPage.selectFamilyMemberRadioButton(data.get("Family_Member"));
        logger.info("Step 08: Click on confirm button");
        app.waiverPage.clickOnConfirmButton();
        logger.info("Step 09: Click on agree terms and conditions checkbox");
        app.waiverPage.clickOnAgreeTermsAndConditionsCheckbox();
        logger.info("Step 10: Click on confirm button");
        app.waiverPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the OTP popup window will display");
        app.mohLandBookingJourneyPage.verifyOtpPopupIsDisplayed();
    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_12(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Click on eligibility waiver div button");
        app.waiverPage.clickOnEligibilityWaiverDivButton();
        logger.info("Step 05: Click on waiver of eligibility button");
        app.waiverPage.clickOnWaiverOfEligibilityButton();
        logger.info("Step 06: Click on continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 07: Select family member radio button");
        app.waiverPage.selectFamilyMemberRadioButton(data.get("Family_Member"));
        logger.info("Step 08: Click on confirm button");
        app.waiverPage.clickOnConfirmButton();
        logger.info("Step 09: Click on agree terms and conditions checkbox");
        app.waiverPage.clickOnAgreeTermsAndConditionsCheckbox();
        logger.info("Step 10: Click on confirm button");
        app.waiverPage.clickOnConfirmButton();
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        logger.info("Step 11: Verify the user navigate to successful page");
        /////////////////////////////////

    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_13(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Verify the user is not eligible");
        //////////////////////////////////////////
    }
    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_14(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Verify the user is eligible");
        /////////////////////////////////////////
    }

    /**
     * Prerequisite new user must be register / the user is eligible (check eligibility) and have family
     * The user process the return eligibility waiver
     * TC_15 to TC_25
     */

    @Test(dataProvider = "testDataProvider")
    public void Waiver_TC_15(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Verify the user is not eligible");
        //////////////////////////////////////////////////
    }
}
