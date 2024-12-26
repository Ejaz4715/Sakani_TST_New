package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class SalesContractPageObject {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Projects_Menu_Option", new HashMap<>() {{
                put("en", "//a[contains (text() , 'Projects')]");
                put("ar", "//a[contains (text() , 'المشاريع')]");
            }});
            put("Projects_Page_Heading", new HashMap<>() {{
                put("en", "//h3[contains (text(), 'Projects')]");
                put("ar", "//h3[contains (text(), 'مشاريع')]");
            }});
            put("Search_By_Dropdown", new HashMap<>() {{
                put("en", "//label[contains (text(), 'Search by')]/ancestor::app-sapa-dropdown/descendant::div[@role='combobox']");
                put("ar", " //label[contains (text(), 'بحث بواسطة')]/ancestor::app-sapa-dropdown/descendant::ng-select");
            }});
            put("Search_By_Dropdown_List", new HashMap<>() {{
                put("en", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']");
                put("ar", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']");
            }});
            put("Project_Name_Dropdown_Input", new HashMap<>() {{
                put("en", "//label[contains (text(), 'Project name')]/ancestor::app-sapa-dropdown/descendant::div[@role='combobox']/child::input");
                put("ar", "//label[contains (text(), 'اسم المشروع')]/ancestor::app-sapa-dropdown/descendant::div[@role='combobox']/child::input");
            }});
            put("Project_Name_Dropdown_List", new HashMap<>() {{
                put("en", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']");
                put("ar", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']");
            }});
            put("Search_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Search')]");
                put("ar", "//button[contains (text(), 'بحث')]");
            }});
            put("Searched_Project", new HashMap<>() {{
                put("en", "//datatable-body/descendant::datatable-body-row/descendant::datatable-body-cell[2]");
                put("ar", "//datatable-body/descendant::datatable-body-row/descendant::datatable-body-cell[2]");
            }});
            put("Project_Details_Button", new HashMap<>() {{
                put("en", "//datatable-body/descendant::datatable-body-row/descendant::datatable-body-cell[6]/descendant::span");
                put("ar", "//datatable-body/descendant::datatable-body-row/descendant::datatable-body-cell[6]/descendant::span");
            }});
            put("Project_Details_Page_Title", new HashMap<>() {{
                put("en", "//a[contains (text(), 'Project details')]");
                put("ar", "//a[contains (text(), 'تفاصيل المشروع')]");
            }});
            put("Project_Type_Input", new HashMap<>() {{
                put("en", "//label[contains (text(), 'Project type')]/parent::app-sapa-data-box/descendant::input");
                put("ar", "//label[contains (text(), 'نوع المشروع')]/parent::app-sapa-data-box/descendant::input");
            }});
            put("Project_Units_Tab", new HashMap<>() {{
                put("en", "//a[contains (text(), 'Project units')]");
                put("ar", "//a[contains (text(), 'تفاصيل الوحدات')]");
            }});
            put("Sale_Contract_Tab", new HashMap<>() {{
                put("en", "//a[contains (text(), 'Sale contracts')]");
                put("ar", "//a[contains (text(), 'عقود البيع')]");
            }});
            put("Unit_List_Text", new HashMap<>() {{
                put("en", "//span[contains (text(),'Unit list')]");
                put("ar", "//span[contains (text(),'قائمة الوحدات')]");
            }});
            put("Sale_Contracts_History_Text", new HashMap<>() {{
                put("en", "//span[contains (text(),'Sales contracts history')]");
                put("ar", "//span[contains (text(),'تاريخ عقود البيع')]");
            }});
            put("View_And_Approve_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'View & approve')]");
                put("ar", "//button[contains (text(), 'عرض و اعتماد')]");
            }});
            put("Sale_Contract_Text_On_Approve_Popup", new HashMap<>() {{
                put("en", "//p[contains (text(),'Sales contract')]");
                put("ar", "//p[contains (text(),'عقد البيع')]");
            }});
            put("Approve_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Approve')]");
                put("ar", "//button[contains (text(), 'يعتمد')]");
            }});
            put("OTP_Verification_Popup", new HashMap<>() {{
                put("en", "//p[contains (text(), 'OTP verification')]");
                put("ar", "//p[contains (text(), 'التحقق من رمز التحقق')]");
            }});
            put("Language_Text", new HashMap<>() {{
                put("en", "//button[@title='Change language']/child::span[2]");
                put("ar", "//button[@title='Change language']/child::span[2]");
            }});
            put("Language_Button", new HashMap<>() {{
                put("en", "//button[@title='Change language']");
                put("ar", "//button[@title='Change language']");
            }});
            put("Verify_Code_Button", new HashMap<>() {{
                put("en", "//span[contains(text(),'Verify code')]/parent::button");
                put("ar", "//span[contains(text(),'التحقق من الرمز')]/parent::button");
            }});
            put("OTP", new HashMap<>() {{
                put("ar", "//app-sapa-otp-verification/descendant::input[@type='number']");
                put("en", "//app-sapa-otp-verification/descendant::input[@type='number']");
            }});
            put("Sales_Contract_Details", new HashMap<>() {{
                put("ar", "//span[contains (text(), '#')]/ancestor::ngx-datatable/descendant::datatable-body-cell");
                put("en", "//span[contains (text(), '#')]/ancestor::ngx-datatable/descendant::datatable-body-cell");
            }});
            put("Sale_Contract_File_Name_Column", new HashMap<>() {{
                put("ar", "//span[contains (text(), '#')]/ancestor::ngx-datatable/descendant::datatable-body-cell[5]");
                put("en", "//span[contains (text(), '#')]/ancestor::ngx-datatable/descendant::datatable-body-cell[5]");
            }});
            put("Sale_Contract_Download_Button", new HashMap<>() {{
                put("ar", "//span[contains (text(), '#')]/ancestor::ngx-datatable/descendant::datatable-body-cell[6]/descendant::a");
                put("en", "//span[contains (text(), '#')]/ancestor::ngx-datatable/descendant::datatable-body-cell[6]/descendant::a");
            }});
            put("Unit_Code_Input", new HashMap<>() {{
                put("ar", "//label[contains (text(), 'رمز الوحدة')]/ancestor::app-sapa-input-with-icon/descendant::input");
                put("en", "//label[contains (text(), 'Unit code')]/ancestor::app-sapa-input-with-icon/descendant::input");
            }});
            put("Unit_Code_Cell", new HashMap<>() {{
                put("ar", "(//datatable-body//datatable-body-cell/child::div)[1]");
                put("en", "(//datatable-body//datatable-body-cell/child::div)[1]");
            }});
            put("Unit_Booking_Status_Cell", new HashMap<>() {{
                put("ar", "(//datatable-body//datatable-body-cell/child::div)[6]");
                put("en", "(//datatable-body//datatable-body-cell/child::div)[6]");
            }});
            put("Add_Annex_Button", new HashMap<>() {{
                put("ar", "//button[contains (text(), 'إضافة ملحق')]");
                put("en", "//button[contains (text(), 'Add annex')]");
            }});
            put("Annex_Page_Text", new HashMap<>() {{
                put("ar", "//span[contains (text(), 'Annex')]");
                put("en", "//span[contains (text(), 'Annex')]");
            }});
            put("Unit_Selection_Checkbox", new HashMap<>() {{
                put("ar", "//datatable-body/descendant::datatable-body-row/descendant::datatable-body-cell[1]");
                put("en", "//datatable-body/descendant::datatable-body-row/descendant::datatable-body-cell[1]");
            }});
            put("Add_Annex_To_Selected_Unit_Button", new HashMap<>() {{
                put("ar", "//button[contains (text(), 'إضافة ملحق للوحدات المختارة')]");
                put("en", "//button[contains (text(), 'Add annex to selected units')]");
            }});
            put("Add_Annex_Popup_Title", new HashMap<>() {{
                put("ar", "//p[contains (text(), 'اضافة الملحق')]");
                put("en", "//p[contains (text(), 'Add annex')]");
            }});
            put("Add_Annex_Attachment_Text", new HashMap<>() {{
                put("ar", "//p[contains (text(), 'تحميل الملف المرفق')]");
                put("en", "//p[contains (text(), 'Kindly upload the annex file')]");
            }});
            put("Annex_File_Upload", new HashMap<>() {{
                put("ar", "//input[@type='file']");
                put("en", "//input[@type='file']");
            }});
            put("Error_Icon_Of_Attachment", new HashMap<>() {{
                put("ar", "//app-icon-error");
                put("en", "//app-icon-error");
            }});
            put("Uploaded_File_Name", new HashMap<>() {{
                put("ar", "//span[contains (text(), 'replaceText')]");
                put("en", "//span[contains (text(), 'replaceText')]");
            }});
            put("Download_Annex_File_Arrow", new HashMap<>() {{
                put("ar", "//a[contains (@class, 'download')]");
                put("en", "//a[contains (@class, 'download')]");
            }});
            put("Upload_Annex_File_Button", new HashMap<>() {{
                put("ar", "//button[contains (text(), 'رفع')]");
                put("en", "//button[contains (text(), 'Upload')]");
            }});
            put("Error_Message_For_Annex_File_Upload", new HashMap<>() {{
                put("ar", "//app-sapa-direct-upload[@formcontrolname='annex']/following-sibling::label");
                put("en", "//app-sapa-direct-upload[@formcontrolname='annex']/following-sibling::label");
            }});
            put("Approve_Annex_Popup", new HashMap<>() {{
                put("ar", "//p[contains (text(), 'الموافقة على الملحق')]");
                put("en", "//p[contains (text(), 'Approve Annex')]");
            }});
            put("X_Button_On_OTP_Popup", new HashMap<>() {{
                put("ar", "//button[@aria-label='Close']");
                put("en", "//button[@aria-label='Close']");
            }});
            put("OTP_Error_Message", new HashMap<>() {{
                put("ar", "//app-sapa-otp-verification/descendant::label[contains (@class , 'invalid')]");
                put("en", "//app-sapa-otp-verification/descendant::label[contains (@class , 'invalid')]");
            }});
            put("Annex_Document_Name", new HashMap<>() {{
                put("ar", "//datatable-body//datatable-body-row//datatable-body-cell//descendant::span[2]");
                put("en", "//datatable-body//datatable-body-row//datatable-body-cell//descendant::span[2]");
            }});
            put("Annex_Date_Cell_Value", new HashMap<>() {{
                put("ar", "((//datatable-body//datatable-body-row)[last()]//datatable-body-cell//descendant::div[2])[2]");
                put("en", "((//datatable-body//datatable-body-row)[last()]//datatable-body-cell//descendant::div[2])[2]");
            }});
            put("Show_Unit_List_Button", new HashMap<>() {{
                put("ar", "(//datatable-body//datatable-body-row//datatable-body-cell//descendant::button)[last()]");
                put("en", "(//datatable-body//datatable-body-row//datatable-body-cell//descendant::button)[last()]");
            }});
            put("Sent_Annex_Tab", new HashMap<>() {{
                put("ar", "//a[contains (text(), 'المرفقات المرسلة')]");
                put("en", "//a[contains (text(), 'Sent Annexes')]");
            }});
            put("Sent_Annex_Units_List", new HashMap<>() {{
                put("ar", "//span[contains (text(), 'قائمة الوحدات')]");
                put("en", "//span[contains (text(), 'Unit list')]");
            }});
            put("Sent_Annex_Approve_Status", new HashMap<>() {{
                put("ar", "//datatable-body//datatable-body-row//datatable-body-cell[6]/descendant::div[2]");
                put("en", "//datatable-body//datatable-body-row//datatable-body-cell[6]/descendant::div[2]");
            }});
            put("Unit_Code_Of_Booked_Unit", new HashMap<>() {{
                put("en", "(//span[contains (text(), 'Unit code')]/parent::div/following-sibling::div/child::span)[1]");
                put("ar", "(//span[contains (text(), 'رمز الوحدة')]/parent::div/following-sibling::div/child::span)[1]");
            }});
            put("Purchasing_Power_Text", new HashMap<>() {{
                put("ar", "//h4[contains (text(), 'صمم دعمك')]");
                put("en", "//h4[contains (text(), 'Purchasing power')]");
            }});
            put("Sign_Annex_Heading", new HashMap<>() {{
                put("ar", "//h6[contains (text(), 'توقيع الملحق')]");
                put("en", "//h6[contains (text(), 'Sign annex')]");
            }});
            put("Sign_Annex_Page_Heading", new HashMap<>() {{
                put("ar", "//h4[contains (text(), 'ملحق عقد البيع')]");
                put("en", "//h4[contains (text(), 'Sales contract annex')]");
            }});
            put("Reject_Annex_Page_Title", new HashMap<>() {{
                put("ar", "//h4[contains (text(), 'رفض المرفق')]");
                put("en", "//h4[contains (text(), 'Reject annex')]");
            }});
            put("Add_Annex_Success_Message", new HashMap<>() {{
                put("ar", "//button[contains (text(), 'مراجعة الملحق المضافة')]/parent::div/preceding-sibling::div[1]/child::div");
                put("en", "//button[contains (text(), 'Review added annex')]/parent::div/preceding-sibling::div[1]/child::div");
            }});
            put("View_Annex_Link", new HashMap<>() {{
                put("ar", "(//div[contains (text(), 'الملحق')]/parent::div/parent::div/descendant::app-pdf-viewer/descendant::span)[last()]");
                put("en", "(//div[contains (text(), 'Annex')]/parent::div/parent::div/descendant::app-pdf-viewer/descendant::span)[last()]");
            }});
            put("View_Annex_Popup_Title", new HashMap<>() {{
                put("ar", "//p[contains (text(), 'الملحق')]");
                put("en", "//p[contains (text(), 'Annex')]");
            }});
            put("Updates-Pop-Up", new HashMap<>() {{
                put("ar", "//button[contains (text(), 'إلغاء')]");
                put("en", "//button[contains (text(), 'Cancel')]");
            }});
            put("sakani-logo", new HashMap<>() {{
                put("ar", "//img[@alt='logo']");
                put("en", "//img[@alt='logo'");
            }});
            put("Warning-Pop-Up", new HashMap<>() {{
                put("ar", "//button[@title='Close']");
                put("en", "//button[@title='Close']");
            }});
            put("Accept-Button", new HashMap<>() {{
                put("ar", "//button[contains (text(), 'قبول')]");
                put("en", "//button[contains (text(), 'Accept')]");
            }});
            put("Role-Dropdown", new HashMap<>() {{
                put("ar", "//div[@class='dropdown-container pointer']/descendant::div[@class='ng-value-container']");
                put("en", "//div[@class='dropdown-container pointer']/descendant::div[@class='ng-value-container']");
            }});
            put("Role-Dropdown-Options", new HashMap<>() {{
                put("ar", "//div[@role='option']");
                put("en", "//div[@role='option']");
            }});
            put("Sign_Contract_Success_Message", new HashMap<>() {{
                put("ar", "//app-sapa-modal/descendant::div[contains (text(), 'عقد')]");
                put("en", "//app-sapa-modal/descendant::div[contains (text(), 'contract')]");
            }});
            put("Loading_Icon_Partners", new HashMap<>() {{
                put("ar", "//app-sapa-loading-dot-pusle");
                put("en", "//app-sapa-loading-dot-pusle");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By RoleDropdown() throws Exception {
        return By.xpath(get("Role-Dropdown"));
    }

    public static By RoleDropdownOptions() throws Exception {
        return By.xpath(get("Role-Dropdown-Options"));
    }

    public static By AcceptButton() throws Exception {
        return By.xpath(get("Accept-Button"));
    }

    public static By WarningPopUp() throws Exception {
        return By.xpath(get("Warning-Pop-Up"));
    }

    public static By SakaniLogo() throws Exception {
        return By.xpath(get("sakani-logo"));
    }

    public static By UpdatesPopUp() throws Exception {
        return By.xpath(get("Updates-Pop-Up"));
    }

    public static By ProjectsMenuOption() throws Exception {
        return By.xpath(get("Projects_Menu_Option"));
    }

    public static By ProjectsPageHeading() throws Exception {
        return By.xpath(get("Projects_Page_Heading"));
    }

    public static By SearchByDropdown() throws Exception {
        return By.xpath(get("Search_By_Dropdown"));
    }

    public static By SearchByDropdownList() throws Exception {
        return By.xpath(get("Search_By_Dropdown_List"));
    }

    public static By ProjectNameDropdownInput() throws Exception {
        return By.xpath(get("Project_Name_Dropdown_Input"));
    }

    public static By ProjectNameDropdownList() throws Exception {
        return By.xpath(get("Project_Name_Dropdown_List"));
    }

    public static By SearchButton() throws Exception {
        return By.xpath(get("Search_Button"));
    }

    public static By SearchedProject() throws Exception {
        return By.xpath(get("Searched_Project"));
    }

    public static By ProjectDetailsButton() throws Exception {
        return By.xpath(get("Project_Details_Button"));
    }

    public static By ProjectDetailsPageTitle() throws Exception {
        return By.xpath(get("Project_Details_Page_Title"));
    }

    public static By ProjectTypeInput() throws Exception {
        return By.xpath(get("Project_Type_Input"));
    }

    public static By ProjectUnitsTab() throws Exception {
        return By.xpath(get("Project_Units_Tab"));

    }

    public static By SaleContractTab() throws Exception {
        return By.xpath(get("Sale_Contract_Tab"));
    }

    public static By UnitListText() throws Exception {
        return By.xpath(get("Unit_List_Text"));
    }

    public static By SaleContractsHistoryText() throws Exception {
        return By.xpath(get("Sale_Contracts_History_Text"));
    }

    public static By ViewAndApproveButton() throws Exception {
        return By.xpath(get("View_And_Approve_Button"));
    }

    public static By SaleContractTextOnApprovePopup() throws Exception {
        return By.xpath(get("Sale_Contract_Text_On_Approve_Popup"));
    }

    public static By ApproveButton() throws Exception {
        return By.xpath(get("Approve_Button"));
    }

    public static By OTPVerificationPopup() throws Exception {
        return By.xpath(get("OTP_Verification_Popup"));
    }

    public static By LanguageText() throws Exception {
        return By.xpath(get("Language_Text"));
    }

    public static By LanguageButton() throws Exception {
        return By.xpath(get("Language_Button"));
    }

    public static By VerifyCodeButton() throws Exception {
        return By.xpath(get("Verify_Code_Button"));
    }

    public static By OTP() throws Exception {
        return By.xpath(get("OTP"));
    }

    public static By SalesContractDetails() throws Exception {
        return By.xpath(get("Sales_Contract_Details"));
    }

    public static By SaleContractFileNameColumn() throws Exception {
        return By.xpath(get("Sale_Contract_File_Name_Column"));
    }

    public static By SaleContractDownloadButton() throws Exception {
        return By.xpath(get("Sale_Contract_Download_Button"));
    }

    public static By UnitCodeInput() throws Exception {
        return By.xpath(get("Unit_Code_Input"));
    }

    public static By UnitCodeCell() throws Exception {
        return By.xpath(get("Unit_Code_Cell"));
    }

    public static By UnitBookingStatusCell() throws Exception {
        return By.xpath(get("Unit_Booking_Status_Cell"));
    }

    public static By AddAnnexButton() throws Exception {
        return By.xpath(get("Add_Annex_Button"));
    }

    public static By AnnexPageText() throws Exception {
        return By.xpath(get("Annex_Page_Text"));
    }

    public static By UnitSelectionCheckbox() throws Exception {
        return By.xpath(get("Unit_Selection_Checkbox"));
    }

    public static By AddAnnexToSelectedUnitButton() throws Exception {
        return By.xpath(get("Add_Annex_To_Selected_Unit_Button"));
    }

    public static By AddAnnexPopupTitle() throws Exception {
        return By.xpath(get("Add_Annex_Popup_Title"));
    }

    public static By AddAnnexAttachmentText() throws Exception {
        return By.xpath(get("Add_Annex_Attachment_Text"));
    }

    public static By AnnexFileUpload() throws Exception {
        return By.xpath(get("Annex_File_Upload"));
    }

    public static By ErrorIconOfAttachment() throws Exception {
        return By.xpath(get("Error_Icon_Of_Attachment"));
    }

    public static By UploadedFileName(String fileName) throws Exception {
        return By.xpath(get("Uploaded_File_Name").replace("replaceText", fileName));
    }

    public static By DownloadAnnexFileArrow() throws Exception {
        return By.xpath(get("Download_Annex_File_Arrow"));
    }

    public static By UploadAnnexFileButton() throws Exception {
        return By.xpath(get("Upload_Annex_File_Button"));
    }

    public static By ErrorMessageForAnnexFileUpload() throws Exception {
        return By.xpath(get("Error_Message_For_Annex_File_Upload"));
    }

    public static By ApproveAnnexPopup() throws Exception {
        return By.xpath(get("Approve_Annex_Popup"));
    }

    public static By XButtonOnOTPPopup() throws Exception {
        return By.xpath(get("X_Button_On_OTP_Popup"));
    }

    public static By OTPErrorMessage() throws Exception {
        return By.xpath(get("OTP_Error_Message"));
    }

    public static By AnnexDocumentCellValue() throws Exception {
        return By.xpath(get("Annex_Document_Name"));
    }

    public static By AnnexDateCellValue() throws Exception {
        return By.xpath(get("Annex_Date_Cell_Value"));
    }

    public static By ShowUnitListButton() throws Exception {
        return By.xpath(get("Show_Unit_List_Button"));
    }

    public static By SentAnnexTab() throws Exception {
        return By.xpath(get("Sent_Annex_Tab"));
    }

    public static By SentAnnexUnitsList() throws Exception {
        return By.xpath(get("Sent_Annex_Units_List"));
    }

    public static By SentAnnexApproveStatus() throws Exception {
        return By.xpath(get("Sent_Annex_Approve_Status"));
    }

    public static By UnitCodeOfBookedUnit() throws Exception {
        return By.xpath(get("Unit_Code_Of_Booked_Unit"));
    }

    public static By PurchasingPowerText() throws Exception {
        return By.xpath(get("Purchasing_Power_Text"));
    }

    public static By SignAnnexLink() throws Exception {
        return By.xpath(get("Sign_Annex_Heading"));
    }

    public static By SignAnnexPageHeading() throws Exception {
        return By.xpath(get("Sign_Annex_Page_Heading"));
    }

    public static By RejectAnnexPageTitle() throws Exception {
        return By.xpath(get("Reject_Annex_Page_Title"));
    }

    public static By AddAnnexSuccessMessage() throws Exception {
        return By.xpath(get("Add_Annex_Success_Message"));
    }

    public static By ViewAnnexLink() throws Exception {
        return By.xpath(get("View_Annex_Link"));
    }

    public static By ViewAnnexPopupTitle() throws Exception {
        return By.xpath(get("View_Annex_Popup_Title"));
    }

    public static By SignContractSuccessMessage() throws Exception {
        return By.xpath(get("Sign_Contract_Success_Message"));
    }

    public static By LoadingIconPartners() throws Exception {
        return By.xpath(get("Loading_Icon_Partners"));
    }
}
