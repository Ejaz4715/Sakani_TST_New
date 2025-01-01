package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class FullBookingJourneyPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Inventory_Side_Menu_Option", new HashMap<>() {{
                put("en", "//div[contains (text(), 'Internal inventory')]");
                put("ar", "//div[contains (text(), 'المخزون الداخلي')]");
            }});
            put("Internal_Inventory_Icon", new HashMap<>() {{
                put("en", "//i[contains(@class,'bi bi-x-diamond')]");
                put("ar", "//i[contains(@class,'bi bi-x-diamond')]");
            }});
            put("Projects_Side_Menu_Option", new HashMap<>() {{
                put("en", "//div[contains(text(),'Projects')]");
                put("ar", "//div[contains(text(),'المشاريع')]");
            }});
            put("Projects_Page_Title", new HashMap<>() {{
                put("en", "//h1[contains (text(), 'Projects')]");
                put("ar", "//h1[contains(text(),'المشاريع')]");
            }});
            put("Create_New_Project_Button", new HashMap<>() {{
                put("en", "//span[contains (text() , 'Add new project')]");
                put("ar", "//span[contains (text() , 'إضافة مشروع جديد')]");
            }});
            put("Project_Details_Page_Title", new HashMap<>() {{
                put("en", "//span[contains (text() , 'Project details')]");
                put("ar", "//span[contains (text() , 'تفاصيل المشروع')]");
            }});
            put("Project_Title_Input", new HashMap<>() {{
                put("en", "(//input[@placeholder='Project name'])[1]");
                put("ar", "(//input[@placeholder='إسم المشروع'])[1]");
            }});
            put("Secondary_Title_Input", new HashMap<>() {{
                put("en", "(//input[@placeholder='Project name'])[2]");
                put("ar", "(//input[@placeholder='إسم المشروع'])[2]");
            }});
            put("Input_Field_Error", new HashMap<>() {{
                put("en", "//mat-error[contains (@id, 'error') and not (text() = 'No Approved Sales Contract.')]");
                put("ar", "//mat-error[contains (@id, 'error') and not (text() = 'لا يوجد عقد بيع معتمد.')]");
            }});
            put("Project_Type_Dropdown", new HashMap<>() {{
                put("en", "//mat-select[@formcontrolname='project_type']");
                put("ar", "//mat-select[@formcontrolname='project_type']");
            }});
            put("Project_Type_Dropdown_List", new HashMap<>() {{
                put("en", "//mat-option[contains (@id,'option')]");
                put("ar", "//mat-option[contains (@id,'option')]");
            }});
            put("Region_Dropdown", new HashMap<>() {{
                put("en", "//ng-select[@id='selectRegion']");
                put("ar", "//ng-select[@id='selectRegion']");
            }});
            put("Region_Dropdown_List", new HashMap<>() {{
                put("en", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']");
                put("ar", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']");
            }});
            put("City_Dropdown_List", new HashMap<>() {{
                put("en", "//div[@role='listbox']/child::mat-option/descendant::span");
                put("ar", "//div[@role='listbox']/child::mat-option/descendant::span");
            }});
            put("City_Dropdown", new HashMap<>() {{
                put("en", "//input[@id='inputCity']");
                put("ar", "//input[@id='inputCity']");
            }});
            put("City_Option", new HashMap<>() {{
                put("en", "//mat-option[@role='option']");
                put("ar", "//mat-option[@role='option']");
            }});
            put("Developer_Name_Input", new HashMap<>() {{
                put("en", "//input[@id='inputDeveloper']");
                put("ar", "//input[@id='inputDeveloper']");
            }});
            put("Developer_Option", new HashMap<>() {{
                put("en", "//mat-option[@role='option']");
                put("ar", "//mat-option[@role='option']");
            }});
            put("Subsidize_Dropdown", new HashMap<>() {{
                put("en", "//mat-select[@formcontrolname='subsidize_level']/child::div");
                put("ar", "//mat-select[@formcontrolname='subsidize_level']/child::div");
            }});
            put("Subsidize_Dropdown_List", new HashMap<>() {{
                put("en", "//mat-option[@role='option']");
                put("ar", "//mat-option[@role='option']");
            }});
            put("Mega_Project_Dropdown", new HashMap<>() {{
                put("en", "//ng-select[@formcontrolname='mega_project_id']");
                put("ar", "//ng-select[@formcontrolname='mega_project_id']");
            }});
            put("Mega_Project_Dropdown_List", new HashMap<>() {{
                put("en", "//ng-select[@formcontrolname='mega_project_id']/descendant::div[@role='option']");
                put("ar", "//ng-select[@formcontrolname='mega_project_id']/descendant::div[@role='option']");
            }});
            put("Status_Dropdown", new HashMap<>() {{
                put("en", "//mat-select[@formcontrolname='status']");
                put("ar", "//mat-select[@formcontrolname='status']");
            }});
            put("Status_Dropdown_List", new HashMap<>() {{
                put("en", "//mat-option[@role='option']");
                put("ar", "//mat-option[@role='option']");
            }});
            put("Wafi_Expiry_Date_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='wafi_expiry_date']");
                put("ar", "//input[@formcontrolname='wafi_expiry_date']");
            }});
            put("Subsidy_Amount_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='max_subsidy_amount']");
                put("ar", "//input[@formcontrolname='max_subsidy_amount']");
            }});
            put("Subsidy_Type_Dropdown", new HashMap<>() {{
                put("en", "//mat-select[@formcontrolname='subsidy_type']");
                put("ar", "//mat-select[@formcontrolname='subsidy_type']");
            }});
            put("Subsidy_Type_Dropdown_List", new HashMap<>() {{
                put("en", "//mat-option[@role='option']");
                put("ar", "//mat-option[@role='option']");
            }});
            put("Project_Agreement_Date_Calender", new HashMap<>() {{
                put("en", "//form-field-component[@fieldname='agreement_date']/descendant::button[@aria-label='Open calendar']");
                put("ar", "//form-field-component[@fieldname='agreement_date']/descendant::button[@aria-label='Open calendar']");
            }});
            put("Select_Year_Dropdown", new HashMap<>() {{
                put("en", "//button[@aria-label='Choose month and year']");
                put("ar", "//button[@aria-label='Choose month and year']");
            }});
            put("Year_Month_Day_List", new HashMap<>() {{
                put("en", "//table[@class='mat-calendar-table']/descendant::button");
                put("ar", "//table[@class='mat-calendar-table']/descendant::button");
            }});
            put("Project_Agreement_Date_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='agreement_date']");
                put("ar", "//input[@formcontrolname='agreement_date']");
            }});
            put("Project_License_Number_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='project_license']");
                put("ar", "//input[@formcontrolname='project_license']");
            }});
            put("Project_License_Date_Calender", new HashMap<>() {{
                put("en", "//form-field-component[@fieldname='license_date']/descendant::button[@aria-label='Open calendar']");
                put("ar", "//form-field-component[@fieldname='license_date']/descendant::button[@aria-label='Open calendar']");
            }});
            put("Escrow_Account_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='iban_number']");
                put("ar", "//input[@formcontrolname='iban_number']");
            }});
            put("Bank_Name_Dropdown", new HashMap<>() {{
                put("en", "//app-nsar-dropdown[@formcontrolname='bank_name']");
                put("ar", "//app-nsar-dropdown[@formcontrolname='bank_name']");
            }});
            put("Bank_Name_Dropdown_List", new HashMap<>() {{
                put("en", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role = 'option']");
                put("ar", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role = 'option']");
            }});
            put("Project_Deduct_Percentage_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='deduct_percentage']");
                put("ar", "//input[@formcontrolname='deduct_percentage']");
            }});
            put("Deed_City_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='deed_city']");
                put("ar", "//input[@formcontrolname='deed_city']");
            }});
            put("Land_Delivery_Date_Input", new HashMap<>() {{
                put("en", "//app-gregorian-datepicker[@formcontrolname='land_delivery_date']/descendant::input[@placeholder]");
                put("ar", "//app-gregorian-datepicker[@formcontrolname='land_delivery_date']/descendant::input[@placeholder]");
            }});
            put("Incentivize_Project_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='is_incentivized']");
                put("ar", "//mat-slide-toggle[@formcontrolname='is_incentivized']");
            }});
            put("Incentivize_Project_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='is_incentivized']/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname='is_incentivized']/descendant::button");
            }});
            put("Show_Mullak_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='mullak_content_flag']");
                put("ar", "//mat-slide-toggle[@formcontrolname='mullak_content_flag']");
            }});
            put("Show_Mullak_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='mullak_content_flag']/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname='mullak_content_flag']/descendant::button");
            }});
            put("Show_Wafi_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='wafi_content_flag']");
                put("ar", "//mat-slide-toggle[@formcontrolname='wafi_content_flag']");
            }});
            put("Show_Wafi_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='wafi_content_flag']/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname='wafi_content_flag']/descendant::button");
            }});
            put("Show_Completion_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='completion_percentage_visible']");
                put("ar", "//mat-slide-toggle[@formcontrolname='completion_percentage_visible']");
            }});
            put("Show_Completion_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='completion_percentage_visible']/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname='completion_percentage_visible']/descendant::button");
            }});
            put("Additional_Info_Tab", new HashMap<>() {{
                put("en", "//span[contains (text() , 'Additional info')]");
                put("ar", "//span[contains (text() , 'معلومات إضافية')]");
            }});
            put("CRM_Code_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='crm_code']");
                put("ar", "//input[@formcontrolname='crm_code']");
            }});
            put("Deed_Number_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='deed_number']");
                put("ar", "//input[@formcontrolname='deed_number']");
            }});
            put("Plan_Number_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='plan_number']");
                put("ar", "//input[@formcontrolname='plan_number']");
            }});
            put("Deed_Date_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='deed_date']");
                put("ar", "//input[@formcontrolname='deed_date']");
            }});
            put("Project_License_Date_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='license_date']");
                put("ar", "//input[@formcontrolname='license_date']");
            }});
            put("Consultant_Design_Office_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='consultant_design_office']");
                put("ar", "//input[@formcontrolname='consultant_design_office']");
            }});
            put("Consultant_Design_Office_License_NumInput", new HashMap<>() {{
                put("en", "//input[@formcontrolname='consultant_design_office_license_number']");
                put("ar", "//input[@formcontrolname='consultant_design_office_license_number']");
            }});
            put("Property_Year_Of_Built_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='property_year_of_built']");
                put("ar", "//input[@formcontrolname='property_year_of_built']");
            }});
            put("Developer_Warranty_Period_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='developer_warranty_period']");
                put("ar", "//input[@formcontrolname='developer_warranty_period']");
            }});
            put("Consultant_Construction_Office_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='consultant_construction_office']");
                put("ar", "//input[@formcontrolname='consultant_construction_office']");
            }});
            put("Consultant_Construction_License_Num_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='consultant_construction_office_license_number']");
                put("ar", "//input[@formcontrolname='consultant_construction_office_license_number']");
            }});
            put("Project_Readiness_Date_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='project_readiness_date']");
                put("ar", "//input[@formcontrolname='project_readiness_date']");
            }});
            put("District_Name_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='district']");
                put("ar", "//input[@formcontrolname='district']");
            }});
            put("Latitude_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='latitude']");
                put("ar", "//input[@formcontrolname='latitude']");
            }});
            put("Longitude_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='longitude']");
                put("ar", "//input[@formcontrolname='longitude']");
            }});
            put("Acceptance_Expiry_Period_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='acceptance_expiry_period_in_days']");
                put("ar", "//input[@formcontrolname='acceptance_expiry_period_in_days']");
            }});
            put("Project_Setting_Tab", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Project settings')]");
                put("ar", "//span[contains (text(), 'إعدادات المشاريع')]");
            }});
            put("Initial_Booking_Expiry_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='inquiry_expiry_period_in_days']");
                put("ar", "//input[@formcontrolname='inquiry_expiry_period_in_days']");
            }});
            put("Building_Permit_Period_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='building_permit_period_in_months']");
                put("ar", "//input[@formcontrolname='building_permit_period_in_months']");
            }});
            put("Using_General_Booking_Fee_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='using_general_booking_fee']/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle[@formcontrolname='using_general_booking_fee']/descendant::button[@role='switch']");
            }});
            //mat-slide-toggle[@formcontrolname='using_general_booking_fee']/descendant::span[1]
            put("Using_General_Booking_Fee_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='using_general_booking_fee']/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle[@formcontrolname='using_general_booking_fee']/descendant::button[@role='switch']");
            }});
            put("Booking_Fee_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='booking_fee']");
                put("ar", "//input[@formcontrolname='booking_fee']");
            }});
            put("Using_General_Extend_Price_Quotation_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='using_general_extend_pq']/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle[@formcontrolname='using_general_extend_pq']/descendant::button[@role='switch']");
            }});
            put("Using_General_Extend_Price_Quotation_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='using_general_extend_pq']/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle[@formcontrolname='using_general_extend_pq']/descendant::button[@role='switch']");
            }});
            put("Extend_Price_Quotation_Day_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='extend_pq_day']");
                put("ar", "//input[@formcontrolname='extend_pq_day']");
            }});
            put("Extend_Price_Quotation_Fee_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='extend_pq_fee']");
                put("ar", "//input[@formcontrolname='extend_pq_fee']");
            }});
            put("Activate_Multiple_Units_Booking_For_Non_Bene_Web_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='active_multiple_bookings_for_web_mobile']/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle[@formcontrolname='active_multiple_bookings_for_web_mobile']/descendant::button[@role='switch']");
            }});
            put("Activate_Multiple_Units_Booking_For_Non_Bene_Web_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='active_multiple_bookings_for_web_mobile']/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle[@formcontrolname='active_multiple_bookings_for_web_mobile']/descendant::button[@role='switch']");
            }});
            put("Activate_Multiple_Units_Booking_For_Non_Bene_Sakani_Partner_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='active_multiple_bookings_for_partner']/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle[@formcontrolname='active_multiple_bookings_for_partner']/descendant::button[@role='switch']");
            }});
            put("Activate_Multiple_Units_Booking_For_Non_Bene_Sakani_Partner_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='active_multiple_bookings_for_partner']/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle[@formcontrolname='active_multiple_bookings_for_partner']/descendant::button[@role='switch']");
            }});
            put("Maximum_Number_Of_Bookings_For_Non_Bene_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='maximum_booking_per_non_beneficiary']");
                put("ar", "//input[@formcontrolname='maximum_booking_per_non_beneficiary']");
            }});
            put("Active_Queuing_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='active_queueing']/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle[@formcontrolname='active_queueing']/descendant::button[@role='switch']");
            }});
            put("Active_Queuing_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='active_queueing']/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle[@formcontrolname='active_queueing']/descendant::button[@role='switch']");
            }});
            put("Maximum_Number_Of_User_Able_To_Book", new HashMap<>() {{
                put("en", "//input[@formcontrolname='max_active_queueing_member']");
                put("ar", "//input[@formcontrolname='max_active_queueing_member']");
            }});
            put("Save_Button", new HashMap<>() {{
                put("en", "//button[contains (text(),'Save')] | //span[contains (text(),'Save')]/parent::button");
                put("ar", "//button[contains (text(),'حفظ')] | //span[contains (text(),'حفظ')]/parent::button");
            }});
            put("System_Popup_Message", new HashMap<>() {{
                put("en", "//simple-snack-bar/descendant::div| //app-toasts/descendant::span");
                put("ar", "//simple-snack-bar/descendant::div| //app-toasts/descendant::span");
            }});
            put("Toast_Message", new HashMap<>() {{
                put("en", "//snack-bar-container/descendant::span");
                put("ar", "//snack-bar-container/descendant::span");
            }});
            put("Units_Tab_Label", new HashMap<>() {{
                put("en", "//span[@class='mdc-tab__text-label'][text()= 'Units']");
                put("ar", "//span[@class='mdc-tab__text-label'][text()= 'الوحدات']");
            }});
            put("Unit_Code_Label", new HashMap<>() {{
                put("en", "//label[contains(text(), 'Unit Code')]");
                put("ar", "//label[contains(text(),'رمز الوحدة السكنية التعريفي')]");
            }});
            put("New_Import_Unit_Button", new HashMap<>() {{
                put("en", "//button[@id='new_offplan_unit_import_btn']");
                put("ar", "//button[@id='new_offplan_unit_import_btn']");
            }});
            put("Unit_Type_Dropdown", new HashMap<>() {{
                put("en", "//mat-select[@formcontrolname='unit_type']");
                put("ar", "//mat-select[@formcontrolname='unit_type']");
            }});
            put("Unit_Import_Page_Title", new HashMap<>() {{
                put("en", "//p[contains(text(), 'Import')]");
                put("ar", "//p[contains(text(), 'استيراد')]");
            }});
            put("Unit_Type_Dropdown_List", new HashMap<>() {{
                put("en", "//mat-option[contains (@id,'option')]");
                put("ar", "//mat-option[contains (@id,'option')]");
            }});
            put("Upload_Unit_Import_File", new HashMap<>() {{
                put("en", "//input[@type='file']");
                put("ar", "//input[@type='file']");
            }});
            put("Invalid_Unit_Import_File_Error", new HashMap<>() {{
                put("en", "//app-upload-box[@formcontrolname='file']/descendant::label | //fuse-project-booking-document-templates/descendant::mat-error");
                put("ar", "//app-upload-box[@formcontrolname='file']/descendant::label | //fuse-project-booking-document-templates/descendant::mat-error");
            }});
            put("Attachment_Name", new HashMap<>() {{
                put("en", "//span[contains (text(), 'replaceText')]");
                put("ar", "//span[contains (text(), 'replaceText')]");
            }});
            put("Commit_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'COMMIT')]");
                put("ar", "//button[contains (text(), 'اعتماد')]");
            }});
            put("Unit_Import_Status", new HashMap<>() {{
                put("en", "//p[contains (text() , 'STATUS')]");
                put("ar", "//p[contains (text() , 'الحالة')]");
            }});
            put("Ok_Popup_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'OK')]");
                put("ar", "//button[contains (text(), 'موافق')]");
            }});
            put("Media_Tab_Label", new HashMap<>() {{
                put("en", "//span[@class='mdc-tab__text-label']/child::span[contains(text(), 'Media')]");
                put("ar", "//span[@class='mdc-tab__text-label']/child::span[contains(text(), 'المحتوى المرئي')]|//span[contains(text(), 'المحتوى المرئي')]");
            }});
            put("Banner_Image_Attachment", new HashMap<>() {{
                put("en", "//h1[contains (text(), 'Banner Image')]/parent::div/following-sibling::div/child::input");
                put("ar", "//h1[contains (text(), 'الصورة الإعلانية')]/parent::div/following-sibling::div/child::input");
            }});
            put("Banner_Image_Remove_Button", new HashMap<>() {{
                put("en", "//h1[contains (text(), 'Banner Image')]/ancestor::fuse-image-input/descendant::mat-icon[contains (text(), 'close')]");
                put("ar", "//h1[contains (text(), 'الصورة الإعلانية')]/ancestor::fuse-image-input/descendant::mat-icon[contains (text(), 'close')]");
            }});
            put("Upload_Arrow_Button", new HashMap<>() {{
                put("en", "//mat-icon[contains (text(), 'file_upload ')]");
                put("ar", "//mat-icon[contains (text(), 'file_upload ')]");
            }});
            put("Video_Media_Attachment", new HashMap<>() {{
                put("en", "//h1[contains (text(), 'Video Media')]/parent::div/following-sibling::div/child::input");
                put("ar", "//h1[contains (text(), 'الفيديو')]/parent::div/following-sibling::div/child::input");
            }});
            put("Master_Plan_Attachment", new HashMap<>() {{
                put("en", "//h1[contains (text(), 'Master plan Media')]/parent::div/following-sibling::div/child::input");
                put("ar", "//h1[contains (text(), 'ملف المخطط الرئيسي')]/parent::div/following-sibling::div/child::input");
            }});
            put("Video_Library_Attachment", new HashMap<>() {{
                put("en", "//h1[contains (text(), 'Videos uploaded')]/following-sibling::lib-sakani-upload-files/descendant::input");
                put("ar", "//h1[contains (text(), 'رفع مقطع الفيديو')]/following-sibling::lib-sakani-upload-files/descendant::input");
            }});
            put("Photo_Library_Attachment", new HashMap<>() {{
                put("en", "//h1[contains (text(), 'Photos uploaded')]/following-sibling::lib-sakani-upload-files[@formcontrolname='image']/descendant::input");
                put("ar", "//h1[contains (text(), 'رفع الصور')]/following-sibling::lib-sakani-upload-files[@formcontrolname='image']/descendant::input");
            }});
            put("Image_Gallery_Attachment", new HashMap<>() {{
                put("en", "//h1[contains (text(), 'Image Gallery')]/parent::div/following-sibling::div/child::input");
                put("ar", "//h1[contains (text(), 'معرض الصور')]/parent::div/following-sibling::div/child::input");
            }});

            put("Save_Button_For_Video_Library", new HashMap<>() {{
                put("en", "(//span[contains (text(), 'Save')])[2]");
                put("ar", "(//span[contains (text(), 'حفظ')])[2]");
            }});
            put("Save_Button_For_Photo_Library", new HashMap<>() {{
                put("en", "(//span[contains (text(), 'Save')])[1]");
                put("ar", "(//span[contains (text(), 'حفظ')])[1]");
            }});
            put("Brochure_Media_Attachment", new HashMap<>() {{
                put("en", "//h1[contains (text(), 'Brochure Media')]/parent::div/following-sibling::div/child::input");
                put("ar", "//h1[contains (text(), 'كتيب وسائل الإعلام')]/parent::div/following-sibling::div/child::input");
            }});
            put("Geo_Map_Attachment", new HashMap<>() {{
                put("en", "//h1[contains (text(), 'GEO Map')]/parent::div/following-sibling::div/child::input");
                put("ar", "//h1[contains (text(), 'خريطة جي')]/parent::div/following-sibling::div/child::input");
            }});
            put("Display_Method_Dropdown", new HashMap<>() {{
                put("en", "//ng-select[@formcontrolname='display_method']");
                put("ar", "//ng-select[@formcontrolname='display_method']");
            }});
            put("Display_Method_Dropdown_List", new HashMap<>() {{
                put("en", "//ng-dropdown-panel/descendant::div[@role='option']");
                put("ar", "//ng-dropdown-panel/descendant::div[@role='option']");
            }});
            put("Title_Of_Detail_Page_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='title_of_detail_page']");
                put("ar", "//input[@formcontrolname='title_of_detail_page']");
            }});
            put("First_Unit_Delivery_Date_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='title_of_detail_page']");
                put("ar", "//input[@formcontrolname='title_of_detail_page']");
            }});
            put("Project_Display_Name_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='name']");
                put("ar", "//input[@formcontrolname='name']");
            }});
            put("Summary_Input", new HashMap<>() {{
                put("en", "//textarea[@formcontrolname='summary']");
                put("ar", "//textarea[@formcontrolname='summary']");
            }});
            put("Description_Input", new HashMap<>() {{
                put("en", "//form-field-component//textarea[@formcontrolname='description'] | //mat-form-field/descendant::textarea[@formcontrolname='description']");
                put("ar", "//form-field-component//textarea[@formcontrolname='description']");
            }});
            put("Descriptions_Input", new HashMap<>() {{
                put("en", "//form-field-component//textarea[@formcontrolname='description'] | //mat-form-field/descendant::textarea[@formcontrolname='description']");
                put("ar", "//form-field-component//textarea[@formcontrolname='description']| //mat-form-field/descendant::textarea[@formcontrolname='description']");
            }});
            put("Pricing_Starting_At_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='price_starting_at']");
                put("ar", "//input[@formcontrolname='price_starting_at']");
            }});
            put("Promoted_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='promoted']");
                put("ar", "//mat-slide-toggle[@formcontrolname='promoted']");
            }});
            put("Promoted_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='promoted']/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname='promoted']/descendant::button");
            }});
            put("Nearest_Airport_Distance_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='airport_distance']");
                put("ar", "//input[@formcontrolname='airport_distance']");
            }});
            put("Nearest_School_Distance_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='school_distance']");
                put("ar", "//input[@formcontrolname='school_distance']");
            }});
            put("Total_Area_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='total_land_area']");
                put("ar", "//input[@formcontrolname='total_land_area']");
            }});
            put("Market_Day_Flag_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='marketplace_day_flag']");
                put("ar", "//mat-slide-toggle[@formcontrolname='marketplace_day_flag']");
            }});
            put("Market_Day_Flag_Toggle_Input", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='marketplace_day_flag']/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname='marketplace_day_flag']/descendant::button");
            }});
            put("Project_Details_Tab", new HashMap<>() {{
                put("en", "//span[@class=\"mdc-tab__text-label\"][contains(text(), 'Project details')]");
                put("ar", "//span[@class=\"mdc-tab__text-label\"][contains(text(), 'تفاصيل المشروع')]");
            }});
            put("Media_Approval_Button", new HashMap<>() {{
                put("en", "//button[contains (@id , 'request_approval_btn')] | //button[contains (@id, 'request_approve_btn')] ");
                put("ar", "//button[contains (@id , 'request_approval_btn')] | //button[contains (@id, 'request_approve_btn')] ");
            }});
            put("Reject_Media_Button", new HashMap<>() {{
                put("en", "//button[@id='reject_btn']");
                put("ar", "//button[@id='reject_btn']");
            }});
            put("Approve_Media_Button", new HashMap<>() {{
                put("en", "//button[@id='approve_btn']");
                put("ar", "//button[@id='approve_btn']");
            }});
            put("Project_Financial_Institution_Tab_Label", new HashMap<>() {{
                put("en", "//span[@class='mdc-tab__text-label'][contains(text(), 'Project financial institutions')]");
                put("ar", "//span[@class='mdc-tab__text-label'][contains(text(), 'قائمة الجهات التمويلية المشاركة في المشروع')]");
            }});
            put("Select_All_Banks_Checkbox", new HashMap<>() {{
                put("en", "//datatable-header-cell/descendant::label");
                put("ar", "//datatable-header-cell/descendant::label");
            }});

            put("Booking_Document_Template_Tab_Label", new HashMap<>() {{
                put("en", "//span[@class='mdc-tab__text-label'][contains(text(), 'Booking document template')]");
                put("ar", "//span[@class='mdc-tab__text-label'][contains(text(), 'قالب مستند الحجز')]");
            }});
            put("Booking_Document_Template_Input_Attachment", new HashMap<>() {{
                put("en", "//fuse-project-booking-document-templates/descendant::input[@type='file']");
                put("ar", "//fuse-project-booking-document-templates/descendant::input[@type='file']");
            }});
            put("Booking_Template_Type_Dropdown", new HashMap<>() {{
                put("en", "//mat-select[@formcontrolname='template_type']");
                put("ar", "//mat-select[@formcontrolname='template_type']");
            }});

            put("Booking_Template_Type_Dropdown_List", new HashMap<>() {{
                put("en", "//mat-option[contains (@id,'option')]");
                put("ar", "//mat-option[contains (@id,'option')]");
            }});
            put("Unit_Model_Tab_Label", new HashMap<>() {{
                put("en", "//span[@class='mdc-tab__text-label'][contains(text(), 'Unit models')]");
                put("ar", "//span[@class='mdc-tab__text-label'][contains(text(), 'نماذج الوحدات')]");
            }});
            put("Unit_Model_Name", new HashMap<>() {{
                put("en", "(//datatable-body//datatable-body-row//datatable-body-cell/descendant::span)[1]");
                put("ar", "(//datatable-body//datatable-body-row//datatable-body-cell/descendant::span)[1]");
            }});
            put("Save_Button_Add_Unit_Model", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Save')]/parent::button");
                put("ar", "//span[contains (text(), 'حفظ')]/parent::button");
            }});
            put("Media_Section_Label_On_Unit_Model_Page", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Media')]");
                put("ar", "//span[contains (text(), 'المحتوى المرئي')]");
            }});
            put("Unit_Model_Status", new HashMap<>() {{
                put("en", "(//datatable-body-row//datatable-body-cell)[2]");
                put("ar", "(//datatable-body-row//datatable-body-cell)[2]");
            }});
            put("Project_Sales_Contract_Tab_Label", new HashMap<>() {{
                put("en", "//span[@class='mdc-tab__text-label'][contains(text(), 'Project sales contracts')]");
                put("ar", "//span[@class='mdc-tab__text-label'][contains(text(), 'عقود بيع المشروع')]");
            }});
            put("Sales_Contract_Attachment", new HashMap<>() {{
                put("en", "//lib-sakani-upload-files/descendant::input[@type='file']");
                put("ar", "//lib-sakani-upload-files/descendant::input[@type='file']");
            }});
            put("Save_Button_On_Media_Page", new HashMap<>() {{
                put("en", "//button[contains (text(),'Save')]");
                put("ar", "//button[contains (text(),'حفظ')]");
            }});
            put("Sale_Contract_Approval_Error_Message", new HashMap<>() {{
                put("en", "//mat-error[contains (text() , 'No Approved Sales Contract')]");
                put("ar", "//mat-error[contains (text() , 'لا يوجد عقد بيع معتمد')]");
            }});
            put("Sale_Contract_Approval_Records_TabLabel", new HashMap<>() {{
                put("en", "//span[@class='mdc-tab__text-label'][contains(text(), 'Sales contract approval records')]");
                put("ar", "//span[@class='mdc-tab__text-label'][contains(text(), 'سجلات الموافقة على عقد البيع')]");
            }});
            put("View_Button_On_Sale_Contract_Approval_Page", new HashMap<>() {{
                put("en", "//a[contains (text(), 'View')]");
                put("ar", "//a[contains (text(), 'معاينة')]");
            }});
            put("Document_Viewer_Popup", new HashMap<>() {{
                put("en", "//ngx-doc-viewer[@viewer='office']");
                put("ar", "//ngx-doc-viewer[@viewer='office']");
            }});
            put("Download_Button_On_Sale_Contract_Approval_Page", new HashMap<>() {{
                put("en", "//a[contains (text(), 'Download')]");
                put("ar", "//a[contains (text(), 'تنزيل')]");
            }});
            put("Arrow_Button_End", new HashMap<>() {{
                put("en", "//mat-tab-header/descendant::button[2]");
                put("ar", "//mat-tab-header/descendant::button[2]");
            }});
            put("Arrow_Button_Start", new HashMap<>() {{
                put("en", "//mat-tab-header/descendant::button[1]");
                put("ar", "//mat-tab-header/descendant::button[1]");
            }});
            put("Back_Button", new HashMap<>() {{
                put("en", "//button[contains (text() , 'Back')]");
                put("ar", "//button[contains (text() , 'رجوع')]");
            }});
            put("Booking_Document_Template_Page", new HashMap<>() {{
                put("en", "//img[@src='assets/icons/upload.svg']");
                put("ar", "//img[@src='assets/icons/upload.svg']");
            }});
            put("Loading_Icon_For_Sale_Contract_Attachment", new HashMap<>() {{
                put("en", "//app-icon-loading");
                put("ar", "//app-icon-loading");
            }});
            put("Sale_Contract_Status", new HashMap<>() {{
                put("en", "(//datatable-body//datatable-body-row//datatable-body-cell/child::div)[3]");
                put("ar", "(//datatable-body//datatable-body-row//datatable-body-cell/child::div)[3]");
            }});
            put("Link_With_Azm_Toggle", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='azm_item_status']/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname='azm_item_status']/descendant::button");
            }});
            put("Is_Published_Toggle", new HashMap<>() {{
                put("en", "//label[contains (text(), 'Is published')]/ancestor::mat-slide-toggle//descendant::button");
                put("ar", "//label[contains (text(), 'هل تم نشر المشروع')]/ancestor::mat-slide-toggle//descendant::button");
            }});
            put("Published_Date", new HashMap<>() {{
                put("en", "//label[contains (text(), 'هل تم نشر المشروع')]//span");
                put("ar", "//label[contains (text(), 'هل تم نشر المشروع')]//span");
            }});
            put("Is_Published_Toggle_Input", new HashMap<>() {{
                put("en", "//label[contains (text(), 'Is published')]/ancestor::mat-slide-toggle//descendant::button");
                put("ar", "//label[contains (text(), 'هل تم نشر المشروع')]/ancestor::mat-slide-toggle//descendant::button");
            }});
            put("Is_Published_Toggle_Unit_Model", new HashMap<>() {{
                put("en", "//mat-slide-toggle/descendant::button[@role='switch']");
                put("ar", "//mat-slide-toggle/descendant::button[@role='switch']");
            }});
            put("Units_List_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Unit list')]");
                put("ar", "//button[contains (text(), 'قائمة الوحدات')]");
            }});
            put("Ready_To_Start_Booking_Label", new HashMap<>() {{
                put("en", "//h5[contains (text(), 'Ready to start your booking')]");
                put("ar", "//h5[contains (text(), 'هل تود البدء بإجراءات الحجز الان')]");
            }});
            put("You_Have_No_Financial_Recommendations_Banner", new HashMap<>() {{
                put("en", "//app-banner-message/descendant::h5");
                put("ar", "//app-banner-message/descendant::h5");
            }});
            put("Financial_Advisory_Button", new HashMap<>() {{
                put("en", "//app-banner-message/descendant::button");
                put("ar", "//app-banner-message/descendant::button");
            }});
            put("Financial_Advisory_Page_Title", new HashMap<>() {{
                put("en", "//h3[contains (text(), 'The Financial Advisory service')]");
                put("ar", "//h3[contains (text(), 'برنامج الدعم السكني المحدث')]");
            }});
            put("Start_Service_Button", new HashMap<>() {{
                put("en", "//a[@href='/app/financial-advisory']/child::span[1]");
                put("ar", "//a[@href='/app/financial-advisory']/child::span[1]");
            }});
            put("Purchasing_Power_Info_Page_Title", new HashMap<>() {{
                put("en", "//h3[contains (text(), 'Please confirm the final purchasing power information')]");
                put("ar", "//h3[contains (text(), 'صمم دعمك')]");
            }});
            put("Employment_Type_Dropdown", new HashMap<>() {{
                put("en", "//app-dropdown[@formcontrolname='type_of_work']/parent::div/descendant::ng-select");
                put("ar", "//app-dropdown[@formcontrolname='type_of_work']/parent::div/descendant::ng-select");
            }});
            put("Employment_Type_Dropdown_List", new HashMap<>() {{
                put("en", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']/descendant::span");
                put("ar", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']/descendant::span");
            }});
            put("Type_Of_Salary_Bank_Dropdown", new HashMap<>() {{
                put("en", "//app-dropdown[@formcontrolname='bank_id']/parent::div/descendant::ng-select");
                put("ar", "//app-dropdown[@formcontrolname='bank_id']/parent::div/descendant::ng-select");
            }});
            put("Type_Of_Salary_Bank_Dropdown_List", new HashMap<>() {{
                put("en", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']/descendant::span");
                put("ar", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']/descendant::span");
            }});
            put("Basic_Salary_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='monthly_salary']");
                put("ar", "//input[@formcontrolname='monthly_salary']");
            }});
            put("Housing_Allowance_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='home_allowance']");
                put("ar", "//input[@formcontrolname='home_allowance']");
            }});
            put("Other_Allowance_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='additional_income']");
                put("ar", "//input[@formcontrolname='additional_income']");
            }});
            put("Financial_Saving_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='personal_savings']");
                put("ar", "//input[@formcontrolname='personal_savings']");
            }});
            put("Down_Payment_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='down_payment_amount']");
                put("ar", "//input[@formcontrolname='down_payment_amount']");
            }});
            put("Monthly_Commitment_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='monthly_obligations']");
                put("ar", "//input[@formcontrolname='monthly_obligations']");
            }});
            put("Duration_Of_Commitment_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='num_months_remaining']");
                put("ar", "//input[@formcontrolname='num_months_remaining']");
            }});
            put("Input_Field_Error_Housing", new HashMap<>() {{
                put("en", "//div[contains (@class, 'text-danger')]");
                put("ar", "//div[contains (@class, 'text-danger')]");
            }});
            put("Product_Type", new HashMap<>() {{
                put("en", "//app-label[@label='FINANCIAL_ADVISORY.CHOOSE_PRODUCT_TYPE']/following-sibling::div/descendant::p[contains (text(), 'replaceText')]");
                put("ar", "//app-label[@label='FINANCIAL_ADVISORY.CHOOSE_PRODUCT_TYPE']/following-sibling::div/descendant::p[contains (text(), 'replaceText')]");
            }});
            put("Available_Subsidy_Heading", new HashMap<>() {{
                put("en", "//h4[contains (text(), 'Available Subsidy Packages')]");
                put("ar", "//h4[contains (text(), 'باقات الدعم المتاحة')]");
            }});
            put("Active_Product_Type", new HashMap<>() {{
                put("en", "//div[contains (@class, 'product-type-box active')]");
                put("ar", "//div[contains (@class, 'product-type-box active')]");
            }});
            put("Disclaimer_Checkbox", new HashMap<>() {{
                put("en", "//input[contains (@formcontrolname, 'term')]");
                put("ar", "//input[contains (@formcontrolname, 'term')]");
            }});
            put("Submit_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Submit')]");
                put("ar", "//button[contains (text(), 'إرسال')]");
            }});
            put("Advisory_Success_Message", new HashMap<>() {{
                put("en", "//h2[contains (text(), 'Congratulation')]");
                put("ar", "//h2[contains (text(), 'تهانينا')]");
            }});
            put("Start_Booking_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Start booking')]");
                put("ar", "//span[contains (text(), 'بدء حجز جديد')]");
            }});
            put("Available_Units_Label", new HashMap<>() {{
                put("en", "//h5[contains (text(), 'available units')]");
                put("ar", "//h5[contains (text(), 'من الوحدات المتاحة')]");
            }});
            put("Unit_For_Booking", new HashMap<>() {{
                put("en", "//span[contains (text(), 'replaceText')]/ancestor::app-project-unit-card-information//descendant::h4");
                put("ar", "//span[contains (text(), 'replaceText')]/ancestor::app-project-unit-card-information//descendant::h4");
            }});
            put("Unit_Details_Page_Text", new HashMap<>() {{
                put("en", "//div[contains (text(), 'Block number')]");
                put("ar", "//div[contains (text(), 'رقم البلوك')]");
            }});
            put("Book_Unit_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Book unit')]");
                put("ar", "//span[contains (text(), 'حجز الوحدة السكنية')]");
            }});
            put("Unit_Booking_Disclaimer_Page_Title", new HashMap<>() {{
                put("en", "//h4[contains (text(), 'Disclaimer')]");
                put("ar", "//h4[contains (text(), 'إقرار')]");
            }});
            put("Existing_Booking_Banner", new HashMap<>() {{
                put("en", "//h5[contains (text(), 'Time left to complete booking')]");
                put("ar", "//h5[contains (text(), 'الوقت المتبقي لإكمال الحجز')]");
            }});
            put("Cancel_Button_On_Popup", new HashMap<>() {{
                put("en", "//button[contains(text(),'Cancel')]");
                put("ar", "//button[contains(text(),'إلغاء')]");
            }});
            put("Continue_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Continue')]");
                put("ar", "//button[contains (text(), 'المتابعة')]");
            }});
            put("Unit_Booking_Disclaimer_PageError", new HashMap<>() {{
                put("en", "//div[contains (text(), 'This field is required')]");
                put("ar", "//div[contains (text(), 'الحقل مطلوب')]");
            }});
            put("Financial_Recommendation_Certificate_Page_Title", new HashMap<>() {{
                put("en", "//h4[contains (text(), 'Financial Recommendations Certificate')]");
                put("ar", "//h4[contains (text(), 'شهادة التوصيات المالية')]");
            }});
            put("Booking_Summary_Page_Title", new HashMap<>() {{
                put("en", "//h4[contains (text(), 'Booking summary')]");
                put("ar", "//h4[contains (text(), 'ملخص الحجز')]");
            }});
            put("Pay_Booking_Fee_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Pay booking fee')]");
                put("ar", "//span[contains (text(), 'دفع رسوم الحجز')]");
            }});
            put("Mada_Button", new HashMap<>() {{
                put("en", "//a[@id='madaBtn']");
                put("ar", "//a[@id='madaBtn']");
            }});
            put("Card_Number_Input", new HashMap<>() {{
                put("en", "//form//input[@name='card.number']");
                put("ar", "//form//input[@name='card.number']");
            }});
            put("cancel_Booking_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Cancel booking')]");
                put("ar", "//span[contains (text(), 'إلغاء الحجز')]");
            }});
            put("Cancel_Reason", new HashMap<>() {{
                put("en", "//app-radio[@formcontrolname='cancel_reason']/descendant::app-label[1]");
                put("ar", "//app-radio[@formcontrolname='cancel_reason']/descendant::app-label[1]");
            }});
            put("Yes_Button_Popup", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Yes')]");
                put("ar", "//button[contains (text(), 'نعم')]");
            }});
            put("No_Button_Popup", new HashMap<>() {{
                put("en", "//button[contains (text(), 'No')]");
                put("ar", "//button[contains (text(), 'لا')]");
            }});
            put("Payment_Success_Message", new HashMap<>() {{
                put("en", "//h4[contains (text(), 'Payment successfully')]");
                put("ar", "//h4[contains (text(), 'تم الدفع بنجاح')]");
            }});
            put("Loading_Icon_For_Housing", new HashMap<>() {{
                put("en", "//div[contains (@class,'spinner')]");
                put("ar", "//div[contains (@class,'spinner')]");
            }});
            put("Financing_Options_Text", new HashMap<>() {{
                put("en", "//h5[contains (text(), 'Financing options')]");
                put("ar", "//h5[contains (text(), 'خيارات التمويل')]");
            }});
            put("Cash_Option_Text", new HashMap<>() {{
                put("en", "//p[contains (text(), 'Cash purchase')]");
                put("ar", "//p[contains (text(), 'الشراء النقدي')]");
            }});
            put("Project_Name_Of_Booked_Unit", new HashMap<>() {{
                put("en", "//app-collapse-box/descendant::h5");
                put("ar", "//app-collapse-box/descendant::h5");
            }});

            put("Booked_Unit_Code", new HashMap<>() {{
                put("en", "//app-information-table/descendant::span[2]");
                put("ar", "//app-information-table/descendant::span[2]");
            }});
            put("My_Bookings_Page_Title", new HashMap<>() {{
                put("en", "//h2[contains (text(), 'My bookings')]");
                put("ar", "//h2[contains (text(), 'حجوزاتي')]");
            }});
            put("Booking_Fee_Status", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Booking fee status')]/parent::div/following-sibling::div/child::span");
                put("ar", "//span[contains (text(), 'حالة رسوم الحجز')]/parent::div/following-sibling::div/child::span");
            }});
            put("Sign_Contract_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Sign contract')]");
                put("ar", "(//span[contains (text(), 'توقيع العقد')])[2]");
            }});
            put("Sign_Sale_Contract_Page_Title", new HashMap<>() {{
                put("en", "//h4[contains (text(), 'Sales Contract')]");
                put("ar", "//h4[contains (text(), 'عقد البيع')]");
            }});
            put("Reject_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Reject')]");
                put("ar", "//button[contains (text(), 'رفض')]");
            }});
            put("Approve_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Approve')]");
                put("ar", "//button[contains (text(), 'اعتماد')]");
            }});
            put("Reject_Sign_Contract_Page_Title", new HashMap<>() {{
                put("en", "//h4[contains (text(), 'Reject sales contract')]");
                put("ar", "//h4[contains (text(), 'رفض العقد')]");
            }});
            put("Rejection_Reason_Input", new HashMap<>() {{
                put("en", "//textarea[@formcontrolname='reject_reason'] | //textarea[@formcontrolname='rejected_reason']");
                put("ar", "//textarea[@formcontrolname='reject_reason'] | //textarea[@formcontrolname='rejected_reason']");
            }});
            put("Cancelled_Link", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Cancelled')]");
                put("ar", "//span[contains (text(), 'ملغاة')]");
            }});
            put("Cancellation_Date", new HashMap<>() {{
                put("en", "(//span[contains (text(), 'Cancellation date')]/parent::div/following-sibling::div/child::span)[1]");
                put("ar", "(//span[contains (text(), 'تاريخ الإلغاء')]/parent::div/following-sibling::div/child::span)[1]");
            }});
            put("View_Sign_Contract_Button", new HashMap<>() {{
                put("en", "//div[contains (text(), 'Sales contract')]/parent::div/following-sibling::app-pdf-viewer");
                put("ar", "//div[contains (text(), 'عقد البيع')]/parent::div/following-sibling::app-pdf-viewer");
            }});
            put("Booking_Has_Been_Cancelled_Text_Message", new HashMap<>() {{
                put("en", "//span[contains (text(), 'This booking has been cancelled')]");
                put("ar", "//span[contains (text(), 'تم إلغاء هذا الحجز')]");
            }});
            put("Verify_OTP_Page_Title", new HashMap<>() {{
                put("en", "//h4[contains (text(), 'Verify OTP')]");
                put("ar", "//h4[contains (text(), 'رمز التحقق')]");
            }});
            put("Verify_OTP_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Verify')]");
                put("ar", "//button[contains (text(), 'تحقق')]");
            }});
            put("Sign_Sale_Contract_Success_Message", new HashMap<>() {{
                put("en", "//h4[contains (text(), 'Congratulations')]");
                put("ar", "//h4[contains (text(), 'تهانينا')]");
            }});
            put("Sale_Contract_Sign_Status", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Sales contract status')]/parent::div/following-sibling::div/child::span");
                put("ar", "//span[contains (text(), 'حالة عقد البيع')]/parent::div/following-sibling::div");
            }});
            put("View_Sale_Contract_Popup_Title", new HashMap<>() {{
                put("en", "//p[contains (text(), 'Sales contract')]");
                put("ar", "//p[contains (text(), 'عقد البيع')]");
            }});
            put("Check_Your_Financial_Recommendation_Link", new HashMap<>() {{
                put("en", "//h5[contains (text(), 'Check your financial recommendation')]");
                put("ar", "//h5[contains (text(), 'تحقق من توصيتك المالية')]");
            }});
            put("Load_More_Units_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Load more')]");
                put("ar", "//span[contains (text(), 'تحميل المزيد')]");
            }});
            put("Back_Arrow_Button", new HashMap<>() {{
                put("en", "//img[@src=\"assets/icons/back.svg\"]");
                put("ar", "//img[@src=\"assets/icons/back.svg\"]");
            }});
            put("Search_Project_Button", new HashMap<>() {{
                put("ar", "//span[contains(text(), 'بحث')]/parent::button");
                put("en", "//span[contains(text(), 'Search')]/parent::button");
            }});
            put("Searched_Project", new HashMap<>() {{
                put("ar", "//ngx-datatable//datatable-body//datatable-body-cell[1]");
                put("en", "//ngx-datatable//datatable-body//datatable-body-cell[1]");
            }});
            put("Projects_List", new HashMap<>() {{
                put("ar", "//datatable-body-row//datatable-body-cell[1]");
                put("en", "//datatable-body-row//datatable-body-cell[1]");
            }});
            put("Is_Publish_Unit_Model_Toggle", new HashMap<>() {{
                put("ar", "//mat-slide-toggle/descendant::button[@role='switch']");
                put("en", "//mat-slide-toggle/descendant::button[@role='switch']");
            }});
            put("Update_My_Information_Link", new HashMap<>() {{
                put("ar", "//span[contains (text(), 'تحديث معلوماتي')]");
                put("en", "//span[contains (text(), 'Update my information')]");
            }});
            put("Update_Financial_Information_Button", new HashMap<>() {{
                put("ar", "//button[contains (text(), 'تحديث معلوماتي المالية')]");
                put("en", "//button[contains (text(), 'Update my financial information')]");
            }});
            put("Confirm_Final_Purchasing_Power_Page_Title", new HashMap<>() {{
                put("ar", "//h3[contains (text(), 'صمم دعمك')]");
                put("en", "//h3[contains (text(), 'Please confirm the final purchasing power information')]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By SearchProjectButton() throws Exception {
        return By.xpath(get("Search_Project_Button"));
    }

    public static By SearchedProject() throws Exception {
        return By.xpath(get("Searched_Project"));
    }

    public static By ProjectsList() throws Exception {
        return By.xpath(get("Projects_List"));
    }

    public static By InventorySideMenuOption() throws Exception {
        return By.xpath(get("Inventory_Side_Menu_Option"));
    }

    public static By InternalInventoryIcon() throws Exception {
        return By.xpath(get("Internal_Inventory_Icon"));
    }

    public static By ProjectsSideMenuOption() throws Exception {
        return By.xpath(get("Projects_Side_Menu_Option"));
    }

    public static By ProjectsPageTitle() throws Exception {
        return By.xpath(get("Projects_Page_Title"));
    }

    public static By CreateNewProjectButton() throws Exception {
        return By.xpath(get("Create_New_Project_Button"));
    }

    public static By ProjectDetailsPageTitle() throws Exception {
        return By.xpath(get("Project_Details_Page_Title"));
    }

    public static By ProjectTitleInput() throws Exception {
        return By.xpath(get("Project_Title_Input"));
    }

    public static By SecondaryTitleInput() throws Exception {
        return By.xpath(get("Secondary_Title_Input"));
    }

    public static By InputFieldError() throws Exception {
        return By.xpath(get("Input_Field_Error"));
    }

    public static By ProjectTypeDropdown() throws Exception {
        return By.xpath(get("Project_Type_Dropdown"));
    }

    public static By ProjectTypeDropdownList() throws Exception {
        return By.xpath(get("Project_Type_Dropdown_List"));
    }

    public static By RegionDropdown() throws Exception {
        return By.xpath(get("Region_Dropdown"));
    }

    public static By CityNameInput() throws Exception {
        return By.xpath(get("City_Dropdown"));
    }

    public static By RegionDropdownList() throws Exception {
        return By.xpath(get("Region_Dropdown_List"));
    }

    public static By CityDropdownList() throws Exception {
        return By.xpath(get("City_Dropdown_List"));
    }

    public static By CityOption() throws Exception {
        return By.xpath(get("City_Option"));
    }

    public static By DeveloperNameInput() throws Exception {
        return By.xpath(get("Developer_Name_Input"));
    }

    public static By DeveloperOption() throws Exception {
        return By.xpath(get("Developer_Option"));
    }

    public static By SubsidizeDropdown() throws Exception {
        return By.xpath(get("Subsidize_Dropdown"));
    }

    public static By SubsidizeDropdownList() throws Exception {
        return By.xpath(get("Subsidize_Dropdown_List"));
    }

    public static By MegaProjectDropdown() throws Exception {
        return By.xpath(get("Mega_Project_Dropdown"));
    }

    public static By MegaProjectDropdownList() throws Exception {
        return By.xpath(get("Mega_Project_Dropdown_List"));
    }

    public static By StatusDropdown() throws Exception {
        return By.xpath(get("Status_Dropdown"));
    }

    public static By StatusDropdownList() throws Exception {
        return By.xpath(get("Status_Dropdown_List"));
    }

    public static By WafiExpiryDateInput() throws Exception {
        return By.xpath(get("Wafi_Expiry_Date_Input"));
    }

    public static By SubsidyAmountInput() throws Exception {
        return By.xpath(get("Subsidy_Amount_Input"));
    }

    public static By SubsidyTypeDropdown() throws Exception {
        return By.xpath(get("Subsidy_Type_Dropdown"));
    }

    public static By SubsidyTypeDropdownList() throws Exception {
        return By.xpath(get("Subsidy_Type_Dropdown_List"));
    }

    public static By ProjectAgreementDateCalender() throws Exception {
        return By.xpath(get("Project_Agreement_Date_Calender"));
    }

    public static By YearMonthDayList() throws Exception {
        return By.xpath(get("Year_Month_Day_List"));
    }

    public static By SelectYearDropdown() throws Exception {
        return By.xpath(get("Select_Year_Dropdown"));
    }

    public static By ProjectAgreementDateInput() throws Exception {
        return By.xpath(get("Project_Agreement_Date_Input"));
    }

    public static By ProjectLicenseNumberInput() throws Exception {
        return By.xpath(get("Project_License_Number_Input"));
    }

    public static By ProjectLicenseDateCalender() throws Exception {
        return By.xpath(get("Project_License_Date_Calender"));
    }

    public static By EscrowAccountInput() throws Exception {
        return By.xpath(get("Escrow_Account_Input"));
    }

    public static By BankNameDropdown() throws Exception {
        return By.xpath(get("Bank_Name_Dropdown"));
    }

    public static By BankNameDropdownList() throws Exception {
        return By.xpath(get("Bank_Name_Dropdown_List"));
    }

    public static By ProjectDeductPercentageInput() throws Exception {
        return By.xpath(get("Project_Deduct_Percentage_Input"));
    }

    public static By DeedCityInput() throws Exception {
        return By.xpath(get("Deed_City_Input"));
    }

    public static By LandDeliveryDateInput() throws Exception {
        return By.xpath(get("Land_Delivery_Date_Input"));
    }

    public static By IncentivizeProjectToggle() throws Exception {
        return By.xpath(get("Incentivize_Project_Toggle"));
    }

    public static By IncentivizeProjectToggleInput() throws Exception {
        return By.xpath(get("Incentivize_Project_Toggle_Input"));
    }

    public static By ShowMullakToggle() throws Exception {
        return By.xpath(get("Show_Mullak_Toggle"));
    }

    public static By ShowMullakToggleInput() throws Exception {
        return By.xpath(get("Show_Mullak_Toggle_Input"));
    }

    public static By ShowWafiLogoToggle() throws Exception {
        return By.xpath(get("Show_Wafi_Toggle"));
    }

    public static By ShowWafiLogoToggleInput() throws Exception {
        return By.xpath(get("Show_Wafi_Toggle_Input"));
    }

    public static By ShowCompletionToggle() throws Exception {
        return By.xpath(get("Show_Completion_Toggle"));
    }

    public static By ShowCompletionToggleInput() throws Exception {
        return By.xpath(get("Show_Completion_Toggle_Input"));
    }

    public static By AdditionalInfoTab() throws Exception {
        return By.xpath(get("Additional_Info_Tab"));
    }

    public static By CRMCodeInput() throws Exception {
        return By.xpath(get("CRM_Code_Input"));
    }

    public static By DeedNumberInput() throws Exception {
        return By.xpath(get("Deed_Number_Input"));
    }

    public static By DeedDateInput() throws Exception {
        return By.xpath(get("Deed_Date_Input"));
    }

    public static By PlanNumberInput() throws Exception {
        return By.xpath(get("Plan_Number_Input"));
    }

    public static By ProjectLicenseDateInput() throws Exception {
        return By.xpath(get("Project_License_Date_Input"));
    }

    public static By ConsultantDesignOfficeInput() throws Exception {
        return By.xpath(get("Consultant_Design_Office_Input"));
    }

    public static By ConsultantDesignOfficeLicenseNumInput() throws Exception {
        return By.xpath(get("Consultant_Design_Office_License_NumInput"));
    }

    public static By PropertyYearOfBuiltInput() throws Exception {
        return By.xpath(get("Property_Year_Of_Built_Input"));
    }

    public static By DeveloperWarrantyPeriodInput() throws Exception {
        return By.xpath(get("Developer_Warranty_Period_Input"));
    }

    public static By ConsultantConstructionOfficeInput() throws Exception {
        return By.xpath(get("Consultant_Construction_Office_Input"));
    }

    public static By ConsultantConstructionLicenseNumInput() throws Exception {
        return By.xpath(get("Consultant_Construction_License_Num_Input"));
    }

    public static By ProjectReadinessDateInput() throws Exception {
        return By.xpath(get("Project_Readiness_Date_Input"));
    }

    public static By DistrictNameInput() throws Exception {
        return By.xpath(get("District_Name_Input"));
    }

    public static By LatitudeInput() throws Exception {
        return By.xpath(get("Latitude_Input"));
    }

    public static By LongitudeInput() throws Exception {
        return By.xpath(get("Longitude_Input"));
    }

    public static By AcceptanceExpiryPeriodInput() throws Exception {
        return By.xpath(get("Acceptance_Expiry_Period_Input"));
    }

    public static By ProjectSettingTab() throws Exception {
        return By.xpath(get("Project_Setting_Tab"));
    }

    public static By InitialBookingExpiryInput() throws Exception {
        return By.xpath(get("Initial_Booking_Expiry_Input"));
    }

    public static By BuildingPermitPeriodInput() throws Exception {
        return By.xpath(get("Building_Permit_Period_Input"));
    }

    public static By UsingGeneralBookingFeeToggle() throws Exception {
        return By.xpath(get("Using_General_Booking_Fee_Toggle"));
    }

    public static By UsingGeneralBookingFeeToggleInput() throws Exception {
        return By.xpath(get("Using_General_Booking_Fee_Toggle_Input"));
    }

    public static By BookingFeeInput() throws Exception {
        return By.xpath(get("Booking_Fee_Input"));
    }

    public static By UsingGeneralExtendPriceQuotationToggle() throws Exception {
        return By.xpath(get("Using_General_Extend_Price_Quotation_Toggle"));
    }

    public static By UsingGeneralExtendPriceQuotationToggleInput() throws Exception {
        return By.xpath(get("Using_General_Extend_Price_Quotation_Toggle_Input"));
    }

    public static By ExtendPriceQuotationDayInput() throws Exception {
        return By.xpath(get("Extend_Price_Quotation_Day_Input"));
    }

    public static By ExtendPriceQuotationFeeInput() throws Exception {
        return By.xpath(get("Extend_Price_Quotation_Fee_Input"));
    }

    public static By ActivateMultipleUnitsBookingForNonBeneWebToggle() throws Exception {
        return By.xpath(get("Activate_Multiple_Units_Booking_For_Non_Bene_Web_Toggle"));
    }

    public static By ActivateMultipleUnitsBookingForNonBeneWebToggleInput() throws Exception {
        return By.xpath(get("Activate_Multiple_Units_Booking_For_Non_Bene_Web_Toggle_Input"));
    }

    public static By ActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggle() throws Exception {
        return By.xpath(get("Activate_Multiple_Units_Booking_For_Non_Bene_Sakani_Partner_Toggle"));

    }

    public static By ActivateMultipleUnitsBookingForNonBeneSakaniPartnerToggleInput() throws Exception {
        return By.xpath(get("Activate_Multiple_Units_Booking_For_Non_Bene_Sakani_Partner_Toggle_Input"));
    }

    public static By MaximumNumberOfBookingsForNonBeneInput() throws Exception {
        return By.xpath(get("Maximum_Number_Of_Bookings_For_Non_Bene_Input"));
    }

    public static By ActiveQueuingToggle() throws Exception {
        return By.xpath(get("Active_Queuing_Toggle"));
    }

    public static By ActiveQueuingToggleInput() throws Exception {
        return By.xpath(get("Active_Queuing_Toggle_Input"));
    }

    public static By MaximumNumberOfUserAbleToBook() throws Exception {
        return By.xpath(get("Maximum_Number_Of_User_Able_To_Book"));
    }

    public static By SaveButton() throws Exception {
        return By.xpath(get("Save_Button"));
    }

    public static By SystemPopupMessage() throws Exception {
        return By.xpath(get("System_Popup_Message"));
    }

    public static By ToastMessage() throws Exception {
        return By.xpath(get("Toast_Message"));
    }

    public static By UnitsTabLabel() throws Exception {
        return By.xpath(get("Units_Tab_Label"));
    }

    public static By UnitCodeLabel() throws Exception {
        return By.xpath(get("Unit_Code_Label"));
    }

    public static By NewImportUnitButton() throws Exception {
        return By.xpath(get("New_Import_Unit_Button"));
    }

    public static By UnitTypeDropdown() throws Exception {
        return By.xpath(get("Unit_Type_Dropdown"));
    }

    public static By UnitImportPageTitle() throws Exception {
        return By.xpath(get("Unit_Import_Page_Title"));
    }

    public static By UnitTypeDropdownList() throws Exception {
        return By.xpath(get("Unit_Type_Dropdown_List"));
    }

    public static By UploadUnitImportFile() throws Exception {
        return By.xpath(get("Upload_Unit_Import_File"));
    }

    public static By InvalidUnitImportFileErrorMessage() throws Exception {
        return By.xpath(get("Invalid_Unit_Import_File_Error"));
    }

    public static By AttachmentName(String fileName) throws Exception {
        return By.xpath(get("Attachment_Name").replace("replaceText", fileName));
    }

    public static By CommitButton() throws Exception {
        return By.xpath(get("Commit_Button"));
    }

    public static By UnitImportStatus() throws Exception {
        return By.xpath(get("Unit_Import_Status"));
    }

    public static By OkPopupButton() throws Exception {
        return By.xpath(get("Ok_Popup_Button"));
    }

    public static By BannerImageAttachment() throws Exception {
        return By.xpath(get("Banner_Image_Attachment"));
    }

    public static By BannerImageRemoveButton() throws Exception {
        return By.xpath(get("Banner_Image_Remove_Button"));
    }

    public static By MediaTabLabel() throws Exception {
        return By.xpath(get("Media_Tab_Label"));
    }

    public static By UploadArrowButton() throws Exception {
        return By.xpath(get("Upload_Arrow_Button"));
    }

    public static By MasterPlanAttachment() throws Exception {
        return By.xpath(get("Master_Plan_Attachment"));
    }

    public static By VideoMediaAttachment() throws Exception {
        return By.xpath(get("Video_Media_Attachment"));
    }

    public static By VideosLibraryAttachment() throws Exception {
        return By.xpath(get("Video_Library_Attachment"));
    }

    public static By PhotosLibraryAttachment() throws Exception {
        return By.xpath(get("Photo_Library_Attachment"));
    }

    public static By ImageGalleryAttachment() throws Exception {
        return By.xpath(get("Image_Gallery_Attachment"));
    }

    public static By SaveButtonForPhotoLibrary() throws Exception {
        return By.xpath(get("Save_Button_For_Photo_Library"));
    }

    public static By SaveButtonForVideoLibrary() throws Exception {
        return By.xpath(get("Save_Button_For_Video_Library"));
    }

    public static By BrochureMediaAttachment() throws Exception {
        return By.xpath(get("Brochure_Media_Attachment"));
    }

    public static By GeoMapAttachment() throws Exception {
        return By.xpath(get("Geo_Map_Attachment"));
    }

    public static By DisplayMethodDropdown() throws Exception {
        return By.xpath(get("Display_Method_Dropdown"));
    }

    public static By DisplayMethodDropdownList() throws Exception {
        return By.xpath(get("Display_Method_Dropdown_List"));
    }

    public static By TitleOfDetailPageInput() throws Exception {
        return By.xpath(get("Title_Of_Detail_Page_Input"));
    }

    public static By FirstUnitDeliveryDateInput() throws Exception {
        return By.xpath(get("First_Unit_Delivery_Date_Input"));
    }

    public static By ProjectDisplayNameInput() throws Exception {
        return By.xpath(get("Project_Display_Name_Input"));
    }

    public static By SummaryInput() throws Exception {
        return By.xpath(get("Summary_Input"));
    }

    public static By DescriptionInput() throws Exception {
        return By.xpath(get("Description_Input"));
    }

    public static By PricingStartingAtInput() throws Exception {
        return By.xpath(get("Pricing_Starting_At_Input"));
    }

    public static By PromotedToggle() throws Exception {
        return By.xpath(get("Promoted_Toggle"));
    }

    public static By PromotedToggleInput() throws Exception {
        return By.xpath(get("Promoted_Toggle_Input"));
    }

    public static By NearestAirportDistanceInput() throws Exception {
        return By.xpath(get("Nearest_Airport_Distance_Input"));
    }

    public static By NearestSchoolDistanceInput() throws Exception {
        return By.xpath(get("Nearest_School_Distance_Input"));
    }

    public static By TotalAreaInput() throws Exception {
        return By.xpath(get("Total_Area_Input"));
    }

    public static By MarketDayFlagToggle() throws Exception {
        return By.xpath(get("Market_Day_Flag_Toggle"));
    }

    public static By MarketDayFlagToggleInput() throws Exception {
        return By.xpath(get("Market_Day_Flag_Toggle_Input"));
    }

    public static By ProjectDetailsTab() throws Exception {
        return By.xpath(get("Project_Details_Tab"));
    }

    public static By MediaApprovalButton() throws Exception {
        return By.xpath(get("Media_Approval_Button"));
    }

    public static By RejectMediaButton() throws Exception {
        return By.xpath(get("Reject_Media_Button"));
    }

    public static By ApproveMediaButton() throws Exception {
        return By.xpath(get("Approve_Media_Button"));
    }

    public static By ProjectFinancialInstitutionTabLabel() throws Exception {
        return By.xpath(get("Project_Financial_Institution_Tab_Label"));
    }

    public static By SelectAllBanksCheckbox() throws Exception {
        return By.xpath(get("Select_All_Banks_Checkbox"));
    }

    public static By BookingDocumentTemplateTabLabel() throws Exception {
        return By.xpath(get("Booking_Document_Template_Tab_Label"));
    }

    public static By BookingDocumentTemplateInputAttachment() throws Exception {
        return By.xpath(get("Booking_Document_Template_Input_Attachment"));
    }

    public static By BookingTemplateTypeDropdown() throws Exception {
        return By.xpath(get("Booking_Template_Type_Dropdown"));
    }

    public static By BookingTemplateTypeDropdownList() throws Exception {
        return By.xpath(get("Booking_Template_Type_Dropdown_List"));
    }

    public static By UnitModelTabLabel() throws Exception {
        return By.xpath(get("Unit_Model_Tab_Label"));
    }

    public static By UnitModelName() throws Exception {
        return By.xpath(get("Unit_Model_Name"));
    }

    public static By SaveButtonAddUnitModel() throws Exception {
        return By.xpath(get("Save_Button_Add_Unit_Model"));
    }

    public static By MediaSectionLabelOnUnitModelPage() throws Exception {
        return By.xpath(get("Media_Section_Label_On_Unit_Model_Page"));
    }

    public static By UnitModelStatus() throws Exception {
        return By.xpath(get("Unit_Model_Status"));
    }

    public static By ProjectSalesContractTabLabel() throws Exception {
        return By.xpath(get("Project_Sales_Contract_Tab_Label"));
    }

    public static By SalesContractAttachment() throws Exception {
        return By.xpath(get("Sales_Contract_Attachment"));
    }

    public static By SaveButtonOnMediaPage() throws Exception {
        return By.xpath(get("Save_Button_On_Media_Page"));
    }

    public static By SaleContractApprovalErrorMessage() throws Exception {
        return By.xpath(get("Sale_Contract_Approval_Error_Message"));
    }

    public static By SaleContractApprovalRecordsTabLabel() throws Exception {
        return By.xpath(get("Sale_Contract_Approval_Records_TabLabel"));
    }

    public static By ViewButtonOnSaleContractApprovalPage() throws Exception {
        return By.xpath(get("View_Button_On_Sale_Contract_Approval_Page"));

    }

    public static By DocumentViewerPopup() throws Exception {
        return By.xpath(get("Document_Viewer_Popup"));
    }

    public static By DownloadButtonOnSaleContractApprovalPage() throws Exception {
        return By.xpath(get("Download_Button_On_Sale_Contract_Approval_Page"));
    }

    public static By ScrollArrowButtonEnd() throws Exception {
        return By.xpath(get("Arrow_Button_End"));
    }

    public static By BackButton() throws Exception {
        return By.xpath(get("Back_Button"));
    }

    public static By ScrollArrowButtonStart() throws Exception {
        return By.xpath(get("Arrow_Button_Start"));
    }

    public static By BookingDocumentTemplatePage() throws Exception {
        return By.xpath(get("Booking_Document_Template_Page"));
    }

    public static By LoadingIconForSaleContractAttachment() throws Exception {
        return By.xpath(get("Loading_Icon_For_Sale_Contract_Attachment"));
    }

    public static By SaleContractStatus() throws Exception {
        return By.xpath(get("Sale_Contract_Status"));
    }

    public static By LinkWithAzmToggle() throws Exception {
        return By.xpath(get("Link_With_Azm_Toggle"));
    }

    public static By IsPublishedToggle() throws Exception {
        return By.xpath(get("Is_Published_Toggle"));
    }

    public static By IsPublishedToggleInput() throws Exception {
        return By.xpath(get("Is_Published_Toggle_Input"));
    }

    public static By PublishedDate() throws Exception {
        return By.xpath(get("Published_Date"));
    }

    public static By UnitsListButton() throws Exception {
        return By.xpath(get("Units_List_Button"));
    }

    public static By ReadyToStartBookingLabel() throws Exception {
        return By.xpath(get("Ready_To_Start_Booking_Label"));
    }

    public static By YouHaveNoFinancialRecommendationsBanner() throws Exception {
        return By.xpath(get("You_Have_No_Financial_Recommendations_Banner"));
    }

    public static By FinancialAdvisoryButton() throws Exception {
        return By.xpath(get("Financial_Advisory_Button"));
    }

    public static By FinancialAdvisoryPageTitle() throws Exception {
        return By.xpath(get("Financial_Advisory_Page_Title"));
    }

    public static By StartServiceButton() throws Exception {
        return By.xpath(get("Start_Service_Button"));
    }

    public static By PurchasingPowerInfoPageTitle() throws Exception {
        return By.xpath(get("Purchasing_Power_Info_Page_Title"));
    }

    public static By EmploymentTypeDropdown() throws Exception {
        return By.xpath(get("Employment_Type_Dropdown"));
    }

    public static By EmploymentTypeDropdownList() throws Exception {
        return By.xpath(get("Employment_Type_Dropdown_List"));
    }

    public static By TypeOfSalaryBankDropdown() throws Exception {
        return By.xpath(get("Type_Of_Salary_Bank_Dropdown"));
    }

    public static By TypeOfSalaryBankDropdownList() throws Exception {
        return By.xpath(get("Type_Of_Salary_Bank_Dropdown_List"));
    }

    public static By BasicSalaryInput() throws Exception {
        return By.xpath(get("Basic_Salary_Input"));
    }

    public static By HousingAllowanceInput() throws Exception {
        return By.xpath(get("Housing_Allowance_Input"));
    }

    public static By OtherAllowanceInput() throws Exception {
        return By.xpath(get("Other_Allowance_Input"));
    }

    public static By FinancialSavingInput() throws Exception {
        return By.xpath(get("Financial_Saving_Input"));
    }

    public static By DownPaymentInput() throws Exception {
        return By.xpath(get("Down_Payment_Input"));
    }

    public static By MonthlyCommitmentInput() throws Exception {
        return By.xpath(get("Monthly_Commitment_Input"));
    }

    public static By DurationOfCommitmentInput() throws Exception {
        return By.xpath(get("Duration_Of_Commitment_Input"));
    }

    public static By InputFieldErrorHousing() throws Exception {
        return By.xpath(get("Input_Field_Error_Housing"));
    }

    public static By ProductType(String type) throws Exception {
        return By.xpath(get("Product_Type").replaceAll("replaceText", type));
    }

    public static By AvailableSubsidyHeading() throws Exception {
        return By.xpath(get("Available_Subsidy_Heading"));
    }

    public static By ActiveProductType() throws Exception {
        return By.xpath(get("Active_Product_Type"));
    }

    public static By DisclaimerCheckbox() throws Exception {
        return By.xpath(get("Disclaimer_Checkbox"));
    }

    public static By SubmitButton() throws Exception {
        return By.xpath(get("Submit_Button"));
    }

    public static By AdvisorySuccessMessage() throws Exception {
        return By.xpath(get("Advisory_Success_Message"));
    }

    public static By StartBookingButton() throws Exception {
        return By.xpath(get("Start_Booking_Button"));
    }

    public static By AvailableUnitsLabel() throws Exception {
        return By.xpath(get("Available_Units_Label"));
    }

    public static By UnitForBooking(String type) throws Exception {
        return By.xpath(get("Unit_For_Booking").replaceAll("replaceText", type));
    }

    public static By UnitDetailsPageText() throws Exception {
        return By.xpath(get("Unit_Details_Page_Text"));
    }

    public static By BookUnitButton() throws Exception {
        return By.xpath(get("Book_Unit_Button"));
    }

    public static By UnitBookingDisclaimerPageTitle() throws Exception {
        return By.xpath(get("Unit_Booking_Disclaimer_Page_Title"));
    }

    public static By ExistingBookingBanner() throws Exception {
        return By.xpath(get("Existing_Booking_Banner"));
    }

    public static By CancelButtonOnPopup() throws Exception {
        return By.xpath(get("Cancel_Button_On_Popup"));
    }

    public static By ContinueButton() throws Exception {
        return By.xpath(get("Continue_Button"));
    }

    public static By UnitBookingDisclaimerPageError() throws Exception {
        return By.xpath(get("Unit_Booking_Disclaimer_PageError"));
    }

    public static By FinancialRecommendationCertificatePageTitle() throws Exception {
        return By.xpath(get("Financial_Recommendation_Certificate_Page_Title"));
    }

    public static By BookingSummaryPageTitle() throws Exception {
        return By.xpath(get("Booking_Summary_Page_Title"));
    }

    public static By PayBookingFeeButton() throws Exception {
        return By.xpath(get("Pay_Booking_Fee_Button"));
    }

    public static By MadaButton() throws Exception {
        return By.xpath(get("Mada_Button"));
    }

    public static By cardNumberInput() throws Exception {
        return By.xpath(get("Card_Number_Input"));
    }

    public static By CancelBookingButton() throws Exception {
        return By.xpath(get("cancel_Booking_Button"));
    }

    public static By CancelReason() throws Exception {
        return By.xpath(get("Cancel_Reason"));
    }

    public static By YesButtonPopup() throws Exception {
        return By.xpath(get("Yes_Button_Popup"));
    }

    public static By PaymentSuccessMessage() throws Exception {
        return By.xpath(get("Payment_Success_Message"));
    }

    public static By LoadingIconForHousing() throws Exception {
        return By.xpath(get("Loading_Icon_For_Housing"));
    }

    public static By FinancingOptionsText() throws Exception {
        return By.xpath(get("Financing_Options_Text"));
    }

    public static By CashPurchaseOptionText() throws Exception {
        return By.xpath(get("Cash_Option_Text"));
    }

    public static By ProjectNameOfBookedUnit() throws Exception {
        return By.xpath(get("Project_Name_Of_Booked_Unit"));
    }

    public static By BookedUnitCode() throws Exception {
        return By.xpath(get("Booked_Unit_Code"));
    }

    public static By MyBookingsPageTitle() throws Exception {
        return By.xpath(get("My_Bookings_Page_Title"));
    }

    public static By BookingFeeStatus() throws Exception {
        return By.xpath(get("Booking_Fee_Status"));
    }

    public static By SignContractButton() throws Exception {
        return By.xpath(get("Sign_Contract_Button"));
    }

    public static By SignSaleContractPageTitle() throws Exception {
        return By.xpath(get("Sign_Sale_Contract_Page_Title"));
    }

    public static By RejectButtonForSignSaleContract() throws Exception {
        return By.xpath(get("Reject_Button"));
    }

    public static By ApproveButtonForSignSaleContract() throws Exception {
        return By.xpath(get("Approve_Button"));
    }

    public static By NoButtonOnPopup() throws Exception {
        return By.xpath(get("No_Button_Popup"));
    }

    public static By RejectSignContractPageTitle() throws Exception {
        return By.xpath(get("Reject_Sign_Contract_Page_Title"));
    }

    public static By RejectionReasonInput() throws Exception {
        return By.xpath(get("Rejection_Reason_Input"));
    }

    public static By CancelledLink() throws Exception {
        return By.xpath(get("Cancelled_Link"));
    }   public static By DescriptionsInput() throws Exception {
        return By.xpath(get("Descriptions_Input"));
    }

    public static By CancellationDate() throws Exception {
        return By.xpath(get("Cancellation_Date"));
    }

    public static By ViewSignContractButton() throws Exception {
        return By.xpath(get("View_Sign_Contract_Button"));
    }

    public static By BookingHasBeenCancelledTextMessage() throws Exception {
        return By.xpath(get("Booking_Has_Been_Cancelled_Text_Message"));
    }

    public static By VerifyOTPPageTitle() throws Exception {
        return By.xpath(get("Verify_OTP_Page_Title"));
    }

    public static By VerifyOTPButton() throws Exception {
        return By.xpath(get("Verify_OTP_Button"));
    }

    public static By SignSaleContractSuccessMessage() throws Exception {
        return By.xpath(get("Sign_Sale_Contract_Success_Message"));
    }

    public static By SaleContractSignStatus() throws Exception {
        return By.xpath(get("Sale_Contract_Sign_Status"));
    }

    public static By ViewSaleContractPopupTitle() throws Exception {
        return By.xpath(get("View_Sale_Contract_Popup_Title"));
    }

    public static By CheckYourFinancialRecommendationLink() throws Exception {
        return By.xpath(get("Check_Your_Financial_Recommendation_Link"));
    }

    public static By LoadMoreUnitsButton() throws Exception {
        return By.xpath(get("Load_More_Units_Button"));
    }

    public static By BackArrowButton() throws Exception {
        return By.xpath(get("Back_Arrow_Button"));
    }

    public static By IsPublishUnitModelToggle() throws Exception {
        return By.xpath(get("Is_Publish_Unit_Model_Toggle"));
    }

    public static By UpdateMyInformationLink() throws Exception {
        return By.xpath(get("Update_My_Information_Link"));

    }

    public static By UpdateFinancialInformationButton() throws Exception {
        return By.xpath(get("Update_Financial_Information_Button"));
    }

    public static By ConfirmFinalPurchasingPowerPageTitle() throws Exception {
        return By.xpath(get("Confirm_Final_Purchasing_Power_Page_Title"));
    }

    public static By ErrorMessageMediaPage() throws Exception {
        return By.xpath(("(//mat-error[contains (@id, 'error')])[2]"));
    }
}
