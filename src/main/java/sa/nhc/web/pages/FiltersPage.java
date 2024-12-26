package sa.nhc.web.pages;

import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.*;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.List;

import static com.testcrew.web.Browser.*;

public class FiltersPage {

    /**
     * Click on buy button
     */
    public void clickOnBuyButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.buyButton(), 40);
        Browser.click(FiltersPageObjects.buyButton());
    }

    /**
     * Enter location
     */
    public void enterLocation(String locationAR, String locationEN) throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.locationInputFiled(), 40);
        if (TestConfigManager.getSettingsApplicationLanguage().contains("en")) {
            Browser.setText(FiltersPageObjects.locationInputFiled(), locationEN);
        } else {
            Browser.setText(FiltersPageObjects.locationInputFiled(), locationAR);
        }
    }

    /**
     * Validation of location is entered
     */
    public void verifyLocationIsEntered(String locationAR, String locationEN) throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.locationInputFiled(), 40);
        WebElement ele = Browser.getWebElement(FiltersPageObjects.locationInputFiled());
        String actualLocation = ele.getAttribute("value");
        logger.addScreenshot("Location is " + actualLocation);
        Assert.assertTrue(actualLocation.contains(locationEN) || actualLocation.contains(locationAR), "Actual location name is (" + actualLocation + ") and expected should be (" + locationEN + ") OR (" + locationAR + ")");
    }

    /**
     * Select the entered location
     */
    public void selectFromTheLists(String optionAR, String optionEN, By element) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 50);
        Browser.waitUntilVisibilityOfElement(element, 30);
        Browser.waitUntilElementToBeClickable(element, 50);
        List<WebElement> selectList = Browser.getWebElements(EligibilityPageObject.optionListSelected());
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(optionAR) || getListName.contains(optionEN)) {
                listName.click();
                break;
            }
        }
    }

    /**
     * Select the entered mega project \ project
     */
    public void selectFromTheList(String option, By element) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 50);
        Browser.waitUntilVisibilityOfElement(element, 30);
        Browser.waitUntilElementToBeClickable(element, 50);
        List<WebElement> selectList = Browser.getWebElements(EligibilityPageObject.optionListSelected());
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(option)) {
                listName.click();
                break;
            }
        }
    }

    /**
     * Enter mega project
     */
    public void enterMegaProject(String megaProject) throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.megaProjectInputFiled(), 40);
        Browser.setText(FiltersPageObjects.megaProjectInputFiled(), megaProject);
    }

    /**
     * Select all target audience
     */
    public void selectAllTargetAudience() throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 50);
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.targetAudienceButton(), 30);
        Browser.waitUntilElementToBeClickable(FiltersPageObjects.targetAudienceButton(), 50);
        List<WebElement> targetAudience = Browser.getWebElements(FiltersPageObjects.targetAudienceButton());
        for (WebElement button : targetAudience) {
            button.click();
            logger.addScreenshot("");
            button.isSelected();
        }
    }

    /**
     * Enter minimum price
     */
    public void enterMinimumPrice(String minimumPrice) throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.minimumPriceInputField(), 40);
        Browser.setText(FiltersPageObjects.minimumPriceInputField(), minimumPrice);
    }

    /**
     * Enter maximum price
     */
    public void enterMaximumPrice(String maximumPrice) throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.maximumPriceInputField(), 40);
        WebElement EnterOption = driver.findElement(FiltersPageObjects.maximumPriceInputField());
        EnterOption.sendKeys(Keys.BACK_SPACE);
        Browser.setText(FiltersPageObjects.maximumPriceInputField(), maximumPrice);
    }

    /**
     * Validation the maximum price is entered
     */
    public void verifyValueIsEntered(String value, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String ActualVal = Browser.getWebElement(element).getAttribute("value").replaceAll(",", "");
        logger.addScreenshot("");
        Assert.assertTrue(ActualVal.contains(value), "Actual value (" + ActualVal + ") and expected (" + value + ")");
    }

    /**
     * Validation the minimum / maximum price cannot be empty
     */
    public void verifyMinimumAndMaximumPriceCannotBeEmpty() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.minimumPriceInputField(), 40);
        WebElement EnterOption = driver.findElement(FiltersPageObjects.minimumPriceInputField());
        EnterOption.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        CommonUtilityPage.verifyValueIsDisplayed("لا يمكن أن يكون الحد الأدنى للسعر فارغًا", "Minimum price can not empty", FiltersPageObjects.errorMessage());
        WebElement EnterOption1 = driver.findElement(FiltersPageObjects.maximumPriceInputField());
        EnterOption1.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        CommonUtilityPage.verifyValueIsDisplayed("لا يمكن أن يكون السعر الأقصى فارغًا", "Maximum price can not empty", FiltersPageObjects.errorMessage());
    }

    /**
     * Click on units under construction project option
     */
    public void clickOnUnitsUnderConstructionProjectOption() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.unitsUnderConstructionProjectOption(), 40);
        Browser.click(FiltersPageObjects.unitsUnderConstructionProjectOption());
    }

    /**
     * Click on apartment unit option
     */
    public void clickOnApartmentUnitOption() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.apartmentUnitOption(), 40);
        Browser.click(FiltersPageObjects.apartmentUnitOption());
    }

    /**
     * Select all units / rooms option
     */
    public void selectAllUnitsOption(By element) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 50);
        Browser.waitUntilVisibilityOfElement(element, 30);
        Browser.waitUntilElementToBeClickable(element, 50);
        List<WebElement> allUnits = Browser.getWebElements(element);
        for (WebElement button : allUnits) {
            button.click();
            logger.addScreenshot("");
            button.isSelected();
        }
    }

    /**
     * Click on readyMade units project option
     */
    public void clickOnReadyMadeUnitsProjectOption() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.readyMadeUnitsProjectOption(), 40);
        Browser.click(FiltersPageObjects.readyMadeUnitsProjectOption());
    }

    /**
     * Click on lands project option
     */
    public void clickOnLandsProjectOption() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.landsProjectOption(), 40);
        Browser.click(FiltersPageObjects.landsProjectOption());
    }

    /**
     * Enter minimum area
     */
    public void enterMinimumArea(String minimumArea) throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.minimumAreaInputField(), 40);
        Browser.setText(FiltersPageObjects.minimumAreaInputField(), minimumArea);
    }

    /**
     * Enter maximum area
     */
    public void enterMaximumArea(String maximumArea) throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.maximumAreaInputField(), 40);
        WebElement EnterOption = driver.findElement(FiltersPageObjects.maximumAreaInputField());
        EnterOption.sendKeys(Keys.BACK_SPACE);
        Browser.setText(FiltersPageObjects.maximumAreaInputField(), maximumArea);
    }

    /**
     * Validation the minimum / maximum area cannot be empty
     */
    public void verifyMinimumAndMaximumAreaCannotBeEmpty() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.minimumAreaInputField(), 40);
        WebElement EnterOption = driver.findElement(FiltersPageObjects.minimumAreaInputField());
        EnterOption.sendKeys(Keys.BACK_SPACE);
        CommonUtilityPage.verifyValueIsDisplayed("لا يمكن أن تكون المساحة الدنيا فارغة", "Minimum area can not empty", FiltersPageObjects.errorMessage());
        WebElement EnterOption1 = driver.findElement(FiltersPageObjects.maximumAreaInputField());
        EnterOption1.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        CommonUtilityPage.verifyValueIsDisplayed("لا يمكن أن تكون المساحة القصوى فارغة", "Maximum area can not empty", FiltersPageObjects.errorMessage());
    }

    /**
     * Click on one bedroom option
     */
    public void clickOnOneBedRoomOption() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.oneBedRoomOption(), 40);
        Browser.click(FiltersPageObjects.oneBedRoomOption());
    }

    /**
     * Click on apply button
     */
    public void clickOnApplyButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.applyButton(), 40);
        Browser.click(FiltersPageObjects.applyButton());
    }

    /**
     * Validation apply result
     */
    public void verifyTheApplyResult(String resultAR, String resultEN) throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.applyResult(), 40);
        Browser.waitForSeconds(1);
        String applyResult = Browser.getText(FiltersPageObjects.applyResult());
        logger.addScreenshot("");
        Assert.assertTrue(applyResult.contains(resultEN.split(" ")[0]) || applyResult.contains(resultAR.split(" ")[0]), "Actual message is (" + applyResult + "), Expected should be (" + resultAR + ") OR (" + resultEN + ")");
    }

    public void verifyTheApplyResultForProject(String result) throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.applyResultForProject(), 40);
        Browser.waitForSeconds(1);
        String applyResult = Browser.getText(FiltersPageObjects.applyResultForProject());
        Assert.assertTrue(applyResult.contains(result.split(" ")[0]), "Actual message is (" + applyResult + "), Expected should be (" + result + ")");
    }

    /**
     * Click on close X button
     */
    public void clickOnCloseXButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.closeXButton(), 40);
        Browser.click(FiltersPageObjects.closeXButton());
    }

    /**
     * Validation the filter popup window is closed
     */
    public void verifyTheFilterPopupWidowIsClosed() throws Exception {
        Browser.waitUntilInvisibilityOfElement(MOHLandBookingJourneyPageObjects.filterResultPopup(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(MOHLandBookingJourneyPageObjects.filterResultPopup()));
    }

    /**
     * Click on rent button
     */
    public void clickOnRentButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.rentButton(), 40);
        Browser.click(FiltersPageObjects.rentButton());
    }

    /**
     * Click on auction button
     */
    public void clickOnAuctionButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.auctionButton(), 40);
        Browser.click(FiltersPageObjects.auctionButton());
    }
}
