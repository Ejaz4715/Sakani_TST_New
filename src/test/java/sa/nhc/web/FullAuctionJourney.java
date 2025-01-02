package sa.nhc.web;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.FullAuctionJourneyPageObjects;
import sa.nhc.web.objects.FullBookingJourneyPageObjects;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

import static com.testcrew.web.Browser.driver;

public class FullAuctionJourney extends NHCWebTest {

    /**
     * Admin creates the Auction with all the required details
     * TC_01 - TC_42
     */

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_01(Map<String, String> data) throws Exception {
        //Verify admin is able to navigate to Auctions page
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        app.fullAuctionJourneyPage.verifyAuctionPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_02(Map<String, String> data) throws Exception {
        //Verify admin is able to click on  Add new auctions button
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");

        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        app.fullAuctionJourneyPage.verifyAddNewAuctionPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_03(Map<String, String> data) throws Exception {
        //Verify admin is able to enter valid Unit code
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter valid Unit Code > Verify project code is displayed");
        app.fullAuctionJourneyPage.enterValidUnitCode(data.get("Unit_Code"));
        app.fullAuctionJourneyPage.verifyProjectCodeIsRetrieved(data.get("Proj_Code"));
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_04(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Invalid Unit code
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter Invalid Unit Code > Verify project code is not displayed");
        app.fullAuctionJourneyPage.enterInvalidUnitCode("0000000");
        app.fullAuctionJourneyPage.verifyProjectCodeIsNotRetrieved();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_05(Map<String, String> data) throws Exception {
        //Verify admin is able to enter valid Starting bid price
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter valid Starting bid price");
        app.fullAuctionJourneyPage.enterStartingBidPrice(data.get("Starting_Bid_Price"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Starting_Bid_Price"), FullAuctionJourneyPageObjects.auctionStartingPriceInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_06(Map<String, String> data) throws Exception {
        //Verify admin is able to enter invalid Starting bid price
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter invalid Starting bid price > Verify error message");
        app.fullAuctionJourneyPage.enterStartingBidPrice("-40");
        app.fullAuctionJourneyPage.verifyStartBidPriceErrorMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_07(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Targeted price
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter Targeted price");
        app.fullAuctionJourneyPage.enterTargetedPrice(data.get("Targeted_Price"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Targeted_Price"), FullAuctionJourneyPageObjects.auctionTargetedPriceInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_08(Map<String, String> data) throws Exception {
        //Verify error message that displayed if enter Targeted price less than Starting bid price
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Displayed error message if enter Targeted price less than Starting bid price");
        app.fullAuctionJourneyPage.enterStartingBidPrice("100");
        app.fullAuctionJourneyPage.enterTargetedPrice("1");
        app.fullAuctionJourneyPage.validateErrorMsgIfTargetedPriceLessThanStartingBidPrice();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_09(Map<String, String> data) throws Exception {
        //Verify functionality of increasing/decreasing Starting bid price
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Increasing/decreasing Starting bid price");
        app.fullAuctionJourneyPage.clickOnIncreaseStartingBidPriceArrowAndVerifyPriceIsChanged("20");
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_10(Map<String, String> data) throws Exception {
        //Verify functionality of increasing/decreasing Targeted price
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Increasing/decreasing Targeted price");
        app.fullAuctionJourneyPage.clickOnDecreaseTargetBidPriceArrowAndVerifyPriceIsChanged("20");
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_11(Map<String, String> data) throws Exception {
        //Verify admin is able to select Start date
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Select Auction start date");
        app.fullAuctionJourneyPage.selectAuctionStartDateFromCalendar(0);
        app.fullAuctionJourneyPage.verifyAuctionStartDateHasBeenSelected();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_12(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Start time
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter auction start time");
        app.fullAuctionJourneyPage.enterStartTimeOfAuction(0, 0, 0);
        app.fullAuctionJourneyPage.verifyStartTimeOfAuctionIsEntered();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_13(Map<String, String> data) throws Exception {
        //Verify admin is able to select auction end date
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Select Auction end date");
        app.fullAuctionJourneyPage.selectAuctionEndDateFromCalendar(0);
        app.fullAuctionJourneyPage.verifyAuctionEndDateHasBeenSelected();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_14(Map<String, String> data) throws Exception {
        //Verify admin is able to enter End time
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter auction end time");
        app.fullAuctionJourneyPage.enterEndTimeOfAuction(0, 0, 0);
        app.fullAuctionJourneyPage.verifyEndTimeOfAuctionIsEntered();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_15(Map<String, String> data) throws Exception {
        //Verify error message that displayed if select end date less than start date
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Validate error message if auction end date less than auction start date");
        app.fullAuctionJourneyPage.validateErrorMessageIfEndDateIsLessThanStartDate(1, 0);
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_16(Map<String, String> data) throws Exception {
        //Verify admin is able to enabled Apply general setting label
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Click to enabled apply general setting label");
        app.fullAuctionJourneyPage.clickToEnabledApplyGeneralSettingLabel();
        app.fullAuctionJourneyPage.verifyApplyGeneralSettingToggleIsOn();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_17(Map<String, String> data) throws Exception {
        //Verify admin is able to disabled Apply general setting label
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Click to disabled apply general setting label");
        app.fullAuctionJourneyPage.disableApplyGeneralSettingToggle();
        app.fullAuctionJourneyPage.verifyApplyGeneralSettingToggleIsOff();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_18(Map<String, String> data) throws Exception {
        //Verify admin is able to enter valid Action fee amount
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter valid action fee amount");
        app.fullAuctionJourneyPage.enterValidActionFeeAmount(data.get("Action_Fee_Amount"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Action_Fee_Amount"), FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_19(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Invalid Action fee amount
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter Invalid action fee amount");
        app.fullAuctionJourneyPage.enterInvalidActionFeeAmountAndVerifyTheErrorMessage("-20");
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_20(Map<String, String> data) throws Exception {
        //Verify functionality of increasing/decreasing Action fee amount
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Verify user is able to increase/decrease action fee amount");
        app.fullAuctionJourneyPage.increaseActionFeeAmountAndVerify(data.get("Action_Fee_Amount"));
        app.fullAuctionJourneyPage.decreaseActionFeeAmountAndVerify(data.get("Action_Fee_Amount"));
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_21(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Added time
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter added time");
        app.fullAuctionJourneyPage.enterAddedTime("1", "10", "10");
        CommonUtilityPage.verifyValueIsEntered("1", FullAuctionJourneyPageObjects.inputAddTimeHours());
        CommonUtilityPage.verifyValueIsEntered("10", FullAuctionJourneyPageObjects.inputAddTimeMinutes());
        CommonUtilityPage.verifyValueIsEntered("10", FullAuctionJourneyPageObjects.inputAddTimeSeconds());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_22(Map<String, String> data) throws Exception {
        //Verify admin is able to enter valid Fixed increase number 1
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter valid fixed increase number 1");
        app.fullAuctionJourneyPage.enterValidFixedIncreaseNumber1("5");
        CommonUtilityPage.verifyValueIsEntered("5", FullAuctionJourneyPageObjects.fixedIncreaseNumber1());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_23(Map<String, String> data) throws Exception {
        //Verify error message when admin enter Invalid Fixed increase number 1
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter Invalid fixed increase number 1");
        app.fullAuctionJourneyPage.enterValidFixedIncreaseNumber1("-1");
        Browser.click(FullAuctionJourneyPageObjects.fixedIncreaseNumber2());
        CommonUtilityPage.verifyValueIsDisplayed("القيمة المدخلة خاطئة. أقل قيمة ممكنة هي 1", "The fixed increase number must be a positive number", FullAuctionJourneyPageObjects.valueErrorMsg());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_24(Map<String, String> data) throws Exception {
        //Verify functionality of increasing/decreasing Fixed increase number 1
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Increasing/Decreasing fixed increase number 1");
        app.fullAuctionJourneyPage.increaseFixedIncreaseNumberOneAndVerify("55");
        app.fullAuctionJourneyPage.decreaseFixedIncreaseNumberOneAndVerify("10");
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_25(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Fixed increase number 2
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter valid fixed increase number 2");
        app.fullAuctionJourneyPage.enterFixedIncreaseNumber2("7");
        CommonUtilityPage.verifyValueIsEntered("7", FullAuctionJourneyPageObjects.fixedIncreaseNumber2());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_26(Map<String, String> data) throws Exception {
        //Verify functionality of increasing/decreasing Fixed increase number 2
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Increasing/Decreasing fixed increase number 2");
        app.fullAuctionJourneyPage.increaseFixedIncreaseNumberTwoAndVerify("10");
        app.fullAuctionJourneyPage.decreaseFixedIncreaseNumberTwoAndVerify("44");
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_27(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Fixed increase number 3
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter valid fixed increase number 3");
        app.fullAuctionJourneyPage.enterFixedIncreaseNumber3("9");
        CommonUtilityPage.verifyValueIsEntered("9", FullAuctionJourneyPageObjects.fixedIncreaseNumber3());

    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_28(Map<String, String> data) throws Exception {
        //Verify functionality of increasing/decreasing Fixed increase number 3
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Increasing/Decreasing fixed increase number 3");
        app.fullAuctionJourneyPage.increaseFixedIncreaseNumberThreeAndVerify("9");
        app.fullAuctionJourneyPage.decreaseFixedIncreaseNumberThreeAndVerify("22");

    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_29(Map<String, String> data) throws Exception {
        //Verify error message that displayed if enter same value in Fixed increase number 1, 2, 3
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Validate error message if enter same value in fixed increase number");
        app.fullAuctionJourneyPage.enterSameValueInFixedIncreaseNumbers();
        app.fullAuctionJourneyPage.verifyErrorMessageForFixedIncreasePrice();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_30(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Period time for the Auction Winner take action
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter valid period time auction winner take action");
        app.fullAuctionJourneyPage.enterPeriodTimeAuctionWinnerTakeAction(data.get("Period_Time_Auction_Winner_Take_Action"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Period_Time_Auction_Winner_Take_Action"), FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_31(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Invalid Period time for the Auction Winner take action
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter Invalid period time auction winner take action");
        app.fullAuctionJourneyPage.enterInvalidPeriodTimeAuctionWinnerTakeAction(data.get("Period_Time_Auction_Winner_Take_Action"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Period_Time_Auction_Winner_Take_Action"), FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_32(Map<String, String> data) throws Exception {
        //Verify functionality of increasing/decreasing Period time for the Auction Winner take action
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Increasing/Decreasing period time auction winner take action");
        app.fullAuctionJourneyPage.increasePeriodTimeAuctionWinnerTakeActionAndVerify(data.get("Period_Time_Auction_Winner_Take_Action"));
        app.fullAuctionJourneyPage.decreasePeriodTimeAuctionWinnerTakeActionAndVerify(data.get("Period_Time_Auction_Winner_Take_Action"));
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_33(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Period time to Pay for the Final unit Invoice
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter period time to Pay for the final unit invoice");
        app.fullAuctionJourneyPage.enterPeriodTimePayFinalUnitInvoice(data.get("Period_Time_Pay_Final_Unit_Invoice"));
        CommonUtilityPage.verifyValueIsEntered(data.get("Period_Time_Pay_Final_Unit_Invoice"), FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_34(Map<String, String> data) throws Exception {
        //Verify admin is able to enter Invalid Period time to Pay for the Final unit Invoice
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter invalid period time to Pay for the final unit invoice");
        app.fullAuctionJourneyPage.enterInvalidPeriodTimePayFinalUnitInvoice("-01");
        CommonUtilityPage.verifyValueIsEntered("-01", FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_35(Map<String, String> data) throws Exception {
        //Verify functionality of increasing/decreasing Period time to Pay for the Final unit Invoice
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Increasing/decreasing period time to pay for the final unit invoice");
        app.fullAuctionJourneyPage.increasePeriodTimeToPayFinalUnitInvoiceAndVerify(data.get("Period_Time_Pay_Final_Unit_Invoice"));
        app.fullAuctionJourneyPage.decreasePeriodTimeToPayFinalUnitInvoiceAndVerify(data.get("Period_Time_Pay_Final_Unit_Invoice"));
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_36(Map<String, String> data) throws Exception {
        //Verify admin is able to enable Apply fee for auction unit label
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Click to enabled apply fee for auction unit label");
        app.fullAuctionJourneyPage.enabledApplyFeeForAuctionUnitLabel();
        app.fullAuctionJourneyPage.verifyApplyFeeForAuctionUnitToggleIsOn();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_37(Map<String, String> data) throws Exception {
        //Verify admin is able to disabled Apply fee for auction unit label
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Click to disabled apply fee for auction unit label");
        app.fullAuctionJourneyPage.disableApplyGeneralSettingToggle();
        app.fullAuctionJourneyPage.disableApplyAuctionFeeToggle();
        app.fullAuctionJourneyPage.verifyApplyFeeForAuctionUnitToggleIsOff();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_38(Map<String, String> data) throws Exception {
        //Verify admin is able to click on delete button
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Click on delete button");
        app.fullAuctionJourneyPage.clickOnDeleteButton();
        app.fullAuctionJourneyPage.verifyDeleteButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_39(Map<String, String> data) throws Exception {
        //Verify admin is able to click on save button
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access auction (المزاد) page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on add new auctions ( أضافة مزاد جديد ) button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter unit Code");
        app.fullAuctionJourneyPage.enterValidUnitCode(data.get("Unit_Code"));
        logger.info("Step 07: Enter starting bid price");
        app.fullAuctionJourneyPage.enterStartingBidPrice(data.get("Starting_Bid_Price"));
        logger.info("Step 08: Enter Targeted price");
        app.fullAuctionJourneyPage.enterTargetedPrice(data.get("Targeted_Price"));
        logger.info("Step 09: Enter auction start time");
        app.fullAuctionJourneyPage.enterStartTimeOfAuction(1, 0, 0);
        logger.info("Step 10: Select Auction start date");
        app.fullAuctionJourneyPage.selectAuctionStartDateFromCalendar(0);
        logger.info("Step 11: Select Auction end date");
        app.fullAuctionJourneyPage.enterEndTimeOfAuction(2, 0, 0);
        logger.info("Step 12: Select Auction end date");
        app.fullAuctionJourneyPage.selectAuctionEndDateFromCalendar(0);
        logger.info("Step 21: Click on save button");
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم إنشاء المزاد بنجاح", "Create auctions successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_40(Map<String, String> data) throws Exception {
        //Verify admin is able to click on cancel button
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Click on cancel button");
        app.fullAuctionJourneyPage.clickOnCancelButton();
        app.fullAuctionJourneyPage.verifyAuctionPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_41(Map<String, String> data) throws Exception {
        //Verify admin is able to add more auction
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Click to add more auction");
        app.fullAuctionJourneyPage.clickAddMoreAuction();
        app.fullAuctionJourneyPage.verifySecondAuctionIsAdded();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_42(Map<String, String> data) throws Exception {
        //Verify admin is not able to click on save button if there's required fields not filled
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP Number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access Auction (المزاد) Page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 05: Click on Add New Auctions ( أضافة مزاد جديد ) Button");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
        logger.info("Step 06: Enter valid Unit Code");
        app.fullAuctionJourneyPage.enterValidUnitCode(data.get("Unit_Code"));
        logger.info("Step 07: Enter valid Starting bid price");
        app.fullAuctionJourneyPage.enterStartingBidPrice(data.get("Starting_Bid_Price"));
        logger.info("Step 08: Enter Targeted price");
        app.fullAuctionJourneyPage.enterTargetedPrice(data.get("Targeted_Price"));
        logger.info("Step 09: Verify save button is disabled");
        app.fullAuctionJourneyPage.verifySaveButtonIsDisabled();
    }

    /**
     * User search/select Auction
     * TC_43 - TC_59
     */

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_43(Map<String, String> data) throws Exception {
        //Verify user is able to see Auction tab from Marketplace
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Check visibility of auction option");
        app.fullAuctionJourneyPage.verifyAuctionTabIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_44(Map<String, String> data) throws Exception {
        //Verify user is able to click on Auction tab from Marketplace
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Verify auction option is selectable");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        CommonUtilityPage.verifyOptionIsSelected("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList());
    }

//    @Test(dataProvider = "testDataProvider")
//    public void Full_Auction_Journey_TC_45(Map<String, String> data) throws Exception {
//        //Verify user is able to search for Auction project by enabled the filter
//        logger.info("Step 00: Test Data : " + data.toString());
//        app.openApplication(data);
//        logger.info("Step 01: Navigate to Sakani user site");
//        //app.loginPage.alertBoxLogin();
//        app.homePage.closeAllSakaniPopups();
//        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        logger.info("Step 02: Login to the portal with user credentials");
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
//        logger.info("Step 03: Verify user is able to search for project from auction filter");
//        app.fullAuctionJourneyPage.clickOnAuctionTab();
//        app.mohLandBookingJourneyPage.clickOnFilterButton();
//        app.fullAuctionJourneyPage.searchForAuctionProject(data.get("Project_Name"));
//        logger.info("Step 04: Verify the text entered in Project search field");
//        CommonUtilityPage.verifyValueIsEntered(data.get("Project_Name"), MOHLandBookingJourneyPageObjects.projectInputFiled());
//    }

//    @Test(dataProvider = "testDataProvider")
//    public void Full_Auction_Journey_TC_46(Map<String, String> data) throws Exception {
//        //Verify user is able to search for not exists Auction project by enabled the filter
//        logger.info("Step 00: Test Data : " + data.toString());
//        app.openApplication(data);
//        logger.info("Step 01: Navigate to Sakani user site");
//        //app.loginPage.alertBoxLogin();
//        app.homePage.closeAllSakaniPopups();
//        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        logger.info("Step 02: Login to the portal with user credentials");
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
//        logger.info("Step 03: Verify user is able to search for project from auction filter");
//        app.fullAuctionJourneyPage.clickOnAuctionTab();
//        app.mohLandBookingJourneyPage.clickOnFilterButton();
//        app.fullAuctionJourneyPage.searchForAuctionProject("aaa bbb ccc ddd eee");
//        logger.info("Step 04: Verify no result found");
//        CommonUtilityPage.verifyValueIsDisplayed("No items found", "No items found", FiltersPageObjects.notFoundOption());
//    }

//    @Test(dataProvider = "testDataProvider")
//    public void Full_Auction_Journey_TC_47(Map<String, String> data) throws Exception {
//        //Verify user is able to clear data from Auction filter
//        logger.info("Step 00: Test Data : " + data.toString());
//        app.openApplication(data);
//        logger.info("Step 01: Navigate to Sakani user site");
//        //app.loginPage.alertBoxLogin();
//        app.homePage.closeAllSakaniPopups();
//        app.loginPage.changeLanguageForUser();
//        app.homePage.clickOnLoginButtonInHomePage();
//        logger.info("Step 02: Login to the portal with user credentials");
//        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
//        app.loginPage.enterOTPForUser(data.get("OTP"));
//        app.loginPage.clickOnVerifyOTPButton();
//        app.loginPage.clickOnCancelButtonOfPopup();
//        logger.info("Step 03: Verify user is able to search for project from auction filter");
//        app.fullAuctionJourneyPage.clickOnAuctionTab();
//        app.mohLandBookingJourneyPage.clickOnFilterButton();
//        app.fullAuctionJourneyPage.searchForAuctionProject(data.get("Project_Name"));
//        logger.info("Step 04: Click on clear button");
//        app.mohLandBookingJourneyPage.clickOnClearButton();
//        logger.info("Step 05: Verify the text deleted from project search field");
//        CommonUtilityPage.verifyValueIsNotEntered(data.get("Project_Name"), data.get("Project_Name"), MOHLandBookingJourneyPageObjects.projectInputFiled());
//    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_48(Map<String, String> data) throws Exception {
        //Verify user is able to navigate to searched Auction project page
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        CommonUtilityPage.verifyValueIsDisplayed("الوحدات المتاحة", "Available units", FullAuctionJourneyPageObjects.availableUnitLabel());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_49(Map<String, String> data) throws Exception {
        //Verify user is able to see Available units
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 04: Verify user is able to view available unit");
        app.fullAuctionJourneyPage.verifyAvailableUnitsAreDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_50(Map<String, String> data) throws Exception {
        //Verify user is able to see Auction Status
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 06: Verify user is able to view auction status");
        app.fullAuctionJourneyPage.verifyAvailableUnitsAreDisplayed();
        CommonUtilityPage.verifyElementIsDisplayed("Auction status", FullAuctionJourneyPageObjects.getCurrentAuctionStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_51(Map<String, String> data) throws Exception {
        //Verify user is able to click on Available unit
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 06: Verify user is able to click on available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        app.fullAuctionJourneyPage.verifyCountDownIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_52(Map<String, String> data) throws Exception {
        //Verify user is able to see Auction location on map
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 06: Verify user is able to see Auction location on map");
        app.fullAuctionJourneyPage.viewAuctionLocation();
        CommonUtilityPage.verifyNewTabIsOpenedAndSwitch();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_53(Map<String, String> data) throws Exception {
        //Verify user is able to search for not exists Unit by enabled the filter
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 06: Click on unit filter");
        app.fullAuctionJourneyPage.clickOnAvailableUnitsFilter();
        app.fullAuctionJourneyPage.selectMaximumArea();
        app.fullAuctionJourneyPage.selectMinimumArea();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.filterSearchButton());
        logger.info("Step 07: Verify no result found");
        app.fullAuctionJourneyPage.verifyNoResultFound();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_54(Map<String, String> data) throws Exception {
        //Verify user is able to search for Unit by enabled the filter
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 06: Click on unit filter");
        app.fullAuctionJourneyPage.clickOnAvailableUnitsFilter();
        app.fullAuctionJourneyPage.selectMinimumArea();
        CommonUtilityPage.clickOnElement(FullAuctionJourneyPageObjects.filterSearchButton());
        logger.info("Step 07: Verify user is able to see available unit");
        app.fullAuctionJourneyPage.verifyResultFound();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_55(Map<String, String> data) throws Exception {
        //Verify user is able to clear data from unit filter
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 06: Click on unit filter");
        app.fullAuctionJourneyPage.clickOnAvailableUnitsFilter();
        app.fullAuctionJourneyPage.selectMaximumArea();
        //app.fullAuctionJourneyPage.enterMaximumArea("710");
        logger.info("Step 07: Verify user is able to clear data entered on filter fields");
//        app.fullAuctionJourneyPage.clickOnClearButton();
        app.fullAuctionJourneyPage.clickOnClearButtonAndVerifyTheRangeIsReset();

    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_56(Map<String, String> data) throws Exception {
        //Verify user is able to view Auction image
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 06: Verify user is able to maximize the image of auction");
        app.fullAuctionJourneyPage.clickOnMaximizeImageButtonOnAuctionPage();
        app.fullAuctionJourneyPage.verifyImageIsMaximized();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_57(Map<String, String> data) throws Exception {
        //Verify user is able to navigate to Project details section
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 06: Verify user is able to navigate to project details section");
        app.fullAuctionJourneyPage.clickOnProjectDetailsTab();
        CommonUtilityPage.verifyValueIsDisplayed("تفاصيل المشروع", "Project details", FullAuctionJourneyPageObjects.projectDetailsLabel());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_58(Map<String, String> data) throws Exception {
        //Verify user is able to view Master plan image of auction
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Verify user is able to select the project from auction filter");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 04: Verify user is able to click on view Master plan image");
        app.fullAuctionJourneyPage.clickOnProjectDetailsTab();
        app.fullAuctionJourneyPage.clickOnViewMasterPlanImage();
        app.fullAuctionJourneyPage.verifyImageViewerPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_59(Map<String, String> data) throws Exception {
        //Verify user is able to see duration of Auction end time
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Verify user is able to select the project from auction filter");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 04: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 05: Verify end time is visible");
        CommonUtilityPage.verifyValueIsDisplayed("يوم", "Day", FullAuctionJourneyPageObjects.UnitAuctionEndTimeText());
    }

    /**
     * User Joins Auction and pay the fees
     * TC_60 - TC_68
     */
    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_60(Map<String, String> data) throws Exception {
        //Verify user is able to click on Apply for this auction button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Verify user is able to select the project from auction filter");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 04: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 05: Click on Apply for this auction button");
        app.fullAuctionJourneyPage.clickOnApplyForThisAuctionButton();
        CommonUtilityPage.verifyValueIsDisplayed("تطبق الرسوم على هذا المزاد", "Fees apply for this bid", FullAuctionJourneyPageObjects.FeesApplyForTheBidPopupTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_61(Map<String, String> data) throws Exception {
        //Verify user is able to see Auction fees amount from 'Fees apply for this bid' popUp
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Verify user is able to select the project from auction filter");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 04: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 05: Click on Apply for this auction button");
        app.fullAuctionJourneyPage.clickOnApplyForThisAuctionButton();
        CommonUtilityPage.verifyValueIsDisplayed("رسوم المزاد", "Auction fees", FullAuctionJourneyPageObjects.AuctionFeesText());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_62(Map<String, String> data) throws Exception {
        //Verify user is able to select payments method
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Verify user is able to select the project from auction filter");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 04: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 05: Click on Apply for this auction button");
        app.fullAuctionJourneyPage.clickOnApplyForThisAuctionButton();
        logger.info("Step 06: Select mada payment method");
        app.fullAuctionJourneyPage.clickOnMadaPayment();
        app.fullAuctionJourneyPage.verifyPaymentMadaPaymentMethodIsSelected();
        CommonUtilityPage.verifyValueIsDisplayed("رسوم المزاد", "Auction fees", FullAuctionJourneyPageObjects.AuctionFeesText());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_63(Map<String, String> data) throws Exception {
        //Verify user is not able to click on confirm button if agreeing checkbox is not selected
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Verify user is able to select the project from auction filter");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 04: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 05: Click on Apply for this auction button");
        app.fullAuctionJourneyPage.clickOnApplyForThisAuctionButton();
        logger.info("Step 06: Verify confirm button is disabled/not clickable");
        app.fullAuctionJourneyPage.verifyConfirmButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_64(Map<String, String> data) throws Exception {
        //Verify user is able to click on confirm button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Verify user is able to select the project from auction filter");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 04: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 05: Click on Apply for this auction button");
        app.fullAuctionJourneyPage.clickOnApplyForThisAuctionButton();
        logger.info("Step 06: Select mada payment method");
        app.fullAuctionJourneyPage.clickOnMadaPayment();
        logger.info("Step 07: Click on agreeing checkbox");
        app.fullAuctionJourneyPage.clickOnAgreeCheckbox();
        logger.info("Step 08: Click on Confirm button");
        app.fullAuctionJourneyPage.clickOnConfirmButton();
        CommonUtilityPage.verifyValueIsDisplayed("ملخص الفاتورة", "Invoice Summary", FullAuctionJourneyPageObjects.InvoiceSummaryTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_65(Map<String, String> data) throws Exception {
        //Verify user is able to click on confirm button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Hover to profile");
        app.eligibilityPage.hoverToUserIconProfile();
        logger.info("Step 04: Click on My Profile");
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 05: Click on Transactions");
        app.fullAuctionJourneyPage.clickOnTransactionsButton();
        CommonUtilityPage.verifyValueIsDisplayed("سجل المدفوعات", "Payments and transactions", FullAuctionJourneyPageObjects.TransactionsAndTransactionsHeading());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_66(Map<String, String> data) throws Exception {
        //Verify user is able to preview invoice
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Hover to profile");
        app.eligibilityPage.hoverToUserIconProfile();
        logger.info("Step 04: Click on My Profile");
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 05: Click on Transactions");
        app.fullAuctionJourneyPage.clickOnTransactionsButton();
        logger.info("Step 06: Click on Preview invoice link");
        app.fullAuctionJourneyPage.clickOnPreviewInvoiceLink();
        CommonUtilityPage.verifyValueIsDisplayed(data.get("Project_Name"), FullAuctionJourneyPageObjects.InvoicePreviewPopupTitle(data.get("Project_Name")));
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_67(Map<String, String> data) throws Exception {
        //Verify user is able to click on back button from payment page
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Hover to profile");
        app.eligibilityPage.hoverToUserIconProfile();
        logger.info("Step 04: Click on My Profile");
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 05: Click on Transactions");
        app.fullAuctionJourneyPage.clickOnTransactionsButton();
        logger.info("Step 06: Click on Preview invoice link");
        app.fullAuctionJourneyPage.clickOnPayNowLink();
        CommonUtilityPage.verifyValueIsDisplayed("ملخص الفاتورة", "Invoice Summary", FullAuctionJourneyPageObjects.InvoiceSummaryTitle());
        logger.info("Step 07: Click on Back button on payment page");
        app.fullAuctionJourneyPage.clickOnBackButtonFromPaymentGateway();
        CommonUtilityPage.verifyValueIsDisplayed("سجل المدفوعات", "Payments and transactions", FullAuctionJourneyPageObjects.TransactionsAndTransactionsHeading());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_68(Map<String, String> data) throws Exception {
        //Verify user is able to pay the invoice
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Hover to profile");
        app.eligibilityPage.hoverToUserIconProfile();
        logger.info("Step 04: Click on My Profile");
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 05: Click on Transactions");
        app.fullAuctionJourneyPage.clickOnTransactionsButton();
        logger.info("Step 06: Click on Preview invoice link");
        app.fullAuctionJourneyPage.clickOnPayNowLink();
        logger.info("Step 07: Click on Mada button");
        app.fullBookingJourneyPage.clickOnMadaButton();
        logger.info("Step 08: Fill card details");
        app.fullBookingJourneyPage.enterCardDetails(data.get("CardNumber"), data.get("CardExpiry"), data.get("CVV"), data.get("CardName"));
        logger.info("Step 09: Click on Pay now");
        app.fullBookingJourneyPage.clickOnPayNow();
        logger.info("Step 10: Click on submit");
        app.fullBookingJourneyPage.clickOnSubmit();
//        CommonUtilityPage.verifyValueIsDisplayed("", "", FullAuctionJourneyPageObjects.());
        //incomplete
    }


    /**
     * User booking Auction without fee and reject the sign contract
     * TC_69 - TC_94
     */
//    @Test(dataProvider = "testDataProvider")
//    public void Full_Auction_Journey_TC_69(Map<String, String> data) throws Exception {
//        //Verify admin is able to click on save button
//        logger.info("Step 00: Test Data : " + data.toString());
//        app.openApplication(data);
//        logger.info("Step 01: Navigate to sakani admin site");
//        //app.loginPage.alertBoxLogin();
//        logger.info("Step 02: Login to the portal with admin credentials");
//        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
//        logger.info("Step 03: Enter OTP number");
//        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
//        app.loginPage.changeLanguageAdmin(data);
//        logger.info("Step 04: Admin able to access auction (المزاد) page");
//        app.fullAuctionJourneyPage.navigateToAuctionPage();
//        logger.info("Step 05: Click on add new auctions ( أضافة مزاد جديد ) button");
//        app.fullAuctionJourneyPage.clickOnAddNewAuctionsButton();
//        logger.info("Step 06: Fill all input fields ");
//        app.fullAuctionJourneyPage.enterValidUnitCode(data.get("Unit_Code"));
//        app.fullAuctionJourneyPage.enterStartingBidPrice(data.get("Starting_Bid_Price"));
//        app.fullAuctionJourneyPage.enterTargetedPrice(data.get("Targeted_Price"));
//        app.fullAuctionJourneyPage.selectAuctionStartDateFromCalendar(0);
//        app.fullAuctionJourneyPage.enterStartTimeOfAuction(0, 1, 0);
//        app.fullAuctionJourneyPage.selectAuctionEndDateFromCalendar(0);
//        app.fullAuctionJourneyPage.enterEndTimeOfAuction(0, 16, 0);
//        logger.info("Step 07: Disable General Setting");
//        app.fullAuctionJourneyPage.disableApplyGeneralSettingToggle();
//        logger.info("Step 07: Disable Auction Fee");
//        app.fullAuctionJourneyPage.disableApplyAuctionFeeToggle();
//        logger.info("Step 21: Click on save button");
//        app.fullAuctionJourneyPage.clickOnSaveButton();
//        CommonUtilityPage.verifyValueIsDisplayed("تم إنشاء المزاد بنجاح", "Create auctions successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
//    }
    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_70(Map<String, String> data) throws Exception {
        //Verify user is able to click on Join this auction button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Verify 'Join this auction' button is clickable");
        app.fullAuctionJourneyPage.verifyJoinThisAuctionButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_71(Map<String, String> data) throws Exception {
        //Verify user is able to select I confirm reading, understanding and agreeing to the terms and conditions checkbox from disclaimer popup
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on 'Join this auction' button");
        app.fullAuctionJourneyPage.clickOnJoinThisAuctionButton();
        logger.info("Step 10: Click on 'Agree to terms' checkbox");
        app.fullAuctionJourneyPage.clickOnAgreeCheckbox();
        app.fullAuctionJourneyPage.verifyStartBiddingButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_72(Map<String, String> data) throws Exception {
        //Verify user is able to click on cancel button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on 'Join this auction' button");
        app.fullAuctionJourneyPage.clickOnJoinThisAuctionButton();
        logger.info("Step 10: Click on 'Cancel' button");
        app.fullAuctionJourneyPage.clickOnCancelButton();
        app.fullAuctionJourneyPage.verifyStartBiddingButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_73(Map<String, String> data) throws Exception {
        //Verify user is not able to click on Start bidding button if  'I confirm reading, understanding and agreeing to the terms and conditions checkbox' is not selected
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on 'Join this auction' button");
        app.fullAuctionJourneyPage.clickOnJoinThisAuctionButton();
        logger.info("Step 10: Verify Start bidding button is disabled/not clickable");
        app.fullAuctionJourneyPage.verifyStartBiddingIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_74(Map<String, String> data) throws Exception {
        //Verify user is able to click on Start bidding button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on 'Join this auction' button");
        app.fullAuctionJourneyPage.clickOnJoinThisAuctionButton();
        logger.info("Step 10: Click on 'Agree to terms' checkbox");
        app.fullAuctionJourneyPage.clickOnAgreeCheckbox();
        logger.info("Step 11: Click on Start Bidding button");
        app.fullAuctionJourneyPage.clickOnStartBiddingButton();
        CommonUtilityPage.verifyValueIsDisplayed("المجموع", "Total", FullAuctionJourneyPageObjects.TotalPriceOfAuction());
        CommonUtilityPage.verifyValueIsDisplayed("مزايدتك", "Your bid", FullAuctionJourneyPageObjects.YourBidPrice());
        CommonUtilityPage.verifyValueIsDisplayed("سعر المزايدة الحالية", "Starting price", FullAuctionJourneyPageObjects.AuctionStartingStartingPrice());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_75(Map<String, String> data) throws Exception {
        //Verify user is able to increasing / decreasing price
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Verify Increase/decrease the price buttons are enabled");
        app.fullAuctionJourneyPage.verifyIncreaseBidPriceButtonIsEnabled();
        app.fullAuctionJourneyPage.verifyDecreaseBidPriceButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_76(Map<String, String> data) throws Exception {
        //Verify user is able to click to any of Fixed increase number button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Verify Fixed increase number button is clickable");
        app.fullAuctionJourneyPage.fixedIncreaseNumberButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_77(Map<String, String> data) throws Exception {
        //Verify user is able to click on Place bid button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Verify Place bid button is clickable");
        app.fullAuctionJourneyPage.verifyPlaceBidButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_78(Map<String, String> data) throws Exception {
        //Verify user is able to select I confirm reading, understanding and agreeing to the terms and conditions checkbox from Bid submission summary pop up
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on 'Place bid' button");
        app.fullAuctionJourneyPage.clickOnPlaceBidButton();
        logger.info("Step 10: Click on 'Agree to terms' checkbox");
        app.fullAuctionJourneyPage.clickOnAgreeCheckbox();
        app.fullAuctionJourneyPage.verifySubmitBidButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_79(Map<String, String> data) throws Exception {
        //Verify user is not able to click on Submit bid button if 'I confirm reading, understanding and agreeing to the terms and conditions' checkbox not selected
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on 'Place bid' button");
        app.fullAuctionJourneyPage.clickOnPlaceBidButton();
        logger.info("Step 10: Verify Submit bid is disabled/not clickable");
        app.fullAuctionJourneyPage.verifySubmitBidButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_80(Map<String, String> data) throws Exception {
        //Verify user is able to click on cancel button from Bid submission summary pop up
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on 'Place bid' button");
        app.fullAuctionJourneyPage.clickOnPlaceBidButton();
        logger.info("Step 10: Click on cancel button ");
        app.fullAuctionJourneyPage.clickOnCancelButton();
        app.fullAuctionJourneyPage.verifySubmitBidButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_81(Map<String, String> data) throws Exception {
        //Verify user is able to click on Submit bid button from Bid submission summary pop up
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on 'Place bid' button");
        app.fullAuctionJourneyPage.clickOnPlaceBidButton();
        logger.info("Step 10: Click on 'Agree to terms' checkbox");
        app.fullAuctionJourneyPage.clickOnAgreeCheckbox();
        logger.info("Step 11: Click on 'Submit bid' button");
        app.fullAuctionJourneyPage.clickOnSubmitBidButton();
        CommonUtilityPage.verifyValueIsDisplayed("بنجاح", "بنجاح", FullAuctionJourneyPageObjects.AuctionBidSuccessPopupTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_82(Map<String, String> data) throws Exception {
        //Verify user able to see Congratulation message if user won the auction
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        CommonUtilityPage.verifyValueIsDisplayed("تهانينا", "Congratulation", FullAuctionJourneyPageObjects.CongratulationMessageForHighestBid());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_83(Map<String, String> data) throws Exception {
        //Verify place bid button is not displayed
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        app.fullAuctionJourneyPage.verifyPlaceBidButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_84(Map<String, String> data) throws Exception {
        //Verify user is able to view Closed Auction from profile page
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
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
        logger.info("Step 05: Click on Closed Auction button");
        app.fullAuctionJourneyPage.clickOnAuctionSideMenuButton();
        app.fullAuctionJourneyPage.clickOnClosedAuctionsTab();
        CommonUtilityPage.verifyValueIsDisplayed("عرض المزاد", "View auction", FullAuctionJourneyPageObjects.ViewAuctionLink());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_85(Map<String, String> data) throws Exception {
        //Verify user is able to view Active Auction from profile page
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
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
        logger.info("Step 05: Click on Closed Auction button");
        app.fullAuctionJourneyPage.clickOnAuctionSideMenuButton();
        app.fullAuctionJourneyPage.clickOnActiveAuctionsTab();
        CommonUtilityPage.verifyValueIsDisplayed("عرض المزاد", "View auction", FullAuctionJourneyPageObjects.ViewAuctionLink());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_86(Map<String, String> data) throws Exception {
        //Verify user is able to click on Continue link text from Congratulation message
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on Continue link text");
        app.fullAuctionJourneyPage.clickOnContinueButton();
        CommonUtilityPage.verifyValueIsDisplayed("توقيع العقد", "Sign contract", FullAuctionJourneyPageObjects.SignContractPageHeading());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_87(Map<String, String> data) throws Exception {
        //Verify user is able to click on Download contract link text
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on Continue link text");
        app.fullAuctionJourneyPage.clickOnContinueButton();
        logger.info("Step 10: Click on 'Download Contract' link text");
        app.fullAuctionJourneyPage.clickOnDownloadContractLink();
        CommonUtilityPage.verifyNewTabIsOpened();
        //Failed due to defect --> SCR-4334
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_88(Map<String, String> data) throws Exception {
        //Verify user is able to click on reject button from Sign contract page
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on Continue link text");
        app.fullAuctionJourneyPage.clickOnContinueButton();
        logger.info("Step 10: Click on 'Reject' button on Sign contract page");
        app.fullAuctionJourneyPage.clickOnRejectButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفض العقد", "Reject contract", FullAuctionJourneyPageObjects.RejectSignContractPageHeading());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_89(Map<String, String> data) throws Exception {
        //Verify user is able to fill Reject reason text area from Reject contract page
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on Continue link text");
        app.fullAuctionJourneyPage.clickOnContinueButton();
        logger.info("Step 10: Click on 'Reject' button on Sign contract page");
        app.fullAuctionJourneyPage.clickOnRejectButton();
        logger.info("Step 11: Enter text in 'Reject Reason' input field");
        app.fullBookingJourneyPage.enterRejectionReason("Test reason");
        CommonUtilityPage.verifyValueIsEntered("Test reason", FullBookingJourneyPageObjects.RejectionReasonInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_90(Map<String, String> data) throws Exception {
        //Verify user is able to click on cancel button from Reject contract page
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on Continue link text");
        app.fullAuctionJourneyPage.clickOnContinueButton();
        logger.info("Step 10: Click on 'Reject' button on Sign contract page");
        app.fullAuctionJourneyPage.clickOnRejectButton();
        logger.info("Step 11: Click on 'Cancel' button");
        app.fullAuctionJourneyPage.clickOnCancelButton();
        CommonUtilityPage.verifyValueIsDisplayed("معلومات القطع", "Plot Information", FullAuctionJourneyPageObjects.PlotInformationHeadingText());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_91(Map<String, String> data) throws Exception {
        //Verify user is NOT able to click Confirm Rejection button if reject reason is not entered from  Reject Contract page
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on Continue link text");
        app.fullAuctionJourneyPage.clickOnContinueButton();
        logger.info("Step 10: Click on 'Reject' button on Sign contract page");
        app.fullAuctionJourneyPage.clickOnRejectButton();
        logger.info("Step 11: Verify 'Confirm rejection' button is not clickable");
        app.fullAuctionJourneyPage.verifyConfirmRejectionButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_92(Map<String, String> data) throws Exception {
        //Verify user is able to click on Confirm rejection button from Reject contract page
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on Continue link text");
        app.fullAuctionJourneyPage.clickOnContinueButton();
        logger.info("Step 10: Click on 'Reject' button on Sign contract page");
        app.fullAuctionJourneyPage.clickOnRejectButton();
        logger.info("Step 11: Enter text in 'Reject Reason' input field");
        app.fullBookingJourneyPage.enterRejectionReason("Test reason");
        app.fullAuctionJourneyPage.clickOnConfirmRejectionButton();
        app.fullAuctionJourneyPage.verifySuccessfullyRejectedMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_93(Map<String, String> data) throws Exception {
        //Verify user is able to see Rejected status from action section
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
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
        logger.info("Step 05: Click on Closed Auction button");
        app.fullAuctionJourneyPage.clickOnAuctionSideMenuButton();
        CommonUtilityPage.verifyValueIsDisplayed("مرفوض", "Rejected", FullAuctionJourneyPageObjects.RejectedStatus());
    }

    /**
     * User booking Auction without fee and Approve the sign contract
     * TC_94 - TC_99
     */
    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_94(Map<String, String> data) throws Exception {
        //Admin creates a new auction without fee
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
        logger.info("Step 05: Click on add new auction project");
        app.fullAuctionJourneyPage.clickOnAddNewAuctionProject();
        logger.info("Step 06: Complete full auction journey with fee");
        String projectName = data.get("ProjectName") + RandomStringUtils.randomNumeric(5);
        app.fullAuctionJourneyPage.enterProjectName(projectName);
        TestDataManager.addDependantGlobalTestData("Auctions", "Project_Name", projectName);
        TestDataManager.writeDependantGlobalTestData("Auctions");
        CommonUtilityPage.selectFromLists(data.get("Auction_Type"), FullAuctionJourneyPageObjects.AuctionTypeDropdownList(), FullAuctionJourneyPageObjects.SelectedAuctionType());
        CommonUtilityPage.selectFromLists(data.get("Region"), FullAuctionJourneyPageObjects.RegionDropdownList(), FullAuctionJourneyPageObjects.SelectedRegion());
        CommonUtilityPage.selectFromLists(data.get("City"), FullAuctionJourneyPageObjects.CityDropdownList(), FullAuctionJourneyPageObjects.SelectedCity());
        app.fullAuctionJourneyPage.selectAuctionStartDateFromCalendar(0);
        app.fullAuctionJourneyPage.enterStartTimeOfAuction(0, 2, 0);
        app.fullAuctionJourneyPage.selectAuctionEndDateFromCalendar(0);
        app.fullAuctionJourneyPage.enterEndTimeOfAuction(0, 5, 0);
        app.fullAuctionJourneyPage.getAuctionDateAndTime();
        app.fullAuctionJourneyPage.clickOnSaveButton();
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم الحفظ بنجاح", "Create auctions successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        app.fullAuctionJourneyPage.editAuctionUnitFile(data.get("startDate"), data.get("endDate"), data.get("startTimeHr"), data.get("startTimeMin"), data.get("endTimeHr"), data.get("endTimeMin"));
        app.fullBookingJourneyPage.clickOnUnitsTab();
        app.fullAuctionJourneyPage.clickOnImportNewAuctionUnitButton();
        CommonUtilityPage.selectFromLists(data.get("UnitType"), FullAuctionJourneyPageObjects.UnitTypeDropdown(), FullAuctionJourneyPageObjects.SelectedCity());
        CommonUtilityPage.UploadAttachment(data.get("ImportUnitFile"), FullAuctionJourneyPageObjects.UploadFile());
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("بدأت عملية استيراد وحدات المزاد بنجاح", "Create auctions successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 60);
        driver.navigate().refresh();
        app.fullBookingJourneyPage.clickOnCommitButton();
        app.fullAuctionJourneyPage.clickOnAgreeButton();
        CommonUtilityPage.verifyValueIsDisplayed("إرسال طلب اعتماد الاستيراد", "Create auctions successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.clickOnBackButton();
        app.fullBookingJourneyPage.clickOnUnitModelTab();
        app.fullAuctionJourneyPage.clickOnTheUnitModel();
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyElementIsDisplayed("تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.clickOnMediaSectionLabelOnUnitModelPage();
        app.fullBookingJourneyPage.enterLatitude(data.get("Latitude"));
        app.fullBookingJourneyPage.enterLongitude(data.get("Longitude"));
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        ////////
        app.fullAuctionJourneyPage.clickOnTheAuctionLegalTab();
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), FullAuctionJourneyPageObjects.AuctionLegalFiles("1"));
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), FullAuctionJourneyPageObjects.AuctionLegalFiles("2"));
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("AR Model was updated", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم رفع طلب الموافقة على المحتوى المرئي بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.clickOnApproveMediaButton();
        CommonUtilityPage.verifyValueIsDisplayed("طلب الموافقة على المحتوى المرئي تحت المعالجة الرجاء الانتظار", FullBookingJourneyPageObjects.SystemPopupMessage());
        if (Browser.isElementPresent(FullBookingJourneyPageObjects.ApproveMediaButton())) {
            app.fullBookingJourneyPage.clickOnApproveMediaButton();
        }
        app.fullBookingJourneyPage.clickOnIsPublishUnitModelToggle();
//        CommonUtilityPage.verifyPopupMessageIsDisplayed("Project publishment updated successfully", "تم تحديث نشر المشروع بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.clickOnBackArrowButton();
        app.fullAuctionJourneyPage.clickOnAuctionMediaTab();
        CommonUtilityPage.UploadAttachment(data.get("Video_Attachment"), FullBookingJourneyPageObjects.VideoMediaAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.BannerImageAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.MasterPlanAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullBookingJourneyPageObjects.ImageGalleryAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
        CommonUtilityPage.UploadAttachment(data.get("PDF_Attachment"), FullBookingJourneyPageObjects.BrochureMediaAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
        CommonUtilityPage.UploadAttachment(data.get("Json_Attachment"), FullBookingJourneyPageObjects.GeoMapAttachment());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
        CommonUtilityPage.UploadAttachment(data.get("Image_Attachment"), FullAuctionJourneyPageObjects.LogoImage());
        app.fullBookingJourneyPage.clickOnUploadArrowButton();
        CommonUtilityPage.verifyValueIsDisplayed("رفعه بنجاح", "uploaded successfully", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.enterTitleOfDetailPage(data.get("Project_Name"));
        app.fullBookingJourneyPage.enterProjectDisplayName(data.get("Project_Name"));
        app.fullBookingJourneyPage.enterDescription(data.get("Description"));
        app.fullBookingJourneyPage.enterLatitude(data.get("Latitude"));
        app.fullBookingJourneyPage.enterLongitude(data.get("Longitude"));
        app.fullBookingJourneyPage.enterNearestAirportDistance(data.get("Nearest_Airport_Distance"));
        app.fullBookingJourneyPage.enterNearestSchoolDistance(data.get("Nearest_School_Distance"));
        app.fullBookingJourneyPage.enterTotalArea(data.get("Total_Area"));
        app.fullAuctionJourneyPage.enterNumberOfAssets(data.get("Assets_Number"));
        app.fullAuctionJourneyPage.enterTextInUnderSupervision(data.get("UnderSupervision"));
        app.fullAuctionJourneyPage.enterCallNumber(data.get("CallNumber"));
        app.fullAuctionJourneyPage.enterWhatsAppNumber(data.get("CallNumber"));
        app.fullAuctionJourneyPage.enterValNumber(data.get("ValNumber"));
        app.fullAuctionJourneyPage.clickOnSaveButton();
        CommonUtilityPage.verifyValueIsDisplayed("تم حفظ بيانات الملف بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.clickOnProjectDetailsTab();
        app.fullBookingJourneyPage.clickOnMediaApprovalButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Request for media approval has been sent successfully", "تم رفع طلب الموافقة على المحتوى المرئي بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.clickOnApproveMediaButton();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Media approval is in progress now. Please review in few seconds", "طلب الموافقة على المحتوى المرئي تحت المعالجة الرجاء الانتظار", FullBookingJourneyPageObjects.SystemPopupMessage());
        app.fullBookingJourneyPage.verifyMediaIsApprovedAuction();
        app.fullBookingJourneyPage.clickOnIsPublishedToggle();
        app.fullBookingJourneyPage.verifyIsPublishedToggleIsOn();
        CommonUtilityPage.verifyPopupMessageIsDisplayed("Project publishment updated successfully", "تم تحديث نشر المشروع بنجاح", FullBookingJourneyPageObjects.SystemPopupMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_95(Map<String, String> data) throws Exception {
        //User bid the auction
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on 'Join this auction' button");
        app.fullAuctionJourneyPage.clickOnJoinThisAuctionButton();
        logger.info("Step 10: Click on 'Agree to terms' checkbox");
        app.fullAuctionJourneyPage.clickOnAgreeCheckbox();
        logger.info("Step 11: Click on Start Bidding button");
        app.fullAuctionJourneyPage.clickOnStartBiddingButton();
        logger.info("Step 12: Click on 'Place bid' button");
        app.fullAuctionJourneyPage.clickOnPlaceBidButton();
        logger.info("Step 13: Click on 'Agree to terms' checkbox");
        app.fullAuctionJourneyPage.clickOnAgreeCheckbox();
        logger.info("Step 14: Click on 'Submit bid' button");
        app.fullAuctionJourneyPage.clickOnSubmitBidButton();
        CommonUtilityPage.verifyValueIsDisplayed("تمّت مشاركتك بنجاح", FullAuctionJourneyPageObjects.AuctionBidSuccessPopupTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_96(Map<String, String> data) throws Exception {
        //Verify user is able to Approve the sign contract
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Project_Name"));
        logger.info("Step 08: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 09: Click on Continue link text");
        app.fullAuctionJourneyPage.clickOnContinueButton();
        logger.info("Step 10: Click on 'Approve' button on Sign contract page");
        app.fullAuctionJourneyPage.clickOnSignContractBanner();
        app.fullAuctionJourneyPage.clickOnApproveButton();
        CommonUtilityPage.verifyValueIsDisplayed("نجاح", "Success", FullAuctionJourneyPageObjects.SignContractApproveMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_97(Map<String, String> data) throws Exception {
        //Verify auction sign contract is approved
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Closed Auction button");
        app.fullAuctionJourneyPage.clickOnAuctionSideMenuButton();
        CommonUtilityPage.verifyValueIsDisplayed("لقد وقعت على العقد بنجاح", "Signed", FullAuctionJourneyPageObjects.SignContractStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_98(Map<String, String> data) throws Exception {
        //Verify user is able to click on download invoice button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Closed Auction button");
        app.fullAuctionJourneyPage.clickOnAuctionSideMenuButton();
        app.fullAuctionJourneyPage.navigateToTheWonAuction(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnViewInvoiceButton();
        CommonUtilityPage.verifyElementIsDisplayed("Attachment viewer", FullAuctionJourneyPageObjects.AttachmentPopupViewerCloseButton());
    }


    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_99(Map<String, String> data) throws Exception {
        //Verify user is able to click on download invoice button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Closed Auction button");
        app.fullAuctionJourneyPage.clickOnAuctionSideMenuButton();
        app.fullAuctionJourneyPage.navigateToTheWonAuction(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnViewContractButton();
        CommonUtilityPage.verifyElementIsDisplayed("Attachment viewer", FullAuctionJourneyPageObjects.AttachmentPopupViewerCloseButton());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_100(Map<String, String> data) throws Exception {
        //Verify user is able to click on download invoice button
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Hover on the user profile name ");
        app.eligibilityPage.hoverToUserIconProfile();
        app.eligibilityPage.clickOnMyProfileButton();
        logger.info("Step 04: Navigate to my activities");
        app.mohLandBookingJourneyPage.clickOnMyActivitiesButton();
        logger.info("Step 05: Click on Closed Auction button");
        app.fullAuctionJourneyPage.clickOnAuctionSideMenuButton();
        app.fullAuctionJourneyPage.navigateToTheWonAuction(data.get("Project_Name"));
        app.fullAuctionJourneyPage.clickOnViewAcknowledgmentButton();
        CommonUtilityPage.verifyElementIsDisplayed("Attachment viewer", FullAuctionJourneyPageObjects.AttachmentPopupViewerCloseButton());
    }


    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_101(Map<String, String> data) throws Exception {
        //Verify user is not able to Join expired/closed auctions
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani user site");
        //app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        app.loginPage.changeLanguageForUser();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Login to the portal with user credentials");
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.loginPage.enterOTPForUser(data.get("OTP"));
        app.loginPage.clickOnVerifyOTPButton();
        app.loginPage.clickOnCancelButtonOfPopup();
        logger.info("Step 03: Navigate to the auction project");
        CommonUtilityPage.selectFromLists("للبيع بالمزاد", CommonUtilityPageObjects.MarketplacePurposeList(), CommonUtilityPageObjects.SelectedMarketplacePurposeList());
        app.sortingPage.openSorting();
        app.sortingPage.selectNewestSortOption();
        app.fullAuctionJourneyPage.navigateToAuctionProjectPage(data.get("Expired_Auction"));
        logger.info("Step 04: Select from Available unit");
        app.fullAuctionJourneyPage.clickOnUnitOpenForAuction();
        logger.info("Step 05: Verify 'Join this auction' button is not displayed");
        app.fullAuctionJourneyPage.verifyJoinThisAuctionButtonIsNotDisplayed();
    }

    /**
     * Admin checks Auction Status
     * TC_100 - TC_108
     */

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_102(Map<String, String> data) throws Exception {
        //Verify auction status dropdown is accessible and selectable by the admin
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 05: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 06: Click on Auction Status dropdown");
        app.fullAuctionJourneyPage.clickOnAuctionStatusDropdown();
        app.fullAuctionJourneyPage.verifyAuctionStatusDropdownIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_103(Map<String, String> data) throws Exception {
        //Verify Search button is clickable when auction status is selected.
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 05: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 04: Click on Auction Status dropdown");
        app.fullAuctionJourneyPage.clickOnAuctionStatusDropdown();
        logger.info("Step 05: Select auction status");
        CommonUtilityPage.selectFromList("مفتوحة", "Open", FullAuctionJourneyPageObjects.AuctionStatusDropdownList());
    }


    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_104(Map<String, String> data) throws Exception {
        //Verify new Auction status is 'Not started'
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 05: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 06: Click on Auction Status dropdown");
        app.fullAuctionJourneyPage.clickOnAuctionStatusDropdown();
        logger.info("Step 07: Select auction status");
        CommonUtilityPage.selectFromList("لم يبدأ", "Not started", FullAuctionJourneyPageObjects.AuctionStatusDropdownList());
        logger.info("Step 08: Click Search button");
        app.fullAuctionJourneyPage.clickOnSearchButtonOnAuctionPage();
        CommonUtilityPage.verifyValueIsDisplayed("لم يبدأ", "Not started", FullAuctionJourneyPageObjects.AuctionStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_105(Map<String, String> data) throws Exception {
        //Verify new Auction status is  'Open'
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 05: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 06: Click on Auction Status dropdown");
        app.fullAuctionJourneyPage.clickOnAuctionStatusDropdown();
        logger.info("Step 07: Select auction status");
        CommonUtilityPage.selectFromList("مفتوحة", "Open", FullAuctionJourneyPageObjects.AuctionStatusDropdownList());
        logger.info("Step 08: Click Search button");
        app.fullAuctionJourneyPage.clickOnSearchButtonOnAuctionPage();
        CommonUtilityPage.verifyValueIsDisplayed("المزاد مفتوح", "Open", FullAuctionJourneyPageObjects.AuctionStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_106(Map<String, String> data) throws Exception {
        //Verify new Auction status is  'Sold'
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access auction (المزاد) page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 04: Click on Auction Status dropdown");
        app.fullAuctionJourneyPage.clickOnAuctionStatusDropdown();
        logger.info("Step 05: Select auction status");
        CommonUtilityPage.selectFromList("تم البيع", "Sold", FullAuctionJourneyPageObjects.AuctionStatusDropdownList());
        logger.info("Step 06: Click Search button");
        app.fullAuctionJourneyPage.clickOnSearchButtonOnAuctionPage();
        CommonUtilityPage.verifyValueIsDisplayed("تم البيع", "Sold", FullAuctionJourneyPageObjects.AuctionStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_107(Map<String, String> data) throws Exception {
        //Verify new Auction status is  'Expired'
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 05: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 06: Click on Auction Status dropdown");
        app.fullAuctionJourneyPage.clickOnAuctionStatusDropdown();
        logger.info("Step 07: Select auction status");
        CommonUtilityPage.selectFromList("انتهاء صلاحية الإعلان", "Expired", FullAuctionJourneyPageObjects.AuctionStatusDropdownList());
        logger.info("Step 08: Click Search button");
        app.fullAuctionJourneyPage.clickOnSearchButtonOnAuctionPage();
        CommonUtilityPage.verifyValueIsDisplayed("منتهية", "Expired", FullAuctionJourneyPageObjects.AuctionStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_108(Map<String, String> data) throws Exception {
        //Verify new Auction status is  'Closed'
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Click on auctions");
        app.fullAuctionJourneyPage.clickOnSideBarMenuInHomePage();
        app.fullAuctionJourneyPage.clickOnAuction();
        logger.info("Step 05: Click on auction projects");
        app.fullAuctionJourneyPage.clickOnAuctionProjects();
        logger.info("Step 06: Click on Auction Status dropdown");
        app.fullAuctionJourneyPage.clickOnAuctionStatusDropdown();
        logger.info("Step 07: Select auction status");
        CommonUtilityPage.selectFromList("مغلقة", "Closed", FullAuctionJourneyPageObjects.AuctionStatusDropdownList());
        logger.info("Step 08: Click Search button");
        app.fullAuctionJourneyPage.clickOnSearchButtonOnAuctionPage();
        CommonUtilityPage.verifyValueIsDisplayed("مغلق", "Closed", FullAuctionJourneyPageObjects.AuctionStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_109(Map<String, String> data) throws Exception {
        //Verify new Auction status is  'Waiting for contract'
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access auction (المزاد) page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 04: Click on Auction Status dropdown");
        app.fullAuctionJourneyPage.clickOnAuctionStatusDropdown();
        logger.info("Step 05: Select auction status");
        CommonUtilityPage.selectFromList("في انتظار العقد", "Waiting for contract", FullAuctionJourneyPageObjects.AuctionStatusDropdownList());
        logger.info("Step 06: Click Search button");
        app.fullAuctionJourneyPage.clickOnSearchButtonOnAuctionPage();
        CommonUtilityPage.verifyValueIsDisplayed("في انتظار العقد", "Waiting for contract", FullAuctionJourneyPageObjects.AuctionStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void Full_Auction_Journey_TC_110(Map<String, String> data) throws Exception {
        //Verify new Auction status is  'Waiting for Payment'
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to sakani admin site");
        //app.loginPage.alertBoxLogin();
        logger.info("Step 02: Login to the portal with admin credentials");
        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 03: Enter OTP number");
        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
        app.loginPage.changeLanguageAdmin(data);
        logger.info("Step 04: Admin able to access auction (المزاد) page");
        app.fullAuctionJourneyPage.navigateToAuctionPage();
        logger.info("Step 04: Click on Auction Status dropdown");
        app.fullAuctionJourneyPage.clickOnAuctionStatusDropdown();
        logger.info("Step 05: Select auction status");
        CommonUtilityPage.selectFromList("في انتظار الدفع", "Waiting for payment", FullAuctionJourneyPageObjects.AuctionStatusDropdownList());
        logger.info("Step 06: Click Search button");
        app.fullAuctionJourneyPage.clickOnSearchButtonOnAuctionPage();
        CommonUtilityPage.verifyValueIsDisplayed("في انتظار الدفع", "Waiting for payment", FullAuctionJourneyPageObjects.AuctionStatus());
    }

}