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
    public void verifyTheAppealButtonIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealButton(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.appealButton()));
    }

    public void clickRequestAppealButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requestAppealButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.requestAppealButton());
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.requestAppealButton(),40);
        Browser.click(ObjectionPageObjects.requestAppealButton());
    }

    public void verifyTheAppealSubmissionPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealSubmissionPage(), 40);
        Browser.moveToElement(ObjectionPageObjects.appealSubmissionPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.appealSubmissionPage()));
    }

    public void clickCancelButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.cancelButtonOfPopup(), 40);
        Browser.moveToElement(LoginPageObjects.cancelButtonOfPopup());
        Browser.click(LoginPageObjects.cancelButtonOfPopup());
    }

    public void verifyMarketPlacePageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.iconProfile(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.iconProfile()));
    }

    public void clickContinueButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.continueButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.continueButton());
        Browser.click(ObjectionPageObjects.continueButton());
    }

    public void enterComments(String comments) throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.commentsTextarea(), 40);
        Browser.moveToElement(ObjectionPageObjects.commentsTextarea());
        Browser.setText(ObjectionPageObjects.commentsTextarea(), comments);
    }

    public void verifyUploadFilesPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.uploadFilesPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.uploadFilesPage()));
    }

    public void checkTheFileIsUploaded(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(element), "The file is not uploaded");
    }

    public void clickDeleteIconButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.deleteIconButton(), 40);
        Browser.waitForSeconds(1);
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.deleteIconButton(), 40);
        Browser.click(ObjectionPageObjects.deleteIconButton());
    }

    public void checkTheFileIsDeleted(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(element), "The file is not deleted");
    }

    public void hoverToMainMenu() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.Hover(), 50);
        Browser.moveToElement(CommonUtilityPageObjects.Hover());
    }

    public void clickOnAppealsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealsButton(), 40);
        Browser.click(ObjectionPageObjects.appealsButton());
    }

    public void verifyTheRequiredFieldMsg(By element) throws Exception {
       logger.addScreenshot("");
       Assert.assertTrue(Browser.isElementPresent(element));
    }

    public void verifyTheAppealsButtonIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealsButton(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.appealsButton()));
    }

    public void verifyTheAppealsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealsPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.appealsPage()));
    }

    public void clickOnAssignedToMeNavButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.assignedToMeNavButton(), 40);
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.assignedToMeNavButton(), 40);
        Browser.click(ObjectionPageObjects.assignedToMeNavButton());
    }

    public void clickOnAssignedToMyTeamNavButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.assignedToMyTeamNavButton(), 40);
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.assignedToMyTeamNavButton(), 40);
        Browser.click(ObjectionPageObjects.assignedToMeNavButton());
    }

    public void enterBeneficiaryID(String beneID) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 40);
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.beneficiaryIDInputText(), 40);
        Browser.setText(ObjectionPageObjects.beneficiaryIDInputText(), beneID);
    }

    public void clickSearchButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.searchButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.searchButton());
        Browser.click(ObjectionPageObjects.searchButton());
    }

    public void verifyBeneficiaryIsSameAsEntered(String id, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String beneId = Browser.getWebElement(element).getText();
        Assert.assertTrue(beneId.contains(id), "The beneficiary Id is not the same");
    }

    public void clickOnTheSearchedUserId() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.searchedUserResult(), 40);
        Browser.click(ObjectionPageObjects.searchedUserResult());
    }

    public void clickOnReassignAppealButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.reassignAppealButton(), 40);
        Browser.click(ObjectionPageObjects.reassignAppealButton());
    }

    public void verifyReassignAppealPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.reassignAppealPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.reassignAppealPopup()));
    }

    public void clickOnCloseButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.closeButton(), 40);
        Browser.click(ObjectionPageObjects.closeButton());
    }

    public void verifyBeneficiaryDetailsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.beneficiaryDetailsPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.beneficiaryDetailsPage()));
    }

    public void verifyReassignAppealButtonOfPopupIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.reassignAppealButtonOfPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(ObjectionPageObjects.reassignAppealButtonOfPopup()));
    }

    public void verifyUserDropdownListIsNotVisible() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(ObjectionPageObjects.userDropdownList()));
    }

    public void verifyConfirmReassignmentPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.confirmReassignmentPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.confirmReassignmentPopup()));
    }

    public void clickOnReassignAppealOfPopupButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.reassignAppealButtonOfPopup(), 40);
        Browser.click(ObjectionPageObjects.reassignAppealButtonOfPopup());
    }

    public void verifyAppealReassignedPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealReassignedPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.appealReassignedPopup()));
    }

    public void verifySubmitAppealRequestButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.submitTheAppealRequestButton(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(ObjectionPageObjects.submitTheAppealRequestButton()));
    }

    public void clickOnSubmitTheAppealRequestButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.submitTheAppealRequestButton(), 40);
        Browser.click(ObjectionPageObjects.submitTheAppealRequestButton());
    }

    public void enterCommentsOfPopup(String comments) throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.commentTextareaOfPopup(), 40);
        Browser.setText(ObjectionPageObjects.commentTextareaOfPopup(), comments);
    }

    public void clickOnCloseOfPopup() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.closeButtonOfPopup(), 40);
        Browser.click(ObjectionPageObjects.closeButtonOfPopup());
    }

    public void clickOnRequiredDocumentsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requiredDocumentsButton(), 40);
        Browser.click(ObjectionPageObjects.requiredDocumentsButton());
    }

    public void verifyRequiredDocumentsPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requiredDocumentsPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.requiredDocumentsPopup()));
    }

    public void verifyRequiredDocumentsDropdownListIsNotVisible() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(ObjectionPageObjects.requiredDocumentsDropdownList()));
    }

    public void verifyAddAndContinueButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.addAndContinueButton(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(ObjectionPageObjects.addAndContinueButton()));
    }

    public void clickAddAndContinueButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.addAndContinueButton(), 40);
        Browser.click(ObjectionPageObjects.addAndContinueButton());
    }

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

    public void clickOnDeleteTrashIconButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.deleteTrashIconButton(), 40);
        Browser.click(ObjectionPageObjects.deleteTrashIconButton());
    }

    public void verifyDeleteTrashIconButtonIsNotVisible() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(ObjectionPageObjects.requiredDocumentsDropdownList()));
    }

    public void verifyRequireDocumentsSentPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requireDocumentsSentPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.requireDocumentsSentPopup()));
    }

    public void clickAppealNeedDocumentsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.appealNeedDocumentsButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.appealNeedDocumentsButton());
        Browser.click(ObjectionPageObjects.appealNeedDocumentsButton());
    }

    public void verifyMissingRequiredDocumentsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.missingRequiredDocumentsPage(), 40);
        Browser.moveToElement(ObjectionPageObjects.missingRequiredDocumentsPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.missingRequiredDocumentsPage()));
    }

    public void clickSubmitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.submitButton(), 40);
        Browser.moveToElement(ObjectionPageObjects.submitButton());
        Browser.click(ObjectionPageObjects.submitButton());
    }

    public void clickOnRejectButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.rejectButton(), 40);
        Browser.click(ObjectionPageObjects.rejectButton());
    }

    public void clickOnAcceptButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.acceptButton(), 40);
        Browser.click(ObjectionPageObjects.acceptButton());
    }

    public void verifyRejectReasonPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.rejectReasonPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.rejectReasonPopup()));
    }

    public void verifyExplanationTextareaIsNotVisible() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(ObjectionPageObjects.explanationTextarea()));
    }

    public void selectRejectReasonLists() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.reasonDropdownList(), 30);
        Browser.waitUntilElementToBeClickable(ObjectionPageObjects.reasonDropdownList(), 20);
        Browser.click(ObjectionPageObjects.reasonDropdownList());
        Browser.waitUntilElementToBeClickable(EligibilityPageObject.optionListSelected(), 20);
        Browser.click(EligibilityPageObject.optionListSelected());
    }

    public void enterExplanationOfPopup(String comments) throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.explanationTextarea(), 40);
        Browser.setText(ObjectionPageObjects.explanationTextarea(), comments);
    }

    public void verifyRejectedAppealPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.rejectedAppealPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.rejectedAppealPopup()));
    }

    public void verifyConfirmAcceptionPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.confirmAcceptionPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.confirmAcceptionPopup()));
    }

    public void verifyAcceptedAppealPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.acceptedAppealPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(ObjectionPageObjects.acceptedAppealPopup()));
    }

    public void clickOnRequestAdditionDocumentsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ObjectionPageObjects.requestAdditionDocumentsButton(), 40);
        Browser.click(ObjectionPageObjects.requestAdditionDocumentsButton());
    }

}
