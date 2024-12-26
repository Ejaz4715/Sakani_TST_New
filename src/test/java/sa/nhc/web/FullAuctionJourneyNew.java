package sa.nhc.web;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.FiltersPageObjects;
import sa.nhc.web.objects.FullAuctionJourneyPageObjects;
import sa.nhc.web.objects.FullBookingJourneyPageObjects;
import sa.nhc.web.objects.MOHLandBookingJourneyPageObjects;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

import static com.testcrew.base.WebBaseTest.logger;
import static com.testcrew.web.Browser.driver;

public class FullAuctionJourneyNew extends NHCWebTest {
    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_01(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Verify user is able to navigate to Add new project for auction page");
        app.fullAuctionJourneyPage.verifyAuctionProjectPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_02(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Verify user is able to enter project name");
        app.fullAuctionJourneyPage.enterProjectName(data.get("Project_Name"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Name"), FullAuctionJourneyPageObjects.ProjectNameInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_03(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Verify user is able select the Auction type");
        CommonUtilityPage.selectFromLists(data.get("Auction_Type"), FullAuctionJourneyPageObjects.AuctionTypeDropdownList(), FullAuctionJourneyPageObjects.SelectedAuctionType());
        CommonUtilityPage.verifyOptionIsSelected(data.get("Auction_Type"), FullAuctionJourneyPageObjects.AuctionTypeDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_04(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Verify user is able to select region");
        CommonUtilityPage.selectFromLists(data.get("Region"), FullAuctionJourneyPageObjects.RegionDropdownList(), FullAuctionJourneyPageObjects.SelectedRegion());
        CommonUtilityPage.verifyOptionIsSelected(data.get("Region"), FullAuctionJourneyPageObjects.RegionDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_05(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Verify user is able to select city");
        CommonUtilityPage.selectFromLists(data.get("Region"), FullAuctionJourneyPageObjects.RegionDropdownList(), FullAuctionJourneyPageObjects.SelectedRegion());
        CommonUtilityPage.selectFromLists(data.get("City"), FullAuctionJourneyPageObjects.CityDropdownList(), FullAuctionJourneyPageObjects.SelectedCity());
        CommonUtilityPage.verifyOptionIsSelected(data.get("City"), FullAuctionJourneyPageObjects.CityDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_06(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Verify admin is able to select auction Start date");
        app.fullAuctionJourneyPage.selectAuctionStartDateFromCalendar(0);
        app.fullAuctionJourneyPage.verifyAuctionStartDateHasBeenSelected();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_07(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Verify admin is able to enter Start time");
        app.fullAuctionJourneyPage.enterStartTimeOfAuction(0, 0, 0);
        app.fullAuctionJourneyPage.verifyStartTimeOfAuctionIsEntered();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_08(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Verify admin is able to select auction end date");
        app.fullAuctionJourneyPage.selectAuctionEndDateFromCalendar(0);
        app.fullAuctionJourneyPage.verifyAuctionEndDateHasBeenSelected();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_09(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Verify admin is able to enter End time");
        app.fullAuctionJourneyPage.enterEndTimeOfAuction(0, 0, 0);
        app.fullAuctionJourneyPage.verifyEndTimeOfAuctionIsEntered();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_10(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Verify error message that displayed if select end date less than start date");
        app.fullAuctionJourneyPage.validateErrorMessageIfEndDateIsLessThanStartDate(1, 0);
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_11(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Fill all required data");
        app.fullAuctionJourneyPage.enterProjectName(data.get("Project_Name"));
        CommonUtilityPage.selectFromLists(data.get("Auction_Type"), FullAuctionJourneyPageObjects.AuctionTypeDropdownList(), FullAuctionJourneyPageObjects.SelectedAuctionType());
        CommonUtilityPage.selectFromLists(data.get("Region"), FullAuctionJourneyPageObjects.RegionDropdownList(), FullAuctionJourneyPageObjects.SelectedRegion());
        CommonUtilityPage.selectFromLists(data.get("City"), FullAuctionJourneyPageObjects.CityDropdownList(), FullAuctionJourneyPageObjects.SelectedCity());
        app.fullAuctionJourneyPage.selectAuctionStartDateFromCalendar(0);
        app.fullAuctionJourneyPage.enterStartTimeOfAuction(0, 20, 0);
        app.fullAuctionJourneyPage.selectAuctionEndDateFromCalendar(0);
        app.fullAuctionJourneyPage.enterEndTimeOfAuction(0, 40, 0);
        logger.info("Step 07: Verify admin is able to save after providing mandatory data (message: Saved Successfully)");
        app.fullAuctionJourneyPage.getAuctionDateAndTime();
        app.fullAuctionJourneyPage.clickOnSaveButton();
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم الحفظ بنجاح", "Create auctions successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_12(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the auction status is 'Not Started - لم يبدأ'");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        CommonUtilityPage.verifyOptionIsSelected("لم يبدأ", FullAuctionJourneyPageObjects.AuctionStatusNew());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_13(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the warning message is displayed 'Must approve project media and all unit models to publish the project");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        CommonUtilityPage.verifyValueIsDisplayed("يجب الموافقة على وسائل الإعلام الخاصة بالمشروع وجميع نماذج الوحدات لنشر المشروع", FullAuctionJourneyPageObjects.ErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_14(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the 'project changed information logs' section is displayed once the project is saved");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        CommonUtilityPage.verifyValueIsDisplayed("سجل عمليات تحديث المشروع (لتحديث المعلومات الرجاء تحديث الصفحة)", FullAuctionJourneyPageObjects.ProjectInformationLogs());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_15(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to navigate to Units page");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        CommonUtilityPage.verifyElementIsDisplayed("Auction unit page", FullAuctionJourneyPageObjects.ImportNewAuctionUnitButton());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_16(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify Save button is disabled if file is not uploaded and unit type is not selected");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullAuctionJourneyPage.clickOnImportNewAuctionUnitButton();
        app.fullAuctionJourneyPage.verifySaveButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_17(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to navigate to 'New auction unit import' page");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullAuctionJourneyPage.clickOnImportNewAuctionUnitButton();
        CommonUtilityPage.verifyElementIsDisplayed("Auction unit import page", FullAuctionJourneyPageObjects.UnitTypeDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_18(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to select the Unit Type");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullAuctionJourneyPage.clickOnImportNewAuctionUnitButton();
        CommonUtilityPage.selectFromLists(data.get("UnitType"), FullAuctionJourneyPageObjects.UnitTypeDropdown(), FullAuctionJourneyPageObjects.SelectedCity());
        CommonUtilityPage.verifyOptionIsSelected(data.get("UnitType"), FullAuctionJourneyPageObjects.UnitTypeDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_19(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to upload the file for unit import");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullAuctionJourneyPage.clickOnImportNewAuctionUnitButton();
        CommonUtilityPage.UploadAttachment(data.get("ImportUnitFile"), FullAuctionJourneyPageObjects.UploadFile());
        app.fullBookingJourneyPage.verifyAttachmentIsUploaded(data.get("ImportUnitFile"));
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_20(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify functionality of Cancel button");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullAuctionJourneyPage.clickOnImportNewAuctionUnitButton();
        app.fullAuctionJourneyPage.clickOnCancelButton();
        CommonUtilityPage.verifyElementIsDisplayed("Auction unit page", FullAuctionJourneyPageObjects.ImportNewAuctionUnitButton());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_21(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify Download official template button is disabled if Unit Type is not selected");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullAuctionJourneyPage.clickOnImportNewAuctionUnitButton();
        app.fullAuctionJourneyPage.verifyDownloadTemplateButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_22(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to save after uploading the file and selecting the unit type (Message: بدأت عملية استيراد وحدات المزاد بنجاح)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullAuctionJourneyPage.clickOnImportNewAuctionUnitButton();
        app.fullAuctionJourneyPage.editAuctionUnitFile(data.get("startDate"), data.get("endDate"), data.get("startTimeHr"), data.get("startTimeMin"), data.get("endTimeHr"), data.get("endTimeMin"));
        CommonUtilityPage.selectFromLists(data.get("UnitType"), FullAuctionJourneyPageObjects.UnitTypeDropdown(), FullAuctionJourneyPageObjects.SelectedCity());
        CommonUtilityPage.UploadAttachment(data.get("ImportUnitFile"), FullAuctionJourneyPageObjects.UploadFile());
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("بدأت عملية استيراد وحدات المزاد بنجاح", "Create auctions successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_23(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to Discard Import. (Message: تم الغاء امر الاستيراد بنجاح)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullAuctionJourneyPage.clickOnImportNewAuctionUnitButton();
        CommonUtilityPage.selectFromLists(data.get("UnitType"), FullAuctionJourneyPageObjects.UnitTypeDropdown(), FullAuctionJourneyPageObjects.SelectedCity());
        CommonUtilityPage.UploadAttachment(data.get("ImportUnitFile"), FullAuctionJourneyPageObjects.UploadFile());
        app.fullAuctionJourneyPage.clickOnSaveButton();
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 60);
        driver.navigate().refresh();
        app.fullAuctionJourneyPage.clickOnDiscardImportButton();
        app.fullAuctionJourneyPage.clickOnAgreeButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم الغاء امر الاستيراد بنجاح", "Create auctions successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_24(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to commit the import (Message: إرسال طلب اعتماد الاستيراد)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullAuctionJourneyPage.clickOnImportNewAuctionUnitButton();
        CommonUtilityPage.selectFromLists(data.get("UnitType"), FullAuctionJourneyPageObjects.UnitTypeDropdown(), FullAuctionJourneyPageObjects.SelectedCity());
        CommonUtilityPage.UploadAttachment(data.get("ImportUnitFile"), FullAuctionJourneyPageObjects.UploadFile());
        app.fullAuctionJourneyPage.clickOnSaveButton();
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 60);
        driver.navigate().refresh();
        app.fullBookingJourneyPage.clickOnCommitButton();
        app.fullAuctionJourneyPage.clickOnAgreeButton();
        CommonUtilityPage.verifyValueIsDisplayed("إرسال طلب اعتماد الاستيراد", "Create auctions successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_25(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the unit has been imported in Units page");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        CommonUtilityPage.verifyValueIsDisplayed("land", FullAuctionJourneyPageObjects.ImportedUnit());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_26(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to navigate to Unit Models page");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        CommonUtilityPage.verifyElementIsDisplayed("صفحة نماذج الوحدات", FullAuctionJourneyPageObjects.UnitsModelPage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_27(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the unit model status is 'Not created'");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        CommonUtilityPage.verifyValueIsDisplayed("Not created", FullAuctionJourneyPageObjects.UnitsModelPublishStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_28(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to create the unit model (Basic info page is displayed)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyElementIsDisplayed("Not created", FullAuctionJourneyPageObjects.BasicInformationPage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_29(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to input longitude and latitude values in media page of unit model");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullBookingJourneyPage.clickOnMediaSectionLabelOnUnitModelPage();
        app.fullBookingJourneyPage.enterLatitude(data.get("Latitude"));
        app.fullBookingJourneyPage.enterLongitude(data.get("Longitude"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Latitude"), FullBookingJourneyPageObjects.LatitudeInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Longitude"), FullBookingJourneyPageObjects.LongitudeInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_30(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is not able to Save the media if mandatory data is not provided");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullBookingJourneyPage.clickOnMediaSectionLabelOnUnitModelPage();
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("الحقل مطلوب", FullAuctionJourneyPageObjects.ErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_31(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to save the Media after providing mandatory data (Message: تم حفظ بيانات الملف بنجاح)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullBookingJourneyPage.clickOnMediaSectionLabelOnUnitModelPage();
        app.fullBookingJourneyPage.enterLatitude(data.get("Latitude"));
        app.fullBookingJourneyPage.enterLongitude(data.get("Longitude"));
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_32(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to Request media approval for unit model (Message: تم رفع طلب الموافقة على المحتوى المرئي بنجاح)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullBookingJourneyPage.clickOnMediaSectionLabelOnUnitModelPage();
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم رفع طلب الموافقة على المحتوى المرئي بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_33(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to reject media (Message: تم رفض طلب الموافقة على المحتوى المرئي)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullBookingJourneyPage.clickOnMediaSectionLabelOnUnitModelPage();
        app.fullBookingJourneyPage.clickOnRejectMediaButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم رفض طلب الموافقة على المحتوى المرئي", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_34(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to Approve media (Message: طلب الموافقة على المحتوى المرئي تحت المعالجة الرجاء الانتظار)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullBookingJourneyPage.clickOnMediaSectionLabelOnUnitModelPage();
        app.fullAuctionJourneyPage.clickOnSaveButton();
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        app.fullBookingJourneyPage.clickOnApproveMediaButton();
        CommonUtilityPage.verifyValueIsDisplayed("طلب الموافقة على المحتوى المرئي تحت المعالجة الرجاء الانتظار", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_35(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the media status is 'Approved - تمت الموافقة وتم النشر' for unit model");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullBookingJourneyPage.verifyMediaIsApproved();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_36(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the Save button on Auction legal page is disabled if files are not uploaded");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionLegalTab();
        app.fullAuctionJourneyPage.verifySaveButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_37(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to upload file for Terms and conditions in Auction Legal page");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionLegalTab();
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), FullAuctionJourneyPageObjects.AuctionLegalFiles("1"));
        CommonUtilityPage.verifyElementIsDisplayed("Icon delete file is displayed", FullAuctionJourneyPageObjects.DeleteIconFile());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_38(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to upload file for Auction winner contracts in Auction Legal page");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionLegalTab();
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), FullAuctionJourneyPageObjects.AuctionLegalFiles("2"));
        CommonUtilityPage.verifyElementIsDisplayed("Icon delete file is displayed", FullAuctionJourneyPageObjects.DeleteIconFile());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_39(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to Save after uploading files in Auction Legal page (Message: AR Model was updated)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionLegalTab();
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), FullAuctionJourneyPageObjects.AuctionLegalFiles("1"));
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), FullAuctionJourneyPageObjects.AuctionLegalFiles("2"));
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("AR Model was updated", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_40(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to edit Auction Setting");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        CommonUtilityPage.verifyElementIsDisplayed("The update button will displayed", FullAuctionJourneyPageObjects.UpdateButton());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_41(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enabled/disable Apply general setting label");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.clickToEnabledApplyGeneralSettingLabel();
        app.fullAuctionJourneyPage.verifyApplyGeneralSettingToggleIsOn();
        app.fullAuctionJourneyPage.disableApplyGeneralSettingToggle();
        app.fullAuctionJourneyPage.verifyApplyGeneralSettingToggleIsOff();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_42(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enable/disable Apply fee for auction unit label");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.enabledApplyFeeForAuctionUnitLabel();
        app.fullAuctionJourneyPage.verifyApplyFeeForAuctionUnitToggleIsOn();
        app.fullAuctionJourneyPage.disableApplyAuctionFeeToggle();
        app.fullAuctionJourneyPage.verifyApplyFeeForAuctionUnitToggleIsOff();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_43(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter valid Action fee amount");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.enabledApplyFeeForAuctionUnitLabel();
        app.fullAuctionJourneyPage.enterValidActionFeeAmount(data.get("Action_Fee_Amount"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Action_Fee_Amount"), FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_44(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter Invalid Action fee amount");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.enabledApplyFeeForAuctionUnitLabel();
        app.fullAuctionJourneyPage.enterInvalidActionFeeAmountAndVerifyTheErrorMessage("-20");
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_45(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter Added time");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.enterAddedTime("1", "10", "10");
        CommonUtilityPage.verifyValueIsEntered("1", FullAuctionJourneyPageObjects.inputAddTimeHours());
        CommonUtilityPage.verifyValueIsEntered("10", FullAuctionJourneyPageObjects.inputAddTimeMinutes());
        CommonUtilityPage.verifyValueIsEntered("10", FullAuctionJourneyPageObjects.inputAddTimeSeconds());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_46(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter valid Fixed increase number");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.enterValidFixedIncreaseNumber1("5");
        CommonUtilityPage.verifyValueIsEntered("5", FullAuctionJourneyPageObjects.fixedIncreaseNumber1());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_47(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter Fixed increase number 2");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.enterFixedIncreaseNumber2("7");
        CommonUtilityPage.verifyValueIsEntered("7", FullAuctionJourneyPageObjects.fixedIncreaseNumber2());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_48(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter Fixed increase number 3");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.enterFixedIncreaseNumber3("9");
        CommonUtilityPage.verifyValueIsEntered("9", FullAuctionJourneyPageObjects.fixedIncreaseNumber3());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_49(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify error message that displayed if enter same value in Fixed increase number 1, 2, 3");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.enterSameValueInFixedIncreaseNumbers();
        app.fullAuctionJourneyPage.verifyErrorMessageForFixedIncreasePrice();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_50(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter Period time for the Auction Winner take action");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.enterPeriodTimeAuctionWinnerTakeAction(data.get("Period_Time_Auction_Winner_Take_Action"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Period_Time_Auction_Winner_Take_Action"), FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_51(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter Period time to Pay for the Final unit Invoice");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        app.fullAuctionJourneyPage.enterPeriodTimePayFinalUnitInvoice(data.get("Period_Time_Pay_Final_Unit_Invoice"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Period_Time_Pay_Final_Unit_Invoice"), FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_52(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to Update the Auction Setting (Message: AR Model was updated)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnTheAuctionSettingsTab();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.EditButton());
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.UpdateButton());
        CommonUtilityPage.verifyValueIsDisplayed("AR Model was updated", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_53(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to publish the unit model (Message: تم تحديث نشر المشروع بنجاح)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullBookingJourneyPage.clickOnIsPublishUnitModelToggle();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Project publishment updated successfully", "تم تحديث نشر المشروع بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_54(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the unit model status is 'published'");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        CommonUtilityPage.verifyValueIsDisplayed("published", FullAuctionJourneyPageObjects.UnitsModelPublishStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_55(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to navigate to Auction Project Media page");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.verifyElementIsDisplayed("auction media", FullAuctionJourneyPageObjects.saveBTN());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_56(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify error message if admin uploads wrong format file for Banner image");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.BannerImageAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.ErrorMessageMediaPage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_57(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the admin uploads the Banner image");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.BannerImageAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_58(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify error message if admin uploads wrong format file for Video media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.VideoMediaAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.ErrorMessageMediaPage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_59(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the admin uploads the Video media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Video_Attachment"), FullBookingJourneyPageObjects.VideoMediaAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_60(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the admin uploads the Master plan Media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.MasterPlanAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_61(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify error message if admin uploads wrong format file for Image Gallery");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.ImageGalleryAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.ErrorMessageMediaPage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_62(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the admin uploads file for Image Gallery");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.ImageGalleryAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_63(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify error message if admin uploads wrong format file for Brochure Media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.BrochureMediaAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.ErrorMessageMediaPage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_64(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the admin uploads file for Brochure Media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), FullBookingJourneyPageObjects.BrochureMediaAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_65(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify error message if admin uploads wrong format file for  GEO Map (Json)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), FullBookingJourneyPageObjects.GeoMapAttachment());
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "امتداد الملف غير مسموح به", FullBookingJourneyPageObjects.ErrorMessageMediaPage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_66(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify the admin uploads file for GEO Map (Json)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Json_Attachment"), FullBookingJourneyPageObjects.GeoMapAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_67(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to upload logo image");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullAuctionJourneyPageObjects.LogoImage());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_68(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin selects Display method in Media page in Textual Media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullBookingJourneyPage.clickOnDisplayMethodDropdown();
        CommonUtilityPage.selectFromList("Hero", "Hero", FullBookingJourneyPageObjects.DisplayMethodDropdownList());
        CommonUtilityPage.verifyOptionIsSelected("Hero", "Hero", FullBookingJourneyPageObjects.DisplayMethodDropdown());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_69(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin enters Title of detail page in Media page in Textual Media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullBookingJourneyPage.enterTitleOfDetailPage(data.get("Project_Name"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Name"), FullBookingJourneyPageObjects.TitleOfDetailPageInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_70(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin enter the Name in Media page in Textual Media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullBookingJourneyPage.enterProjectDisplayName(data.get("Project_Name"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Name"), FullBookingJourneyPageObjects.ProjectDisplayNameInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_71(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin enter the Description in Media page in Textual Media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullBookingJourneyPage.enterDescription(data.get("Description"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Description"), FullBookingJourneyPageObjects.DescriptionInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_72(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin enters Latitude & Longitude values");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullBookingJourneyPage.enterLatitude(data.get("Latitude"));
        app.fullBookingJourneyPage.enterLongitude(data.get("Longitude"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Latitude"), FullBookingJourneyPageObjects.LatitudeInput());
        CommonUtilityPage.verifyValueIsEntered(data.get("Longitude"), FullBookingJourneyPageObjects.LongitudeInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_73(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter text in Nearest airport distance, Nearest school distance,Total area input fields in Textual Media section");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullBookingJourneyPage.enterNearestAirportDistance(data.get("Nearest_Airport_Distance"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Nearest_Airport_Distance"), FullBookingJourneyPageObjects.NearestAirportDistanceInput());
        app.fullBookingJourneyPage.enterNearestSchoolDistance(data.get("Nearest_School_Distance"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Nearest_School_Distance"), FullBookingJourneyPageObjects.NearestSchoolDistanceInput());
        app.fullBookingJourneyPage.enterTotalArea(data.get("Total_Area"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Total_Area"), FullBookingJourneyPageObjects.TotalAreaInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_74(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter number of assets in Textual Media section");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullAuctionJourneyPage.enterNumberOfAssets(data.get("Assets_Number"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Assets_Number"), FullAuctionJourneyPageObjects.NumberOfAssets());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_75(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter Under Supervision in Textual Media section");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullAuctionJourneyPage.enterTextInUnderSupervision(data.get("UnderSupervision"));
        CommonUtilityPage.verifyValueIsEntered(data.get("UnderSupervision"), FullAuctionJourneyPageObjects.UnderSupervision());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_76(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify error message is displayed if Call Number has length less than 9 in Textual Media section");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullAuctionJourneyPage.enterCallNumber("0");
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "القيمة المدخلة جدا قصيرة، الطول المطلوب هو 13. الطول الحالي هو5", FullAuctionJourneyPageObjects.CallNumberErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_77(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter Call Number in Textual Media section");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullAuctionJourneyPage.enterCallNumber(data.get("CallNumber"));
        CommonUtilityPage.verifyValueIsEntered(data.get("CallNumber"), FullAuctionJourneyPageObjects.CallNumber());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_78(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify error message is displayed if WhatsApp Number has length less than 9 in Textual Media section");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullAuctionJourneyPage.enterWhatsAppNumber("0");
        CommonUtilityPage.verifyErrorMessageIsDisplayed("File's extension is not allowed", "القيمة المدخلة جدا قصيرة، الطول المطلوب هو 13. الطول الحالي هو5", FullAuctionJourneyPageObjects.CallNumberErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_79(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter WhatsApp Number in Textual Media section");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullAuctionJourneyPage.enterWhatsAppNumber(data.get("CallNumber"));
        CommonUtilityPage.verifyValueIsEntered(data.get("CallNumber"), FullAuctionJourneyPageObjects.WhatsAppNumber());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_80(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to enter VAL license for real estate auctions in Textual Media section");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullAuctionJourneyPage.enterValNumber(data.get("ValNumber"));
        CommonUtilityPage.verifyValueIsEntered(data.get("ValNumber"), FullAuctionJourneyPageObjects.ValNumber());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_81(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to save the media after providing mandatory data (Message: تم حفظ بيانات الملف بنجاح)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullBookingJourneyPage.enterTitleOfDetailPage(data.get("Project_Name"));
        app.fullBookingJourneyPage.enterProjectDisplayName(data.get("Project_Name"));
        app.fullBookingJourneyPage.enterDescription(data.get("Description"));
        app.fullBookingJourneyPage.enterLatitude(data.get("Latitude"));
        app.fullBookingJourneyPage.enterLongitude(data.get("Longitude"));
        app.fullAuctionJourneyPage.enterNumberOfAssets(data.get("Assets_Number"));
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_82(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to Request Media Approval after saving Media information in Media page");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media data saved successfully", "تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.clickOnProjectDetailsTab();
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Request for media approval has been sent successfully", "تم رفع طلب الموافقة على المحتوى المرئي بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_83(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to Reject media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnRejectMediaButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Rejected", "تم رفض طلب الموافقة على المحتوى المرئي", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_84(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to Approve media");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media data saved successfully", "تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.clickOnProjectDetailsTab();
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        app.fullBookingJourneyPage.clickOnApproveMediaButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media approval is in progress now. Please review in few seconds", "طلب الموافقة على المحتوى المرئي تحت المعالجة الرجاء الانتظار", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_85(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify Media is Approved");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.verifyMediaIsApproved();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_New_TC_86(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 04: Verify admin is able to publish the auction (Message :تم تحديث نشر المشروع بنجاح)");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        app.fullBookingJourneyPage.adminSearchProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.navigateToSearchedProject(data.get("Project_Name"));
        app.fullBookingJourneyPage.clickOnIsPublishedToggle();
        app.fullBookingJourneyPage.verifyIsPublishedToggleIsOn();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Project publishment updated successfully", "تم تحديث نشر المشروع بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }
}
