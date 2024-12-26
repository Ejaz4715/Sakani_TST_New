package sa.nhc.web;

import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.EligibilityPageObject;
import sa.nhc.web.objects.ObjectionPageObjects;
import sa.nhc.web.objects.exisitng.CheckEligibilityPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class Objection extends NHCWebTest {
    
    /**
     * Prerequisite new user registration
     */
    @Test(dataProvider = "testDataProvider")
    public void New_User_Registration_Objection(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the registration form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.registrationPage.clickOnRegisterLink();
        logger.info("Step 03: Enter ID and birth of date then click continue");
        app.registrationPage.enterIDNumber(data.get("Username"));
        app.registrationPage.enterBirthOfDate(data.get("Birth_Of_Date"));
        logger.info("Step 04: Enter OTP then click verify");
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        logger.info("Step 05: Enter email and phone number then click continue");
        app.registrationPage.enterPhoneNumber(data.get("PhoneNumber"));
        app.registrationPage.enterEmail(data.get("Email"));
        app.registrationPage.clickOnContinueButton();
        logger.info("Step 06: Enter password and password confirmation then click agree terms conditions checkbox and submit");
        app.registrationPage.enterPassword(data.get("Password"));
        app.registrationPage.enterPasswordConfirmation(data.get("Password"));
        app.registrationPage.clickOnAgreeTermsConditionsCheckbox();
        app.registrationPage.clickOnSubmitButton();
        logger.info("Step 07: Enter OTP then click verify");
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        logger.info("Step 08: Verify the user is successfully registered");
        app.registrationPage.checkSuccessfulRegisterMessage();
    }

    /**
     * Prerequisite user login / The user is not eligible with all status except (You currently own a habitable home)
     * The user submit the appeal
     * TC_01 to TC_18
     */

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_01(Map<String, String> data) throws Exception {
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on check eligibility button");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickOnNoRadioButton();
        app.eligibilityPage.clickOnYesRadioButton();
        logger.info("Step 09: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 10: Select current region dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Current_Region_AR"), data.get("Current_Region_EN"), CheckEligibilityPageObjects.DDLCurrentRegion());
        logger.info("Step 11: Select current city dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Current_City_AR"), data.get("Current_City_EN"), CheckEligibilityPageObjects.DDLCurrentCity());
        logger.info("Step 12: Select preferred region dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Preferred_Region_AR"), data.get("Preferred_Region_EN"), CheckEligibilityPageObjects.DDLPreferredRegion());
        logger.info("Step 13: Select preferred city dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Preferred_City_AR"), data.get("Preferred_City_EN"), CheckEligibilityPageObjects.DDLPreferredCity());
        logger.info("Step 14: Select preferred district dropdown list");
        if (Browser.isElementPresent(CheckEligibilityPageObjects.DDLPreferredDistrict())) {
            app.eligibilityPage.selectFromTheLists(data.get("Preferred_District_AR"), data.get("Preferred_District_EN"), CheckEligibilityPageObjects.DDLPreferredDistrict());
        }
        logger.info("Step 15: Select current housing status dropdown list");
        Browser.executeJSScroll(100);
        Browser.waitForSeconds(1);
        app.eligibilityPage.selectFromTheLists(data.get("Current_Housing_Status_AR"), data.get("Current_Housing_Status_EN"), CheckEligibilityPageObjects.DDLCurrentHosingStatus());
//       logger.info("Step 16: Select deed type dropdown lists");
////        if (Browser.isElementPresent(EligibilityPageObject.deedTypeDropdownList())) {
////            app.eligibilityPage.selectDeedType(data.get("Deed_Type_AR"), data.get("Deed_Type_EN"), EligibilityPageObject.deedTypeDropdownList(), data.get("Construction_Status_AR"), data.get("Construction_Status_EN"),EligibilityPageObject.constructionStatusDropdownList());
////        }
        logger.info("Step 17: Click on confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 18: Verify the user able to view \"تقديم اعتراض\" button");
        app.eligibilityPage.closeWindowOfSurvey();
        app.eligibilityPage.verifyTheEligibilityMessage(EligibilityPageObject.notEligibleMessage());
        app.objectionPage.verifyTheAppealButtonIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_02(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Verify the user navigate to \"تقديم اعتراض\" page");
        app.objectionPage.verifyTheAppealSubmissionPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_03(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Click cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 06: Verify the user navigate to marketplace page");
        app.objectionPage.verifyMarketPlacePageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_04(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 06: Verify the validation message \"الحقل مطلوب\" displays");
        app.objectionPage.verifyTheRequiredFieldMsg( EligibilityPageObject.requiredFieldValidationMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_05(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Verify the \"الرجاء تحديد مبرر\" dropdown list is selectable");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_06(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 06: Verify the user able to enter text in comments textarea");
        CommonUtilityPage.verifyValueIsEntered(data.get("Comments"), ObjectionPageObjects.commentsTextarea());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_07(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Verify the user navigate to the \"يرجى رفع المستندات التالية لدعم طلب الاعتراض\" step page");
        app.objectionPage.verifyUploadFilesPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_08(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Click cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 09: Verify the user navigate to marketplace page");
        app.objectionPage.verifyMarketPlacePageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_09(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 09: Verify the validation message \"الحقل مطلوب\" displays");
        app.objectionPage.verifyTheRequiredFieldMsg( EligibilityPageObject.requiredFieldValidationMessage());    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_10(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Upload large file size of national ID");
        CommonUtilityPage.UploadAttachment(data.get("File_Large_Size"), ObjectionPageObjects.uploadIdFile());
        logger.info("Step 09: Verify the validation message \"حجم الملف كبير جدًا\" displays");
        app.objectionPage.verifyTheRequiredFieldMsg( EligibilityPageObject.requiredFieldValidationMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_11(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Upload large file size of family card");
        CommonUtilityPage.UploadAttachment(data.get("File_Large_Size"), ObjectionPageObjects.uploadFamilyCardFile());
        logger.info("Step 09: Verify the validation message \"حجم الملف كبير جدًا\" displays");
        app.objectionPage.verifyTheRequiredFieldMsg( EligibilityPageObject.requiredFieldValidationMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_12(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Upload wrong file format size of national ID");
        CommonUtilityPage.UploadAttachment(data.get("Wrong_Format_File"), ObjectionPageObjects.uploadIdFile());
        logger.info("Step 09: Verify an error message \"حدث خطأ ما، الرجاء المحاولة مرة أخرى\" displays");
        CommonUtilityPage.verifyValueIsDisplayed("حدث خطأ ما، الرجاء المحاولة مرة أخرى", "Something went wrong, please try again", ObjectionPageObjects.toastErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_13(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Upload wrong file format size of family card");
        CommonUtilityPage.UploadAttachment(data.get("Wrong_Format_File"), ObjectionPageObjects.uploadFamilyCardFile());
        logger.info("Step 09: Verify an error message \"حدث خطأ ما، الرجاء المحاولة مرة أخرى\" displays");
        CommonUtilityPage.verifyValueIsDisplayed("حدث خطأ ما، الرجاء المحاولة مرة أخرى", "Something went wrong, please try again", ObjectionPageObjects.toastErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_14(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Upload file of national ID");
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), ObjectionPageObjects.uploadIdFile());
        logger.info("Step 09: Verify the file is uploaded");
        app.objectionPage.checkTheFileIsUploaded(ObjectionPageObjects.deleteIconButton());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_15(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Upload file of family card");
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), ObjectionPageObjects.uploadFamilyCardFile());
        logger.info("Step 09: Verify the file is uploaded");
        app.objectionPage.checkTheFileIsUploaded(ObjectionPageObjects.deleteIconButton());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_16(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Upload file of national ID");
        if (Browser.isElementPresent(ObjectionPageObjects.deleteIconButton())) {
            Browser.waitUntilElementToBeClickable(ObjectionPageObjects.deleteIconButton(),40);
            Browser.click(ObjectionPageObjects.deleteIconButton());
            Browser.waitUntilElementToBeClickable(ObjectionPageObjects.deleteIconButton(),40);
            Browser.click(ObjectionPageObjects.deleteIconButton());
        }
        Browser.waitUntilInvisibilityOfElement(ObjectionPageObjects.deleteIconButton(),40);
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), ObjectionPageObjects.uploadIdFile());
        logger.info("Step 09: Verify the uploaded file is deleted");
        app.objectionPage.clickDeleteIconButton();
        app.objectionPage.verifyTheRequiredFieldMsg( EligibilityPageObject.requiredFieldValidationMessage());    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_17(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Upload file of family card");
        if (Browser.isElementPresent(ObjectionPageObjects.deleteIconButton())) {
            Browser.click(ObjectionPageObjects.deleteIconButton());
        }
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), ObjectionPageObjects.uploadFamilyCardFile());
        logger.info("Step 09: Verify the uploaded file is deleted");
        app.objectionPage.clickDeleteIconButton();
        app.objectionPage.verifyTheRequiredFieldMsg( EligibilityPageObject.requiredFieldValidationMessage());    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_18(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on request appeal");
        app.objectionPage.clickRequestAppealButton();
        logger.info("Step 05: Select justification dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
        logger.info("Step 06: Enter comments textarea");
        app.objectionPage.enterComments(data.get("Comments"));
        logger.info("Step 07: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 08: Upload files of national ID and family card");
        if (Browser.isElementPresent(ObjectionPageObjects.deleteIconButton())) {
            Browser.click(ObjectionPageObjects.deleteIconButton());
            Browser.click(ObjectionPageObjects.deleteIconButton());
        }
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), ObjectionPageObjects.uploadIdFile());
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), ObjectionPageObjects.uploadFamilyCardFile());
        logger.info("Step 09: Click continue button");
        app.objectionPage.clickContinueButton();
        logger.info("Step 10: Verify the user navigate to \"تم تقديم الاعتراض بنجاح\" page");
        CommonUtilityPage.verifyValueIsDisplayed("تم تقديم الاعتراض بنجاح", "You have successfully Submitted your appeal", ObjectionPageObjects.appealSuccessfullySubmittedMessage());
    }

    /**
     * The admin re-assign the appeal
     * TC_19 to TC_34
     */
    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_19(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify the admin able to view \"الاعتراضات\" button");
        app.objectionPage.verifyTheAppealsButtonIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_20(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Verify the admin navigate to \"الاعتراضات\" page in \"جميع الاعتراضات\" section");
        app.objectionPage.verifyTheAppealsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_21(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Click on assigned to me nav button");
        app.objectionPage.clickOnAssignedToMeNavButton();
        logger.info("Step 06: Verify the admin able to view \"الاعتراضات المسندة لي\" section");
        CommonUtilityPage.verifyOptionIsSelected("الاعتراضات المسندة لي", "Assigned to me", ObjectionPageObjects.assignedToMeNavButton());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_22(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Click on assigned to my team nav button");
        app.objectionPage.clickOnAssignedToMyTeamNavButton();
        logger.info("Step 06: Verify the admin able to view \"الاعتراضات المسندة لزملائي\" section");
        CommonUtilityPage.verifyOptionIsSelected("الاعتراضات المسندة لزملائي", "Assigned to my team", ObjectionPageObjects.assignedToMyTeamNavButton());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_23(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Verify the admin able to view the appeal user");
        CommonUtilityPage.verifyValueIsDisplayed(data.get("Beneficiary_ID"), ObjectionPageObjects.searchedUserResult());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_24(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Verify a \"إعادة تعيين\" popup window displayed");
        app.objectionPage.verifyReassignAppealPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_25(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Click on close button");
        app.objectionPage.clickOnCloseButton();
        logger.info("Step 10: Verify the user remains in the same beneficiary details page");
        app.objectionPage.verifyBeneficiaryDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_26(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Verify the\"إعادة تعيين\" button is not clickable/disabled");
        app.objectionPage.verifyReassignAppealButtonOfPopupIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_27(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Verify the\"مستخدم\" dropdown list is not visible");
        app.objectionPage.verifyUserDropdownListIsNotVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_28(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Select team dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Team_AR"), data.get("Team_EN"), ObjectionPageObjects.teamDropdownList());
        logger.info("Step 10: Verify the\"فريق\" dropdown list is selectable");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Team_AR"), data.get("Team_EN"), ObjectionPageObjects.teamDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_29(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Select team dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Team_AR"), data.get("Team_EN"), ObjectionPageObjects.teamDropdownList());
        logger.info("Step 10: Select user dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("User_AR"), data.get("User_EN"), ObjectionPageObjects.userDropdownList());
        logger.info("Step 11: Verify the\"مستخدم\" dropdown list is selectable");
        CommonUtilityPage.verifyOptionIsSelected(data.get("User_AR"), data.get("User_EN"), ObjectionPageObjects.userDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_30(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Select team dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Team_AR"), data.get("Team_EN"), ObjectionPageObjects.teamDropdownList());
        logger.info("Step 10: Select user dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("User_AR"), data.get("User_EN"), ObjectionPageObjects.userDropdownList());
        logger.info("Step 11: Click on reassign appeal button of the popup");
        app.objectionPage.clickOnReassignAppealOfPopupButton();
        logger.info("Step 12: Verify a \"تأكيد التخصيص\" popup window displayed");
        app.objectionPage.verifyConfirmReassignmentPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_31(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Select team dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Team_AR"), data.get("Team_EN"), ObjectionPageObjects.teamDropdownList());
        logger.info("Step 10: Select user dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("User_AR"), data.get("User_EN"), ObjectionPageObjects.userDropdownList());
        logger.info("Step 11: Click on reassign appeal button of the popup");
        app.objectionPage.clickOnReassignAppealOfPopupButton();
        logger.info("Step 12: Click on cancel button");
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 13: Verify the user remains in the same \"إعادة تعيين\" popup window");
        app.objectionPage.verifyReassignAppealPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_32(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Select team dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Team_AR"), data.get("Team_EN"), ObjectionPageObjects.teamDropdownList());
        logger.info("Step 10: Select user dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("User_AR"), data.get("User_EN"), ObjectionPageObjects.userDropdownList());
        logger.info("Step 11: Click on reassign appeal button of the popup");
        app.objectionPage.clickOnReassignAppealOfPopupButton();
        logger.info("Step 12: Click on confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 13: Verify a \"تم إعادة تخصيصة!\" popup window displayed");
        app.objectionPage.verifyAppealReassignedPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_33(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Select team dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Team_AR"), data.get("Team_EN"), ObjectionPageObjects.teamDropdownList());
        logger.info("Step 10: Select user dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("User_AR"), data.get("User_EN"), ObjectionPageObjects.userDropdownList());
        logger.info("Step 11: Click on reassign appeal button of the popup");
        app.objectionPage.clickOnReassignAppealOfPopupButton();
        logger.info("Step 12: Click on confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 13: Click on close button of popup");
        app.objectionPage.clickOnCloseOfPopup();
        logger.info("Step 14: Verify the\"تقديم الطلب\" button is not clickable/disabled");
        app.objectionPage.verifySubmitAppealRequestButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_34(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Select team dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Team_AR"), data.get("Team_EN"), ObjectionPageObjects.teamDropdownList());
        logger.info("Step 10: Select user dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("User_AR"), data.get("User_EN"), ObjectionPageObjects.userDropdownList());
        logger.info("Step 11: Click on reassign appeal button of the popup");
        app.objectionPage.clickOnReassignAppealOfPopupButton();
        logger.info("Step 12: Click on confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 13: Click on close button of popup");
        app.objectionPage.clickOnCloseOfPopup();
        logger.info("Step 14: Enter comments textarea");
        app.objectionPage.enterCommentsOfPopup(data.get("Comments"));
        logger.info("Step 15: Click on submit appeal request button");
        app.objectionPage.clickOnSubmitTheAppealRequestButton();
        logger.info("Step 16: Verify the admin navigate to \"الاعتراضات\" page in \" بيانات مستفيد  \" section");
        app.objectionPage.verifyBeneficiaryDetailsPageIsDisplayed();
    }

    /**
     * The admin request to re-raise the appeal
     * TC_35 to TC_41
     */
    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_35(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on required documents button");
        app.objectionPage.clickOnRequiredDocumentsButton();
        logger.info("Step 09: Verify a \"المستندات المطلوبة\" popup window displayed");
        app.objectionPage.verifyRequiredDocumentsPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_36(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on required documents button");
        app.objectionPage.clickOnRequiredDocumentsButton();
        logger.info("Step 09: Click cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 10: Verify the admin remains in\"الاعتراضات\" page in \" بيانات مستفيد  \" section");
        app.objectionPage.verifyBeneficiaryDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_37(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on required documents button");
        app.objectionPage.clickOnRequiredDocumentsButton();
        logger.info("Step 09: Verify the  \"المستندات المطلوبة\"  dropdown list is not visible");
        app.objectionPage.verifyRequiredDocumentsDropdownListIsNotVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_38(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on required documents button");
        app.objectionPage.clickOnRequiredDocumentsButton();
        logger.info("Step 09: Select reason dropdown list");
        app.objectionPage.selectRejectReasonLists();
        logger.info("Step 10: Verify the \"إضافة ومتابعة\" button is not clickable/disabled");
        app.objectionPage.verifyAddAndContinueButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_39(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on required documents button");
        app.objectionPage.clickOnRequiredDocumentsButton();
        logger.info("Step 09: Select reason dropdown list");
        app.objectionPage.selectRejectReasonLists();
        logger.info("Step 10: Select required documents dropdown list");
        app.objectionPage.selectRequiredDocumentsFromTheLists(data.get("Required_Documents_AR"), data.get("Required_Documents_EN"), ObjectionPageObjects.requiredDocumentsDropdownList());
        logger.info("Step 11: Click on add and continue button");
        app.objectionPage.clickAddAndContinueButton();
        logger.info("Step 12: Click on delete trash icon button");
        app.objectionPage.clickOnDeleteTrashIconButton();
        logger.info("Step 13: Verify the reason is deleted");
        app.objectionPage.verifyDeleteTrashIconButtonIsNotVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_40(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on required documents button");
        app.objectionPage.clickOnRequiredDocumentsButton();
        logger.info("Step 09: Select reason dropdown list");
        app.objectionPage.selectRejectReasonLists();
        logger.info("Step 10: Select required documents dropdown list");
        app.objectionPage.selectRequiredDocumentsFromTheLists(data.get("Required_Documents_AR"), data.get("Required_Documents_EN"), ObjectionPageObjects.requiredDocumentsDropdownList());
        logger.info("Step 11: Click on add and continue button");
        app.objectionPage.clickAddAndContinueButton();
        logger.info("Step 12: Click on submit appeal request button");
        app.objectionPage.clickOnSubmitTheAppealRequestButton();
        logger.info("Step 13: Click cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 14: Verify the admin remains in the same \"المستندات المطلوبة\" popup window");
        app.objectionPage.verifyRequiredDocumentsPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_41(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on required documents button");
        app.objectionPage.clickOnRequiredDocumentsButton();
        logger.info("Step 09: Select reason dropdown list");
        app.objectionPage.selectRejectReasonLists();
        logger.info("Step 10: Select required documents dropdown list");
        app.objectionPage.selectRequiredDocumentsFromTheLists(data.get("Required_Documents_AR"), data.get("Required_Documents_EN"), ObjectionPageObjects.requiredDocumentsDropdownList());
        logger.info("Step 11: Click on add and continue button");
        app.objectionPage.clickAddAndContinueButton();
        logger.info("Step 12: Click on submit appeal request button");
        app.objectionPage.clickOnSubmitTheAppealRequestButton();
        logger.info("Step 13: Click confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 14: Verify a \"تم أرسال المستندات المطلوبة\" popup window displays");
        app.objectionPage.verifyRequireDocumentsSentPopupIsDisplayed();
    }

    /**
     * The user submit the admin request
     * TC_42 to TC_44
     */
    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_42(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify the status is \"يتطلب مستندات إضافية\"");
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requireAdditionalDocumentsStatus(),40);
        Browser.moveToElement(ObjectionPageObjects.requireAdditionalDocumentsStatus());
        CommonUtilityPage.verifyValueIsDisplayed("يتطلب مستندات إضافية", "Requires additional documents", ObjectionPageObjects.requireAdditionalDocumentsStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_43(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeal need documents");
        app.objectionPage.clickAppealNeedDocumentsButton();
        logger.info("Step 05: Verify the user navigate to \"المستندات المطلوبة الناقصة\" page");
        app.objectionPage.verifyMissingRequiredDocumentsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_44(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeal need documents");
        app.objectionPage.clickAppealNeedDocumentsButton();
        logger.info("Step 05: Upload missing required documents file");
        Browser.moveToElement(ObjectionPageObjects.missingRequiredDocumentsPage());
        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), ObjectionPageObjects.uploadMissingRequiredDocumentsFile());
        logger.info("Step 06: Click on submit button");
        app.objectionPage.clickSubmitButton();
        logger.info("Step 07: Verify the status will change to \"يتم فحص الطلب\" ");
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requireAdditionalDocumentsStatus(),40);
        Browser.moveToElement(ObjectionPageObjects.requireAdditionalDocumentsStatus());
        CommonUtilityPage.verifyValueIsDisplayed("يتم فحص الطلب", "Request checked", ObjectionPageObjects.requireAdditionalDocumentsStatus());
    }

    /**
     * The admin reject the appeal request
     * TC_45 to TC_50
     */

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_45(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 09: Verify a \"سبب رفض الاعتراض\" popup window displays");
        app.objectionPage.verifyRejectReasonPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_46(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 09: Verify the \"شرح الاعتراض\" textarea is not visible");
        app.objectionPage.verifyExplanationTextareaIsNotVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_47(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 09: Select reject reason dropdown list");
        app.objectionPage.selectRejectReasonLists();
        logger.info("Step 10: Verify the \"إضافة ومتابعة\" button is not clickable/disabled");
        app.objectionPage.verifyAddAndContinueButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_48(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 09: Select reject reason dropdown list");
        app.objectionPage.selectRejectReasonLists();
        logger.info("Step 10: Enter explanation textarea");
        app.objectionPage.enterExplanationOfPopup(data.get("Explanation"));
        logger.info("Step 11: Click on add and continue button");
        app.objectionPage.clickAddAndContinueButton();
        logger.info("Step 13: Click on delete trash icon button");
        app.objectionPage.clickOnDeleteTrashIconButton();
        logger.info("Step 14: Verify the rejection reason is deleted");
        app.objectionPage.verifyDeleteTrashIconButtonIsNotVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_49(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reject button");
        app.objectionPage.clickOnRejectButton();
        logger.info("Step 09: Select reject reason dropdown list");
        app.objectionPage.selectRejectReasonLists();
        logger.info("Step 10: Enter explanation textarea");
        app.objectionPage.enterExplanationOfPopup(data.get("Explanation"));
        logger.info("Step 11: Click on add and continue button");
        app.objectionPage.clickAddAndContinueButton();
        logger.info("Step 12: Click on submit appeal request button");
        app.objectionPage.clickOnSubmitTheAppealRequestButton();
        logger.info("Step 13: Click confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 14: Verify a \"رفض الاعتراض\" popup window displays");
        app.objectionPage.verifyRejectedAppealPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_50(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify the status will change to \"طلب رفض\" ");
        Browser.moveToElement(ObjectionPageObjects.rejectedApprovedRequestStatus());
        CommonUtilityPage.verifyValueIsDisplayed("طلب رفض", "Request rejected", ObjectionPageObjects.rejectedApprovedRequestStatus());
    }

    /**
     * Prerequisite new user registration / user login / The user is not eligible with all status except (You currently own a habitable home)
     * The admin approve the appeal request
     * TC_50 to TC_54
     */

//    @Test(dataProvider = "testDataProvider")
//    public void RequestAdditionalDocuments(Map<String, String> data) throws Exception {
//        logger.info("Step 00: Test Data : " + data.toString());
//        app.openApplication(data);
//        logger.info("Step 01: Navigate to Sakani admin site");
//        //app.loginPage.alertBoxLogin();
//        logger.info("Step 02: Login to the portal with admin credentials");
//        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
//        logger.info("Step 03: Hover to the main menu");
//        app.objectionPage.hoverToMainMenu();
//        logger.info("Step 04: Click on appeals button");
//        app.objectionPage.clickOnAppealsButton();
//        logger.info("Step 05: Enter beneficiary ID");
//        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
//        logger.info("Step 06: Click on search button");
//        app.objectionPage.clickSearchButton();
//        logger.info("Step 07: Click on searched user");
//        app.objectionPage.clickOnTheSearchedUserId();
//        logger.info("Step 08: Click on request additional documents button");
//        app.objectionPage.clickOnRequestAdditionDocumentsButton();
//        logger.info("Step 09: Select reason dropdown list");
//        app.objectionPage.selectRejectReasonLists();
//        logger.info("Step 10: Select required documents dropdown list");
//        app.objectionPage.selectRequiredDocumentsFromTheLists(data.get("Required_Documents_AR"), data.get("Required_Documents_EN"), ObjectionPageObjects.requiredDocumentsDropdownList());
//        logger.info("Step 11: Click on add and continue button");
//        app.objectionPage.clickAddAndContinueButton();
//        logger.info("Step 12: Click on submit appeal request button");
//        app.objectionPage.clickOnSubmitTheAppealRequestButton();
//        logger.info("Step 13: Click confirm button");
//        app.eligibilityPage.clickOnConfirmButton();
//        logger.info("Step 14: Verify a \"تم أرسال المستندات المطلوبة\" popup window displays");
//        app.objectionPage.verifyRequireDocumentsSentPopupIsDisplayed();
//    }
//    @Test(dataProvider = "testDataProvider")
//    public void SubmitTheAdminRequest(Map<String, String> data) throws Exception {
//        logger.info("Step 00: Test Data : " + data.toString());
//        app.openApplication(data);
//        logger.info("Step 01: Navigate to Sakani housing site");
//        //app.loginPage.alertBoxLogin();
//        app.homePage.closeAllSakaniPopups();
//        logger.info("Step 02: Navigate to the login form");
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
//        logger.info("Step 03: Navigate to user profile");
//        app.eligibilityPage.hoverToUserIconProfile();
//        app.eligibilityPage.clickOnMyProfileButton();
//        logger.info("Step 04: Click on appeal need documents");
//        app.objectionPage.clickAppealNeedDocumentsButton();
//        logger.info("Step 05: Upload missing required documents file");
//        Browser.moveToElement(ObjectionPageObjects.missingRequiredDocumentsPage());
//        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), ObjectionPageObjects.uploadMissingRequiredDocumentsFile());
//        logger.info("Step 06: Click on submit button");
//        app.objectionPage.clickSubmitButton();
//        logger.info("Step 07: Verify the status will change to \"يتم فحص الطلب\" ");
//        Browser.moveToElement(ObjectionPageObjects.requireAdditionalDocumentsStatus());
//        CommonUtilityPage.verifyValueIsDisplayed("يتم فحص الطلب", "Request checked", ObjectionPageObjects.requireAdditionalDocumentsStatus());
//    }
    
    @Test(dataProvider = "testDataProvider")
    public void New_User_Registration_Objection_Approval(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        logger.info("Step 02: Navigate to the registration form");
        app.homePage.clickOnLoginButtonInHomePage();
        app.registrationPage.clickOnRegisterLink();
        logger.info("Step 03: Enter ID and birth of date then click continue");
        app.registrationPage.enterIDNumber(data.get("Username"));
        app.registrationPage.enterBirthOfDate(data.get("Birth_Of_Date"));
        logger.info("Step 04: Enter OTP then click verify");
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        logger.info("Step 05: Enter email and phone number then click continue");
        app.registrationPage.enterPhoneNumber(data.get("PhoneNumber"));
        app.registrationPage.enterEmail(data.get("Email"));
        app.registrationPage.clickOnContinueButton();
        logger.info("Step 06: Enter password and password confirmation then click agree terms conditions checkbox and submit");
        app.registrationPage.enterPassword(data.get("Password"));
        app.registrationPage.enterPasswordConfirmation(data.get("Password"));
        app.registrationPage.clickOnAgreeTermsConditionsCheckbox();
        app.registrationPage.clickOnSubmitButton();
        logger.info("Step 07: Enter OTP then click verify");
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        logger.info("Step 08: Verify the user is successfully registered");
        app.registrationPage.checkSuccessfulRegisterMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void CheckEligibilityAndAppealRequest(Map<String, String> data) throws Exception {
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on check eligibility button");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 04: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 05: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 06: Click on acknowledge radio buttons");
        app.eligibilityPage.clickOnNoRadioButton();
        app.eligibilityPage.clickOnYesRadioButton();
        logger.info("Step 07: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 08: Select current region dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Current_Region_AR"), data.get("Current_Region_EN"), CheckEligibilityPageObjects.DDLCurrentRegion());
        logger.info("Step 09: Select current city dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Current_City_AR"), data.get("Current_City_EN"), CheckEligibilityPageObjects.DDLCurrentCity());
        logger.info("Step 10: Select preferred region dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Preferred_Region_AR"), data.get("Preferred_Region_EN"), CheckEligibilityPageObjects.DDLPreferredRegion());
        logger.info("Step 11: Select preferred city dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Preferred_City_AR"), data.get("Preferred_City_EN"), CheckEligibilityPageObjects.DDLPreferredCity());
        logger.info("Step 12: Select preferred district dropdown list");
        if (Browser.isElementPresent(CheckEligibilityPageObjects.DDLPreferredDistrict())) {
            app.eligibilityPage.selectFromTheLists(data.get("Preferred_District_AR"), data.get("Preferred_District_EN"), CheckEligibilityPageObjects.DDLPreferredDistrict());
        }
        logger.info("Step 13: Select current housing status dropdown list");
        Browser.executeJSScroll(100);
        Browser.waitForSeconds(1);
        app.eligibilityPage.selectFromTheLists(data.get("Current_Housing_Status_AR"), data.get("Current_Housing_Status_EN"), CheckEligibilityPageObjects.DDLCurrentHosingStatus());
      logger.info("Step 14: Select deed type dropdown lists");
//        if (Browser.isElementPresent(EligibilityPageObject.deedTypeDropdownList())) {
//            app.eligibilityPage.selectDeedType(data.get("Deed_Type_AR"), data.get("Deed_Type_EN"), EligibilityPageObject.deedTypeDropdownList(), data.get("Construction_Status_AR"), data.get("Construction_Status_EN"),EligibilityPageObject.constructionStatusDropdownList());
//        }
        logger.info("Step 15: Click on confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 16: Verify the user able to view \"تقديم اعتراض\" button");
        app.eligibilityPage.closeWindowOfSurvey();
        app.eligibilityPage.verifyTheEligibilityMessage(EligibilityPageObject.notEligibleMessage());
        app.objectionPage.verifyTheAppealButtonIsDisplayed();
//        logger.info("Step 00: Test Data : " + data.toString());
//        app.openApplication(data);
//        logger.info("Step 01: Navigate to Sakani housing site");
//        //app.loginPage.alertBoxLogin();
//        app.homePage.closeAllSakaniPopups();
//        app.loginPage.changeLanguageForUser();
//        logger.info("Step 02: Navigate to the login form");
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
//        logger.info("Step 03: Hover to the services navbar");
//        app.eligibilityPage.hoverToServices();
//        logger.info("Step 04: Click on check eligibility nav title");
//        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
//        logger.info("Step 05: Click on agree on terms and conditions checkbox");
//        app.eligibilityPage.clickOnCheckEligibilityButton();
//        logger.info("Step 06: Click on check eligibility button");
//        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
//        logger.info("Step 07: Click on agree on terms and conditions button");
//        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
//        logger.info("Step 08: Click on acknowledge radio buttons");
//        app.eligibilityPage.clickOnNoRadioButton();
//        app.eligibilityPage.clickOnYesRadioButton();
//        logger.info("Step 09: Click on continue to confirm acknowledge button");
//        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
//        logger.info("Step 10: Select current region dropdown list");
//        app.eligibilityPage.selectFromTheLists(data.get("Current_Region_AR"), data.get("Current_Region_EN"), CheckEligibilityPageObjects.DDLCurrentRegion());
//        logger.info("Step 11: Select current city dropdown list");
//        app.eligibilityPage.selectFromTheLists(data.get("Current_City_AR"), data.get("Current_City_EN"), CheckEligibilityPageObjects.DDLCurrentCity());
//        logger.info("Step 12: Select preferred region dropdown list");
//        app.eligibilityPage.selectFromTheLists(data.get("Preferred_Region_AR"), data.get("Preferred_Region_EN"), CheckEligibilityPageObjects.DDLPreferredRegion());
//        logger.info("Step 13: Select preferred city dropdown list");
//        app.eligibilityPage.selectFromTheLists(data.get("Preferred_City_AR"), data.get("Preferred_City_EN"), CheckEligibilityPageObjects.DDLPreferredCity());
//        logger.info("Step 14: Select preferred district dropdown list");
//        if (Browser.isElementPresent(CheckEligibilityPageObjects.DDLPreferredDistrict())) {
//            app.eligibilityPage.selectFromTheLists(data.get("Preferred_District_AR"), data.get("Preferred_District_EN"), CheckEligibilityPageObjects.DDLPreferredDistrict());
//        }
//        logger.info("Step 15: Select current housing status dropdown list");
//        Browser.executeJSScroll(100);
//        Browser.waitForSeconds(1);
//        app.eligibilityPage.selectFromTheLists(data.get("Current_Housing_Status_AR"), data.get("Current_Housing_Status_EN"), CheckEligibilityPageObjects.DDLCurrentHosingStatus());
//        logger.info("Step 16: Select deed type dropdown lists");
//        Browser.executeJSScroll(350);
//        Browser.waitForSeconds(1);
//        if (Browser.isElementPresent(EligibilityPageObject.deedTypeDropdownList())) {
//            app.eligibilityPage.selectDeedType(data.get("Deed_Type_AR"), data.get("Deed_Type_EN"), EligibilityPageObject.deedTypeDropdownList(), data.get("Construction_Status_AR"), data.get("Construction_Status_EN"),EligibilityPageObject.constructionStatusDropdownList());
//        }
//        logger.info("Step 17: Click on confirm button");
//        app.eligibilityPage.clickOnConfirmButton();
//        app.eligibilityPage.closeWindowOfSurvey();
//        logger.info("Step 18: Navigate to user profile");
//        app.eligibilityPage.hoverToUserIconProfile();
//        app.eligibilityPage.clickOnMyProfileButton();
//        logger.info("Step 19: Click on request appeal");
//        Browser.executeJSScroll(-350);
//        Browser.waitForSeconds(1);
//        app.objectionPage.clickRequestAppealButton();
//        logger.info("Step 20: Select justification dropdown list");
//        app.eligibilityPage.selectFromTheLists(data.get("Justification_AR"), data.get("Justification_EN"), ObjectionPageObjects.justificationDropdownList());
//        logger.info("Step 21: Enter comments textarea");
//        app.objectionPage.enterComments(data.get("Comments"));
//        logger.info("Step 22: Click continue button");
//        app.objectionPage.clickContinueButton();
//        logger.info("Step 23: Upload files of national ID and family card");
//        if (Browser.isElementPresent(ObjectionPageObjects.deleteIconButton())) {
//            Browser.click(ObjectionPageObjects.deleteIconButton());
//            Browser.click(ObjectionPageObjects.deleteIconButton());
//        }
//        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), ObjectionPageObjects.uploadIdFile());
//        CommonUtilityPage.UploadAttachment(data.get("Upload_File"), ObjectionPageObjects.uploadFamilyCardFile());
//        logger.info("Step 24: Click continue button");
//        app.objectionPage.clickContinueButton();
//        logger.info("Step 10: Verify the user navigate to \"تم تقديم الاعتراض بنجاح\" page");
//        CommonUtilityPage.verifyValueIsDisplayed("تم تقديم الاعتراض بنجاح", "You have successfully Submitted your appeal", ObjectionPageObjects.appealSuccessfullySubmittedMessage());

    }


    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_51(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on reassign appeal button");
        app.objectionPage.clickOnReassignAppealButton();
        logger.info("Step 09: Select team dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Team_AR"), data.get("Team_EN"), ObjectionPageObjects.teamDropdownList());
        logger.info("Step 10: Select user dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("User_AR"), data.get("User_EN"), ObjectionPageObjects.userDropdownList());
        logger.info("Step 11: Click on reassign appeal button of the popup");
        app.objectionPage.clickOnReassignAppealOfPopupButton();
        logger.info("Step 12: Click on confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 13: Click on close button of popup");
        app.objectionPage.clickOnCloseOfPopup();
        logger.info("Step 14: Enter comments textarea");
        app.objectionPage.enterCommentsOfPopup(data.get("Comments"));
        logger.info("Step 15: Click on submit appeal request button");
        app.objectionPage.clickOnSubmitTheAppealRequestButton();
        logger.info("Step 16: Click on accept button");
        app.objectionPage.clickOnAcceptButton();
        logger.info("Step 17: Verify a \"تأكيد قبول الاعتراض\" popup window displays");
        app.objectionPage.verifyConfirmAcceptionPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_52(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on accept button");
        app.objectionPage.clickOnAcceptButton();
        logger.info("Step 09: Click cancel button");
        app.objectionPage.clickCancelButton();
        logger.info("Step 10: Verify the admin remains in the same \"بيانات مستفيد\" section");
        app.objectionPage.verifyBeneficiaryDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_53(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on appeals button");
        app.objectionPage.clickOnAppealsButton();
        logger.info("Step 05: Enter beneficiary ID");
        app.objectionPage.enterBeneficiaryID(data.get("Beneficiary_ID"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on searched user");
        app.objectionPage.clickOnTheSearchedUserId();
        logger.info("Step 08: Click on accept button");
        app.objectionPage.clickOnAcceptButton();
        logger.info("Step 09: Click on confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 10: Verify a \"قبول الاعتراض\" popup window displays");
        app.objectionPage.verifyAcceptedAppealPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Objection_TC_54(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify the status will change to \"طلب رفض\" ");
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.rejectedApprovedRequestStatus(),40);
        Browser.moveToElement(ObjectionPageObjects.rejectedApprovedRequestStatus());
        CommonUtilityPage.verifyValueIsDisplayed("اكتمل الطلب", "Request completed", ObjectionPageObjects.rejectedApprovedRequestStatus());
    }
}
