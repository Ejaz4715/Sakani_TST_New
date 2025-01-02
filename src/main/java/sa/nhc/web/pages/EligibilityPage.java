package sa.nhc.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sa.nhc.web.objects.EligibilityPageObject;
import sa.nhc.web.objects.MOHLandBookingJourneyPageObjects;
import sa.nhc.web.objects.exisitng.BookingPageObjects;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.objects.exisitng.LoginPageObjects;

import java.util.List;

import static com.testcrew.web.Browser.*;


public class EligibilityPage {

    /**
     * Hover on the profile icon
     */
    public void hoverToUserIconProfile() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.ErrorToastMessage(), 40);
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.ErrorToastMessage(), 40);
        Browser.waitUntilInvisibilityOfElement(By.xpath("//span[contains (@class, 'loader')]"), 40);
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.iconProfile(), 40);
        logger.addScreenshot("");
        Browser.moveToElement(EligibilityPageObject.iconProfile());
    }

    /**
     * Click on my profile text button
     */
    public void clickOnMyProfileButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(By.xpath("//span[contains (@class, 'loader')]"), 40);
        Browser.waitUntilPresenceOfElement(EligibilityPageObject.myProfileButton(), 40);
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.myProfileButton(), 40);
        Browser.moveToElement(EligibilityPageObject.myProfileButton());
        Browser.waitUntilElementToBeClickable(EligibilityPageObject.myProfileButton(), 40);
        Browser.click(EligibilityPageObject.myProfileButton());
    }

    /**
     * Click on check eligibility text button from profile
     */
    public void clickOnCheckEligibilityButtonFromProfile() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityFromProfile(), 40);
        Browser.waitUntilElementToBeClickable(EligibilityPageObject.checkEligibilityFromProfile(), 40);
        Browser.click(EligibilityPageObject.checkEligibilityFromProfile());
    }

    /**
     * Validate the user not yet checked the eligibility
     */
    public void verifyTheUserHaveNotCheckedEligibilityYet(String expectedEn, String expectedAr) throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.notCheckEligibilityYetText(), 40);
        logger.addScreenshot("");
        String actual = Browser.getText(EligibilityPageObject.notCheckEligibilityYetText());
        Assert.assertTrue((actual.contains(expectedAr)) || actual.contains(expectedEn), "The text message is different");
    }

    /**
     * Hover on services tab menu
     */
    public void hoverToServices() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.servicesDropdown(), 40);
        logger.addScreenshot("");
        Browser.moveToElement(EligibilityPageObject.servicesDropdown());
    }

    /**
     * Validate the services page is displayed
     */
    public void verifyTheServicesIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityNavTitle(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.checkEligibilityNavTitle()));
    }

    /**
     * CLick on check eligibility nat title
     */
    public void clickOnCheckEligibilityNavTitle() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityNavTitle(), 40);
        Browser.click(EligibilityPageObject.checkEligibilityNavTitle());
    }

    /**
     * Validate check eligibility intro page is displayed
     */
    public void verifyCheckEligibilityIntroPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityIntroPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.checkEligibilityIntroPage()));
    }

    /**
     * Click on check eligibility button
     */
    public void clickOnCheckEligibilityButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityButton(), 40);
        Browser.click(EligibilityPageObject.checkEligibilityButton());
    }

    /**
     * Validate check eligibility steps page is displayed
     */
    public void verifyCheckEligibilityStepsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityStepsPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.checkEligibilityStepsPage()));
    }

    /**
     * Validate agree on terms and conditions button is disabled
     */
    public void verifyAgreeOnTermsAndConditionsButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.agreeOnTermsAndConditionsButton(), 40);
        Browser.moveToElement(EligibilityPageObject.agreeOnTermsAndConditionsButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(EligibilityPageObject.agreeOnTermsAndConditionsButton()));
    }

    /**
     * Click on agree on terms and conditions checkbox
     */
    public void clickOnAgreeOnTermsAndConditionsCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.agreeOnTermsAndConditionsCheckbox(), 40);
        Browser.moveToElement(EligibilityPageObject.agreeOnTermsAndConditionsCheckbox());
        Browser.click(EligibilityPageObject.agreeOnTermsAndConditionsCheckbox());
    }

    /**
     * Validate agree on terms and conditions button is enabled
     */
    public void verifyAgreeOnTermsAndConditionsButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.agreeOnTermsAndConditionsButton(), 40);
        Browser.moveToElement(EligibilityPageObject.agreeOnTermsAndConditionsButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(EligibilityPageObject.agreeOnTermsAndConditionsButton()));
    }

    /**
     * Validate acknowledgements step page is displayed
     */
    public void verifyAcknowledgmentStepPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.acknowledgementStepPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.acknowledgementStepPage()));
    }

    /**
     * Click on radio buttons
     */
    public void clickRadioButtons(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        List<WebElement> radioButtons = Browser.driver.findElements(element);
        Browser.executeJSScroll(-1200);
        Browser.waitForSeconds(2);
        for (WebElement radio : radioButtons) {
            Browser.executeJSScroll(100);
            Browser.waitForSeconds(1);
            Browser.waitUntilElementToBeClickable(element, 50);
            radio.click();
        }
    }

    /**
     * Click on yes radio button
     */
    public void clickOnYesRadioButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.yesRadioButton(), 40);
        Browser.moveToElement(EligibilityPageObject.yesRadioButton());
        Browser.click(EligibilityPageObject.yesRadioButton());
    }

    /**
     * Click on no radio button
     */
    public void clickOnNoRadioButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.noRadioButton(), 40);
        ;
        Browser.executeJSScroll(-1200);
        Browser.waitForSeconds(2);
        for (int i = 0; i < 2; i++) {
            Browser.executeJSScroll(100);
            Browser.waitForSeconds(1);
            Browser.waitUntilElementToBeClickable(EligibilityPageObject.noRadioButton(), 50);
            Browser.click(EligibilityPageObject.noRadioButton());
        }
    }

    /**
     * Click on agree on terms and conditions button
     */
    public void clickOnAgreeOnTermsAndConditionsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.agreeOnTermsAndConditionsButton(), 40);
        Browser.moveToElement(EligibilityPageObject.agreeOnTermsAndConditionsButton());
        Browser.click(EligibilityPageObject.agreeOnTermsAndConditionsButton());
    }

    /**
     * Click on continue to confirmation acknowledge button
     */
    public void clickOnContinueToConfirmAcknowledgeButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.continueToConfirmAcknowledgeButton(), 40);
        Browser.executeJSScrollIntoView(EligibilityPageObject.continueToConfirmAcknowledgeButton());
        Browser.waitUntilElementToBeClickable(EligibilityPageObject.continueToConfirmAcknowledgeButton(),50);
        Browser.click(EligibilityPageObject.continueToConfirmAcknowledgeButton());
    }

    /**
     * Validate verify information page is displayed
     */
    public void verifyTheVerifyInformationPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.verifyInformationStepPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.verifyInformationStepPage()));
    }

    /**
     * Click on back button
     */
    public void clickOnBackButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.backButton(), 40);
        Browser.moveToElement(EligibilityPageObject.backButton());
        Browser.click(EligibilityPageObject.backButton());
    }

    /**
     * Click on confirm button
     */
    public void clickOnConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.confirmButton(), 40);
        Browser.moveToElement(EligibilityPageObject.confirmButton());
        Browser.click(EligibilityPageObject.confirmButton());
    }

    /**
     * Validate current city dropdown list is disabled
     */
    public void verifyCurrentCityDropdownListIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.currentCityDropdownList(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(EligibilityPageObject.currentCityDropdownList()));
    }

    /**
     * Validate preferred city dropdown list is disabled
     */
    public void verifyPreferredCityDropdownListIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.preferredCityDropdownList(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(EligibilityPageObject.preferredCityDropdownList()));
    }

    /**
     * Select from the lists
     */
    public void selectFromTheLists(String optionAR, String optionEN, By element) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 50);

        Browser.waitUntilVisibilityOfElement(element, 30);
        Browser.moveToElement(element);
        Browser.waitUntilElementToBeClickable(element, 20);
        Browser.click(element);

        List<WebElement> selectList = Browser.getWebElements(EligibilityPageObject.optionListSelected());
        Browser.moveToElement(EligibilityPageObject.optionListSelected());
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(optionAR) || getListName.contains(optionEN)) {
                listName.click();
                break;
            }
        }

    }

    /**
     * Select deed type dropdown list
     */
    public void selectDeedType(String optionAR, String optionEN, By element, String option1AR, String option1EN, By element2) throws Exception {
        List<WebElement> deedList = Browser.driver.findElements(element);
        for (WebElement list : deedList) {
            Browser.waitUntilElementToBeClickable(element, 50);
//            Browser.executeJSScroll(600);
//            Browser.waitForSeconds(1);
            Actions actions = new Actions(driver);
            actions.moveToElement(list).pause(500L);
            Browser.waitForSeconds(1);
            list.click();
            List<WebElement> ddl = Browser.getWebElements(EligibilityPageObject.optionListSelected());
            for (WebElement listName : ddl) {
                String getListName = listName.getText();
                if (getListName.contains(optionAR) || getListName.contains(optionEN)) {
                    listName.click();
                    break;
                }
            }
        }
        List<WebElement> deedListStatus = Browser.getWebElements(element2);
        for (WebElement list : deedListStatus) {
            Browser.waitUntilElementToBeClickable(element2, 50);
            list.click();
            List<WebElement> ddl = Browser.getWebElements(EligibilityPageObject.optionListSelected());
            for (WebElement listName : ddl) {
                String getListName = listName.getText();
                if (getListName.contains(option1AR) || getListName.contains(option1EN)) {
                    listName.click();
                    break;
                }
            }
        }
    }

    /**
     * Click on cancel to close window of survey
     */
    public void closeWindowOfSurvey() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.cancelButtonOfPopup(), 40);
        if (Browser.isElementPresent(LoginPageObjects.cancelButtonOfPopup())) {
            Browser.click(LoginPageObjects.cancelButtonOfPopup());
        }
    }

    /**
     * Validate the eligibility message
     */
    public void verifyTheEligibilityMessage(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        Browser.executeJSScroll(-500);
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
    }
}
