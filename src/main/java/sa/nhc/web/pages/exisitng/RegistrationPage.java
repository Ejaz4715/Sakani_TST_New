package sa.nhc.web.pages.exisitng;

import com.testcrew.web.Browser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.exisitng.*;

import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;


public class RegistrationPage {

    public void clickOnRegisterLink() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.RegistrationLink(), 40);
        Browser.click(RegistrationPageObjects.RegistrationLink());
    }

    public void clickOnContinueButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.BTNContinue(), 40);
        Browser.moveToElement(RegistrationPageObjects.BTNContinue());
        Browser.click(RegistrationPageObjects.BTNContinue());
    }

    public void enterIDNumber(String idNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.TXTIDNumber(), 40);
        Browser.setText(RegistrationPageObjects.TXTIDNumber(), idNumber);
        logger.addScreenshot("");
    }

    public void enterBirthOfDate(String birthOfDate) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.TXTBirthOfDate(), 40);
        Browser.setText(RegistrationPageObjects.TXTBirthOfDate(), birthOfDate);
        logger.addScreenshot("");
        WebElement EnterOption = driver.findElement(RegistrationPageObjects.TXTBirthOfDate());
        EnterOption.sendKeys(Keys.ENTER);

    }

    public void enterEmail(String email) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.TXTEmail(), 40);
        Browser.moveToElement(RegistrationPageObjects.TXTEmail());
        Browser.setText(RegistrationPageObjects.TXTEmail(), email);
        logger.addScreenshot("");
    }

    public void enterPhoneNumber(String phoneNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.TXTPhoneNumber(), 40);
        Browser.moveToElement(RegistrationPageObjects.TXTPhoneNumber());
        Browser.setText(RegistrationPageObjects.TXTPhoneNumber(), phoneNumber);
        logger.addScreenshot("");
    }

    public void enterPassword(String password) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.TXTPassword(), 40);
        Browser.moveToElement(RegistrationPageObjects.TXTPassword());
        Browser.setText(RegistrationPageObjects.TXTPassword(), password);
        logger.addScreenshot("");
    }

    public void enterPasswordConfirmation(String confirmPassword) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.TXTPasswordConfirmation(), 40);
        Browser.moveToElement(RegistrationPageObjects.TXTPasswordConfirmation());
        Browser.setText(RegistrationPageObjects.TXTPasswordConfirmation(), confirmPassword);
        logger.addScreenshot("");
    }

    public void clickOnSubmitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.submitButton(), 40);
        Browser.click(RegistrationPageObjects.submitButton());
    }

    public void clickOnAgreeTermsConditionsCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.agreeTermsConditionsCheckbox(), 40);
        Browser.click(RegistrationPageObjects.agreeTermsConditionsCheckbox());
    }

    public void checkSuccessfulRegisterMessage() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.MSGSuccessfulRegistered(), 40);
        Browser.moveToElement(RegistrationPageObjects.MSGSuccessfulRegistered());
        Assert.assertTrue(Browser.isElementPresent(RegistrationPageObjects.MSGSuccessfulRegistered()));
        logger.addScreenshot("");
    }
}
