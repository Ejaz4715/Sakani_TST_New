package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class ObjectionPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Appeal_Button", new HashMap<>() {{
                put("en", "//button[normalize-space()='Appeal']");
                put("ar", "//button[normalize-space()='تقديم اعتراض']");
            }});
            put("Request_Appeal_Button", new HashMap<>() {{
                put("en", "//app-appeal-alert[@clickurl='/appeal-submission']");
                put("ar", "//app-appeal-alert[@clickurl='/appeal-submission']");
            }});
            put("Appeal_Submission_Page", new HashMap<>() {{
                put("en", "//app-appeal-submission");
                put("ar", "//app-appeal-submission");
            }});
            put("Continue_Button", new HashMap<>() {{
                put("en", "//button[normalize-space()='Continue']");
                put("ar", "//button[normalize-space()='المتابعة']");
            }});
            put("Justification_Dropdown_List", new HashMap<>() {{
                put("en", "//app-dropdown[@formcontrolname='justification_code']/descendant::ng-select/div");
                put("ar", "//app-dropdown[@formcontrolname='justification_code']/descendant::ng-select/div");
            }});
            put("Comments_Textarea", new HashMap<>() {{
                put("en", "//textarea[@formcontrolname='appeal_explanation']");
                put("ar", "//textarea[@formcontrolname='appeal_explanation']");
            }});
            put("Upload_Files_Page", new HashMap<>() {{
                put("en", "//app-file-upload");
                put("ar", "//app-file-upload");
            }});
            put("Upload_Id_File", new HashMap<>() {{
                put("en", "//span[contains(text(),'صورة من الهوية الوطنية')]/ancestor::app-label/following-sibling::app-file-upload/input");
                put("ar", "//span[contains(text(),' صورة من الهوية الوطنية ')]/ancestor::app-label/following-sibling::app-file-upload/input");
            }});
            put("Upload_Family_Card_File", new HashMap<>() {{
                put("en", "//span[contains(text(),'صورة من بطاقة العائلة')]/ancestor::app-label/following-sibling::app-file-upload/input");
                put("ar", "//span[contains(text(),'صورة من بطاقة العائلة')]/ancestor::app-label/following-sibling::app-file-upload/input");
            }});
            put("Toast_Error_Message", new HashMap<>() {{
                put("en", "//div[@class='toast-body']");
                put("ar", "//div[@class='toast-body']");
            }});
            put("Delete_Icon_Button", new HashMap<>() {{
                put("en", "//span[contains(@class,'delete-icon')]");
                put("ar", "//span[contains(@class,'delete-icon')]");
            }});
            put("Appeals_Button", new HashMap<>() {{
                put("en", "//div[contains (text(), 'Appeals')]");
                put("ar", "//div[contains (text(), 'الاعتراضات')]");
            }});
            put("Appeals_Page", new HashMap<>() {{
                put("en", "//app-appeals-list");
                put("ar", "//app-appeals-list");
            }});
            put("Assigned_To_Me_Nav_Button", new HashMap<>() {{
                put("en", "//a[normalize-space()='Assigned to me']");
                put("ar", "//a[normalize-space()='الاعتراضات المسندة لي']");
            }});
            put("Assigned_To_My_Team_Nav_Button", new HashMap<>() {{
                put("en", "//a[normalize-space()='Assigned to my team']");
                put("ar", "//a[normalize-space()='الاعتراضات المسندة لزملائي']");
            }});
            put("Beneficiary_ID_Input_Text", new HashMap<>() {{
                put("en", "//input[@formcontrolname='decrypted_national_id_number']");
                put("ar", "//input[@formcontrolname='decrypted_national_id_number']");
            }});
            put("Search_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Search')] | //button/span[contains(text(),'Search')]");
                put("ar", "//button[contains(text(),'بحث')] | //button/span[contains(text(),'بحث')]");
            }});
            put("Searched_User_Result", new HashMap<>() {{
                put("en", "(//div[@class='datatable-body-cell-label\"]/div)[2]");
                put("ar", "(//div[@class=\"datatable-body-cell-label\"]/div)[2]");
            }});
            put("Reassign_Appeal_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Reassign Appeal')]");
                put("ar", "//button[contains(text(),'إعادة تعيين')]");
            }});

            put("Reassign_Appeal_Popup", new HashMap<>() {{
                put("en", "//app-re-assignment");
                put("ar", "//app-re-assignment");
            }});
            put("Close_Button", new HashMap<>() {{
                put("en", "//button[normalize-space()='Close']");
                put("ar", "//button[normalize-space()='إغلاق']");
            }});
            put("Beneficiary_Details_Page", new HashMap<>() {{
                put("en", "//app-action-required");
                put("ar", "//app-action-required");
            }});
            put("Team_Dropdown_List", new HashMap<>() {{
                put("en", "//app-nsar-dropdown[@formcontrolname=\"assign_to_user_group\"]/descendant::ng-select/div");
                put("ar", "//app-nsar-dropdown[@formcontrolname=\"assign_to_user_group\"]/descendant::ng-select/div");
            }});
            put("Reassign_Appeal_Button_Of_Popup", new HashMap<>() {{
                put("en", "//app-re-assignment/descendant::button[contains(text(),'Reassign Appeal')]");
                put("ar", "//app-re-assignment/descendant::button[contains(text(),'إعادة تعيين')]");
            }});
            put("User_Dropdown_List", new HashMap<>() {{
                put("en", "//app-nsar-dropdown[@formcontrolname=\"assign_to_username\"]/descendant::ng-select/div");
                put("ar", "//app-nsar-dropdown[@formcontrolname=\"assign_to_username\"]/descendant::ng-select/div");
            }});
            put("Confirm_Reassignment_Popup", new HashMap<>() {{
                put("en", "//app-basic-modal");
                put("ar", "//app-basic-modal");
            }});
            put("Appeal_Reassigned_Popup", new HashMap<>() {{
                put("en", "//app-basic-modal/descendant::h3");
                put("ar", "//app-basic-modal/descendant::h3");
            }});
            put("Submit_The_Appeal_Request_Button", new HashMap<>() {{
                put("en", "//button[normalize-space()='Submit']");
                put("ar", "//button[normalize-space()='تقديم الطلب']");
            }});
            put("Comment_Textarea_Of_Popup", new HashMap<>() {{
                put("en", "//textarea[@formcontrolname=\"comment\"]");
                put("ar", "//textarea[@formcontrolname=\"comment\"]");
            }});
            put("Close_Button_Of_Popup", new HashMap<>() {{
                put("en", "//app-basic-modal//button[normalize-space()='Close']");
                put("ar", "//app-basic-modal//button[normalize-space()='إغلاق']");
            }});
            put("Required_Documents_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Require document(s)')]");
                put("ar", "//button[contains(text(),'المستندات المطلوبة')]");
            }});
            put("Required_Documents_Popup", new HashMap<>() {{
                put("en", "//app-require-document");
                put("ar", "//app-require-document");
            }});
            put("Required_Documents_Dropdown_List", new HashMap<>() {{
                put("en", "//app-nsar-dropdown[@formcontrolname=\"documents\"]/descendant::ng-select/div");
                put("ar", "//app-nsar-dropdown[@formcontrolname=\"documents\"]/descendant::ng-select/div");
            }});
            put("Reason_Dropdown_List", new HashMap<>() {{
                put("en", "//app-nsar-dropdown[@formcontrolname=\"sub_appeal_id\"]/descendant::ng-select/div");
                put("ar", "//app-nsar-dropdown[@formcontrolname=\"sub_appeal_id\"]/descendant::ng-select/div");
            }});
            put("Add_And_Continue_Button", new HashMap<>() {{
                put("en", "//button[normalize-space()='Add and continue']");
                put("ar", "//button[normalize-space()='إضافة ومتابعة']");
            }});
            put("Required_Documents_Selected", new HashMap<>() {{
                put("en", "//div[@role=\"option\"]/descendant::label");
                put("ar", "//div[@role=\"option\"]/descendant::label");
            }});
            put("Delete_Trash_Icon_Button", new HashMap<>() {{
                put("en", "//i[contains(@class,'bi-trash')]");
                put("ar", "//i[contains(@class,'bi-trash')]");
            }});
            put("Require_Documents_Sent_Popup", new HashMap<>() {{
                put("en", "//div/h3[contains(text(),'Require document(s) sent')]");
                put("ar", "//div/h3[contains(text(),'تم أرسال المستندات المطلوبة')]");
            }});
            put("Require_Additional_Documents_Status", new HashMap<>() {{
                put("en", "//app-appeal-progress/descendant::span[3]");
                put("ar", "//app-appeal-progress/descendant::span[3]");
            }});
            put("Appeal_Need_Documents_Button", new HashMap<>() {{
                put("en", "//app-appeal-alert[@clickurl=\"/user-profile/dashboard/appeal-documents-require\"]");
                put("ar", "//app-appeal-alert[@clickurl=\"/user-profile/dashboard/appeal-documents-require\"]");
            }});
            put("Missing_Required_Documents_Page", new HashMap<>() {{
                put("en", "//app-appeal-require-document/descendant::h4");
                put("ar", "//app-appeal-require-document/descendant::h4");
            }});
            put("Upload_Missing_Required_Documents_File", new HashMap<>() {{
                put("en", "//app-file-upload/input");
                put("ar", "//app-file-upload/input");
            }});
            put("Submit_Button", new HashMap<>() {{
                put("en", "//button/span[contains(text(),'Submit')]");
                put("ar", "//button/span[contains(text(),'إرسال')]");
            }});
            put("Reject_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Reject')] | //button/span[contains(text(),'Reject')]");
                put("ar", "//button[contains(text(),'رفض')] | //button/span[contains(text(),'رفض')]");
            }});
            put("Accept_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Accept')]");
                put("ar", "//button[contains(text(),'قبول')]");
            }});
            put("Reject_Reason_Popup", new HashMap<>() {{
                put("en", "//app-reject-reason");
                put("ar", "//app-reject-reason");
            }});
            put("Explanation_Textarea", new HashMap<>() {{
                put("en", "//textarea[@formcontrolname=\"explanation\"]");
                put("ar", "//textarea[@formcontrolname=\"explanation\"]");
            }});
            put("Rejected_Appeal_Popup", new HashMap<>() {{
                put("en", "//app-basic-modal/descendant::h3[contains(text(),'rejected')]");
                put("ar", "//app-basic-modal/descendant::h3[contains(text(),'رفض')]");
            }});
            put("Rejected_Approved_Request_Status", new HashMap<>() {{
                put("en", "//app-appeal-progress/descendant::span[5]");
                put("ar", "//app-appeal-progress/descendant::span[5]");
            }});
            put("Confirm_Acception_Popup", new HashMap<>() {{
                put("en", "//app-basic-modal/descendant::h3[contains(text(),'Confirm acception')]");
                put("ar", "//app-basic-modal/descendant::h3[contains(text(),'تأكيد قبول الاعتراض')]");
            }});
            put("Accepted_Appeal_Popup", new HashMap<>() {{
                put("en", "//app-basic-modal/descendant::h3[contains(text(),'accepted')]");
                put("ar", "//app-basic-modal/descendant::h3[contains(text(),'قبول')]");
            }});
            put("Appeal_Successfully_Submitted_Message", new HashMap<>() {{
                put("en", "//app-appeal-submission-finish/descendant::h4");
                put("ar", "//app-appeal-submission-finish/descendant::h4");
            }});
            put("Request_Addition_Documents_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Request addition documents')]");
                put("ar", "//button[contains(text(),'طلب مستندات الإضافة')]");
            }});

        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }
    public static By appealButton () throws Exception {
        return By.xpath(get("Appeal_Button"));
    }
    public static By requestAppealButton () throws Exception {
        return By.xpath(get("Request_Appeal_Button"));
    }
    public static By appealSubmissionPage () throws Exception {
        return By.xpath(get("Appeal_Submission_Page"));
    }
    public static By continueButton () throws Exception {
        return By.xpath(get("Continue_Button"));
    }
    public static By justificationDropdownList () throws Exception {
        return By.xpath(get("Justification_Dropdown_List"));
    }
    public static By commentsTextarea () throws Exception {
        return By.xpath(get("Comments_Textarea"));
    }
    public static By uploadFilesPage () throws Exception {
        return By.xpath(get("Upload_Files_Page"));
    }
    public static By uploadIdFile () throws Exception {
        return By.xpath(get("Upload_Id_File"));
    }
    public static By uploadFamilyCardFile () throws Exception {
        return By.xpath(get("Upload_Family_Card_File"));
    }
    public static By toastErrorMessage () throws Exception {
        return By.xpath(get("Toast_Error_Message"));
    }
    public static By deleteIconButton () throws Exception {
        return By.xpath(get("Delete_Icon_Button"));
    }
    public static By appealsButton () throws Exception {
        return By.xpath(get("Appeals_Button"));
    }
    public static By appealsPage () throws Exception {
        return By.xpath(get("Appeals_Page"));
    }
    public static By assignedToMeNavButton () throws Exception {
        return By.xpath(get("Assigned_To_Me_Nav_Button"));
    }
    public static By assignedToMyTeamNavButton () throws Exception {
        return By.xpath(get("Assigned_To_My_Team_Nav_Button"));
    }
    public static By beneficiaryIDInputText () throws Exception {
        return By.xpath(get("Beneficiary_ID_Input_Text"));
    }
    public static By searchButton () throws Exception {
        return By.xpath(get("Search_Button"));
    }
    public static By searchedUserResult () throws Exception {
        return By.xpath(get("Searched_User_Result"));
    }
    public static By reassignAppealButton () throws Exception {
        return By.xpath(get("Reassign_Appeal_Button"));
    }
    public static By reassignAppealPopup () throws Exception {
        return By.xpath(get("Reassign_Appeal_Popup"));
    }
    public static By closeButton () throws Exception {
        return By.xpath(get("Close_Button"));
    }
    public static By beneficiaryDetailsPage () throws Exception {
        return By.xpath(get("Beneficiary_Details_Page"));
    }
    public static By teamDropdownList () throws Exception {
        return By.xpath(get("Team_Dropdown_List"));
    }
    public static By reassignAppealButtonOfPopup () throws Exception {
        return By.xpath(get("Reassign_Appeal_Button_Of_Popup"));
    }
    public static By userDropdownList () throws Exception {
        return By.xpath(get("User_Dropdown_List"));
    }
    public static By confirmReassignmentPopup () throws Exception {
        return By.xpath(get("Confirm_Reassignment_Popup"));
    }
    public static By appealReassignedPopup () throws Exception {
        return By.xpath(get("Appeal_Reassigned_Popup"));
    }
    public static By submitTheAppealRequestButton () throws Exception {
        return By.xpath(get("Submit_The_Appeal_Request_Button"));
    }
    public static By commentTextareaOfPopup () throws Exception {
        return By.xpath(get("Comment_Textarea_Of_Popup"));
    }
    public static By closeButtonOfPopup () throws Exception {
        return By.xpath(get("Close_Button_Of_Popup"));
    }
    public static By requiredDocumentsButton () throws Exception {
        return By.xpath(get("Required_Documents_Button"));
    }
    public static By requiredDocumentsPopup () throws Exception {
        return By.xpath(get("Required_Documents_Popup"));
    }
    public static By requiredDocumentsDropdownList () throws Exception {
        return By.xpath(get("Required_Documents_Dropdown_List"));
    }
    public static By reasonDropdownList () throws Exception {
        return By.xpath(get("Reason_Dropdown_List"));
    }
    public static By addAndContinueButton () throws Exception {
        return By.xpath(get("Add_And_Continue_Button"));
    }
    public static By requiredDocumentsSelected () throws Exception {
        return By.xpath(get("Required_Documents_Selected"));
    }
    public static By deleteTrashIconButton () throws Exception {
        return By.xpath(get("Delete_Trash_Icon_Button"));
    }
    public static By requireDocumentsSentPopup () throws Exception {
        return By.xpath(get("Require_Documents_Sent_Popup"));
    }
    public static By requireAdditionalDocumentsStatus () throws Exception {
        return By.xpath(get("Require_Additional_Documents_Status"));
    }
    public static By appealNeedDocumentsButton () throws Exception {
        return By.xpath(get("Appeal_Need_Documents_Button"));
    }
    public static By missingRequiredDocumentsPage () throws Exception {
        return By.xpath(get("Missing_Required_Documents_Page"));
    }
    public static By uploadMissingRequiredDocumentsFile () throws Exception {
        return By.xpath(get("Upload_Missing_Required_Documents_File"));
    }
    public static By submitButton () throws Exception {
        return By.xpath(get("Submit_Button"));
    }
    public static By rejectButton () throws Exception {
        return By.xpath(get("Reject_Button"));
    }
    public static By acceptButton () throws Exception {
        return By.xpath(get("Accept_Button"));
    }
    public static By rejectReasonPopup () throws Exception {
        return By.xpath(get("Reject_Reason_Popup"));
    }
    public static By explanationTextarea () throws Exception {
        return By.xpath(get("Explanation_Textarea"));
    }
    public static By rejectedAppealPopup () throws Exception {
        return By.xpath(get("Rejected_Appeal_Popup"));
    }
    public static By rejectedApprovedRequestStatus () throws Exception {
        return By.xpath(get("Rejected_Approved_Request_Status"));
    }
    public static By confirmAcceptionPopup () throws Exception {
        return By.xpath(get("Confirm_Acception_Popup"));
    }
    public static By acceptedAppealPopup () throws Exception {
        return By.xpath(get("Accepted_Appeal_Popup"));
    }
    public static By appealSuccessfullySubmittedMessage () throws Exception {
        return By.xpath(get("Appeal_Successfully_Submitted_Message"));
    }
    public static By requestAdditionDocumentsButton () throws Exception {
        return By.xpath(get("Request_Addition_Documents_Button"));
    }
}
