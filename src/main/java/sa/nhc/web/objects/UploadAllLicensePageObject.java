package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class UploadAllLicensePageObject {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Upload_Building_Permit_Button", new HashMap<>() {{
                put("en", "//h6[contains(text(),'Upload building permit')]/parent::div");
                put("ar", "//h6[contains(text(),'رفع رخصة البناء')]/parent::div");
            }});
            put("Building_Permit_Page", new HashMap<>() {{
                put("en", "//app-land-building-permit-upload");
                put("ar", "//app-land-building-permit-upload");
            }});
            put("Are_You_Sure_Popup", new HashMap<>() {{
                put("en", "//p[contains(text(),'Are you sure')]/ancestor::app-modal");
                put("ar", "//p[contains(text(),'هل تود الاستمرار')]/ancestor::app-modal");
            }});
            put("Upload_Building_Permit_File", new HashMap<>() {{
                put("en", "//app-file-upload/input");
                put("ar", "//app-file-upload/input");
            }});
            put("Building_Permit_Number_Input_Field", new HashMap<>() {{
                put("en", "//input[@formcontrolname='building_permit_id']");
                put("ar", "//input[@formcontrolname='building_permit_id']");
            }});
            put("Building_Permit_Date_Input_Field", new HashMap<>() {{
                put("en", "//app-gregorian-datepicker[@formcontrolname='issuance_date']/descendant::input");
                put("ar", "//app-gregorian-datepicker[@formcontrolname='issuance_date']/descendant::input");
            }});
            put("Calender_Icon_Button", new HashMap<>() {{
                put("en", "//span[contains(@class,'icon-calendar')]");
                put("ar", "//span[contains(@class,'icon-calendar')]");
            }});
            put("Date_Picker", new HashMap<>() {{
                put("en", "//ngb-datepicker");
                put("ar", "//ngb-datepicker");
            }});
            put("View_Building_Permit_Icon_Button", new HashMap<>() {{
                put("en", "//div[contains(text(),'Buiding permit')]/following-sibling::app-pdf-viewer");
                put("ar", "//div[contains(text(),'رخصة بناء')]/following-sibling::app-pdf-viewer");
            }});
            put("Cancel_Popup_Button", new HashMap<>() {{
                put("en", "//app-modal/descendant::button[contains(text(),'Cancel')]");
                put("ar", "//app-modal/descendant::button[contains(text(),'لغاء')]");
            }});
            put("Success_Page", new HashMap<>() {{
                put("en", "//app-land-booking-action/descendant::h4");
                put("ar", "//app-land-booking-action/descendant::h4");
            }});
            put("Building_Permit_Dropdown_Button", new HashMap<>() {{
                put("en", "(//div[@cardclass=\"build-permit-section\"]/div)[1]");
                put("ar", "(//div[@cardclass=\"build-permit-section\"]/div)[1]");
            }});
            put("Building_Permit_Details", new HashMap<>() {{
                put("en", "//app-booking-building-permit-list");
                put("ar", "//app-booking-building-permit-list");
            }});
            put("Download_Button", new HashMap<>() {{
                put("en", "(//datatable-body-cell/descendant::a)[1]");
                put("ar", "(//datatable-body-cell/descendant::a)[1]");
            }});
            put("Construction_Completion_Certificate_Button", new HashMap<>() {{
                put("en", "//h6[contains(text(),'Construction completion certificate')]/parent::div");
                put("ar", "//h6[contains(text(), 'شهادة إتمام البناء')]/parent::div");
            }});
            put("Certificate_Number_Input_Field", new HashMap<>() {{
                put("en", "//input[@formcontrolname='construction_number']");
                put("ar", "//input[@formcontrolname='construction_number']");
            }});
            put("Certificate_Date_Input_Field", new HashMap<>() {{
                put("en", "//app-gregorian-datepicker[@formcontrolname='construction_date']/descendant::input");
                put("ar", "//app-gregorian-datepicker[@formcontrolname='construction_date']/descendant::input");
            }});

            put("Construction_Completion_Dropdown_Button", new HashMap<>() {{
                put("en", "(//div[@cardclass=\"build-permit-section\"]/div)[3]");
                put("ar", "(//div[@cardclass=\"build-permit-section\"]/div)[3]");
            }});
            put("Conveyance_Request_Button", new HashMap<>() {{
                put("en", "//h6[contains(text(),'Conveyance Request')]/parent::div");
                put("ar", "//h6[contains(text(),'تقديم طلب إفراغ')]/parent::div");
            }});
            put("Region_Dropdown_List", new HashMap<>() {{
                put("en", "//app-dropdown[@formcontrolname='region_id']/descendant::ng-select/div");
                put("ar", "//app-dropdown[@formcontrolname='region_id']/descendant::ng-select/div");
            }});
            put("Building_Permit_Status", new HashMap<>() {{
                put("en", "(//datatable-body-cell/descendant::span)[2]");
                put("ar", "(//datatable-body-cell/descendant::span)[2]");
            }});
            put("Construction_Completion_Certificate_Status", new HashMap<>() {{
                put("en", "(//datatable-body-cell/descendant::p)[1]");
                put("ar", "(//datatable-body-cell/descendant::p)[1]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By uploadBuildingPermitButton() throws Exception {
        return By.xpath(get("Upload_Building_Permit_Button"));
    }

    public static By buildingPermitPage() throws Exception {
        return By.xpath(get("Building_Permit_Page"));
    }

    public static By areYouSurePopup() throws Exception {
        return By.xpath(get("Are_You_Sure_Popup"));
    }

    public static By uploadBuildingPermitFile() throws Exception {
        return By.xpath(get("Upload_Building_Permit_File"));
    }

    public static By buildingPermitNumberInputField() throws Exception {
        return By.xpath(get("Building_Permit_Number_Input_Field"));
    }

    public static By buildingPermitDateInputField() throws Exception {
        return By.xpath(get("Building_Permit_Date_Input_Field"));
    }

    public static By calenderIconButton() throws Exception {
        return By.xpath(get("Calender_Icon_Button"));
    }

    public static By datePicker() throws Exception {
        return By.xpath(get("Date_Picker"));
    }

    public static By viewBuildingPermitIconButton() throws Exception {
        return By.xpath(get("View_Building_Permit_Icon_Button"));
    }

    public static By cancelPopupButton() throws Exception {
        return By.xpath(get("Cancel_Popup_Button"));
    }

    public static By successPage() throws Exception {
        return By.xpath(get("Success_Page"));
    }

    public static By buildingPermitDropdownButton() throws Exception {
        return By.xpath(get("Building_Permit_Dropdown_Button"));
    }

    public static By downloadButton() throws Exception {
        return By.xpath(get("Download_Button"));
    }

    public static By buildingPermitDetails() throws Exception {
        return By.xpath(get("Building_Permit_Details"));
    }

    public static By constructionCompletionCertificateButton() throws Exception {
        return By.xpath(get("Construction_Completion_Certificate_Button"));
    }

    public static By certificateNumberInputField() throws Exception {
        return By.xpath(get("Certificate_Number_Input_Field"));
    }

    public static By certificateDateInputField() throws Exception {
        return By.xpath(get("Certificate_Date_Input_Field"));
    }

    public static By constructionCompletionDropdownButton() throws Exception {
        return By.xpath(get("Construction_Completion_Dropdown_Button"));
    }

    public static By buildingPermitStatus() throws Exception {
        return By.xpath(get("Building_Permit_Status"));
    }

    public static By constructionCompletionCertificateStatus() throws Exception {
        return By.xpath(get("Construction_Completion_Certificate_Status"));
    }
}
