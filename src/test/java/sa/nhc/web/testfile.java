package sa.nhc.web;

import com.testcrew.manager.TestDataManager;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;

public class testfile extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void testFile1(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Auctions"));
//        logger.info("Step 00: Test Data : " + data.toString());
//        app.openApplication(data);
//        logger.info("Step 02: Login to the portal with admin credentials");
//        app.loginPage.loginAsAdmin(data.get("Username"), data.get("Password"));
//        logger.info("Step 03: Enter OTP Number");
//        app.loginPage.enterOTPForAdminLogin(data.get("OTP"));
//        app.loginPage.changeLanguageAdmin(data);
        app.fullAuctionJourneyPage.getAuctionDateAndTime();
        app.fullAuctionJourneyPage.editAuctionUnitFile(data.get("startDate"), data.get("endDate"), data.get("startTimeHr"), data.get("startTimeMin"), data.get("endTimeHr"), data.get("endTimeMin"));
    }
}
