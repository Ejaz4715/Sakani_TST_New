package sa.nhc.web.pages.exisitng;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sa.nhc.web.objects.FullAuctionJourneyPageObjects;
import sa.nhc.web.objects.RegisterOfInterestPageObjects;
import sa.nhc.web.objects.SortingPageObject;
import sa.nhc.web.objects.exisitng.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static com.testcrew.web.Browser.*;

public class CommonUtilityPage {

    /**
     * Method to check if the value has been entered in Input Field
     *
     * @param value   - Value to be validated
     * @param element - Locator of Input Field
     */
    public static void verifyValueIsEntered(String value, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String ActualVal = getWebElement(element).getAttribute("value");
        logger.addScreenshot("");
        Assert.assertTrue(ActualVal.contains(value), "Actual value (" + ActualVal + ") and expected (" + value + ")");
    }
    public static void verifyCityIsDisplayed(String value, By element) {
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(element, 40);
        Browser.moveToElement(element);
        WebElement actualValue = getWebElement(element);
        String valueTXT = actualValue.getAttribute("class");
        if (valueTXT.contains("touched")) {
            status = true;
        }
        logger.addScreenshot("Displayed value " + actualValue);
        Assert.assertTrue(status, "Actual displayed value is (" + valueTXT + "). Expected should be (" + value + ")");
    }
    public static void clickOnViewButtonFromFilter() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.viewButton(), 20);
        Browser.click(FullAuctionJourneyPageObjects.viewButton());
    }

    /**
     * Method to check if the value is NOT entered in Input Field
     *
     * @param value   - Value to be validated
     * @param element - Locator of Input Field
     */
    public static void verifyValueIsNotEntered(String value, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String val = getWebElement(element).getAttribute("value");
        Assert.assertFalse(val.contains(value), "Value is entered");
    }

    /**
     * Method to check if the value is NOT entered in Input Field
     *
     * @param valueAR - Value to be validated
     * @param element - Locator of Input Field
     */
    public static void verifyValueIsNotEntered(String valueAR, String valueEN, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String val = getWebElement(element).getAttribute("value");
        Assert.assertFalse(val.contains(valueAR) || val.contains(valueEN), "Value is entered");
    }

    /**
     * Method to check if the error message is displayed when required value is not provided
     *
     * @param expectedValueEN - Value to be validated in English
     * @param expectedValueAR - value to be validated in Arabic
     * @param element         - Locator of Input Field
     */
    public static void verifyErrorMessageIsDisplayed(String expectedValueEN, String expectedValueAR, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String val = getWebElement(element).getText().toLowerCase();
        boolean status = val.contains(expectedValueEN.toLowerCase()) || val.contains(expectedValueAR);
        Assert.assertTrue(status, "Actual error message is (" + val + ") and expected should be (" + expectedValueEN + "OR (" + expectedValueAR + ")");
    }

    /**
     * Method to check if the error message is displayed when required value is not provided
     *
     * @param expectedValueEN - Value to be validated in English
     * @param expectedValueAR - value to be validated in Arabic
     * @param element         - Locator of Input Field
     */
    public static void verifyPopupMessageIsDisplayed(String expectedValueEN, String expectedValueAR, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String val = Browser.getText(element).toLowerCase();
        logger.addScreenshot("");
        Assert.assertTrue(val.contains(expectedValueEN.toLowerCase()) || val.contains(expectedValueAR),
                "Actual message is (" + val + "), Expected should be (" + expectedValueEN + ") OR (" + expectedValueAR + ")");
    }

    /**
     * Select an option from the list based on the language of site
     *
     * @param optionAR - option to be selected in Arabic
     * @param optionEN - option to be selected in English
     * @param element  - Locator of the list object
     */
    public static void selectFromList(String optionAR, String optionEN, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        Browser.moveToElement(element);
        List<WebElement> selectList = Browser.getWebElements(element);
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(optionAR) || getListName.contains(optionEN)) {
                listName.click();
                break;
            }
        }
    }

    /**
     * Select an option from the list
     *
     * @param option  - option to be selected in Arabic
     * @param element - Locator of the list object
     */
    public static void selectFromList(String option, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        Browser.moveToElement(element);
        List<WebElement> selectList = Browser.getWebElements(element);
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(option)) {
                listName.click();
                break;
            }
        }
    }

    public static void selectFromLists(String option, By element1, By element2) {
        Browser.waitUntilVisibilityOfElement(element1, 40);
        Browser.moveToElement(element1);
        Browser.click(element1);
        List<WebElement> selectList = Browser.getWebElements(element2);
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(option)) {
                listName.click();
                break;
            }
        }
    }

    /**
     * Validate the selected option is same as expected
     *
     * @param optionAR - option to be selected in Arabic
     * @param optionEN - option to be selected in English
     * @param element  - Locator of the list object
     */
    public static void verifyOptionIsSelected(String optionAR, String optionEN, By element) {
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(element, 40);
        WebElement selectedOPT = getWebElement(element);
        String optionTXT = selectedOPT.getText().toLowerCase();
        if (optionTXT.contains(optionAR) || optionTXT.contains(optionEN.toLowerCase())) {
            status = true;
        }
        logger.addScreenshot("");
        Assert.assertTrue(status, "Actual selected option is (" + optionTXT + "). Expected should be (" + optionAR + ") OR (" + optionEN + ")");
    }

    /**
     * Validate the selected option is same as expected
     *
     * @param option  - option to be selected in Arabic
     * @param element - Locator of the list object
     */
    public static void verifyOptionIsSelected(String option, By element) {
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(element, 40);
        WebElement selectedOPT = getWebElement(element);
        String optionTXT = selectedOPT.getText().toLowerCase();
        if (optionTXT.contains(option.toLowerCase())) {
            status = true;
        }
        logger.addScreenshot("");
        Assert.assertTrue(status, "Actual selected option is (" + optionTXT + "). Expected should be (" + option + ")");
    }

    /**
     * Verify a Text value is displayed
     *
     * @param valueAR - value to be validated in Arabic
     * @param valueEN - value to be validated in English
     * @param element - Locator of the object
     */
    public static void verifyValueIsDisplayed(String valueAR, String valueEN, By element) {
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(element, 60);
        Browser.moveToElement(element);
        WebElement element1 = getWebElement(element);
        String valueTXT = element1.getText().toLowerCase();
        if (valueTXT.contains(valueAR) || valueTXT.contains(valueEN.toLowerCase())) {
            status = true;
        }
        logger.addScreenshot("");
        Assert.assertTrue(status, "Actual displayed value is (" + valueTXT + "). Expected should be (" + valueAR + ") OR (" + valueEN + ")");
    }

    /**
     * Verify a Text value is displayed
     *
     * @param value   - value to be validated
     * @param element - Locator of the object
     */
    public static void verifyValueIsDisplayed(String value, By element) {
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(element, 40);
        Browser.moveToElement(element);
        WebElement actualValue = getWebElement(element);
        String valueTXT = actualValue.getText().toLowerCase();
        if (valueTXT.contains(value.toLowerCase())) {
            status = true;
        }
        logger.addScreenshot("Displayed value " + actualValue);
        Assert.assertTrue(status, "Actual displayed value is (" + valueTXT + "). Expected should be (" + value + ")");
    }

    /**
     * Method to upload files
     *
     * @param filePath - path of the file to be uploaded
     * @param element  - locator of the element
     */
    public static void UploadAttachment(String filePath, By element) {
        String path = System.getProperty("user.dir") + filePath;
        WebElement ele = getWebElement(element);
        ele.sendKeys(path);
    }

    /**
     * Method to get current date OR to get future/past date
     *
     * @param reqYear  - required year (Negative value to get to any previous years and positive for future)
     * @param reqMonth - required month (Negative value to get to any previous months and positive for future)
     * @param reqDay   - required day (Negative value to get to any previous days and positive for future)
     *                 <p>
     *                 All the parameters should be 0's to get current date
     */
    public static String getDate(int reqYear, int reqMonth, int reqDay) {
        LocalDate currentDate = LocalDate.now();
        if (reqYear > 0) {
            currentDate = currentDate.plusYears(reqYear);
        } else if (reqYear < 0) {
            reqYear = Math.abs(reqYear);
            currentDate = currentDate.minusYears(reqYear);
        }
        if (reqMonth > 0) {
            currentDate = currentDate.plusMonths(reqMonth);
        } else if (reqMonth < 0) {
            reqMonth = Math.abs(reqMonth);
            currentDate = currentDate.minusMonths(reqMonth);
        }
        if (reqDay > 0) {
            currentDate = currentDate.plusDays(reqDay);
        } else if (reqDay < 0) {
            reqDay = Math.abs(reqDay);
            currentDate = currentDate.minusDays(reqDay);
        }
        String year = String.valueOf(currentDate.getYear());
        String month = String.format("%02d", currentDate.getMonthValue());
        String day = String.format("%02d", currentDate.getDayOfMonth());
        return year + "/" + month + "/" + day;
    }

    /**
     * Method to get Hijri date with month name
     */
    public static String getHijriDate() {
        HijrahDate hijrahDate = HijrahDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", new Locale("ar"));
        return hijrahDate.format(formatter);
    }
    public static String getHijriDate(int daysAdjustment) {
        HijrahDate hijrahDate = HijrahDate.now();
        // Adjust the Hijri date by adding/subtracting the specified number of days
        HijrahDate adjustedHijrahDate = hijrahDate.plus(daysAdjustment, ChronoUnit.DAYS);
        // Format the adjusted Hijri date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", new Locale("ar"));
        return adjustedHijrahDate.format(formatter);
    }

    /**
     * Method to get current Time OR to get future/pastime
     *
     * @param reqHour   - required Hour (Negative value to get to any previous Hour and positive for future)
     * @param reqMinute - required Minute (Negative value to get to any previous Minute and positive for future)
     * @param reqSecond - required Second (Negative value to get to any previous Second and positive for future)
     *                  <p>
     *                  All the parameters should be 0's to get current Time
     */
    public static String getTime(int reqHour, int reqMinute, int reqSecond) {
        TimeZone zone = TimeZone.getTimeZone("Asia/Riyadh");
        LocalTime currentTime = LocalTime.now(zone.toZoneId());
        if (reqHour > 0) {
            currentTime = currentTime.plusHours(reqHour);
        } else if (reqHour < 0) {
            reqHour = Math.abs(reqHour);
            currentTime = currentTime.minusHours(reqHour);
        }
        if (reqMinute > 0) {
            currentTime = currentTime.plusMinutes(reqMinute);
        } else if (reqMinute < 0) {
            reqMinute = Math.abs(reqMinute);
            currentTime = currentTime.minusMinutes(reqMinute);
        }
        if (reqSecond > 0) {
            currentTime = currentTime.plusSeconds(reqSecond);
        } else if (reqSecond < 0) {
            reqSecond = Math.abs(reqSecond);
            currentTime = currentTime.minusSeconds(reqSecond);
        }
        String hr = String.format("%02d", currentTime.getHour());
        String min = String.format("%02d", currentTime.getMinute());
        String sec = String.format("%02d", currentTime.getSecond());
        return hr + ":" + min + ":" + sec;
    }

    /**
     * Method to validate a new TAB is open and attachment is displayed the browser
     */
    public static void verifyNewTabIsOpened() {
        int size = 0;
        Set<String> tabs = driver.getWindowHandles();
        String[] arrayTabs = tabs.toArray(new String[0]);
        while (size < 2) {
            tabs = driver.getWindowHandles();
            arrayTabs = tabs.toArray(new String[0]);
            size = arrayTabs.length;
        }
        driver.switchTo().window(arrayTabs[0]);
        String oldURL = driver.getCurrentUrl();
        driver.switchTo().window(arrayTabs[1]);
        String newURL = driver.getCurrentUrl();
        boolean status = !(newURL.equalsIgnoreCase(oldURL));
        Assert.assertTrue(status, "New tab is not opened");
        logger.addScreenshot("Attachment is displayed in new browser tab");
    }

    /**
     * Method to validate a new TAB is open and switch to it
     */
    public static void verifyNewTabIsOpenedAndSwitch() {
        int size = 0;
        Set<String> tabs = driver.getWindowHandles();
        String[] arrayTabs = tabs.toArray(new String[0]);
        while (size < 2) {
            tabs = driver.getWindowHandles();
            arrayTabs = tabs.toArray(new String[0]);
            size = arrayTabs.length;
        }
        Browser.driver.switchTo().window(arrayTabs[1]);
        logger.addScreenshot("");
        Assert.assertNotEquals(size, 0, "New tab is not opened");
    }

    /**
     * Method to move the pointer to the element with a delay
     *
     * @param element - Element locator
     */
    public static void moveToObject(By element) {
        logger.debug("Move to element :" + (element));
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(element)).pause(100L);
        actions.build().perform();
    }

    public static void ClickOnFilter() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.FilterBTN(), 50);
        Browser.waitUntilElementToBeClickable(HomePageObjects.FilterBTN(), 50);
        Browser.click(HomePageObjects.FilterBTN());
    }

    public static void MarketPlace() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.MarketPlaceBTN(), 50);
        Browser.click(HomePageObjects.MarketPlaceBTN());
        Browser.waitUntilVisibilityOfElement(HomePageObjects.awareness_marketplace_closeBtn(), 50);
        Browser.click(HomePageObjects.awareness_marketplace_closeBtn());
    }

    public static void verifyTheListsIsDisplayed(String labelAR, String labelEN, By element) throws Exception {
        Browser.waitUntilPresenceOfElement(element, 50);
        List<WebElement> list = Browser.getWebElements(element);
        boolean status = true;
        ArrayList<String> arr = new ArrayList<>();
        for (WebElement listElement : list) {
            String text = listElement.getText();
            arr.add(text);
        }
        String lbl_en = labelAR;
        String lbl_ar = labelEN;
        int count = 0;
        for (String s : arr) {
            if (s.contains(lbl_en) || s.contains(lbl_ar)) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            if (!(arr.get(i).contains(lbl_en) || arr.get(i).contains(lbl_ar))) {
                status = false;
            }
        }
        Assert.assertTrue(status, "Expected label is not displayed at the top");
    }

    public static void verifyElementIsDisplayed(String elementName, By element) throws Exception {
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(element, 60);
        if (Browser.isElementPresent(element)) {
            status = true;
            Browser.waitUntilVisibilityOfElement(element, 60);
            Browser.moveToElement(element);
            logger.addScreenshot(elementName + " is displayed");
        } else {
            logger.addScreenshot(elementName + " is not displayed");
        }
        Assert.assertTrue(status, elementName + " is not displayed");
    }

    public static void clickOnElement(By element) {
        Browser.waitUntilPresenceOfElement(element, 60);
        Browser.waitUntilVisibilityOfElement(element, 60);
        Browser.waitUntilElementToBeClickable(element, 60);
        Browser.moveToElement(element);
        Browser.waitForSeconds(1);
        Browser.click(element);
    }
}
