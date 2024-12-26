package sa.nhc.web.pages.exisitng;

import com.testcrew.manager.TestConfigManager;
import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import sa.nhc.web.objects.exisitng.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;


public class LoginPage {

    public void alertBoxLogin() throws AWTException {
        TCRobot robot = new TCRobot();
        Browser.waitForSeconds(2);
        robot.setText("sakani");
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.setText("together we build Vision 2030");
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    public void userLogin(String id, String password) throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.BTNHomeLogin(), 50);
        Browser.setText(LoginPageObjects.TXTIDNumber(), id);
        Browser.setText(LoginPageObjects.TXTPassword(), password);
        Browser.moveToElement(LoginPageObjects.BTNLogin());
        Browser.click(LoginPageObjects.BTNLogin());
    }

    public void enterOTPForUser(String OTP) throws Exception {
        Browser.waitUntilElementToBeClickable(CommonUtilityPageObjects.UserOTP(), 30);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.UserOTP(), 40);
        List<WebElement> list = Browser.getWebElements(LoginPageObjects.UserOTP());
        int index = 0;
        for (WebElement otp : list) {
            otp.sendKeys(String.valueOf(OTP.charAt(index)));
            index++;
        }
    }

    public void clickOnCancelButtonOfPopup() throws Exception {
        if (Browser.isElementPresent(LoginPageObjects.cancelButtonOfPopup())) {
            Browser.click(LoginPageObjects.cancelButtonOfPopup());
        }
    }

    public void clickOnVerifyOTPButton() throws Exception {
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

    public void loginAsAdmin(String username, String password) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerIconAdminLoginPage(), 40);
        Browser.waitUntilPresenceOfElement(LoginPageObjects.Email(), 40);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.Email(), 40);
        Browser.setText(LoginPageObjects.Email(), username);
        Browser.setText(LoginPageObjects.Password(), password);
        Browser.click(LoginPageObjects.BTNLogin());
    }

    public void enterOTPForAdminLogin(String OTP) throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerIconAdminLoginPage(), 40);
        Browser.waitUntilPresenceOfElement(CommonUtilityPageObjects.AdminOTP(), 40);
        Browser.waitUntilElementToBeClickable(CommonUtilityPageObjects.AdminOTP(), 40);
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.AdminOTP(), 40);
        CommonUtilityPage.moveToObject(CommonUtilityPageObjects.AdminOTP());
        Browser.waitForSeconds(1);
        Browser.setText(CommonUtilityPageObjects.AdminOTP(), OTP);
        Browser.click(CommonUtilityPageObjects.OTPVerify());
    }

    public void changeLanguageAdmin(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.Hover(), 30);
        if (TestConfigManager.getSettingsApplicationLanguage().contains("en")) {
            Browser.openUrl(data.get("URL_En"));
            Browser.waitForSeconds(1);
        }
    }

    public void changeLanguageForUser() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.UserLanguageButton(), 30);
        Browser.moveToElement(LoginPageObjects.UserLanguageButton());
        if (TestConfigManager.getSettingsApplicationLanguage().contains("en")) {
            if (Browser.getText(LoginPageObjects.UserLanguageButton()).contains("English")) {
                Browser.click(LoginPageObjects.UserLanguageButton());
            }
        }
        if (TestConfigManager.getSettingsApplicationLanguage().contains("ar")) {
            if (Browser.getText(LoginPageObjects.UserLanguageButton()).contains("عربي")) {
                Browser.click(LoginPageObjects.UserLanguageButton());
            }
        }
    }

    /**
     * Method to click on Login/Register button on 'Sakani Partners' homepage
     */
    public void clickOnLoginRegisterButtonInPartner() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.LoginRegisterButton(), 40);
        Browser.moveToElement(LoginPageObjects.LoginRegisterButton());
        Browser.click(LoginPageObjects.LoginRegisterButton());
    }

    /**
     * Method to Log in to 'Sakani Partners'
     *
     * @param id       - user national id
     * @param password - user password
     */
    public void loginToSakaniPartners(String id, String password) throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.LoginButtonPartners(), 50);
        Browser.setText(LoginPageObjects.UserNameInputPartners(), id);
        Browser.setText(LoginPageObjects.UserPasswordInputPartners(), password);
        Browser.click(LoginPageObjects.LoginButtonPartners());
    }

    /**
     * Method to enter OTP and verify 'Sakani Partners'
     *
     * @param OTP - OTP for the user
     */
    public void inputOTPSakaniPartner(String OTP) throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.OTPInputPartners(), 50);
        Browser.setText(LoginPageObjects.OTPInputPartners(), OTP);
        Browser.click(LoginPageObjects.VerifyOTPButtonPartners());
    }

}
