package sa.nhc.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.EligibilityPageObject;
import sa.nhc.web.objects.ObjectionPageObjects;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.objects.exisitng.LoginPageObjects;

import java.util.List;

import static com.testcrew.web.Browser.logger;

public class ObjectionPage {
    /**
     * Validate appeal button is displayed
     */
    public void verifyTheAppealButtonIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealButton(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.appealButton()));
    }
    /**
     * Click on request appeal button
     */
    public void clickRequestAppealButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requestAppealButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.requestAppealButton());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.requestAppealButton(),40);
        Browser.click(ObjectionPageObjects.requestAppealButton());
    }
    /**
     * Validate the appeal submission page is displayed
     */
    public void verifyTheAppealSubmissionPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealSubmissionPage(), 40);
        Browser.moveToElement(ObjectionPageObjects.appealSubmissionPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.appealSubmissionPage()));
    }
    /**
     * Click on cancel button
     */
    public void clickCancelButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.cancelButtonOfPopup(), 40);
        Browser.moveToElement(LoginPageObjects.cancelButtonOfPopup());
        Browser.click(LoginPageObjects.cancelButtonOfPopup());
    }
    /**
     * Validate marketplace page is displayed
     */
    public void verifyMarketPlacePageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.iconProfile(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.iconProfile()));
    }
    /**
     * Click on continue button
     */
    public void clickContinueButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.continueButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.continueButton());
        Browser.click(ObjectionPageObjects.continueButton());
    }
    /**
     * Enter text on comments textarea
     */
    public void enterComments(String comments) throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.commentsTextarea(), 40);
        Browser.moveToElement(ObjectionPageObjects.commentsTextarea());
        Browser.setText(ObjectionPageObjects.commentsTextarea(), comments);
    }
    /**
     * Validate upload files page is displayed
     */
    public void verifyUploadFilesPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.uploadFilesPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.uploadFilesPage()));
    }
    /**
     * Validate the file is uploaded
     */
    public void checkTheFileIsUploaded(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(element), "The file is not uploaded");
    }
    /**
     * Click on delete icon button
     */
    public void clickDeleteIconButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.deleteIconButton(), 40);
        Browser.waitForSeconds(1);
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.deleteIconButton(), 40);
        Browser.click(ObjectionPageObjects.deleteIconButton());
    }
    /**
     * Validate the file is deleted
     */
    public void checkTheFileIsDeleted(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(element), "The file is not deleted");
    }
    /**
     * Hover to side main menu
     */
    public void hoverToMainMenu() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.Hover(), 50);
        Browser.moveToElement(CommonUtilityPageObjects.Hover());
    }
    /**
     * Click on appeals button from the menu
     */
    public void clickOnAppealsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealsButton(), 40);
        Browser.click(ObjectionPageObjects.appealsButton());
    }
    /**
     * Validate the required field message
     */
    public void verifyTheRequiredFieldMsg(By element) throws Exception {
       logger.addScreenshot("");
       Assert.assertTrue(Browser.isElementPresent(element));
    }
    /**
     * Validate the appeals button is displayed from the menu
     */
    public void verifyTheAppealsButtonIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealsButton(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.appealsButton()));
    }
    /**
     * Validate the appeals page is displayed
     */
    public void verifyTheAppealsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealsPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.appealsPage()));
    }
    /**
     * Click on assigned to me nav button
     */
    public void clickOnAssignedToMeNavButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.assignedToMeNavButton(), 40);
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.assignedToMeNavButton(), 40);
        Browser.click(ObjectionPageObjects.assignedToMeNavButton());
    }
    /**
     * Click on assigned to my team nav button
     */
    public void clickOnAssignedToMyTeamNavButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.assignedToMyTeamNavButton(), 40);
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.assignedToMyTeamNavButton(), 40);
        Browser.click(ObjectionPageObjects.assignedToMeNavButton());
    }
    /**
     * Enter text in beneficiary id input field
     */
    public void enterBeneficiaryID(String beneID) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 40);
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.beneficiaryIDInputText(), 40);
        Browser.moveToElement(ObjectionPageObjects.beneficiaryIDInputText());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.beneficiaryIDInputText(),40);
        Browser.waitForSeconds(1);
        Browser.setText(ObjectionPageObjects.beneficiaryIDInputText(), beneID);
    }
    /**
     * Click on search button
     */
    public void clickSearchButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.searchButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.searchButton());
        Browser.click(ObjectionPageObjects.searchButton());
    }
    /**
     * Validate the beneficiary id is the same as entered
     */
    public void verifyBeneficiaryIsSameAsEntered(String id, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String beneId = Browser.getWebElement(element).getText();
        Browser.waitForSeconds(2);
        Assert.assertTrue(beneId.contains(id), "The beneficiary Id is not the same");
    }
    /**
     * Click on the searched result of user id
     */
    public void clickOnTheSearchedUserId() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.searchedUserResult(), 40);
        Browser.moveToElement(ObjectionPageObjects.searchedUserResult());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.searchedUserResult(),40);
        Browser.click(ObjectionPageObjects.searchedUserResult());
    }
    /**
     * Click on reassign appeal button
     */
    public void clickOnReassignAppealButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.reassignAppealButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.reassignAppealButton());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.reassignAppealButton(),40);
        Browser.waitForSeconds(1);
        Browser.click(ObjectionPageObjects.reassignAppealButton());
    }
    /**
     * Validate reassign appeal popup window is displayed
     */
    public void verifyReassignAppealPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.reassignAppealPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.reassignAppealPopup()));
    }
    /**
     * Click on close button
     */
    public void clickOnCloseButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.closeButton(), 40);
        Browser.click(ObjectionPageObjects.closeButton());
    }
    /**
     * Validate beneficiary details page is displayed
     */
    public void verifyBeneficiaryDetailsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.beneficiaryDetailsPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.beneficiaryDetailsPage()));
    }
    /**
     * Validate reassign appeal  button of the popup window is disabled
     */
    public void verifyReassignAppealButtonOfPopupIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.reassignAppealButtonOfPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(ObjectionPageObjects.reassignAppealButtonOfPopup()));
    }
    /**
     * Validate user dropdown list is not displayed
     */
    public void verifyUserDropdownListIsNotVisible() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(ObjectionPageObjects.userDropdownList()));
    }
    /**
     * Validate confirm reassignment popup window is displayed
     */
    public void verifyConfirmReassignmentPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.confirmReassignmentPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.confirmReassignmentPopup()));
    }
    /**
     * Click on reassign appeal button of popup window
     */
    public void clickOnReassignAppealOfPopupButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.reassignAppealButtonOfPopup(), 40);
        Browser.moveToElement(ObjectionPageObjects.reassignAppealButtonOfPopup());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.reassignAppealButtonOfPopup(),40);
        Browser.click(ObjectionPageObjects.reassignAppealButtonOfPopup());
    }
    /**
     * Validate appeal reassigned popup window is displayed
     */
    public void verifyAppealReassignedPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealReassignedPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.appealReassignedPopup()));
    }
    /**
     * Validate submit appeal request button is disabled
     */
    public void verifySubmitAppealRequestButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.submitTheAppealRequestButton(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(ObjectionPageObjects.submitTheAppealRequestButton()));
    }
    /**
     * Click on submit the appeal request button
     */
    public void clickOnSubmitTheAppealRequestButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.submitTheAppealRequestButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.submitTheAppealRequestButton());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.submitTheAppealRequestButton(),40);
        Browser.click(ObjectionPageObjects.submitTheAppealRequestButton());
    }
    /**
     * Enter text in comments textarea of the popup window
     */
    public void enterCommentsOfPopup(String comments) throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.commentTextareaOfPopup(), 40);
        Browser.setText(ObjectionPageObjects.commentTextareaOfPopup(), comments);
    }
    /**
     * Click on close button of the popup window
     */
    public void clickOnCloseOfPopup() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.closeButtonOfPopup(), 40);
        Browser.moveToElement(ObjectionPageObjects.closeButtonOfPopup());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.closeButtonOfPopup(),40);
        Browser.click(ObjectionPageObjects.closeButtonOfPopup());
    }
    /**
     * Click on required documents button
     */
    public void clickOnRequiredDocumentsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requiredDocumentsButton(), 40);
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerIconAdminLoginPage(),40);
        Browser.moveToElement(ObjectionPageObjects.requiredDocumentsButton());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.requiredDocumentsButton(),40);
        Browser.click(ObjectionPageObjects.requiredDocumentsButton());
    }
    /**
     * Validate required documents popup window is displayed
     */
    public void verifyRequiredDocumentsPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requiredDocumentsPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.requiredDocumentsPopup()));
    }
    /**
     * Validate required documents dropdown list is not displayed
     */
    public void verifyRequiredDocumentsDropdownListIsNotVisible() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(ObjectionPageObjects.requiredDocumentsDropdownList()));
    }
    /**
     * Validate add and continue button is disabled
     */
    public void verifyAddAndContinueButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.addAndContinueButton(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(ObjectionPageObjects.addAndContinueButton()));
    }
    /**
     * Click on add and continue button
     */
    public void clickAddAndContinueButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.addAndContinueButton(), 40);
        Browser.click(ObjectionPageObjects.addAndContinueButton());
    }
    /**
     * Select required documents from the lists
     */
    public void selectRequiredDocumentsFromTheLists(String optionAR, String optionEN, By element) throws Exception {
        Browser.waitUntilVisibilityOfElement(element, 30);
        Browser.waitUntilElementToBeClickable(element, 20);
        Browser.click(element);

        List<WebElement> selectList = Browser.getWebElements(ObjectionPageObjects.requiredDocumentsSelected());
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(optionAR) || getListName.contains(optionEN)) {
                listName.click();
                break;
            }
        }
    }
    /**
     * Click on delete trash icon button
     */
    public void clickOnDeleteTrashIconButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.deleteTrashIconButton(), 40);
        Browser.click(ObjectionPageObjects.deleteTrashIconButton());
    }
    /**
     * Validate delete trash button is not displayed
     */
    public void verifyDeleteTrashIconButtonIsNotVisible() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(ObjectionPageObjects.requiredDocumentsDropdownList()));
    }
    /**
     * Validate required documents sent popup window is displayed
     */
    public void verifyRequireDocumentsSentPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requireDocumentsSentPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.requireDocumentsSentPopup()));
    }
    /**
     * Validate submit appeal request button is disabled
     */
    public void clickAppealNeedDocumentsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealNeedDocumentsButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.appealNeedDocumentsButton());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.appealNeedDocumentsButton(),40);
        Browser.click(ObjectionPageObjects.appealNeedDocumentsButton());
    }
    /**
     * Validate missing required documents page is displayed
     */
    public void verifyMissingRequiredDocumentsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.missingRequiredDocumentsPage(), 40);
        Browser.moveToElement(ObjectionPageObjects.missingRequiredDocumentsPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.missingRequiredDocumentsPage()));
    }
    /**
     * Click on submit button
     */
    public void clickSubmitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.submitButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.submitButton());
        Browser.click(ObjectionPageObjects.submitButton());
    }
    /**
     * Click on reject button
     */
    public void clickOnRejectButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.rejectButton(), 40);
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerIconAdminLoginPage(),40);
        Browser.moveToElement(ObjectionPageObjects.rejectButton());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.rejectButton(),40);
        Browser.click(ObjectionPageObjects.rejectButton());
    }
    /**
     * Click on accept button
     */
    public void clickOnAcceptButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.acceptButton(), 40);
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerIconAdminLoginPage(),40);
        Browser.moveToElement(ObjectionPageObjects.acceptButton());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.acceptButton(),40);
        Browser.click(ObjectionPageObjects.acceptButton());
    }
    /**
     * Validate reject reason popup window is displayed
     */
    public void verifyRejectReasonPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.rejectReasonPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.rejectReasonPopup()));
    }
    /**
     * Validate explanation textarea is not displayed
     */
    public void verifyExplanationTextareaIsNotVisible() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(ObjectionPageObjects.explanationTextarea()));
    }
    /**
     * Select reject reason lists
     */
    public void selectRejectReasonLists() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.reasonDropdownList(), 30);
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.reasonDropdownList(), 20);
        Browser.click(ObjectionPageObjects.reasonDropdownList());
        Browser.waitUntilElementToBeClickable(EligibilityPageObject.optionListSelected(), 20);
        Browser.click(EligibilityPageObject.optionListSelected());
    }
    /**
     * Enter text in explanation textarea of the popup window
     */
    public void enterExplanationOfPopup(String comments) throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.explanationTextarea(), 40);
        Browser.setText(ObjectionPageObjects.explanationTextarea(), comments);
    }
    /**
     * Validate rejected appeal popup window is displayed
     */
    public void verifyRejectedAppealPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.rejectedAppealPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.rejectedAppealPopup()));
    }
    /**
     * Validate confirm acception popup window is displayed
     */
    public void verifyConfirmAcceptionPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.confirmAcceptionPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.confirmAcceptionPopup()));
    }
    /**
     * Validate accepted appeal popup window is displayed
     */
    public void verifyAcceptedAppealPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.acceptedAppealPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.acceptedAppealPopup()));
    }
    /**
     * Click on request addition documents button
     */
    public void clickOnRequestAdditionDocumentsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requestAdditionDocumentsButton(), 40);
        Browser.click(ObjectionPageObjects.requestAdditionDocumentsButton());
    }

}
