package sa.nhc.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.CardDetailsPageObjects;
import sa.nhc.web.objects.exisitng.HomePageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.List;

import static com.testcrew.web.Browser.*;
import static com.testcrew.web.Browser.driver;

public class CardDetailsPage {
    public void ClickOnCard() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.ClickOnCardDiv(), 50);
        Browser.waitUntilElementToBeClickable(CardDetailsPageObjects.ClickOnCardDiv(), 50);
        Browser.click(CardDetailsPageObjects.ClickOnCardDiv());
    }

    public void ClickOnTheSearchedProject() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.ClickOnCardDiv(), 50);
        Browser.waitUntilElementToBeClickable(CardDetailsPageObjects.ClickOnCardDiv(), 50);
        Browser.waitForSeconds(2);
        Browser.click(CardDetailsPageObjects.ClickOnCardDiv());
    }

    public void LabelExistenceChecker_List(By locator, String nameOfLocator) {
        waitUntilVisibilityOfElement(locator, 50);
        Browser.moveToElement(locator);
        List<WebElement> Labels = driver.findElements(locator);
        boolean allLabelsDisplayed = true;
        for (WebElement label : Labels) {
            if (!label.isDisplayed()) {
                allLabelsDisplayed = false;
                break;
            }
        }
        logger.addScreenshot(nameOfLocator + " Label Existence Checker");
        Assert.assertTrue(allLabelsDisplayed, "The" + nameOfLocator + "Labels are not Displayed");
    }

    public void LabelCardDetailsPageExistenceChecker(By locator, String nameOfLocator) {
        executeJSScroll(1000);
        waitForSeconds(1);
        waitUntilVisibilityOfElement(locator, 50);
        WebElement label = driver.findElement(locator);
        boolean labelsDisplayed = label.isDisplayed();
        logger.addScreenshot(nameOfLocator + " Label Existence Checker");
        Assert.assertTrue(labelsDisplayed, "The" + nameOfLocator + "Label is not Displayed");
    }

    public void ClickOnTheBrochureViewButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.BrochureViewButton(), 50);
        Browser.waitUntilElementToBeClickable(CardDetailsPageObjects.BrochureViewButton(), 50);
        CommonUtilityPage.moveToObject(CardDetailsPageObjects.BrochureViewButton());
        Browser.click(CardDetailsPageObjects.BrochureViewButton());
    }

    public void ClickOnTheMasterPlanViewButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.MasterPlanViewButton(), 50);
        Browser.waitUntilElementToBeClickable(CardDetailsPageObjects.MasterPlanViewButton(), 50);
        CommonUtilityPage.moveToObject(CardDetailsPageObjects.MasterPlanViewButton());
        Browser.click(CardDetailsPageObjects.MasterPlanViewButton());
    }

    public void ClickOnBrochureAndMasterPlanViewButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.BrochureAndMasterPlanViewButton(), 50);
        Browser.waitUntilElementToBeClickable(CardDetailsPageObjects.BrochureAndMasterPlanViewButton(), 50);
        Browser.moveToElement(CardDetailsPageObjects.BrochureAndMasterPlanViewButton());
        Browser.waitForSeconds(2);
        Browser.click(CardDetailsPageObjects.BrochureViewButton());
    }

    public void ClickOnUnitList() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.UnitListExistence(), 50);
        Browser.waitUntilElementToBeClickable(CardDetailsPageObjects.UnitListExistence(), 50);
        Browser.moveToElement(CardDetailsPageObjects.UnitListExistence());
        Browser.waitForSeconds(2);
        Browser.click(CardDetailsPageObjects.UnitListExistence());
    }

    public void ClickOnTheMedia() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.MediaButtonExpansion(), 50);
        Browser.waitUntilElementToBeClickable(CardDetailsPageObjects.MediaButtonExpansion(), 50);
        Browser.click(CardDetailsPageObjects.MediaButtonExpansion());
    }

    public void ClickOnTheProjectDetails() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.ProjectDetailsExistence(), 50);
        Browser.waitUntilElementToBeClickable(CardDetailsPageObjects.ProjectDetailsExistence(), 50);
        Browser.click(CardDetailsPageObjects.ProjectDetailsExistence());
    }

    public void ClickOnTheLandProjectDetails() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.LandProjectDetailsExistence(), 50);
        Browser.waitUntilElementToBeClickable(CardDetailsPageObjects.LandProjectDetailsExistence(), 50);
        CommonUtilityPage.moveToObject(CardDetailsPageObjects.LandProjectDetailsExistence());
        Browser.click(CardDetailsPageObjects.LandProjectDetailsExistence());
    }

    public void CloseTheBrochurePopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.BrochurePopUpCloser(), 50);
        Browser.waitUntilElementToBeClickable(CardDetailsPageObjects.BrochurePopUpCloser(), 50);
        Browser.click(CardDetailsPageObjects.BrochurePopUpCloser());
    }

    public void mediaScrollChecker() throws Exception {
        Browser.waitUntilVisibilityOfElement(CardDetailsPageObjects.FirstMediaExistence(), 50);
//        String expected = Browser.getText(CardDetailsPageObjects.MediaSliderPaginationLocator());
//        String[] parts = expected.split("/");
//        int beforeSlash = Integer.parseInt(parts[0].trim());
//        int afterSlash = Integer.parseInt(parts[1].trim());
//        if (beforeSlash != afterSlash) {
        Browser.moveToElement(CardDetailsPageObjects.FirstMediaExistence());
        Browser.click(CardDetailsPageObjects.MediaSliderButton());
        Assert.assertTrue(Browser.isElementEnabled(By.xpath("//div[@class='swiper-button-prev ng-star-inserted']")), "The Slider Of the Media Is Not Working As Expected");

//            String actual = Browser.getText(CardDetailsPageObjects.MediaSliderPaginationLocator());
//            Assert.assertNotEquals(actual, expected, "The Slider Of the Media Is Not Working As Expected");
//        } else {
//            logger.addScreenshot("There is only one media attachment uploaded for the project");
//        }
        logger.addScreenshot("Media scroll");
    }

    public void ProjectDetails() throws Exception {
        Browser.waitUntilPresenceOfElement(HomePageObjects.ProjectDetails(), 50);
        Browser.executeJSScrollIntoView(HomePageObjects.ProjectDetails());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(HomePageObjects.ProjectDetails(), 50);
        Assert.assertTrue(Browser.isElementDisplayed(HomePageObjects.ProjectDetails()), "The Project Details Is not Exist");
        logger.addScreenshot("Project Details");
    }
}
