package sa.nhc.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sa.nhc.web.objects.*;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import static com.testcrew.web.Browser.*;
import static org.testng.Assert.assertTrue;

public class FullAuctionJourneyPage {

    public void clickOnSideBarMenuInHomePage() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.Hover(), 40);
        CommonUtilityPage.moveToObject(CommonUtilityPageObjects.Hover());
        Browser.click(CommonUtilityPageObjects.Hover());
    }

    public void navigateToAuctionPage() throws Exception {
        clickOnSideBarMenuInHomePage();
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.selectAuctionFromSidebar(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.selectAuctionFromSidebar());
        Browser.click(FullAuctionJourneyPageObjects.selectAuctionFromSidebar());
        Browser.click(FullAuctionJourneyPageObjects.selectAuctionListFromSidebar());
    }

    public void clickOnAuction() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.selectAuctionFromSidebar(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.selectAuctionFromSidebar());
        Browser.click(FullAuctionJourneyPageObjects.selectAuctionFromSidebar());
    }

    public void clickOnAuctionProjects() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionProjects(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.AuctionProjects());
        Browser.click(FullAuctionJourneyPageObjects.AuctionProjects());
    }

    public void clickOnAddNewAuctionProject() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AddNewAuctionButton(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.AddNewAuctionButton());
        Browser.click(FullAuctionJourneyPageObjects.AddNewAuctionButton());
        Browser.waitUntilInvisibilityOfElement(FullAuctionJourneyPageObjects.AddNewAuctionButton(), 40);
    }

    public void verifyAuctionProjectPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionTypeDropdownList(), 40);
        logger.addScreenshot("");
        assertTrue(Browser.isElementPresent(FullAuctionJourneyPageObjects.AuctionTypeDropdownList()));
    }

    public void enterProjectName(String projectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ProjectNameInputField(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.ProjectNameInputField());
        Browser.setText(FullAuctionJourneyPageObjects.ProjectNameInputField(), projectName);
    }

    public void selectAuctionType(String auctionType) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionTypeDropdownList(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.AuctionTypeDropdownList());
        Browser.selectDropdownByVisibleText(FullAuctionJourneyPageObjects.AuctionTypeDropdownList(), auctionType);
    }

    public void selectRegion(String region) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.RegionDropdownList(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.RegionDropdownList());
        Browser.selectDropdownByVisibleText(FullAuctionJourneyPageObjects.RegionDropdownList(), region);
    }


    public void verifyAuctionPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.auctionHeading(), 40);
        String AuctionHeading = Browser.getText(FullAuctionJourneyPageObjects.auctionHeading());
        assertTrue(AuctionHeading.contains("قائمة المزادات") || AuctionHeading.contains("Auctions"));
        logger.addScreenshot("Auction page is displayed");
    }

    public void clickOnAddNewAuctionsButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 40);
        Browser.waitUntilPresenceOfElement(FullAuctionJourneyPageObjects.addNewAuctionButton(), 40);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.addNewAuctionButton(), 40);
        Browser.click(FullAuctionJourneyPageObjects.addNewAuctionButton());
    }

    public void verifyAddNewAuctionPageIsDisplayed() throws Exception {
        logger.addScreenshot("");
        String CreateAuctionHeading = Browser.getText(FullAuctionJourneyPageObjects.CreateAuctionHeading());
        assertTrue(CreateAuctionHeading.contains("إنشاء مزاد") || CreateAuctionHeading.contains("Create auctions"), "Add new auction page is not displayed");
    }

    public void enterValidUnitCode(String unitCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.auctionUnitCodeInput(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.auctionUnitCodeInput());
        Browser.setText(FullAuctionJourneyPageObjects.auctionUnitCodeInput(), unitCode);
    }

    public void verifyProjectCodeIsRetrieved(String code) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.getProjectCodeFromAuctionPage(), 40);
        String getProCode = getWebElement(FullAuctionJourneyPageObjects.getProjectCodeFromAuctionPage()).getAttribute("value");
        while (getProCode.isEmpty()) {
            getProCode = getWebElement(FullAuctionJourneyPageObjects.getProjectCodeFromAuctionPage()).getAttribute("value");
        }
        logger.addScreenshot("");
        assertTrue(getProCode.contains(code), "Project Code is not found");
    }

    public void enterInvalidUnitCode(String code) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.auctionUnitCodeInput(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.auctionUnitCodeInput(), code);
    }

    public void verifyProjectCodeIsNotRetrieved() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.getProjectCodeFromAuctionPage(), 40);
        String getProCode = Browser.getAttributeValue(FullAuctionJourneyPageObjects.getProjectCodeFromAuctionPage(), "value");
        logger.addScreenshot("Project code is :" + getProCode);
        assertTrue(getProCode.isEmpty(), "No Project Code is found");
    }

    public void enterStartingBidPrice(String price) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.auctionStartingPriceInput(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.auctionStartingPriceInput());
        Browser.setText(FullAuctionJourneyPageObjects.auctionStartingPriceInput(), price);
    }

    public void verifyStartBidPriceErrorMessage() throws Exception {
        Browser.click(FullAuctionJourneyPageObjects.auctionTargetedPriceInput());
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.valueErrorMsg(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.valueErrorMsg());
        String ErrorMsg = Browser.getText(FullAuctionJourneyPageObjects.valueErrorMsg());
        logger.addScreenshot("Error Message : " + ErrorMsg);
        assertTrue(ErrorMsg.contains("القيمة المدخلة خاطئة. أقل قيمة ممكنة هي 0") || ErrorMsg.contains("الحقل مطلوب")
                || ErrorMsg.contains("Minimum amount doesn't match") || ErrorMsg.contains("This field is required."));
    }

    public void enterTargetedPrice(String price) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.auctionTargetedPriceInput(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.auctionTargetedPriceInput(), price);
    }

    public void validateErrorMsgIfTargetedPriceLessThanStartingBidPrice() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.valueErrorMsg(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.valueErrorMsg());
        String ErrorMsg = Browser.getText(FullAuctionJourneyPageObjects.valueErrorMsg());
        logger.addScreenshot("Displayed Error Message : " + ErrorMsg);
        assertTrue(ErrorMsg.contains("Targeted price must be greater than start bid")
                || ErrorMsg.contains("يجب أن يكون السعر المستهدف أكبر من عرض الأسعار الأولي"));
    }

    public void clickOnIncreaseStartingBidPriceArrowAndVerifyPriceIsChanged(String startPrice) throws Exception {
        Browser.setText(FullAuctionJourneyPageObjects.auctionStartingPriceInput(), startPrice);
        String initialPrice = Browser.getAttributeValue(FullAuctionJourneyPageObjects.auctionStartingPriceInput(), "value");
        logger.addScreenshot("Starting Bid price before increment: " + initialPrice);
        WebElement IncreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.auctionStartingPriceInput());
        IncreaseAmount.sendKeys(Keys.ARROW_UP);
        String finalPrice = Browser.getAttributeValue(FullAuctionJourneyPageObjects.auctionStartingPriceInput(), "value");
        logger.addScreenshot("Starting Bid price before increment: " + finalPrice);
        Assert.assertNotEquals(initialPrice, finalPrice, "Starting Bid price is not incremented by clicking on the arrow");
    }

    public void clickOnDecreaseTargetBidPriceArrowAndVerifyPriceIsChanged(String targetPrice) throws Exception {
        Browser.setText(FullAuctionJourneyPageObjects.auctionTargetedPriceInput(), targetPrice);
        String initialPrice = Browser.getAttributeValue(FullAuctionJourneyPageObjects.auctionTargetedPriceInput(), "value");
        logger.addScreenshot("Starting Bid price before increment: " + initialPrice);
        WebElement IncreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.auctionTargetedPriceInput());
        IncreaseAmount.sendKeys(Keys.ARROW_DOWN);
        String finalPrice = Browser.getAttributeValue(FullAuctionJourneyPageObjects.auctionTargetedPriceInput(), "value");
        logger.addScreenshot("Target Bid price before increment: " + finalPrice);
        Assert.assertNotEquals(initialPrice, finalPrice, "Target Bid price is not incremented by clicking on the arrow");
    }

    public void selectAuctionStartDateFromCalendar(int year) throws Exception {
        String yearStart = String.valueOf(Integer.parseInt(CommonUtilityPage.getHijriDate().split("/")[2]) + year);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.startAuctionDateIcon(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.startAuctionDateIcon());
        Browser.click(FullAuctionJourneyPageObjects.startAuctionDateIcon());
        Browser.selectDropdownByVisibleText(FullAuctionJourneyPageObjects.getYearList(), yearStart);
        Browser.selectDropdownByVisibleText(FullAuctionJourneyPageObjects.getMonthList(), CommonUtilityPage.getHijriDate().split("/")[1]);
        List<WebElement> listDays = driver.findElements(FullAuctionJourneyPageObjects.getDayList());
        String day = CommonUtilityPage.getHijriDate().split("/")[0].replaceFirst("^0*", "");
        for (WebElement y : listDays) {
            String getDay = y.getText();
            if (getDay.equalsIgnoreCase(day)) {
                y.click();
                Browser.click(FullAuctionJourneyPageObjects.inputStartAuctionHours());
                break;
            }
        }
        logger.addScreenshot("Auction start date is selected");
    }

    public void verifyAuctionStartDateHasBeenSelected() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionStartDateInput(), 40);
        String dateSelected = Browser.getAttributeValue(FullAuctionJourneyPageObjects.AuctionStartDateInput(), "value");
        logger.addScreenshot("Selected date is : " + dateSelected);
        Assert.assertFalse(dateSelected.isEmpty(), "Auction start date is not selected");
    }

    public void selectAuctionEndDateFromCalendar(int year) throws Exception {
        String yearEnd = String.valueOf(Integer.parseInt(CommonUtilityPage.getHijriDate().split("/")[2]) + year);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.endAuctionDateIcon(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.endAuctionDateIcon());
        Browser.click(FullAuctionJourneyPageObjects.endAuctionDateIcon());
        Browser.selectDropdownByVisibleText(FullAuctionJourneyPageObjects.getYearList(), yearEnd);
        Browser.selectDropdownByVisibleText(FullAuctionJourneyPageObjects.getMonthList(), CommonUtilityPage.getHijriDate().split("/")[1]);
        List<WebElement> listDays = driver.findElements(FullAuctionJourneyPageObjects.getDayList());
        for (WebElement y : listDays) {
            String getDay = y.getText();
            if (getDay.equalsIgnoreCase(CommonUtilityPage.getHijriDate().split("/")[0].replaceFirst("^0*", ""))) {
                y.click();
                break;
            }
        }
        logger.addScreenshot("Auction end date is selected");
    }

    public void verifyAuctionEndDateHasBeenSelected() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionEndDateInput(), 40);
        String dateSelected = Browser.getAttributeValue(FullAuctionJourneyPageObjects.AuctionEndDateInput(), "value");
        logger.addScreenshot("Selected date is : " + dateSelected);
        Assert.assertFalse(dateSelected.isEmpty(), "Auction end date is not selected");
    }

    public void enterStartTimeOfAuction(int reqHr, int reqMin, int reqSec) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.inputStartAuctionHours(), 40);
        String startTime = CommonUtilityPage.getTime(reqHr, reqMin, reqSec);
        Browser.setText(FullAuctionJourneyPageObjects.inputStartAuctionHours(), startTime.split(":")[0]);
        Browser.setText(FullAuctionJourneyPageObjects.inputStartAuctionMinutes(), startTime.split(":")[1]);
    }

    public void verifyStartTimeOfAuctionIsEntered() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.inputStartAuctionHours(), 40);
        String startTimeHr = Browser.getAttributeValue(FullAuctionJourneyPageObjects.inputStartAuctionHours(), "value");
        String startTimeMin = Browser.getAttributeValue(FullAuctionJourneyPageObjects.inputStartAuctionMinutes(), "value");
        logger.addScreenshot("");
        Assert.assertFalse(startTimeHr.isEmpty(), "Starting hour is not entered");
        Assert.assertFalse(startTimeMin.isEmpty(), "Starting minute is not entered");
    }

    public void enterEndTimeOfAuction(int reqHr, int reqMin, int reqSec) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.inputEndAuctionHours(), 40);
        String endTime = CommonUtilityPage.getTime(reqHr, reqMin, reqSec);
        Browser.setText(FullAuctionJourneyPageObjects.inputEndAuctionHours(), endTime.split(":")[0]);
        Browser.setText(FullAuctionJourneyPageObjects.inputEndAuctionMinutes(), endTime.split(":")[1]);
    }

    public void verifyEndTimeOfAuctionIsEntered() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.inputStartAuctionHours(), 40);
        String startTimeHr = Browser.getAttributeValue(FullAuctionJourneyPageObjects.inputEndAuctionHours(), "value");
        String startTimeMin = Browser.getAttributeValue(FullAuctionJourneyPageObjects.inputEndAuctionMinutes(), "value");
        logger.addScreenshot("");
        Assert.assertFalse(startTimeHr.isEmpty(), "Ending hour is not entered");
        Assert.assertFalse(startTimeMin.isEmpty(), "Ending minute is not entered");
    }

    public void validateErrorMessageIfEndDateIsLessThanStartDate(int yearStart, int yearEnd) throws Exception {
        selectAuctionStartDateFromCalendar(yearStart);
        selectAuctionEndDateFromCalendar(yearEnd);
        String ErrorMsg = Browser.getText(FullAuctionJourneyPageObjects.valueErrorMsg());
        assertTrue(ErrorMsg.contains("يجب أن يكون تاريخ الانتهاء أكبر من تاريخ البدء")
                || ErrorMsg.contains("End date must be greater than start date"));
        logger.addScreenshot("Error Message : " + ErrorMsg);
    }

    public void validateErrorMessageIfEndDateIsLessThanStartDate(int year, int yearEnd, int dayStart) throws Exception {
        String yearStart = String.valueOf(Integer.parseInt(CommonUtilityPage.getHijriDate().split("/")[2]) + year);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.startAuctionDateIcon(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.startAuctionDateIcon());
        Browser.click(FullAuctionJourneyPageObjects.startAuctionDateIcon());
        Browser.selectDropdownByVisibleText(FullAuctionJourneyPageObjects.getYearList(), yearStart);
        Browser.selectDropdownByVisibleText(FullAuctionJourneyPageObjects.getMonthList(), CommonUtilityPage.getHijriDate().split("/")[1]);
        List<WebElement> listDays = driver.findElements(FullAuctionJourneyPageObjects.getDayList());
        String day = CommonUtilityPage.getHijriDate(10).split("/")[0].replaceFirst("^0*", "");
        for (WebElement y : listDays) {
            String getDay = y.getText();
            if (getDay.equalsIgnoreCase(day)) {
                y.click();
                Browser.click(FullAuctionJourneyPageObjects.inputStartAuctionHours());
                break;
            }
        }
        logger.addScreenshot("Auction start date is selected");

        selectAuctionEndDateFromCalendar(yearEnd);
        String ErrorMsg = Browser.getText(FullAuctionJourneyPageObjects.valueErrorMsg());
        assertTrue(ErrorMsg.contains("يجب أن يكون تاريخ الانتهاء أكبر من تاريخ البدء")
                || ErrorMsg.contains("End date must be greater than start date"));
        logger.addScreenshot("Error Message : " + ErrorMsg);
    }
    public void clickToEnabledApplyGeneralSettingLabel() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.applyGeneralSettingLabel());
        while (!(Boolean.parseBoolean(Browser.getAttributeValue(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), "aria-checked")))) {
            Browser.click(FullAuctionJourneyPageObjects.applyGeneralSettingLabel());
        }
    }

    public void disableApplyGeneralSettingToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.applyGeneralSettingLabel());
        while (Boolean.parseBoolean(Browser.getAttributeValue(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), "aria-checked"))) {
            Browser.click(FullAuctionJourneyPageObjects.applyGeneralSettingLabel());
        }
    }

    public void verifyApplyGeneralSettingToggleIsOff() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.applyGeneralSettingLabel());
        boolean status = Boolean.parseBoolean(Browser.getAttributeValue(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), "aria-checked"));
        logger.addScreenshot("Apply General Setting toggle state is: " + status);
        Assert.assertFalse(status, "Apply General Setting toggle is ON");
    }

    public void verifyApplyGeneralSettingToggleIsOn() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.applyGeneralSettingLabel());
        boolean status = Boolean.parseBoolean(Browser.getAttributeValue(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), "aria-checked"));
        logger.addScreenshot("Apply General Setting toggle state is: " + status);
        Assert.assertTrue(status, "Apply General Setting toggle is ON");
    }

    public void enterValidActionFeeAmount(String fee) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount());
        Browser.setText(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount(), fee);
    }

    public void enterInvalidActionFeeAmountAndVerifyTheErrorMessage(String fee) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.applyGeneralSettingLabel());
        Browser.setText(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount(), fee);
        String ErrorMsg = Browser.getText(FullAuctionJourneyPageObjects.valueErrorMsg());
        assertTrue(ErrorMsg.contains("0 يجب أن يكون أكبر من") || ErrorMsg.contains("الحقل مطلوب")
                || ErrorMsg.contains("Minimum amount doesn't match") || ErrorMsg.contains("This field is required."));
        logger.addScreenshot("Error Message : " + ErrorMsg);
    }

    public void increaseActionFeeAmountAndVerify(String fee) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount(), fee);
        logger.addScreenshot("Auction fee before increment : " + fee);
        WebElement IncreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount());
        IncreaseAmount.sendKeys(Keys.ARROW_UP);
        String newFee = Browser.getAttributeValue(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount(), "value");
        logger.addScreenshot("Auction fee after increment : " + newFee);
        Assert.assertNotEquals(fee, newFee, "Fee is not incremented");
    }

    public void decreaseActionFeeAmountAndVerify(String fee) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount(), fee);
        logger.addScreenshot("Auction fee before decrement : " + fee);
        WebElement IncreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount());
        IncreaseAmount.sendKeys(Keys.ARROW_UP);
        String newFee = Browser.getAttributeValue(FullAuctionJourneyPageObjects.auctionIncreaseFeeAmount(), "value");
        logger.addScreenshot("Auction fee after decrement : " + newFee);
        Assert.assertNotEquals(fee, newFee, "Fee is not decremented");
    }

    public void enterAddedTime(String hr, String min, String sec) throws Exception {
        Browser.executeJSScrollIntoView(FullAuctionJourneyPageObjects.applyGeneralSettingLabel());
        Browser.setText(FullAuctionJourneyPageObjects.inputAddTimeHours(), hr);
        Browser.setText(FullAuctionJourneyPageObjects.inputAddTimeMinutes(), min);
        Browser.setText(FullAuctionJourneyPageObjects.inputAddTimeSeconds(), sec);
    }

    public void enterValidFixedIncreaseNumber1(String val) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.fixedIncreaseNumber1(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber1(), val);
    }

    public void increaseFixedIncreaseNumberOneAndVerify(String val) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.fixedIncreaseNumber1(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber1(), val);
        logger.addScreenshot("Fixed increase number 1 before increment: " + val);
        WebElement IncreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.fixedIncreaseNumber1());
        IncreaseAmount.sendKeys(Keys.ARROW_UP);
        String newVal = Browser.getAttributeValue(FullAuctionJourneyPageObjects.fixedIncreaseNumber1(), "value");
        logger.addScreenshot("Fixed increase number 1 after increment: " + val);
        Assert.assertNotEquals(newVal, val, "Fixed increase value 1 is not incremented");
    }

    public void decreaseFixedIncreaseNumberOneAndVerify(String val) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.fixedIncreaseNumber1(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber1(), val);
        logger.addScreenshot("Fixed increase number 1 before decrement: " + val);
        WebElement DecreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.fixedIncreaseNumber1());
        DecreaseAmount.sendKeys(Keys.ARROW_DOWN);
        String newVal = Browser.getAttributeValue(FullAuctionJourneyPageObjects.fixedIncreaseNumber1(), "value");
        logger.addScreenshot("Fixed increase number 1 after decrement: " + val);
        Assert.assertNotEquals(newVal, val, "Fixed increase value 1 is not decrement");
    }

    public void enterFixedIncreaseNumber2(String val) throws Exception {
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.fixedIncreaseNumber2(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber2(), val);
    }

    public void increaseFixedIncreaseNumberTwoAndVerify(String val) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.fixedIncreaseNumber2(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber2(), val);
        logger.addScreenshot("Fixed increase number 2 before increment: " + val);
        WebElement IncreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.fixedIncreaseNumber2());
        IncreaseAmount.sendKeys(Keys.ARROW_UP);
        String newVal = Browser.getAttributeValue(FullAuctionJourneyPageObjects.fixedIncreaseNumber2(), "value");
        logger.addScreenshot("Fixed increase number 2 after increment: " + val);
        Assert.assertNotEquals(newVal, val, "Fixed increase value is 2 not incremented");
    }

    public void decreaseFixedIncreaseNumberTwoAndVerify(String val) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.fixedIncreaseNumber2(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber2(), val);
        logger.addScreenshot("Fixed increase number 2 before decrement: " + val);
        WebElement DecreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.fixedIncreaseNumber2());
        DecreaseAmount.sendKeys(Keys.ARROW_DOWN);
        String newVal = Browser.getAttributeValue(FullAuctionJourneyPageObjects.fixedIncreaseNumber2(), "value");
        logger.addScreenshot("Fixed increase number 2 after decrement: " + val);
        Assert.assertNotEquals(newVal, val, "Fixed increase value 2 is not decremented");
    }


    public void enterFixedIncreaseNumber3(String val) throws Exception {
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), val);
    }

    public void increaseFixedIncreaseNumberThreeAndVerify(String val) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), val);
        logger.addScreenshot("Fixed increase number 3 before increment: " + val);
        WebElement IncreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.fixedIncreaseNumber3());
        IncreaseAmount.sendKeys(Keys.ARROW_UP);
        String newVal = Browser.getAttributeValue(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), "value");
        logger.addScreenshot("Fixed increase number 3 after increment: " + val);
        Assert.assertNotEquals(newVal, val, "Fixed increase value 3 is not incremented");
    }

    public void decreaseFixedIncreaseNumberThreeAndVerify(String val) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), val);
        logger.addScreenshot("Fixed increase number 3 before decrement: " + val);
        WebElement DecreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.fixedIncreaseNumber3());
        DecreaseAmount.sendKeys(Keys.ARROW_DOWN);
        String newVal = Browser.getAttributeValue(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), "value");
        logger.addScreenshot("Fixed increase number 3 after decrement: " + val);
        Assert.assertNotEquals(newVal, val, "Fixed increase value 3 is not decremented");
    }

    public void enterSameValueInFixedIncreaseNumbers() throws Exception {
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.fixedIncreaseNumber1(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber1(), "10");
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber2(), "10");
        Browser.setText(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), "10");
    }

    public void verifyErrorMessageForFixedIncreasePrice() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.valueErrorMsg(), 40);
        String ErrorMsg = Browser.getText(FullAuctionJourneyPageObjects.valueErrorMsg());
        logger.addScreenshot("Error Message : " + ErrorMsg);
        assertTrue(ErrorMsg.contains("رقم الزيادة الثابت مكرر"));
    }

    public void enterPeriodTimeAuctionWinnerTakeAction(String time) throws Exception {
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction(), time);
    }

    public void enterInvalidPeriodTimeAuctionWinnerTakeAction(String period) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.applyGeneralSettingLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.applyGeneralSettingLabel());
        Browser.click(FullAuctionJourneyPageObjects.applyGeneralSettingLabel());
        Browser.setText(FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction(), period);
    }

    public void increasePeriodTimeAuctionWinnerTakeActionAndVerify(String time) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction(), time);
        logger.addScreenshot("Before increment of 'Period time auction winner to take action' : " + time);
        WebElement IncreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction());
        IncreaseAmount.sendKeys(Keys.ARROW_UP);
        String newTime = Browser.getAttributeValue(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), "value");
        logger.addScreenshot("After increment of 'Period time auction winner to take action' : " + newTime);
        Assert.assertNotEquals(newTime, time, "'Period time auction winner to take action' is not incremented");
    }

    public void decreasePeriodTimeAuctionWinnerTakeActionAndVerify(String time) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction(), time);
        logger.addScreenshot("Before decrement of 'Period time auction winner to take action' : " + time);
        WebElement DecreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.periodTimeAuctionWinnerTakeAction());
        DecreaseAmount.sendKeys(Keys.ARROW_DOWN);
        String newTime = Browser.getAttributeValue(FullAuctionJourneyPageObjects.fixedIncreaseNumber3(), "value");
        logger.addScreenshot("After decrement of 'Period time auction winner to take action' : " + newTime);
        Assert.assertNotEquals(newTime, time, "'Period time auction winner to take action' is not decremented");
    }

    public void enterPeriodTimePayFinalUnitInvoice(String val) throws Exception {
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice(), val);
    }

    public void enterInvalidPeriodTimePayFinalUnitInvoice(String val) throws Exception {
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice(), val);
    }

    public void increasePeriodTimeToPayFinalUnitInvoiceAndVerify(String time) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice(), time);
        logger.addScreenshot("Before increment of 'Period time auction to pay final unit price' : " + time);
        WebElement IncreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice());
        IncreaseAmount.sendKeys(Keys.ARROW_UP);
        String newTime = Browser.getAttributeValue(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice(), "value");
        logger.addScreenshot("After increment of 'Period time auction to pay final unit price' : " + newTime);
        Assert.assertNotEquals(newTime, time, "'Period time auction to pay final unit price' is not incremented");
    }

    public void decreasePeriodTimeToPayFinalUnitInvoiceAndVerify(String time) throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice(), 40);
        Browser.setText(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice(), time);
        logger.addScreenshot("Before decrement of 'Period time auction to pay final unit price' : " + time);
        WebElement DecreaseAmount = Browser.getWebElement(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice());
        DecreaseAmount.sendKeys(Keys.ARROW_DOWN);
        String newTime = Browser.getAttributeValue(FullAuctionJourneyPageObjects.periodTimePayFinalUnitInvoice(), "value");
        logger.addScreenshot("After decrement of 'Period time auction to pay final unit price' : " + newTime);
        Assert.assertNotEquals(newTime, time, "'Period time auction to pay final unit price' is not decremented");
    }

    public void enabledApplyFeeForAuctionUnitLabel() throws Exception {
        disableApplyGeneralSettingToggle();
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel());
        if (!(Boolean.parseBoolean(Browser.getAttributeValue(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel(), "aria-checked")))) {
            Browser.click(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel());
        }
    }

    public void clickOnDeleteButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.deleteBTN(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.deleteBTN());
        Browser.click(FullAuctionJourneyPageObjects.deleteBTN());
    }

    public void verifyDeleteButtonIsNotDisplayed() throws Exception {
        logger.addScreenshot("Auction is deleted");
        Assert.assertFalse(Browser.isElementPresent(FullAuctionJourneyPageObjects.deleteBTN()), "Auction is not deleted");
    }

    public void clickOnSaveButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.saveBTN(), 50);
        Browser.moveToElement(FullAuctionJourneyPageObjects.saveBTN());
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.saveBTN(), 50);
        Browser.click(FullAuctionJourneyPageObjects.saveBTN());
    }

    public void clickOnCancelButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.cancelBTN(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.cancelBTN());
        Browser.click(FullAuctionJourneyPageObjects.cancelBTN());
    }

    public void clickAddMoreAuction() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.addMoreSectionBTN(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.addMoreSectionBTN());
        Browser.click(FullAuctionJourneyPageObjects.addMoreSectionBTN());
    }

    public void verifySecondAuctionIsAdded() throws Exception {
        Browser.executeJSScrollIntoView(FullAuctionJourneyPageObjects.auctionUnitCodeInput2());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(FullAuctionJourneyPageObjects.auctionUnitCodeInput2()));
    }

    public void verifySaveButtonIsDisabled() throws Exception {
        Browser.executeJSScrollIntoView(FullAuctionJourneyPageObjects.saveBTN());
        Browser.waitForSeconds(1);
        assertTrue(Browser.isElementDisabled(FullAuctionJourneyPageObjects.saveBTN()));
        logger.addScreenshot("Save button is disabled / not clickable");
        Browser.waitForSeconds(1);
    }

    public void verifyDownloadTemplateButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.DownloadTemplateButton(), 40);
        Browser.executeJSScrollIntoView(FullAuctionJourneyPageObjects.DownloadTemplateButton());
        Browser.waitForSeconds(1);
        assertTrue(Browser.isElementDisabled(FullAuctionJourneyPageObjects.DownloadTemplateButton()));
        logger.addScreenshot("");
    }

    public void verifyAuctionTabIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.auctionTab(), 25);
        boolean status = Browser.isElementPresent(FullAuctionJourneyPageObjects.auctionTab());
        logger.addScreenshot("Visibility of Auction tab: " + status);
        Assert.assertTrue(status, "Auction tab is not visible");
    }

    public void clickOnAuctionTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.auctionTab(), 40);
        Browser.click(FullAuctionJourneyPageObjects.auctionTab());
    }

    public void verifyAuctionTabIsSelected() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.auctionTab(), 40);
        String classExistence = Browser.getAttributeValue(FullAuctionJourneyPageObjects.auctionTab(), "class");
        boolean status = classExistence.contains("btn-primary");
        logger.addScreenshot("");
        Assert.assertTrue(status, "Auction tab is not selected");
    }

    public void searchForAuctionProject(String projectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.projectInputFiled(), 40);
        CommonUtilityPage.moveToObject(MOHLandBookingJourneyPageObjects.projectInputFiled());
        Browser.setText(MOHLandBookingJourneyPageObjects.projectInputFiled(), projectName);
    }

    public void navigateToAuctionProjectPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(FiltersPageObjects.applyResultForProject(), 50);
        Browser.waitUntilElementToBeClickable(FiltersPageObjects.applyResultForProject(), 50);
        Browser.moveToElement(FiltersPageObjects.applyResultForProject());
        Browser.click(FiltersPageObjects.applyResultForProject());
//        while (Browser.isElementNotPresent(FullAuctionJourneyPageObjects.availableUnitLabel())) {
//            Browser.click(FiltersPageObjects.applyResultForProject());
//            Browser.waitForSeconds(2);
//        }
    }

    public void verifyAvailableUnitsAreDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.availableUnitLabel(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.availableUnitLabel());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(FullAuctionJourneyPageObjects.availableUnitLabel()));
    }

    public void navigateToExpiredOrClosedUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ExpiredOrClosedUnit(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ExpiredOrClosedUnit());
        Browser.click(FullAuctionJourneyPageObjects.ExpiredOrClosedUnit());
    }


    public void verifyCountDownIsDisplayed() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(FullAuctionJourneyPageObjects.TimerCountDown()), "Count down timer is not displayed");
    }

    public void verifyAuctionStatus(String AucStatus1, String AucStatus2) throws Exception {
        String AuctionStatus = Browser.getText(FullAuctionJourneyPageObjects.getCurrentAuctionStatus());
        logger.addScreenshot("Auction status is : " + AuctionStatus);
        Assert.assertTrue(AuctionStatus.contains(AucStatus1) || AuctionStatus.contains(AucStatus2));
    }

    public void viewAuctionLocation() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.viewAuctionLocation(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.viewAuctionLocation());
        Browser.click(FullAuctionJourneyPageObjects.viewAuctionLocation());
    }

    public void clickOnAvailableUnitsFilter() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.availableUnitsFilter(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.availableUnitsFilter());
        Browser.click(FullAuctionJourneyPageObjects.availableUnitsFilter());
    }

    public void verifyNoResultFound() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.availableUnitsSearchResult(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.availableUnitsSearchResult());
        String ResultStatus = Browser.getText(FullAuctionJourneyPageObjects.availableUnitsSearchResult());
        logger.addScreenshot("");
        Assert.assertTrue(ResultStatus.contains("No results") || ResultStatus.contains("لا توجد نتائج"));
    }

    public void verifyResultFound() throws Exception {
        logger.addScreenshot("");
        Browser.moveToElement(FullAuctionJourneyPageObjects.AvailableUnitLabel());
        Assert.assertTrue(Browser.isElementPresent(FullAuctionJourneyPageObjects.AvailableUnitLabel()));
    }

    public void clickOnSearchButtonFilter() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.filterSearchButton(), 50);
        Browser.click(FullAuctionJourneyPageObjects.filterSearchButton());
        Browser.waitForSeconds(1);
    }

    public void clickOnClearButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.filterClearButton(), 50);
        Browser.click(FullAuctionJourneyPageObjects.filterClearButton());
    }

    public void clickOnClearButtonAndVerifyTheRangeIsReset() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.MaxRangeInput(), 40);
        logger.addScreenshot("Before clearing the filter");
        String val_1 = Browser.getAttributeValue(FullAuctionJourneyPageObjects.MaxRangeInput(), "value");
        clickOnClearButton();
        logger.addScreenshot("After clearing the filter");
        String val_2 = Browser.getAttributeValue(FullAuctionJourneyPageObjects.MaxRangeInput(), "value");
        Assert.assertNotEquals(val_1, val_2, "Filter range is not reset");
    }

    public void enterMaximumArea(String maximumArea) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.maximumAreaInputField(), 40);
        WebElement EnterOption = driver.findElement(FullAuctionJourneyPageObjects.maximumAreaInputField());
        EnterOption.sendKeys(Keys.BACK_SPACE);
        Browser.setText(FullAuctionJourneyPageObjects.maximumAreaInputField(), maximumArea);
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
    }

    public void selectMaximumArea() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.maximumAreaSlider(), 40);
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.maximumAreaSlider(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.maximumAreaSlider());
        WebElement sourceElement = driver.findElement(FullAuctionJourneyPageObjects.maximumAreaSlider());
        WebElement targetElement = Browser.getWebElement(FullAuctionJourneyPageObjects.filterSearchButton());
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
    }

    public void selectMinimumArea() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.MinimumAreaSlider(), 40);
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.MinimumAreaSlider(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.MinimumAreaSlider());
        WebElement sourceElement = driver.findElement(FullAuctionJourneyPageObjects.MinimumAreaSlider());
        WebElement targetElement = Browser.getWebElement(FullAuctionJourneyPageObjects.filterSearchButton());
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
    }

    public void clickOnMaximizeImageButtonOnAuctionPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.maximizeImageAuctionButton(), 50);
        Browser.click(FullAuctionJourneyPageObjects.maximizeImageAuctionButton());
    }

    public void verifyImageIsMaximized() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(FullAuctionJourneyPageObjects.MaximizeImage()), "");
    }

    public void clickOnViewMasterPlanImage() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.viewMasterPlanImage(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.viewMasterPlanImage());
        Browser.click(FullAuctionJourneyPageObjects.viewMasterPlanImage());
    }

    public void clickOnProjectDetailsTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.clickOnProjectTab(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.clickOnProjectTab());
        Browser.click(FullAuctionJourneyPageObjects.clickOnProjectTab());
    }

    public void clickOnUnitOpenForAuction() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.UnitOpenForAuction(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.UnitOpenForAuction());
        Browser.click(FullAuctionJourneyPageObjects.UnitOpenForAuction());
    }

    public void clickOnApplyForThisAuctionButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ApplyForThisAuctionButton(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ApplyForThisAuctionButton());
        Browser.click(FullAuctionJourneyPageObjects.ApplyForThisAuctionButton());
        if (Browser.isElementPresent(FullAuctionJourneyPageObjects.StartBiddingButton())) {
            CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.TermsAndConditionsCheckbox());
            Browser.click(FullAuctionJourneyPageObjects.TermsAndConditionsCheckbox());
            CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.StartBiddingButton());
            Browser.click(FullAuctionJourneyPageObjects.StartBiddingButton());
        }
    }

    public void verifyApplyForThisAuctionButtonIsNotDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ApplyForThisAuctionButton(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ApplyForThisAuctionButton());
        Assert.assertFalse(Browser.isElementPresent(FullAuctionJourneyPageObjects.ApplyForThisAuctionButton()), "Apply for this auction button is displayed");
    }

    public void clickOnMadaPayment() throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 100);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.MadaPaymentOption(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.MadaPaymentOption());
        Browser.click(FullAuctionJourneyPageObjects.MadaPaymentOption());
    }

    public void verifyPaymentMadaPaymentMethodIsSelected() throws Exception {
        Browser.waitUntilPresenceOfElement(FullAuctionJourneyPageObjects.MadaPaymentOptionCheckboxInput(), 50);
        WebElement element = Browser.getWebElement(FullAuctionJourneyPageObjects.MadaPaymentOptionCheckboxInput());
        logger.addScreenshot("");
        Assert.assertTrue(element.isSelected(), "Mada Payment method is not selected");
    }

    public void verifyConfirmButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ConfirmButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ConfirmButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(FullAuctionJourneyPageObjects.ConfirmButton()), "Mada Payment method is not selected");
    }

    public void clickOnConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ConfirmButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ConfirmButton());
        Browser.click(FullAuctionJourneyPageObjects.ConfirmButton());
    }

    public void clickOnAgreeCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AgreeCheckbox(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.AgreeCheckbox());
        Browser.click(FullAuctionJourneyPageObjects.AgreeCheckbox());
    }

    public void clickOnTransactionsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.TransactionsButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.TransactionsButton());
        Browser.click(FullAuctionJourneyPageObjects.TransactionsButton());
    }

    public void clickOnPreviewInvoiceLink() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.PreviewInvoiceLink(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.PreviewInvoiceLink());
        Browser.click(FullAuctionJourneyPageObjects.PreviewInvoiceLink());
    }

    public void clickOnPayNowLink() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.PayNowLink(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.PayNowLink());
        Browser.click(FullAuctionJourneyPageObjects.PayNowLink());
    }

    public void clickOnBackButtonFromPaymentGateway() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.BackButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.BackButton());
        Browser.click(FullAuctionJourneyPageObjects.BackButton());
    }

    public void disableApplyAuctionFeeToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel());
        if (Boolean.parseBoolean(Browser.getAttributeValue(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel(), "aria-checked"))) {
            Browser.click(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel());
        }
    }

    public void verifyApplyFeeForAuctionUnitToggleIsOff() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel());
        boolean status = Boolean.parseBoolean(Browser.getAttributeValue(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel(), "aria-checked"));
        logger.addScreenshot("Apply Fee For Auction Unit toggle state is: " + status);
        Assert.assertFalse(status, "Apply Fee For Auction Unit toggle state is ON");
    }

    public void verifyApplyFeeForAuctionUnitToggleIsOn() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel());
        boolean status = Boolean.parseBoolean(Browser.getAttributeValue(FullAuctionJourneyPageObjects.ApplyFeeForAuctionUnitLabel(), "aria-checked"));
        logger.addScreenshot("Apply Fee For Auction Unit toggle state is: " + status);
        Assert.assertTrue(status, "Apply Fee For Auction Unit toggle state is Off");
    }

    public void verifyJoinThisAuctionButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.JoinThisAuctionButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.JoinThisAuctionButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(FullAuctionJourneyPageObjects.JoinThisAuctionButton()), "Join this Auction button is disabled");
    }

    public void verifyJoinThisAuctionButtonIsNotDisplayed() throws Exception {
        logger.addScreenshot("");
        Assert.assertFalse(Browser.isElementPresent(FullAuctionJourneyPageObjects.JoinThisAuctionButton()), "Join this Auction button is displayed");
    }

    public void clickOnJoinThisAuctionButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.JoinThisAuctionButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.JoinThisAuctionButton());
        Browser.click(FullAuctionJourneyPageObjects.JoinThisAuctionButton());
    }


    public void verifyStartBiddingButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.StartBiddingButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.StartBiddingButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(FullAuctionJourneyPageObjects.StartBiddingButton()), "Start Bidding button is disabled");
    }

    public void verifyStartBiddingButtonIsNotDisplayed() throws Exception {
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Assert.assertFalse(isElementPresent(FullAuctionJourneyPageObjects.StartBiddingButton()), "Pop is not dismissed");
    }

    public void verifyStartBiddingIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.StartBiddingButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.StartBiddingButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(FullAuctionJourneyPageObjects.StartBiddingButton()), "Start Bidding button is enabled/clickable");
    }

    public void clickOnStartBiddingButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.StartBiddingButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.StartBiddingButton());
        Browser.click(FullAuctionJourneyPageObjects.StartBiddingButton());
    }

    public void verifyIncreaseBidPriceButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.IncreaseBidPriceButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.IncreaseBidPriceButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(FullAuctionJourneyPageObjects.IncreaseBidPriceButton()), "Increase Bid Price button is disabled");
    }

    public void verifyDecreaseBidPriceButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.DecreaseBidPriceButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.DecreaseBidPriceButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(FullAuctionJourneyPageObjects.DecreaseBidPriceButton()), "Decrease Bid Price button is disabled");
    }

    public void fixedIncreaseNumberButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.FixedIncreaseNumber(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.FixedIncreaseNumber());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(FullAuctionJourneyPageObjects.FixedIncreaseNumber()), "Fixed Increase Number button is disabled");
    }

    public void verifyPlaceBidButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.PlaceBidButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.FixedIncreaseNumber());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(FullAuctionJourneyPageObjects.FixedIncreaseNumber()), "Place Bid button is disabled");
    }

    public void verifyPlaceBidButtonIsNotDisplayed() throws Exception {
        logger.addScreenshot("");
        if (Browser.isElementPresent(FullAuctionJourneyPageObjects.FixedIncreaseNumber())) {
            Assert.assertTrue(Browser.isElementDisabled(FullAuctionJourneyPageObjects.PlaceBidButton()), "Place bid button is disabled");
        } else {
            Assert.assertTrue(Browser.isElementNotPresent(FullAuctionJourneyPageObjects.PlaceBidButton()), "Place bid button is displayed");
        }
    }

    public void clickOnPlaceBidButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.PlaceBidButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.PlaceBidButton());
        Thread.sleep(500);
        Browser.executeJSScroll(300);
        Thread.sleep(1500);
        Browser.click(FullAuctionJourneyPageObjects.PlaceBidButton());
    }

    public void verifySubmitBidButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.SubmitBidButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.SubmitBidButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementEnabled(FullAuctionJourneyPageObjects.SubmitBidButton()), "Submit Bid button is disabled");
    }

    public void verifySubmitBidButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.SubmitBidButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.SubmitBidButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(FullAuctionJourneyPageObjects.SubmitBidButton()), "Submit Bid button is enabled");
    }

    public void verifySubmitBidButtonIsNotDisplayed() throws Exception {
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementNotPresent(FullAuctionJourneyPageObjects.SubmitBidButton()), "Pop up is not dismissed");
    }

    public void clickOnSubmitBidButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.SubmitBidButton(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.SubmitBidButton());
        Browser.click(FullAuctionJourneyPageObjects.SubmitBidButton());
    }

    public void clickOnAuctionSideMenuButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionSideMenuButton(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.AuctionSideMenuButton());
        Browser.click(FullAuctionJourneyPageObjects.AuctionSideMenuButton());
    }

    public void clickOnClosedAuctionsTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ClosedAuctionsTab(), 40);
        Browser.executeJSScroll(-500);
        Browser.waitForSeconds(1);
        Browser.click(FullAuctionJourneyPageObjects.ClosedAuctionsTab());
    }

    public void clickOnActiveAuctionsTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ActiveAuctionsTab(), 40);
        Browser.executeJSScroll(-500);
        Browser.waitForSeconds(1);
        Browser.click(FullAuctionJourneyPageObjects.ActiveAuctionsTab());
    }

    public void clickOnContinueButton() throws Exception {
        while (Browser.isElementNotPresent(FullAuctionJourneyPageObjects.ContinueButton())) {
            Browser.waitForSeconds(1);
        }
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 40);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ContinueButton(), 40);
        Browser.click(FullAuctionJourneyPageObjects.ContinueButton());
    }

    public void clickOnDownloadContractLink() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.DownloadContractLink(), 40);
        Browser.click(FullAuctionJourneyPageObjects.DownloadContractLink());
    }

    public void clickOnRejectButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.RejectButton(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.RejectButton());
        Browser.click(FullAuctionJourneyPageObjects.RejectButton());
    }

    public void verifyConfirmRejectionButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ConfirmRejectionButton(), 50);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ConfirmRejectionButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(FullAuctionJourneyPageObjects.ConfirmRejectionButton()), "Confirm Rejection button is enabled");
    }

    public void clickOnApproveButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ApproveButton(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.ApproveButton());
        Browser.click(FullAuctionJourneyPageObjects.ApproveButton());
    }

    public void clickOnConfirmRejectionButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ConfirmRejectionButton(), 40);
        Browser.click(FullAuctionJourneyPageObjects.ConfirmRejectionButton());
    }

    public void verifySuccessfullyRejectedMessageIsDisplayed() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(FullAuctionJourneyPageObjects.RejectSuccessMessage()), "Successfully rejected message is not displayed");
    }

    public void clickOnAuctionStatusDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionStatusDropdown(), 40);
        Browser.click(FullAuctionJourneyPageObjects.AuctionStatusDropdown());
    }

    public void verifyAuctionStatusDropdownIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionStatusDropdownList(), 40);
        List<WebElement> elements = Browser.getWebElements(FullAuctionJourneyPageObjects.AuctionStatusDropdownList());
        logger.addScreenshot("");
        Assert.assertFalse(elements.isEmpty(), "List of auction status is not displayed");
    }

    public void verifySearchButtonIsClickable() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.SearchButtonForAuction(), 40);
        logger.addScreenshot("");
        Assert.assertFalse(Browser.isElementEnabled(FullAuctionJourneyPageObjects.SearchButtonForAuction()), "Search button is not clickable");
    }

    public void clickOnSearchButtonOnAuctionPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.SearchButtonForAuction(), 40);
        Browser.click(FullAuctionJourneyPageObjects.SearchButtonForAuction());
    }

    public void verifyImageViewerPopupIsDisplayed() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(FullAuctionJourneyPageObjects.CloseBtnOnPopup()), "Image viewer pop is not displayed");
    }

    public void clickOnSearchButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.SearchButton(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.SearchButton());
        Browser.click(FullAuctionJourneyPageObjects.SearchButton());
    }

    public void clickOnImportNewAuctionUnitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ImportNewAuctionUnitButton(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.ImportNewAuctionUnitButton());
        Browser.click(FullAuctionJourneyPageObjects.ImportNewAuctionUnitButton());
    }

    public void clickOnDiscardImportButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.DiscardImportButton(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.DiscardImportButton());
        Browser.click(FullAuctionJourneyPageObjects.DiscardImportButton());
    }

    public void clickOnAgreeButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AgreeButton(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.AgreeButton());
        Browser.click(FullAuctionJourneyPageObjects.AgreeButton());
    }

    public void clickOnCommitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.CommitButton(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.CommitButton());
        Browser.click(FullAuctionJourneyPageObjects.CommitButton());
    }

    public void clickOnTheUnitModel() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.UnitsModelPublishStatus(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.UnitsModelPublishStatus());
        Browser.click(FullAuctionJourneyPageObjects.UnitsModelPublishStatus());
    }

    public void clickOnTheAuctionLegalTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionLegalTab(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.AuctionLegalTab());
        Browser.click(FullAuctionJourneyPageObjects.AuctionLegalTab());
    }

    public void clickOnTheAuctionSettingsTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionSettingsTab(), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.AuctionSettingsTab());
        Browser.click(FullAuctionJourneyPageObjects.AuctionSettingsTab());
    }

    public void getAuctionDateAndTime() throws Exception {
        String startDate = Browser.getAttributeValue(FullAuctionJourneyPageObjects.AuctionStartDateInput(), "value");
        String endDate = Browser.getAttributeValue(FullAuctionJourneyPageObjects.AuctionEndDateInput(), "value");
        String startTimeHr = Browser.getAttributeValue(FullAuctionJourneyPageObjects.inputStartAuctionHours(), "value");
        String startTimeMin = Browser.getAttributeValue(FullAuctionJourneyPageObjects.inputStartAuctionMinutes(), "value");
        String endTimeHr = Browser.getAttributeValue(FullAuctionJourneyPageObjects.inputEndAuctionHours(), "value");
        String endTimeMin = Browser.getAttributeValue(FullAuctionJourneyPageObjects.inputEndAuctionMinutes(), "value");
        TestDataManager.addDependantGlobalTestData("Auctions", "startDate", startDate);
        TestDataManager.writeDependantGlobalTestData("Auctions");
        TestDataManager.addDependantGlobalTestData("Auctions", "endDate", endDate);
        TestDataManager.writeDependantGlobalTestData("Auctions");
        TestDataManager.addDependantGlobalTestData("Auctions", "startTimeHr", startTimeHr);
        TestDataManager.writeDependantGlobalTestData("Auctions");
        TestDataManager.addDependantGlobalTestData("Auctions", "startTimeMin", startTimeMin);
        TestDataManager.writeDependantGlobalTestData("Auctions");
        TestDataManager.addDependantGlobalTestData("Auctions", "endTimeHr", endTimeHr);
        TestDataManager.writeDependantGlobalTestData("Auctions");
        TestDataManager.addDependantGlobalTestData("Auctions", "endTimeMin", endTimeMin);
        TestDataManager.writeDependantGlobalTestData("Auctions");
    }

    public void editAuctionUnitFile(String startDate, String endDate, String startHour, String startMinute, String endHour, String endMinute) throws IOException, IOException {
        String startTime = startHour + ":" + startMinute;
        String endTime = endHour + ":" + endMinute;
        startDate = startDate.split("/")[0] + "-" + startDate.split("/")[1].replaceFirst("^0*", "") + "-" + startDate.split("/")[2].replaceFirst("^0*", "");
        endDate = endDate.split("/")[0] + "-" + endDate.split("/")[1].replaceFirst("^0*", "") + "-" + endDate.split("/")[2].replaceFirst("^0*", "");
        String filePath = String.valueOf(Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "auction_unit.xlsx"));
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(1);
        int totalCell = row.getLastCellNum();
        for (int i = 0; i < totalCell; i++) {
            Cell cell = row.getCell(i);
            switch (i) {
                case 51:
                    cell.setCellValue(startDate);
                    break;
                case 52:
                    cell.setCellValue(startTime);
                    break;
                case 53:
                    cell.setCellValue(endDate);
                    break;
                case 54:
                    cell.setCellValue(endTime);
                    break;
            }
        }
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        fos.close();
    }

    public void enterNumberOfAssets(String assets) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.NumberOfAssets(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.NumberOfAssets());
        Browser.setText(FullAuctionJourneyPageObjects.NumberOfAssets(), assets);
    }

    public void enterTextInUnderSupervision(String text) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.UnderSupervision(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.UnderSupervision());
        Browser.setText(FullAuctionJourneyPageObjects.UnderSupervision(), text);
    }

    public void enterCallNumber(String text) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.CallNumber(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.CallNumber());
        Browser.setText(FullAuctionJourneyPageObjects.CallNumber(), text);
    }

    public void enterWhatsAppNumber(String text) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.WhatsAppNumber(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.WhatsAppNumber());
        Browser.setText(FullAuctionJourneyPageObjects.WhatsAppNumber(), text);
    }

    public void enterValNumber(String text) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ValNumber(), 40);
        CommonUtilityPage.moveToObject(FullAuctionJourneyPageObjects.ValNumber());
        Browser.setText(FullAuctionJourneyPageObjects.ValNumber(), text);
    }

    public void clickOnAuctionMediaTab() throws Exception {
        Browser.waitUntilPresenceOfElement(FullAuctionJourneyPageObjects.AuctionMediaTab(), 500);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionMediaTab(), 500);
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.AuctionMediaTab(), 500);
        Browser.moveToElement(FullAuctionJourneyPageObjects.AuctionMediaTab());
        Browser.click(FullAuctionJourneyPageObjects.AuctionMediaTab());
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.saveBTN(), 500);
    }

    public void clickOnSignContractBanner() throws Exception {
        if (!Browser.isElementPresent(FullAuctionJourneyPageObjects.ApproveButton())) {
            while (Browser.isElementNotPresent(FullAuctionJourneyPageObjects.SignContractBanner())) {
                driver.navigate().refresh();
                Browser.waitForSeconds(2);
            }
            Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.SignContractBanner(), 40);
            Browser.moveToElement(FullAuctionJourneyPageObjects.SignContractBanner());
            Browser.click(FullAuctionJourneyPageObjects.SignContractBanner());
        }
    }

    public void navigateToTheWonAuction(String projName) throws Exception {
        Browser.waitUntilPresenceOfElement(FullAuctionJourneyPageObjects.ViewAuctionButton(projName), 40);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ViewAuctionButton(projName), 40);
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.ViewAuctionButton(projName), 40);
        Browser.moveToElement(FullAuctionJourneyPageObjects.ViewAuctionButton(projName));
        Browser.executeJSScroll(200);
        Browser.waitForSeconds(1);
        Browser.click(FullAuctionJourneyPageObjects.ViewAuctionButton(projName));
    }

    public void clickOnViewInvoiceButton() {
        Browser.waitUntilPresenceOfElement(FullAuctionJourneyPageObjects.ViewInvoiceButton(), 40);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ViewInvoiceButton(), 40);
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.ViewInvoiceButton(), 40);
        Browser.executeJSScroll(500);
        Browser.waitForSeconds(1);
        Browser.click(FullAuctionJourneyPageObjects.ViewInvoiceButton());
    }

    public void clickOnViewContractButton() {
        Browser.waitUntilPresenceOfElement(FullAuctionJourneyPageObjects.ViewContractButton(), 40);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ViewContractButton(), 40);
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.ViewContractButton(), 40);
        Browser.executeJSScroll(500);
        Browser.waitForSeconds(1);
        Browser.click(FullAuctionJourneyPageObjects.ViewContractButton());
    }

    public void clickOnViewAcknowledgmentButton() {
        Browser.waitUntilPresenceOfElement(FullAuctionJourneyPageObjects.ViewAcknowledgmentButton(), 40);
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.ViewAcknowledgmentButton(), 40);
        Browser.waitUntilElementToBeClickable(FullAuctionJourneyPageObjects.ViewAcknowledgmentButton(), 40);
        Browser.executeJSScroll(500);
        Browser.waitForSeconds(1);
        Browser.click(FullAuctionJourneyPageObjects.ViewAcknowledgmentButton());
    }
}