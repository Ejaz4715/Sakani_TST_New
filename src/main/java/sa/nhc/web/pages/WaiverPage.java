package sa.nhc.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.nhc.web.objects.WaiverPageObject;

import static com.testcrew.web.Browser.logger;

public class WaiverPage {

    /**
     * Click on eligibility waiver div button
     */
    public void clickOnEligibilityWaiverDivButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.eligibilityWaiverDivButton(), 40);
        Browser.moveToElement(WaiverPageObject.eligibilityWaiverDivButton());
        Browser.click(WaiverPageObject.eligibilityWaiverDivButton());
    }

    /**
     * Validate the eligibility waiver page is displayed
     */
    public void verifyEligibilityWaiverPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.eligibilityWaiverPage(), 40);
        Browser.moveToElement(WaiverPageObject.eligibilityWaiverPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(WaiverPageObject.eligibilityWaiverPage()));
    }

    /**
     * Click on waiver of eligibility button
     */
    public void clickOnWaiverOfEligibilityButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.waiverOfEligibilityButton(), 40);
        Browser.moveToElement(WaiverPageObject.waiverOfEligibilityButton());
        Browser.click(WaiverPageObject.waiverOfEligibilityButton());
    }

    /**
     * Validate select family member page is displayed
     */
    public void verifySelectFamilyMemberPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.selectFamilyMemberPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(WaiverPageObject.selectFamilyMemberPage()));
    }

    /**
     * Validate the dashboard page is displayed
     */
    public void verifyTheDashboardPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.dashboardPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(WaiverPageObject.dashboardPage()));
    }

    /**
     * Validate the confirm button is disabled
     */
    public void verifyTheConfirmButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.confirmButton(), 40);
        Browser.moveToElement(WaiverPageObject.confirmButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(WaiverPageObject.confirmButton()));
    }

    /**
     * Validate the confirm button is enabled
     */
    public void verifyTheConfirmButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.confirmButton(), 40);
        Browser.moveToElement(WaiverPageObject.confirmButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(WaiverPageObject.confirmButton()));
    }

    /**
     * Select family member radio button
     */
    public void selectFamilyMemberRadioButton(String familyMember) throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.familyMemberRadioButton(familyMember), 40);
        Browser.moveToElement(WaiverPageObject.familyMemberRadioButton(familyMember));
        Browser.click(WaiverPageObject.familyMemberRadioButton(familyMember));
    }

    /**
     * Click on confirm button
     */
    public void clickOnConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.confirmButton(), 40);
        Browser.moveToElement(WaiverPageObject.confirmButton());
        Browser.click(WaiverPageObject.confirmButton());
    }

    /**
     * Click on agree terms and conditions checkbox
     */
    public void clickOnAgreeTermsAndConditionsCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.agreeTermsAndConditionsCheckbox(), 40);
        Browser.moveToElement(WaiverPageObject.agreeTermsAndConditionsCheckbox());
        Browser.click(WaiverPageObject.agreeTermsAndConditionsCheckbox());
    }

    /**
     * Validate the declaration page is displayed
     */
    public void verifyTheDeclarationPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(WaiverPageObject.agreeTermsAndConditionsCheckbox(), 40);
        Browser.moveToElement(WaiverPageObject.agreeTermsAndConditionsCheckbox());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(WaiverPageObject.agreeTermsAndConditionsCheckbox()));
    }

}
