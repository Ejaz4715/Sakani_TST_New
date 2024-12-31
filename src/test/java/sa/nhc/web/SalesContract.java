package sa.nhc.web;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.FullBookingJourneyPageObjects;
import sa.nhc.web.objects.SalesContractPageObject;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class SalesContract extends NHCWebTest {

    /**
     * Developer approves the Sale contract from Partners portal
     * From TC_01 - TC_14
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_01_Sales_Contract(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 03: Click on Internal Inventory > click on Projects > click on Add New project");
        app.fullBookingJourneyPage.clickOnInternalInventory();
        app.fullBookingJourneyPage.clickOnProjects();
        app.fullBookingJourneyPage.clickOnAddNewProjectButton();
        logger.info("Step 04: Enter Project Name > select Project Type (Offplan MOH)");
        String projectName = data.get("Project_Name") + RandomStringUtils.randomNumeric(5);
        app.fullBookingJourneyPage.enterProjectTitle(projectName);
        TestDataManager.addDependantGlobalTestData("SalesContract", "ProjectName", projectName);
        TestDataManager.writeDependantGlobalTestData("SalesContract");
        app.fullBookingJourneyPage.clickOnProjectTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Project_Type_EN"), data.get("Project_Type_AR"), FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        logger.info("Step 05: Select Region and City");
        app.fullBookingJourneyPage.clickOnRegionDropdown();
        app.fullBookingJourneyPage.selectRegion(data.get("Region_EN"), data.get("Region_AR"));
        app.fullBookingJourneyPage.enterCityName(data.get("City_EN"), data.get("City_AR"));
        app.fullBookingJourneyPage.selectCity(data.get("City_EN"), data.get("City_AR"));
        logger.info("Step 10: Select Developer name and Subsidize level");
        app.fullBookingJourneyPage.enterDeveloperName(data.get("Developer_Name"));
        app.fullBookingJourneyPage.clickOnSubsidizeDropdown();
        CommonUtilityPage.selectFromList(data.get("Subsidize_Level_EN"), data.get("Subsidize_Level_AR"), FullBookingJourneyPageObjects.SubsidizeDropdownList());
        logger.info("Step 06: Click on Is Bookable radio button and select Status");
        app.fullBookingJourneyPage.clickOnIsBookableToggle();
        app.fullBookingJourneyPage.clickOnStatusDropdown();
        CommonUtilityPage.selectFromList(data.get("Status_EN"), data.get("Status_AR"), FullBookingJourneyPageObjects.StatusDropdownList());
        logger.info("Step 07: Select Subsidy type from dropdown");
        app.fullBookingJourneyPage.clickOnSubsidyTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Subsidy_Type_EN"), data.get("Subsidy_Type_AR"), FullBookingJourneyPageObjects.SubsidyTypeDropdownList());
        logger.info("Step 08: Enter Max subsidy amount > Select Project Agreement Sign date ");
        app.fullBookingJourneyPage.enterMaxSubsidyAmount(data.get("Max_Subsidy_Amount"));
        app.fullBookingJourneyPage.clickOnProjectAgreementDateCalender();
        app.fullBookingJourneyPage.selectDateFromCalender(data.get("Project_Agreement_Date"));
        logger.info("Step 09: Enter Project license number > Select Project License Date");
        app.fullBookingJourneyPage.enterProjectLicenseNumber(data.get("Project_License_Num"));
        app.fullBookingJourneyPage.clickOnProjectLicenseDateCalender();
        app.fullBookingJourneyPage.selectDateFromCalender(data.get("Project_License_Date"));
        logger.info("Step 10: Enter Escrow account number > Select the Escrow bank account");
        app.fullBookingJourneyPage.enterAccountNumber(data.get("Account_Num"));
        app.fullBookingJourneyPage.clickOnBankNameDropdown();
        CommonUtilityPage.selectFromList(data.get("Bank_Name"), FullBookingJourneyPageObjects.BankNameDropdownList());
        logger.info("Step 11: Enter Project deduct percentage, Deed city, Land delivery date to the developer ");
        app.fullBookingJourneyPage.enterProjectDeductPercentage(data.get("Deduct_Percentage"));
        app.fullBookingJourneyPage.enterDeedCity(data.get("Deed_City"));
        app.fullBookingJourneyPage.enterLandDeliveryDate(data.get("Land_Delivery_Date"));
        logger.info("Step 12: Click on save button");
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Record saved successfully", "تم الحفظ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        logger.info("Step 13: Navigate to Units page > Click on New Import Unit button");
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullBookingJourneyPage.clickOnNewImportUnitButton();
        logger.info("Step 14: Select unit type");
        app.fullBookingJourneyPage.clickOnUnitTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Unit_Type_AR"), data.get("Unit_Type_EN"), FullBookingJourneyPageObjects.UnitTypeDropdownList());
        logger.info("Step 15: Upload import file (xlsx) and Save");
        CommonUtilityPage.UploadAttachment(data.get("Excel_Attachment"), FullBookingJourneyPageObjects.UploadUnitImportFile());
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Units import started successfully", "استيراد الوحدات بدأ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        logger.info("Step 16: Commit the import");
        app.fullBookingJourneyPage.clickOnCommitButton();
        app.fullBookingJourneyPage.clickOnOkButtonOnPopup();
        CommonUtilityPage.verifyValueIsDisplayed("إرسال طلب اعتماد الاستيراد", "Sent request to commit import", FullBookingJourneyPageObjects.SystemPopupMessage());
        logger.info("Step 17: Navigate to Media page");
        app.fullBookingJourneyPage.clickOnBackButton();
        app.fullBookingJourneyPage.clickOnMediaTab();
        logger.info("Step 18: Attach file for Banner image and upload");
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.BannerImageAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        logger.info("Step 19: Enter title of details page, Name, Summary, Description, Price starting at, Latitude & Longitude and Save");
        app.fullBookingJourneyPage.enterTitleOfDetailPage(projectName);
        app.fullBookingJourneyPage.enterProjectDisplayName(projectName);
        app.fullBookingJourneyPage.enterSummary(data.get("Summary") + " _ " + RandomStringUtils.randomAlphanumeric(50));
        app.fullBookingJourneyPage.enterDescription(data.get("Description") + " _ " + RandomStringUtils.randomAlphanumeric(50));
        app.fullBookingJourneyPage.enterPricingStartingAt(data.get("Start_Price"));
        app.fullBookingJourneyPage.enterLatitude(data.get("Latitude"));
        app.fullBookingJourneyPage.enterLongitude(data.get("Longitude"));
        app.fullBookingJourneyPage.clickOnSaveButtonOnMediaPage();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media data saved successfully", "تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        app.fullBookingJourneyPage.clickOnProjectDetailsTab();
        logger.info("Step 20: Approve the Media");
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        app.fullBookingJourneyPage.clickOnApproveMediaButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media approval is in progress now. Please review in few seconds", "طلب الموافقة على المحتوى المرئي تحت المعالجة الرجاء الانتظار", FullBookingJourneyPageObjects.SystemPopupMessage());
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        logger.info("Step 21: Navigate to 'Project financial institutions' page > Select all the banks > Save");
        app.fullBookingJourneyPage.clickOnProjectFinancialInstitutionTab();
        app.fullBookingJourneyPage.selectAllBanksInProjectFinancialInstitution();
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Record saved successfully", "تم الحفظ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        logger.info("Step 22: Navigate to Booking document templates page > Attachment Booking file > Select type > upload the file ");
        app.fullBookingJourneyPage.clickOnBookingDocumentTemplateTab();
        CommonUtilityPage.UploadAttachment(data.get("Word_Attachment"), FullBookingJourneyPageObjects.BookingDocumentTemplateInputAttachment());
        app.fullBookingJourneyPage.clickOnDocumentTemplateTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Booking_Template_Type_EN"), data.get("Booking_Template_Type_AR"), FullBookingJourneyPageObjects.BookingTemplateTypeDropdownList());
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Document uploaded successfully", "تم تحميل المستند بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        logger.info("Step 23: Navigate to Unit Models page > Create Unit > Save");
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullBookingJourneyPage.clickOnUnitModelName();
        app.fullBookingJourneyPage.clickOnSaveIcon();
        logger.info("Step 24: Click on media tab > Save");
        app.fullBookingJourneyPage.clickOnMediaSectionLabelOnUnitModelPage();
        app.fullBookingJourneyPage.clickOnSaveIcon();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media data saved successfully", "تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        logger.info("Step 25: Approve media");
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        app.fullBookingJourneyPage.clickOnApproveMediaButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media approval is in progress now. Please review in few seconds", "طلب الموافقة على المحتوى المرئي تحت المعالجة الرجاء الانتظار", FullBookingJourneyPageObjects.SystemPopupMessage());
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        logger.info("Step 28: Save the project");
        app.fullBookingJourneyPage.clickOnBackArrowButton();
        app.fullBookingJourneyPage.clickOnScrollArrowStart();
        app.fullBookingJourneyPage.clickOnProjectDetailsTab();
        app.fullBookingJourneyPage.clickOnProjectSettingTab();
        app.fullBookingJourneyPage.turnOffUsingGeneralBookingFeeToggle();
        app.fullBookingJourneyPage.turnOffUsingThisFeeInSakaniAndPartnersToggles();
        app.fullBookingJourneyPage.verifyUsingGeneralBookingFeeToggleIsOFF();
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Record saved successfully", "تم الحفظ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partners & Login");
        // //app.loginPage.alertBoxLogin();
        // app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
        logger.info("Step 02: Click on Projects in side menu");
        app.salesContractPage.clickOnProjectsMenuOption();
        app.salesContractPage.verifyProjectsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        logger.info("Step 01: Navigate to Sakani Partners & Login");
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        app.salesContractPage.verifySearchedProjectIsDisplayed(data.get("ProjectName"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
        logger.info("Step 02: Click on Projects in side menu");
        app.salesContractPage.clickOnProjectsMenuOption();
        logger.info("Step 03: Verify 'search' button in disabled");
        app.salesContractPage.verifySearchButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        app.salesContractPage.verifyProjectDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 09: Verify the project type");
        app.salesContractPage.verifyProjectType(data.get("Project_Type_EN"), data.get("Project_Type_AR"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 09: Click on Project unit tab");
        app.salesContractPage.clickOnProjectUnitTab();
        CommonUtilityPage.verifyValueIsDisplayed("قائمة الوحدات", "Unit list", SalesContractPageObject.UnitListText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        CommonUtilityPage.verifyValueIsDisplayed("تاريخ عقود البيع", "Sales contracts history", SalesContractPageObject.SaleContractsHistoryText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        CommonUtilityPage.verifyValueIsDisplayed("عقد البيع", "Sales contract", SalesContractPageObject.SaleContractTextOnApprovePopup());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        CommonUtilityPage.verifyValueIsDisplayed("التحقق من رمز التحقق", "OTP verification", SalesContractPageObject.OTPVerificationPopup());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        CommonUtilityPage.verifyValueIsDisplayed("عقد", "contract", SalesContractPageObject.SignContractSuccessMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 09: Verify contract details are displayed");
        app.salesContractPage.clickOnSaleContractUnitTab();
        app.salesContractPage.verifySalesContractDetailsAreDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 09: Click on the file name of sale contract");
        app.salesContractPage.clickOnSaleContractUnitTab();
        app.salesContractPage.clickOnSaleContractFileName();
        CommonUtilityPage.verifyValueIsDisplayed("عقد البيع", "Sales contract", SalesContractPageObject.SaleContractTextOnApprovePopup());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        app.salesContractPage.clickOnSaleContractUnitTab();
        logger.info("Step 09: Click on the file name of sale contract");
        app.salesContractPage.clickOnSaleContractDownloadButton();
        Browser.waitForSeconds(3);
        CommonUtilityPage.verifyNewTabIsOpened();
    }


    /**
     * Admin verify the Sale contract is approved and publish the project
     * From TC_15 - TC_19
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_15_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        app.fullBookingJourneyPage.clickOnSaleContractApprovalRecordsTab();
        logger.info("Step 07: Verify the status is approved ");
        app.fullBookingJourneyPage.verifyTheSaleContractStatus("Approved");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        logger.info("Step 06: Turn on link with AZM toggle");
        app.fullBookingJourneyPage.turnOnLinkWithAzmToggle();
        app.fullBookingJourneyPage.verifyLinkWithAzmToggleIsOn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        logger.info("Step 06: Click on Link with AZM item");
        app.fullBookingJourneyPage.turnOnLinkWithAzmToggle();
        logger.info("Step 07: Click on save button");
        app.fullBookingJourneyPage.clickOnSaveButton();
        app.fullBookingJourneyPage.verifyToastMessage("Record saved successfully", "تم الحفظ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Project publishment updated successfully", "تم تحديث نشر المشروع بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        logger.info("Step 06: Click Publish radio button");
        app.fullBookingJourneyPage.clickOnIsPublishedToggle();
        app.fullBookingJourneyPage.verifyIsPublishedToggleIsOn();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Project publishment updated successfully", "تم تحديث نشر المشروع بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        logger.info("Step 07: Click on save button");
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        app.fullBookingJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Record saved successfully", "تم الحفظ بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        CommonUtilityPage.verifyValueIsDisplayed("تاريخ النشر", "Publish date", FullBookingJourneyPageObjects.PublishedDate());
    }

    /**
     * User update Financial Advisory request from Housing
     * TC_21 to TC_23
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_21_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        logger.info("Step 03: Navigate to user dashboard");
        Browser.moveToElement(CommonUtilityPageObjects.ErrorToastMessage());
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Check user Financial Recommendation");
        CommonUtilityPage.verifyValueIsDisplayed("صمم دعمك", "Purchasing power", SalesContractPageObject.PurchasingPowerText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        logger.info("Step 03: Navigate to user dashboard");
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to Update Financial Recommendation");
        app.fullBookingJourneyPage.clickOnUpdateMyInformationLink();
        CommonUtilityPage.verifyValueIsDisplayed("المستشار العقاري", "Financial Advisory", FullBookingJourneyPageObjects.ConfirmFinalPurchasingPowerPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        logger.info("Step 03: Navigate to user dashboard");
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to Update Financial Recommendation");
        app.fullBookingJourneyPage.clickOnUpdateMyInformationLink();
        app.fullBookingJourneyPage.clickOnUpdateFinancialInformationButton();
        logger.info("Step 05: Enter required data");
        app.fullBookingJourneyPage.clickOnEmploymentTypeDropdown();
        CommonUtilityPage.selectFromList(data.get("Employment_Type_AR"), data.get("Employment_Type_EN"), FullBookingJourneyPageObjects.EmploymentTypeDropdownList());
        app.fullBookingJourneyPage.clickOnTypeOfSalaryBankDropdown();
        CommonUtilityPage.selectFromList(data.get("Salary_Bank_Type_AR"), data.get("Salary_Bank_Type_EN"), FullBookingJourneyPageObjects.TypeOfSalaryBankDropdownList());
        app.fullBookingJourneyPage.enterBasicSalary(data.get("Basic_Salary"));
        app.fullBookingJourneyPage.enterHousingAllowance(data.get("HousingAllowance"));
        app.fullBookingJourneyPage.enterOtherAllowance(data.get("OtherAllowance"));
        app.fullBookingJourneyPage.enterFinancialSaving(data.get("FinancialSaving"));
        app.fullBookingJourneyPage.enterDownPayment(data.get("DownPayment"));
        app.fullBookingJourneyPage.enterMonthlyCommitment(data.get("MonthlyCommitment"));
        app.fullBookingJourneyPage.enterDurationOfCommitment(data.get("Duration_Of_Commitment"));
        app.fullBookingJourneyPage.selectProductType(data.get("ProductType"));
        logger.info("Step 06: Click on Agree to terms and conditions");
        app.fullBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 07: Click on Submit button");
        app.fullBookingJourneyPage.clickOnSubmitButton();
        CommonUtilityPage.verifyValueIsDisplayed("تهانينا", "Congratulation", FullBookingJourneyPageObjects.AdvisorySuccessMessage());
    }


    /**
     * User Books a unit
     * From TC_24 - TC_26
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_24_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        logger.info("Step 10: Click on unit from available displayed units ");
        app.fullBookingJourneyPage.selectUnitForBooking();
        logger.info("Step 10: Click on Book unit button");
        app.fullBookingJourneyPage.clickOnBookUnitButton();
        logger.info("Step 11: Click Terms and conditions checkbox");
        app.fullBookingJourneyPage.clickOnDisclaimerCheckbox();
        logger.info("Step 12: Click on Continue button");
        app.fullBookingJourneyPage.clickOnContinueButton();
        logger.info("Step 13: Click on Continue button");
        CommonUtilityPage.verifyValueIsDisplayed("شهادة التوصيات المالية", "Financial Recommendations Certificate", FullBookingJourneyPageObjects.FinancialRecommendationCertificatePageTitle());
        app.fullBookingJourneyPage.clickOnContinueButton();
        logger.info("Step 14: Click on Confirm Booking button");
        app.priceQuotationPage.ClickOnConfirmBooking();
        logger.info("Step 15: Close Rating Pop-UP");
        app.priceQuotationPage.cLoseRatingPopUp();
        logger.info("Step 16: Verify that the booking is done successfully");
        app.priceQuotationPage.verifySuccessMessageForUnitBooking();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
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
        CommonUtilityPage.verifyElementIsDisplayed("Financing options", SalesContractPageObject.FinancingOptionsHeading());
//        app.fullBookingJourneyPage.verifyBookingFeeStatus("مسددة", "Paid");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option > get unit code");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        app.salesContractPage.getUnitCode();
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

    /**
     * Developer verify the unit has been booked from Partners
     * From TC_27 - TC_32
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_27_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partners & Login");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
        logger.info("Step 02: Click on Projects in side menu");
        app.salesContractPage.clickOnProjectsMenuOption();
        app.salesContractPage.verifyProjectsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        logger.info("Step 01: Navigate to Sakani Partners & Login");
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        app.salesContractPage.verifySearchedProjectIsDisplayed(data.get("ProjectName"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        app.salesContractPage.verifyProjectDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 09: Click on Project unit tab");
        app.salesContractPage.clickOnProjectUnitTab();
        CommonUtilityPage.verifyValueIsDisplayed("قائمة الوحدات", "Unit list", SalesContractPageObject.UnitListText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_31_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 09: Click on Project unit tab");
        app.salesContractPage.clickOnProjectUnitTab();
        logger.info("Step 10: Click on Search By dropdown ");
        app.salesContractPage.clickOnSearchByDropdown();
        logger.info("Step 11: Select 'Project name'");
        CommonUtilityPage.selectFromList("رمز الوحدة", "Unit code", SalesContractPageObject.SearchByDropdownList());
        logger.info("Step 12: Input 'Project name'");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        app.salesContractPage.clickOnSearchButton();
        CommonUtilityPage.verifyValueIsDisplayed(data.get("UnitCode"), SalesContractPageObject.UnitCodeCell());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 09: Click on Project unit tab");
        app.salesContractPage.clickOnProjectUnitTab();
        logger.info("Step 10: Click on Search By dropdown ");
        app.salesContractPage.clickOnSearchByDropdown();
        logger.info("Step 11: Select 'Project name'");
        CommonUtilityPage.selectFromList("رمز الوحدة", "Unit code", SalesContractPageObject.SearchByDropdownList());
        logger.info("Step 12: Input 'Project name'");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        app.salesContractPage.clickOnSearchButton();
        app.salesContractPage.verifyTheUnitBookingStatus("Booked", "محجوز");
    }

    /**
     * Developer verify the unit has been booked from Partners
     * From TC_33 - TC_52
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_33_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 09: Verify contract details are displayed");
        app.salesContractPage.clickOnSaleContractUnitTab();
        app.salesContractPage.verifySalesContractDetailsAreDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        CommonUtilityPage.verifyValueIsDisplayed("تاريخ عقود البيع", "Sales contracts history", SalesContractPageObject.SaleContractsHistoryText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        CommonUtilityPage.verifyValueIsDisplayed("Annex", "Annex", SalesContractPageObject.AnnexPageText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        CommonUtilityPage.verifyValueIsEntered(data.get("UnitCode"), SalesContractPageObject.UnitCodeInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_37_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        app.salesContractPage.verifySearchedUnitIsDisplayed(data.get("UnitCode"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_38_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        CommonUtilityPage.verifyValueIsDisplayed("إضافة ملحق للوحدات المختارة", "Add annex to selected units", SalesContractPageObject.AddAnnexToSelectedUnitButton());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_39_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        app.salesContractPage.verifyAddAnnexToSelectedUnitButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        CommonUtilityPage.verifyValueIsDisplayed("اضافة الملحق", "Add annex", SalesContractPageObject.AddAnnexPopupTitle());
        CommonUtilityPage.verifyValueIsDisplayed("تحميل الملف المرفق", "Kindly upload the annex file", SalesContractPageObject.AddAnnexAttachmentText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_41_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload invalid file for Annex (except PDF)");
        CommonUtilityPage.UploadAttachment(data.get("Invalid_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyErrorIconIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_42_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload large file for Annex");
        CommonUtilityPage.UploadAttachment(data.get("Large_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyErrorIconIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_43_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload valid file for Annex (PDF)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyAnnexFileIsUploaded(data.get("PDF_Attachment"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_44_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload valid file for Annex (PDF)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyAnnexFileIsUploaded(data.get("PDF_Attachment"));
        logger.info("Step 16: Click on download arrow");
        app.salesContractPage.clickOnDownloadAnnexFileArrow();
        CommonUtilityPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_45_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Click on Upload button for upload annex file");
        app.salesContractPage.clickOnUploadAnnexFileButton();
        CommonUtilityPage.verifyValueIsDisplayed("هذا الحقل مطلوب", "This field is required", SalesContractPageObject.ErrorMessageForAnnexFileUpload());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_46_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload valid file for Annex (PDF)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyAnnexFileIsUploaded(data.get("PDF_Attachment"));
        logger.info("Step 16: Click on Upload button for upload annex file");
        app.salesContractPage.clickOnUploadAnnexFileButton();
        logger.info("Step 17: Click on Close (X) button");
        app.salesContractPage.clickOnXButtonOnOTPPopup();
        app.salesContractPage.verifyApproveAnnexPopupIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_47_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload valid file for Annex (PDF)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyAnnexFileIsUploaded(data.get("PDF_Attachment"));
        logger.info("Step 16: Click on Upload button for upload annex file");
        app.salesContractPage.clickOnUploadAnnexFileButton();
        CommonUtilityPage.verifyValueIsDisplayed("الموافقة على الملحق", "Approve Annex", SalesContractPageObject.ApproveAnnexPopup());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_48_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload valid file for Annex (PDF)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyAnnexFileIsUploaded(data.get("PDF_Attachment"));
        logger.info("Step 16: Click on Upload button for upload annex file");
        app.salesContractPage.clickOnUploadAnnexFileButton();
        logger.info("Step 17: Click on Approve button to approve annex");
        app.salesContractPage.clickOnApproveButton();
        CommonUtilityPage.verifyValueIsDisplayed("التحقق من رمز التحقق", "OTP verification", SalesContractPageObject.OTPVerificationPopup());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_49_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload valid file for Annex (PDF)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyAnnexFileIsUploaded(data.get("PDF_Attachment"));
        logger.info("Step 16: Click on Upload button for upload annex file");
        app.salesContractPage.clickOnUploadAnnexFileButton();
        logger.info("Step 17: Click on Approve button to approve annex");
        app.salesContractPage.clickOnApproveButton();
        logger.info("Step 18: Click on 'X' button");
        app.salesContractPage.clickOnXButtonOnOTPPopup();
        CommonUtilityPage.verifyValueIsDisplayed("Annex", "Annex", SalesContractPageObject.AnnexPageText());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_50_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload valid file for Annex (PDF)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyAnnexFileIsUploaded(data.get("PDF_Attachment"));
        logger.info("Step 16: Click on Upload button for upload annex file");
        app.salesContractPage.clickOnUploadAnnexFileButton();
        logger.info("Step 17: Click on Approve button to approve annex");
        app.salesContractPage.clickOnApproveButton();
        logger.info("Step 18: Enter OTP");
        app.salesContractPage.inputOTP(data.get("OTP"));
        CommonUtilityPage.verifyValueIsEntered(String.valueOf(data.get("OTP").charAt(0)), SalesContractPageObject.OTP());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_51_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload valid file for Annex (PDF)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyAnnexFileIsUploaded(data.get("PDF_Attachment"));
        logger.info("Step 16: Click on Upload button for upload annex file");
        app.salesContractPage.clickOnUploadAnnexFileButton();
        logger.info("Step 17: Click on Approve button to approve annex");
        app.salesContractPage.clickOnApproveButton();
        logger.info("Step 18: Click on Verify Code button");
        app.salesContractPage.clickOnVerifyCodeButton();
        CommonUtilityPage.verifyValueIsDisplayed("هذا الحقل مطلوب", "This field is required", SalesContractPageObject.OTPErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_52_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload valid file for Annex (PDF)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyAnnexFileIsUploaded(data.get("PDF_Attachment"));
        logger.info("Step 16: Click on Upload button for upload annex file");
        app.salesContractPage.clickOnUploadAnnexFileButton();
        logger.info("Step 17: Click on Approve button to approve annex");
        app.salesContractPage.clickOnApproveButton();
        logger.info("Step 18: Enter OTP");
        app.salesContractPage.inputOTP(data.get("OTP"));
        logger.info("Step 18: Click on Verify Code button");
        app.salesContractPage.clickOnVerifyCodeButton();
        CommonUtilityPage.verifyValueIsDisplayed("لقد نجحت في إضافة الملحق إلى الوحدات المختارة", "You have successfully added the annex to the selected units", SalesContractPageObject.AddAnnexSuccessMessage());
    }

    /**
     * Developer verify the annex is sent
     * From TC_53 - TC_55
     */


    @Test(dataProvider = "testDataProvider")
    public void TC_53_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Click on Sent Annexes");
        app.salesContractPage.clickOnSentAnnexTab();
        app.salesContractPage.verifySentAnnexDocumentIsDisplayed();
        app.salesContractPage.verifySentAnnexDate();
        app.salesContractPage.verifyShowUnitListButtonIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_54_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Click on Sent Annexes");
        app.salesContractPage.clickOnSentAnnexTab();
        logger.info("Step 12: Click on Show Units List button");
        app.salesContractPage.clickOnShowUnitsListButton();
        CommonUtilityPage.verifyValueIsDisplayed("قائمة الوحدات", "Unit list", SalesContractPageObject.SentAnnexUnitsList());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_55_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Click on Sent Annexes");
        app.salesContractPage.clickOnSentAnnexTab();
        logger.info("Step 12: Click on Show Units List button");
        app.salesContractPage.clickOnShowUnitsListButton();
        CommonUtilityPage.verifyValueIsDisplayed("approved", "approved", SalesContractPageObject.SentAnnexApproveStatus());
    }

    /**
     * User sign the Annex from Housing platform/Rejection
     * From TC_56 - TC_64
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_56_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("توقيع الملحق", "Sign annex", SalesContractPageObject.SignAnnexLink());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_57_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        app.salesContractPage.clickOnSignAnnexLink();
        CommonUtilityPage.verifyValueIsDisplayed("ملحق عقد البيع", "Sales contract annex", SalesContractPageObject.SignAnnexPageHeading());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_58_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        app.salesContractPage.clickOnSignAnnexLink();
        logger.info("Step 08: Click Reject button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        CommonUtilityPage.verifyValueIsDisplayed("نعم", "Yes", FullBookingJourneyPageObjects.YesButtonPopup());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_59_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        app.salesContractPage.clickOnSignAnnexLink();
        logger.info("Step 08: Click Reject button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        logger.info("Step 09: Click NO button on the pop up");
        app.fullBookingJourneyPage.clickOnNoButtonOnPopup();
        app.fullBookingJourneyPage.verifyConfirmationPopupIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_60_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        app.salesContractPage.clickOnSignAnnexLink();
        logger.info("Step 08: Click Reject button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        logger.info("Step 09: Click Yes button on the pop up");
        app.fullBookingJourneyPage.clickOnYesButtonOnPopup();
        CommonUtilityPage.verifyValueIsDisplayed("رفض المرفق", "Reject annex", SalesContractPageObject.RejectAnnexPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_61_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        app.salesContractPage.clickOnSignAnnexLink();
        logger.info("Step 08: Click Reject button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        logger.info("Step 09: Click Yes button on the pop up");
        app.fullBookingJourneyPage.clickOnYesButtonOnPopup();
        logger.info("Step 10: Enter text in Reason for rejecting text box");
        app.fullBookingJourneyPage.enterRejectionReason("Test reason of rejection");
        CommonUtilityPage.verifyValueIsEntered("Test reason of rejection", FullBookingJourneyPageObjects.RejectionReasonInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_62_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        app.salesContractPage.clickOnSignAnnexLink();
        logger.info("Step 08: Click Reject button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        logger.info("Step 09: Click Yes button on the pop up");
        app.fullBookingJourneyPage.clickOnYesButtonOnPopup();
        logger.info("Step 10: Click on Cancel button on Reject Annex page");
        app.fullBookingJourneyPage.clickOnCancelButtonOnPopup();
        app.mohLandBookingJourneyPage.verifyBookingDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_63_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        app.salesContractPage.clickOnSignAnnexLink();
        logger.info("Step 08: Click Reject button");
        app.fullBookingJourneyPage.clickOnRejectButton();
        logger.info("Step 09: Click Yes button on the pop up");
        app.fullBookingJourneyPage.clickOnYesButtonOnPopup();
        logger.info("Step 10: Enter text in Reason for rejecting text box");
        app.fullBookingJourneyPage.enterRejectionReason("Test reason of rejection");
        logger.info("Step 11: Click on Confirm Rejection button on Reject Annex page");
        app.eligibilityPage.clickOnConfirmButton();
        app.mohLandBookingJourneyPage.verifyBookingDetailsPageIsDisplayed();
        app.salesContractPage.verifySignAnnexLinkIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_64_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 14: Click on Sent Annexes");
        app.salesContractPage.clickOnSentAnnexTab();
        logger.info("Step 15: Click on Show Units List button");
        app.salesContractPage.clickOnShowUnitsListButton();
        app.salesContractPage.clickOnSearchByDropdown();
        CommonUtilityPage.selectFromList("رمز الوحدة", "Unit Code", SalesContractPageObject.SearchByDropdownList());
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 16: Verify the Annex status");
        CommonUtilityPage.verifyValueIsDisplayed("rejected", "rejected", SalesContractPageObject.SentAnnexApproveStatus());
    }

    /**
     * User sign the Annex from Housing platform/Approval
     * From TC_65 - TC_70
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_65_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 11: Enter unit code in search field");
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        logger.info("Step 12: Click on Search button");
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 13: Select unit to add annex");
        app.salesContractPage.clickOnUnitSelectionCheckbox();
        logger.info("Step 14: Click Add Annex to selected unit button");
        app.salesContractPage.clickOnAddAnnexToSelectedUnit();
        logger.info("Step 15: Upload valid file for Annex (PDF)");
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), SalesContractPageObject.AnnexFileUpload());
        app.salesContractPage.verifyAnnexFileIsUploaded(data.get("PDF_Attachment"));
        logger.info("Step 16: Click on Upload button for upload annex file");
        app.salesContractPage.clickOnUploadAnnexFileButton();
        logger.info("Step 17: Click on Approve button to approve annex");
        app.salesContractPage.clickOnApproveButton();
        logger.info("Step 18: Enter OTP");
        app.salesContractPage.inputOTP(data.get("OTP"));
        logger.info("Step 18: Click on Verify Code button");
        app.salesContractPage.clickOnVerifyCodeButton();
        CommonUtilityPage.verifyValueIsDisplayed("لقد نجحت في إضافة الملحق إلى الوحدات المختارة", "You have successfully added the annex to the selected units", SalesContractPageObject.AddAnnexSuccessMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_66_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        app.salesContractPage.clickOnSignAnnexLink();
        logger.info("Step 08: Click on Approve button");
        app.fullBookingJourneyPage.clickOnApproveButton();
        CommonUtilityPage.verifyValueIsDisplayed("رمز التحقق", "Verify OTP", FullBookingJourneyPageObjects.VerifyOTPPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_67_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        app.salesContractPage.clickOnSignAnnexLink();
        logger.info("Step 08: Click on Approve button");
        app.fullBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 09: Check 'Verify OTP' button is not enabled ");
        app.fullBookingJourneyPage.checkVerifyButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_68_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Verify Sign Annex Link is displayed");
        app.salesContractPage.clickOnSignAnnexLink();
        logger.info("Step 08: Click on Approve button");
        app.fullBookingJourneyPage.clickOnApproveButton();
        logger.info("Step 09: Input OTP ");
        app.loginPage.enterOTPForUser(data.get("OTP"));
        logger.info("Step 10: Click on verify OTP ");
        app.fullBookingJourneyPage.clickOnVerifyOTPButton();
        CommonUtilityPage.verifyValueIsDisplayed("تهانينا", "Congratulations", FullBookingJourneyPageObjects.SignSaleContractSuccessMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_69_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
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
        Browser.click(CommonUtilityPageObjects.ErrorToastMessage());
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Booking option");
        app.mohLandBookingJourneyPage.clickOnBookingsButton();
        logger.info("Step 06: Click on View booking button");
        app.mohLandBookingJourneyPage.clickOnViewBookingButton();
        logger.info("Step 07: Click on view annex");
        app.salesContractPage.clickOnViewAnnex();
        CommonUtilityPage.verifyValueIsDisplayed("الملحق", "Annex", SalesContractPageObject.ViewAnnexPopupTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_70_Sales_Contract(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("SalesContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani Partner site");
        //app.loginPage.alertBoxLogin();
        //app.salesContractPage.changeUILanguagePartners();
        // app.loginPage.clickOnLoginRegisterButtonInPartner();
        app.loginPage.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.loginPage.inputOTPSakaniPartner(data.get("OTP"));
        //app.salesContractPage.closePopUp();
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
        logger.info("Step 10: Click on Add Annex button");
        app.salesContractPage.clickOnAddAnnexButton();
        logger.info("Step 14: Click on Sent Annexes");
        app.salesContractPage.clickOnSentAnnexTab();
        logger.info("Step 15: Click on Show Units List button");
        app.salesContractPage.clickOnShowUnitsListButton();
        app.salesContractPage.clickOnSearchByDropdown();
        CommonUtilityPage.selectFromList("رمز الوحدة", "Unit Code", SalesContractPageObject.SearchByDropdownList());
        app.salesContractPage.enterUnitCode(data.get("UnitCode"));
        app.salesContractPage.clickOnSearchButton();
        logger.info("Step 16: Verify the Annex status");
        CommonUtilityPage.verifyValueIsDisplayed("signed", "signed", SalesContractPageObject.SentAnnexApproveStatus());
    }
}