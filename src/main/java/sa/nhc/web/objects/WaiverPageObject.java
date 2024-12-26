package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class WaiverPageObject {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Eligible_Status", new HashMap<>() {{
                put("en", "//p[contains(@class,'text-success')]");
                put("ar", "//p[contains(@class,'text-success')]");
            }});
            put("Eligibility_Waiver", new HashMap<>() {{
                put("en", "//div/h5[contains(text(),'Eligiblity waiver')]");
                put("ar", "//div/h5[contains(text(),'التنازل عن استحقاق الدعم السكني')]");
            }});
            put("Eligibility_Waiver_Div_Button", new HashMap<>() {{
                put("en", "//div/h5[contains(text(),'Eligiblity waiver')]");
                put("ar", "//div/h5[contains(text(),'التنازل عن استحقاق الدعم السكني')]");
            }});
            put("Eligibility_Waiver_Page", new HashMap<>() {{
                put("en", "//app-dashboard-waiver");
                put("ar", "//app-dashboard-waiver");
            }});
            put("Waiver_Of_Eligibility_Button", new HashMap<>() {{
                put("en", "//button/span[contains(text(),'Waiver of Eligibility')]");
                put("ar", "//button/span[contains(text(),'التنازل عن استحقاق الدعم السكني')]");
            }});
            put("Are_You_Sure_Popup", new HashMap<>() {{
                put("en", "//app-modal/descendant::p");
                put("ar", "//app-modal/descendant::p");
            }});
            put("Select_Family_Member_Page", new HashMap<>() {{
                put("en", "//app-process-waiver");
                put("ar", "//app-process-waiver");
            }});
            put("Dashboard_Page", new HashMap<>() {{
                put("en", "//app-dashboard-overview");
                put("ar", "//app-dashboard-overview");
            }});
            put("Confirm_Button", new HashMap<>() {{
                put("en", "//span[contains(text(),'Confirm')]/parent::button");
                put("ar", "//span[contains(text(),'تأكيد')]/parent::button");
            }});
            put("Family_Member_Radio_Button", new HashMap<>() {{
                put("en", "//span[contains(text(),'replaceText')]/ancestor::app-information-table/preceding::app-radio");
                put("ar", "//span[contains(text(),'replaceText')]/ancestor::app-information-table/preceding::app-radio");
            }});
            put("Agree_Terms_And_Conditions_Checkbox", new HashMap<>() {{
                put("en", "//input[@id='agreeTermsConditions']");
                put("ar", "//input[@id='agreeTermsConditions']");
            }});

        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By eligibleStatus() throws Exception {
        return By.xpath(get("Eligible_Status"));
    }

    public static By eligibilityWaiverDivButton() throws Exception {
        return By.xpath(get("Eligibility_Waiver_Div_Button"));
    }

    public static By eligibilityWaiverPage() throws Exception {
        return By.xpath(get("Eligibility_Waiver_Page"));
    }

    public static By waiverOfEligibilityButton() throws Exception {
        return By.xpath(get("Waiver_Of_Eligibility_Button"));
    }

    public static By areYouSurePopup() throws Exception {
        return By.xpath(get("Are_You_Sure_Popup"));
    }

    public static By selectFamilyMemberPage() throws Exception {
        return By.xpath(get("Select_Family_Member_Page"));
    }

    public static By dashboardPage() throws Exception {
        return By.xpath(get("Dashboard_Page"));
    }

    public static By confirmButton() throws Exception {
        return By.xpath(get("Confirm_Button"));
    }

    public static By familyMemberRadioButton(String familyMember) throws Exception {
        return By.xpath(get("Family_Member_Radio_Button").replaceAll("replaceText", familyMember));
    }

    public static By agreeTermsAndConditionsCheckbox() throws Exception {
        return By.xpath(get("Agree_Terms_And_Conditions_Checkbox"));
    }
}
