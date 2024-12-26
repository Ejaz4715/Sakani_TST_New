package sa.nhc.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import sa.nhc.web.objects.*;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;


import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;

public class QueueingOffPlanPage {

    /**
     * Enter text in project name input field
     */
    public void enterProjectName(String projectName) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        Browser.waitUntilVisibilityOfElement(QueueingOffPlanPageObjects.projectNameInputField(), 50);
        Browser.moveToElement(ObjectionPageObjects.searchButton());
        Browser.setText(QueueingOffPlanPageObjects.projectNameInputField(), projectName);
    }

    /**
     * Validate the search project result is displayed
     */
    public void verifyTheSearchProjectIsDisplayed(String searchedProjectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.searchValueResult(searchedProjectName), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.searchValueResult(searchedProjectName)));
    }

    /**
     * Click on the search project result
     */
    public void clickOnTheSearchProjectIsDisplayed(String searchedProjectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.searchValueResult(searchedProjectName), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.searchValueResult(searchedProjectName));
    }

    /**
     * Validate the project details is displayed
     */
    public void verifyTheProjectDetailsIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField()));
    }

    /**
     * Validate the max number of users can book at the same time input field is disabled
     */
    public void verifyTheMaxNumberOfUsersCanBookAtTheSameTimeIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField(), 40);
        Browser.moveToElement(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField());
        WebElement element = Browser.getWebElement(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField());
        boolean status = Boolean.parseBoolean(element.getAttribute("readonly"));
        logger.addScreenshot("");
        Assert.assertTrue(status, " TheMaxNumberOfUsersCanBookAtTheSameTimeIs Enabled");
    }

    /**
     * Click on active queuing toggle to turn it on
     */
    public void clickOnActiveQueueingToggle() throws Exception {
        Browser.executeJSScrollIntoView(QueueingOffPlanPageObjects.activeQueueingToggle());
        Browser.waitUntilVisibilityOfElement(QueueingOffPlanPageObjects.activeQueueingToggle(), 40);
        Browser.moveToElement(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField());
        Browser.click(QueueingOffPlanPageObjects.activeQueueingToggle());
    }

    /**
     * Enter text in the max number of users can book at the same time input field
     */
    public void enterTheMaxNumberOfUsersCanBookAtTheSameTimeInputField(String maxActiveQueueingMember) throws Exception {
        Browser.waitUntilVisibilityOfElement(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField(), 50);
        Browser.moveToElement(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField());
        Browser.setText(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField(), maxActiveQueueingMember);
    }

    /**
     * Clear the text in the max number of users can book at the same time input field
     */
    public void clearTheTextOfTheMaxNumberOfUsersCanBookAtTheSameTimeInputField() throws Exception {
        Browser.waitUntilVisibilityOfElement(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField(), 50);
        Browser.moveToElement(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField());
        WebElement EnterOption = driver.findElement(QueueingOffPlanPageObjects.maxActiveQueueingMemberInputField());
        EnterOption.sendKeys(Keys.BACK_SPACE);
    }

    /**
     * Click on unit list button
     */
    public void clickOnUnitListButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(QueueingOffPlanPageObjects.unitsListButton(), 40);
        Browser.moveToElement(QueueingOffPlanPageObjects.unitsListButton());
        Browser.click(QueueingOffPlanPageObjects.unitsListButton());
    }

    /**
     * Click on join now button
     */
    public void clickOnJoinNowButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(QueueingOffPlanPageObjects.joinNowButton(), 40);
        Browser.moveToElement(QueueingOffPlanPageObjects.joinNowButton());
        Browser.click(QueueingOffPlanPageObjects.joinNowButton());
    }

    /**
     * Validate booking details list is displayed
     */
    public void verifyBookingDetailsListIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(QueueingOffPlanPageObjects.bookingDetailsList(), 40);
        Browser.moveToElement(QueueingOffPlanPageObjects.bookingDetailsList());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(QueueingOffPlanPageObjects.bookingDetailsList()));
    }

    /**
     * Validate leave queue button is displayed
     */
    public void verifyLeaveQueueButtonIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(QueueingOffPlanPageObjects.leaveQueueButton(), 40);
        Browser.moveToElement(QueueingOffPlanPageObjects.leaveQueueButton());
    }
}
