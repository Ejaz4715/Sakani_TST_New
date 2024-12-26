package sa.nhc.web;

import com.testcrew.web.Browser;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.FullBookingJourneyPageObjects;
import sa.nhc.web.objects.MOHLandBookingJourneyPageObjects;
import sa.nhc.web.objects.QueueingOffPlanPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

import static com.testcrew.web.Browser.driver;

public class QueueingOffPlan extends NHCWebTest {

    /**
     * Prerequisite existing offplan project / Active Queueing is disabled
     * The admin activate queueing feature
     * TC_01 to TC_12
     */
    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_01(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Verify the admin is able to view projects page");
        app.fullBookingJourneyPage.verifyProjectsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_02(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Invalid_Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Verify the \"لا يوجد بيانات للعرض\" will display in projects result");
        CommonUtilityPage.verifyValueIsDisplayed("لا توجد بيانات لعرضها", "There’s no data to be shown", MOHLandBookingJourneyPageObjects.InvalidSearchValueResult());
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_03(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Verify the admin is able to view project");
        app.queueingOffPlanPage.verifyTheSearchProjectIsDisplayed(data.get("Project_Name"));
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_04(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on the searched project name");
        app.queueingOffPlanPage.clickOnTheSearchProjectIsDisplayed(data.get("Project_Name"));
        logger.info("Step 08: Verify the admin navigate to \"تفاصيل المشروع\" page");
        app.fullBookingJourneyPage.verifyProjectDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_05(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on the searched project name");
        app.queueingOffPlanPage.clickOnTheSearchProjectIsDisplayed(data.get("Project_Name"));
        logger.info("Step 08: Click project setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 09: Verify the \"إعدادات المشاريع\" is displays");
        app.queueingOffPlanPage.verifyTheProjectDetailsIsDisplayed();
        if(Boolean.parseBoolean(Browser.getAttributeValue(QueueingOffPlanPageObjects.activeQueueingToggleInput(), "aria-checked"))){
            Browser.moveToElement(QueueingOffPlanPageObjects.activeQueueingToggle());
            Browser.click(QueueingOffPlanPageObjects.activeQueueingToggle());
            Browser.moveToElement(FullBookingJourneyPageObjects.SaveButton());
            Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.SaveButton(),40);
            Browser.click(FullBookingJourneyPageObjects.SaveButton());
        }
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_06(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on the searched project name");
        app.queueingOffPlanPage.clickOnTheSearchProjectIsDisplayed(data.get("Project_Name"));
        logger.info("Step 08: Click project setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 09: Verify the \"الحد الأقصى لعدد المسموح لهم بالحجز في نفس الوقت\" is disabled");
        app.queueingOffPlanPage.verifyTheMaxNumberOfUsersCanBookAtTheSameTimeIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_07(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on the searched project name");
        app.queueingOffPlanPage.clickOnTheSearchProjectIsDisplayed(data.get("Project_Name"));
        logger.info("Step 08: Click project setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 09: Click active queueing toggle");
        app.queueingOffPlanPage.clickOnActiveQueueingToggle();
        logger.info("Step 10: Clear the max number of users can book at the same time input field");
        app.queueingOffPlanPage.clearTheTextOfTheMaxNumberOfUsersCanBookAtTheSameTimeInputField();
        logger.info("Step 11: Enter the max number of users can book at the same time input field");
        app.queueingOffPlanPage.enterTheMaxNumberOfUsersCanBookAtTheSameTimeInputField(data.get("Max_Active_Queueing_Member"));
        logger.info("Step 12: Verify the data in entered");
        CommonUtilityPage.verifyValueIsEntered(data.get("Max_Active_Queueing_Member"), QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_08(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on the searched project name");
        app.queueingOffPlanPage.clickOnTheSearchProjectIsDisplayed(data.get("Project_Name"));
        logger.info("Step 08: Click project setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 09: Click active queueing toggle");
        app.queueingOffPlanPage.clickOnActiveQueueingToggle();
        logger.info("Step 10: Clear the max number of users can book at the same time input field");
        app.queueingOffPlanPage.clearTheTextOfTheMaxNumberOfUsersCanBookAtTheSameTimeInputField();
        logger.info("Step 11: Verify the validation message \"الحقل مطلوب\" displays");
        CommonUtilityPage.verifyValueIsDisplayed("الحقل مطلوب", "This field is required", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_09(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on the searched project name");
        app.queueingOffPlanPage.clickOnTheSearchProjectIsDisplayed(data.get("Project_Name"));
        logger.info("Step 08: Click project setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 09: Click active queueing toggle");
        app.queueingOffPlanPage.clickOnActiveQueueingToggle();
        logger.info("Step 10: Clear the max number of users can book at the same time input field");
        app.queueingOffPlanPage.clearTheTextOfTheMaxNumberOfUsersCanBookAtTheSameTimeInputField();
        logger.info("Step 11: Enter invalid data of the max number of users can book at the same time input field");
        app.queueingOffPlanPage.enterTheMaxNumberOfUsersCanBookAtTheSameTimeInputField(data.get("Invalid_Max_Active_Queueing_Member"));
        logger.info("Step 12: Verify the validation message \"القيمة المدخلة غير صالحة، يرجى التحقق من المدخلات\" displays");
        CommonUtilityPage.verifyValueIsDisplayed("القيمة المدخلة غير صالحة، يرجى التحقق من المدخلات", "The value is invalid or wrong format", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_10(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on the searched project name");
        app.queueingOffPlanPage.clickOnTheSearchProjectIsDisplayed(data.get("Project_Name"));
        logger.info("Step 08: Click project setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 09: Click active queueing toggle");
        app.queueingOffPlanPage.clickOnActiveQueueingToggle();
        logger.info("Step 10: Clear the max number of users can book at the same time input field");
        app.queueingOffPlanPage.clearTheTextOfTheMaxNumberOfUsersCanBookAtTheSameTimeInputField();
        logger.info("Step 11: Enter number zero of the max number of users can book at the same time input field");
        app.queueingOffPlanPage.enterTheMaxNumberOfUsersCanBookAtTheSameTimeInputField(data.get("Zero_Max_Active_Queueing_Member"));
        logger.info("Step 12: Verify the validation message \"القيمة المدخلة خاطئة. أقل قيمة ممكنة هي 1\" displays");
        CommonUtilityPage.verifyValueIsDisplayed("القيمة المدخلة خاطئة. أقل قيمة ممكنة هي 1", "Minimum amount doesn't match", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_11(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on the searched project name");
        app.queueingOffPlanPage.clickOnTheSearchProjectIsDisplayed(data.get("Project_Name"));
        logger.info("Step 08: Click project setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 09: Click active queueing toggle");
        app.queueingOffPlanPage.clickOnActiveQueueingToggle();
        logger.info("Step 10: Clear the max number of users can book at the same time input field");
        app.queueingOffPlanPage.clearTheTextOfTheMaxNumberOfUsersCanBookAtTheSameTimeInputField();
        logger.info("Step 11: Enter negative number of the max number of users can book at the same time input field");
        app.queueingOffPlanPage.enterTheMaxNumberOfUsersCanBookAtTheSameTimeInputField(data.get("Negative_Number_Max_Active_Queueing_Member"));
        logger.info("Step 12: Verify the validation messages القيمة المدخلة غير صالحة، يرجى التحقق من المدخلات and القيمة المدخلة خاطئة. أقل قيمة ممكنة هي 1 displays");
        CommonUtilityPage.verifyValueIsDisplayed("القيمة المدخلة غير صالحة، يرجى التحقق من المدخلات", "The value is invalid or wrong format", FullBookingJourneyPageObjects.InputFieldError());
        CommonUtilityPage.verifyValueIsDisplayed("القيمة المدخلة خاطئة. أقل قيمة ممكنة هي 1", "Minimum amount doesn't match", QueueingOffPlanPageObjects.InputFieldError1());
    }

    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_12(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on internal inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Enter invalid project name");
        app.queueingOffPlanPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Click on search button");
        app.objectionPage.clickSearchButton();
        logger.info("Step 07: Click on the searched project name");
        app.queueingOffPlanPage.clickOnTheSearchProjectIsDisplayed(data.get("Project_Name"));
        logger.info("Step 08: Click project setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 09: Click active queueing toggle");
        app.queueingOffPlanPage.clickOnActiveQueueingToggle();
        logger.info("Step 10: Clear the max number of users can book at the same time input field");
        app.queueingOffPlanPage.clearTheTextOfTheMaxNumberOfUsersCanBookAtTheSameTimeInputField();
        logger.info("Step 11: Enter the max number of users can book at the same time input field");
        app.queueingOffPlanPage.enterTheMaxNumberOfUsersCanBookAtTheSameTimeInputField(data.get("Max_Active_Queueing_Member"));
        logger.info("Step 12: Click on save button");
        app.fullBookingJourneyPage.clickOnSaveButton();
        logger.info("Step 13: Verify a \"تم الحفظ بنجاح\" toast message will display");
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Record saved successfully", "تم الحفظ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }
    /**
     * Prerequisite user login / The user check the eligibility / No booked project
     * The user join the queue
     * TC_13 to TC_20
     */
    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_13(Map<String, String> data) throws Exception {
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
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Verify the \"تصفية النتائج\" popup window will display");
        app.mohLandBookingJourneyPage.verifyFilterResultPopupIsDisplayed();
    }
    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_14(Map<String, String> data) throws Exception {
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
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 05: Verify the enter text will display");
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Name"), MOHLandBookingJourneyPageObjects.projectInputFiled());
    }
    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_15(Map<String, String> data) throws Exception {
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
    public void Queueing_OffPlan_TC_16(Map<String, String> data) throws Exception {
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
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Verify the searched project will display");
        app.mohLandBookingJourneyPage.verifyTheSearchProjectIsDisplayed(data.get("Project_Name"));
    }
    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_17(Map<String, String> data) throws Exception {
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
    public void Queueing_OffPlan_TC_18(Map<String, String> data) throws Exception {
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
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on the unit list button");
        app.queueingOffPlanPage.clickOnUnitListButton();
        logger.info("Step 08: Verify the \"هناك حاليا 0 أشخاص في الطابور. \" message will display");
        CommonUtilityPage.verifyValueIsDisplayed("0", "0", QueueingOffPlanPageObjects.queueingMessage());
    }
    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_19(Map<String, String> data) throws Exception {
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
        logger.info("Step 03: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name and select");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 05: Click on view button");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 06: Click on the searched project");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 07: Click on the unit list button");
        app.queueingOffPlanPage.clickOnUnitListButton();
        logger.info("Step 08: Click on join now button");
        app.queueingOffPlanPage.clickOnJoinNowButton();
        logger.info("Step 09: Verify the user navigate to the book details");
        app.queueingOffPlanPage.verifyBookingDetailsListIsDisplayed();
    }
    @Test(dataProvider = "testDataProvider")
    public void Queueing_OffPlan_TC_20(Map<String, String> data) throws Exception {
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
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(data.get("URL"));
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        app.loginPage.userLogin(data.get("Second_Username"), data.get("Second_Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        app.mohLandBookingJourneyPage.clickOnViewButton();
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        app.queueingOffPlanPage.clickOnUnitListButton();
        app.queueingOffPlanPage.clickOnJoinNowButton();
        logger.info("Step 09: Verify the \"أنت 1 في قائمة الادوار!\" message will display");
        app.queueingOffPlanPage.verifyLeaveQueueButtonIsDisplayed();
        CommonUtilityPage.verifyValueIsDisplayed("1", "1", QueueingOffPlanPageObjects.queueingMessage());
    }
}
