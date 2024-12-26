package sa.nhc.web;

import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.EligibilityPageObject;
import sa.nhc.web.objects.exisitng.CheckEligibilityPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class Eligibility extends NHCWebTest {


    /**
     * Prerequisite new user registration
     */
    @Test(dataProvider = "testDataProvider")
    public void New_User_Registration(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the registration form");
        app.loginPage.changeLanguageForUser();
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
     * Prerequisite user login
     * The user check the eligibility
     * TC_01 to TC_21
     */
    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_01(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to user profile");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Verify the user navigate to my profile page with \"لم يتم التحقق من أهلية استحقاق السكن بعد\" message");
        app.eligibilityPage.verifyTheUserHaveNotCheckedEligibilityYet("You have not checked your eligibility yet", "لم يتم التحقق من أهلية استحقاق السكن بعد");
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_02(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the login form");
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Verify the user able to view \"الخدمات\"");
        app.eligibilityPage.verifyTheServicesIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_03(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Verify the user navigate to \"التحقق من حالة الاستحقاق السكني\" page");
        app.eligibilityPage.verifyCheckEligibilityIntroPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_04(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on check eligibility button");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Verify the user navigate to \"التحقق من أهلية الاستحقاق السكني\" page");
        app.eligibilityPage.verifyCheckEligibilityStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_05(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on check eligibility button");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Verify the \"أوافق على الشروط والأحكام\" button is disabled");
        app.eligibilityPage.verifyAgreeOnTermsAndConditionsButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_06(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Verify the \"أوافق على الشروط والأحكام\" button is enabled");
        app.eligibilityPage.verifyAgreeOnTermsAndConditionsButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_07(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Verify the user navigate to next step \"الإقرار\" page");
        app.eligibilityPage.verifyAcknowledgmentStepPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_08(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 09: Verify the validation message \"الحقل مطلوب\" displays");
        CommonUtilityPage.verifyValueIsDisplayed("الحقل مطلوب", "This field is required", EligibilityPageObject.requiredFieldValidationMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_09(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
        logger.info("Step 09: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 10: Verify the user navigate to next step \"تأكيد المعلومات\" page");
        app.eligibilityPage.verifyTheVerifyInformationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_10(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
        logger.info("Step 09: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 10: Click on back button");
        app.eligibilityPage.clickOnBackButton();
        logger.info("Step 11: Verify the user navigate to previous step \"الإقرار\" page");
        app.eligibilityPage.verifyAcknowledgmentStepPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_11(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
        logger.info("Step 09: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 10: Click on confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the validation message \"الحقل مطلوب\" displays");
        CommonUtilityPage.verifyValueIsDisplayed("الحقل مطلوب", "This field is required", EligibilityPageObject.requiredFieldValidationMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_12(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
        logger.info("Step 09: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 10: Verify the \"مدينة السكن الحالية\" cannot be selected");
        app.eligibilityPage.verifyCurrentCityDropdownListIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_13(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
        logger.info("Step 09: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 10: Verify the \"المدينة المفضلة للسكن\" cannot be selected");
        app.eligibilityPage.verifyPreferredCityDropdownListIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_14(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
        logger.info("Step 09: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 10: Select current region dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Current_Region_AR"), data.get("Current_Region_EN"), CheckEligibilityPageObjects.DDLCurrentRegion());
        logger.info("Step 11: Verify the dropdown list of \"منطقة السكن الحالية\" is selectable");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Current_Region_AR"), data.get("Current_Region_EN"), CheckEligibilityPageObjects.DDLCurrentRegion());
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_15(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
        logger.info("Step 09: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 10: Select current region dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Current_Region_AR"), data.get("Current_Region_EN"), CheckEligibilityPageObjects.DDLCurrentRegion());
        logger.info("Step 11: Select current city dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Current_City_AR"), data.get("Current_City_EN"), CheckEligibilityPageObjects.DDLCurrentCity());
        logger.info("Step 12: Verify the dropdown list of \"مدينة السكن الحالية\" is selectable");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Current_City_AR"), data.get("Current_City_AR"), CheckEligibilityPageObjects.DDLCurrentCity());
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_16(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
        logger.info("Step 09: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        logger.info("Step 10: Select current region dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Current_Region_AR"), data.get("Current_Region_EN"), CheckEligibilityPageObjects.DDLCurrentRegion());
        logger.info("Step 11: Select current city dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Current_City_AR"), data.get("Current_City_EN"), CheckEligibilityPageObjects.DDLCurrentCity());
        logger.info("Step 12: Select preferred region dropdown list");
        app.eligibilityPage.selectFromTheLists(data.get("Preferred_Region_AR"), data.get("Preferred_Region_EN"), CheckEligibilityPageObjects.DDLPreferredRegion());
        logger.info("Step 13: Verify the dropdown list of \"المنطقة المفضلة للسكن\" is selectable");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Preferred_Region_AR"), data.get("Preferred_Region_EN"), CheckEligibilityPageObjects.DDLPreferredRegion());
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_17(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
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
        logger.info("Step 14: Verify the dropdown list of \"المدينة المفضلة للسكن\" is selectable");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Preferred_City_AR"), data.get("Preferred_City_AR"), CheckEligibilityPageObjects.DDLPreferredCity());
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_18(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
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
        logger.info("Step 15: Verify the dropdown list of \"المنطقة المفضلة \" is selectable");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Preferred_District_AR"), data.get("Preferred_District_EN"), CheckEligibilityPageObjects.DDLPreferredDistrict());
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_19(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
        logger.info("Step 09: Click on continue to confirm acknowledge button");
        app.eligibilityPage.clickOnContinueToConfirmAcknowledgeButton();
        Browser.executeJSScroll(500);
        Browser.waitForSeconds(1);
        logger.info("Step 10: Select deed type dropdown lists");
        if (Browser.isElementPresent(EligibilityPageObject.deedTypeDropdownList())) {
            app.eligibilityPage.selectDeedType(data.get("Deed_Type_AR"), data.get("Deed_Type_EN"), EligibilityPageObject.deedTypeDropdownList(), data.get("Construction_Status_AR"), data.get("Construction_Status_EN"),EligibilityPageObject.constructionStatusDropdownList());
        }
        logger.info("Step 11: Verify the dropdown lists of \"معلومات الصك\" are selectable");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Deed_Type_AR"), data.get("Deed_Type_AR"), EligibilityPageObject.deedTypeDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Eligibility_TC_20(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
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
        logger.info("Step 16: Select deed type dropdown lists");
        if (Browser.isElementPresent(EligibilityPageObject.deedTypeDropdownList())) {
            app.eligibilityPage.selectDeedType(data.get("Deed_Type_AR"), data.get("Deed_Type_EN"), EligibilityPageObject.deedTypeDropdownList(), data.get("Construction_Status_AR"), data.get("Construction_Status_EN"),EligibilityPageObject.constructionStatusDropdownList());
        }
        logger.info("Step 17: Click on confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        app.eligibilityPage.verifyTheEligibilityMessage(EligibilityPageObject.congratsMessage());
        logger.info("Step 18: Verify the user navigate to next step with \"تهانينا، أنت الآن مستحق للدعم السكني!\" message");
        CommonUtilityPage.verifyValueIsDisplayed("تهانينا، أنت الآن مستحق للدعم السكني!", "Congrats! You are eligible for housing support.", EligibilityPageObject.congratsMessage());
    }

    /**
     * Prerequisite new user registration
     */
    @Test(dataProvider = "testDataProvider")
    public void New_User_Registration_ForNotEligible(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: Navigate to the registration form");
        app.loginPage.changeLanguageForUser();
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
    public void Eligibility_TC_21(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        logger.info("Step 03: Hover to the services navbar");
        app.eligibilityPage.hoverToServices();
        logger.info("Step 04: Click on check eligibility nav title");
        app.eligibilityPage.clickOnCheckEligibilityNavTitle();
        logger.info("Step 05: Click on agree on terms and conditions checkbox");
        app.eligibilityPage.clickOnCheckEligibilityButton();
        logger.info("Step 06: Click on check eligibility button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsCheckbox();
        logger.info("Step 07: Click on agree on terms and conditions button");
        app.eligibilityPage.clickOnAgreeOnTermsAndConditionsButton();
        logger.info("Step 08: Click on acknowledge radio buttons");
        app.eligibilityPage.clickRadioButtons(EligibilityPageObject.noRadioButton());
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
        logger.info("Step 16: Select deed type dropdown lists");
        if (Browser.isElementPresent(EligibilityPageObject.deedTypeDropdownList())) {
            app.eligibilityPage.selectDeedType(data.get("Deed_Type_AR"), data.get("Deed_Type_EN"), EligibilityPageObject.deedTypeDropdownList(), data.get("Construction_Status_AR"), data.get("Construction_Status_EN"),EligibilityPageObject.constructionStatusDropdownList());
        }
        logger.info("Step 17: Click on confirm button");
        app.eligibilityPage.clickOnConfirmButton();
        logger.info("Step 18: Verify the user navigate to التحقق من أهلية الاستحقاق السكني with عذرا ، أنت غير مؤهل للحصول على الدعم message");
        app.eligibilityPage.closeWindowOfSurvey();
        app.eligibilityPage.verifyTheEligibilityMessage(EligibilityPageObject.notEligibleMessage());
        CommonUtilityPage.verifyValueIsDisplayed("عذرا ، أنت غير مؤهل للحصول على الدعم", "Sorry, you are not eligible for support", EligibilityPageObject.notEligibleMessage());
    }
}

