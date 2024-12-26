package sa.nhc.web.pages;

import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.*;
import sa.nhc.web.objects.exisitng.*;
import sa.nhc.web.objects.exisitng.LoginPageObjects;
import sa.nhc.web.pages.exisitng.CommonUtilityPage;
import sa.nhc.web.pages.exisitng.LoginPage;

import java.awt.event.KeyEvent;

import static com.testcrew.web.Browser.logger;

public class RegisterOfInterestPage {
    public void LoginBTNExistenceChecker() throws Exception {
        Assert.assertTrue(Browser.isElementPresent(HomePageObjects.Visitor_ADV_BTN_Login()), "The Login Button Is not Exist");
        logger.addScreenshot("Login BTN Existence Checker");
    }

    public void submitBTNExistenceChecker() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.SubmitBTn(), 50);
        Assert.assertTrue(Browser.isElementPresent(HomePageObjects.SubmitBTn()), "The Submit Button Is not Exist");
        logger.addScreenshot("submit BTN Existence Checker");
    }

    public void emailFieldExistenceChecker() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.EmailField(), 50);
        WebElement registerYourInterestMSG = Browser.getWebElement(HomePageObjects.EmailField());
        boolean result = registerYourInterestMSG.isDisplayed();
        Assert.assertTrue(result, "The Email Field Is not Displayed");
    }

    public void registerYourInterestLabelExistenceChecker() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.registerYourInterestLabel(), 50);
        WebElement registerYourInterestMSG = Browser.getWebElement(HomePageObjects.registerYourInterestLabel());
        boolean result = registerYourInterestMSG.isDisplayed();
        Assert.assertTrue(result, "The Register Your Interest Label Is not Displayed");
    }

    public void verifyUnsuccessfulRegistrationInvalidEmail() throws Exception {
        Browser.waitForSeconds(2);
        Assert.assertTrue(Browser.isElementPresent(HomePageObjects.InvalidEmailValidationMSG()), "The User submitted successfully with invalid Email");
        logger.addScreenshot("verify Unsuccessful Registration Invalid Email");
    }

    public void RegisteringTwiceMSGContentChecker(String msg) throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.alreadyRegisteredProjectMSG(), 50);
        Assert.assertEquals(Browser.getText(HomePageObjects.alreadyRegisteredProjectMSG()), msg, "The Invalid Email Validation MSG Content is not match");
        logger.addScreenshot("Registering Twice MSG Content Checker");
    }

    public void ValidationMessageExistenceOfRegisteringTwice() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.alreadyRegisteredProjectMSG(), 50);
        Assert.assertTrue(Browser.isElementPresent(HomePageObjects.alreadyRegisteredProjectMSG()), "The validation MSg of register your interest twice is not exist");
        logger.addScreenshot("Validation Message Existence Of Registering Twice");
    }

    public void unableRegisteringTwice() throws Exception {
        Browser.waitForSeconds(2);
        Assert.assertFalse(Browser.isElementPresent(HomePageObjects.ValidationMSG()), "The user is able to register his interest twice for the same project");
        logger.addScreenshot("unable Registering Twice");
    }

    public void verifyValidationMessageOfSuccessRegistered() throws Exception {
        Browser.waitForSeconds(2);
        Assert.assertTrue(Browser.isElementPresent(HomePageObjects.ValidationMSG()), "The user is unable to submit with valid email");
        logger.addScreenshot("verify Validation Message Of Success Registered");
    }

    public void verifyValidationMessageOfInvalidEmail() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.InvalidEmailValidationMSG(), 50);
        Assert.assertTrue(Browser.isElementPresent(HomePageObjects.InvalidEmailValidationMSG()), "The Invalid Email Validation MSG Didn't Appeared");
        logger.addScreenshot("verify Validation Message Of Invalid Email");
    }

    public void TheInValidEmailMSGContentChecker(String inValidEMailValidationMSG) throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.InvalidEmailValidationMSG(), 50);
        Assert.assertEquals(Browser.getText(HomePageObjects.InvalidEmailValidationMSG()), inValidEMailValidationMSG, "The Invalid Email Validation MSG Content is not match");
        logger.addScreenshot("The InValid Email MSG Content Checker");
    }

    public void EnterEmailWithSpecialCharacters(String EMailWithSpecialCharacters) throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.EmailField(), 50);
        Browser.waitForSeconds(3);
        Browser.setText(HomePageObjects.EmailField(), EMailWithSpecialCharacters);
        Assert.assertTrue(Browser.isElementDisabled(HomePageObjects.SubmitBTn()), "The User is able to click submit while the email Contains SpecialCharacters");
        logger.addScreenshot("Enter Email With Special Characters");
    }

    public void EnterEmailWithSpaces(String EMailWithSpaces) throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.EmailField(), 50);
        Browser.waitForSeconds(3);
        Browser.setText(HomePageObjects.EmailField(), EMailWithSpaces);
        Assert.assertTrue(Browser.isElementDisabled(HomePageObjects.SubmitBTn()), "The User is able to click submit while the email Contains SPaces");
        logger.addScreenshot("Enter Email With Spaces");
    }

    public void EnterTheInValidEmail(String inValidEMail) throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.EmailField(), 50);
        Browser.waitForSeconds(3);
        Browser.setText(HomePageObjects.EmailField(), inValidEMail);
        Browser.click(HomePageObjects.SubmitBTn());
        logger.addScreenshot("Enter The InValid Email");
    }

    public void leaveTheEmailEmpty() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.EmailField(), 50);
        Browser.waitForSeconds(3);
        Browser.clearText(HomePageObjects.EmailField());
        Assert.assertTrue(Browser.isElementDisabled(HomePageObjects.SubmitBTn()), "The User is able to click submit while the email field is empty");
        logger.addScreenshot("leave The Email Empty");
    }

    public void enterAnyValidEmailValidation(String ValidEMail) throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.EmailField(), 50);
        Browser.waitForSeconds(3);
        Browser.setText(HomePageObjects.EmailField(), ValidEMail);
        Assert.assertTrue(Browser.isElementEnabled(HomePageObjects.SubmitBTn()), "The User is unable to Click Submit by entering a valid email");
        logger.addScreenshot("enter Any Valid Email Validation");
    }

    public void enterTheValidEmail(String ValidEmail) throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.EmailField(), 50);
        Browser.waitForSeconds(3);
        Browser.setText(HomePageObjects.EmailField(), ValidEmail);
        Browser.click(HomePageObjects.SubmitBTn());
        logger.addScreenshot("enter The Valid Email");
    }

    public void ListOfApartments() throws Exception {
        Browser.executeJSScrollIntoView(HomePageObjects.ListOfApartments());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(HomePageObjects.ListOfApartments(), 50);
        Browser.executeJSClick(HomePageObjects.ListOfApartments());
        logger.addScreenshot("List Of Apartments");
    }

    public void ResultProjectDiv() throws Exception {
        Browser.waitUntilElementToBeClickable(HomePageObjects.Result_Project_dIV(), 50);
        Browser.click(HomePageObjects.Result_Project_dIV());
        logger.addScreenshot("Result_Project_dIV");
    }

    public void AccessWebsiteAndClickOnMarketPlaceAsAGuest() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.Cookies_BTN(), 50);
        Browser.click(HomePageObjects.Cookies_BTN());
        Browser.waitUntilVisibilityOfElement(HomePageObjects.Register_Your_interest_Close_BTN(), 50);
        Browser.click(HomePageObjects.Register_Your_interest_Close_BTN());
        Browser.executeJSScroll(-1100);
        Browser.waitUntilVisibilityOfElement(HomePageObjects.MarketPlaceBTN(), 50);
        Browser.click(HomePageObjects.MarketPlaceBTN());
        Browser.click(HomePageObjects.CloseIntroductionBTN());
        logger.addScreenshot("Click On MarketPlace");
    }

    public void visitorNotLogin() throws Exception {
        TCRobot robot = new TCRobot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }
        Browser.waitUntilVisibilityOfElement(HomePageObjects.Visitor_ADV_BTN_Login(), 50);
        Browser.waitUntilElementToBeClickable(HomePageObjects.Visitor_ADV_BTN_Login(), 50);
        Browser.click(HomePageObjects.Visitor_ADV_BTN_Login());
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.BTNLogin(), 50);
        Browser.driver.navigate().back();
    }

    public void visitorLogin(String Username, String Password, String OTP) throws Exception {
        TCRobot robot = new TCRobot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }
        Browser.waitUntilVisibilityOfElement(HomePageObjects.Visitor_ADV_BTN_Login(), 50);
        Browser.waitUntilElementToBeClickable(HomePageObjects.Visitor_ADV_BTN_Login(), 50);
        Browser.click(HomePageObjects.Visitor_ADV_BTN_Login());
        Browser.executeJSScroll(-1000);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.BTNLogin(), 50);
        Browser.waitForSeconds(2);
        Browser.setText(LoginPageObjects.TXTIDNumber(), Username);
        Browser.setText(LoginPageObjects.TXTPassword(), Password);
        Browser.click(LoginPageObjects.BTNLogin());
        logger.addScreenshot("Visitor Login Button inside the register your interest label");
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.GuestTXTOTP(), 50);
        Browser.waitUntilElementToBeClickable(CommonUtilityPageObjects.GuestTXTOTP(), 50);
        new LoginPage().enterOTPForUser(OTP);
        logger.addScreenshot("Entered OTP");
        Browser.click(CommonUtilityPageObjects.BTNVerify());
        if (Browser.isElementPresent(HomePageObjects.BtnX()) && Browser.isElementPresent(LoginPageObjects.BTNChoose())) {
            Browser.click(HomePageObjects.BtnX());
            Browser.click(LoginPageObjects.BTNChoose());
        } else if (Browser.isElementPresent(HomePageObjects.BtnX())) {
            Browser.click(HomePageObjects.BtnX());
        } else if (Browser.isElementPresent(LoginPageObjects.BTNChoose())) {
            Browser.click(LoginPageObjects.BTNChoose());
        }
    }

    public void ProjectNameSearch(String ProjectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegisterOfInterestPageObjects.ProjectNameField(), 50);
        Browser.moveToElement(RegisterOfInterestPageObjects.SearchProjectBTN());
        Browser.waitUntilInvisibilityOfElement(RegisterOfInterestPageObjects.projectsSpinnerLoader(), 50);
        TCRobot robot = new TCRobot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }
        Browser.setText(RegisterOfInterestPageObjects.ProjectNameField(), ProjectName);
        Browser.moveToElement(RegisterOfInterestPageObjects.SearchProjectBTN());
        Browser.click(RegisterOfInterestPageObjects.SearchProjectBTN());
        Browser.waitUntilInvisibilityOfElement(RegisterOfInterestPageObjects.projectsSpinnerLoader(), 50);
    }

    public void accessAnInActiveProjectNameSearch() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegisterOfInterestPageObjects.ProjectNameField(), 50);
        Browser.moveToElement(RegisterOfInterestPageObjects.SearchProjectBTN());
        TCRobot robot = new TCRobot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }
        Browser.waitUntilInvisibilityOfElement(RegisterOfInterestPageObjects.projectsSpinnerLoader(), 50);
        Browser.click(RegisterOfInterestPageObjects.ProjectStatusDDL());
        Browser.waitUntilElementToBeClickable(RegisterOfInterestPageObjects.ProjectStatusStoppedOption(), 50);
        Browser.click(RegisterOfInterestPageObjects.ProjectStatusStoppedOption());
        Browser.click(RegisterOfInterestPageObjects.SearchProjectBTN());
        Browser.waitUntilVisibilityOfElement(RegisterOfInterestPageObjects.AccessTheFirstSearchedProject(), 50);
        Browser.click(RegisterOfInterestPageObjects.AccessTheFirstSearchedProject());
    }

    public void saveChanges() throws Exception {
        Browser.moveToElement(RegisterOfInterestPageObjects.saveChanges());
        Browser.waitUntilVisibilityOfElement(RegisterOfInterestPageObjects.saveChanges(), 50);
        Browser.waitUntilElementToBeClickable(RegisterOfInterestPageObjects.saveChanges(), 50);
        Browser.click(RegisterOfInterestPageObjects.saveChanges());
    }

    public void accessAndOnBookableToggle() throws Exception {
        CommonUtilityPage.moveToObject(RegisterOfInterestPageObjects.SearchedProjectResult());
        Browser.click(RegisterOfInterestPageObjects.SearchedProjectResult());
        Browser.waitUntilVisibilityOfElement(RegisterOfInterestPageObjects.bookableCheckerArea(), 50);
        CommonUtilityPage.moveToObject(RegisterOfInterestPageObjects.bookableCheckerArea());
        WebElement bookableChecker = Browser.getWebElement(RegisterOfInterestPageObjects.bookableCheckerArea());
        String result = bookableChecker.getAttribute("aria-checked");
        if (result.contains("false")) {
            Browser.click(RegisterOfInterestPageObjects.bookableCheckerClicker());
        }
        logger.addScreenshot("access And On Bookable Toggle");
    }

    public void verifySaveChangesSuccessMessage() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegisterOfInterestPageObjects.saveChangesMSG(), 50);
        WebElement confirmationMSG = Browser.getWebElement(RegisterOfInterestPageObjects.saveChangesMSG());
        boolean exist = confirmationMSG.isDisplayed();
        logger.addScreenshot("");
        Assert.assertTrue(exist, "The Changes are not saved");
    }

    public void registerYourInterestFalseExistence() throws Exception {
        logger.addScreenshot("");
        boolean exist = Browser.isElementPresent(RegisterOfInterestPageObjects.registerYourInterestToggle());
        Assert.assertFalse(exist, "The Register your interest toggle is displayed");
    }

    public void registerYourInterestTrueExistence() throws Exception {
        logger.addScreenshot("");
        boolean exist = Browser.isElementPresent(RegisterOfInterestPageObjects.registerYourInterestToggle());
        Assert.assertTrue(exist, "The Register your interest toggle is not displayed");
    }

    public void accessAndOffBookableToggle() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(RegisterOfInterestPageObjects.SearchedProjectResult());
        Browser.waitForSeconds(2);
        WebElement bookableChecker = Browser.getWebElement(RegisterOfInterestPageObjects.bookableCheckerArea());
        String result = bookableChecker.getAttribute("aria-checked");
        if (result.contains("true")) {
            Browser.click(RegisterOfInterestPageObjects.bookableCheckerClicker());
            Browser.click(RegisterOfInterestPageObjects.saveChanges());
        } else Browser.click(RegisterOfInterestPageObjects.saveChanges());
        logger.addScreenshot("Click On Filter");
    }

    public void accessAndOnRegisterYourInterest() throws Exception {
        Browser.click(RegisterOfInterestPageObjects.SearchedProjectResult());
        Browser.waitForSeconds(3);
        WebElement bookableChecker = Browser.getWebElement(RegisterOfInterestPageObjects.bookableCheckerArea());
        String result = bookableChecker.getAttribute("aria-checked");
        if (result.contains("true")) {
            Browser.click(RegisterOfInterestPageObjects.bookableCheckerClicker());
        }
        Browser.waitForSeconds(2);
        WebElement RegisterYourInterestChecker = Browser.getWebElement(RegisterOfInterestPageObjects.RegisterYourInterestCheckerArea());
        String RegisterYourInterestCheckResult = RegisterYourInterestChecker.getAttribute("aria-checked");
        if (RegisterYourInterestCheckResult.contains("false")) {
            Browser.click(RegisterOfInterestPageObjects.RegisterYourInterestCheckerClicker());
        }
        logger.addScreenshot("access And On Register Your Interest");
    }

    public void turnOffBookableToggleAndVerifyOffState() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegisterOfInterestPageObjects.bookableCheckerArea(), 40);
        CommonUtilityPage.moveToObject(RegisterOfInterestPageObjects.bookableCheckerArea());
        WebElement bookableChecker = Browser.getWebElement(RegisterOfInterestPageObjects.bookableCheckerArea());
        boolean result = Boolean.parseBoolean(bookableChecker.getAttribute("aria-checked"));
        if (result) {
            Browser.click(RegisterOfInterestPageObjects.bookableCheckerClicker());
            result = Boolean.parseBoolean(bookableChecker.getAttribute("aria-checked"));
        }
        logger.addScreenshot("");
        Assert.assertFalse(result, "The Bookable toggle is On");
    }

    public void turnOnBookableToggleAndVerify() throws Exception {
        Browser.waitForSeconds(3);
        WebElement bookableChecker = Browser.getWebElement(RegisterOfInterestPageObjects.bookableCheckerArea());
        boolean result = Boolean.parseBoolean(bookableChecker.getAttribute("aria-checked"));
        if (!result) {
            Browser.click(RegisterOfInterestPageObjects.bookableCheckerClicker());
            result = Boolean.parseBoolean(bookableChecker.getAttribute("aria-checked"));
        }
        logger.addScreenshot("");
        Assert.assertTrue(result, "The Bookable toggle is Off");
    }

    public void offBookableToggle() throws Exception {
        Browser.waitForSeconds(3);
        WebElement bookableChecker = Browser.getWebElement(RegisterOfInterestPageObjects.bookableCheckerArea());
        boolean result = Boolean.parseBoolean(bookableChecker.getAttribute("aria-checked"));
        if (result) {
            Browser.click(RegisterOfInterestPageObjects.bookableCheckerClicker());
        }
        logger.addScreenshot("Click On Filter");
    }
}
