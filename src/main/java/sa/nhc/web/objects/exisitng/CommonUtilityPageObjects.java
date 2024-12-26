package sa.nhc.web.objects.exisitng;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class CommonUtilityPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("TXT_OTP", new HashMap<>() {{
            put("ar", "//input[@type='tel']");
            put("en", "//input[@type='tel']");
        }});
        put("BTN_Verify", new HashMap<>() {{
            put("en", "//button[contains(text(),'Verify OTP')]");
            put("ar", "//button[contains(text(),'تحقق')]");
        }});
        put("OTP-BTN_Verify", new HashMap<>() {{
            put("ar", "//button[contains(text(),'تأكيد')]");
            put("en", "//button[contains(text(),'تأكيد')]");
        }});

        put("Admin-OTP", new HashMap<>() {{
            put("ar", "//app-otp-input//input[@class='form-control valid ng-untouched ng-pristine ng-valid']");
            put("en", "//app-otp-input//input[@class='form-control valid ng-untouched ng-pristine ng-valid']");
        }});

        put("Msg_OTP_Wrong", new HashMap<>() {{
            put("ar", "//span[text()='التحقق من رمز التحقق غير ناجح ، يرجى المحاولة لاحقًا']");
        }});
        put("CheckBox_AgreeTerm_Of_Conditions", new HashMap<>() {{
            put("ar", "//input[@id='agreeTermsConditions']");
        }});
        put("Switch_Language", new HashMap<>() {{
            put("ar", "//li[contains(text(),'عربي')]");
        }});

        put("Spinner_Loading", new HashMap<>() {{
            put("en", "//div[contains(@class,'spinner-border')]");
            put("ar", "//div[contains(@class,'spinner-border')]");
        }});
        put("Spinner_Loading_Admin", new HashMap<>() {{
            put("ar", "//mat-progress-spinner");
            put("en", "//mat-progress-spinner");
        }});
        put("Spinner_Icon_Admin_Login_Page", new HashMap<>() {{
            put("ar", "//div[contains (@class,'sakani-loading')]");
            put("en", "//div[contains (@class,'sakani-loading')]");
        }});
        put("User_OTP", new HashMap<>() {{
            put("ar", "//div[@formarrayname='otps']/child::input[1] | //input[@type='tel'][1]");
            put("en", "//div[@formarrayname='otps']/child::input[1] | //input[@type='tel'][1]");
        }});
        put("Hover", new HashMap<>() {{
            put("ar", "//i[contains(@class,'diamond')]");
            put("en", "//i[contains(@class,'diamond')]");
        }});
    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By GuestTXTOTP() {
        By b = null;
        for (int j = 1; j <= 4; j++) {
            b = By.xpath("//input[@inputmode='numeric'][" + j + "]");
        }
        return b;
    }

    public static By AdminOTP() throws Exception {
        return By.xpath(get("Admin-OTP"));
    }

    public static By BTNVerify() throws Exception {
        return By.xpath(get("BTN_Verify"));
    }

    public static By OTPVerify() throws Exception {
        return By.xpath(get("OTP-BTN_Verify"));
    }

    public static By MsgOTPWrong() throws Exception {
        return By.xpath(get("Msg_OTP_Wrong"));
    }

    public static By CheckBoxAgreeTermOfConditions() throws Exception {
        return By.xpath(get("CheckBox_AgreeTerm_Of_Conditions"));
    }

    public static By SwitchLanguage() throws Exception {
        return By.xpath(get("Switch_Language"));
    }

    public static By SpinnerLoading() throws Exception {
        return By.xpath(get("Spinner_Loading"));
    }

    public static By SpinnerLoadingAdmin() throws Exception {
        return By.xpath(get("Spinner_Loading_Admin"));
    }

    public static By UserOTP() throws Exception {
        return By.xpath(get("User_OTP"));
    }

    public static By SpinnerIconAdminLoginPage() throws Exception {
        return By.xpath(get("Spinner_Icon_Admin_Login_Page"));
    }

    public static By Hover() throws Exception {
        return By.xpath(get("Hover"));
    }
}
