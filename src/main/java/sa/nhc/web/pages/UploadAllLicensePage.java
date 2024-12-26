package sa.nhc.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.MOHLandBookingJourneyPageObjects;
import sa.nhc.web.objects.UploadAllLicensePageObject;

import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;

public class UploadAllLicensePage {

    /**
     * Click on upload building permit button
     */
    public void clickOnUploadBuildingPermitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.uploadBuildingPermitButton(), 40);
        Browser.moveToElement(UploadAllLicensePageObject.uploadBuildingPermitButton());
        Browser.click(UploadAllLicensePageObject.uploadBuildingPermitButton());
    }

    /**
     * Validate the building permit page is displayed
     */
    public void verifyBuildingPermitIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.buildingPermitPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(UploadAllLicensePageObject.buildingPermitPage()));
    }

    /**
     * Validate are you sure popup is displayed
     */
    public void verifyAreYouSurePopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.areYouSurePopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(UploadAllLicensePageObject.areYouSurePopup()));
    }

    /**
     * Click on x delete button
     */
    public void clickOnXDeleteButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup(), 40);
        Browser.click(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup());
    }

    /**
     * Validate the building permit file is deleted
     */
    public void verifyTheBuildingPermitFileIsDeleted() throws Exception {
        Browser.waitUntilInvisibilityOfElement(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup()));
    }

    /**
     * Enter building permit number input filed
     */
    public void enterBuildingPermitNumberInputFiled(String buildingPermitNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.buildingPermitNumberInputField(), 40);
        Browser.setText(UploadAllLicensePageObject.buildingPermitNumberInputField(), buildingPermitNumber);
    }

    /**
     * Enter building permit date input filed
     */
    public void enterBuildingPermitDateInputFiled(String buildingPermitDate) throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.buildingPermitDateInputField(), 40);
        Browser.setText(UploadAllLicensePageObject.buildingPermitDateInputField(), buildingPermitDate);
        WebElement EnterOption = driver.findElement(UploadAllLicensePageObject.buildingPermitDateInputField());
        EnterOption.sendKeys(Keys.ENTER);
    }

    /**
     * Click on calender icon button
     */
    public void clickOnCalenderIconButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.calenderIconButton(), 40);
        Browser.click(UploadAllLicensePageObject.calenderIconButton());
    }

    /**
     * Validate the date picker is displayed
     */
    public void verifyTheDatePickerIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.datePicker(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(UploadAllLicensePageObject.datePicker()));
    }

    /**
     * Click on view building permit icon button
     */
    public void clickOnViewBuildingPermitIconButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.viewBuildingPermitIconButton(), 40);
        Browser.moveToElement(UploadAllLicensePageObject.viewBuildingPermitIconButton());
        Browser.click(UploadAllLicensePageObject.viewBuildingPermitIconButton());
    }

    /**
     * Validate the building permit is visible
     */
    public void verifyTheBuildingPermitIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup(), 40);
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(MOHLandBookingJourneyPageObjects.xButtonOfViewIconPopup()));

    }

    /**
     * Click on cancel popup button
     */
    public void clickOnCancelPopupButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.cancelPopupButton(), 40);
        Browser.moveToElement(UploadAllLicensePageObject.cancelPopupButton());
        Browser.click(UploadAllLicensePageObject.cancelPopupButton());
    }

    /**
     * Validate the successful building permit page is displayed
     */
    public void verifySuccessfulBuildingPermitIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.successPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(UploadAllLicensePageObject.successPage()));
    }

    /**
     * Click on building permit dropdown button
     */
    public void clickOnBuildingPermitDropdownButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.buildingPermitDropdownButton(), 40);
        Browser.executeJSScroll(1000);
        Browser.waitForSeconds(2);
        Browser.click(UploadAllLicensePageObject.buildingPermitDropdownButton());
    }

    /**
     * Validate the building permit details is displayed
     */
    public void verifyTheBuildingPermitDetailsIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.buildingPermitDetails(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(UploadAllLicensePageObject.buildingPermitDetails()));
    }

    /**
     * Click on download button
     */
    public void clickOnDownloadButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.downloadButton(), 40);
        Browser.click(UploadAllLicensePageObject.downloadButton());
    }

    /**
     * Click on construction completion certificate button
     */
    public void clickOnConstructionCompletionCertificateButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.constructionCompletionCertificateButton(), 40);
        Browser.moveToElement(UploadAllLicensePageObject.constructionCompletionCertificateButton());
        Browser.click(UploadAllLicensePageObject.constructionCompletionCertificateButton());
    }

    /**
     * Enter certificate number input filed
     */
    public void enterCertificateNumberInputFiled(String certificateNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.certificateNumberInputField(), 40);
        Browser.setText(UploadAllLicensePageObject.certificateNumberInputField(), certificateNumber);
    }

    /**
     * Enter certificate date input filed
     */
    public void enterCertificateDateInputFiled(String certificateDate) throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.certificateDateInputField(), 40);
        Browser.setText(UploadAllLicensePageObject.certificateDateInputField(), certificateDate);
        WebElement EnterOption = driver.findElement(UploadAllLicensePageObject.certificateDateInputField());
        EnterOption.sendKeys(Keys.ENTER);
    }

    /**
     * Click on construction completion dropdown button
     */
    public void clickOnConstructionCompletionDropdownButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UploadAllLicensePageObject.constructionCompletionDropdownButton(), 40);
        Browser.executeJSScroll(1000);
        Browser.waitForSeconds(2);
        Browser.click(UploadAllLicensePageObject.constructionCompletionDropdownButton());
    }

}
