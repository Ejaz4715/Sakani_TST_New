package sa.nhc.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.nhc.web.objects.SortingPageObject;

import java.util.Arrays;
import java.util.List;

import static com.testcrew.web.Browser.*;
import static com.testcrew.web.Browser.logger;

public class SortingPage {

    public void checkSortingBtn() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.sort_btn(), 50);
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.sort_btn()), "Sorting btn does not Exist");
    }

    public void checkSortPopUpHeader() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.sort_popUp_header(), 50);
        logger.addScreenshot("Sort Pop up is opened");
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.sort_popUp_header()), "Sorting pop up is not opened");
    }

    public void openSorting() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.sort_btn(), 50);
        Browser.click(SortingPageObject.sort_btn());
        Browser.waitUntilVisibilityOfElement(SortingPageObject.close_sort_btn(), 50);
        logger.addScreenshot("Click On Sort");
    }

    public void closeSorting() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.close_sort_btn(), 50);
        Browser.click(SortingPageObject.close_sort_btn());
        logger.addScreenshot("Close Sorting page");
        waitUntilVisibilityOfElement(SortingPageObject.recommended_sorting_selected(), 50);
    }

    public void selectMostPopSortOption() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.mostPop_sort_option(), 50);
        Browser.click(SortingPageObject.mostPop_sort_option());
        logger.addScreenshot("select most popular sort option");
    }

    public void selectRecommendedSortOption() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.recommended_sort_option(), 50);
        Browser.click(SortingPageObject.recommended_sort_option());
        logger.addScreenshot("select recommended sort option");
    }

    public void selectNewestSortOption() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.newest_sort_option(), 50);
        Browser.click(SortingPageObject.newest_sort_option());
        logger.addScreenshot("select newest sort option");
    }

    public void selectOldestSortOption() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.oldest_sort_option(), 50);
        Browser.click(SortingPageObject.oldest_sort_option());
        logger.addScreenshot("select oldest sort option");
    }

    public void selectProjectFirstSortOption() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.project_sort_option(), 50);
        Browser.click(SortingPageObject.project_sort_option());
        logger.addScreenshot("select project first sort option");
    }

    public void selectUnitFirstSortOption() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.unit_sort_option(), 50);
        Browser.click(SortingPageObject.unit_sort_option());
        logger.addScreenshot("select unit first sort option");
    }

    public void selectHighToLowPriceSortOption() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.highPrice_sort_option(), 50);
        Browser.click(SortingPageObject.highPrice_sort_option());
        logger.addScreenshot("select high price first sort option");
    }

    public void selectLowToHighPriceSortOption() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.lowPrice_sort_option(), 50);
        Browser.click(SortingPageObject.lowPrice_sort_option());
        logger.addScreenshot("select low price first sort option");
    }

    public void checkProjectSortingResult() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.marketplace_project_1(), 50);
        Browser.executeJSScrollIntoView(SortingPageObject.marketplace_project_1());
        logger.addScreenshot("Project First sorting");
        Browser.click(SortingPageObject.marketplace_project_1());
        Browser.waitUntilVisibilityOfElement(SortingPageObject.projectTitle(), 50);
        Browser.executeJSScrollIntoView(SortingPageObject.projectTitle());
        logger.addScreenshot("project sorting result");
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.projectTitle()), "project page title is not displayed");

    }

    public void checkUnitFirstSortingResult() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.marketplace_project_1(), 50);
        Browser.executeJSScrollIntoView(SortingPageObject.marketplace_project_1());
        logger.addScreenshot("Unit First sorting");
        Browser.click(SortingPageObject.marketplace_project_1());
        Browser.waitUntilVisibilityOfElement(SortingPageObject.unitTitle(), 100);
        Browser.moveToElement(SortingPageObject.unitTitle());
        String unit = Browser.getText(SortingPageObject.unitTitle());
        logger.addScreenshot("Unit First sorting result");
        Assert.assertTrue(unit.contains("unit") || unit.contains("الوحدات"),"unit page title is not displayed");
    }

    public void checkRecommendedSortingResult() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.promotedLabel_1(), 50);
        Browser.executeJSScrollIntoView(SortingPageObject.promotedLabel_1());
        Browser.executeJSScrollIntoView(SortingPageObject.promotedLabel_2());
        logger.addScreenshot("recommended sorting result");
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.recommended_sorting_selected()));
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.promotedLabel_1()), "promoted label of project 1 is not displayed");
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.promotedLabel_2()), "promoted label of project 2 is not displayed");
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.promotedLabel_3()), "promoted label of project 3 is not displayed");
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.promotedLabel_4()), "promoted label of project 4 is not displayed");

    }

    public void checkMostPopularSortingResult() throws Exception {
        Browser.waitUntilPresenceOfElement(SortingPageObject.marketplace_project_1(), 100);
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.mostPopular_sorting_selected()), "sorting by most popular not applied");
        Browser.executeJSScrollIntoView(SortingPageObject.marketplace_project_1());
        Browser.click(SortingPageObject.marketplace_project_1());
        Browser.waitUntilVisibilityOfElement(SortingPageObject.numberOfViews(), 50);
        Thread.sleep(5000);
        int numberOfViews1 = Integer.parseInt(Browser.getText(SortingPageObject.numberOfViews()).replace(",", ""));
        logger.addScreenshot("number of views for first marketplace project");
        driver.navigate().back();
        Browser.waitUntilPresenceOfElement(SortingPageObject.marketplace_project_2(), 100);
        Browser.click(SortingPageObject.marketplace_project_2());
        Browser.waitUntilVisibilityOfElement(SortingPageObject.numberOfViews(), 50);
        Thread.sleep(5000);
        int numberOfViews2 = Integer.parseInt(Browser.getText(SortingPageObject.numberOfViews()).replace(",", ""));
        logger.addScreenshot("Most popular sorting result,number of views for 2nd marketplace project greater than that of first");
        Assert.assertTrue(numberOfViews1 > numberOfViews2, "Number of view of 2nd project is more than the 1st project");

    }

    public void verifySortingWindowClosed() throws Exception {
        Browser.waitUntilInvisibilityOfElement(SortingPageObject.sort_popUp_header(), 50);
        Browser.isElementNotPresent(SortingPageObject.sort_popUp_header());
    }

    public void selectAndCheckNewestSortingResult() throws Exception {
        Browser.waitUntilVisibilityOfElement(SortingPageObject.marketplace_project_1(), 50);
        Browser.executeJSScrollIntoView(SortingPageObject.marketplace_project_3());
        logger.addScreenshot("projects view without sorting ");
        List<String> list1 = Arrays.asList(
                Browser.getText(SortingPageObject.marketplace_project_1()),
                Browser.getText(SortingPageObject.marketplace_project_2()),
                Browser.getText(SortingPageObject.marketplace_project_3()));
        selectNewestSortOption();
        Browser.waitUntilVisibilityOfElement(SortingPageObject.marketplace_project_1(), 50);
        Browser.moveToElement(SortingPageObject.marketplace_project_3());
        List<String> list2 = Arrays.asList(
                Browser.getText(SortingPageObject.marketplace_project_1()),
                Browser.getText(SortingPageObject.marketplace_project_2()),
                Browser.getText(SortingPageObject.marketplace_project_3()));
        logger.addScreenshot("projects view with newest sorting");
        Assert.assertNotEquals(list1, list2, "Newest first sorting is not applied");
    }

    public void selectAndCheckOldestSortingResult() throws Exception {
        Browser.waitUntilVisibilityOfElement(SortingPageObject.marketplace_project_1(), 50);
        Browser.executeJSScrollIntoView(SortingPageObject.marketplace_project_3());
        logger.addScreenshot("projects view without sorting ");
        List<String> list1 = Arrays.asList(
                Browser.getText(SortingPageObject.marketplace_project_1()),
                Browser.getText(SortingPageObject.marketplace_project_2()),
                Browser.getText(SortingPageObject.marketplace_project_3()));
        selectOldestSortOption();
        Browser.waitUntilVisibilityOfElement(SortingPageObject.marketplace_project_1(), 50);
        Browser.moveToElement(SortingPageObject.marketplace_project_3());
        List<String> list2 = Arrays.asList(
                Browser.getText(SortingPageObject.marketplace_project_1()),
                Browser.getText(SortingPageObject.marketplace_project_2()),
                Browser.getText(SortingPageObject.marketplace_project_3()));
        logger.addScreenshot("projects view with oldest sorting");
        Assert.assertNotEquals(list1, list2, "Oldest first sorting is not applied");

    }

    public void checkHighPriceHighToLowFirstSortingResult() throws Exception {
        Browser.waitUntilVisibilityOfElement(SortingPageObject.marketplace_project_1(), 50);
        Browser.waitUntilVisibilityOfElement(SortingPageObject.marketplace_price_1(), 50);
        Browser.executeJSScrollIntoView(SortingPageObject.marketplace_project_2());
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.highPriceFirst_sorting_selected()), "Price : highest to low first Sorting is not applied");
        int priceProject1 =
                Integer.parseInt(Browser.getText(SortingPageObject.marketplace_price_1()).replace(",", ""));
        int priceProject2 =
                Integer.parseInt(Browser.getText(SortingPageObject.marketplace_price_2()).replace(",", ""));

        logger.addScreenshot("projects view with high price first sorting");
        Assert.assertTrue(priceProject1 > priceProject2, "The price of the first is less than the price of second project, but they should not be.");
    }

    public void checkLowToHighPriceFirstSortingResult() throws Exception {
        Browser.waitUntilVisibilityOfElement(SortingPageObject.marketplace_project_1(), 50);
        Browser.waitUntilVisibilityOfElement(SortingPageObject.marketplace_price_1(), 50);
        Browser.executeJSScrollIntoView(SortingPageObject.marketplace_project_2());
        Assert.assertTrue(Browser.isElementDisplayed(SortingPageObject.lowPriceFirst_sorting_selected()), "Price Sorting Low to highest is not applied");
        int priceProject1;
        if (Browser.getText(SortingPageObject.marketplace_price_1()).equals("Free") || Browser.getText(SortingPageObject.marketplace_price_1()).equals("مجانية")) {
            logger.addScreenshot("projects view the Free projects first");
        } else {
            priceProject1 = Integer.parseInt(Browser.getText(SortingPageObject.marketplace_price_1()).replace(",", ""));
            int priceProject2 =
                    Integer.parseInt(Browser.getText(SortingPageObject.marketplace_price_2()).replace(",", ""));

            logger.addScreenshot("projects view with low price first sorting");
            Assert.assertTrue(priceProject1 < priceProject2, "The price of the first is more than the price of second project, but they should not be.");
        }
    }
}
