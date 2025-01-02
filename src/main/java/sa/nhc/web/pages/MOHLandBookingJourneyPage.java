package sa.nhc.web.pages;

import com.testcrew.manager.TestConfigManager;
import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.EligibilityPageObject;
import sa.nhc.web.objects.MOHLandBookingJourneyPageObjects;
import sa.nhc.web.objects.exisitng.BookingPageObjects;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.objects.*;

import java.util.List;
import java.util.Map;

import static com.testcrew.web.Browser.logger;


public class MOHLandBookingJourneyPage {

    /**
     * Click on the filter
     */
    public void clickOnFilterButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.filterButton(), 40);
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 50);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.filterButton());
        Browser.click(MOHLandBookingJourneyPageObjects.filterButton());
    }

    /**
     * Validate filter result popup window is displayed
     */
    public void verifyFilterResultPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.filterResultPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(MOHLandBookingJourneyPageObjects.filterResultPopup()));
    }

    /**
     * Enter project name
     */
    public void enterProjectName(String projectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.projectInputFiled(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.projectInputFiled());
        Browser.setText(MOHLandBookingJourneyPageObjects.projectInputFiled(), projectName);
    }

    /**
     * Select the entered project name
     */
    public void selectTheEnteredProjectName() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.optionListSelected(), 40);
        Browser.click(EligibilityPageObject.optionListSelected());
    }

    /**
     * Validate the entered project name is displayed
     */
    public void verifyTheEnteredProjectName(String projectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.optionListSelected(), 40);
        logger.addScreenshot("");
        String selected = Browser.getWebElement(EligibilityPageObject.optionListSelected()).getText();
        Assert.assertTrue(selected.contains(projectName));
    }

    /**
     * Click on the clear button
     */
    public void clickOnClearButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.clearButton(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.clearButton());
    }

    /**
     * Click on the view button
     */
    public void clickOnViewButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.viewButton(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.viewButton());
    }

    /**
     * Validate the searched project is displayed
     */
    public void verifyTheSearchProjectIsDisplayed(String searchedProject) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.projectTitle(), 40);
        Browser.waitForSeconds(2);
        String ProjectName = Browser.getWebElement(BookingPageObjects.projectTitle()).getText();
        logger.addScreenshot("");
        Assert.assertTrue(ProjectName.contains(searchedProject));

    }

    /**
     * Click on the searched project
     */
    public void clickOnTheSearchedProject() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.projectTitle(), 40);
        Browser.moveToElement(BookingPageObjects.projectTitle());
        Browser.waitUntilElementToBeClickable(BookingPageObjects.projectTitle(), 40);
//        boolean presence = false;
//        while (!presence) {
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.projectTitle());
            Browser.waitForSeconds(2);
//            if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.startBookingButton()) || Browser.isElementPresent(FullBookingJourneyPageObjects.UnitsListButton())) {
//                presence = true;
//            }
//        }
    }

    /**
     * Validate searched project details page is displayed
     */
    public void verifyTheSearchedProjectDetailsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.searchedProjectDetailsPage(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.searchedProjectDetailsPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(MOHLandBookingJourneyPageObjects.searchedProjectDetailsPage()));
    }

    /**
     * Click on the project details tab button
     */
    public void clickOnTheProjectDetailsTabButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.projectDetailsTabButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.projectDetailsTabButton());
        Browser.click(MOHLandBookingJourneyPageObjects.projectDetailsTabButton());
    }

    /**
     * Validate project details page is displayed
     */
    public void verifyTheProjectDetailsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.projectDetailsPage(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.projectDetailsPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(MOHLandBookingJourneyPageObjects.projectDetailsPage()));
    }

    /**
     * Click on start booking button
     */
    public void clickOnStartBookingButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.startBookingButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.startBookingButton());
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.startBookingButton(),40);
        Browser.click(MOHLandBookingJourneyPageObjects.startBookingButton());
    }

    /**
     * Validate available units page is displayed
     */
    public void verifyTheAvailableUnitsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.availableUnitsPage(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.availableUnitsPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(MOHLandBookingJourneyPageObjects.availableUnitsPage()));
    }

    /**
     * Select available unit
     */
    public void selectAvailableUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.availableProjectUnit(), 40);
        Browser.waitForSeconds(1);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.availableProjectUnit());
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.availableProjectUnit(),40);
        Browser.click(MOHLandBookingJourneyPageObjects.availableProjectUnit());
    }

    /**
     * Validate the unit details is displayed
     */
    public void verifyTheUnitDetailsIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.reservePlotButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.reservePlotButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(MOHLandBookingJourneyPageObjects.reservePlotButton()));
    }

    /**
     * Click on reserve plot button
     */
    public void clickOnReservePlotButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.reservePlotButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.reservePlotButton());
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.reservePlotButton(),40);
        Browser.waitForSeconds(1);
        Browser.click(MOHLandBookingJourneyPageObjects.reservePlotButton());
    }

    /**
     * Validate the terms and conditions page is displayed
     */
    public void verifyTermsAndConditionsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.termsAndConditionsPage(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.termsAndConditionsPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(MOHLandBookingJourneyPageObjects.termsAndConditionsPage()));
    }

    /**
     * Click on accept and sign button
     */
    public void clickOnAcceptAndSignButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.acceptAndSignButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.acceptAndSignButton());
        Browser.click(MOHLandBookingJourneyPageObjects.acceptAndSignButton());
    }

    /**
     * Validate the accept and sign button is disabled
     */
    public void verifyAcceptAndSignButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.acceptAndSignButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.acceptAndSignButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(MOHLandBookingJourneyPageObjects.acceptAndSignButton()));
    }

    /**
     * Click on download land contract button
     */
    public void clickOnDownloadLandContractButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.downloadLandContractButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.downloadLandContractButton());
        Browser.click(MOHLandBookingJourneyPageObjects.downloadLandContractButton());
    }

    /**
     * Click on terms and conditions checkbox
     */
    public void clickOnTermsAndConditionsCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.termsAndConditionsCheckbox(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.termsAndConditionsCheckbox());
        Browser.click(MOHLandBookingJourneyPageObjects.termsAndConditionsCheckbox());
    }


    /**
     * Validate the accept and sign button is enabled
     */
    public void verifyAcceptAndSignButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.acceptAndSignButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.acceptAndSignButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(MOHLandBookingJourneyPageObjects.acceptAndSignButton()));
    }

    /**
     * Validate the otp popup window is displayed
     */
    public void verifyOtpPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.UserOTP(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(CommonUtilityPageObjects.UserOTP()));
    }

    /**
     * Validate booking land complete page is displayed
     */
    public void verifyBookingLandCompletePageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.bookingLandCompletePage(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.bookingLandCompletePage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.bookingLandCompletePage()));
    }

    /**
     * Click on my activities button
     */
    public void clickOnMyActivitiesButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.myActivitiesButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.myActivitiesButton());
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.myActivitiesButton(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.myActivitiesButton());
    }

    /**
     * Click on bookings button
     */
    public void clickOnBookingsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.bookingsButton(), 40);
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.bookingsButton(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.bookingsButton());
    }

    /**
     * Click on view booking button
     */
    public void clickOnViewBookingButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.viewBookingButton(), 40);
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.viewBookingButton(),40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.viewBookingButton());
        Browser.click(MOHLandBookingJourneyPageObjects.viewBookingButton());
    }

    /**
     * Validate booking details page is displayed
     */
    public void verifyBookingDetailsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.bookingDetailsPage(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.bookingDetailsPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.bookingDetailsPage()));
    }

    /**
     * Validate the view icon buttons clickable
     */
    public void verifyTheViewIconButtonsAreClickable() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.viewIconButton(), 40);
        Browser.executeJSScroll(950);
        Browser.waitForSeconds(2);
        List<WebElement> viewButtons = Browser.getWebElements(MOHLandBookingJourneyPageObjects.viewIconButton());
        for (WebElement buttons : viewButtons) {
            Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.viewIconButton(), 40);
            buttons.click();
            Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 100);
            Browser.waitForSeconds(2);
            if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup())) {
                logger.addScreenshot("");
                Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup(), 40);
                Browser.click(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup());
            } else {
                logger.addScreenshot("");
            }
        }

    }

    /**
     * Cancel the booked land for prerequisite
     */
    public void cancelTheLand(String cancelReason) throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.iconProfile(), 50);
        Browser.moveToElement(EligibilityPageObject.iconProfile());
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.myProfileButton(), 40);
        Browser.waitUntilElementToBeClickable(EligibilityPageObject.myProfileButton(),40);
        Browser.click(EligibilityPageObject.myProfileButton());
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.myActivitiesButton(), 40);
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.myActivitiesButton(),50);
        Browser.click(MOHLandBookingJourneyPageObjects.myActivitiesButton());
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.bookingsButton(), 40);
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.bookingsButton(),50);
        Browser.click(MOHLandBookingJourneyPageObjects.bookingsButton());
        if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.viewBookingButton())) {
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.viewBookingButton(), 40);
            Browser.click(MOHLandBookingJourneyPageObjects.viewBookingButton());
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelBookingButtonFromProfile(), 40);
            Browser.moveToElement(MOHLandBookingJourneyPageObjects.cancelBookingButtonFromProfile());
            Browser.click(MOHLandBookingJourneyPageObjects.cancelBookingButtonFromProfile());
            Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 100);
            Browser.waitUntilElementToBeClickable(BookingPageObjects.otherOption(), 50);
            Browser.moveToElement(BookingPageObjects.otherOption());
            Browser.click(BookingPageObjects.otherOption());
            Browser.setText(BookingPageObjects.cancellationReasonInput(), cancelReason);
            Browser.moveToElement(EligibilityPageObject.confirmButton());
            Browser.click(EligibilityPageObject.confirmButton());
        }
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.marketPlaceNavButton(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.marketPlaceNavButton());
    }

    /**
     * Validate cancel the contract page is displayed
     */
    public void verifyCancelTheContractPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelContractPage(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.cancelContractPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.cancelContractPage()));
    }

    /**
     * Click on cancel booking button from profile
     */
    public void clickOnCancelBookingFromProfileButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelBookingButtonFromProfile(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.cancelBookingButtonFromProfile());
        Browser.click(MOHLandBookingJourneyPageObjects.cancelBookingButtonFromProfile());
    }

    /**
     * Click on save and continue button
     */
    public void clickOnSaveAndContinueButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.saveAndContinueButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.saveAndContinueButton());
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.saveAndContinueButton(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.saveAndContinueButton());
    }

    /**
     * Enter cancel reason textarea
     */
    public void enterCancelReasonTextarea(String cancelReason) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.cancellationReasonInput(), 40);
        Browser.moveToElement(BookingPageObjects.cancellationReasonInput());
        Browser.setText(BookingPageObjects.cancellationReasonInput(), cancelReason);
    }

    /**
     * Validate cancel land disclaimer page is displayed
     */
    public void verifyCancelLandDisclaimerPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelLandDisclaimerPage(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.cancelLandDisclaimerPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.cancelLandDisclaimerPage()));
    }

    /**
     * Validate the process button is disabled
     */
    public void verifyProcessButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.processButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.processButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(MOHLandBookingJourneyPageObjects.processButton()));
    }

    /**
     * Click on disclaimer checkbox
     */
    public void clickOnDisclaimerCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.disclaimerCheckbox(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.disclaimerCheckbox());
        Browser.click(MOHLandBookingJourneyPageObjects.disclaimerCheckbox());
    }

    /**
     * Validate the process button is enabled
     */
    public void verifyProcessButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.processButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.processButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(MOHLandBookingJourneyPageObjects.processButton()));
    }

    /**
     * Click on process button
     */
    public void clickOnProcessButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.processButton(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.processButton());
        Browser.click(MOHLandBookingJourneyPageObjects.processButton());
    }

    /**
     * Validate the otp page is displayed
     */
    public void verifyOtpPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.UserOTP(), 40);
        logger.addScreenshot("The OTP page");
        Assert.assertTrue(Browser.isElementDisplayed(CommonUtilityPageObjects.UserOTP()));
    }

    /**
     * Click on verify OTP button
     */
    public void clickOnVerifyOTPButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.BTNVerify(), 40);
        Browser.moveToElement(CommonUtilityPageObjects.BTNVerify());
        Browser.click(CommonUtilityPageObjects.BTNVerify());
    }

    /**
     * Validate the land cancellation complete page is displayed
     */
    public void verifyCancelLandCompletePageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.landCancelCompletePage(), 40);
        Browser.moveToElement(MOHLandBookingJourneyPageObjects.landCancelCompletePage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.landCancelCompletePage()));
    }

    /**
     * Click on beneficiaries side menu button
     */
    public void clickOnBeneficiariesSidMenuButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.beneficiariesSideMenuButton(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.beneficiariesSideMenuButton());
    }

    /**
     * Click on bookings side menu button
     */
    public void clickOnBookingsSidMenuButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.bookingsSideMenuButton(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.bookingsSideMenuButton());
    }

    /**
     * Validate the bookings admin page is displayed
     */
    public void verifyBookingsAdminPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.bookingsAdminPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.bookingsAdminPage()));
    }

    /**
     * Validate search booking by dropdown list is visible
     */
    public void verifySearchBookingByDropdownListIsVisible() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.searchBookingByDropdownList(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.searchBookingByDropdownList());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(EligibilityPageObject.optionListSelected()));
    }

    /**
     * Validate the search button is disabled
     */
    public void verifySearchButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.searchButton(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(ObjectionPageObjects.searchButton()));

    }

    /**
     * Enter a value to search input field
     */
    public void enterSearchValueInputField(String searchValue) throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.searchValueInputField(), 40);
        Browser.setText(MOHLandBookingJourneyPageObjects.searchValueInputField(), searchValue);
    }

    /**
     * Validate the search value result is displayed
     */
    public void verifyTheSearchValueResultIsDisplayed(Map<String, String> data) throws Exception {
        if (TestConfigManager.getSettingsApplicationLanguage().contains("en")) {
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.searchValueResult(data.get("Status_EN")), 40);
            logger.addScreenshot("");
            Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.searchValueResult(data.get("Status_EN"))));
        } else if (TestConfigManager.getSettingsApplicationLanguage().contains("ar")) {
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.searchValueResult(data.get("Status_AR")), 40);
            logger.addScreenshot("");
            Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.searchValueResult(data.get("Status_AR"))));
        }

    }

    /**
     * Click on search value result
     */
    public void clickOnSearchValueResult(Map<String, String> data) throws Exception {
        if (TestConfigManager.getSettingsApplicationLanguage().contains("en")) {
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.searchValueResult(data.get("Status_EN")), 40);
            Browser.waitForSeconds(1);
            Browser.click(MOHLandBookingJourneyPageObjects.searchValueResult(data.get("Status_EN")));
        } else if (TestConfigManager.getSettingsApplicationLanguage().contains("ar")) {
            Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.searchValueResult(data.get("Status_AR")), 40);
            Browser.waitForSeconds(1);
            Browser.click(MOHLandBookingJourneyPageObjects.searchValueResult(data.get("Status_AR")));
        }
    }

    /**
     * Click on request cancel dropdown button
     */
    public void clickOnRequestCancelDropdownButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.requestCancelDropdownButton(), 40);
        Browser.executeJSScroll(1000);
        Browser.waitForSeconds(2);
        Browser.click(MOHLandBookingJourneyPageObjects.requestCancelDropdownButton());
    }

    /**
     * Validate the request cancel details is displayed
     */
    public void verifyTheRequestCancelDetailsIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.requestCancelDetails(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.requestCancelDetails()));
    }

    /**
     * Validate the reject/approve cancel booking popup / building permit is displayed
     */
    public void verifyTheRejectCancelBookingPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.rejectCancelBookingPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.rejectCancelBookingPopup()));
    }

    /**
     * Enter reject cancel booking textarea
     */
    public void enterRejectCancelBookingTextarea(String rejectReason) throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.rejectCancelBookingTextarea(), 40);
        Browser.setText(MOHLandBookingJourneyPageObjects.rejectCancelBookingTextarea(), rejectReason);
    }

    /**
     * Click on approve button
     */
    public void clickOnApproveButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.approveButton(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.approveButton());
    }

    /**
     * Click cancelled nav button
     */
    public void clickOnCancelledNavButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelledNavButton(), 40);
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.cancelledNavButton(), 20);
        Browser.click(MOHLandBookingJourneyPageObjects.cancelledNavButton());
    }

    /**
     * Validate the cancelled bookings list is displayed
     */
    public void verifyTheCancelledBookingsListIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.cancelledBookingsList(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.cancelledBookingsList()));
    }

    /**
     * Get the plot code
     */

    public void getPlotCode() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.plotCode(), 40);
        String plotCode = Browser.getText(MOHLandBookingJourneyPageObjects.plotCode()).replaceAll(" ", "");
        TestDataManager.addDependantGlobalTestData("LandMOH", "PlotCode", plotCode);
        TestDataManager.writeDependantGlobalTestData("LandMOH");
    }

    /**
     * Click view cancelled booking button
     */
    public void clickOnViewCancelledBookingButton(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("LandMOH"));
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.viewCancelledBookingButton(data.get("PlotCode")), 40);
        Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.viewCancelledBookingButton(data.get("PlotCode")), 20);
        Browser.click(MOHLandBookingJourneyPageObjects.viewCancelledBookingButton(data.get("PlotCode")));
    }

}

