package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class QueueingOffPlanPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Project_Name_Input_Field", new HashMap<>() {{
                put("en", "//input[@formcontrolname=\"name\"]");
                put("ar", "//input[@formcontrolname=\"name\"]");
            }});
            put("Max_Active_Queueing_Member_Input_Field", new HashMap<>() {{
                put("en", "//input[@formcontrolname=\"max_active_queueing_member\"]");
                put("ar", "//input[@formcontrolname=\"max_active_queueing_member\"]");
            }});
            put("Active_Queueing_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname=\"active_queueing\"]/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname=\"active_queueing\"]/descendant::button");
            }});
            put("Active_Queueing_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname=\"active_queueing\"]/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname=\"active_queueing\"]/descendant::button");
            }});
            put("Input_Field_Error1", new HashMap<>() {{
                put("en", "//mat-error[contains (@id, 'error')][2] | (//mat-error[contains (@id, 'error')])[2]");
                put("ar", "//mat-error[contains (@id, 'error')][2] | (//mat-error[contains (@id, 'error')])[2]");
            }});
            put("Input_Field_Error2", new HashMap<>() {{
                put("en", "(//mat-error[contains (@id, 'error')])[3]");
                put("ar", "(//mat-error[contains (@id, 'error')])[3]");
            }});
            put("Units_List_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Unit list')]");
                put("ar", "//button[contains(text(),'قائمة الوحدات')]");
            }});
            put("Queueing_Message", new HashMap<>() {{
                put("en", "//app-project-queue-info-box/descendant::h5 | //app-join-queue-message/descendant::h4/following-sibling::span | //app-join-queue-message/descendant::div[7]");
                put("ar", "//app-project-queue-info-box/descendant::h5 | //app-join-queue-message/descendant::h4/following-sibling::span | //app-join-queue-message/descendant::div[7]");
            }});
            put("Join_Now_Button", new HashMap<>() {{
                put("en", "//app-project-queue-info-box/descendant::button | //app-join-queue-message/descendant::button");
                put("ar", "//app-project-queue-info-box/descendant::button | //app-join-queue-message/descendant::button");
            }});
            put("Booking_Details_List", new HashMap<>() {{
                put("en", "//app-project-units-listing | //app-project-unit-list");
                put("ar", "//app-project-units-listing | //app-project-unit-list");
            }});
            put("Leave_Queue_Button", new HashMap<>() {{
                put("en", "//app-project-queue-info-box/descendant::button/span[contains(text(),'Leave Queue')]");
                put("ar", "//app-project-queue-info-box/descendant::button/span[contains(text(),'الغاء الانضمام الى الدور')]");
            }});
        }
    };
    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }
    public static By projectNameInputField() throws Exception {
        return By.xpath(get("Project_Name_Input_Field"));
    }
    public static By maxActiveQueueingMemberInputField() throws Exception {
        return By.xpath(get("Max_Active_Queueing_Member_Input_Field"));
    }
    public static By activeQueueingToggle() throws Exception {
        return By.xpath(get("Active_Queueing_Toggle"));
    }
    public static By InputFieldError1() throws Exception {
        return By.xpath(get("Input_Field_Error1"));
    }
    public static By InputFieldError2() throws Exception {
        return By.xpath(get("Input_Field_Error2"));
    }

    public static By unitsListButton() throws Exception {
        return By.xpath(get("Units_List_Button"));
    }
    public static By queueingMessage() throws Exception {
        return By.xpath(get("Queueing_Message"));
    }
    public static By joinNowButton() throws Exception {
        return By.xpath(get("Join_Now_Button"));
    }
    public static By bookingDetailsList() throws Exception {
        return By.xpath(get("Booking_Details_List"));
    }
    public static By leaveQueueButton() throws Exception {
        return By.xpath(get("Leave_Queue_Button"));
    } public static By activeQueueingToggleInput() throws Exception {
        return By.xpath(get("Active_Queueing_Toggle_Input"));
    }
}
