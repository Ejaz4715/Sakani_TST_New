package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class MOHLandBookingJourneyPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Filter_Button", new HashMap<>() {{
                put("en", "//div[@id=\"marketplace-filter-sort\"]/div[1]");
                put("ar", "//div[@id=\"marketplace-filter-sort\"]/div[1]");
            }});
            put("Filter_Result_Popup", new HashMap<>() {{
                put("en", "//app-marketplace-filter");
                put("ar", "//app-marketplace-filter");
            }});
            put("Project_Input_Filed", new HashMap<>() {{
                put("en", "//app-marketplace-project-input/descendant::input");
                put("ar", "//app-marketplace-project-input/descendant::input");
            }});
            put("Clear_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Clear')]");
                put("ar", "//button[contains(text(),'مسح')]");
            }});
            put("View_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'View')]");
                put("ar", "//button[contains(text(),'عرض')]");
            }});
            put("Searched_Project_Details_Page", new HashMap<>() {{
                put("en", "//app-project-title | //app-offplan-detail-page");
                put("ar", "//app-project-title | //app-offplan-detail-page");
            }});
            put("Project_Details_Tab_Button", new HashMap<>() {{
                put("en", "//div[contains(@class,'details-tab')]");
                put("ar", "//div[contains(@class,'details-tab')]");
            }});
            put("Project_Details_Page", new HashMap<>() {{
                put("en", "//h3[contains(text(),'Project details')]");
                put("ar", "//h3[contains(text(),'تفاصيل المشروع')]");
            }});
            put("Start_Booking_Button", new HashMap<>() {{
                put("en", "//button/span[contains(text(),'Start booking')]");
                put("ar", "//button/span[contains(text(),'بدء حجز جديد')]");
            }});
            put("Available_Units_Page", new HashMap<>() {{
                put("en", "//h3[contains(text(),'Available units')]");
                put("ar", "//h3[contains(text(),'الوحدات المتاحة')]");
            }});
            put("Available_Project_Unit", new HashMap<>() {{
                put("en", "(//app-project-unit-card/div)[1]");
                put("ar", "(//app-project-unit-card/div)[1]");
            }});
            put("Reserve_Plot_Button", new HashMap<>() {{
                put("en", "//span[contains(text(),'Reserve plot')]/parent::button");
                put("ar", "//span[contains(text(),'حجز قطعة أرض')]/parent::button");
            }});
            put("Terms_And_Conditions_Page", new HashMap<>() {{
                put("en", "//app-land-booking");
                put("ar", "//app-land-booking");
            }});
            put("Accept_And_Sign_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Accept and sign')]");
                put("ar", "//button[contains(text(),'قبول وتوقيع')]");
            }});
            put("Download_Land_Contract_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Download Land Contract')]");
                put("ar", "//button[contains(text(),'تنزيل عقد الأرض')]");
            }});
            put("Terms_And_Conditions_Checkbox", new HashMap<>() {{
                put("en", "//label[@for=\"termCheckbox\"]");
                put("ar", "//label[@for=\"termCheckbox\"]");
            }});
            put("Booking_Land_Complete_Page", new HashMap<>() {{
                put("en", "//app-land-booking-complete");
                put("ar", "//app-land-booking-complete");
            }});
            put("My_Activities_Button", new HashMap<>() {{
                put("en", "//span[contains(text(),'My activities')]");
                put("ar", "//span[contains(text(),'أنشطتي')]");
            }});
            put("Bookings_Button", new HashMap<>() {{
                put("en", "//span[contains(text(),'Bookings')]");
                put("ar", "//span[contains(text(),'الحجوزات')]");
            }});
            put("View_Booking_Button", new HashMap<>() {{
                put("en", "//span[contains(text(),'View booking')]");
                put("ar", "//span[contains(text(),'عرض الحجز')]");
            }});
            put("Booking_Details_Page", new HashMap<>() {{
                put("en", "//h5/following::app-information-table");
                put("ar", "//h5/following::app-information-table");
            }});
            put("View_Icon_Button", new HashMap<>() {{
                put("en", "//app-pdf-viewer");
                put("ar", "//app-pdf-viewer");
            }});
            put("View_Icon_Popup", new HashMap<>() {{
                put("en", "//app-modal");
                put("ar", "//app-modal");
            }});
            put("X_Button_Of_View_Icon_Popup", new HashMap<>() {{
                put("en", "//span[contains(@class,'icon-cross')]");
                put("ar", "//span[contains(@class,'icon-cross')]");
            }});
            put("Okay_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Okay')]");
                put("ar", "//button[contains(text(),'موافق')]");
            }});
            put("Cancel_Booking_Button", new HashMap<>() {{
                put("en", "//button/span[contains(text(),'Cancel booking')]");
                put("ar", "//button/span[contains(text(),'إلغاء الحجز')]");
            }});
            put("Confirm_Cancellation_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Confirm cancellation')]");
                put("ar", "//button[contains(text(),'تأكيد الإلغاء')]");
            }});
            put("Cancel_Booking_Button_From_Profile", new HashMap<>() {{
                put("en", "//span[contains(@class,\"text-danger\")] [contains(text(),'Cancel booking')]");
                put("ar", "//span[contains(@class,\"text-danger\")] [contains(text(),'إلغاء الحجز')]");
            }});
            put("MarketPlace_Nav_Button", new HashMap<>() {{
                put("en", "//app-top-navigation-bar//span[contains(text(),'Marketplace')]");
                put("ar", "//app-top-navigation-bar//span[contains(text(),'السوق العقاري')]");
            }});
            put("Cancel_Contract_Page", new HashMap<>() {{
                put("en", "//app-land-cancel-reason");
                put("ar", "//app-land-cancel-reason");
            }});
            put("Save_And_Continue_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Save and continue')] | //button/span[contains(text(),'Save and continue')]");
                put("ar", "//button[contains(text(),'حفظ ومتابعة')] | //button/span[contains(text(),'حفظ ومتابعة')]");
            }});
            put("Cancel_Reason_Dropdown_List", new HashMap<>() {{
                put("en", "//app-dropdown[@formcontrolname=\"cancel_reason\"]/descendant::ng-select/div");
                put("ar", "//app-dropdown[@formcontrolname=\"cancel_reason\"]/descendant::ng-select/div");
            }});
            put("Cancel_Land_Disclaimer_Page", new HashMap<>() {{
                put("en", "//app-land-cancel-disclaimer");
                put("ar", "//app-land-cancel-disclaimer");
            }});
            put("Process_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Process')]");
                put("ar", "//button[contains(text(),'الاستمرار')]");
            }});
            put("Disclaimer_Checkbox", new HashMap<>() {{
                put("en", "//label[@for=\"disclaimerId\"]");
                put("ar", "//label[@for=\"disclaimerId\"]");
            }});
            put("Land_Cancel_Complete_Page", new HashMap<>() {{
                put("en", "//app-land-cancel-complete");
                put("ar", "//app-land-cancel-complete");
            }});
            put("Request_Under_Review", new HashMap<>() {{
                put("en", "//span[contains(text(),'Your cancellation request is under review.')]");
                put("ar", "//span[contains(text(),'طلب الإلغاء الخاص بك قيد المراجعة.')]");
            }});
            put("Beneficiaries_Side_Menu_Button", new HashMap<>() {{
                put("en", "//div[contains(text(),'Beneficiaries')]");
                put("ar", "//div[contains(text(),'المستفيدين')]");
            }});
            put("Bookings_Side_Menu_Button", new HashMap<>() {{
                put("en", "//div[contains(text(),'Bookings')]");
                put("ar", "//div[contains(text(),'الحجوزات')]");
            }});
            put("Bookings_Admin_Page", new HashMap<>() {{
                put("en", "//app-bookings");
                put("ar", "//app-bookings");
            }});
            put("Search_Booking_By_Dropdown_List", new HashMap<>() {{
                put("en", "//ng-select[@formcontrolname=\"searchByAttr\"]/div");
                put("ar", "//ng-select[@formcontrolname=\"searchByAttr\"]/div");
            }});
            put("Search_Value_Input_Field", new HashMap<>() {{
                put("en", "//input[@formcontrolname=\"searchValue\"]");
                put("ar", "//input[@formcontrolname=\"searchValue\"]");
            }});
            put("Invalid_Search_Value_Result", new HashMap<>() {{
                put("en", "//datatable-selection/div");
                put("ar", "//datatable-selection/div");
            }});
            put("Search_Value_Result", new HashMap<>() {{
                put("en", "//div[contains (text(), 'replaceText')]");
                put("ar", "//div[contains (text(), 'replaceText')]");
            }});
            put("Request_Cancel_Dropdown_Button", new HashMap<>() {{
                put("en", "//div[@cardclass=\"cancel-request-section\"]");
                put("ar", "//div[@cardclass=\"cancel-request-section\"]");
            }});
            put("Request_Cancel_Details", new HashMap<>() {{
                put("en", "//app-booking-cancel-request-list");
                put("ar", "//app-booking-cancel-request-list");
            }});
            put("Reject_Cancel_Booking_Popup", new HashMap<>() {{
                put("en", "//app-review-dialog");
                put("ar", "//app-review-dialog");
            }});
            put("Reject_Cancel_Booking_Textarea", new HashMap<>() {{
                put("en", "//mat-form-field/descendant::textarea");
                put("ar", "//mat-form-field/descendant::textarea");
            }});
            put("Cancellation_Status", new HashMap<>() {{
                put("en", "(//datatable-body-cell/descendant::p)[2]");
                put("ar", "(//datatable-body-cell/descendant::p)[2]");
            }});
            put("Status_Dropdown_List", new HashMap<>() {{
                put("en", "(//app-filter-dropdown/descendant::ng-select/descendant::input)[2]");
                put("ar", "(//app-filter-dropdown/descendant::ng-select/descendant::input)[2]");
            }});
            put("Approve_Button", new HashMap<>() {{
                put("en", "//button/span[contains(text(),'Approve')]");
                put("ar", "//button/span[contains(text(),'قبول')]");
            }});
            put("Cancelled_Nav_Button", new HashMap<>() {{
                put("en", "//span[contains(text(),'Cancelled')]");
                put("ar", "//span[contains(text(),'ملغاة')]");
            }});
            put("Cancelled_Bookings_List", new HashMap<>() {{
                put("en", "//app-booking-list-by-status");
                put("ar", "//app-booking-list-by-status");
            }});
            put("Plot_Code", new HashMap<>() {{
                put("en", "//app-unit-title/descendant::h2");
                put("ar", "//app-unit-title/descendant::h2");
            }});
            put("View_Cancelled_Booking_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'replaceText')]/ancestor::app-collapse-box/descendant::span[contains (text(), 'View booking')]");
                put("ar", "//span[contains (text(), 'replaceText')]/ancestor::app-collapse-box/descendant::span[contains (text(), 'عرض الحجز')]");
            }});
            put("Cancelled_Message", new HashMap<>() {{
                put("en", "//app-land-alert-messages/descendant::p");
                put("ar", "//app-land-alert-messages/descendant::p");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By filterButton() throws Exception {
        return By.xpath(get("Filter_Button"));
    }

    public static By filterResultPopup() throws Exception {
        return By.xpath(get("Filter_Result_Popup"));
    }

    public static By projectInputFiled() throws Exception {
        return By.xpath(get("Project_Input_Filed"));
    }

    public static By clearButton() throws Exception {
        return By.xpath(get("Clear_Button"));
    }

    public static By viewButton() throws Exception {
        return By.xpath(get("View_Button"));
    }

    public static By searchedProjectDetailsPage() throws Exception {
        return By.xpath(get("Searched_Project_Details_Page"));
    }

    public static By projectDetailsTabButton() throws Exception {
        return By.xpath(get("Project_Details_Tab_Button"));
    }

    public static By projectDetailsPage() throws Exception {
        return By.xpath(get("Project_Details_Page"));
    }

    public static By startBookingButton() throws Exception {
        return By.xpath(get("Start_Booking_Button"));
    }

    public static By availableUnitsPage() throws Exception {
        return By.xpath(get("Available_Units_Page"));
    }

    public static By availableProjectUnit() throws Exception {
        return By.xpath(get("Available_Project_Unit"));
    }

    public static By reservePlotButton() throws Exception {
        return By.xpath(get("Reserve_Plot_Button"));
    }

    public static By termsAndConditionsPage() throws Exception {
        return By.xpath(get("Terms_And_Conditions_Page"));
    }

    public static By acceptAndSignButton() throws Exception {
        return By.xpath(get("Accept_And_Sign_Button"));
    }

    public static By downloadLandContractButton() throws Exception {
        return By.xpath(get("Download_Land_Contract_Button"));
    }

    public static By termsAndConditionsCheckbox() throws Exception {
        return By.xpath(get("Terms_And_Conditions_Checkbox"));
    }

    public static By bookingLandCompletePage() throws Exception {
        return By.xpath(get("Booking_Land_Complete_Page"));
    }

    public static By myActivitiesButton() throws Exception {
        return By.xpath(get("My_Activities_Button"));
    }

    public static By bookingsButton() throws Exception {
        return By.xpath(get("Bookings_Button"));
    }

    public static By viewBookingButton() throws Exception {
        return By.xpath(get("View_Booking_Button"));
    }

    public static By bookingDetailsPage() throws Exception {
        return By.xpath(get("Booking_Details_Page"));
    }

    public static By viewIconButton() throws Exception {
        return By.xpath(get("View_Icon_Button"));
    }

    public static By viewIconPopup() throws Exception {
        return By.xpath(get("View_Icon_Popup"));
    }

    public static By xButtonOfViewIconPopup() throws Exception {
        return By.xpath(get("X_Button_Of_View_Icon_Popup"));
    }

    public static By okayButton() throws Exception {
        return By.xpath(get("Okay_Button"));
    }

    public static By cancelBookingButton() throws Exception {
        return By.xpath(get("Cancel_Booking_Button"));
    }

    public static By confirmCancellationButton() throws Exception {
        return By.xpath(get("Confirm_Cancellation_Button"));
    }

    public static By cancelBookingButtonFromProfile() throws Exception {
        return By.xpath(get("Cancel_Booking_Button_From_Profile"));
    }

    public static By marketPlaceNavButton() throws Exception {
        return By.xpath(get("MarketPlace_Nav_Button"));
    }

    public static By cancelContractPage() throws Exception {
        return By.xpath(get("Cancel_Contract_Page"));
    }

    public static By saveAndContinueButton() throws Exception {
        return By.xpath(get("Save_And_Continue_Button"));
    }

    public static By cancelReasonDropdownList() throws Exception {
        return By.xpath(get("Cancel_Reason_Dropdown_List"));
    }

    public static By cancelLandDisclaimerPage() throws Exception {
        return By.xpath(get("Cancel_Land_Disclaimer_Page"));
    }

    public static By processButton() throws Exception {
        return By.xpath(get("Process_Button"));
    }

    public static By disclaimerCheckbox() throws Exception {
        return By.xpath(get("Disclaimer_Checkbox"));
    }

    public static By landCancelCompletePage() throws Exception {
        return By.xpath(get("Land_Cancel_Complete_Page"));
    }

    public static By requestUnderReview() throws Exception {
        return By.xpath(get("Request_Under_Review"));
    }

    public static By beneficiariesSideMenuButton() throws Exception {
        return By.xpath(get("Beneficiaries_Side_Menu_Button"));
    }

    public static By bookingsSideMenuButton() throws Exception {
        return By.xpath(get("Bookings_Side_Menu_Button"));
    }

    public static By bookingsAdminPage() throws Exception {
        return By.xpath(get("Bookings_Admin_Page"));
    }

    public static By searchBookingByDropdownList() throws Exception {
        return By.xpath(get("Search_Booking_By_Dropdown_List"));
    }

    public static By searchValueInputField() throws Exception {
        return By.xpath(get("Search_Value_Input_Field"));
    }

    public static By InvalidSearchValueResult() throws Exception {
        return By.xpath(get("Invalid_Search_Value_Result"));
    }

    public static By searchValueResult(String result) throws Exception {
        return By.xpath(get("Search_Value_Result").replace("replaceText", result));
    }

    public static By requestCancelDropdownButton() throws Exception {
        return By.xpath(get("Request_Cancel_Dropdown_Button"));
    }

    public static By requestCancelDetails() throws Exception {
        return By.xpath(get("Request_Cancel_Details"));
    }

    public static By rejectCancelBookingPopup() throws Exception {
        return By.xpath(get("Reject_Cancel_Booking_Popup"));
    }

    public static By rejectCancelBookingTextarea() throws Exception {
        return By.xpath(get("Reject_Cancel_Booking_Textarea"));
    }

    public static By cancellationStatus() throws Exception {
        return By.xpath(get("Cancellation_Status"));
    }

    public static By statusDropdownList() throws Exception {
        return By.xpath(get("Status_Dropdown_List"));
    }

    public static By approveButton() throws Exception {
        return By.xpath(get("Approve_Button"));
    }

    public static By cancelledNavButton() throws Exception {
        return By.xpath(get("Cancelled_Nav_Button"));
    }

    public static By cancelledBookingsList() throws Exception {
        return By.xpath(get("Cancelled_Bookings_List"));
    }

    public static By plotCode() throws Exception {
        return By.xpath(get("Plot_Code"));
    }

    public static By viewCancelledBookingButton(String code) throws Exception {
        return By.xpath(get("View_Cancelled_Booking_Button").replace("replaceText", code));
    }

    public static By cancelledMessage() throws Exception {
        return By.xpath(get("Cancelled_Message"));
    }
}
