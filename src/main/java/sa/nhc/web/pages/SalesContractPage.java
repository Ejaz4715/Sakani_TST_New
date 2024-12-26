package sa.nhc.web.pages;

import com.testcrew.manager.PDFReportManager;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.SalesContractPageObject;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.util.List;

import static com.testcrew.web.Browser.logger;

public class SalesContractPage {

    public void closePopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.SakaniLogo(), 30);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 30);
        if (Browser.isElementPresent(SalesContractPageObject.UpdatesPopUp())) {
            Browser.click(SalesContractPageObject.UpdatesPopUp());
        } else if (Browser.isElementPresent(SalesContractPageObject.WarningPopUp())) {
            Browser.click(SalesContractPageObject.WarningPopUp());
        } else if (Browser.isElementPresent(SalesContractPageObject.AcceptButton())) {
            Browser.click(SalesContractPageObject.AcceptButton());
        }
    }

    public void selectRoleOfDeveloper(String role) throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.RoleDropdown(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.click(SalesContractPageObject.RoleDropdown());
        List<WebElement> roleList = Browser.getWebElements(SalesContractPageObject.RoleDropdownOptions());
        for (WebElement ele : roleList) {
            String getRole = ele.getText();
            if (getRole.contains(role)) {
                ele.click();
                break;
            }
        }
        PDFReportManager.logger.addScreenshot("Developer role has been selected");
    }

    public void changeUILanguagePartners() throws Exception {
        if (TestConfigManager.getSettingsApplicationLanguage().contains("en")) {
            Browser.waitUntilVisibilityOfElement(SalesContractPageObject.LanguageText(), 40);
            Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
            String language = Browser.getText(SalesContractPageObject.LanguageText());
            if (language.contains("إنجليزي")) {
                Browser.click(SalesContractPageObject.LanguageButton());
            }
        } else if (TestConfigManager.getSettingsApplicationLanguage().contains("ar")) {
            Browser.waitUntilVisibilityOfElement(SalesContractPageObject.LanguageText(), 40);
            Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
            String language = Browser.getText(SalesContractPageObject.LanguageText());
            if (language.contains("Arabic")) {
                Browser.click(SalesContractPageObject.LanguageButton());
            }
        }
    }

    public void clickOnProjectsMenuOption() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.ProjectsMenuOption(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.click(SalesContractPageObject.ProjectsMenuOption());
    }

    public void verifyProjectsPageIsDisplayed() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(SalesContractPageObject.ProjectsPageHeading()), "Project page is not visible");
    }

    public void clickOnSearchByDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.SearchByDropdown(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.click(SalesContractPageObject.SearchByDropdown());
    }

    public void enterProjectNameInSearchBar(String projectName) throws Exception {
        Browser.waitUntilElementToBeClickable(SalesContractPageObject.ProjectNameDropdownInput(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.setText(SalesContractPageObject.ProjectNameDropdownInput(), projectName);
    }

    public void selectProjectNameFromList(String projectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.ProjectNameDropdownList(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.ProjectNameDropdownList());
        List<WebElement> elements = Browser.getWebElements(SalesContractPageObject.ProjectNameDropdownList());
        for (WebElement opt : elements) {
            String name = opt.getText().toLowerCase();
            if (name.contains(projectName.toLowerCase())) {
                opt.click();
                break;
            }
        }
    }

    public void clickOnSearchButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.SearchButton(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.click(SalesContractPageObject.SearchButton());
    }

    public void verifySearchedProjectIsDisplayed(String projectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.SearchedProject(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.SearchedProject());
        String actualName = Browser.getText(SalesContractPageObject.SearchedProject()).toLowerCase();
        Assert.assertTrue(actualName.contains(projectName.toLowerCase()), "Actual project is (" + actualName + ") and expected is (" + projectName + ")");
        logger.addScreenshot("Displayed project name is : " + actualName);
    }

    public void verifySearchButtonIsNotDisplayed() throws Exception {
        logger.addScreenshot("");
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Assert.assertFalse(Browser.isElementPresent(SalesContractPageObject.SearchButton()), "Search button is displayed");
    }

    public void clickOnProjectDetailsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.ProjectDetailsButton(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.click(SalesContractPageObject.ProjectDetailsButton());
    }

    public void verifyProjectDetailsPageIsDisplayed() throws Exception {
        logger.addScreenshot("");
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Assert.assertTrue(Browser.isElementPresent(SalesContractPageObject.ProjectDetailsPageTitle()), "Search button is displayed");
    }

    /**
     * Method to check if the value has been entered in Input Field
     *
     * @param valueEN - Project Type to be validated in English
     * @param valueAR - Project Type to be validated in Arabic
     */
    public void verifyProjectType(String valueEN, String valueAR) throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.ProjectTypeInput(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        String ActualVal = Browser.getWebElement(SalesContractPageObject.ProjectTypeInput()).getAttribute("value");
        logger.addScreenshot("");
        Assert.assertTrue(ActualVal.contains(valueEN) || ActualVal.contains(valueAR), "Actual value (" + ActualVal + ") and expected should be(" + valueEN + ") OR (" + valueAR + ")");
    }

    public void clickOnProjectUnitTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.ProjectUnitsTab(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.ProjectUnitsTab());
        Browser.click(SalesContractPageObject.ProjectUnitsTab());
    }

    public void clickOnSaleContractUnitTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.SaleContractTab(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.click(SalesContractPageObject.SaleContractTab());
    }

    public void clickOnViewAndApproveButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.ViewAndApproveButton(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.click(SalesContractPageObject.ViewAndApproveButton());
    }

    public void clickOnApproveButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.ApproveButton(), 40);
        Browser.waitUntilElementToBeClickable(SalesContractPageObject.ApproveButton(), 40);
        Browser.click(SalesContractPageObject.ApproveButton());
    }


    public void clickOnVerifyCodeButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.VerifyCodeButton(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.click(SalesContractPageObject.VerifyCodeButton());
    }

    /**
     * Method to enter OTP 'Sakani Partners'
     *
     * @param OTP - Confirmation OTP
     */
    public void inputOTP(String OTP) throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.OTP(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.setText(SalesContractPageObject.OTP(), OTP);
    }

    public void verifySalesContractDetailsAreDisplayed() throws Exception {
        logger.addScreenshot("");
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Assert.assertTrue(Browser.isElementPresent(SalesContractPageObject.SalesContractDetails()), "Sale contract details are not displayed in the table");
    }

    public void clickOnSaleContractFileName() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.SaleContractFileNameColumn(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.SaleContractFileNameColumn());
        Browser.click(SalesContractPageObject.SaleContractFileNameColumn());
    }

    public void clickOnSaleContractDownloadButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.SaleContractDownloadButton(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.SaleContractDownloadButton());
        Browser.click(SalesContractPageObject.SaleContractDownloadButton());
    }

    public void enterUnitCode(String unitCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.UnitCodeInput(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.UnitCodeInput());
        Browser.setText(SalesContractPageObject.UnitCodeInput(), unitCode);
    }

    public void verifyTheUnitBookingStatus(String statusEN, String statusAR) throws Exception {
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.UnitBookingStatusCell(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.UnitBookingStatusCell());
        WebElement actualValue = Browser.getWebElement(SalesContractPageObject.UnitBookingStatusCell());
        String valueTXT = actualValue.getText().toLowerCase();
        if (valueTXT.contains(statusAR) || valueTXT.contains(statusEN.toLowerCase())) {
            status = true;
        }
        logger.addScreenshot("Booking Status: " + actualValue);
        Assert.assertTrue(status, "Actual displayed value is (" + valueTXT + "). Expected should be (" + statusAR + ") OR (" + statusEN + ")");
    }

    public void clickOnAddAnnexButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.AddAnnexButton(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.AddAnnexButton());
        Browser.click(SalesContractPageObject.AddAnnexButton());
    }

    public void verifySearchedUnitIsDisplayed(String unitCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.SearchedProject(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.SearchedProject());
        String actualCode = Browser.getText(SalesContractPageObject.SearchedProject()).toLowerCase();
        logger.addScreenshot("Displayed project name is : " + actualCode);
        Assert.assertTrue(actualCode.contains(unitCode.toLowerCase()), "Actual Unit code (" + actualCode + ") and expected is (" + unitCode + ")");
    }

    public void clickOnUnitSelectionCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.UnitSelectionCheckbox(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.UnitSelectionCheckbox());
        Browser.click(SalesContractPageObject.UnitSelectionCheckbox());
    }

    public void verifyAddAnnexToSelectedUnitButtonIsNotDisplayed() throws Exception {
        logger.addScreenshot("");
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Assert.assertTrue(Browser.isElementPresent(SalesContractPageObject.AddAnnexToSelectedUnitButton()), "Button is displayed");
    }

    public void clickOnAddAnnexToSelectedUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.AddAnnexToSelectedUnitButton(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.AddAnnexToSelectedUnitButton());
        Browser.click(SalesContractPageObject.AddAnnexToSelectedUnitButton());
    }

    public void verifyErrorIconIsDisplayed() throws Exception {
        logger.addScreenshot("");
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Assert.assertTrue(Browser.isElementPresent(SalesContractPageObject.ErrorIconOfAttachment()), "Error icon is not displayed");
    }

    public void verifyAnnexFileIsUploaded(String attachment) throws Exception {
        String[] filePathSplit = attachment.split("/");
        String fileName = filePathSplit[filePathSplit.length - 1];
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.UploadedFileName(fileName), 50);
    }

    public void clickOnDownloadAnnexFileArrow() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.DownloadAnnexFileArrow(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.DownloadAnnexFileArrow());
        Browser.click(SalesContractPageObject.DownloadAnnexFileArrow());
    }

    public void clickOnUploadAnnexFileButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.UploadAnnexFileButton(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.UploadAnnexFileButton());
        Browser.click(SalesContractPageObject.UploadAnnexFileButton());
    }

    public void clickOnXButtonOnOTPPopup() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.XButtonOnOTPPopup(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.XButtonOnOTPPopup());
        Browser.click(SalesContractPageObject.XButtonOnOTPPopup());
    }

    public void verifySentAnnexDocumentIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.AnnexDocumentCellValue(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        logger.addScreenshot("");
        Assert.assertTrue((Browser.getText(SalesContractPageObject.AnnexDocumentCellValue()).toLowerCase()).contains("sale-contract-annexes"), "Sent Annex details are missing");
    }

    public void verifySentAnnexDate() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.AnnexDateCellValue(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.AnnexDateCellValue());
        String annexDate = Browser.getText(SalesContractPageObject.AnnexDateCellValue()).strip().split(" ")[0];
        String currentDate = CommonUtilityPage.getDate(0, 0, 0);
        boolean status = false;
        if (currentDate.split("/")[0].contains(annexDate.split("/")[2])) {
            if (currentDate.split("/")[1].contains(annexDate.split("/")[1])) {
                if (currentDate.split("/")[2].contains(annexDate.split("/")[0])) {
                    status = true;
                }
            }
        }
        Assert.assertTrue(status, "Actual Annex sent date is (" + annexDate + "). It is not matching with current date");
    }

    public void verifyShowUnitListButtonIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.ShowUnitListButton(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(SalesContractPageObject.ShowUnitListButton()), "'Show Unit List' Button is not displayed");
    }

    public void clickOnSentAnnexTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.SentAnnexTab(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.SentAnnexTab());
        Browser.click(SalesContractPageObject.SentAnnexTab());
    }

    public void clickOnShowUnitsListButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.ShowUnitListButton(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.ShowUnitListButton());
        Browser.click(SalesContractPageObject.ShowUnitListButton());
    }

    public void getUnitCode() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.UnitCodeOfBookedUnit(), 40);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.UnitCodeOfBookedUnit());
        String unitCode = Browser.getText(SalesContractPageObject.UnitCodeOfBookedUnit()).strip();
        TestDataManager.addDependantGlobalTestData("SalesContract", "UnitCode", unitCode);
        TestDataManager.writeDependantGlobalTestData("SalesContract");
    }

    public void verifyApproveAnnexPopupIsNotDisplayed() throws Exception {
        logger.addScreenshot("");
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Assert.assertTrue(Browser.isElementNotPresent(SalesContractPageObject.ApproveAnnexPopup()), "Approve annex pop up is displayed");
    }

    public void clickOnSignAnnexLink() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.SignAnnexLink(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Browser.executeJSScroll(1000);
        Browser.waitForSeconds(1);
        Browser.click(SalesContractPageObject.SignAnnexLink());
    }

    public void verifySignAnnexLinkIsNotDisplayed() throws Exception {
        logger.addScreenshot("");
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        Assert.assertTrue(Browser.isElementNotPresent(SalesContractPageObject.SignAnnexLink()), "Sign Annex link is displayed");
    }

    public void clickOnViewAnnex() throws Exception {
        Browser.waitUntilVisibilityOfElement(SalesContractPageObject.ViewAnnexLink(), 50);
        Browser.waitUntilInvisibilityOfElement(SalesContractPageObject.LoadingIconPartners(), 60);
        CommonUtilityPage.moveToObject(SalesContractPageObject.ViewAnnexLink());
        Browser.click(SalesContractPageObject.ViewAnnexLink());
    }
}
