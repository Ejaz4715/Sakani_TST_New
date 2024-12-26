package sa.nhc.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.TagsPageObject;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.List;

import static com.testcrew.web.Browser.logger;


public class TagsPage {
    public void LabelExistenceChecker() throws Exception {
        Browser.executeJSScroll(1000);
        Browser.waitUntilVisibilityOfElement(TagsPageObject.LabelExistence(), 50);
        List<WebElement> labels = Browser.driver.findElements(TagsPageObject.LabelExistence());
        boolean allLabelsDisplayed = true;
        for (WebElement label : labels) {
            if (!label.isDisplayed()) {
                allLabelsDisplayed = false;
            }
            logger.addScreenshot("");
            Assert.assertTrue(allLabelsDisplayed, "The Labels are not Displayed");
        }
    }

    public void PromotedLabelsInFirst(String ExpectedFirstLabelValue) throws Exception {
        Browser.waitUntilVisibilityOfElement(TagsPageObject.PromotedLabelsInFirstIndex(), 50);
        CommonUtilityPage.moveToObject(TagsPageObject.PromotedLabelsInFirstIndex());
        List<WebElement> PromotedLabelsInFirstIndex = Browser.driver.findElements(TagsPageObject.PromotedLabelsInFirstIndex());
        String PromotedLabel = PromotedLabelsInFirstIndex.get(0).getText();
        boolean result;
        result = PromotedLabel.equals(ExpectedFirstLabelValue);
        logger.addScreenshot("");
        Assert.assertTrue(result, "The Promoted Labels are not come first");
    }

    public void BookingsOpenLabelChecker() throws Exception {
        Browser.waitUntilVisibilityOfElement(TagsPageObject.BookingsOpenLabel(), 50);
        Browser.moveToElement(TagsPageObject.BookingsOpenLabel());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(TagsPageObject.BookingsOpenLabel()), "The Bookings Open Label is not Displayed");
    }

    public void NumberOfAvailableLandsLabel() throws Exception {
        Browser.waitUntilVisibilityOfElement(TagsPageObject.NumberOfAvailableLandsLabel(), 50);
        Browser.moveToElement(TagsPageObject.NumberOfAvailableLandsLabel());
        logger.addScreenshot("Number Of Available Lands Label Existence Checker");
        Assert.assertTrue(Browser.isElementDisplayed(TagsPageObject.NumberOfAvailableLandsLabel()), "The Number Of Available Lands Label is not Displayed");
    }

    public void NumberOfAvailableUnitsLabel() throws Exception {
        Browser.waitUntilVisibilityOfElement(TagsPageObject.NumberOfAvailableUnitsLabel(), 50);
        Browser.moveToElement(TagsPageObject.NumberOfAvailableUnitsLabel());
        logger.addScreenshot("Number Of Available Units Label Existence Checker");
        Assert.assertTrue(Browser.isElementDisplayed(TagsPageObject.NumberOfAvailableUnitsLabel()), "The Number Of Available Units Label is not Displayed");
    }

    public void SoldOutLabelExistence() throws Exception {
        Browser.waitUntilVisibilityOfElement(TagsPageObject.SoldOutLabel(), 50);
        Browser.moveToElement(TagsPageObject.SoldOutLabel());
        logger.addScreenshot("SoldOut Label Existence Checker");
        Assert.assertTrue(Browser.isElementDisplayed(TagsPageObject.SoldOutLabel()), "The SoldOut Label is not Displayed");
    }

    public void FullyBookedLabelExistence() throws Exception {
        Browser.waitUntilVisibilityOfElement(TagsPageObject.FullyBookedLabel(), 50);
        Browser.moveToElement(TagsPageObject.FullyBookedLabel());
        logger.addScreenshot("Fully Booked Label Existence Checker");
        Assert.assertTrue(Browser.isElementDisplayed(TagsPageObject.FullyBookedLabel()), "The Fully Booked Label is not Displayed");
    }

    public void PromotedLabelExistence() throws Exception {
        Browser.waitUntilVisibilityOfElement(TagsPageObject.PromotedLabel(), 50);
        Browser.moveToElement(TagsPageObject.PromotedLabel());
        logger.addScreenshot("Promoted Label Existence Checker");
        Assert.assertTrue(Browser.isElementDisplayed(TagsPageObject.PromotedLabel()), "The Promoted Label is not Displayed");
    }

    public void RegisteringInterestLabelExistence() throws Exception {
        Browser.waitUntilVisibilityOfElement(TagsPageObject.RegisteringInterestLabel(), 50);
        Browser.moveToElement(TagsPageObject.RegisteringInterestLabel());
        logger.addScreenshot("Registering Interest Label Existence Checker");
        Assert.assertTrue(Browser.isElementDisplayed(TagsPageObject.RegisteringInterestLabel()), "The Registering Interest Label is not Displayed");
    }

    public void WaitingListLabelExistence() throws Exception {
        Browser.waitUntilVisibilityOfElement(TagsPageObject.WaitingListLabel(), 50);
        Browser.moveToElement(TagsPageObject.WaitingListLabel());
        logger.addScreenshot("WaitingList Label Existence Checker");
        Assert.assertTrue(Browser.isElementDisplayed(TagsPageObject.WaitingListLabel()), "The WaitingList Label is not Displayed");
    }
}
