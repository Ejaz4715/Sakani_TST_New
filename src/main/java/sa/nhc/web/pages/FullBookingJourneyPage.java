package sa.nhc.web.pages;


import com.testcrew.manager.TestConfigManager;
import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sa.nhc.web.objects.*;
import sa.nhc.web.objects.exisitng.BookingPageObjects;
import sa.nhc.web.objects.exisitng.CommonUtilityPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;

public class FullBookingJourneyPage {

    /**
     * Click on 'Inventory' in Side Menu options
     */
    public void clickOnInternalInventory() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.InternalInventoryIcon(), 50);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.InternalInventoryIcon());
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.InventorySideMenuOption(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.InternalInventoryIcon());
        Browser.click(FullBookingJourneyPageObjects.InventorySideMenuOption());
    }

    /**
     * Click on 'Projects' under 'Inventory' in Side Menu options
     */
    public void clickOnProjects() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectsSideMenuOption(), 40);
        WebElement projects = Browser.getWebElement(FullBookingJourneyPageObjects.ProjectsSideMenuOption());
        boolean exist;
        do {
            Browser.click(FullBookingJourneyPageObjects.ProjectsSideMenuOption());
            exist = projects.isDisplayed();
        }
        while (!exist);
    }

    /**
     * Validate 'Projects' page tile is displayed
     */
    public void verifyProjectsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectsPageTitle(), 40);
        Assert.assertTrue(Browser.isElementPresent(FullBookingJourneyPageObjects.ProjectsPageTitle()));
        logger.addScreenshot("Projects page is displayed");
    }

    /**
     * Click on 'Add New Projects' button
     */
    public void clickOnAddNewProjectButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CreateNewProjectButton(), 40);
        Browser.click(FullBookingJourneyPageObjects.CreateNewProjectButton());
    }

    /**
     * Validate 'Project Details page' is displayed after clicking on 'Add New Project' button
     */
    public void verifyProjectDetailsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectDetailsPageTitle(), 40);
        Assert.assertTrue(Browser.isElementPresent(FullBookingJourneyPageObjects.ProjectDetailsPageTitle()));
        logger.addScreenshot("Project details page is displayed");
    }

    /**
     * Search for project in Admin Site
     *
     * @param ProjectName - Project name to be searched
     */
    public void adminSearchProject(String ProjectName) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 40);
        Browser.waitUntilPresenceOfElement(RegisterOfInterestPageObjects.ProjectNameField(), 50);
        Browser.waitUntilVisibilityOfElement(RegisterOfInterestPageObjects.ProjectNameField(), 50);
        Browser.moveToElement(FullBookingJourneyPageObjects.SearchProjectButton());
        Browser.setText(RegisterOfInterestPageObjects.ProjectNameField(), ProjectName);
        Browser.click(FullBookingJourneyPageObjects.SearchProjectButton());
    }

    /**
     * Method to return the number of Projects displayed on 'Projects' page
     */
    public static int getDisplayedProjectsCount() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SearchedProject(), 40);
        List<WebElement> projects = Browser.getWebElements(FullBookingJourneyPageObjects.ProjectsList());
        return projects.size();
    }

    /**
     * Navigate to searched project
     */
    public void navigateToSearchedProject(String projectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SearchedProject(), 50);
        while ((getDisplayedProjectsCount() != 1) && !(Browser.getText(FullBookingJourneyPageObjects.SearchedProject()).contains(projectName))) {
            Browser.click(FullBookingJourneyPageObjects.SearchProjectButton());
        }
        Browser.moveToElement(FullBookingJourneyPageObjects.SearchedProject());
        Browser.click(FullBookingJourneyPageObjects.SearchedProject());
    }

    /**
     * Enter text in 'Project title' input field
     *
     * @param projectTitle - Title of the project to be entered
     */
    public void enterProjectTitle(String projectTitle) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectDetailsPageTitle(), 40);
        WebElement ele = Browser.getWebElement(FullBookingJourneyPageObjects.ProjectTitleInput());
        ele.sendKeys(projectTitle);
    }

    /**
     * Enter text in 'Project Secondary Title' input field
     *
     * @param secondaryTitle - Secondary Title of the project to be entered
     */
    public void enterSecondaryTitle(String secondaryTitle) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectDetailsPageTitle(), 40);
        WebElement ele = Browser.getWebElement(FullBookingJourneyPageObjects.SecondaryTitleInput());
        ele.sendKeys(secondaryTitle);
    }

    /**
     * Click on 'Project Type dropdown' list to view available types of project
     */
    public void clickOnProjectTypeDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectTypeDropdown(), 40);
        boolean status = Browser.isElementPresent(FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        while (!status) {
            Browser.click(FullBookingJourneyPageObjects.ProjectTypeDropdown());
            status = Browser.isElementPresent(FullBookingJourneyPageObjects.ProjectTypeDropdownList());
        }
    }


    /**
     * Click on the 'Region' dropdown to view the list of regions
     */
    public void clickOnRegionDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.RegionDropdown(), 40);
        Browser.click(FullBookingJourneyPageObjects.RegionDropdown());
    }

    /**
     * Click on the 'City' dropdown to view the list of regions
     */
    public void clickOnCityDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.RegionDropdown(), 40);
        Browser.click(FullBookingJourneyPageObjects.RegionDropdown());
    }

    /**
     * Select 'Region' from the dropdown
     *
     * @param regionAR - Region to be selected in Arabic
     * @param regionEN - Region to be selected in English
     */
    public void selectRegion(String regionAR, String regionEN) throws Exception {
        Browser.waitUntilPresenceOfElement(FullBookingJourneyPageObjects.RegionDropdownList(), 40);
        List<WebElement> selectList = Browser.getWebElements(FullBookingJourneyPageObjects.RegionDropdownList());
        for (int i = 1; i < selectList.size(); i++) {
            if (selectList.get(i).isDisplayed()) {
                String getListName = selectList.get(i).getText();
                if (getListName.contains(regionAR) || getListName.contains(regionEN)) {
                    selectList.get(i).click();
                    break;
                }
            }
        }
    }


    /**
     * Select 'City' from the dropdown
     *
     * @param cityAR - City to be selected in Arabic
     * @param cityEN - City to be selected in English
     */
    public void selectCity(String cityAR, String cityEN) throws Exception {
        Browser.waitUntilPresenceOfElement(FullBookingJourneyPageObjects.CityDropdownList(), 40);
        Browser.moveToElement(FullBookingJourneyPageObjects.CityDropdownList());
        List<WebElement> selectList = Browser.getWebElements(FullBookingJourneyPageObjects.CityDropdownList());
        for (WebElement ele : selectList) {
            if (Browser.isElementDisplayed(FullBookingJourneyPageObjects.CityDropdownList())) {
                String getListName = ele.getText();
                if (getListName.contains(cityAR) || getListName.contains(cityEN)) {
                    ele.click();
                    break;
                }
            }
        }
    }

    /**
     * Enter 'city' name based on the language of the site & select displayed option
     *
     * @param cityEN - City name to be entered in English
     * @param cityAR - City name to be entered in Arabic
     */
    public void enterCityName(String cityEN, String cityAR) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CityNameInput(), 40);
        if (TestConfigManager.getSettingsApplicationLanguage().contains("en")) {
            Browser.setText(FullBookingJourneyPageObjects.CityNameInput(), cityEN);
        } else {
            Browser.setText(FullBookingJourneyPageObjects.CityNameInput(), cityAR);
        }
    }

    /**
     * Validate the 'city' name has been entered
     *
     * @param cityEN - City name to be validated in English
     * @param cityAR - City name to be validated in Arabic
     */
    public void verifyCityNameIsEntered(String cityEN, String cityAR) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CityNameInput(), 40);
        WebElement ele = Browser.getWebElement(FullBookingJourneyPageObjects.CityNameInput());
        String actualCity = ele.getAttribute("value");
        logger.addScreenshot("City is " + actualCity);
        Assert.assertTrue(actualCity.contains(cityEN) || actualCity.contains(cityAR), "Actual city name is (" + actualCity + ") and expected should be (" + cityEN + ") OR (" + cityAR + ")");
    }

    /**
     * Enter 'Developer' name and select the displayed option
     *
     * @param developerName - Developer name to be entered
     */
    public void enterDeveloperName(String developerName) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DeveloperNameInput(), 40);
        Browser.setText(FullBookingJourneyPageObjects.DeveloperNameInput(), developerName);
        List<WebElement> developerOptions = Browser.getWebElements(FullBookingJourneyPageObjects.DeveloperOption());
        while (developerOptions.size() != 1) {
            developerOptions = Browser.getWebElements(FullBookingJourneyPageObjects.DeveloperOption());
        }
        Browser.click(FullBookingJourneyPageObjects.DeveloperOption());
    }

    /**
     * Validate the 'Developer' name has been entered
     *
     * @param developerName - Developer name to be validated
     */
    public void verifyDeveloperNameIsEntered(String developerName) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DeveloperNameInput(), 40);
        WebElement ele = Browser.getWebElement(FullBookingJourneyPageObjects.DeveloperNameInput());
        String actualDevName = ele.getAttribute("value");
        logger.addScreenshot("Developer name is: " + actualDevName);
        Assert.assertTrue(actualDevName.contains(developerName), "Actual city name is (" + actualDevName + ") and expected should be (" + developerName + ")");
    }

    /**
     * Click on 'Subsidize Level drop down' to view the list of available options
     */
    public void clickOnSubsidizeDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SubsidizeDropdown(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SubsidizeDropdown());
        while (!Browser.isElementPresent(FullBookingJourneyPageObjects.SubsidizeDropdownList())) {
            CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SubsidizeDropdown());
            Browser.click(FullBookingJourneyPageObjects.SubsidizeDropdown());
            Browser.waitForSeconds(1);
        }
    }

    /**
     * Click on 'Mega Project Type' drop down to view the list of available options
     */
    public void clickOnMegaProjectDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MegaProjectDropdown(), 40);
        Browser.click(FullBookingJourneyPageObjects.MegaProjectDropdown());
    }


    /**
     * Select 'Mega Project Type' from the dropdown
     *
     * @param projectType_AR - Type to be selected in Arabic
     * @param projectType_EN - Type to be selected in English
     */
    public void selectMegaProject(String projectType_AR, String projectType_EN) throws Exception {
        Browser.waitUntilPresenceOfElement(FullBookingJourneyPageObjects.MegaProjectDropdownList(), 40);
        List<WebElement> selectList = Browser.getWebElements(FullBookingJourneyPageObjects.MegaProjectDropdownList());
        for (int i = 1; i < selectList.size(); i++) {
            if (selectList.get(i).isDisplayed()) {
                String getListName = selectList.get(i).getText();
                if (getListName.contains(projectType_AR) || getListName.contains(projectType_EN)) {
                    selectList.get(i).click();
                    break;
                }
            }
        }
    }


    /**
     * Turn ON 'IsBookable' toggle of the project
     */
    public void clickOnIsBookableToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegisterOfInterestPageObjects.bookableCheckerClicker(), 40);
        Browser.click(RegisterOfInterestPageObjects.bookableCheckerClicker());
    }

    /**
     * Validate 'IsBookable' toggle is ON
     */
    public void verifyIsBookableToggleIsOn() throws Exception {
        WebElement bookableChecker = Browser.getWebElement(RegisterOfInterestPageObjects.bookableCheckerArea());
        boolean result = Boolean.parseBoolean(bookableChecker.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "IsBookable toggle is OFF");
    }

    /**
     * Click on 'Status drop down' to view the available options
     */
    public void clickOnStatusDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.StatusDropdown(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.StatusDropdown());
        Browser.executeJSScrollIntoView(FullBookingJourneyPageObjects.StatusDropdown());
        Browser.waitForSeconds(1);
        while (!Browser.isElementPresent(FullBookingJourneyPageObjects.StatusDropdownList())) {
            Browser.click(FullBookingJourneyPageObjects.StatusDropdown());
        }
    }

    /**
     * Enter text in  'WAFI Expiry Date' input field
     *
     * @param wafiExpiryDate - Date to be entered
     */
    public void enterWafiExpiryDate(String wafiExpiryDate) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.WafiExpiryDateInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.WafiExpiryDateInput());
        Browser.setText(FullBookingJourneyPageObjects.WafiExpiryDateInput(), wafiExpiryDate);
    }


    /**
     * Validate the 'WAFI Expiry Date' is entered
     *
     * @param date - Date value to be validated
     */
    public void verifyWafiExpiryDateIsEntered(String date) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.WafiExpiryDateInput(), 40);
        String ActualVal = Browser.getWebElement(FullBookingJourneyPageObjects.WafiExpiryDateInput()).getAttribute("value");
        logger.addScreenshot("");
        Assert.assertTrue(ActualVal.contains(date), "Actual value (" + ActualVal + ") and expected (" + date + ")");
    }

    /**
     * Method to click on 'Subsidy Type drop down' to view the available options
     */
    public void clickOnSubsidyTypeDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SubsidyTypeDropdown(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SubsidyTypeDropdown());
        Browser.executeJSScrollIntoView(FullBookingJourneyPageObjects.SubsidyTypeDropdown());
        Browser.waitForSeconds(1);
        while (!Browser.isElementPresent(FullBookingJourneyPageObjects.SubsidyTypeDropdownList())) {
            Browser.click(FullBookingJourneyPageObjects.SubsidyTypeDropdown());
        }
    }

    /**
     * Enter text in 'Max Subsidy Amount' input field
     *
     * @param subsidyAmount - Date to be entered
     */
    public void enterMaxSubsidyAmount(String subsidyAmount) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SubsidyAmountInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SubsidyAmountInput());
        Browser.setText(FullBookingJourneyPageObjects.SubsidyAmountInput(), subsidyAmount);
    }

    /**
     * Method to click on 'Calendar icon' beside 'Project Agreement Date' Input field
     */
    public void clickOnProjectAgreementDateCalender() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectAgreementDateCalender(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectAgreementDateCalender());
        Browser.click(FullBookingJourneyPageObjects.ProjectAgreementDateCalender());
    }

    /**
     * Method to select date from the Calendar pop up
     *
     * @param date - Date to be entered
     */
    public void selectDateFromCalender(String date) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SelectYearDropdown(), 40);
        Browser.click(FullBookingJourneyPageObjects.SelectYearDropdown());
        String day = date.split("-")[2].replaceFirst("^0*", "");
        String month = getMonthName(date.split("-")[1]);
        String year = date.split("-")[0];
        List<WebElement> yearList = Browser.getWebElements(FullBookingJourneyPageObjects.YearMonthDayList());
        for (WebElement yearOption : yearList) {
            if (yearOption.getText().contains(year)) {
                yearOption.click();
                break;
            }
        }
        List<WebElement> monthList = Browser.getWebElements(FullBookingJourneyPageObjects.YearMonthDayList());
        for (WebElement monthOption : monthList) {
            if (monthOption.getText().contains(month)) {
                monthOption.click();
                break;
            }
        }
        List<WebElement> dayList = Browser.getWebElements(FullBookingJourneyPageObjects.YearMonthDayList());
        for (WebElement dayOption : dayList) {
            if (dayOption.getText().contains(day)) {
                dayOption.click();
                break;
            }
        }
    }

    /**
     * Method to return month name corresponding to a month number
     *
     * @param monthNum - Month number
     */
    public String getMonthName(String monthNum) {
        String month = "";
        //replace all the 0's with null from the beginning(^) of the string
        monthNum = monthNum.replaceFirst("^0*", "");
        month = switch (monthNum) {
            case "1" -> "JAN";
            case "2" -> "FEB";
            case "3" -> "MAR";
            case "4" -> "APR";
            case "5" -> "May";
            case "6" -> "JUN";
            case "7" -> "JUl";
            case "8" -> "AUG";
            case "9" -> "SEP";
            case "10" -> "OCT";
            case "11" -> "NOV";
            case "12" -> "DEC";
            default -> month;
        };
        return month;
    }


    /**
     * Enter text in 'Project License Number' input field
     *
     * @param licenseNum - License number to be entered
     */
    public void enterProjectLicenseNumber(String licenseNum) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectLicenseNumberInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectLicenseNumberInput());
        Browser.setText(FullBookingJourneyPageObjects.ProjectLicenseNumberInput(), licenseNum);
    }

    /**
     * Method to click on 'Calendar' icon beside 'Project License Date' Input field
     */
    public void clickOnProjectLicenseDateCalender() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectLicenseDateCalender(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectLicenseDateCalender());
        Browser.click(FullBookingJourneyPageObjects.ProjectLicenseDateCalender());
    }

    /**
     * Enter text in 'Escrow Account Number' input field
     *
     * @param accountNum - License number to be entered
     */
    public void enterAccountNumber(String accountNum) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.EscrowAccountInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.EscrowAccountInput());
        Browser.setText(FullBookingJourneyPageObjects.EscrowAccountInput(), accountNum);
    }

    /**
     * Click on 'Bank name' dropdown to view available options
     */
    public void clickOnBankNameDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BankNameDropdown(), 40);
        Browser.executeJSScrollIntoView(FullBookingJourneyPageObjects.BankNameDropdown());
        Browser.click(FullBookingJourneyPageObjects.BankNameDropdown());
    }

    /**
     * Enter text in 'Project Deduct Percentage' input field
     *
     * @param percentageValue - Percentage to be entered
     */
    public void enterProjectDeductPercentage(String percentageValue) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectDeductPercentageInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectDeductPercentageInput());
        Browser.setText(FullBookingJourneyPageObjects.ProjectDeductPercentageInput(), percentageValue);
    }

    /**
     * Enter text in 'Deed City' input field
     *
     * @param deedCity - City name to be entered
     */
    public void enterDeedCity(String deedCity) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DeedCityInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DeedCityInput());
        Browser.setText(FullBookingJourneyPageObjects.DeedCityInput(), deedCity);
    }

    /**
     * Enter text in 'Land Delivery Date' input field
     *
     * @param date - Land delivery date to be entered
     */
    public void enterLandDeliveryDate(String date) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.LandDeliveryDateInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.LandDeliveryDateInput());
        Browser.setText(FullBookingJourneyPageObjects.LandDeliveryDateInput(), date);
    }

    /**
     * Click on 'Show Mullak' toggle after selecting Project type
     */
    public void clickOnShowMullakToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ShowMullakToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ShowMullakToggle());
        Browser.click(FullBookingJourneyPageObjects.ShowMullakToggle());
    }

    /**
     * Click on 'Show WAFI Logo and Content' toggle after selecting Project type
     */
    public void clickOnShowWafiLogoToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ShowWafiLogoToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ShowWafiLogoToggle());
        Browser.click(FullBookingJourneyPageObjects.ShowWafiLogoToggle());
    }

    /**
     * Click on 'Show Completion Percentage' toggle after selecting Project type
     */
    public void clickOnShowCompletionPercentageToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ShowCompletionToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ShowCompletionToggle());
        Browser.click(FullBookingJourneyPageObjects.ShowCompletionToggle());
    }

    /**
     * Click on 'Incentivize Project' toggle after selecting Project type
     */
    public void clickOnIncentivizeProjectToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.IncentivizeProjectToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.IncentivizeProjectToggle());
        Browser.click(FullBookingJourneyPageObjects.IncentivizeProjectToggle());
    }

    /**
     * Validate 'Show Mullak Content' toggle is ON
     */
    public void verifyShowMullakToggleIsOn() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.ShowMullakToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "how Mullak Content toggle is OFF");
    }

    /**
     * Validate 'Show WAFI Logo and Content' toggle is ON
     */
    public void verifyShowWafiLogoToggleIsOn() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.ShowWafiLogoToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "Show WAFI Logo and Content toggle is OFF");
    }

    /**
     * Validate 'Show Completion Percentage' toggle is ON
     */
    public void verifyShowCompletionPercentageToggleIsOn() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.ShowCompletionToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "Show Completion Percentage toggle is OFF");
    }

    /**
     * Validate 'Incentivize Project' toggle
     */
    public void verifyIncentivizeProjectToggleIsOn() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.IncentivizeProjectToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "Incentivize Project toggle is OFF");
    }

    /**
     * Click on 'Additional Info' tab selecting Project type
     */
    public void clickOnAdditionalInfoTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.AdditionalInfoTab(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.AdditionalInfoTab());
        Browser.click(FullBookingJourneyPageObjects.AdditionalInfoTab());
    }

    /**
     * Enter text in 'CRM Code' input field in 'Additional Info' section
     *
     * @param code - CRM code
     */
    public void enterCRMCode(String code) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CRMCodeInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.CRMCodeInput());
        Browser.setText(FullBookingJourneyPageObjects.CRMCodeInput(), code);
    }

    /**
     * Enter text in 'Deed Number' input field in 'Additional Info' section
     *
     * @param deedNumber - Deed Number of property
     */
    public void enterDeedNumber(String deedNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DeedNumberInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DeedNumberInput());
        Browser.setText(FullBookingJourneyPageObjects.DeedNumberInput(), deedNumber);
    }

    /**
     * Enter text in 'Deed Date' input field in 'Additional Info' section
     *
     * @param date - Deed Date of the property
     */
    public void enterDeedDate(String date) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DeedDateInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DeedDateInput());
        Browser.setText(FullBookingJourneyPageObjects.DeedDateInput(), date);
    }

    /**
     * Enter text in 'Plan Number' input field in 'Additional Info' section
     *
     * @param planNumber - Plan Number to be entered
     */
    public void enterPlanNumber(String planNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.PlanNumberInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.PlanNumberInput());
        Browser.setText(FullBookingJourneyPageObjects.PlanNumberInput(), planNumber);
    }

    /**
     * Enter text in 'Consultant Design Office' input field in 'Additional Info section'
     *
     * @param office - Consultant office name
     */
    public void enterConsultantDesignOffice(String office) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ConsultantDesignOfficeInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ConsultantDesignOfficeInput());
        Browser.setText(FullBookingJourneyPageObjects.ConsultantDesignOfficeInput(), office);
    }

    /**
     * Enter text in 'Consultant Design Office License Number' input field in 'Additional Info' section
     *
     * @param licenseNum - License number of the office
     */
    public void enterConsultantDesignOfficeLicenseNum(String licenseNum) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ConsultantDesignOfficeLicenseNumInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ConsultantDesignOfficeLicenseNumInput());
        Browser.setText(FullBookingJourneyPageObjects.ConsultantDesignOfficeLicenseNumInput(), licenseNum);
    }

    /**
     * Enter text in 'Property Year Of Built' input field in 'Additional Info' section
     *
     * @param year - year number of the built
     */
    public void enterPropertyYearOfBuilt(String year) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.PropertyYearOfBuiltInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.PropertyYearOfBuiltInput());
        Browser.setText(FullBookingJourneyPageObjects.PropertyYearOfBuiltInput(), year);
    }

    /**
     * Enter text in 'Developer Warranty Period' input field in 'Additional Info' section
     *
     * @param period - Warranty period
     */
    public void enterDeveloperWarrantyPeriod(String period) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DeveloperWarrantyPeriodInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DeveloperWarrantyPeriodInput());
        Browser.setText(FullBookingJourneyPageObjects.DeveloperWarrantyPeriodInput(), period);
    }

    /**
     * Enter text in 'Consultant Construction Office' input field in 'Additional Info' section
     *
     * @param office - Construction Consultant Office name
     */
    public void enterConsultantConstructionOffice(String office) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ConsultantConstructionOfficeInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ConsultantConstructionOfficeInput());
        Browser.setText(FullBookingJourneyPageObjects.ConsultantConstructionOfficeInput(), office);
    }

    /**
     * Enter text in 'Construction Consultant Office License Number' input field in 'Additional Info' section
     *
     * @param licenseNum - Construction Consultant Office License Number
     */
    public void enterConsultantConstructionLicenseNum(String licenseNum) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ConsultantConstructionLicenseNumInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ConsultantConstructionLicenseNumInput());
        Browser.setText(FullBookingJourneyPageObjects.ConsultantConstructionLicenseNumInput(), licenseNum);
    }

    /**
     * Enter text in 'District name' input field in 'Additional Info' section
     *
     * @param districtName - District name of the property
     */
    public void enterDistrictName(String districtName) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectReadinessDateInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectReadinessDateInput());
        Browser.setText(FullBookingJourneyPageObjects.ProjectReadinessDateInput(), districtName);
    }

    /**
     * Enter text in 'Project Readiness Date' input field in 'Additional Info' section
     *
     * @param date - project readiness date
     */
    public void enterProjectReadinessDate(String date) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DistrictNameInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DistrictNameInput());
        Browser.setText(FullBookingJourneyPageObjects.DistrictNameInput(), date);
    }

    /**
     * Enter text in 'Latitude' input field in 'Additional Info' section
     *
     * @param latitude - latitude value
     */
    public void enterLatitude(String latitude) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.LatitudeInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.LatitudeInput());
        Browser.setText(FullBookingJourneyPageObjects.LatitudeInput(), latitude);
    }

    /**
     * Enter text in 'Longitude' input field in 'Additional Info' section
     *
     * @param longitude - longitude value
     */
    public void enterLongitude(String longitude) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.LongitudeInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.LongitudeInput());
        Browser.setText(FullBookingJourneyPageObjects.LongitudeInput(), longitude);
    }

    /**
     * Enter text in 'Acceptance Expiry Period' Input field in 'Additional Info' section
     *
     * @param period - Expiry period in days
     */
    public void enterAcceptanceExpiryPeriod(String period) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.AcceptanceExpiryPeriodInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.AcceptanceExpiryPeriodInput());
        Browser.setText(FullBookingJourneyPageObjects.AcceptanceExpiryPeriodInput(), period);
    }

    public void clickOnProjectSettingTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectSettingTab(), 40);
        Browser.executeJSScrollIntoView(FullBookingJourneyPageObjects.ProjectSettingTab());
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectSettingTab());
        Browser.click(FullBookingJourneyPageObjects.ProjectSettingTab());
    }

    /**
     * Enter text in 'Initial Booking Expiry In Days' Input field in 'Project Setting' section
     *
     * @param bookingExpiry - Initial Booking Expiry in days
     */
    public void enterInitialBookingExpiryPeriod(String bookingExpiry) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.InitialBookingExpiryInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.InitialBookingExpiryInput());
        Browser.setText(FullBookingJourneyPageObjects.InitialBookingExpiryInput(), bookingExpiry);
    }

    /**
     * Enter text in 'Building Permit Expiry In Months' Input field in 'Project Setting' section
     *
     * @param period - Permit expiry in months
     */
    public void enterBuildingPermitPeriod(String period) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BuildingPermitPeriodInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.BuildingPermitPeriodInput());
        Browser.setText(FullBookingJourneyPageObjects.BuildingPermitPeriodInput(), period);
    }

    /**
     * Click on 'Using General Booking Fee' Toggle to turn it on
     */
    public void clickOnUsingGeneralBookingFeeToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UsingGeneralBookingFeeToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UsingGeneralBookingFeeToggle());
        Browser.click(FullBookingJourneyPageObjects.UsingGeneralBookingFeeToggle());
    }

    /**
     * Validate 'Using General Booking' Fee toggle is ON
     */
    public void verifyUsingGeneralBookingFeeToggleIsON() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.UsingGeneralBookingFeeToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "Using general fee toggle is OFF");
    }

    /**
     * Enter text in 'Booking Fee Input field' in 'Project Setting' section
     *
     * @param fee - Booking fee
     */
    public void enterBookingFee(String fee) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BookingFeeInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.BookingFeeInput());
        Browser.clearText(FullBookingJourneyPageObjects.BookingFeeInput());
        Browser.setText(FullBookingJourneyPageObjects.BookingFeeInput(), fee);
    }

    /**
     * Click on Using General Extend Price Quotation Toggle to turn it ON
     */
    public void clickOnUsingGeneralExtendPriceQuotationToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UsingGeneralExtendPriceQuotationToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UsingGeneralExtendPriceQuotationToggle());
        Browser.click(FullBookingJourneyPageObjects.UsingGeneralExtendPriceQuotationToggle());
    }

    /**
     * Validate 'Using General Extend Price Quotation' Toggle is ON
     */
    public void verifyUsingGeneralExtendPriceQuotationToggleIsON() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.UsingGeneralExtendPriceQuotationToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "Using General Extend Price Quotation Toggle is OFF");
    }

    /**
     * Enter text in 'Extend price quotation day' Input field in 'Project Setting' section
     *
     * @param day - Extend price quotation day
     */
    public void enterExtendPriceQuotationDay(String day) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ExtendPriceQuotationDayInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ExtendPriceQuotationDayInput());
        Browser.clearText(FullBookingJourneyPageObjects.ExtendPriceQuotationDayInput());
        Browser.setText(FullBookingJourneyPageObjects.ExtendPriceQuotationDayInput(), day);
    }

    /**
     * Enter text in 'Extend Price Quotation fee' Input field in 'Project Setting' section
     *
     * @param fee - Extend price quotation fee
     */
    public void enterExtendPriceQuotationFee(String fee) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ExtendPriceQuotationFeeInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ExtendPriceQuotationFeeInput());
        Browser.clearText(FullBookingJourneyPageObjects.ExtendPriceQuotationFeeInput());
        Browser.setText(FullBookingJourneyPageObjects.ExtendPriceQuotationFeeInput(), fee);
    }

    /**
     * Click 'Activate Multiple Units Booking For Non-Bene in Web' toggle to turn it ON
     */
    public void clickOnActivateMultipleUnitsBookingForNonBeneWebToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ActivateMultipleUnitsBookingForNonBeneWebToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ActivateMultipleUnitsBookingForNonBeneWebToggle());
        Browser.click(FullBookingJourneyPageObjects.ActivateMultipleUnitsBookingForNonBeneWebToggle());
    }

    /**
     * Validate 'Activate Multiple Units Booking For Non-Bene in Web' toggle is ON
     */
    public void verifyActivateMultipleUnitsBookingForNonBeneWebToggleIsOn() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.ActivateMultipleUnitsBookingForNonBeneWebToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "Activate Multiple Units Booking For Non-Bene in Web toggle is OFF");
    }

    /**
     * Click 'Activate Multiple Units Booking For Non-Bene in Sakani Partners' toggle to turn it ON
     */
    public void clickOnActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggle());
        Browser.click(FullBookingJourneyPageObjects.ActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggle());
    }

    /**
     * Validate 'Activate Multiple Units Booking For Non-Bene in Sakani Partner' toggle is ON
     */
    public void verifyActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggleIsOn() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.ActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "Activate Multiple Units Booking For Non-Bene in Sakani Partner toggle is OFF");
    }

    /**
     * Enter text in 'Maximum Number Of Bookings For NonBene' Input field in Project setting section
     *
     * @param maxNumOfBooking - Maximum number of bookings for non-bene
     */
    public void enterMaximumNumberOfBookingsForNonBene(String maxNumOfBooking) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MaximumNumberOfBookingsForNonBeneInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MaximumNumberOfBookingsForNonBeneInput());
        Browser.setText(FullBookingJourneyPageObjects.MaximumNumberOfBookingsForNonBeneInput(), maxNumOfBooking);
    }

    /**
     * Validate 'Maximum Number Of Bookings For NonBene' Input field is disabled
     */
    public void verifyMaximumNumberOfBookingsForNonBeneInputIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MaximumNumberOfBookingsForNonBeneInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MaximumNumberOfBookingsForNonBeneInput());
        boolean res = Boolean.parseBoolean(Browser.getAttributeValue(FullBookingJourneyPageObjects.MaximumNumberOfBookingsForNonBeneInput(), "readonly"));
        logger.addScreenshot("");
        Assert.assertTrue(res, "Maximum Number Of Bookings For NonBene Input field is enabled");
    }

    /**
     * Validate 'Booking Fee' Input field is disabled
     */
    public void verifyBookingFeeInputIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BookingFeeInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.BookingFeeInput());
        boolean res = Boolean.parseBoolean(Browser.getAttributeValue(FullBookingJourneyPageObjects.BookingFeeInput(), "readonly"));
        logger.addScreenshot("");
        Assert.assertTrue(res, "Booking Fee input field is enabled");
    }

    /**
     * Validate 'Extend price quotation fee' Input field is disabled
     */
    public void verifyExtendPriceQuotationFeeInputIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ExtendPriceQuotationFeeInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ExtendPriceQuotationFeeInput());
        logger.addScreenshot("");
        Assert.assertFalse(Browser.isElementEnabled(FullBookingJourneyPageObjects.ExtendPriceQuotationFeeInput()), "Extend price quotation fee input field is enabled");
    }

    /**
     * Validate 'Extend price quotation day' Input field is disabled
     */
    public void verifyExtendPriceQuotationDayInputIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ExtendPriceQuotationDayInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ExtendPriceQuotationDayInput());
        logger.addScreenshot("");
        Assert.assertFalse(Browser.isElementEnabled(FullBookingJourneyPageObjects.ExtendPriceQuotationDayInput()), "Extend price quotation day input field is enabled");
    }

    /**
     * Click on 'Active Queuing' toggle to turn it ON
     */
    public void clickOnActiveQueuingToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ActiveQueuingToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ActiveQueuingToggle());
        Browser.click(FullBookingJourneyPageObjects.ActiveQueuingToggle());
    }

    /**
     * Validate 'Active Queuing' toggle is ON
     */
    public void verifyActiveQueuingToggleIsOn() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.ActiveQueuingToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "Active Queuing toggle is OFF");
    }

    /**
     * Enter text in 'Max number of users can book at the same time' Input field in Project Setting section
     *
     * @param maxUsers - Number of maximum users able to book at same time
     */
    public void enterMaxNumberOfUserAbleToBook(String maxUsers) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MaximumNumberOfUserAbleToBook(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MaximumNumberOfUserAbleToBook());
        Browser.setText(FullBookingJourneyPageObjects.MaximumNumberOfUserAbleToBook(), maxUsers);
    }

    /**
     * Validate 'Max number of users can book at the same time' Input field is disabled
     */
    public void verifyMaxNumberOfUserAbleToBookFieldIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MaximumNumberOfUserAbleToBook(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MaximumNumberOfUserAbleToBook());
        boolean res = Boolean.parseBoolean(Browser.getAttributeValue(FullBookingJourneyPageObjects.MaximumNumberOfUserAbleToBook(), "readonly"));
        logger.addScreenshot("");
        Assert.assertTrue(res, "'Max number of users can book at the same time' input field is enabled");
    }

    /**
     * Click on 'Save' button
     */
    public void clickOnSaveButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaveButton(), 40);
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SaveButton());
        Browser.click(FullBookingJourneyPageObjects.SaveButton());
    }

    /**
     * Click on 'Unit Tab' button to move to 'Units page'
     */
    public void clickOnUnitsTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UnitsTabLabel(), 40);
        Browser.moveToElement(FullBookingJourneyPageObjects.UnitsTabLabel());
        Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.UnitsTabLabel(), 50);
        Browser.click(FullBookingJourneyPageObjects.UnitsTabLabel());
    }

    /**
     * Click on 'New Unit Import' button
     */
    public void clickOnNewImportUnitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.NewImportUnitButton(), 40);
        Browser.moveToElement(FullBookingJourneyPageObjects.NewImportUnitButton());
        Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.NewImportUnitButton(), 50);
        Browser.click(FullBookingJourneyPageObjects.NewImportUnitButton());
    }

    /**
     * Click on 'Unit Type Dropdown' to view available options
     */
    public void clickOnUnitTypeDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UnitTypeDropdown(), 40);
        Browser.moveToElement(FullBookingJourneyPageObjects.UnitTypeDropdown());
        Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.UnitTypeDropdown(), 50);
        Browser.click(FullBookingJourneyPageObjects.UnitTypeDropdown());
    }

    /**
     * Validate the 'Save' button is Disabled
     */
    public void verifySaveButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaveButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SaveButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(FullBookingJourneyPageObjects.SaveButton()));
    }

    /**
     * Validate the 'Save' button on 'Media Page' is Disabled
     */
    public void verifySaveButtonIsDisabledOnMediaPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaveButtonOnMediaPage(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SaveButtonOnMediaPage());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(FullBookingJourneyPageObjects.SaveButtonOnMediaPage()));
    }


    /**
     * Click on 'Save' button on 'Media Page' to save the media
     */
    public void clickOnSaveButtonOnMediaPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaveButtonOnMediaPage(), 40);
        Browser.moveToElement(FullBookingJourneyPageObjects.SaveButtonOnMediaPage());
        Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.SaveButtonOnMediaPage(), 50);
        Browser.click(FullBookingJourneyPageObjects.SaveButtonOnMediaPage());
    }

    /**
     * Validate Attachment is uploaded - Inject the filename into the locator
     *
     * @param filePath - path of uploaded file
     */
    public void verifyAttachmentIsUploaded(String filePath) throws Exception {
        String[] filePathSplit = filePath.split("/");
        String fileName = filePathSplit[filePathSplit.length - 1];
        Assert.assertTrue(Browser.isElementPresent(FullBookingJourneyPageObjects.AttachmentName(fileName)), "Attachment is not uploaded");
        logger.addScreenshot("");
    }

    /**
     * Check the import status 'Processed' then click on 'Commit'
     */
    public void clickOnCommitButton() throws Exception {
        String status = getUnitImportStatus();
        while (status.contains("Processing") || status.contains("تحت الإجراء")) {
            Browser.driver.navigate().refresh();
            status = getUnitImportStatus();
        }
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CommitButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.CommitButton());
        Browser.click(FullBookingJourneyPageObjects.CommitButton());
    }

    /**
     * Get unit import 'Status'
     */
    public String getUnitImportStatus() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UnitImportStatus(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UnitImportStatus());
        return Browser.getText(FullBookingJourneyPageObjects.UnitImportStatus());
//        Assert.assertTrue(importStatus.contains(statusEN) || importStatus.contains(statusAR), "Import status is different from expected");
    }

    /**
     * Click on OK button on 'Commit' import pop up
     */
    public void clickOnOkButtonOnPopup() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.OkPopupButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.OkPopupButton());
        Browser.click(FullBookingJourneyPageObjects.OkPopupButton());
    }

    /**
     * Navigate to 'Media' page of the project
     */
    public void clickOnMediaTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MediaTabLabel(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MediaTabLabel());
        Browser.click(FullBookingJourneyPageObjects.MediaTabLabel());
        while (Browser.isElementNotPresent(FullBookingJourneyPageObjects.TitleOfDetailPageInput())) {
            Browser.driver.navigate().refresh();
            Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MediaTabLabel(), 40);
            CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MediaTabLabel());
            Browser.click(FullBookingJourneyPageObjects.MediaTabLabel());
        }
    }

    /**
     * Click on upload arrow for media upload (image/video/pdf/json)
     */
    public void clickOnUploadArrowButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UploadArrowButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UploadArrowButton());
        Browser.click(FullBookingJourneyPageObjects.UploadArrowButton());
    }

    /**
     * Click on Save button after uploading files in 'Photo library'
     */
    public void clickOnSaveButtonForPhotoLibrary() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaveButtonForPhotoLibrary(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SaveButtonForPhotoLibrary());
        Browser.click(FullBookingJourneyPageObjects.SaveButtonForPhotoLibrary());
    }

    /**
     * Click on Save button after uploading files in 'Videos library'
     */
    public void clickOnSaveButtonForVideoLibrary() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaveButtonForVideoLibrary(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SaveButtonForVideoLibrary());
        Browser.click(FullBookingJourneyPageObjects.SaveButtonForVideoLibrary());
    }

    /**
     * Method to click on Display Method dropdown to view available options
     */
    public void clickOnDisplayMethodDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DisplayMethodDropdown(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DisplayMethodDropdown());
        Browser.click(FullBookingJourneyPageObjects.DisplayMethodDropdown());
    }

    /**
     * Method to enter text in 'Title of Details' input field
     *
     * @param title - Title of the page to be entered
     */
    public void enterTitleOfDetailPage(String title) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.TitleOfDetailPageInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.TitleOfDetailPageInput());
        Browser.setText(FullBookingJourneyPageObjects.TitleOfDetailPageInput(), title);
    }

    /**
     * Method to enter date in 'First Unit Delivery Date' input field
     *
     * @param date - Unit delivery date
     */
    public void enterFirstUnitDeliveryDate(String date) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.FirstUnitDeliveryDateInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.FirstUnitDeliveryDateInput());
        Browser.setText(FullBookingJourneyPageObjects.FirstUnitDeliveryDateInput(), date);
    }

    /**
     * Method to enter date in 'Name' input field
     *
     * @param name - Project display name
     */
    public void enterProjectDisplayName(String name) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectDisplayNameInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectDisplayNameInput());
        Browser.setText(FullBookingJourneyPageObjects.ProjectDisplayNameInput(), name);
    }

    /**
     * Method to enter date in 'Summary' input field
     *
     * @param summary - Project Summary
     */
    public void enterSummary(String summary) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SummaryInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SummaryInput());
        Browser.setText(FullBookingJourneyPageObjects.SummaryInput(), summary);
    }

    /**
     * Method to enter date in 'Description' input field
     *
     * @param description - description of the project to be displayed
     */
    public void enterDescription(String description) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DescriptionInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DescriptionInput());
        Browser.setText(FullBookingJourneyPageObjects.DescriptionInput(), description);
    }  public void enterDescriptions(String description) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DescriptionsInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DescriptionsInput());
        Browser.setText(FullBookingJourneyPageObjects.DescriptionsInput(), description);
    }

    /**
     * Method to enter date in 'Description' input field
     *
     * @param price - Starting price
     */
    public void enterPricingStartingAt(String price) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.PricingStartingAtInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.PricingStartingAtInput());
        Browser.setText(FullBookingJourneyPageObjects.PricingStartingAtInput(), price);
    }

    /**
     * Method to click on 'Promoted' toggle to turn it ON
     */
    public void clickOnPromotedToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.PromotedToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.PromotedToggle());
        Browser.click(FullBookingJourneyPageObjects.PromotedToggle());
    }

    /**
     * Method to validate 'Promoted' toggle is ON
     */
    public void verifyPromotedToggleIsOn() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.PromotedToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "Promoted toggle is OFF");
    }

    /**
     * Method to enter date in 'Nearest Airport Distance' input field
     *
     * @param distance - Distance of the nearest airport
     */
    public void enterNearestAirportDistance(String distance) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.NearestAirportDistanceInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.NearestAirportDistanceInput());
        Browser.setText(FullBookingJourneyPageObjects.NearestAirportDistanceInput(), distance);
    }

    /**
     * Method to enter date in 'Nearest School Distance' input field
     *
     * @param distance - Distance of the nearest school
     */
    public void enterNearestSchoolDistance(String distance) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.NearestSchoolDistanceInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.NearestSchoolDistanceInput());
        Browser.setText(FullBookingJourneyPageObjects.NearestSchoolDistanceInput(), distance);
    }

    /**
     * Method to enter date in 'Total Area' input field
     *
     * @param area - Total area covered
     */
    public void enterTotalArea(String area) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.TotalAreaInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.TotalAreaInput());
        Browser.setText(FullBookingJourneyPageObjects.TotalAreaInput(), area);
    }

    /**
     * Method to click on 'Market Day Flag' toggle to turn it ON
     */
    public void clickOnMarketDayFlagToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MarketDayFlagToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MarketDayFlagToggle());
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.MarketDayFlagToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        while (!result) {
            Browser.click(FullBookingJourneyPageObjects.MarketDayFlagToggle());
            element = Browser.getWebElement(FullBookingJourneyPageObjects.MarketDayFlagToggleInput());
            result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        }
    }


    /**
     * Method to validate 'Market Day Flag' toggle is ON
     */
    public void verifyMarketDayFlagToggleIsOn() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.MarketDayFlagToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertTrue(result, "Market Day Flag toggle is OFF");
    }

    /**
     * Method to click on 'Project Details' tab
     */
    public void clickOnProjectDetailsTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectDetailsTab(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectDetailsTab());
        Browser.click(FullBookingJourneyPageObjects.ProjectDetailsTab());
    }

    /**
     * Method to click on 'Media Approval' button
     */
    public void clickOnMediaApprovalButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MediaApprovalButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MediaApprovalButton());
        Browser.click(FullBookingJourneyPageObjects.MediaApprovalButton());
    }

    /**
     * Method to click on 'Reject Media' button
     */
    public void clickOnRejectMediaButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.RejectMediaButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.RejectMediaButton());
        Browser.click(FullBookingJourneyPageObjects.RejectMediaButton());
    }

    /**
     * Method to click on 'Approve Media' button
     */
    public void clickOnApproveMediaButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ApproveMediaButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ApproveMediaButton());
        Browser.click(FullBookingJourneyPageObjects.ApproveMediaButton());
    }

    public void verifyMediaIsApprovedAuction() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionMediaTab(), 40);
        String status = Browser.getText(FullAuctionJourneyPageObjects.AuctionMediaTab());
        while (!status.contains("تمت الموافقة وتم النشر")) {
            Browser.waitForSeconds(10);
            driver.navigate().refresh();
            Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.AuctionMediaTab(), 40);
            status = Browser.getText(FullAuctionJourneyPageObjects.AuctionMediaTab());
        }
        logger.addScreenshot("Media status is: " + status);
        Assert.assertTrue(status.contains("Approved") || status.contains("تمت الموافقة وتم النشر"), "Actual media approval status is (" + status + ") and expected should be (Approved) OR (تمت الموافقة وتم النشر)");
    }    public void verifyMediaIsApproved() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MediaTabLabel(), 40);
        String status = Browser.getText(FullBookingJourneyPageObjects.MediaTabLabel());
        while (!status.contains("تمت الموافقة وتم النشر")) {
            Browser.waitForSeconds(10);
            driver.navigate().refresh();
            Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MediaTabLabel(), 40);
            status = Browser.getText(FullBookingJourneyPageObjects.MediaTabLabel());
        }
        logger.addScreenshot("Media status is: " + status);
        Assert.assertTrue(status.contains("Approved") || status.contains("تمت الموافقة وتم النشر"), "Actual media approval status is (" + status + ") and expected should be (Approved) OR (تمت الموافقة وتم النشر)");
    }

    public void verifyMediaModelIsApproved() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullAuctionJourneyPageObjects.MediaModel(), 40);
        String status = Browser.getText(FullAuctionJourneyPageObjects.MediaModel());
        while (!status.contains("تمت الموافقة وتم النشر")) {
            Browser.waitForSeconds(10);
            driver.navigate().refresh();
            status = Browser.getText(FullAuctionJourneyPageObjects.MediaModel());
        }
        logger.addScreenshot("Media status is: " + status);
        Assert.assertTrue(status.contains("Approved") || status.contains("تمت الموافقة وتم النشر"), "Actual media approval status is (" + status + ") and expected should be (Approved) OR (تمت الموافقة وتم النشر)");
    }

    public void verifyTheMediaIsApproved() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MediaTabLabel(), 40);
        String status = Browser.getText(FullBookingJourneyPageObjects.MediaTabLabel());
        logger.addScreenshot("Media status is: " + status);
        Assert.assertTrue(status.contains("Approved") || status.contains("تمت الموافقة وتم النشر"), "Actual media approval status is (" + status + ") and expected should be (Approved) OR (تمت الموافقة وتم النشر)");
    }

    /**
     * Method to click on 'Project Financial Institution Tab' button
     */
    public void clickOnProjectFinancialInstitutionTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectFinancialInstitutionTabLabel(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectFinancialInstitutionTabLabel());
        Browser.click(FullBookingJourneyPageObjects.ProjectFinancialInstitutionTabLabel());
    }

    /**
     * Method to click on a checkbox to select all the banks on 'Project Financial Institution' page
     */
    public void selectAllBanksInProjectFinancialInstitution() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SelectAllBanksCheckbox(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SelectAllBanksCheckbox());
        Browser.click(FullBookingJourneyPageObjects.SelectAllBanksCheckbox());
    }

    /**
     * Method to click on 'Booking Document Template' tab
     */
    public void clickOnBookingDocumentTemplateTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BookingDocumentTemplateTabLabel(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.BookingDocumentTemplateTabLabel());
        Browser.click(FullBookingJourneyPageObjects.BookingDocumentTemplateTabLabel());
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BookingDocumentTemplatePage(), 40);
    }

    /**
     * Method to click on 'Booking Template Type' dropdown to view available options
     */
    public void clickOnDocumentTemplateTypeDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BookingTemplateTypeDropdown(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.BookingTemplateTypeDropdown());
        Browser.click(FullBookingJourneyPageObjects.BookingTemplateTypeDropdown());
    }

    /**
     * Method to click on 'Unit Model' Tab
     */
    public void clickOnUnitModelTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UnitModelTabLabel(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UnitModelTabLabel());
        Browser.click(FullBookingJourneyPageObjects.UnitModelTabLabel());
    }

    /**
     * Method to click on model name of the unit model
     */
    public void clickOnUnitModelName() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UnitModelName(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UnitModelName());
        Browser.click(FullBookingJourneyPageObjects.UnitModelName());
    }

    /**
     * Method to click 'Save' button on 'Add new Unit models' pop up
     */
    public void clickOnSaveIcon() throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.SystemPopupMessage(), 40);
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaveButtonAddUnitModel(), 40);
        Browser.moveToElement(FullBookingJourneyPageObjects.SaveButtonAddUnitModel());
        Browser.click(FullBookingJourneyPageObjects.SaveButtonAddUnitModel());
    }

    /**
     * Method to click on 'Media' section tab on 'Units models' page
     */
    public void clickOnMediaSectionLabelOnUnitModelPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MediaSectionLabelOnUnitModelPage(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MediaSectionLabelOnUnitModelPage());
        Browser.click(FullBookingJourneyPageObjects.MediaSectionLabelOnUnitModelPage());
    }

    /**
     * Method to validate the status of the unit model
     *
     * @param expectedStatus - Expected status of the unit model
     */
    public void verifyStatusOfUnitModel(String expectedStatus) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UnitModelStatus(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UnitModelStatus());
        String actualStatus = Browser.getText(FullBookingJourneyPageObjects.UnitModelStatus()).toLowerCase();
        logger.addScreenshot("Status of the unit model is : " + actualStatus);
        Assert.assertTrue(actualStatus.contains(expectedStatus.toLowerCase()), "Actual status is (" + actualStatus + ") and expected is (" + expectedStatus + ")");
    }

    /**
     * Method to click on 'Project Sales Contract' tab label
     */
    public void clickOnProjectSalesContractTab() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectSalesContractTabLabel(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectSalesContractTabLabel());
        Browser.click(FullBookingJourneyPageObjects.ProjectSalesContractTabLabel());
    }

    /**
     * Method to click on 'Sales contract approval records' tab label
     */
    public void clickOnSaleContractApprovalRecordsTab() throws Exception {
        clickOnScrollArrowEnd();
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaleContractApprovalRecordsTabLabel(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SaleContractApprovalRecordsTabLabel());
        Browser.click(FullBookingJourneyPageObjects.SaleContractApprovalRecordsTabLabel());
    }

    /**
     * Method to click on 'Sales contract approval records' tab label
     */
    public void clickOnScrollArrowEnd() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ScrollArrowButtonEnd(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ScrollArrowButtonEnd());
        Browser.doubleClick(FullBookingJourneyPageObjects.ScrollArrowButtonEnd());
    }

    /**
     * Method to click on 'Sales contract approval records' tab label
     */
    public void clickOnScrollArrowStart() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ScrollArrowButtonStart(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ScrollArrowButtonStart());
        Browser.doubleClick(FullBookingJourneyPageObjects.ScrollArrowButtonStart());
    }


    /**
     * Method to click on 'View button' on 'Sales Contract Approval Records' page
     */
    public void clickOnViewButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ViewButtonOnSaleContractApprovalPage(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ViewButtonOnSaleContractApprovalPage());
        Browser.click(FullBookingJourneyPageObjects.ViewButtonOnSaleContractApprovalPage());
    }

    /**
     * Method to validate if 'Document viewer' is displayed on 'Sales Contract Approval Records' page after clicking on 'View' button
     */
    public void verifyDocumentViewerPopupIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DocumentViewerPopup(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DocumentViewerPopup());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(FullBookingJourneyPageObjects.DocumentViewerPopup()), "Document viewer is not displayed");
    }

    /**
     * Method to click on 'Download button' on 'Sales Contract Approval Records' page
     */
    public void clickOnDownloadButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DownloadButtonOnSaleContractApprovalPage(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DownloadButtonOnSaleContractApprovalPage());
        Browser.click(FullBookingJourneyPageObjects.DownloadButtonOnSaleContractApprovalPage());
    }

    /**
     * Method to enter download path in windows pop up and save
     */
    public void enterDownloadPath(String fileName) throws AWTException {
        emptyDownloadsFolder(System.getProperty("user.dir") + "\\src\\main\\resources\\downloads");
        TCRobot robot = new TCRobot();
        Browser.waitForSeconds(10);
        robot.setText(setDownloadPath(fileName));
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        Browser.waitForSeconds(3);
    }

    /**
     * Method to empty the downloads folder
     */
    public void emptyDownloadsFolder(String folderPath) {
        boolean b = false;
        File folder = new File(folderPath);
        // Check if the provided path is a directory
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("The provided path is not a directory.");
        }
        // List the contents of the directory
        File[] files = folder.listFiles();
        if (files != null) {
            // Iterate through the files and delete them
            for (File file : files) {
                if (file.isFile()) {
                    // If it's a file, delete it
                    b = file.delete();
                }
            }
        }
        System.out.println("File is deleted ? -> " + b);
    }

    /**
     * Method to set the download path with the desired file name
     */
    public String setDownloadPath(String fileName) {
        return System.getProperty("user.dir") + "\\src\\main\\resources\\downloads\\" + fileName;
    }

    /**
     * Method to validate to get the files name from the downloads folder
     */
    public ArrayList<String> getFilesNames(String folderPath) {
        ArrayList<String> filenames = new ArrayList<>();
        File folder = new File(folderPath);

        // Check if the provided path is a directory
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("The provided path is not a directory.");
        }
        // List the contents of the directory
        File[] files = folder.listFiles();
        if (files != null) {
            // Iterate through the files and print their names
            for (File file : files) {
                if (file.isFile()) {
                    // If it's a file, print its name
                    filenames.add(file.getName());
                }
            }
        }
        return filenames;
    }

    /**
     * Method to validate the downloaded file is present in the downloads folder
     */
    public void verifyAttachmentHasBeenDownloaded() {
        ArrayList<String> filenames = getFilesNames(System.getProperty("user.dir") + "\\src\\main\\resources\\downloads");
        boolean status = !(filenames.isEmpty());
        Assert.assertTrue(status, "File is not downloaded");
    }

    /**
     * Method to click on 'Back' button
     */
    public void clickOnBackButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BackButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.BackButton());
        Browser.click(FullBookingJourneyPageObjects.BackButton());
    }

    /**
     * Method to verify the sale contract status
     *
     * @param expectedStatus - Expected status of the contract
     */
    public void verifyTheSaleContractStatus(String expectedStatus) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaleContractStatus(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SaleContractStatus());
        String actualStatus = Browser.getText(FullBookingJourneyPageObjects.SaleContractStatus()).toLowerCase();
        logger.addScreenshot("Status of the Sale Contract is : " + actualStatus);
        Assert.assertTrue(actualStatus.contains(expectedStatus.toLowerCase()), "Actual status is (" + actualStatus + ") and expected is (" + expectedStatus + ")");
    }

    /**
     * Method to switch on 'Link with AZM' toggle
     */
    public void turnOnLinkWithAzmToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.LinkWithAzmToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.LinkWithAzmToggle());
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.LinkWithAzmToggle());
        boolean status = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        if (!status) {
            element.click();
        }
    }

    /**
     * Method to verify 'Link with AZM' toggle is ON
     */
    public void verifyLinkWithAzmToggleIsOn() throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 50);
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.LinkWithAzmToggle());
        boolean res = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("Link with AZM toggle is : " + res);
        Assert.assertTrue(res, "Link with AZM toggle is off");
    }

    /**
     * Method to switch on 'Is Published' toggle
     */
    public void clickOnIsPublishedToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.IsPublishedToggle(), 40);
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.IsPublishedToggleInput());
        boolean res = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        if (!(res)) {
            Browser.click(FullBookingJourneyPageObjects.IsPublishedToggle());
        }
    }

    /**
     * Method to verify 'Is Published' toggle is ON
     */
    public void verifyIsPublishedToggleIsOn() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.IsPublishedToggleInput());
        boolean res = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("Link with AZM toggle is : " + res);
        Assert.assertTrue(res, "Link with AZM toggle if off");
    }

    /**
     * Method to click on 'Marketplace' tab (Sakani housing)
     */
    public void clickOnMarketPlaceButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(MOHLandBookingJourneyPageObjects.marketPlaceNavButton(), 40);
        CommonUtilityPage.moveToObject(MOHLandBookingJourneyPageObjects.marketPlaceNavButton());
        Browser.click(MOHLandBookingJourneyPageObjects.marketPlaceNavButton());
    }

    /**
     * Method to click on 'Units list' button in Booking page (Sakani housing)
     */
    public void clickOnUnitsListButton() throws Exception {
//        Browser.waitUntilInvisibilityOfElement(PriceQuotationPageObjects.ApartmentDivLoader(), 50);
        CommonUtilityPage.verifyNewTabIsOpenedAndSwitch();
        Browser.waitUntilPresenceOfElement(FullBookingJourneyPageObjects.UnitsListButton(), 40);
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UnitsListButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UnitsListButton());
        Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.UnitsListButton(), 50);
        Browser.click(FullBookingJourneyPageObjects.UnitsListButton());
    }

    /**
     * Method to click on 'You have no financial recommendation' banner in Booking page (Sakani housing)
     */
    public void clickOnYouHaveNoFinancialRecommendationsBanner() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.YouHaveNoFinancialRecommendationsBanner(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.YouHaveNoFinancialRecommendationsBanner());
        Browser.click(FullBookingJourneyPageObjects.YouHaveNoFinancialRecommendationsBanner());
    }

    /**
     * Method to click on 'Financial Advisory' link inside 'You have no financial recommendation' banner in Booking page (Sakani housing)
     */
    public void clickOnFinancialAdvisoryButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.FinancialAdvisoryButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.FinancialAdvisoryButton());
        Browser.click(FullBookingJourneyPageObjects.FinancialAdvisoryButton());
    }

    /**
     * Method to click on 'Start Service' link on 'Financial Advisory' page (Sakani housing)
     */
    public void clickOnStartServiceButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.StartServiceButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.StartServiceButton());
        Browser.click(FullBookingJourneyPageObjects.StartServiceButton());
    }

    /**
     * Method to click on 'Employment type' dropdown on 'Financial Advisory' page (Sakani housing)
     */
    public void clickOnEmploymentTypeDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.EmploymentTypeDropdown(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.EmploymentTypeDropdown());
        Browser.click(FullBookingJourneyPageObjects.EmploymentTypeDropdown());
    }

    /**
     * Method to click on 'Type of Salary bank' dropdown on 'Financial Advisory' page (Sakani housing)
     */
    public void clickOnTypeOfSalaryBankDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.TypeOfSalaryBankDropdown(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.TypeOfSalaryBankDropdown());
        Browser.click(FullBookingJourneyPageObjects.TypeOfSalaryBankDropdown());
    }

    /**
     * Method to input text in 'Basic Salary' field on 'Financial Advisory' page (Sakani housing)
     *
     * @param salary - Text to be entered
     */
    public void enterBasicSalary(String salary) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BasicSalaryInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.BasicSalaryInput());
        Browser.setText(FullBookingJourneyPageObjects.BasicSalaryInput(), salary);
    }

    /**
     * Method to input text in 'Housing Allowance' field on 'Financial Advisory' page (Sakani housing)
     *
     * @param allowance - text to be entered
     */
    public void enterHousingAllowance(String allowance) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.HousingAllowanceInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.HousingAllowanceInput());
        Browser.setText(FullBookingJourneyPageObjects.HousingAllowanceInput(), allowance);
    }

    /**
     * Method to input text in 'Other Allowance' field on 'Financial Advisory' page (Sakani housing)
     *
     * @param allowance - text to be entered
     */
    public void enterOtherAllowance(String allowance) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.OtherAllowanceInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.OtherAllowanceInput());
        Browser.setText(FullBookingJourneyPageObjects.OtherAllowanceInput(), allowance);
    }

    /**
     * Method to input text in 'Financial Saving' field on 'Financial Advisory' page (Sakani housing)
     *
     * @param saving - text to be entered
     */
    public void enterFinancialSaving(String saving) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.FinancialSavingInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.FinancialSavingInput());
        Browser.setText(FullBookingJourneyPageObjects.FinancialSavingInput(), saving);
    }

    /**
     * Method to input text in 'Value of Down payment' field on 'Financial Advisory' page (Sakani housing)
     *
     * @param downPayment - text to be entered
     */
    public void enterDownPayment(String downPayment) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DownPaymentInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DownPaymentInput());
        Browser.setText(FullBookingJourneyPageObjects.DownPaymentInput(), downPayment);
    }

    /**
     * Method to input text in 'Monthly Commitments' field on 'Financial Advisory' page (Sakani housing)
     *
     * @param monthlyCommitment - text to be entered
     */
    public void enterMonthlyCommitment(String monthlyCommitment) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MonthlyCommitmentInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MonthlyCommitmentInput());
        Browser.setText(FullBookingJourneyPageObjects.MonthlyCommitmentInput(), monthlyCommitment);
    }

    /**
     * Method to input number of months in 'Duration of Monthly Commitments' field on 'Financial Advisory' page (Sakani housing)
     *
     * @param duration - Duration in months (360 max)
     */
    public void enterDurationOfCommitment(String duration) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DurationOfCommitmentInput(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DurationOfCommitmentInput());
        Browser.setText(FullBookingJourneyPageObjects.DurationOfCommitmentInput(), duration);
    }

    /**
     * Method to select the 'Product Type' from 'Financial Advisory' page (Sakani housing)
     *
     * @param type - type of the product to be selected
     */
    public void selectProductType(String type) throws Exception {
        if (TestConfigManager.getSettingsApplicationLanguage().equalsIgnoreCase("ar")) {
            type = type.split("/")[1];
        } else {
            type = type.split("/")[0];
        }
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProductType(type), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProductType(type));
        Browser.click(FullBookingJourneyPageObjects.ProductType(type));
    }

    /**
     * Method to verify the 'Product Type' is selected on 'Financial Advisory' page (Sakani housing)
     */
    public void verifyProductTypeIsSelected() throws Exception {
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementPresent(FullBookingJourneyPageObjects.ActiveProductType()), "Product type is not selected");
    }

    /**
     * Method to click on 'Disclaimer' checkbox on 'Financial Advisory' page (Sakani housing)
     */
    public void clickOnDisclaimerCheckbox() throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 200);
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DisclaimerCheckbox(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DisclaimerCheckbox());
        Browser.click(FullBookingJourneyPageObjects.DisclaimerCheckbox());
    }

    /**
     * Method to verify 'Disclaimer' checkbox is clicked on 'Financial Advisory' page (Sakani housing)
     */
    public void verifyDisclaimerCheckboxIsClicked() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.DisclaimerCheckbox(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.DisclaimerCheckbox());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementSelected(FullBookingJourneyPageObjects.DisclaimerCheckbox()));
    }

    /**
     * Method to verify 'Submit' button is disabled on 'Financial Advisory' page (Sakani housing)
     */
    public void verifySubmitButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SubmitButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SubmitButton());
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(FullBookingJourneyPageObjects.SubmitButton()));
    }

    /**
     * Method to click on 'Submit' button on 'Financial Advisory' page (Sakani housing)
     */
    public void clickOnSubmitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SubmitButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SubmitButton());
        Browser.click(FullBookingJourneyPageObjects.SubmitButton());
    }

    /**
     * Method to click on 'Start Booking' button on 'Booking' page (Sakani housing)
     */
    public void clickOnStartBookingButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.StartBookingButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.StartBookingButton());
        Browser.click(FullBookingJourneyPageObjects.StartBookingButton());
    }

    /**
     * Method to select the unit to book on 'Units' page based on the UI language (Sakani housing)
     */
    public void selectUnitForBooking() throws Exception {
            Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UnitForBooking(), 40);
            CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UnitForBooking());
            Browser.click(FullBookingJourneyPageObjects.UnitForBooking());
    }

    /**
     * Method to click on 'Book unit' button (Sakani housing)
     */
    public void clickOnBookUnitButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 40);
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BookUnitButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.BookUnitButton());
        Browser.click(FullBookingJourneyPageObjects.BookUnitButton());
    }

    /**
     * Method to Cancel the ongoing booking process (Sakani housing)
     */
    public void cancelTheExistingBookingProcess() throws Exception {
        if (Browser.isElementPresent(FullBookingJourneyPageObjects.ExistingBookingBanner())) {
            Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.ExistingBookingBanner(), 50);
            Browser.click(FullBookingJourneyPageObjects.ExistingBookingBanner());
            if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.cancelBookingButton())) {
                Browser.waitUntilElementToBeClickable(MOHLandBookingJourneyPageObjects.cancelBookingButton(), 50);
                Browser.click(MOHLandBookingJourneyPageObjects.cancelBookingButton());
                Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CancelButtonOnPopup(), 40);
                Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.CancelButtonOnPopup(), 50);
                Browser.click(FullBookingJourneyPageObjects.CancelButtonOnPopup());
            }
        }
    }

    /**
     * Method to click on 'Continue' button after selecting unit for booking(Sakani housing)
     */
    public void clickOnContinueButton() throws Exception {
        if (Browser.isElementPresent(FullBookingJourneyPageObjects.ContinueButton())){
            Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ContinueButton(), 40);
            CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ContinueButton());
            Browser.click(FullBookingJourneyPageObjects.ContinueButton());
            Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 40);
        }
        else if (Browser.isElementPresent(By.xpath("//button[contains (text(), 'تأكيد')]"))){
            Browser.waitUntilVisibilityOfElement(By.xpath("//button[contains (text(), 'تأكيد')]"), 40);
            CommonUtilityPage.moveToObject(By.xpath("//button[contains (text(), 'تأكيد')]"));
            Browser.click(By.xpath("//button[contains (text(), 'تأكيد')]"));
            Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 40);
        }
    }

    /**
     * Method to click on 'Pay Booking Fee' button after selecting unit for booking(Sakani housing)
     */
    public void clickOnPayBookingFeeButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.PayBookingFeeButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.PayBookingFeeButton());
        Browser.click(FullBookingJourneyPageObjects.PayBookingFeeButton());
    }

    /**
     * Method to input payment card details to pay Booking Fee (Sakani housing)
     *
     * @param cardNumber - Number of the card
     * @param cardName   - Name on the card
     * @param cardExpiry - Expiry date of the card
     * @param cvv        - CVV2 number of the card
     */
    public void enterCardDetails(String cardNumber, String cardExpiry, String cvv, String cardName) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.payNowTitle(), 30);
        Browser.driver.switchTo().frame("card.number");
        Browser.setText(FullBookingJourneyPageObjects.cardNumberInput(), cardNumber);
        Browser.driver.switchTo().defaultContent();
        Browser.setText(BookingPageObjects.holderNameInputTxt(), cardName);
        Browser.setText(BookingPageObjects.expiryDateInputTxt(), cardExpiry);
        Browser.driver.switchTo().frame("card.cvv");
        Browser.setText(BookingPageObjects.cvvInputTxt(), cvv);
        Browser.driver.switchTo().defaultContent();
    }

    /**
     * Method to click on 'Mada' card for payment (Sakani housing)
     */
    public void clickOnMadaButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MadaButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.MadaButton());
        Browser.click(FullBookingJourneyPageObjects.MadaButton());
    }

    /**
     * Method to click on 'Pay Now' button after filling card details for payment (Sakani housing)
     */
    public void clickOnPayNow() throws Exception {
        Browser.click(BookingPageObjects.payNowButton());
    }

    /**
     * Method to click on 'Submit' button on payment gateway (Sakani housing)
     */
    public void clickOnSubmit() throws Exception {
        Browser.waitUntilInvisibilityOfElement(BookingPageObjects.payNowButton(), 50);
        Browser.executeJSScroll(300);
        Actions actions = new Actions(Browser.driver);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }

    /**
     * Method to click on 'Close' button on pop up after successful payment (Sakani housing)
     */
    public void clickOnXButtonOnReviewPopup() throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 40);
        Browser.waitUntilElementToBeClickable(BookingPageObjects.closeReview(), 40);
        CommonUtilityPage.moveToObject(BookingPageObjects.closeReview());
        Browser.click(BookingPageObjects.closeReview());
    }

    /**
     * Method to verify the 'Success' message after payment is done for unit booking (Sakani housing)
     */
    public void verifySuccessMessageForUnitBooking() throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 40);
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.PaymentSuccessMessage(), 30);
        String BookingMsg = Browser.getWebElement(FullBookingJourneyPageObjects.PaymentSuccessMessage()).getText();
        logger.addScreenshot("");
        Assert.assertTrue(BookingMsg.contains("Payment successfully") || BookingMsg.contains("تم الدفع بنجاح"), "Success message is not displayed");
    }

    /**
     * Method to click on the 'Cancel Booking' button on Booking Process banner (Sakani housing)
     */
    public void clickOnCancelBookingButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CancelBookingButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.CancelBookingButton());
        Browser.click(FullBookingJourneyPageObjects.CancelBookingButton());
    }

    /**
     * Method to click 'Cancel' button on the pop-up (Sakani housing)
     */
    public void clickOnCancelButtonOnPopup() throws Exception {
        if (Browser.isElementPresent(FullBookingJourneyPageObjects.CancelButtonOnPopup())){
            Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CancelButtonOnPopup(), 40);
            CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.CancelButtonOnPopup());
            Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.CancelButtonOnPopup(), 50);
            Browser.click(FullBookingJourneyPageObjects.CancelButtonOnPopup());
        }
    }

    /**
     * Method to select Cancellation reason and click on 'Submit' button (Sakani housing)
     */
    public void selectCancelReasonAndConfirm() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CancelReason(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.CancelReason());
        Browser.click(FullBookingJourneyPageObjects.CancelReason());
        CommonUtilityPage.moveToObject(MOHLandBookingJourneyPageObjects.confirmCancellationButton());
        Browser.click(MOHLandBookingJourneyPageObjects.confirmCancellationButton());
    }

    /**
     * Click on 'Yes' button on the confirmation pop up (Sakani housing)
     */
    public void clickOnYesButtonOnPopup() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.YesButtonPopup(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.YesButtonPopup());
        Browser.click(FullBookingJourneyPageObjects.YesButtonPopup());
    }

    /**
     * Method to cancel the unit booking from 'Bookings' page (Sakani housing)
     */
    public void cancelTheBooking() throws Exception {
        new EligibilityPage().hoverToUserIconProfile();
        new EligibilityPage().clickOnMyProfileButton();
        new MOHLandBookingJourneyPage().clickOnMyActivitiesButton();
        new MOHLandBookingJourneyPage().clickOnBookingsButton();
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.MyBookingsPageTitle(), 40);
        if (Browser.isElementPresent(MOHLandBookingJourneyPageObjects.viewBookingButton())) {
            new MOHLandBookingJourneyPage().clickOnViewBookingButton();
            clickOnCancelBookingButton();
//            clickOnContinueButton();
            selectCancelReasonAndConfirm();
            clickOnYesButtonOnPopup();
            CommonUtilityPage.verifyValueIsDisplayed("نجاح", "Success", FullBookingJourneyPageObjects.AdvisorySuccessMessage());
            clickOnMarketPlaceButton();
        } else {
            clickOnMarketPlaceButton();
        }
    }

    /**
     * Verify the Booking is displayed on 'Bookings' page(Sakani housing)
     *
     * @param projectName - Project name to which the booked unit belongs
     */
    public void verifyBookingIsDisplayed(String projectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ProjectNameOfBookedUnit(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ProjectNameOfBookedUnit());
        String actualName = Browser.getText(FullBookingJourneyPageObjects.ProjectNameOfBookedUnit());
        logger.addScreenshot("");
        Assert.assertTrue(actualName.contains(projectName), "Actual project name is (" + actualName + ") and expected is (" + projectName + ")");
        Assert.assertTrue(Browser.isElementDisplayed(FullBookingJourneyPageObjects.BookedUnitCode()), "Unit code is not displayed");
    }

    /**
     * Verify 'Fee status' of the booking (Sakani housing)
     *
     * @param statusEN - Status to be validated in English
     * @param statusAR - Status to be validated in Arabic
     */
    public void verifyBookingFeeStatus(String statusAR, String statusEN) throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.BookingFeeStatus(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.BookingFeeStatus());
        String actualStatus = Browser.getText(FullBookingJourneyPageObjects.BookingFeeStatus());
        logger.addScreenshot("");
        Assert.assertTrue(actualStatus.contains(statusEN) || actualStatus.contains(statusAR), "Actual status is (" + actualStatus + ") and expected should be (" + statusEN + ") OR (" + statusAR + ")");
    }

    /**
     * Click on 'Sign Sale Contract' link (Sakani housing)
     */
    public void clickOnSignContractButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SignContractButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SignContractButton());
        Browser.click(FullBookingJourneyPageObjects.SignContractButton());
    }

    /**
     * Click on 'Reject' button for 'Sign sale contract' (Sakani housing)
     */
    public void clickOnRejectButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(FullBookingJourneyPageObjects.LoadingIconForHousing(), 40);
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.RejectButtonForSignSaleContract(), 40);
        Browser.executeJSScroll(-500);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.RejectButtonForSignSaleContract());
        Browser.click(FullBookingJourneyPageObjects.RejectButtonForSignSaleContract());
    }

    /**
     * Click on 'No' button on confirmation pop up for rejecting the 'Sign sale contract' (Sakani housing)
     */
    public void clickOnNoButtonOnPopup() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.NoButtonOnPopup(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.NoButtonOnPopup());
        Browser.click(FullBookingJourneyPageObjects.NoButtonOnPopup());
    }

    /**
     * Verify the confirmation pop up for rejecting the 'Sign sale contract' is dismissed when clicked on 'No' button (Sakani housing)
     */
    public void verifyConfirmationPopupIsNotDisplayed() throws Exception {
        logger.addScreenshot("");
        Assert.assertFalse(Browser.isElementPresent(FullBookingJourneyPageObjects.YesButtonPopup()), "Confirmation pop is still displayed");
    }

    /**
     * Verify the confirmation pop up for rejecting the 'Sign sale contract' is dismissed when clicked on 'No' button (Sakani housing)
     */
    public void enterRejectionReason(String reason) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.RejectionReasonInput(), 40);
        Browser.executeJSScroll(-500);
        Browser.waitForSeconds(1);
        Browser.setText(FullBookingJourneyPageObjects.RejectionReasonInput(), reason);
    }

    /**
     * Click on 'Cancelled' tab on 'Bookings' page to view the Cancelled booking (Sakani housing)
     */
    public void clickOnCancelledLink() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CancelledLink(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.CancelledLink());
        Browser.click(FullBookingJourneyPageObjects.CancelledLink());
    }

    /**
     * Verify the Booking Cancellation date is same as the current date (Sakani housing)
     */
    public void verifyBookingCancellationDate() throws Exception {
        Browser.waitUntilPresenceOfElement(FullBookingJourneyPageObjects.CancellationDate(), 40);
        String actualDate = Browser.getText(FullBookingJourneyPageObjects.CancellationDate()).strip();
        String expectedDate = CommonUtilityPage.getDate(0, 0, 0);
        boolean status = false;
        if (expectedDate.split("/")[0].contains(actualDate.split("/")[2])) {
            if (expectedDate.split("/")[1].contains(actualDate.split("/")[1])) {
                if (expectedDate.split("/")[2].contains(actualDate.split("/")[0])) {
                    status = true;
                }
            }
        }
        logger.addScreenshot("Booking cancellation Date is: " + actualDate);
        Assert.assertTrue(status, "Booking cancellation date is not correct");
    }

    /**
     * Click on 'Approve' button for 'Sign Sale Contract' (Sakani housing)
     */
    public void clickOnApproveButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ApproveButtonForSignSaleContract(), 40);
        Browser.executeJSScroll(500);
        Browser.waitForSeconds(1);
        Browser.click(FullBookingJourneyPageObjects.ApproveButtonForSignSaleContract());
    }

    /**
     * Verify the 'View' button for 'Sign Contract' is disabled when Sale contract is not signed (Sakani housing)
     */
    public void verifyViewSignContractButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ViewSignContractButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ViewSignContractButton());
        String att = Browser.getAttributeValue(FullBookingJourneyPageObjects.ViewSignContractButton(), "class");
        logger.addScreenshot("");
        Assert.assertTrue(att.contains("none"), "Button is not disabled");
    }

    /**
     * Check 'Verify OTP' button is disabled when OTP is not provided (Sakani housing)
     */
    public void checkVerifyButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.VerifyOTPButton(), 40);
        logger.addScreenshot("");
        Assert.assertTrue(Browser.isElementDisabled(FullBookingJourneyPageObjects.VerifyOTPButton()));
    }

    /**
     * Click on 'Verify OTP' button (Sakani housing)
     */
    public void clickOnVerifyOTPButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.VerifyOTPButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.VerifyOTPButton());
        Browser.click(FullBookingJourneyPageObjects.VerifyOTPButton());
    }

    /**
     * Verify the 'Sign status' of sale contract (Sakani housing)
     *
     * @param statusEN - Status to be validated in English
     * @param statusAR - Status to be validated in Arabic
     */
    public void verifyTheSaleContractSignStatus(String statusAR, String statusEN) throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaleContractSignStatus(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.SaleContractSignStatus());
        String actualStatus = Browser.getText(FullBookingJourneyPageObjects.SaleContractSignStatus());
        logger.addScreenshot("");
        Assert.assertTrue(actualStatus.contains(statusEN) || actualStatus.contains(statusAR), "Actual status is (" + actualStatus + ") and expected should be (" + statusEN + ") OR (" + statusAR + ")");
    }

    /**
     * Click on 'View sale Contract' button after sale contract is signed (Sakani housing)
     */
    public void clickOnViewSaleContractButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.ViewSignContractButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.ViewSignContractButton());
        Browser.click(FullBookingJourneyPageObjects.ViewSignContractButton());
    }

    /**
     * Verify the toast message (Sakani admin)
     */
    public void verifyToastMessage(String valueAR, String valueEN, By locator) {
        Browser.waitUntilPresenceOfElement(locator, 40);
        Browser.waitForSeconds(2);
        String elementText = Browser.getText(locator);
        logger.addScreenshot("");
        Assert.assertTrue(elementText.contains(valueAR) || elementText.contains(valueEN), "Actual message is (" + elementText + "), expected is (" + valueAR + ") OR (" + valueEN + ")");
    }

    /**
     * Click on 'Check your Financial Recommendation' link from profile dashboard (Sakani housing)
     */
    public void clickOnCheckYourFinancialRecommendation() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.CheckYourFinancialRecommendationLink(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.CheckYourFinancialRecommendationLink());
        Browser.click(FullBookingJourneyPageObjects.CheckYourFinancialRecommendationLink());
    }

    /**
     * Method to Click on 'Back' arrow button to navigate back to the previous page (Sakani Admin)
     */
    public void clickOnBackArrowButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.BackArrowButton(), 40);
        Browser.moveToElement(FullBookingJourneyPageObjects.BackArrowButton());
        Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.BackArrowButton(),100);
        Browser.click(FullBookingJourneyPageObjects.BackArrowButton());
    }

    /**
     * Method to verify 'Save' button is enabled when a file is uploaded for 'Project Sales Contract' (Sakani Admin)
     */
    public void verifySaveButtonIsEnabledOnProjectSalesContractPage() throws Exception {
        logger.addScreenshot("");
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.SaveButton(), 40);
        Assert.assertTrue(Browser.isElementEnabled(FullBookingJourneyPageObjects.SaveButton()));
    }

    public void uploadBannerImage(String imagePath) throws Exception {
        if (Browser.isElementPresent(FullBookingJourneyPageObjects.BannerImageRemoveButton())) {
            Browser.click(FullBookingJourneyPageObjects.BannerImageRemoveButton());
            Browser.driver.switchTo().alert().accept();
        }
        CommonUtilityPage.UploadAttachment(imagePath, FullBookingJourneyPageObjects.BannerImageAttachment());
    }

    public void clickOnIsPublishUnitModelToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.IsPublishUnitModelToggle(), 40);
        boolean state = Boolean.parseBoolean(Browser.getAttributeValue(FullBookingJourneyPageObjects.IsPublishUnitModelToggle(), "aria-checked"));
        while (!state) {
            Browser.moveToElement(FullBookingJourneyPageObjects.IsPublishUnitModelToggle());
            Browser.waitUntilElementToBeClickable(FullBookingJourneyPageObjects.IsPublishUnitModelToggle(),50);
            Browser.click(FullBookingJourneyPageObjects.IsPublishUnitModelToggle());
            state = Boolean.parseBoolean(Browser.getAttributeValue(FullBookingJourneyPageObjects.IsPublishUnitModelToggle(), "aria-checked"));
        }
    }

    public void verifyIsPublishUnitModelToggleIsOn() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.IsPublishUnitModelToggle(), 40);
        boolean state = Boolean.parseBoolean(Browser.getAttributeValue(FullBookingJourneyPageObjects.IsPublishUnitModelToggle(), "aria-checked"));
        logger.addScreenshot("Publish unit model switch state is : " + state);
        Assert.assertTrue(state, "Publish unit model switch is OFF");
    }

    public void clickOnUpdateMyInformationLink() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UpdateMyInformationLink(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UpdateMyInformationLink());
        Browser.click(FullBookingJourneyPageObjects.UpdateMyInformationLink());
    }

    public void clickOnUpdateFinancialInformationButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UpdateFinancialInformationButton(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UpdateFinancialInformationButton());
        Browser.click(FullBookingJourneyPageObjects.UpdateFinancialInformationButton());
    }

    /**
     * Validate 'Using General Booking' Fee toggle is OFF
     */
    public void verifyUsingGeneralBookingFeeToggleIsOFF() throws Exception {
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.UsingGeneralBookingFeeToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        logger.addScreenshot("");
        Assert.assertFalse(result, "Using general fee toggle is ON");
    }

    /**
     * Click on 'Using General Booking Fee' Toggle to turn it OFF
     */
    public void turnOffUsingThisFeeInSakaniAndPartnersToggles() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UseBookingFeeFlagOnSakani(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UseBookingFeeFlagOnSakani());
        WebElement element_1 = Browser.getWebElement(FullBookingJourneyPageObjects.UseBookingFeeFlagOnSakani());
        boolean result_1 = Boolean.parseBoolean(element_1.getAttribute("aria-checked"));
        if (result_1) {
            Browser.click(FullBookingJourneyPageObjects.UseBookingFeeFlagOnSakani());
        }
        WebElement element_2 = Browser.getWebElement(FullBookingJourneyPageObjects.UseBookingFeeFlagOnSakani());
        boolean result_2 = Boolean.parseBoolean(element_2.getAttribute("aria-checked"));
        if (result_2) {
            Browser.click(FullBookingJourneyPageObjects.UseBookingFeeFlagOnSakani());
        }
    }

    /**
     * Click on 'Using General Booking Fee' Toggle to turn it OFF
     */
    public void turnOffUsingGeneralBookingFeeToggle() throws Exception {
        Browser.waitUntilVisibilityOfElement(FullBookingJourneyPageObjects.UsingGeneralBookingFeeToggle(), 40);
        CommonUtilityPage.moveToObject(FullBookingJourneyPageObjects.UsingGeneralBookingFeeToggle());
        WebElement element = Browser.getWebElement(FullBookingJourneyPageObjects.UsingGeneralBookingFeeToggleInput());
        boolean result = Boolean.parseBoolean(element.getAttribute("aria-checked"));
        if (result) {
            Browser.click(FullBookingJourneyPageObjects.UsingGeneralBookingFeeToggleInput());
        }
    }
}

