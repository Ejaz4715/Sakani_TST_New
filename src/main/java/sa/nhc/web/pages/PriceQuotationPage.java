package sa.nhc.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.FullBookingJourneyPageObjects;
import sa.nhc.web.objects.exisitng.*;
import sa.nhc.web.objects.PriceQuotationPageObjects;

import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import static com.testcrew.web.Browser.*;

public class PriceQuotationPage {
    String unitCodeText;

    public void ClickOnApartment() throws Exception {
        Browser.waitUntilInvisibilityOfElement(PriceQuotationPageObjects.ApartmentDivLoader(), 50);
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.ApartmentDiv(), 50);
        Browser.moveToElement(PriceQuotationPageObjects.ClickOnApartment());
        Browser.click(PriceQuotationPageObjects.ClickOnApartment());
        logger.addScreenshot("Click On Apartment");
    }

    public void LowPowerWarningMSGExistence() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.LowPowerWarningMSG(), 50);
        boolean isExist = Browser.isElementDisplayed(PriceQuotationPageObjects.LowPowerWarningMSG());
        Assert.assertTrue(isExist, "The Low Power Warning MSG is not exist");
        logger.addScreenshot("Low Power Warning MSG Existence");
    }

    public void ClickOnMyActivities() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.ClickOnMyActivitiesBTN(), 50);
        Browser.moveToElement(PriceQuotationPageObjects.ClickOnMyActivitiesBTN());
        Browser.click(PriceQuotationPageObjects.ClickOnMyActivitiesBTN());
    }

    public void ClickOnBookings() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.ClickOnBookingsBTN(), 50);
        Browser.click(PriceQuotationPageObjects.ClickOnBookingsBTN());
    }

    public void ClickOnViewBookings() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.ClickOnViewBookingsBTN(), 50);
        WebElement unitCode = Browser.getWebElement(PriceQuotationPageObjects.unitCode());
        unitCodeText = unitCode.getText();
        Browser.click(PriceQuotationPageObjects.ClickOnViewBookingsBTN());
    }

    public void ClickOnContinueButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.FinancialRecommendationCertificatePageTitle(), 50);
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ContinueButton(), 40);
        Browser.moveToElement(FullBookingJourneyPageObjects.ContinueButton());
        Browser.click(FullBookingJourneyPageObjects.ContinueButton());
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 40);
    }

    public void ClickOnCancelForSignContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.ClickOnCancelForSignContractBTN(), 50);
        Browser.click(PriceQuotationPageObjects.ClickOnCancelForSignContractBTN());
    }

    public void ClickOnConfirmBooking() throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 40);
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.ClickOnConfirmBookingBTN(), 50);
        Browser.moveToElement(PriceQuotationPageObjects.ClickOnConfirmBookingBTN());
        Browser.click(PriceQuotationPageObjects.ClickOnConfirmBookingBTN());
    }

    public void ClickOnApproveContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.ClickOnApproveContractBTN(), 50);
        Browser.moveToElement(PriceQuotationPageObjects.ClickOnApproveContractBTN());
        Browser.click(PriceQuotationPageObjects.ClickOnApproveContractBTN());
    }

    public void ClickOnQuotationPriceViewBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.QuotationPriceViewBTN(), 50);
        Browser.moveToElement(PriceQuotationPageObjects.QuotationPriceViewBTN());
        Browser.click(PriceQuotationPageObjects.QuotationPriceViewBTN());
        Browser.waitUntilInvisibilityOfElement(PriceQuotationPageObjects.ApartmentDivLoader(), 50);
    }

    public void ExistenceChecker(By locator, String nameOfLocator) {
        waitUntilVisibilityOfElement(locator, 50);
        moveToElement(locator);
        WebElement label = driver.findElement(locator);
        boolean labelDisplayed = label.isDisplayed();
        logger.addScreenshot(nameOfLocator + " Label Existence Checker");
        Assert.assertTrue(labelDisplayed, "The" + nameOfLocator + " is not Displayed");
    }

    public void PriceQuotationViewBTNisDisabledChecker() throws Exception {
        Browser.waitUntilPresenceOfElement(PriceQuotationPageObjects.QuotationPriceViewBTN(), 50);
        boolean isClickable;
        try {
            WebElement viewBTN = Browser.getWebElement(PriceQuotationPageObjects.QuotationPriceViewBTN());
            viewBTN.click();
            isClickable = true;
        } catch (Exception e) {
            isClickable = false;
        }
        logger.addScreenshot("");
        Assert.assertFalse(isClickable, "The Button Is Enabled");
    }

    public void PriceQuotationViewBTNisEnabledChecker() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.QuotationPriceViewBTN(), 50);
        Browser.moveToElement(PriceQuotationPageObjects.QuotationPriceViewBTN());
        Browser.click(PriceQuotationPageObjects.QuotationPriceViewBTN());
        boolean isClickable;
        try {
            Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.ContractPopUp(), 50);
            isClickable = true;
        } catch (Exception e) {
            isClickable = false;
        }
        logger.addScreenshot("");
        Assert.assertTrue(isClickable, "The Button Is Disabled");
    }

    public void DocumentDownload() throws Exception {
        String folderPath = System.getProperty("user.dir") + "\\src\\main\\resources\\downloads";
        boolean b = false;
        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("The provided path is not a directory.");
        }
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    b = file.delete();
                    if (!b) {
                        System.out.println("Failed to delete file: " + file.getName());
                    }
                }
            }
        }
        System.out.println("File is deleted ? -> " + b);
        TCRobot rb = new TCRobot();

        for (int i = 0; i < 8; i++) {
            rb.keyPress(KeyEvent.VK_TAB);
            rb.keyRelease(KeyEvent.VK_TAB);
            rb.delay(500);
        }
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        rb.delay(2000);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        CommonUtilityPage.verifyNewTabIsOpened();
        String urlValue = driver.getCurrentUrl();
        TestDataManager.addDependantGlobalTestData("Downloaded_Document_URL", "urlTXT", urlValue);
        TestDataManager.writeDependantGlobalTestData("Downloaded_Document_URL");
        logger.addScreenshot("Download the Document");
    }

    public void readTheDownloadedFileAndVerifyDeveloperNameExistence(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Downloaded_Document_URL"));
        URL url = new URL(data.get("urlTXT"));
        InputStream iStream = url.openStream();
        BufferedInputStream bfStream = new BufferedInputStream(iStream);
        PDDocument document = PDDocument.load(bfStream);
        PDFTextStripper stripper = new PDFTextStripper();
        String pdfText = stripper.getText(document);
        logger.addScreenshot("Developer Name Existence Checker");
        Assert.assertTrue(pdfText.contains("شركة الضاحية"), "The Developer Name is not Exist");
    }

    public void readTheDownloadedFileAndVerifyUnitCodeExistence(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Downloaded_Document_URL"));
        URL url = new URL(data.get("urlTXT"));
        InputStream iStream = url.openStream();
        BufferedInputStream bfStream = new BufferedInputStream(iStream);
        PDDocument document = PDDocument.load(bfStream);
        PDFTextStripper stripper = new PDFTextStripper();
        String pdfText = stripper.getText(document);
        String[] unitCodeList = unitCodeText.split("-");
        String unitCodeExpected = unitCodeList[unitCodeList.length - 1];
        logger.addScreenshot("Unit Code Existence Checker");
        Assert.assertTrue(pdfText.contains(unitCodeExpected), "The Unit Code is not Exist");
    }

    public void readTheDownloadedFileAndVerifyProjectTypeExistence(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Downloaded_Document_URL"));
        URL url = new URL(data.get("urlTXT"));
        InputStream iStream = url.openStream();
        BufferedInputStream bfStream = new BufferedInputStream(iStream);
        PDDocument document = PDDocument.load(bfStream);
        PDFTextStripper stripper = new PDFTextStripper();
        String pdfText = stripper.getText(document);
        logger.addScreenshot("Project Type Existence Checker");
        Assert.assertTrue(pdfText.contains("الضاحية المثالية للتطوير"), "The Project Type is not Exist");
    }

    public void readTheDownloadedFileAndVerifyTotalPriceExistenceURL(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Downloaded_Document_URL"));
        URL url = new URL(data.get("urlTXT"));
        InputStream iStream = url.openStream();
        BufferedInputStream bfStream = new BufferedInputStream(iStream);
        PDDocument document = PDDocument.load(bfStream);
        PDFTextStripper stripper = new PDFTextStripper();
        String pdfText = stripper.getText(document);
        logger.addScreenshot("The total price number Existence Checker");
        Assert.assertTrue(pdfText.contains("94500"), "The total price number is not Exist");
    }

    public void isDocumentDownloaded() {
        int size = 0;
        Set<String> tabs = Browser.driver.getWindowHandles();
        String[] arrayTabs = tabs.toArray(new String[0]);
        while (size < 2) {
            tabs = Browser.driver.getWindowHandles();
            arrayTabs = tabs.toArray(new String[0]);
            size = arrayTabs.length;
        }
        Browser.driver.switchTo().window(arrayTabs[0]);
        String oldURL = Browser.driver.getCurrentUrl();
        Browser.driver.switchTo().window(arrayTabs[1]);
        String newURL = Browser.driver.getCurrentUrl();
        boolean status = !(newURL.equalsIgnoreCase(oldURL));
        logger.addScreenshot("Document downloaded Checker");
        Assert.assertTrue(status, "Document is not downloaded");
    }

    public void cLoseRatingPopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.cLoseRatingPopUpMSG(), 50);
        Browser.moveToElement(PriceQuotationPageObjects.ratingCancelBTN());
        Browser.click(PriceQuotationPageObjects.ratingCancelBTN());
    }

    public void verifySuccessMessageForUnitBooking() throws Exception {
        Browser.waitUntilInvisibilityOfElement(PriceQuotationPageObjects.ApartmentDivLoader(), 40);
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.BookingConfirmedMSG(), 30);
        String BookingMsg = Browser.getWebElement(PriceQuotationPageObjects.BookingConfirmedMSG()).getText();
        logger.addScreenshot("");
        Assert.assertTrue(BookingMsg.contains("Booking confirmed") || BookingMsg.contains("تاكيد الحجز"), "Success message is not displayed");
    }

    public void VerifyUserTypeExistence() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.EligibilityExistence(), 30);
        String BookingMsg = Browser.getWebElement(PriceQuotationPageObjects.EligibilityExistence()).getText();
        logger.addScreenshot("");
        Assert.assertTrue(BookingMsg.contains("Eligibility") || BookingMsg.contains("الاستحقاق"), "Eligibility User Type is not exist");
    }

    public void VerifyUserEligibleExistence() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.userIsEligible(), 30);
        String BookingMsg = Browser.getWebElement(PriceQuotationPageObjects.userIsEligible()).getText();
        logger.addScreenshot("");
        Assert.assertTrue(BookingMsg.contains("You are eligible for housing support") || BookingMsg.contains("تهانينا، أنت الآن مستحق للدعم السكني"), "The User Is not eligible");
    }

    public void priceExceedsFinancialWarningMSGExistence() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.priceExceedsFinancialWarningMSG(), 50);
        boolean isExist = Browser.isElementDisplayed(PriceQuotationPageObjects.priceExceedsFinancialWarningMSG());
        logger.addScreenshot("");
        Assert.assertTrue(isExist, "The price Exceeds Financial Warning MSG is not exist");
    }

    public void UpdateFinancialAdvisoryLinkExistence() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.UpdateFinancialAdvisoryLink(), 50);
        boolean isExist = Browser.isElementDisplayed(PriceQuotationPageObjects.UpdateFinancialAdvisoryLink());
        logger.addScreenshot("");
        Assert.assertTrue(isExist, "The Update Financial Advisory Link is not exist");
    }

    public void clickOnFinancialAdvisoryLink() throws Exception {
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.UpdateFinancialAdvisoryLink(), 50);
        Browser.click(PriceQuotationPageObjects.UpdateFinancialAdvisoryClickableLink());
        Browser.waitUntilVisibilityOfElement(PriceQuotationPageObjects.PersonalFinancialInfo(), 50);
        boolean isExist = Browser.isElementDisplayed(PriceQuotationPageObjects.PersonalFinancialInfo());
        logger.addScreenshot("");
        Assert.assertTrue(isExist, "The user is not able to access the link");
    }

    public void ClickOnUserProfileName() throws Exception {
        Browser.waitUntilPresenceOfElement(HomePageObjects.ProfileHover(), 50);
        Browser.moveToElement(HomePageObjects.ProfileHover());
        Browser.waitUntilPresenceOfElement(HomePageObjects.BTNMyProfile(), 50);
        Browser.click(HomePageObjects.BTNMyProfile());
    }
}

