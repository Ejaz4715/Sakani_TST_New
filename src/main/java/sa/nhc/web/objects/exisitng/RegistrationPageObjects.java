package sa.nhc.web.objects.exisitng;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class RegistrationPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Registration_Link", new HashMap<>() {{
                put("en", "//a[@href='/app/authentication/register']");
                put("ar", "//a[@href='/app/authentication/register']");
            }});
            put("TXT_ID_Number", new HashMap<>() {{
                put("en", "//input[@formcontrolname='national_id_number']");
                put("ar", "//input[@formcontrolname='national_id_number']");
            }});
            put("TXT_Birth_Of_Date", new HashMap<>() {{
                put("en", "//input[@placeholder='YYYY-MM-DD']");
                put("ar", "//input[@placeholder='YYYY-MM-DD']");
            }});
            put("BTN_Continue", new HashMap<>() {{
                put("en", "//button[contains(text(),'Continue')]");
                put("ar", "//button[contains(text(),' المتابعة ')]");
            }});
            put("TXT_Email", new HashMap<>() {{
                put("en", "//input[@type='email']");
                put("ar", "//input[@type='email']");
            }});
            put("TXT_PhoneNumber", new HashMap<>() {{
                put("en", "//app-phone-input/input[@type='text']");
                put("ar", "//app-phone-input/input[@type=\"text\"]");
            }});
            put("TXT_Password", new HashMap<>() {{
                put("en", "//input[@formcontrolname=\"password\"]");
                put("ar", "//input[@formcontrolname=\"password\"]");
            }});
            put("TXT_Password_Confirmation", new HashMap<>() {{
                put("en", "//input[@formcontrolname=\"password_confirmation\"]");
                put("ar", "//input[@formcontrolname=\"password_confirmation\"]");
            }});
            put("Submit-Button", new HashMap<>() {{
                put("en", "//button[@type=\"submit\"]");
                put("ar", "//button[@type=\"submit\"]");
            }});
            put("Agree-Terms-Conditions-Checkbox", new HashMap<>() {{
                put("en", "//input[@id=\"agreeTermsConditions\"]");
                put("ar", "//input[@id=\"agreeTermsConditions\"]");
            }});
            put("MSG_Successful_Registered", new HashMap<>() {{
                put("en", "//app-success-page");
                put("ar", "//app-success-page");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By RegistrationLink() throws Exception {
        return By.xpath(get("Registration_Link"));
    }

    public static By TXTIDNumber() throws Exception {
        return By.xpath(get("TXT_ID_Number"));
    }

    public static By TXTBirthOfDate() throws Exception {
        return By.xpath(get("TXT_Birth_Of_Date"));
    }

    public static By BTNContinue() throws Exception {
        return By.xpath(get("BTN_Continue"));
    }

    public static By TXTEmail() throws Exception {
        return By.xpath(get("TXT_Email"));
    }

    public static By TXTPhoneNumber() throws Exception {
        return By.xpath(get("TXT_PhoneNumber"));
    }

    public static By TXTPassword() throws Exception {
        return By.xpath(get("TXT_Password"));
    }

    public static By TXTPasswordConfirmation() throws Exception {
        return By.xpath(get("TXT_Password_Confirmation"));
    }

    public static By submitButton() throws Exception {
        return By.xpath(get("Submit-Button"));
    }

    public static By agreeTermsConditionsCheckbox() throws Exception {
        return By.xpath(get("Agree-Terms-Conditions-Checkbox"));
    }

    public static By MSGSuccessfulRegistered() throws Exception {
        return By.xpath(get("MSG_Successful_Registered"));
    }
}
