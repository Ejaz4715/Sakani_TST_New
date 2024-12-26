package sa.nhc.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.EligibilityPageObject;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.objects.exisitng.LoginPageObjects;

import java.util.List;

import static com.testcrew.web.Browser.*;


public class EligibilityPage {

    public void hoverToUserIconProfile() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.iconProfile(), 40);
        logger.addScreenshot("");
        Browser.moveToElement(EligibilityPageObject.iconProfile());
    }

    public void clickOnMyProfileButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.myProfileButton(), 40);
        Browser.waitUntilElementToBeClickable(EligibilityPageObject.myProfileButton(),40);
        Browser.click(EligibilityPageObject.myProfileButton());
    }

    public void verifyTheUserHaveNotCheckedEligibilityYet(String expectedEn, String expectedAr) throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.notCheckEligibilityYetText(), 40);
        logger.addScreenshot("");
        String actual = Browser.getText(EligibilityPageObject.notCheckEligibilityYetText());
        Assert.assertTrue((actual.contains(expectedAr)) || actual.contains(expectedEn), "The text message is different");
    }

    public void hoverToServices() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.servicesDropdown(), 40);
        logger.addScreenshot("");
        Browser.moveToElement(EligibilityPageObject.servicesDropdown());
    }

    public void verifyTheServicesIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityNavTitle(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.checkEligibilityNavTitle()));
    }

    public void clickOnCheckEligibilityNavTitle() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityNavTitle(), 40);
        Browser.click(EligibilityPageObject.checkEligibilityNavTitle());
    }

    public void verifyCheckEligibilityIntroPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityIntroPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.checkEligibilityIntroPage()));
    }

    public void clickOnCheckEligibilityButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityButton(), 40);
        Browser.click(EligibilityPageObject.checkEligibilityButton());
    }

    public void verifyCheckEligibilityStepsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.checkEligibilityStepsPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.checkEligibilityStepsPage()));
    }

    public void verifyAgreeOnTermsAndConditionsButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.agreeOnTermsAndConditionsButton(), 40);
        Browser.moveToElement(EligibilityPageObject.agreeOnTermsAndConditionsButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(EligibilityPageObject.agreeOnTermsAndConditionsButton()));
    }

    public void clickOnAgreeOnTermsAndConditionsCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.agreeOnTermsAndConditionsCheckbox(), 40);
        Browser.moveToElement(EligibilityPageObject.agreeOnTermsAndConditionsCheckbox());
        Browser.click(EligibilityPageObject.agreeOnTermsAndConditionsCheckbox());
    }

    public void verifyAgreeOnTermsAndConditionsButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.agreeOnTermsAndConditionsButton(), 40);
        Browser.moveToElement(EligibilityPageObject.agreeOnTermsAndConditionsButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(EligibilityPageObject.agreeOnTermsAndConditionsButton()));
    }

    public void verifyAcknowledgmentStepPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.acknowledgementStepPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.acknowledgementStepPage()));
    }

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

    public void clickOnYesRadioButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.yesRadioButton(), 40);
        Browser.moveToElement(EligibilityPageObject.yesRadioButton());
        Browser.click(EligibilityPageObject.yesRadioButton());
    }
    public void clickOnNoRadioButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.noRadioButton(), 40);
        Browser.executeJSScroll(-1200);
        Browser.waitForSeconds(2);
        for (int i = 0; i < 2; i++) {
            Browser.executeJSScroll(100);
            Browser.waitForSeconds(1);
            Browser.waitUntilElementToBeClickable(EligibilityPageObject.noRadioButton(), 50);
            Browser.click(EligibilityPageObject.noRadioButton());
        }
    }
    public void clickOnAgreeOnTermsAndConditionsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.agreeOnTermsAndConditionsButton(), 40);
        Browser.moveToElement(EligibilityPageObject.agreeOnTermsAndConditionsButton());
        Browser.click(EligibilityPageObject.agreeOnTermsAndConditionsButton());
    }

    public void clickOnContinueToConfirmAcknowledgeButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.continueToConfirmAcknowledgeButton(), 40);
        Browser.moveToElement(EligibilityPageObject.continueToConfirmAcknowledgeButton());
        Browser.click(EligibilityPageObject.continueToConfirmAcknowledgeButton());
    }

    public void verifyTheVerifyInformationPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.verifyInformationStepPage(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisplayed(EligibilityPageObject.verifyInformationStepPage()));
    }

    public void clickOnBackButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.backButton(), 40);
        Browser.moveToElement(EligibilityPageObject.backButton());
        Browser.click(EligibilityPageObject.backButton());
    }

    public void clickOnConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.confirmButton(), 40);
        Browser.moveToElement(EligibilityPageObject.confirmButton());
        Browser.click(EligibilityPageObject.confirmButton());
    }

    public void verifyCurrentCityDropdownListIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.currentCityDropdownList(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(EligibilityPageObject.currentCityDropdownList()));
    }

    public void verifyPreferredCityDropdownListIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(EligibilityPageObject.preferredCityDropdownList(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(EligibilityPageObject.preferredCityDropdownList()));
    }

    public void selectFromTheLists(String optionAR, String optionEN, By element) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 50);

        Browser.waitUntilVisibilityOfElement(element, 30);
        Browser.waitUntilElementToBeClickable(element,20);
        Browser.click(element);

        List<WebElement> selectList = Browser.getWebElements(EligibilityPageObject.optionListSelected());
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(optionAR) || getListName.contains(optionEN)) {
                listName.click();
                break;
            }
        }

    }


    public void selectDeedType(String optionAR, String optionEN, By element, String option1AR, String option1EN,By element2) throws Exception {
        List<WebElement> deedList = Browser.driver.findElements(element);
        for (WebElement list : deedList) {
            Browser.waitUntilElementToBeClickable(element, 50);
//            Browser.executeJSScroll(350);
//            Browser.waitForSeconds(1);
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
        List<WebElement> deedListStatus = Browser.driver.findElements(element2);
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
    public void closeWindowOfSurvey() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.cancelButtonOfPopup(),40);
        if (Browser.isElementPresent(LoginPageObjects.cancelButtonOfPopup())) {
            Browser.click(LoginPageObjects.cancelButtonOfPopup());
        }
    }
    public void verifyTheEligibilityMessage(By element) {
        Browser.waitUntilVisibilityOfElement(element,40);
        Browser.executeJSScroll(-500);
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
    }
}
