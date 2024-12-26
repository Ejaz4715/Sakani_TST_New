package sa.nhc.web;

import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.objects.SortingPageObject;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.Map;

public class Sorting extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void TC_01_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: check 'sorting By' btn is Exist");
        app.sortingPage.checkSortingBtn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: open 'sorting By' list");
        app.sortingPage.openSorting();
        logger.info("Step 05: check 'sorting By' list is opened");
        app.sortingPage.checkSortPopUpHeader();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: open 'sorting By' list");
        app.sortingPage.openSorting();
        logger.info("Step 05: click 'recommended' list is opened");
        app.sortingPage.selectRecommendedSortOption();
        logger.info("Step 06: check 'recommended' sorting result");
        app.sortingPage.checkRecommendedSortingResult();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: open 'sorting By' list");
        app.sortingPage.openSorting();
        logger.info("Step 05: click 'Most popular' list is option");
        app.sortingPage.selectMostPopSortOption();
        logger.info("Step 06: check 'Most Popular' sorting result");
        app.sortingPage.checkMostPopularSortingResult();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: open 'sorting By' list");
        app.sortingPage.openSorting();
        logger.info("Step 05: Select 'Newest First' Sorting type and check the sorting result");
        app.sortingPage.selectAndCheckNewestSortingResult();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: open 'sorting By' list");
        app.sortingPage.openSorting();
        logger.info("Step 05: Select 'Oldest First' Sorting type and check the sorting result");
        app.sortingPage.selectAndCheckOldestSortingResult();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: click on sorting");
        app.sortingPage.openSorting();
        logger.info("Step 05: sorting by project first");
        app.sortingPage.selectProjectFirstSortOption();
        logger.info("Step 06: check the sorting result for project first");
        app.sortingPage.checkProjectSortingResult();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: click on sorting");
        app.sortingPage.openSorting();
        logger.info("Step 05: sorting by unit first");
        app.sortingPage.selectUnitFirstSortOption();
        logger.info("Step 06: check the sorting result for market unit first");
        app.sortingPage.checkUnitFirstSortingResult();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: click on sorting");
        app.sortingPage.openSorting();
        logger.info("Step 05: sorting by unit first");
        app.sortingPage.selectHighToLowPriceSortOption();
        logger.info("Step 06: check the sorting result for High projects price comes first");
        app.sortingPage.checkHighPriceHighToLowFirstSortingResult();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: click on sorting");
        app.sortingPage.openSorting();
        logger.info("Step 05: sorting by unit first");
        app.sortingPage.selectLowToHighPriceSortOption();
        logger.info("Step 06: check the sorting result for low projects price comes first");
        app.sortingPage.checkLowToHighPriceFirstSortingResult();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: click on sorting");
        app.sortingPage.openSorting();
        logger.info("Step 05: sort by project first");
        app.sortingPage.selectProjectFirstSortOption();
        logger.info("Step 06: check sorting window got closed after selecting one type of sort");
        app.sortingPage.verifySortingWindowClosed();
        logger.info("Step 07: click on sorting");
        app.sortingPage.openSorting();
        logger.info("Step 08: click 'Most popular' list is option");
        app.sortingPage.selectMostPopSortOption();
        logger.info("Step 09: check sorting window got closed after selecting one type of sort");
        app.sortingPage.verifySortingWindowClosed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_Sorting(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Navigate to Sakani housing site");
        app.loginPage.alertBoxLogin();
        app.homePage.closeAllSakaniPopups();
        logger.info("Step 02: change language");
        app.loginPage.changeLanguageForUser();
        logger.info("Step 03: click on marketplace");
        CommonUtilityPage.MarketPlace();
        logger.info("Step 04: user can Open sorting page");
        app.sortingPage.openSorting();
        logger.info("Step 05: user can close sorting page");
        app.sortingPage.closeSorting();
    }
}
