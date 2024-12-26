package sa.nhc.web;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.FiltersPageObjects;
import sa.nhc.web.objects.MOHLandBookingJourneyPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class Filters extends NHCWebTest {

    /**
     * Prerequisite user registered
     * Buy Filter
     * TC_01 to TC_30
     */
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_01(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the buy filter popUp is displayed");
        app.mohLandBookingJourneyPage.verifyFilterResultPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_02(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Verify the text entered in location search field");
        app.filtersPage.verifyLocationIsEntered(data.get("LocationAR"), data.get("LocationEN"));
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_03(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        logger.info("Step 07: Verify the location search result is displayed and user able to select from location search result");
        CommonUtilityPage.verifyOptionIsSelected(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_04(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        logger.info("Step 07: Click on clear button");
        app.mohLandBookingJourneyPage.clickOnClearButton();
        logger.info("Step 08: Verify the text deleted from location search field");
        CommonUtilityPage.verifyValueIsNotEntered(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationInputFiled());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_05(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid location");
        app.filtersPage.enterLocation(data.get("Invalid_LocationAR"), data.get("Invalid_LocationEN"));
        logger.info("Step 06: Verify \"No items found\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("No items found", FiltersPageObjects.notFoundOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_06(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter mega project");
        app.filtersPage.enterMegaProject(data.get("Mega_Project"));
        logger.info("Step 06: Select the entered mega project");
        app.filtersPage.selectFromTheList(data.get("Mega_Project"), FiltersPageObjects.megaProjectDropdownList());
        logger.info("Step 07: Verify the user is able to select from \"Mega project\" list");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Mega_Project"), FiltersPageObjects.megaProjectDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_07(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter project");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Verify the text entered in Project search field");
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Name"), MOHLandBookingJourneyPageObjects.projectInputFiled());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_08(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter project");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheList(data.get("Project_Name"), FiltersPageObjects.projectDropdownList());
        logger.info("Step 07: Verify the project search result is displayed and user able to select from project search result");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Project_Name"), FiltersPageObjects.projectDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_09(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid project");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Invalid_Project_Name"));
        logger.info("Step 06: Verify \"No items found\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("No items found", FiltersPageObjects.notFoundOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_10(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the target audience option is selected");
        app.filtersPage.selectAllTargetAudience();
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_11(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter minimum price");
        app.filtersPage.enterMinimumPrice(data.get("Minimum_Price"));
        logger.info("Step 06: Verify the number entered in Minimum price search field");
        CommonUtilityPage.verifyValueIsEntered(data.get("Minimum_Price"), FiltersPageObjects.minimumPriceInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_12(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter maximum price");
        app.filtersPage.enterMaximumPrice(data.get("Maximum_Price"));
        logger.info("Step 06: Verify the number entered in Maximum price search field");
        app.filtersPage.verifyValueIsEntered(data.get("Maximum_Price"), FiltersPageObjects.maximumPriceInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_13(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid minimum price");
        app.filtersPage.enterMinimumPrice(data.get("Invalid_Minimum_Price"));
        logger.info("Step 06: Verify the error message \"Minimum range cannot be greater than the maximum range.\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("لا يمكن أن يكون الحد الأدنى للنطاق أكبر من الحد الأقصى للنطاق", "Minimum range cannot be greater than the maximum range", FiltersPageObjects.errorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_14(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid maximum price");
        app.filtersPage.enterMaximumPrice(data.get("Invalid_Maximum_Price"));
        logger.info("Step 06: Verify the error message \"Range value must be between 0 and 131231216.\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("يجب أن تتراوح قيمة النطاق", "Range value must be between", FiltersPageObjects.errorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_15(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the error message \"Minimum price/Maximum price can not empty\" is displayed");
        app.filtersPage.verifyMinimumAndMaximumPriceCannotBeEmpty();
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_16(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Click on units under construction project option");
        app.filtersPage.clickOnUnitsUnderConstructionProjectOption();
        logger.info("Step 06: Click on apartment unit option");
        app.filtersPage.clickOnApartmentUnitOption();
        logger.info("Step 07: Verify the user is able to select any unit type based on project type");
        CommonUtilityPage.verifyOptionIsSelected("شقة", "Apartment", FiltersPageObjects.apartmentUnitOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_17(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Click on units under construction project option");
        app.filtersPage.clickOnUnitsUnderConstructionProjectOption();
        logger.info("Step 06: Verify the user is able to select all unit type based on project type");
        app.filtersPage.selectAllUnitsOption(FiltersPageObjects.allUnitsOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_18(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Click on readyMade units project option");
        app.filtersPage.clickOnReadyMadeUnitsProjectOption();
        logger.info("Step 06: Click on apartment unit option");
        app.filtersPage.clickOnApartmentUnitOption();
        logger.info("Step 07: Verify the user is able to select any unit type based on project type");
        CommonUtilityPage.verifyOptionIsSelected("شقة", "Apartment", FiltersPageObjects.apartmentUnitOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_19(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Click on readyMade units project option");
        app.filtersPage.clickOnReadyMadeUnitsProjectOption();
        logger.info("Step 06: Verify the user is able to select all unit type based on project type");
        app.filtersPage.selectAllUnitsOption(FiltersPageObjects.allUnitsOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_20(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Click on lands project option");
        app.filtersPage.clickOnLandsProjectOption();
        logger.info("Step 06: Verify the user is able to select only one unit type based on project type");
        app.filtersPage.selectAllUnitsOption(FiltersPageObjects.allLandsUnitsOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_21(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter minimum area");
        app.filtersPage.enterMinimumArea(data.get("Minimum_Area"));
        logger.info("Step 06: Verify the number entered in Minimum area search field");
        CommonUtilityPage.verifyValueIsEntered(data.get("Minimum_Area"), FiltersPageObjects.minimumAreaInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_22(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter maximum area");
        app.filtersPage.enterMinimumArea(data.get("Maximum_Area"));
        logger.info("Step 06: Verify the number entered in Maximum area search field");
        CommonUtilityPage.verifyValueIsEntered(data.get("Maximum_Area"), FiltersPageObjects.minimumAreaInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_23(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid maximum area");
        app.filtersPage.enterMaximumArea(data.get("Invalid_Maximum_Area"));
        logger.info("Step 06: Verify the error message \"Range value must be between 0 and 4000.\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("يجب أن تتراوح قيمة النطاق", "Range value must be between", FiltersPageObjects.errorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_24(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the error message \"Minimum area/Maximum\" area can not empty is displayed");
        app.filtersPage.verifyMinimumAndMaximumAreaCannotBeEmpty();
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_25(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Click on one bed room option");
        app.filtersPage.clickOnOneBedRoomOption();
        logger.info("Step 06: Verify the user is able to select any bed rooms");
        CommonUtilityPage.verifyOptionIsSelected("1", "1", FiltersPageObjects.oneBedRoomOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_26(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the user is able to select all bed rooms");
        app.filtersPage.selectAllUnitsOption(FiltersPageObjects.allBedRoomsOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_27(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        logger.info("Step 07: Click on apply button");
        app.filtersPage.clickOnApplyButton();
        logger.info("Step 08: Verify the search result is displayed");
        app.filtersPage.verifyTheApplyResult(data.get("LocationAR"), data.get("LocationEN"));
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_28(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid data");
        app.filtersPage.enterMaximumPrice("0");
        app.filtersPage.clickOnUnitsUnderConstructionProjectOption();
        logger.info("Step 06: Click on apply button");
        app.filtersPage.clickOnApplyButton();
        logger.info("Step 07: Verify the message \"There are no results\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("لا توجد نتائج للبحث", "There are no results", FiltersPageObjects.noResultsMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_29(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the all search fields are cleared");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        app.mohLandBookingJourneyPage.clickOnClearButton();
        CommonUtilityPage.verifyValueIsNotEntered(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationInputFiled());
        app.filtersPage.enterMegaProject(data.get("Mega_Project"));
        app.filtersPage.selectFromTheList(data.get("Mega_Project"), FiltersPageObjects.megaProjectDropdownList());
        app.mohLandBookingJourneyPage.clickOnClearButton();
        CommonUtilityPage.verifyValueIsNotEntered(data.get("Mega_Project"), FiltersPageObjects.megaProjectInputFiled());
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.filtersPage.selectFromTheList(data.get("Project_Name"), FiltersPageObjects.projectDropdownList());
        app.mohLandBookingJourneyPage.clickOnClearButton();
        CommonUtilityPage.verifyValueIsNotEntered(data.get("Project_Name"), MOHLandBookingJourneyPageObjects.projectInputFiled());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_30(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on buy button");
        app.filtersPage.clickOnBuyButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Click on close x button");
        app.filtersPage.clickOnCloseXButton();
        logger.info("Step 06: Verify the buy filter popup is closed");
        app.filtersPage.verifyTheFilterPopupWidowIsClosed();
    }

    /**
     * Prerequisite user registered
     * Rent Filter
     * TC_31 to TC_46
     */
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_31(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the rent filter popUp is displayed");
        app.mohLandBookingJourneyPage.verifyFilterResultPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_32(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Verify the text entered in location search field");
        app.filtersPage.verifyLocationIsEntered(data.get("LocationAR"), data.get("LocationEN"));
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_33(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        logger.info("Step 07: Verify the location search result is displayed and user able to select from location search result");
        CommonUtilityPage.verifyOptionIsSelected(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_34(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        logger.info("Step 07: Click on clear button");
        app.mohLandBookingJourneyPage.clickOnClearButton();
        logger.info("Step 08: Verify the text deleted from location search field");
        CommonUtilityPage.verifyValueIsNotEntered(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationInputFiled());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_35(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid location");
        app.filtersPage.enterLocation(data.get("Invalid_LocationAR"), data.get("Invalid_LocationEN"));
        logger.info("Step 06: Verify \"No items found\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("No items found", FiltersPageObjects.notFoundOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_36(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter minimum price");
        app.filtersPage.enterMinimumPrice(data.get("Minimum_Price"));
        logger.info("Step 06: Verify the number entered in Minimum price search field");
        app.filtersPage.verifyValueIsEntered(data.get("Minimum_Price"), FiltersPageObjects.minimumPriceInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_37(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter maximum price");
        app.filtersPage.enterMaximumPrice(data.get("Maximum_Price"));
        logger.info("Step 06: Verify the number entered in Maximum price search field");
        app.filtersPage.verifyValueIsEntered(data.get("Maximum_Price"), FiltersPageObjects.maximumPriceInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_38(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid minimum price");
        app.filtersPage.enterMinimumPrice(data.get("Invalid_Minimum_Price"));
        logger.info("Step 06: Verify the error message \"Minimum range cannot be greater than the maximum range.\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("لا يمكن أن يكون الحد الأدنى للنطاق أكبر من الحد الأقصى للنطاق", "Minimum range cannot be greater than the maximum range", FiltersPageObjects.errorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_39(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid maximum price");
        app.filtersPage.enterMaximumPrice(data.get("Invalid_Maximum_Price"));
        logger.info("Step 06: Verify the error message \"Range value must be between 1200 and 482839.\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("يجب أن تتراوح قيمة النطاق", "Range value must be between", FiltersPageObjects.errorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_40(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the error message \"Minimum price/Maximum price can not empty\" is displayed");
        app.filtersPage.verifyMinimumAndMaximumPriceCannotBeEmpty();
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_41(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Click on apartment unit option");
        app.filtersPage.clickOnApartmentUnitOption();
        logger.info("Step 06: Verify the user is able to select any unit type");
        CommonUtilityPage.verifyOptionIsSelected("شقة", "Apartment", FiltersPageObjects.apartmentUnitOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_42(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the user is able to select all unit type");
        app.filtersPage.selectAllUnitsOption(FiltersPageObjects.allUnitsOption());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_43(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        logger.info("Step 07: Click on apply button");
        app.filtersPage.clickOnApplyButton();
        logger.info("Step 08: Verify the search result is displayed");
        app.filtersPage.verifyTheApplyResult(data.get("LocationAR"), data.get("LocationEN"));
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_44(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid data");
        app.filtersPage.enterMaximumPrice("1200");
        app.filtersPage.clickOnApartmentUnitOption();
        logger.info("Step 06: Click on apply button");
        app.filtersPage.clickOnApplyButton();
        logger.info("Step 07: Verify the message \"There are no results\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("لا توجد نتائج للبحث", "There are no results", FiltersPageObjects.noResultsMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_45(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the all search fields are cleared");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        app.mohLandBookingJourneyPage.clickOnClearButton();
        CommonUtilityPage.verifyValueIsNotEntered(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationInputFiled());
    }

    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_46(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on rent button");
        app.filtersPage.clickOnRentButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Click on close x button");
        app.filtersPage.clickOnCloseXButton();
        logger.info("Step 06: Verify the rent filter popup is closed");
        app.filtersPage.verifyTheFilterPopupWidowIsClosed();
    }
    /**
     * Prerequisite user registered
     * Auction Filter
     * TC_47 to TC_62
     */
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_47(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the auction filter popUp is displayed");
        app.mohLandBookingJourneyPage.verifyFilterResultPopupIsDisplayed();
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_48(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Verify the text entered in location search field");
        app.filtersPage.verifyLocationIsEntered(data.get("LocationAR"), data.get("LocationEN"));
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_49(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        logger.info("Step 07: Verify the location search result is displayed and user able to select from location search result");
        CommonUtilityPage.verifyOptionIsSelected(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_50(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        logger.info("Step 07: Click on clear button");
        app.mohLandBookingJourneyPage.clickOnClearButton();
        logger.info("Step 08: Verify the text deleted from location search field");
        CommonUtilityPage.verifyValueIsNotEntered(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationInputFiled());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_51(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid location");
        app.filtersPage.enterLocation(data.get("Invalid_LocationAR"), data.get("Invalid_LocationEN"));
        logger.info("Step 06: Verify \"No items found\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("No items found", FiltersPageObjects.notFoundOption());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_52(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter project");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Verify the text entered in Project search field");
        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Name"), MOHLandBookingJourneyPageObjects.projectInputFiled());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_53(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter project");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheList(data.get("Project_Name"), FiltersPageObjects.projectDropdownList());
        logger.info("Step 07: Verify the project search result is displayed and user able to select from project search result");
        CommonUtilityPage.verifyOptionIsSelected(data.get("Project_Name"), FiltersPageObjects.projectDropdownList());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_54(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid project");
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Invalid_Project_Name"));
        logger.info("Step 06: Verify \"No items found\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("No items found", FiltersPageObjects.notFoundOption());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_55(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter minimum area");
        app.filtersPage.enterMinimumArea(data.get("Minimum_Area"));
        logger.info("Step 06: Verify the number entered in Minimum area search field");
        CommonUtilityPage.verifyValueIsEntered(data.get("Minimum_Area"), FiltersPageObjects.minimumAreaInputField());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_56(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter maximum area");
        app.filtersPage.enterMinimumArea(data.get("Maximum_Area"));
        logger.info("Step 06: Verify the number entered in Maximum area search field");
        CommonUtilityPage.verifyValueIsEntered(data.get("Maximum_Area"), FiltersPageObjects.minimumAreaInputField());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_57(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid maximum area");
        app.filtersPage.enterMaximumArea(data.get("Invalid_Maximum_Area"));
        logger.info("Step 06: Verify the error message \"Range value must be between 0 and 2000.\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("يجب أن تتراوح قيمة النطاق", "Range value must be between", FiltersPageObjects.errorMessage());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_58(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the error message \"Minimum area/Maximum\" area can not empty is displayed");
        app.filtersPage.verifyMinimumAndMaximumAreaCannotBeEmpty();
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_59(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter location");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        logger.info("Step 06: Select the entered location");
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        logger.info("Step 07: Click on apply button");
        app.filtersPage.clickOnApplyButton();
        logger.info("Step 08: Verify the search result is displayed");
        app.filtersPage.verifyTheApplyResult(data.get("LocationAR"), data.get("LocationEN"));
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_60(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Enter invalid data");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        app.filtersPage.enterMinimumArea("100");
        logger.info("Step 06: Click on apply button");
        app.filtersPage.clickOnApplyButton();
        logger.info("Step 07: Verify the message \"There are no results\" is displayed");
        CommonUtilityPage.verifyValueIsDisplayed("لا توجد نتائج للبحث", "There are no results", FiltersPageObjects.noResultsMessage());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_61(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Verify the all search fields are cleared");
        app.filtersPage.enterLocation(data.get("LocationAR"), data.get("LocationEN"));
        app.filtersPage.selectFromTheLists(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationDropdownList());
        app.mohLandBookingJourneyPage.clickOnClearButton();
        CommonUtilityPage.verifyValueIsNotEntered(data.get("LocationAR"), data.get("LocationEN"), FiltersPageObjects.locationInputFiled());
        app.mohLandBookingJourneyPage.enterProjectName(data.get("Project_Name"));
        app.filtersPage.selectFromTheList(data.get("Project_Name"), FiltersPageObjects.projectDropdownList());
        app.mohLandBookingJourneyPage.clickOnClearButton();
        CommonUtilityPage.verifyValueIsNotEntered(data.get("Project_Name"), MOHLandBookingJourneyPageObjects.projectInputFiled());
    }
    @Test(dataProvider = "testDataProvider")
    public void Filters_TC_62(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
       // app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 02: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 03: Click on auction button");
        app.filtersPage.clickOnAuctionButton();
        logger.info("Step 04: Click on filter");
        app.mohLandBookingJourneyPage.clickOnFilterButton();
        logger.info("Step 05: Click on close x button");
        app.filtersPage.clickOnCloseXButton();
        logger.info("Step 06: Verify the auction filter popup is closed");
        app.filtersPage.verifyTheFilterPopupWidowIsClosed();
    }
}
