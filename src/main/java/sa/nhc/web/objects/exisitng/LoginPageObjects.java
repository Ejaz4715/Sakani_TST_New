package sa.nhc.web.objects.exisitng;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class LoginPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("TXT_ID_Number", new HashMap<>() {{
                put("en", "//input[@id='nationId']");
                put("ar", "//input[@id='nationId']");
            }});
            put("Email-ID", new HashMap<>() {{
                put("en", "//input[@formcontrolname='username']");
                put("ar", "//input[@formcontrolname='username']");
            }});
            put("TXT_Password", new HashMap<>() {{
                put("en", "//input[@id='password']");
                put("ar", "//input[@id='password']");
            }});
            put("Password", new HashMap<>() {{
                put("en", "//input[@formcontrolname='password']");
                put("ar", "//input[@formcontrolname='password']");
            }});
            put("BTN_Choose", new HashMap<>() {{
                put("en", "//div/div[3]/button[1]");
                put("ar", "//div/div[3]/button[1]");
            }});
            put("Hover", new HashMap<>() {{
                put("en", "//i[contains(@class,'diamond')]");
                put("ar", "//i[contains(@class,'diamond')]");
            }});
            put("User_OTP", new HashMap<>() {{
                put("en", "//input[@autocomplete='one-time-code']");
                put("ar", "//input[@autocomplete='one-time-code']");
            }});
            put("Cancel-Button-OfPopup", new HashMap<>() {{
                put("en", "//button[contains(text(),'Cancel')] | //mat-dialog-actions/button/span[contains(text(),'Cancel')]");
                put("ar", "//button[contains(text(),'لغاء')] | //mat-dialog-actions/button/span[contains(text(),'لغاء')]");
            }});
            put("Login_Register_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Login / Register')]");
                put("ar", "//span[contains (text(), 'تسجيل دخول/ تسجيل جديد')]");
            }});
            put("User_Language_Button", new HashMap<>() {{
                put("en", "//a[contains (@href, 'login')]/ancestor::li/preceding-sibling::li");
                put("ar", "//a[contains (@href, 'login')]/ancestor::li/preceding-sibling::li");
            }});
            put("User-Name-Input", new HashMap<>() {{
                put("ar", "//label[text()=' يرجى ادخال رقم الهوية الوطنية / الإقامة ']/ancestor::app-sapa-input-with-icon-v2/descendant::input");
                put("en", "");
            }});
            put("User-Password-Input", new HashMap<>() {{
                put("ar", "//label[text()=' كلمة المرور ']/ancestor::app-sapa-password-input-with-icon-v2/descendant::input");
                put("en", "");
            }});
            put("login-button", new HashMap<>() {{
                put("ar", "//span[text()=' تسجيل الدخول ']/parent::button");
                put("en", "");
            }});
            put("input-OTP", new HashMap<>() {{
                put("ar", "//label[text()=' رمز التحقق ']/parent::app-sapa-label-v2/parent::div/descendant::input[1]");
                put("en", "");
            }});
            put("verify-otp-button", new HashMap<>() {{
                put("ar", "//span[contains (text() , 'التحقق من الرمز')]");
                put("en", "");
            }});
            put("BTN_Login", new HashMap<>() {{
                put("en", "//button[contains(text(),'Login')]");
                put("ar", "//button[contains(text(), 'تسجيل الدخول ')]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By BTNLogin() throws Exception {
        return By.xpath(get("BTN_Login"));
    }

    public static By TXTIDNumber() throws Exception {
        return By.xpath(get("TXT_ID_Number"));
    }

    public static By Email() throws Exception {
        return By.xpath(get("Email-ID"));
    }

    public static By Password() throws Exception {
        return By.xpath(get("Password"));
    }

    public static By TXTPassword() throws Exception {
        return By.xpath(get("TXT_Password"));
    }

    public static By BTNChoose() throws Exception {
        return By.xpath(get("BTN_Choose"));
    }

    public static By Hover() throws Exception {
        return By.xpath(get("Hover"));
    }

    public static By UserOTP() throws Exception {
        return By.xpath(get("User_OTP"));
    }

    public static By cancelButtonOfPopup() throws Exception {
        return By.xpath(get("Cancel-Button-OfPopup"));
    }

    public static By LoginRegisterButton() throws Exception {
        return By.xpath(get("Login_Register_Button"));
    }

    public static By UserLanguageButton() throws Exception {
        return By.xpath(get("User_Language_Button"));
    }

    public static By UserNameInputPartners() throws Exception {
        return By.xpath(get("User-Name-Input"));
    }

    public static By UserPasswordInputPartners() throws Exception {
        return By.xpath(get("User-Password-Input"));
    }

    public static By LoginButtonPartners() throws Exception {
        return By.xpath(get("login-button"));
    }

    public static By OTPInputPartners() throws Exception {
        return By.xpath(get("input-OTP"));
    }

    public static By VerifyOTPButtonPartners() throws Exception {
        return By.xpath(get("verify-otp-button"));
    }

}
