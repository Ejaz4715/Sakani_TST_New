package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class EligibilityPageObject {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Icon_Profile", new HashMap<>() {{
                put("en", "//span[contains(@class,'icon-profile')]");
                put("ar", "//span[contains(@class,'icon-profile')]");
            }});
            put("My_Profile_Button", new HashMap<>() {{
                put("en", "//a[@href='/app/user-profile']");
                put("ar", "//a[@href='/app/user-profile']");
            }});
            put("Check_Eligibility_From_Profile", new HashMap<>() {{
                put("en", "//a[@href=\"/app/eligibility/check\"]");
                put("ar", "//a[@href=\"/app/eligibility/check\"]");
            }});
            put("Not_Check_Eligibility_Yet_Text", new HashMap<>() {{
                put("en", "//p[contains(text(),'You have not checked your eligibility yet')]");
                put("ar", "//p[contains(text(),'لم يتم التحقق من أهلية استحقاق السكن بعد')]");
            }});
            put("Services_Dropdown", new HashMap<>() {{
                put("en", "//span[normalize-space()='Services']");
                put("ar", "//span[normalize-space()='الخدمات']");
            }});
            put("Check_Eligibility_Nav_Title", new HashMap<>() {{
                put("en", "//span[contains(@class,'sub-nav-title')][normalize-space()='Check Eligibility']");
                put("ar", "//span[contains(@class,'sub-nav-title')][normalize-space()='التحقق من الاستحقاق']");
            }});
            put("Check_Eligibility_Intro_Page", new HashMap<>() {{
                put("en", "//div[contains(@id, \"service_intro\")]");
                put("ar", "//div[contains(@id, \"service_intro\")]");
            }});
            put("Check_Eligibility_Button", new HashMap<>() {{
                put("en", "//a/div[normalize-space()='التحقق من حالة الاستحقاق'] | //a[@href=\"/app/eligibility/check\"]/div");
                put("ar", "//a/div[normalize-space()='التحقق من حالة الاستحقاق'] | //a[@href=\"/app/eligibility/check\"]/div");
            }});
            put("Check_Eligibility_Steps_Page", new HashMap<>() {{
                put("en", "//h2[normalize-space()='Eligibility Check']");
                put("ar", "//h2[normalize-space()='التحقق من أهلية الاستحقاق السكني']");
            }});
            put("Agree_On_Terms_And_Conditions_Button", new HashMap<>() {{
                put("en", "//button[normalize-space()='Agree on the terms and conditions']");
                put("ar", "//button[normalize-space()='أوافق على الشروط والأحكام']");
            }});
            put("Agree_On_Terms_And_Conditions_Checkbox", new HashMap<>() {{
                put("en", "//input[@id=\"agreeTermsConditions\"]");
                put("ar", "//input[@id=\"agreeTermsConditions\"]");
            }});
            put("Acknowledgement_Step_Page", new HashMap<>() {{
                put("en", "//app-acknowledgement");
                put("ar", "//app-acknowledgement");
            }});
            put("Required_Field_Validation_Message", new HashMap<>() {{
                put("en", "//div[contains(@class,\"text-danger\")]");
                put("ar", "//div[contains(@class,\"text-danger\")]");
            }});
            put("Continue_To_Confirm_Acknowledge_Button", new HashMap<>() {{
                put("en", "//app-acknowledgement/descendant::button[@type=\"submit\"]");
                put("ar", "//app-acknowledgement/descendant::button[@type=\"submit\"]");
            }});
            put("No_Radio_Button", new HashMap<>() {{
                put("en", "//span[normalize-space()='No']");
                put("ar", "//span[normalize-space()='لا']");
            }});
            put("Yes_Radio_Button", new HashMap<>() {{
                put("en", "(//span[normalize-space()='Yes'])[3]");
                put("ar", "(//span[normalize-space()='نعم'])[3]");
            }});
            put("Verify_Information_Step_Page", new HashMap<>() {{
                put("en", "//app-verify-information");
                put("ar", "//app-verify-information");
            }});
            put("Back_Button", new HashMap<>() {{
                put("en", "//button/span[normalize-space()='Back']");
                put("ar", "//button/span[normalize-space()='رجوع']");
            }});
            put("Confirm_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Confirm')] | //button/span[contains(text(),'Confirm')]");
                put("ar", "//button[contains(text(),'تأكيد')] | //button/span[contains(text(),'تأكيد')]");
            }});

            put("Current_City_Dropdown_List", new HashMap<>() {{
                put("en", "//input[@formcontrolname=\"city_id\"]/preceding-sibling::app-city-selector/descendant::ng-select/descendant::input");
                put("ar", "//input[@formcontrolname=\"city_id\"]/preceding-sibling::app-city-selector/descendant::ng-select/descendant::input");
            }});
            put("Preferred_City_Dropdown_List", new HashMap<>() {{
                put("en", "//input[@formcontrolname=\"preferred_city_id\"]/preceding-sibling::app-city-selector/descendant::ng-select/descendant::input");
                put("ar", "//input[@formcontrolname=\"preferred_city_id\"]/preceding-sibling::app-city-selector/descendant::ng-select/descendant::input");
            }});
            put("Option_List_Selected", new HashMap<>() {{
                put("en", "//div[@role=\"option\"]/descendant::span");
                put("ar", "//div[@role=\"option\"]/descendant::span");
            }});
            put("Deed_Type_Dropdown_List", new HashMap<>() {{
                put("en", "//app-dropdown[@formcontrolname=\"deed_type\"]/descendant::ng-select/div");
                put("ar", "//app-dropdown[@formcontrolname=\"deed_type\"]/descendant::ng-select/div");
            }});
            put("Construction_Status_Dropdown_List", new HashMap<>() {{
                put("en", "//app-dropdown[@formcontrolname=\"construction_status\"]/descendant::ng-select/div");
                put("ar", "//app-dropdown[@formcontrolname=\"construction_status\"]/descendant::ng-select/div");
            }});
            put("Congrats_Message", new HashMap<>() {{
                put("en", "//div[@class=\"eligible-box\"]/descendant::p[1]");
                put("ar", "//div[@class=\"eligible-box\"]/descendant::p[1]");
            }});
            put("Not_Eligible_Message", new HashMap<>() {{
                put("en", "//app-eligibility-result/descendant::h4");
                put("ar", "//app-eligibility-result/descendant::h4");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By iconProfile() throws Exception {
        return By.xpath(get("Icon_Profile"));
    }

    public static By myProfileButton() throws Exception {
        return By.xpath(get("My_Profile_Button"));
    }
    public static By checkEligibilityFromProfile() throws Exception {
        return By.xpath(get("Check_Eligibility_From_Profile"));
    }

    public static By notCheckEligibilityYetText() throws Exception {
        return By.xpath(get("Not_Check_Eligibility_Yet_Text"));
    }

    public static By servicesDropdown() throws Exception {
        return By.xpath(get("Services_Dropdown"));
    }

    public static By checkEligibilityNavTitle() throws Exception {
        return By.xpath(get("Check_Eligibility_Nav_Title"));
    }

    public static By checkEligibilityIntroPage() throws Exception {
        return By.xpath(get("Check_Eligibility_Intro_Page"));
    }

    public static By checkEligibilityButton() throws Exception {
        return By.xpath(get("Check_Eligibility_Button"));
    }

    public static By checkEligibilityStepsPage() throws Exception {
        return By.xpath(get("Check_Eligibility_Steps_Page"));
    }

    public static By agreeOnTermsAndConditionsButton() throws Exception {
        return By.xpath(get("Agree_On_Terms_And_Conditions_Button"));
    }

    public static By agreeOnTermsAndConditionsCheckbox() throws Exception {
        return By.xpath(get("Agree_On_Terms_And_Conditions_Checkbox"));
    }

    public static By acknowledgementStepPage() throws Exception {
        return By.xpath(get("Acknowledgement_Step_Page"));
    }

    public static By requiredFieldValidationMessage() throws Exception {
        return By.xpath(get("Required_Field_Validation_Message"));
    }

    public static By continueToConfirmAcknowledgeButton() throws Exception {
        return By.xpath(get("Continue_To_Confirm_Acknowledge_Button"));
    }

    public static By noRadioButton() throws Exception {
        return By.xpath(get("No_Radio_Button"));
    }

    public static By yesRadioButton() throws Exception {
        return By.xpath(get("Yes_Radio_Button"));
    }

    public static By verifyInformationStepPage() throws Exception {
        return By.xpath(get("Verify_Information_Step_Page"));
    }

    public static By backButton() throws Exception {
        return By.xpath(get("Back_Button"));
    }

    public static By confirmButton() throws Exception {
        return By.xpath(get("Confirm_Button"));
    }

    public static By currentCityDropdownList() throws Exception {
        return By.xpath(get("Current_City_Dropdown_List"));
    }

    public static By preferredCityDropdownList() throws Exception {
        return By.xpath(get("Preferred_City_Dropdown_List"));
    }

    public static By optionListSelected() throws Exception {
        return By.xpath(get("Option_List_Selected"));
    }

    public static By deedTypeDropdownList() throws Exception {
        return By.xpath(get("Deed_Type_Dropdown_List"));
    }

    public static By constructionStatusDropdownList() throws Exception {
        return By.xpath(get("Construction_Status_Dropdown_List"));
    }

    public static By congratsMessage() throws Exception {
        return By.xpath(get("Congrats_Message"));
    }

    public static By notEligibleMessage() throws Exception {
        return By.xpath(get("Not_Eligible_Message"));
    }
}
