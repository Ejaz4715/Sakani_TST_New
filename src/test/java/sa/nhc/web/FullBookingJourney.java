package sa.nhc.web;

import com.testcrew.manager.TestDataManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.FullAuctionJourneyPageObjects;
import sa.nhc.web.objects.FullBookingJourneyPageObjects;
import sa.nhc.web.objects.SalesContractPageObject;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class FullBookingJourney extends NHCWebTest {

    /**
     * Admin creates the contract
     * From TC_01 - TC_104
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_01_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        app.fullBookingJourneyPage.verifyProjectsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        app.fullBookingJourneyPage.verifyProjectsPageIsDisplayed();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        app.fullBookingJourneyPage.verifyProjectDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Enter Project Name");
        app.fullBookingJourneyPage.enterProjectTitle(data.get("Project_Name"));
        logger.info("Step 07: Enter Secondary title");
        app.fullBookingJourneyPage.enterSecondaryTitle(data.get("Secondary_Title"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Name"), FullBookingJourneyPageObjects.ProjectTitleInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Secondary_Title"), FullBookingJourneyPageObjects.SecondaryTitleInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Enter Project Name less than 5 digits");
        app.fullBookingJourneyPage.enterProjectTitle("A");
        CommonUtilityPage.verifyErrorMessageIsDisplayed("Too short. Required length is 5", "القيمة المدخلة جدا قصيرة، الطول المطلوب هو 5", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Enter Project Name");
        app.fullBookingJourneyPage.enterProjectTitle(data.get("Project_Name"));
        logger.info("Step 07: Choose project type");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        CommonUtilityPage.verifyOptionIsSelected(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Enter Project Name");
        app.fullBookingJourneyPage.enterProjectTitle(data.get("Project_Name"));
        logger.info("Step 07: Choose region");
        app.fullBookingJourneyPage.clickOnRegionDropdown();
        app.fullBookingJourneyPage.selectRegion(data.get("Region_EN"), data.get("Region_AR"));
        CommonUtilityPage.verifyOptionIsSelected(data.get("Region_EN"), data.get("Region_AR"), FullBookingJourneyPageObjects.RegionDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Enter Project Name");
        app.fullBookingJourneyPage.enterProjectTitle(data.get("Project_Name"));
        logger.info("Step 07: Choose region");
        app.fullBookingJourneyPage.clickOnRegionDropdown();
        app.fullBookingJourneyPage.selectRegion(data.get("Region_EN"), data.get("Region_AR"));
        logger.info("Step 08: Enter city name and select from dropdown option");
        app.fullBookingJourneyPage.enterCityName(data.get("City_EN"), data.get("City_AR"));
        CommonUtilityPage.verifyCityIsDisplayed(data.get("City_AR"), FullBookingJourneyPageObjects.CityNameInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Enter Project Name");
        app.fullBookingJourneyPage.enterProjectTitle(data.get("Project_Name"));
        logger.info("Step 07: Enter Developer name & Select Developer name from the displayed list");
        app.fullBookingJourneyPage.enterDeveloperName(data.get("Developer_Name"));
        app.fullBookingJourneyPage.verifyDeveloperNameIsEntered(data.get("Developer_Name"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Enter Project Name");
        app.fullBookingJourneyPage.enterProjectTitle(data.get("Project_Name"));
        logger.info("Step 07: Select Subsidize level");
        app.fullBookingJourneyPage.clickOnSubsidizeDropdown();
        CommonUtilityPage.selectFromList(data.get("Subsidize_Level_EN"), data.get("Subsidize_Level_AR"), FullBookingJourneyPageObjects.SubsidizeDropdownList());
        CommonUtilityPage.verifyOptionIsSelected(data.get("Subsidize_Level_EN"), data.get("Subsidize_Level_AR"), FullBookingJourneyPageObjects.SubsidizeDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Enter Project Name");
        app.fullBookingJourneyPage.enterProjectTitle(data.get("Project_Name"));
        logger.info("Step 07: Choose project type");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 08: Select Mega Project Type");
        app.fullBookingJourneyPage.clickOnMegaProjectDropdown();
        app.fullBookingJourneyPage.selectMegaProject(data.get("MegaProject_Type_EN"), data.get("MegaProject_Type_AR"));
        CommonUtilityPage.verifyOptionIsSelected(data.get("MegaProject_Type_EN"), data.get("MegaProject_Type_AR"), FullBookingJourneyPageObjects.MegaProjectDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Click on Is Bookable radio button");
        app.fullBookingJourneyPage.clickOnIsBookableToggle();
        app.fullBookingJourneyPage.verifyIsBookableToggleIsOn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Status");
        app.fullBookingJourneyPage.clickOnStatusDropdown();
        CommonUtilityPage.selectFromList(data.get("Status_EN"), data.get("Status_AR"), FullBookingJourneyPageObjects.StatusDropdownList());
        CommonUtilityPage.verifyOptionIsSelected(data.get("Status_EN"), data.get("Status_AR"), FullBookingJourneyPageObjects.StatusDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Enter WAFI expiry date");
        app.fullBookingJourneyPage.enterWafiExpiryDate(data.get("WAFi_Expiry_Date"));
        app.fullBookingJourneyPage.verifyWafiExpiryDateIsEntered(data.get("WAFi_Expiry_Date"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Select Subsidy type from dropdown");
        app.fullBookingJourneyPage.clickOnSubsidyTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Subsidy_Type_EN"), data.get("Subsidy_Type_AR"), FullBookingJourneyPageObjects.SubsidyTypeDropdownList());
        CommonUtilityPage.verifyOptionIsSelected(data.get("Subsidy_Type_EN"), data.get("Subsidy_Type_AR"), FullBookingJourneyPageObjects.SubsidyTypeDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Enter Max subsidy amount");
        app.fullBookingJourneyPage.enterMaxSubsidyAmount(data.get("Max_Subsidy_Amount"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Max_Subsidy_Amount"), FullBookingJourneyPageObjects.SubsidyAmountInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click on calendar icon beside 'Project agreement sign date' input");
        app.fullBookingJourneyPage.clickOnProjectAgreementDateCalender();
        logger.info("Step 08: Select the date from calendar");
        app.fullBookingJourneyPage.selectDateFromCalender(data.get("Project_Agreement_Date"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Agreement_Date"), FullBookingJourneyPageObjects.ProjectAgreementDateInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Enter project license number");
        app.fullBookingJourneyPage.enterProjectLicenseNumber(data.get("Project_License_Num"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_License_Num"), FullBookingJourneyPageObjects.ProjectLicenseNumberInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click on calender icon beside 'Project license date' input");
        app.fullBookingJourneyPage.clickOnProjectLicenseDateCalender();
        logger.info("Step 08: Select the date from calendar");
        app.fullBookingJourneyPage.selectDateFromCalender(data.get("Project_License_Date"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_License_Date"), FullBookingJourneyPageObjects.ProjectLicenseDateInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Enter Escrow account number");
        app.fullBookingJourneyPage.enterAccountNumber(data.get("Account_Num"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Account_Num"), FullBookingJourneyPageObjects.EscrowAccountInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Enter Escrow account number");
        app.fullBookingJourneyPage.clickOnBankNameDropdown();
        CommonUtilityPage.selectFromList(data.get("Bank_Name"), FullBookingJourneyPageObjects.BankNameDropdownList());
        CommonUtilityPage.verifyOptionIsSelected(data.get("Bank_Name"), FullBookingJourneyPageObjects.BankNameDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Enter Project deduct percentage ");
        app.fullBookingJourneyPage.enterProjectDeductPercentage(data.get("Deduct_Percentage"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Deduct_Percentage"), FullBookingJourneyPageObjects.ProjectDeductPercentageInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Enter deed city");
        app.fullBookingJourneyPage.enterDeedCity(data.get("Deed_City"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Deed_City"), FullBookingJourneyPageObjects.DeedCityInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Enter Land delivery date to the developer");
        app.fullBookingJourneyPage.enterLandDeliveryDate(data.get("Land_Delivery_Date"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Land_Delivery_Date"), FullBookingJourneyPageObjects.LandDeliveryDateInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click on  show Mullak content radio button");
        app.fullBookingJourneyPage.clickOnShowMullakToggle();
        app.fullBookingJourneyPage.verifyShowMullakToggleIsOn();
        logger.info("Step 08: Click on show Wafi logo and content radio button");
        app.fullBookingJourneyPage.clickOnShowWafiLogoToggle();
        app.fullBookingJourneyPage.verifyShowWafiLogoToggleIsOn();
        logger.info("Step 09: Click on  Show completion percentage radio button");
        app.fullBookingJourneyPage.clickOnShowCompletionPercentageToggle();
        app.fullBookingJourneyPage.verifyShowCompletionPercentageToggleIsOn();
        logger.info("Step 10: Click on  Incentivize project radio button");
        app.fullBookingJourneyPage.clickOnIncentivizeProjectToggle();
        app.fullBookingJourneyPage.verifyIncentivizeProjectToggleIsOn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click on Additional Info label");
        app.fullBookingJourneyPage.clickOnAdditionalInfoTab();
        logger.info("Step 08: Enter Crm Code");
        app.fullBookingJourneyPage.enterCRMCode(data.get("CRM_Code"));
        logger.info("Step 09: Enter Deed Number");
        app.fullBookingJourneyPage.enterDeedNumber(data.get("Deed_Number"));
        CommonUtilityPage.verifyValueIsEntered(data.get("CRM_Code"), FullBookingJourneyPageObjects.CRMCodeInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Deed_Number"), FullBookingJourneyPageObjects.DeedNumberInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click on Additional Info label");
        app.fullBookingJourneyPage.clickOnAdditionalInfoTab();
        logger.info("Step 08: Enter Deed Date");
        app.fullBookingJourneyPage.enterDeedDate(data.get("Deed_Date"));
        logger.info("Step 09: Enter PLan Number");
        app.fullBookingJourneyPage.enterPlanNumber(data.get("Plan_Number"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Deed_Date"), FullBookingJourneyPageObjects.DeedDateInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Plan_Number"), FullBookingJourneyPageObjects.PlanNumberInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click on Additional Info label");
        app.fullBookingJourneyPage.clickOnAdditionalInfoTab();
        logger.info("Step 08: Enter Property Year Of Built");
        app.fullBookingJourneyPage.enterPropertyYearOfBuilt(data.get("Property_Year_Of_Built"));
        logger.info("Step 09: Enter Developer Warranty Period");
        app.fullBookingJourneyPage.enterDeveloperWarrantyPeriod(data.get("Dev_Warranty_Period"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Property_Year_Of_Built"), FullBookingJourneyPageObjects.PropertyYearOfBuiltInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Dev_Warranty_Period"), FullBookingJourneyPageObjects.DeveloperWarrantyPeriodInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click on Additional Info label");
        app.fullBookingJourneyPage.clickOnAdditionalInfoTab();
        logger.info("Step 08: Enter Consultant Design Office");
        app.fullBookingJourneyPage.enterConsultantDesignOffice(data.get("Consultant_Design_Office"));
        logger.info("Step 09: Enter Consultant Design Office License Number");
        app.fullBookingJourneyPage.enterConsultantDesignOfficeLicenseNum(data.get("Design_Office_License_Num"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Consultant_Design_Office"), FullBookingJourneyPageObjects.ConsultantDesignOfficeInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Design_Office_License_Num"), FullBookingJourneyPageObjects.ConsultantDesignOfficeLicenseNumInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click on Additional Info label");
        app.fullBookingJourneyPage.clickOnAdditionalInfoTab();
        logger.info("Step 08: Enter Consultant Construction Office");
        app.fullBookingJourneyPage.enterConsultantConstructionOffice(data.get("Consultant_Construction_Office"));
        logger.info("Step 09: Enter Consultant Construction Office License Number");
        app.fullBookingJourneyPage.enterConsultantConstructionLicenseNum(data.get("Consultant_Construction_License_Num"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Consultant_Construction_Office"), FullBookingJourneyPageObjects.ConsultantConstructionOfficeInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Consultant_Construction_License_Num"), FullBookingJourneyPageObjects.ConsultantConstructionLicenseNumInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click on Additional Info label");
        app.fullBookingJourneyPage.clickOnAdditionalInfoTab();
        logger.info("Step 08: Enter District name");
        app.fullBookingJourneyPage.enterDistrictName(data.get("District_Name"));
        logger.info("Step 09: Enter Project readiness date");
        app.fullBookingJourneyPage.enterProjectReadinessDate(data.get("Project_Readiness_Date"));
        CommonUtilityPage.verifyValueIsEntered(data.get("District_Name"), FullBookingJourneyPageObjects.ProjectReadinessDateInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Readiness_Date"), FullBookingJourneyPageObjects.DistrictNameInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_31_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click on Additional Info label");
        app.fullBookingJourneyPage.clickOnAdditionalInfoTab();
        logger.info("Step 08: Enter Latitude value");
        app.fullBookingJourneyPage.enterLatitude(data.get("Latitude"));
        logger.info("Step 09: Enter Longitude value");
        app.fullBookingJourneyPage.enterLongitude(data.get("Longitude"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Latitude"), FullBookingJourneyPageObjects.LatitudeInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Longitude"), FullBookingJourneyPageObjects.LongitudeInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Enter Acceptance Expiry Period in days");
        app.fullBookingJourneyPage.enterAcceptanceExpiryPeriod(data.get("Acceptance_Expiry_Period"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Acceptance_Expiry_Period"), FullBookingJourneyPageObjects.AcceptanceExpiryPeriodInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Enter Initial booking expiry period in days");
        app.fullBookingJourneyPage.enterInitialBookingExpiryPeriod(data.get("Initial_Booking_Expiry"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Initial_Booking_Expiry"), FullBookingJourneyPageObjects.InitialBookingExpiryInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Enter Building permit period in months");
        app.fullBookingJourneyPage.enterBuildingPermitPeriod(data.get("Building_Permit_Period"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Building_Permit_Period"), FullBookingJourneyPageObjects.BuildingPermitPeriodInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on Using general booking fee setting ");
        app.fullBookingJourneyPage.clickOnUsingGeneralBookingFeeToggle();
        app.fullBookingJourneyPage.clickOnUsingGeneralBookingFeeToggle();
        app.fullBookingJourneyPage.verifyUsingGeneralBookingFeeToggleIsON();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on Using general booking fee setting ");
        app.fullBookingJourneyPage.clickOnUsingGeneralBookingFeeToggle();
        logger.info("Step 09: Enter Booking Fees ");
        app.fullBookingJourneyPage.enterBookingFee(data.get("Booking_Fee"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Booking_Fee"), FullBookingJourneyPageObjects.BookingFeeInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_37_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on Using general extend price quotation setting toggle ");
        app.fullBookingJourneyPage.clickOnUsingGeneralExtendPriceQuotationToggle();
        app.fullBookingJourneyPage.verifyUsingGeneralExtendPriceQuotationToggleIsON();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_38_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on Using general extend price quotation setting toggle");
        app.fullBookingJourneyPage.clickOnUsingGeneralExtendPriceQuotationToggle();
        logger.info("Step 09: Enter Extend price quotation day");
        app.fullBookingJourneyPage.enterExtendPriceQuotationDay(data.get("Extend_Price_Quotation_Day"));
        logger.info("Step 10: Extend price quotation fee");
        app.fullBookingJourneyPage.enterExtendPriceQuotationFee(data.get("Extend_Price_Quotation_Fee"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Extend_Price_Quotation_Day"), FullBookingJourneyPageObjects.ExtendPriceQuotationDayInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Extend_Price_Quotation_Fee"), FullBookingJourneyPageObjects.ExtendPriceQuotationFeeInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_39_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on Using general extend price quotation setting toggle");
        app.fullBookingJourneyPage.clickOnUsingGeneralExtendPriceQuotationToggle();
        logger.info("Step 09: Enter Extend price quotation day including alphabets");
        app.fullBookingJourneyPage.enterExtendPriceQuotationDay("aaa");
        CommonUtilityPage.verifyErrorMessageIsDisplayed("The value is invalid or wrong format", "القيمة المدخلة غير صالحة، يرجى التحقق من المدخلات", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on Using general extend price quotation setting toggle");
        app.fullBookingJourneyPage.clickOnUsingGeneralExtendPriceQuotationToggle();
        logger.info("Step 09: Extend price quotation fee including alphabets");
        app.fullBookingJourneyPage.enterExtendPriceQuotationFee("aaa");
        CommonUtilityPage.verifyErrorMessageIsDisplayed("The value is invalid or wrong format", "القيمة المدخلة غير صالحة، يرجى التحقق من المدخلات", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_41_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on  'Activate multiple units booking for non-beneficiary in Sakani (Web)' ");
        app.fullBookingJourneyPage.clickOnActivateMultipleUnitsBookingForNonBeneWebToggle();
        app.fullBookingJourneyPage.verifyActivateMultipleUnitsBookingForNonBeneWebToggleIsOn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_42_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on 'Activate multiple units booking for non-beneficiary in Sakani Partner' ");
        app.fullBookingJourneyPage.clickOnActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggle();
        app.fullBookingJourneyPage.verifyActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggleIsOn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_43_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on 'Activate multiple units booking for non-beneficiary in Sakani Partner' & 'Activate multiple units booking for non-beneficiary in Sakani (Web)'");
        app.fullBookingJourneyPage.clickOnActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggle();
        app.fullBookingJourneyPage.clickOnActivateMultipleUnitsBookingForNonBeneWebToggle();
        logger.info("Step 09: Enter value 'Maximum number of bookings for non-beneficiary' input field '");
        app.fullBookingJourneyPage.enterMaximumNumberOfBookingsForNonBene(data.get("Max_Num_Of_Booking_Non_Bene"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Max_Num_Of_Booking_Non_Bene"), FullBookingJourneyPageObjects.MaximumNumberOfBookingsForNonBeneInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_44_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Verify 'Maximum number of bookings for non-beneficiary' input field is disabled");
        app.fullBookingJourneyPage.verifyMaximumNumberOfBookingsForNonBeneInputIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_45_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Verify 'Booking Fee' input field is disabled");
        app.fullBookingJourneyPage.verifyBookingFeeInputIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_46_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Verify 'Extend price quotation fee' input field is disabled");
        app.fullBookingJourneyPage.verifyExtendPriceQuotationFeeInputIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_47_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Verify 'Extend price quotation day' input field is disabled");
        app.fullBookingJourneyPage.verifyExtendPriceQuotationDayInputIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_48_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on  'Active queueing' radio button ");
        app.fullBookingJourneyPage.clickOnActiveQueuingToggle();
        app.fullBookingJourneyPage.verifyActiveQueuingToggleIsOn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_49_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on  'Active queueing' radio button ");
        app.fullBookingJourneyPage.clickOnActiveQueuingToggle();
        logger.info("Step 09: Enter value in 'Max number of users can book at the same time' field");
        app.fullBookingJourneyPage.enterMaxNumberOfUserAbleToBook(data.get("Max_User_Booking_At_Same_Time"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Max_User_Booking_At_Same_Time"), FullBookingJourneyPageObjects.MaximumNumberOfUserAbleToBook());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_50_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Verify 'Max number of users can book at the same time' field is disabled");
        app.fullBookingJourneyPage.verifyMaxNumberOfUserAbleToBookFieldIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_51_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 07: Click Project Setting label");
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        logger.info("Step 08: Click on save button");
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyErrorMessageIsDisplayed("This field is required", "الحقل مطلوب", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_52_Full_Booking_Journey(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Click on Projects");
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 06: Enter Project Name");
        String projectName = data.get("Project_Name") + RandomStringUtils.randomNumeric(5);
        app.fullBookingJourneyPage.enterProjectTitle(projectName);
        TestDataManager.addDependantGlobalTestData("Projects", "ProjectName", projectName);
        TestDataManager.writeDependantGlobalTestData("Projects");
        logger.info("Step 07: Select Project Type (Offplan MOH)");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 08: Select Region from dropdown");
        app.fullBookingJourneyPage.clickOnRegionDropdown();
        app.fullBookingJourneyPage.selectRegion(data.get("Region_EN"), data.get("Region_AR"));
        logger.info("Step 09: Select City");
        app.fullBookingJourneyPage.enterCityName(data.get("City_EN"), data.get("City_AR"));
        app.fullBookingJourneyPage.verifyCityNameIsEntered(data.get("City_EN"), data.get("City_AR"));
        logger.info("Step 10: Select Developer name from the displayed list");
        app.fullBookingJourneyPage.enterDeveloperName(data.get("Developer_Name"));
        logger.info("Step 11: Select Subsidize level");
        app.fullBookingJourneyPage.clickOnSubsidizeDropdown();
        CommonUtilityPage.selectFromList(data.get("Subsidize_Level_EN"), data.get("Subsidize_Level_AR"), FullBookingJourneyPageObjects.SubsidizeDropdownList());
        logger.info("Step 12: Click on Is Bookable radio button");
        app.fullBookingJourneyPage.clickOnIsBookableToggle();
        logger.info("Step 13: Select Status");
        app.fullBookingJourneyPage.clickOnStatusDropdown();
        CommonUtilityPage.selectFromList(data.get("Status_EN"), data.get("Status_AR"), FullBookingJourneyPageObjects.StatusDropdownList());
        logger.info("Step 14: Select Subsidy type from dropdown");
        app.fullBookingJourneyPage.clickOnSubsidyTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Subsidy_Type_EN"), data.get("Subsidy_Type_AR"), FullBookingJourneyPageObjects.SubsidyTypeDropdownList());
        logger.info("Step 15: Enter Max subsidy amount");
        app.fullBookingJourneyPage.enterMaxSubsidyAmount(data.get("Max_Subsidy_Amount"));
        logger.info("Step 16: Click on calendar icon beside 'Project agreement sign date' input");
        app.fullBookingJourneyPage.clickOnProjectAgreementDateCalender();
        logger.info("Step 17: Select the date form calendar");
        app.fullBookingJourneyPage.selectDateFromCalender(data.get("Project_Agreement_Date"));
        logger.info("Step 18: Enter Project license number");
        app.fullBookingJourneyPage.enterProjectLicenseNumber(data.get("Project_License_Num"));
        logger.info("Step 19: Click calendar icon 'Project license date' input");
        app.fullBookingJourneyPage.clickOnProjectLicenseDateCalender();
        logger.info("Step 20: Select the date form calendar");
        app.fullBookingJourneyPage.selectDateFromCalender(data.get("Project_License_Date"));
        logger.info("Step 21: Enter Escrow account number");
        app.fullBookingJourneyPage.enterAccountNumber(data.get("Account_Num"));
        logger.info("Step 22: Select Escrow account bank from the list");
        app.fullBookingJourneyPage.clickOnBankNameDropdown();
        CommonUtilityPage.selectFromList(data.get("Bank_Name"), FullBookingJourneyPageObjects.BankNameDropdownList());
        logger.info("Step 23: Enter Project deduct percentage");
        app.fullBookingJourneyPage.enterProjectDeductPercentage(data.get("Deduct_Percentage"));
        logger.info("Step 24: Enter Deed city");
        app.fullBookingJourneyPage.enterDeedCity(data.get("Deed_City"));
        logger.info("Step 25: Enter Land delivery date to the developer");
        app.fullBookingJourneyPage.enterLandDeliveryDate(data.get("Land_Delivery_Date"));
        logger.info("Step 26: Click on save button");
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Record saved successfully", "تم الحفظ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_53_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Units tab");
        app.fullBookingJourneyPage.clickOnUnitsTab();
        CommonUtilityPage.verifyValueIsDisplayed("رمز الوحدة السكنية التعريفي", "Unit Code", FullBookingJourneyPageObjects.UnitCodeLabel());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_54_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Units tab");
        app.fullBookingJourneyPage.clickOnUnitsTab();
        logger.info("Step 07: Click on New Import Unit button");
        app.fullBookingJourneyPage.clickOnNewImportUnitButton();
        CommonUtilityPage.verifyValueIsDisplayed("استيراد", "Import", FullBookingJourneyPageObjects.UnitImportPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_55_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Units tab");
        app.fullBookingJourneyPage.clickOnUnitsTab();
        logger.info("Step 07: Click on New Import Unit button");
        app.fullBookingJourneyPage.clickOnNewImportUnitButton();
        logger.info("Step 08: Click on unit type dropdown");
        app.fullBookingJourneyPage.clickOnUnitTypeDropdown();
        logger.info("Step 09: Select unit type");
        CommonUtilityPage.selectFromList(data.get("Unit_Type_AR"), data.get("Unit_Type_EN"), FullBookingJourneyPageObjects.UnitTypeDropdownList());
        CommonUtilityPage.verifyOptionIsSelected(data.get("Unit_Type_AR"), data.get("Unit_Type_EN"), FullBookingJourneyPageObjects.UnitTypeDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_56_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Units tab");
        app.fullBookingJourneyPage.clickOnUnitsTab();
        logger.info("Step 07: Click on New Import Unit button");
        app.fullBookingJourneyPage.clickOnNewImportUnitButton();
        logger.info("Step 08: Upload file (Any format except xlsx)");
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.UploadUnitImportFile());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.InvalidUnitImportFileErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_57_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Units tab");
        app.fullBookingJourneyPage.clickOnUnitsTab();
        logger.info("Step 07: Click on New Import Unit button");
        app.fullBookingJourneyPage.clickOnNewImportUnitButton();
        logger.info("Step 08: Verify Save button is disabled");
        app.fullBookingJourneyPage.verifySaveButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_58_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Units tab");
        app.fullBookingJourneyPage.clickOnUnitsTab();
        logger.info("Step 07: Click on New Import Unit button");
        app.fullBookingJourneyPage.clickOnNewImportUnitButton();
        logger.info("Step 08: Click on unit type dropdown");
        app.fullBookingJourneyPage.clickOnUnitTypeDropdown();
        logger.info("Step 09: Select unit type");
        CommonUtilityPage.selectFromList(data.get("Unit_Type_AR"), data.get("Unit_Type_EN"), FullBookingJourneyPageObjects.UnitTypeDropdownList());
        logger.info("Step 10: Upload file (Any format except xlsx)");
        CommonUtilityPage.UploadAttachment(data.get("Excel_Attachment"), FullBookingJourneyPageObjects.UploadUnitImportFile());
        app.fullBookingJourneyPage.verifyAttachmentIsUploaded(data.get("Excel_Attachment"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_59_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Units tab");
        app.fullBookingJourneyPage.clickOnUnitsTab();
        logger.info("Step 07: Click on New Import Unit button");
        app.fullBookingJourneyPage.clickOnNewImportUnitButton();
        logger.info("Step 08: Click on unit type dropdown");
        app.fullBookingJourneyPage.clickOnUnitTypeDropdown();
        logger.info("Step 09: Select unit type");
        CommonUtilityPage.selectFromList(data.get("Unit_Type_AR"), data.get("Unit_Type_EN"), FullBookingJourneyPageObjects.UnitTypeDropdownList());
        logger.info("Step 10: Upload file (Any format except xlsx)");
        CommonUtilityPage.UploadAttachment(data.get("Excel_Attachment"), FullBookingJourneyPageObjects.UploadUnitImportFile());
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Units import started successfully", "استيراد الوحدات بدأ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_60_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Units tab");
        app.fullBookingJourneyPage.clickOnUnitsTab();
        logger.info("Step 07: Click on New Import Unit button");
        app.fullBookingJourneyPage.clickOnNewImportUnitButton();
        logger.info("Step 08: Click on unit type dropdown");
        app.fullBookingJourneyPage.clickOnUnitTypeDropdown();
        logger.info("Step 09: Select unit type");
        CommonUtilityPage.selectFromList(data.get("Unit_Type_AR"), data.get("Unit_Type_EN"), FullBookingJourneyPageObjects.UnitTypeDropdownList());
        logger.info("Step 10: Upload import file (xlsx)");
        CommonUtilityPage.UploadAttachment(data.get("Excel_Attachment"), FullBookingJourneyPageObjects.UploadUnitImportFile());
        logger.info("Step 11: Click on save button");
        app.fullBookingJourneyPage.clickOnSaveButton();
        logger.info("Step 12: Click on Commit button");
        app.fullBookingJourneyPage.clickOnCommitButton();
        logger.info("Step 13: Click OK button on pop up");
        app.fullBookingJourneyPage.clickOnOkButtonOnPopup();
        CommonUtilityPage.verifyValueIsDisplayed("إرسال طلب اعتماد الاستيراد", "Sent request to commit import", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_61_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Banner image");
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.BannerImageAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_62_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Banner image");
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.BannerImageAttachment());
        logger.info("Step 08: Click on up arrow ");
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_63_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Video Media (wrong format)");
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.VideoMediaAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_64_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Video Media");
        CommonUtilityPage.UploadAttachment(data.get("Video_Attachment"), FullBookingJourneyPageObjects.VideoMediaAttachment());
        logger.info("Step 08: Click on up arrow ");
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_65_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Master plan Media");
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.MasterPlanAttachment());
        logger.info("Step 08: Click on up arrow ");
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_66_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Videos uploaded");
        CommonUtilityPage.UploadAttachment(data.get("Video_Attachment"), FullBookingJourneyPageObjects.VideosLibraryAttachment());
        logger.info("Step 08: Click on Save button under Videos uploaded");
        app.fullBookingJourneyPage.clickOnSaveButtonForVideoLibrary();
        CommonUtilityPage.verifyValueIsDisplayed("تم حفظ الفيديوهات بنجاح", "Videos have been saved successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_67_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Photos uploaded");
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.PhotosLibraryAttachment());
        logger.info("Step 08: Click on Save button under Photos uploaded");
        app.fullBookingJourneyPage.clickOnSaveButtonForPhotoLibrary();
        CommonUtilityPage.verifyValueIsDisplayed("تم حفظ الصور بنجاح", "Photos have been saved successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_68_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Image Gallery");
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.ImageGalleryAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_69_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Image Gallery");
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.ImageGalleryAttachment());
        logger.info("Step 08: Click on up arrow ");
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_70_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Brochure Media (format except PDF file)");
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.BrochureMediaAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_71_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Brochure Media (PDF file)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), FullBookingJourneyPageObjects.BrochureMediaAttachment());
        logger.info("Step 08: Click on up arrow ");
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_72_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for GEO Map (Except Json format)");
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.GeoMapAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.InputFieldError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_73_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for GEO Map (Json format)");
        CommonUtilityPage.UploadAttachment(data.get("Json_Attachment"), FullBookingJourneyPageObjects.GeoMapAttachment());
        logger.info("Step 08: Click on up arrow ");
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_74_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Click on Display method dropdown");
        app.fullBookingJourneyPage.clickOnDisplayMethodDropdown();
        logger.info("Step 08: Select display method from list");
        CommonUtilityPage.selectFromList("Hero", "Hero", FullBookingJourneyPageObjects.DisplayMethodDropdownList());
        CommonUtilityPage.verifyOptionIsSelected("Hero", "Hero", FullBookingJourneyPageObjects.DisplayMethodDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_75_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Enter title of details page");
        app.fullBookingJourneyPage.enterTitleOfDetailPage(data.get("ProjectName"));
        CommonUtilityPage.verifyValueIsEntered(data.get("ProjectName"), FullBookingJourneyPageObjects.TitleOfDetailPageInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_76_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Enter date in First unit delivery date input");
        app.fullBookingJourneyPage.enterFirstUnitDeliveryDate(data.get("First_Unit_Delivery_Date"));
        CommonUtilityPage.verifyValueIsEntered(data.get("First_Unit_Delivery_Date"), FullBookingJourneyPageObjects.FirstUnitDeliveryDateInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_77_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Enter text in Name input");
        app.fullBookingJourneyPage.enterProjectDisplayName(data.get("ProjectName"));
        CommonUtilityPage.verifyValueIsEntered(data.get("ProjectName"), FullBookingJourneyPageObjects.ProjectDisplayNameInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_78_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Enter text in Summary input");
        app.fullBookingJourneyPage.enterSummary(data.get("Summary"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Summary"), FullBookingJourneyPageObjects.SummaryInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_79_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Enter text in Description input");
        app.fullBookingJourneyPage.enterDescription(data.get("Description"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Description"), FullBookingJourneyPageObjects.DescriptionInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_80_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Enter text in 'Price starting at' input");
        app.fullBookingJourneyPage.enterPricingStartingAt(data.get("Start_Price"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Start_Price"), FullBookingJourneyPageObjects.PricingStartingAtInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_81_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Enter Latitude value");
        app.fullBookingJourneyPage.enterLatitude(data.get("Latitude"));
        logger.info("Step 08: Enter Longitude value");
        app.fullBookingJourneyPage.enterLongitude(data.get("Longitude"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Latitude"), FullBookingJourneyPageObjects.LatitudeInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Longitude"), FullBookingJourneyPageObjects.LongitudeInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_82_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Click on Promoted radio button");
        app.fullBookingJourneyPage.clickOnPromotedToggle();
        app.fullBookingJourneyPage.verifyPromotedToggleIsOn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_83_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Enter text in Nearest airport distance input field");
        app.fullBookingJourneyPage.enterNearestAirportDistance(data.get("Nearest_Airport_Distance"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Nearest_Airport_Distance"), FullBookingJourneyPageObjects.NearestAirportDistanceInput());
        logger.info("Step 08: Enter text in Nearest school distance input field");
        app.fullBookingJourneyPage.enterNearestSchoolDistance(data.get("Nearest_School_Distance"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Nearest_School_Distance"), FullBookingJourneyPageObjects.NearestSchoolDistanceInput());
        logger.info("Step 09: Enter text in Total area input field");
        app.fullBookingJourneyPage.enterTotalArea(data.get("Total_Area"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Total_Area"), FullBookingJourneyPageObjects.TotalAreaInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_84_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Click on Market day flag radio button");
        app.fullBookingJourneyPage.clickOnMarketDayFlagToggle();
        app.fullBookingJourneyPage.verifyMarketDayFlagToggleIsOn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_85_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Verify Save button is disabled");
        app.fullBookingJourneyPage.verifySaveButtonIsDisabledOnMediaPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_86_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media tab");
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 07: Attach file for Banner image");
        app.fullBookingJourneyPage.uploadBannerImage(data.get("Image_Attachment"));
        logger.info("Step 08: Click on up arrow ");
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        logger.info("Step 09: Enter title of details page");
        app.fullBookingJourneyPage.enterTitleOfDetailPage(data.get("ProjectName"));
        logger.info("Step 10: Enter text in Name input");
        app.fullBookingJourneyPage.enterProjectDisplayName(data.get("ProjectName"));
        logger.info("Step 11: Enter text in Summary input");
        app.fullBookingJourneyPage.enterSummary(data.get("Summary") + RandomStringUtils.randomAlphabetic(50));
        logger.info("Step 12: Enter text in Description input");
        app.fullBookingJourneyPage.enterDescription(data.get("Description") + RandomStringUtils.randomAlphabetic(50));
        logger.info("Step 13: Enter text in 'Price starting at' input");
        app.fullBookingJourneyPage.enterPricingStartingAt(data.get("Start_Price"));
        logger.info("Step 14: Enter Latitude & Longitude values");
        app.fullBookingJourneyPage.enterLatitude(data.get("Latitude"));
        app.fullBookingJourneyPage.enterLongitude(data.get("Longitude"));
        logger.info("Step 15: Click on save button");
        app.fullBookingJourneyPage.clickOnSaveButtonOnMediaPage();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media data saved successfully", "تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_87_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Media Approval button in the bottom of the Project Details page");
        app.fullBookingJourneyPage.clickOnMediaTab();
        app.fullBookingJourneyPage.clickOnSaveButtonOnMediaPage();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media data saved successfully", "تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.clickOnProjectDetailsTab();
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Request for media approval has been sent successfully", "تم رفع طلب الموافقة على المحتوى المرئي بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_88_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Reject media button in the bottom of the Project Details page");
        app.fullBookingJourneyPage.clickOnRejectMediaButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Rejected", "تم رفض طلب الموافقة على المحتوى المرئي", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_89_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.clickOnMediaTab();
        app.fullBookingJourneyPage.clickOnSaveButton();
        app.fullBookingJourneyPage.clickOnProjectDetailsTab();
        logger.info("Step 06: Click on Approve media button in the bottom of the Project Details page");
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        app.fullBookingJourneyPage.clickOnApproveMediaButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media approval is in progress now. Please review in few seconds", "طلب الموافقة على المحتوى المرئي تحت المعالجة الرجاء الانتظار", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_90_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.verifyMediaIsApproved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_91_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Project financial institutions tab ");
        app.fullBookingJourneyPage.clickOnProjectFinancialInstitutionTab();
        logger.info("Step 07: Click Save button");
        app.fullBookingJourneyPage.verifySaveButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_92_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Project financial institutions tab ");
        app.fullBookingJourneyPage.clickOnProjectFinancialInstitutionTab();
        logger.info("Step 07: Select all the banks");
        app.fullBookingJourneyPage.selectAllBanksInProjectFinancialInstitution();
        logger.info("Step 08: Click Save button");
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Record saved successfully", "تم الحفظ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_93_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on  Booking document templates tab ");
        app.fullBookingJourneyPage.clickOnBookingDocumentTemplateTab();
        logger.info("Step 07: Attach an invalid file (format except docx)");
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.BookingDocumentTemplateInputAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.InvalidUnitImportFileErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_94_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on  Booking document templates tab ");
        app.fullBookingJourneyPage.clickOnBookingDocumentTemplateTab();
        logger.info("Step 07: Attach an valid file");
        CommonUtilityPage.UploadAttachment(data.get("Word_Attachment"), FullBookingJourneyPageObjects.BookingDocumentTemplateInputAttachment());
        logger.info("Step 08: Select document template type");
        app.fullBookingJourneyPage.clickOnDocumentTemplateTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Booking_Template_Type_EN"), data.get("Booking_Template_Type_AR"), FullBookingJourneyPageObjects.BookingTemplateTypeDropdownList());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Document uploaded successfully", "تم تحميل المستند بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_95_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Unit Models tab ");
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        logger.info("Step 07: Click on the unit model name");
        app.fullBookingJourneyPage.clickOnUnitModelName();
        logger.info("Step 08: Click Save button on Add new units model pop up");
        app.fullBookingJourneyPage.clickOnSaveIcon();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("UNIT_MODEL.MODEL_CREATED", "UNIT_MODEL.MODEL_CREATED", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_96_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Unit Models tab ");
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        logger.info("Step 07: Click on the unit model name");
        app.fullBookingJourneyPage.clickOnUnitModelName();
        logger.info("Step 08: Click on the Media");
        app.fullBookingJourneyPage.clickOnMediaSectionLabelOnUnitModelPage();
        logger.info("Step 09: Attach the media");
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.BannerImageAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
//        app.fullBookingJourneyPage.enterProjectDisplayName(data.get("ProjectName"));
//        app.fullBookingJourneyPage.enterDescriptions(data.get("Description") + RandomStringUtils.randomAlphabetic(100));
//        logger.info("Step 10: Click on Save button");
//        app.fullBookingJourneyPage.clickOnSaveIcon();
//        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media data saved successfully", "تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_97_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Unit Models tab ");
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        logger.info("Step 07: Click on the unit model name");
        app.fullBookingJourneyPage.clickOnUnitModelName();
        logger.info("Step 08: Click on the Media");
        app.fullBookingJourneyPage.clickOnMediaSectionLabelOnUnitModelPage();
//        logger.info("Step 09: Attach the media");
//        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.BannerImageAttachment());
//        app.fullBookingJourneyPage.clickOnUploadArrowButton();
//        app.fullBookingJourneyPage.enterProjectDisplayName(data.get("ProjectName"));
//        app.fullBookingJourneyPage.enterDescriptions(data.get("Description") + RandomStringUtils.randomAlphabetic(100));
//        logger.info("Step 10: Click on Save button");
        app.fullBookingJourneyPage.clickOnSaveIcon();
        logger.info("Step 11: Click on Request Media approval");
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        logger.info("Step 12: Click on Approve Media");
        app.fullBookingJourneyPage.clickOnApproveMediaButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media approval is in progress now. Please review in few seconds", "طلب الموافقة على المحتوى المرئي تحت المعالجة الرجاء الانتظار", FullBookingJourneyPageObjects.SystemPopupMessage());

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_98_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Unit Models tab ");
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        logger.info("Step 07: Verify the Status of unit model");
        app.fullBookingJourneyPage.verifyStatusOfUnitModel("unpublished");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_99_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Project sales contracts tab  ");
        app.fullBookingJourneyPage.clickOnScrollArrowEnd();
        app.fullBookingJourneyPage.clickOnProjectSalesContractTab();
        logger.info("Step 07: Verify Save button is disabled");
        app.fullBookingJourneyPage.verifySaveButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_100_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Project sales contracts tab  ");
        app.fullBookingJourneyPage.clickOnScrollArrowEnd();
        app.fullBookingJourneyPage.clickOnProjectSalesContractTab();
        logger.info("Step 07: Attach a invalid file for Offplan sales contract document");
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.SalesContractAttachment());
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Can not upload", "خطأ في رفع الملف", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_101_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Project sales contracts tab");
        app.fullBookingJourneyPage.clickOnScrollArrowEnd();
        app.fullBookingJourneyPage.clickOnProjectSalesContractTab();
        logger.info("Step 07: Attach a valid file for Offplan sales contract document");
        CommonUtilityPage.UploadAttachment(data.get("Word_Attachment"), FullBookingJourneyPageObjects.SalesContractAttachment());
        app.fullBookingJourneyPage.verifySaveButtonIsEnabledOnProjectSalesContractPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_102_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Verify No Approved Sales Contract label is displayed ");
        CommonUtilityPage.verifyErrorMessageIsDisplayed("No Approved Sales Contract", "لا يوجد عقد بيع معتمد", FullBookingJourneyPageObjects.SaleContractApprovalErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_103_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Sales contract approval records tab ");
        app.fullBookingJourneyPage.clickOnScrollArrowEnd();
        app.fullBookingJourneyPage.clickOnSaleContractApprovalRecordsTab();
        logger.info("Step 07: Click on view button for thr displayed contract ");
        app.fullBookingJourneyPage.clickOnViewButton();
        app.fullBookingJourneyPage.verifyDocumentViewerPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_104_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Click on Sales contract approval records tab ");
        app.fullBookingJourneyPage.clickOnScrollArrowEnd();
        app.fullBookingJourneyPage.clickOnSaleContractApprovalRecordsTab();
        logger.info("Step 07: Click on view button for thr displayed contract ");
        app.fullBookingJourneyPage.clickOnDownloadButton();
        app.fullBookingJourneyPage.enterDownloadPath("SaleContract");
        app.fullBookingJourneyPage.verifyAttachmentHasBeenDownloaded();
    }

    /**
     * Developer approves the Sale contract and Admin publish the Project
     * From TC_105 - TC_106
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_105_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        app.salesContractPage.changeUILanguagePartners();
        app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        app.salesContractPage.closePopUp();
        logger.info("Step 02: Click on Projects in side menu");
        app.salesContractPage.clickOnProjectsMenuOption();
        logger.info("Step 03: Click on Search By dropdown ");
        app.salesContractPage.clickOnSearchByDropdown();
        logger.info("Step 04: Select 'Project name'");
        CommonUtilityPage.selectFromList("اسم المشروع", "Project name", SalesContractPageObject.SearchByDropdownList());
        logger.info("Step 05: Input 'Project name'");
        app.salesContractPage.enterProjectNameInSearchBar(data.get("ProjectName"));
        logger.info("Step 06: Select the project from the list");
        app.salesContractPage.selectProjectNameFromList(data.get("ProjectName"));
        logger.info("Step 07: Click search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 08: Click on view icon in Details column");
        app.salesContractPage.clickOnProjectDetailsButton();
        logger.info("Step 09: Click on Sale Contract tab");
        app.salesContractPage.clickOnSaleContractUnitTab();
        logger.info("Step 10: Click on View & approve button");
        app.salesContractPage.clickOnViewAndApproveButton();
        logger.info("Step 11: Click on Approve button");
        app.salesContractPage.clickOnApproveButton();
        app.salesContractPage.inputOTP(data.get("OTP"));
        app.salesContractPage.clickOnVerifyCodeButton();
        CommonUtilityPage.verifyValueIsDisplayed("التحقق من رمز التحقق", "OTP verification", SalesContractPageObject.SignContractSuccessMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_106_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        logger.info("Step 04: Click on Projects");
        app.fullBookingJourneyPage.clickOnProjects();
        logger.info("Step 05: Search previously created project and click on it");
        app.fullBookingJourneyPage.adminSearchProject(data.get("ProjectName"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("ProjectName"));
        logger.info("Step 06: Navigate to unit model page");
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        logger.info("Step 07: Navigate to unpublished unit model");
        app.fullBookingJourneyPage.clickOnUnitModelName();
        logger.info("Step 08: Published the unit model");
        app.fullBookingJourneyPage.clickOnIsPublishUnitModelToggle();
        app.fullBookingJourneyPage.verifyIsPublishUnitModelToggleIsOn();
        logger.info("Step 09: Navigate to project details page");
        app.fullBookingJourneyPage.clickOnBackArrowButton();
        app.fullBookingJourneyPage.clickOnScrollArrowStart();
        app.fullBookingJourneyPage.clickOnProjectDetailsTab();
        logger.info("Step 10: Enable AZM link");
        app.fullBookingJourneyPage.clickOnLinkWithAzmToggle();
        logger.info("Step 06: Click Publish radio button");
        app.fullBookingJourneyPage.clickOnIsPublishedToggle();
        app.fullBookingJourneyPage.verifyIsPublishedToggleIsOn();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Project publishment updated successfully", "تم تحديث نشر المشروع بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        logger.info("Step 07: Click on save button");
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Record saved successfully", "تم الحفظ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    /**
     * User Submits Financial Advisory request
     * From TC_107 - TC_125
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_107_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        app.mohLandBookingJourneyPage.verifyTheSearchedProjectDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_108_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        CommonUtilityPage.verifyValueIsDisplayed("هل تود البدء بإجراءات الحجز الان", "Ready to start your booking", FullBookingJourneyPageObjects.ReadyToStartBookingLabel());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_109_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        CommonUtilityPage.verifyValueIsDisplayed("برنامج الدعم السكني المحدث", "The Financial Advisory service", FullBookingJourneyPageObjects.FinancialAdvisoryPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_110_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        CommonUtilityPage.verifyValueIsDisplayed("صمم دعمك", "Please confirm the final purchasing power information", FullBookingJourneyPageObjects.PurchasingPowerInfoPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_111_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Click on Type of Employment  drop down ");
        app.fullBookingJourneyPage.clickOnEmploymentTypeDropdown();
        logger.info("Step 13: Select employment type");
        CommonUtilityPage.selectFromList(data.get("Employment_Type_AR"), data.get("Employment_Type_EN"), FullBookingJourneyPageObjects.EmploymentTypeDropdownList());
        CommonUtilityPage.verifyOptionIsSelected(data.get("Employment_Type_AR"), data.get("Employment_Type_EN"), FullBookingJourneyPageObjects.EmploymentTypeDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_112_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Click on Type of Salary bank  drop down");
        app.fullBookingJourneyPage.clickOnTypeOfSalaryBankDropdown();
        logger.info("Step 13: Select Salary bank name");
        CommonUtilityPage.selectFromList(data.get("Salary_Bank_Type_AR"), data.get("Salary_Bank_Type_EN"), FullBookingJourneyPageObjects.TypeOfSalaryBankDropdownList());
        CommonUtilityPage.verifyOptionIsSelected(data.get("Salary_Bank_Type_AR"), data.get("Salary_Bank_Type_EN"), FullBookingJourneyPageObjects.TypeOfSalaryBankDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_113_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Enter value in Basic salary input");
        app.fullBookingJourneyPage.enterBasicSalary(data.get("Basic_Salary"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Basic_Salary"), FullBookingJourneyPageObjects.BasicSalaryInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_114_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Enter value in Housing allowance input  ");
        app.fullBookingJourneyPage.enterHousingAllowance(data.get("HousingAllowance"));
        logger.info("Step 13: Enter value in Other allowance input ");
        app.fullBookingJourneyPage.enterOtherAllowance("OtherAllowance");
        CommonUtilityPage.verifyValueIsEntered(data.get("HousingAllowance"), FullBookingJourneyPageObjects.HousingAllowanceInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("OtherAllowance"), FullBookingJourneyPageObjects.OtherAllowanceInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_115_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Enter value in Total financial savings input ");
        app.fullBookingJourneyPage.enterFinancialSaving(data.get("FinancialSaving"));
        logger.info("Step 13: Enter value in Value of down payment input");
        app.fullBookingJourneyPage.enterDownPayment(data.get("DownPayment"));
        CommonUtilityPage.verifyValueIsEntered(data.get("FinancialSaving"), FullBookingJourneyPageObjects.FinancialSavingInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("DownPayment"), FullBookingJourneyPageObjects.DownPaymentInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_116_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Enter value in Monthly commitment  input ");
        app.fullBookingJourneyPage.enterMonthlyCommitment(data.get("MonthlyCommitment"));
        logger.info("Step 13: Enter value in Duration of commitment input");
        app.fullBookingJourneyPage.enterDurationOfCommitment(data.get("Duration_Of_Commitment"));
        CommonUtilityPage.verifyValueIsEntered(data.get("MonthlyCommitment"), FullBookingJourneyPageObjects.MonthlyCommitmentInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Duration_Of_Commitment"), FullBookingJourneyPageObjects.DurationOfCommitmentInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_117_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Enter value in Total financial savings input field (greater than 1000000)");
        app.fullBookingJourneyPage.enterFinancialSaving("1000000000");
        CommonUtilityPage.verifyValueIsDisplayed("يجب أن تكون القيمة المدخلة 1000000 أو أقل", "The entered value must be 1000000 or less", FullBookingJourneyPageObjects.InputFieldErrorHousing());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_118_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Enter value in Value of down payment input field (greater than 1000000)");
        app.fullBookingJourneyPage.enterDownPayment("1000000000");
        CommonUtilityPage.verifyValueIsDisplayed("يجب أن تكون القيمة المدخلة 1000000 أو أقل", "The entered value must be 1000000 or less", FullBookingJourneyPageObjects.InputFieldErrorHousing());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_119_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Enter value in Monthly commitment input field (greater than 45000)");
        app.fullBookingJourneyPage.enterMonthlyCommitment("45000000");
        CommonUtilityPage.verifyValueIsDisplayed("يجب أن تكون القيمة المدخلة 45000 أو أقل", "The entered value must be 45000 or less", FullBookingJourneyPageObjects.InputFieldErrorHousing());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_120_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Enter value in Duration of commitment input field (greater than 360)");
        app.fullBookingJourneyPage.enterDurationOfCommitment("500");
        CommonUtilityPage.verifyValueIsDisplayed("يجب أن تكون القيمة المدخلة 360 أو أقل", "The entered value must be 360 or less", FullBookingJourneyPageObjects.InputFieldErrorHousing());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_121_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Select employment type");
        app.fullBookingJourneyPage.clickOnEmploymentTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Employment_Type_AR"), data.get("Employment_Type_EN"), FullBookingJourneyPageObjects.EmploymentTypeDropdownList());
        logger.info("Step 13: Select Salary Bank");
        app.fullBookingJourneyPage.clickOnTypeOfSalaryBankDropdown();
        CommonUtilityPage.selectFromList(data.get("Salary_Bank_Type_AR"), data.get("Salary_Bank_Type_EN"), FullBookingJourneyPageObjects.TypeOfSalaryBankDropdownList());
        logger.info("Step 14: Enter basic salary");
        app.fullBookingJourneyPage.enterBasicSalary(data.get("Basic_Salary"));
        logger.info("Step 15: Enter housing allowances & other allowances");
        app.fullBookingJourneyPage.enterHousingAllowance(data.get("HousingAllowance"));
        logger.info("Step 16: Enter Total financial savings & value of down payment");
        app.fullBookingJourneyPage.enterFinancialSaving(data.get("FinancialSaving"));
        logger.info("Step 17: Enter Monthly commitment & Duration of commitment");
        app.fullBookingJourneyPage.enterDurationOfCommitment(data.get("Duration_Of_Commitment"));
        logger.info("Step 18: Choose Project type (Off plan/self construction/market ready units)");
        app.fullBookingJourneyPage.selectProductType(data.get("ProductType"));
        app.fullBookingJourneyPage.verifyProductTypeIsSelected();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_122_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Select employment type");
        app.fullBookingJourneyPage.clickOnEmploymentTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Employment_Type_AR"), data.get("Employment_Type_EN"), FullBookingJourneyPageObjects.EmploymentTypeDropdownList());
        logger.info("Step 13: Select Salary Bank");
        app.fullBookingJourneyPage.clickOnTypeOfSalaryBankDropdown();
        CommonUtilityPage.selectFromList(data.get("Salary_Bank_Type_AR"), data.get("Salary_Bank_Type_EN"), FullBookingJourneyPageObjects.TypeOfSalaryBankDropdownList());
        logger.info("Step 14: Enter basic salary");
        app.fullBookingJourneyPage.enterBasicSalary(data.get("Basic_Salary"));
        logger.info("Step 15: Enter housing allowances & other allowances");
        app.fullBookingJourneyPage.enterHousingAllowance(data.get("HousingAllowance"));
        logger.info("Step 16: Enter Total financial savings & value of down payment");
        app.fullBookingJourneyPage.enterFinancialSaving(data.get("FinancialSaving"));
        logger.info("Step 17: Enter Monthly commitment & Duration of commitment");
        app.fullBookingJourneyPage.enterDurationOfCommitment(data.get("Duration_Of_Commitment"));
        logger.info("Step 18: Choose Project type (Off plan/self construction/market ready units)");
        app.fullBookingJourneyPage.selectProductType(data.get("ProductType"));
        CommonUtilityPage.verifyValueIsDisplayed("باقات الدعم المتاحة", "Available Subsidy Packages", FullBookingJourneyPageObjects.AvailableSubsidyHeading());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_123_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Select employment type");
        app.fullBookingJourneyPage.clickOnEmploymentTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Employment_Type_AR"), data.get("Employment_Type_EN"), FullBookingJourneyPageObjects.EmploymentTypeDropdownList());
        logger.info("Step 13: Select Salary Bank");
        app.fullBookingJourneyPage.clickOnTypeOfSalaryBankDropdown();
        CommonUtilityPage.selectFromList(data.get("Salary_Bank_Type_AR"), data.get("Salary_Bank_Type_EN"), FullBookingJourneyPageObjects.TypeOfSalaryBankDropdownList());
        logger.info("Step 14: Enter basic salary");
        app.fullBookingJourneyPage.enterBasicSalary(data.get("Basic_Salary"));
        logger.info("Step 15: Enter housing allowances & other allowances");
        app.fullBookingJourneyPage.enterHousingAllowance(data.get("HousingAllowance"));
        logger.info("Step 16: Enter Total financial savings & value of down payment");
        app.fullBookingJourneyPage.enterFinancialSaving(data.get("FinancialSaving"));
        logger.info("Step 17: Enter Monthly commitment & Duration of commitment");
        app.fullBookingJourneyPage.enterDurationOfCommitment(data.get("Duration_Of_Commitment"));
        logger.info("Step 18: Choose Project type (Off plan/self construction/market ready units)");
        app.fullBookingJourneyPage.selectProductType(data.get("ProductType"));
        logger.info("Step 19: Click on disclaimer checkbox");
        app.fullBookingJourneyPage.clickOnDisclaimerCheckbox();
        app.fullBookingJourneyPage.verifyDisclaimerCheckboxIsClicked();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_124_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Verify Submit button is disabled");
        app.fullBookingJourneyPage.verifySubmitButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_125_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click on You have no financial recommendations! label ");
        app.fullBookingJourneyPage.clickOnYouHaveNoFinancialRecommendationsBanner();
        logger.info("Step 10: Click on Financial Advisory button ");
        app.fullBookingJourneyPage.clickOnFinancialAdvisoryButton();
        logger.info("Step 11: Click on Start Service button");
        app.fullBookingJourneyPage.clickOnStartServiceButton();
        logger.info("Step 12: Select employment type");
        app.fullBookingJourneyPage.clickOnEmploymentTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Employment_Type_AR"), data.get("Employment_Type_EN"), FullBookingJourneyPageObjects.EmploymentTypeDropdownList());
        logger.info("Step 13: Select Salary Bank");
        app.fullBookingJourneyPage.clickOnTypeOfSalaryBankDropdown();
        CommonUtilityPage.selectFromList(data.get("Salary_Bank_Type_AR"), data.get("Salary_Bank_Type_EN"), FullBookingJourneyPageObjects.TypeOfSalaryBankDropdownList());
        logger.info("Step 14: Enter basic salary");
        app.fullBookingJourneyPage.enterBasicSalary(data.get("Basic_Salary"));
        logger.info("Step 15: Enter housing allowances & other allowances");
        app.fullBookingJourneyPage.enterHousingAllowance(data.get("HousingAllowance"));
        logger.info("Step 16: Enter Total financial savings & value of down payment");
        app.fullBookingJourneyPage.enterFinancialSaving(data.get("FinancialSaving"));
        logger.info("Step 17: Enter Monthly commitment & Duration of commitment");
        app.fullBookingJourneyPage.enterDurationOfCommitment(data.get("Duration_Of_Commitment"));
        logger.info("Step 18: Choose Project type (Off plan/self construction/market ready units)");
        app.fullBookingJourneyPage.selectProductType(data.get("ProductType"));
        logger.info("Step 19: Click on disclaimer checkbox");
        app.fullBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 20: Click on Submit button");
        app.fullBookingJourneyPage.clickOnSubmitButton();
        CommonUtilityPage.verifyValueIsDisplayed("نجاح", "Success", FullBookingJourneyPageObjects.AdvisorySuccessMessage());
    }

    /**
     * User Books a unit
     * From TC_126 - TC_139
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_126_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click Start Booking button ");
        app.fullBookingJourneyPage.clickOnStartBookingButton();
        CommonUtilityPage.verifyValueIsDisplayed("من الوحدات المتاحة", "available units", FullBookingJourneyPageObjects.AvailableUnitsLabel());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_127_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click Start Booking button ");
        app.fullBookingJourneyPage.clickOnStartBookingButton();
        CommonUtilityPage.verifyValueIsDisplayed("من الوحدات المتاحة", "available units", FullBookingJourneyPageObjects.AvailableUnitsLabel());
        logger.info("Step 10: Click on unit from available displayed units ");
        app.fullBookingJourneyPage.selectUnitForBooking(data.get("TargetAudience_AR"), data.get("TargetAudience_AR"));
        CommonUtilityPage.verifyValueIsDisplayed("رقم البلوك", "Block number", FullBookingJourneyPageObjects.UnitDetailsPageText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_128_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click Start Booking button ");
        app.fullBookingJourneyPage.clickOnStartBookingButton();
        CommonUtilityPage.verifyValueIsDisplayed("من الوحدات المتاحة", "available units", FullBookingJourneyPageObjects.AvailableUnitsLabel());
        logger.info("Step 10: Click on unit from available displayed units ");
        app.fullBookingJourneyPage.selectUnitForBooking(data.get("TargetAudience_AR"), data.get("TargetAudience_AR"));
        logger.info("Step 11: Click on Book unit button");
        app.fullBookingJourneyPage.clickOnBookUnitButton();
        CommonUtilityPage.verifyValueIsDisplayed("إقرار", "Disclaimer", FullBookingJourneyPageObjects.UnitBookingDisclaimerPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_129_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click Start Booking button ");
        app.fullBookingJourneyPage.clickOnStartBookingButton();
        CommonUtilityPage.verifyValueIsDisplayed("من الوحدات المتاحة", "available units", FullBookingJourneyPageObjects.AvailableUnitsLabel());
        logger.info("Step 10: Click on unit from available displayed units ");
        app.fullBookingJourneyPage.selectUnitForBooking(data.get("TargetAudience_AR"), data.get("TargetAudience_AR"));
        logger.info("Step 11: Click on Book unit button");
        app.fullBookingJourneyPage.clickOnBookUnitButton();
        logger.info("Step 12: Click Terms and conditions checkbox");
        app.fullBookingJourneyPage.clickOnDisclaimerCheckbox();
        app.fullBookingJourneyPage.verifyDisclaimerCheckboxIsClicked();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_130_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click Start Booking button ");
        app.fullBookingJourneyPage.clickOnStartBookingButton();
        CommonUtilityPage.verifyValueIsDisplayed("من الوحدات المتاحة", "available units", FullBookingJourneyPageObjects.AvailableUnitsLabel());
        logger.info("Step 10: Click on unit from available displayed units ");
        app.fullBookingJourneyPage.selectUnitForBooking(data.get("TargetAudience_AR"), data.get("TargetAudience_AR"));
        logger.info("Step 11: Click on Book unit button");
        app.fullBookingJourneyPage.clickOnBookUnitButton();
        logger.info("Step 12: Click on Continue button");
        app.fullBookingJourneyPage.clickOnContinueButton();
        CommonUtilityPage.verifyValueIsDisplayed("الحقل مطلوب", "This field is required", FullBookingJourneyPageObjects.UnitBookingDisclaimerPageError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_131_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click Start Booking button ");
        app.fullBookingJourneyPage.clickOnStartBookingButton();
        CommonUtilityPage.verifyValueIsDisplayed("من الوحدات المتاحة", "available units", FullBookingJourneyPageObjects.AvailableUnitsLabel());
        logger.info("Step 10: Click on unit from available displayed units ");
        app.fullBookingJourneyPage.selectUnitForBooking(data.get("TargetAudience_AR"), data.get("TargetAudience_AR"));
        logger.info("Step 11: Click on Book unit button");
        app.fullBookingJourneyPage.clickOnBookUnitButton();
        logger.info("Step 12: Click Terms and conditions checkbox");
        app.fullBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 13: Click on Continue button");
        app.fullBookingJourneyPage.clickOnContinueButton();
        CommonUtilityPage.verifyValueIsDisplayed("شهادة التوصيات المالية", "Financial Recommendations Certificate", FullBookingJourneyPageObjects.FinancialRecommendationCertificatePageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_132_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click Start Booking button ");
        app.fullBookingJourneyPage.clickOnStartBookingButton();
        CommonUtilityPage.verifyValueIsDisplayed("من الوحدات المتاحة", "available units", FullBookingJourneyPageObjects.AvailableUnitsLabel());
        logger.info("Step 10: Click on unit from available displayed units ");
        app.fullBookingJourneyPage.selectUnitForBooking(data.get("TargetAudience_AR"), data.get("TargetAudience_AR"));
        logger.info("Step 11: Click on Book unit button");
        app.fullBookingJourneyPage.clickOnBookUnitButton();
        logger.info("Step 12: Click Terms and conditions checkbox");
        app.fullBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 13: Click on Continue button");
        app.fullBookingJourneyPage.clickOnContinueButton();
        logger.info("Step 14: Click on Continue button");
        CommonUtilityPage.verifyValueIsDisplayed("شهادة التوصيات المالية", "Financial Recommendations Certificate", FullBookingJourneyPageObjects.FinancialRecommendationCertificatePageTitle());
        app.fullBookingJourneyPage.clickOnContinueButton();
        CommonUtilityPage.verifyValueIsDisplayed("ملخص الحجز", "Booking summary", FullBookingJourneyPageObjects.BookingSummaryPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_133_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click Start Booking button ");
        app.fullBookingJourneyPage.clickOnStartBookingButton();
        CommonUtilityPage.verifyValueIsDisplayed("من الوحدات المتاحة", "available units", FullBookingJourneyPageObjects.AvailableUnitsLabel());
        logger.info("Step 10: Click on unit from available displayed units ");
        app.fullBookingJourneyPage.selectUnitForBooking(data.get("TargetAudience_AR"), data.get("TargetAudience_AR"));
        logger.info("Step 11: Click on Book unit button");
        app.fullBookingJourneyPage.clickOnBookUnitButton();
        logger.info("Step 12: Click Terms and conditions checkbox");
        app.fullBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 13: Click on Continue button");
        app.fullBookingJourneyPage.clickOnContinueButton();
        logger.info("Step 14: Click on Continue button");
        CommonUtilityPage.verifyValueIsDisplayed("شهادة التوصيات المالية", "Financial Recommendations Certificate", FullBookingJourneyPageObjects.FinancialRecommendationCertificatePageTitle());
        app.fullBookingJourneyPage.clickOnContinueButton();
        logger.info("Step 15: Click on Pay Booking Fee button ");
        app.fullBookingJourneyPage.clickOnPayBookingFeeButton();
        logger.info("Step 16: Click on Mada button");
        app.fullBookingJourneyPage.clickOnMadaButton();
        logger.info("Step 17: Fill card details");
        app.fullBookingJourneyPage.enterCardDetails(data.get("CardNumber"), data.get("CardExpiry"), data.get("CVV"), data.get("CardName"));
        logger.info("Step 18: Click on Pay now");
        app.fullBookingJourneyPage.clickOnPayNow();
        logger.info("Step 19: Click on submit");
        app.fullBookingJourneyPage.clickOnSubmit();
        app.fullBookingJourneyPage.clickOnXButtonOnReviewPopup();
        app.fullBookingJourneyPage.verifySuccessMessageForUnitBooking();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_134_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        CommonUtilityPage.verifyValueIsDisplayed("حجوزاتي", "My bookings", FullBookingJourneyPageObjects.MyBookingsPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_135_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        app.fullBookingJourneyPage.verifyBookingIsDisplayed(data.get("ProjectName"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_136_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button for the active booking");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        app.fullBookingJourneyPage.clickOnCancelButtonOnPopup();
        app.mohLandBookingJourneyPage.verifyBookingDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_137_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Verify Financing option is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("خيارات التمويل", "Financing options", FullBookingJourneyPageObjects.FinancingOptionsText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_138_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Verify Financing option is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("الشراء النقدي", "Cash purchase", FullBookingJourneyPageObjects.CashPurchaseOptionText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_139_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Verify the booking fee status is Paid");
        app.fullBookingJourneyPage.verifyBookingFeeStatus("مسددة", "Paid");
    }

    /**
     * Sign the sale contract/Rejection
     * From TC_140 - TC_147
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_140_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        CommonUtilityPage.verifyValueIsDisplayed("عقد البيع", "Sales Contract", FullBookingJourneyPageObjects.SignSaleContractPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_141_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 08: Click on Reject Button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        CommonUtilityPage.verifyValueIsDisplayed("نعم", "Yes", FullBookingJourneyPageObjects.YesButtonPopup());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_142_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 08: Click on Reject Button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        logger.info("Step 09: Click on NO Button on pop up");
        app.fullBookingJourneyPage.clickOnNoButtonOnPopup();
        app.fullBookingJourneyPage.verifyConfirmationPopupIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_143_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 08: Click on Reject Button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        logger.info("Step 09: Click on NO Button on pop up");
        app.fullBookingJourneyPage.clickOnYesButtonOnPopup();
        CommonUtilityPage.verifyValueIsDisplayed("رفض العقد", "Reject sales contract", FullBookingJourneyPageObjects.RejectSignContractPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_144_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 08: Click on Reject Button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        logger.info("Step 09: Click on NO Button on pop up");
        app.fullBookingJourneyPage.clickOnYesButtonOnPopup();
        logger.info("Step 10: Enter text in Reason of rejection");
        app.fullBookingJourneyPage.enterRejectionReason("Test Reject");
        CommonUtilityPage.verifyValueIsEntered("Test Reject", FullBookingJourneyPageObjects.RejectionReasonInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_145_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 08: Click on Reject Button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        logger.info("Step 09: Click on NO Button on pop up");
        app.fullBookingJourneyPage.clickOnYesButtonOnPopup();
        logger.info("Step 10: Click on Cancel button");
        app.fullBookingJourneyPage.clickOnCancelButtonOnPopup();
        app.fullBookingJourneyPage.clickOnCancelButtonOnPopup();
        app.mohLandBookingJourneyPage.verifyBookingDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_146_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 08: Click on Reject Button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        logger.info("Step 09: Click on NO Button on pop up");
        app.fullBookingJourneyPage.clickOnYesButtonOnPopup();
        logger.info("Step 10: Enter text in Reason of rejection");
        app.fullBookingJourneyPage.enterRejectionReason("Test Reject");
        logger.info("Step 11: Click confirm button for rejection");
        app.eligibilityPage.clickOnConfirmButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم إلغاء هذا الحجز", "This booking has been cancelled", FullBookingJourneyPageObjects.BookingHasBeenCancelledTextMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_147_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on Cancelled booking button");
        app.fullBookingJourneyPage.clickOnCancelledLink();
        app.fullBookingJourneyPage.verifyBookingCancellationDate();
    }

    /**
     * Sign the sale contract/Approval
     * From TC_148 - TC_154
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_148_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.cancelTheExistingBookingProcess();
        app.fullBookingJourneyPage.clickOnMarketPlaceButton();
        logger.info("Step 03: Click on Filters ");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 04: Enter project name in Project Search field ");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("ProjectName"));
        logger.info("Step 05: Select the displayed project from list ");
        app.mohLandBookingJourneyPage.selectTheEnteredProjectName();
        logger.info("Step 06: Click on view button ");
        app.mohLandBookingJourneyPage.clickOnViewButton();
        logger.info("Step 07: Click on the project card ");
        app.mohLandBookingJourneyPage.clickOnTheSearchedProject();
        logger.info("Step 08: Click on the Units list button ");
        app.fullBookingJourneyPage.clickOnUnitsListButton();
        logger.info("Step 09: Click Start Booking button ");
        app.fullBookingJourneyPage.clickOnStartBookingButton();
        CommonUtilityPage.verifyValueIsDisplayed("من الوحدات المتاحة", "available units", FullBookingJourneyPageObjects.AvailableUnitsLabel());
        logger.info("Step 10: Click on unit from available displayed units ");
        app.fullBookingJourneyPage.selectUnitForBooking(data.get("TargetAudience_AR"), data.get("TargetAudience_AR"));
        logger.info("Step 11: Click on Book unit button");
        app.fullBookingJourneyPage.clickOnBookUnitButton();
        logger.info("Step 12: Click Terms and conditions checkbox");
        app.fullBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 13: Click on Continue button");
        app.fullBookingJourneyPage.clickOnContinueButton();
        logger.info("Step 14: Click on Continue button");
        CommonUtilityPage.verifyValueIsDisplayed("شهادة التوصيات المالية", "Financial Recommendations Certificate", FullBookingJourneyPageObjects.FinancialRecommendationCertificatePageTitle());
        app.fullBookingJourneyPage.clickOnContinueButton();
        logger.info("Step 15: Click on Pay Booking Fee button ");
        app.fullBookingJourneyPage.clickOnPayBookingFeeButton();
        logger.info("Step 16: Click on Mada button");
        app.fullBookingJourneyPage.clickOnMadaButton();
        logger.info("Step 17: Fill card details");
        app.fullBookingJourneyPage.enterCardDetails(data.get("CardNumber"), data.get("CardExpiry"), data.get("CVV"), data.get("CardName"));
        logger.info("Step 18: Click on Pay now");
        app.fullBookingJourneyPage.clickOnPayNow();
        logger.info("Step 19: Click on submit");
        app.fullBookingJourneyPage.clickOnSubmit();
        app.fullBookingJourneyPage.clickOnXButtonOnReviewPopup();
        app.fullBookingJourneyPage.verifySuccessMessageForUnitBooking();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_149_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on view booking button for the active booking");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        app.fullBookingJourneyPage.clickOnCancelButtonOnPopup();
        logger.info("Step 07: Verify view button for sale contract is disabled");
        app.fullBookingJourneyPage.verifyViewSignContractButtonIsDisabled();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_150_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnApproveButton();
        CommonUtilityPage.verifyValueIsDisplayed("رمز التحقق", "Verify OTP", FullBookingJourneyPageObjects.VerifyOTPPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_151_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 09: Check 'Verify OTP' button is disabled");
        app.fullBookingJourneyPage.checkVerifyButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_152_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        app.fullBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 09: Input OTP ");
        app.loginPage.enterOTPForUser(data.get("OTP"));
        logger.info("Step 10: Click on verify OTP ");
        app.fullBookingJourneyPage.clickOnVerifyOTPButton();
        CommonUtilityPage.verifyValueIsDisplayed("تهانينا", "Congratulations", FullBookingJourneyPageObjects.SignSaleContractSuccessMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_153_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sale contract sign status");
        app.fullBookingJourneyPage.verifyTheSaleContractSignStatus("تم التوقيع", "Signed");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_154_Full_Booking_Journey(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Projects"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on view button for Sale Contract");
        app.fullBookingJourneyPage.clickOnViewSaleContractButton();
        CommonUtilityPage.verifyValueIsDisplayed("عقد البيع", "Sales contract", FullBookingJourneyPageObjects.ViewSaleContractPopupTitle());
    }
}
