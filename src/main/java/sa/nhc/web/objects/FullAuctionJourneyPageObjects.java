package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class FullAuctionJourneyPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            /////////////////////////////////////////////////////////////////////
            put("Select-Auction-From-Sidebar", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//div[@class='nav-text'][text()='المزادات']");
            }});
            put("Auction_Projects", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//div[text()=' مشاريع المزاد ']");
            }});
            put("Auction_Projects_Page", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//app-page-header[@pagetitle=\"MENU.AUCTION_PROJECTS\"]");
            }});
            put("Add_New_Auction_Button", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//button/span[contains(text(),'مشروع مزاد جديد')]");
            }});
            put("Auction_Type_Dropdown_List", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//mat-select[@formcontrolname=\"auction_type\"]/div");
            }});
            put("Selected_Auction_Type", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//mat-option");
            }});
            put("Project_Name_InputField", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//input[@formcontrolname=\"name\"]");
            }});
            put("Region_Dropdown_List", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//ng-select[@id=\"selectRegion\"]/div");
            }});
            put("Selected_Region", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//div[@role=\"option\"]");
            }});
            put("City_Dropdown_List", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//input[@id=\"inputCity\"]");
            }});
            put("Selected_City", new HashMap<>() {{
                put("en", "//div[@class='nav-text'][text()='Auction']");
                put("ar", "//mat-option/span");
            }});


            put("Select-Auction-List-From-Sidebar", new HashMap<>() {{
                put("en", "//div[contains (text(), 'Auctions')]");
                put("ar", "//div[contains (text(), 'قائمة المزادات')]");
            }});
            put("Auction-Heading", new HashMap<>() {{
                put("en", "//div//h1[contains (text(), 'Auctions')]");
                put("ar", "//div//h1[contains (text(), 'قائمة المزادات')]");
            }});
            put("Add-New-Auction-Button", new HashMap<>() {{
                put("en", "//div//button[@class='btn btn-primary'][text()=' Add new auctions ']");
                put("ar", "//div//button[@class='btn btn-primary'][text()=' أضافة مزاد جديد ']");
            }});
            put("Create-Auction-Heading", new HashMap<>() {{
                put("en", "//div//h1[text()='Create auctions']");
                put("ar", "//div//h1[text()='إنشاء مزاد']");
            }});
            put("Auction-Unit-Code-Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='unit_code']");
                put("ar", "//input[@formcontrolname='unit_code']");
            }});
            put("Auction-Unit-Code-Input2", new HashMap<>() {{
                put("en", "(//div//input[@formcontrolname='unit_code'])[2]");
                put("ar", "(//div//input[@formcontrolname='unit_code'])[2]");
            }});
            put("Get-Project-Code-Auction-Page", new HashMap<>() {{
                put("en", "//input[@formcontrolname='project_code']");
                put("ar", "//input[@formcontrolname='project_code']");
            }});
            put("Value-Error-Msg", new HashMap<>() {{
                put("en", "//label[contains(@class,'invalid')]");
                put("ar", "//label[contains(@class,'invalid')]");
            }});
            put("Auction-Targeted-Price-Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='targeted_price']");
                put("ar", "//input[@formcontrolname='targeted_price']");
            }});
            put("Auction-Starting-Price-Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname='starting_price']");
                put("ar", "//input[@formcontrolname='starting_price']");
            }});
            put("Get-Year-List", new HashMap<>() {{
                put("en", "//select[@aria-label='Select year']");
                put("ar", "//select[@aria-label='Select year']");
            }});
            put("Get-Month-List", new HashMap<>() {{
                put("en", "//select[@aria-label='Select month']");
                put("ar", "//select[@aria-label='Select month']");
            }});
            put("Get-Day-List", new HashMap<>() {{
                put("en", "//ngb-datepicker-month/descendant::div[@role='gridcell']/child::div[not(contains (@class , 'outside'))]");
                put("ar", "//ngb-datepicker-month/descendant::div[@role='gridcell']/child::div[not(contains (@class , 'outside'))]");
            }});
            put("Start-Auction-Date-Icon", new HashMap<>() {{
                put("en", "(//span[@class='icon cursor bi bi-calendar-date'])[1]");
                put("ar", "(//span[@class='icon cursor bi bi-calendar-date'])[1]");
            }});
            put("End-Auction-Date-Icon", new HashMap<>() {{
                put("en", "(//span[@class='icon cursor bi bi-calendar-date'])[2]");
                put("ar", "(//span[@class='icon cursor bi bi-calendar-date'])[2]");
            }});
            put("Auction-Start-Hours", new HashMap<>() {{
                put("en", "(//div[@class='ngb-tp-input-container ngb-tp-hour']//input[@type='text'][@aria-label='Hours'])[1]");
                put("ar", "(//div[@class='ngb-tp-input-container ngb-tp-hour']//input[@type='text'][@aria-label='Hours'])[1]");
            }});
            put("Auction-End-Hours", new HashMap<>() {{
                put("en", "(//div[@class='ngb-tp-input-container ngb-tp-hour']//input[@type='text'][@aria-label='Hours'])[2]");
                put("ar", "(//div[@class='ngb-tp-input-container ngb-tp-hour']//input[@type='text'][@aria-label='Hours'])[2]");
            }});
            put("Auction-Start-Minutes", new HashMap<>() {{
                put("en", "(//div[@class='ngb-tp-input-container ngb-tp-minute']//input[@type='text'][@aria-label='Minutes'])[1]");
                put("ar", "(//div[@class='ngb-tp-input-container ngb-tp-minute']//input[@type='text'][@aria-label='Minutes'])[1]");
            }});
            put("Auction-End-Minutes", new HashMap<>() {{
                put("en", "(//div[@class='ngb-tp-input-container ngb-tp-minute']//input[@type='text'][@aria-label='Minutes'])[2]");
                put("ar", "(//div[@class='ngb-tp-input-container ngb-tp-minute']//input[@type='text'][@aria-label='Minutes'])[2]");
            }});
            put("Add-Time-Hours", new HashMap<>() {{
                put("en", "(//div[@class='ngb-tp-input-container ngb-tp-hour']//input[@type='text'][@aria-label='Hours'])[3]");
                put("ar", "//input[@aria-label=\"Hours\"]");
            }});
            put("Add-Time-Minutes", new HashMap<>() {{
                put("en", "(//div[@class='ngb-tp-input-container ngb-tp-minute']//input[@type='text'][@aria-label='Minutes'])[3]");
                put("ar", "//input[@aria-label=\"Minutes\"]");
            }});
            put("Add-Time-Seconds", new HashMap<>() {{
                put("en", "(//div[@class='ngb-tp-input-container ngb-tp-second ng-star-inserted']//input[@type='text'][@aria-label='Seconds'])[1]");
                put("ar", "//input[@aria-label=\"Seconds\"]");
            }});
            put("Apply-General-Setting-Label", new HashMap<>() {{
                put("en", "//ui-switch[@formcontrolname='apply_general_setting']/child::button");
                put("ar", "//ui-switch[@formcontrolname='apply_general_setting']/child::button");
            }});
            put("Apply_Fee_For_Auction_Unit-Label", new HashMap<>() {{
                put("en", "//ui-switch[@formcontrolname='auction_fee_flag']/child::button");
                put("ar", "//ui-switch[@formcontrolname='auction_fee_flag']/child::button");
            }});
            put("Save-Button", new HashMap<>() {{
                put("en", "//button[contains (text(),'Save')]");
                put("ar", "//button[contains (text(),'حفظ')] | //span[contains (text(),'حفظ')]");
            }});
            put("Cancel-Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Cancel')]");
                put("ar", "//button[contains (text(),'إلغاء')]");
            }});
            put("Fixed-Increase-Number-1", new HashMap<>() {{
                put("en", "(//input[@type='number'])[2]");
                put("ar", "(//input[@type='number'])[2]");
            }});
            put("Fixed-Increase-Number-2", new HashMap<>() {{
                put("en", "(//input[@type='number'])[3]");
                put("ar", "(//input[@type='number'])[3]");
            }});
            put("Fixed-Increase-Number-3", new HashMap<>() {{
                put("en", "(//input[@type='number'])[4]");
                put("ar", "(//input[@type='number'])[4]");
            }});
            put("Period-Time-Auction-Winner-Take-Action", new HashMap<>() {{
                put("en", "(//input[@type='number'])[5]");
                put("ar", "(//input[@type='number'])[5]");
            }});
            put("Period-Time-Pay-Final-Unit-Invoice", new HashMap<>() {{
                put("en", "(//input[@type='number'])[6]");
                put("ar", "(//input[@type='number'])[6]");
            }});
            put("Add-More-Section", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Add more auction')]");
                put("ar", "//span[contains (text(), 'أضافة مزاد اخر')]");
            }});
            put("Delete-Button", new HashMap<>() {{
                put("en", "//div//button//i[@class='bi bi-trash display-4']");
                put("ar", "//div//button//i[@class='bi bi-trash display-4']");
            }});
            put("Auction-Increase-Fee-Amount", new HashMap<>() {{
                put("en", "//input[@formcontrolname='auction_fee_amount']");
                put("ar", "//input[@formcontrolname='auction_fee_amount']");
            }});
            put("Auction-Tab", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Auction')]");
                put("ar", "//button[contains (text(), 'مزاد')]");
            }});
            put("View_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'View')]");
                put("ar", "//button[contains(text(),'عرض')]");
            }});
            put("Available-Unit-Label", new HashMap<>() {{
                put("en", "//div//h3[text()='Available units']");
                put("ar", "//div//h3[text()='الوحدات المتاحة']");
            }});
            put("Expired_Or_Closed_Unit", new HashMap<>() {{
                put("en", "//h5[contains(text(),'أرض')]/following-sibling::span[contains (@class, 'expired') or contains (@class, 'closed')]");
                put("ar", "//h5[contains(text(),'أرض')]/following-sibling::span[contains (@class, 'expired') or contains (@class, 'closed')]");

            }});
            put("Get-Current-Auction-Status", new HashMap<>() {{
                put("en", "//app-project-bookable-channel/descendant::p[2]");
                put("ar", "//app-project-bookable-channel/descendant::p[2]");
            }});
            put("View-Auction-Location", new HashMap<>() {{
                put("en", "//app-project-location//span[text()='Show on map']");
                put("ar", "//app-project-location//span[text()='عرض الخريطة']");
            }});
            put("Available-Units-Filter", new HashMap<>() {{
                put("en", "//div[text()=' results ']");
                put("ar", "//div[text()=' نتائج ']");
            }});
            put("Available-Units-Search-Result", new HashMap<>() {{
                put("en", "//*[contains (text(), 'No results')]");
                put("ar", "//*[contains (text(), 'لا توجد نتائج')]");
            }});
            put("Maximum-Area-Input-Field", new HashMap<>() {{
                put("en", "//app-range-slider//input[@formcontrolname='high']");
                put("ar", "//app-range-slider//input[@formcontrolname='high']");
            }});
            put("Filter-Search-Button", new HashMap<>() {{
                put("en", "//button[text()=' Apply ']");
                put("ar", "//button[text()=' بحث ']");
            }});
            put("Filter-Clear-Button", new HashMap<>() {{
                put("en", "//button[text()=' Clear ']");
                put("ar", "//button[text()=' مسح ']");
            }});
            put("Maximize-Image-Auction-Button", new HashMap<>() {{
                put("en", "//div[contains(@class,'expan')]");
                put("ar", "//div[contains(@class,'expan')]");
            }});
            put("Project-Details-Label", new HashMap<>() {{
                put("en", "//div//h3[contains(text(),'details')]");
                put("ar", "//div//h3[contains(text(),'تفاصيل')]");
            }});
            put("View-Master-Plan-Image", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Brochure & Masterplan')]/parent::div/descendant::button");
                put("ar", "//h5[contains(text(),'عرض الكتيب')]/parent::div/descendant::button");
            }});
            put("Click-On-Project-Tab", new HashMap<>() {{
                put("en", "//div[contains(text(),'Project')]");
                put("ar", "//div[contains(text(),'تفاصيل')]");
            }});
            put("Close_Btn_On_Popup", new HashMap<>() {{
                put("en", "//span[contains (@class, 'close')]");
                put("ar", "//span[contains (@class, 'close')]");
            }});
            put("Unit_Open_For_Auction", new HashMap<>() {{
                put("en", "//app-project-unit-card/descendant::h5[1]");
                put("ar", "//app-project-unit-card/descendant::h5[1]");
            }});
            put("Unit_Auction_End_Time_Text", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Ends')]");
                put("ar", "//span[contains (text(), 'ينتهي')]");
            }});
            put("Apply_For_This_Auction_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Apply for this auction')]");
                put("ar", "//span[contains (text(), 'المشاركة في المزاد')]");
            }});
            put("Fees_Apply_For_The_Bid_Popup_Title", new HashMap<>() {{
                put("en", "//h3[contains (text(), 'Fees apply for this bid')]");
                put("ar", "//h3[contains (text(), 'تطبق الرسوم على هذا المزاد')]");
            }});
            put("Auction_Fees_Text", new HashMap<>() {{
                put("en", "//div[contains (text(), 'Auction fees')]");
                put("ar", "//div[contains (text(), 'رسوم المزاد')]");
            }});
            put("Mada_Payment_Option_Checkbox_Input", new HashMap<>() {{
                put("en", "(//input[@type='checkbox'])[2]");
                put("ar", "(//input[@type='checkbox'])[2]");
            }});
            put("Mada_Payment_Option", new HashMap<>() {{
                put("en", "//app-choose-payment-method[2]");
                put("ar", "//app-choose-payment-method[2]");
            }});
            put("Confirm_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Confirm')]/parent::button");
                put("ar", "//span[contains (text(), 'تأكيد')]/parent::button");
            }});
            put("Agree_Checkbox", new HashMap<>() {{
                put("en", "//input[@id='termCheckbox']");
                put("ar", "//input[@id='termCheckbox']");
            }});
            put("Invoice_Summary_Title", new HashMap<>() {{
                put("en", "//h4[contains (text(), 'Invoice Summary')]");
                put("ar", "//h4[contains (text(), 'ملخص الفاتورة')]");
            }});
            put("Transactions_Button", new HashMap<>() {{
                put("en", "//app-profile-desktop-sidebar-item//span[contains (text(), 'Payment transactions')]");
                put("ar", "//app-profile-desktop-sidebar-item//span[contains (text(), 'سجل المدفوعات')]");
            }});
            put("Transactions_And_Transactions_Heading", new HashMap<>() {{
                put("en", "//h2[contains (text(), 'Payments and transactions')]");
                put("ar", "//h2[contains (text(), 'سجل المدفوعات')]");
            }});
            put("Pay_Now_Link", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Pay now')]");
                put("ar", "//span[contains (text(), 'ادفع الآن')]");
            }});
            put("Preview_invoice_Link", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Preview invoice')]");
                put("ar", "//span[contains (text(), 'معاينة الفاتورة')]");
            }});
            put("Invoice_Preview_Popup_Title", new HashMap<>() {{
                put("en", "//p[contains (text(), 'replaceText')]");
                put("ar", "//p[contains (text(), 'replaceText')]");
            }});
            put("Back_Button", new HashMap<>() {{
                put("en", "//a[@id='paymentBack']");
                put("ar", "//a[@id='paymentBack']");
            }});
            put("Start_Bidding_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Start bidding')]");
                put("ar", "//button[contains (text(), 'ابدأ المزايدة')]");
            }});
            put("Terms_And_Conditions_Checkbox", new HashMap<>() {{
                put("en", "//input[@id='termCheckbox']");
                put("ar", "//input[@id='termCheckbox']");
            }});
            put("Join_This_Auction_Button", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Join this auction')]");
                put("ar", "//span[contains (text(), 'شارك في المزاد')]");
            }});
            put("Total_Price_Of_Auction", new HashMap<>() {{
                put("en", "//span[contains (text(), ' Total')]");
                put("ar", "//span[contains (text(), 'المجموع')]");
            }});
            put("Your_Bid_Price", new HashMap<>() {{
                put("en", "//label[contains (text(), 'Your bid')]");
                put("ar", "//label[contains (text(), 'مزايدتك')]");
            }});
            put("Auction_Starting_Starting_Price", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Starting price')]");
                put("ar", "//span[contains (text(), 'سعر المزايدة الحالية')]");
            }});
            put("Increase_Bid_Price_Button", new HashMap<>() {{
                put("en", "//button[@class='plus']");
                put("ar", "//button[@class='plus']");
            }});
            put("Decrease_Bid_Price_Button", new HashMap<>() {{
                put("en", "//button[@class='minus']");
                put("ar", "//button[@class='minus']");
            }});
            put("Fixed_Increase_Number", new HashMap<>() {{
                put("en", "(//div[contains (@class, 'fixed-increase-number')])[2]");
                put("ar", "(//div[contains (@class, 'fixed-increase-number')])[2]");
            }});
            put("Place_Bid_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Place bid')]");
                put("ar", "//button[contains (text(), 'تأكيد المزايدة')]");
            }});
            put("Submit_Bid_Button", new HashMap<>() {{
                put("en", "//app-confirm-bid-dialog/descendant::button[contains (text(), 'Submit bid')]");
                put("ar", "//app-confirm-bid-dialog/descendant::button[contains (text(), 'تأكيد المزايدة')]");
            }});
            put("Auction_Bid_Success_Popup_Title", new HashMap<>() {{
                put("en", "//h2[contains (text(),'Congratulation')]");
                put("ar", "//h2[contains (text(),'بنجاح')]");
            }});
            put("Congratulation_Message_For_Highest_Bid", new HashMap<>() {{
                put("en", "//b[contains (text(),'Congratulation')]");
                put("ar", "//b[contains (text(),'تهانينا')]");
            }});
            put("Auction_Side_Menu_Button", new HashMap<>() {{
                put("en", "//a[@href='/app/user-profile/my-activities/auction/listing']");
                put("ar", "//a[@href='/app/user-profile/my-activities/auction/listing']");
            }});
            put("Closed_Auctions_Tab", new HashMap<>() {{
                put("en", "//li[@role='presentation'][3]");
                put("ar", "//li[@role='presentation'][3]");
            }});
            put("Active_Auctions_Tab", new HashMap<>() {{
                put("en", "//li[@role='presentation'][2]");
                put("ar", "//li[@role='presentation'][2]");
            }});
            put("View_Auction_Link", new HashMap<>() {{
                put("en", "//span[contains (text(), 'View auction')]");
                put("ar", "//span[contains (text(), 'عرض المزاد')]");
            }});
            put("Continue_Button", new HashMap<>() {{
                put("en", "//span[contains (text (), 'Continue')]");
                put("ar", "//span[contains (text (), 'المتابعة')]");
            }});
            put("Sign_Contract_Page_Heading", new HashMap<>() {{
                put("en", "//h3[contains (text (), 'Sign contract')]");
                put("ar", "//h3[contains (text (), 'توقيع العقد')]");
            }});
            put("Download_Contract_Link", new HashMap<>() {{
                put("en", "//span[contains (text (), 'Download contract')]");
                put("ar", "//span[contains (text (), 'تنزيل العقد')]");
            }});
            put("Reject_Button", new HashMap<>() {{
                put("en", "//button[contains (text (), 'Reject')]");
                put("ar", "//button[contains (text (), 'يرفض')]");
            }});
            put("Reject_Sign_Contract_Page_Heading", new HashMap<>() {{
                put("en", "//h3[contains (text (), 'Reject')]");
                put("ar", "//h3[contains (text (), 'رفض')]");
            }});
            put("Plot_Information_Heading_Text", new HashMap<>() {{
                put("en", "//h5[contains (text(), 'Plot Information')]");
                put("ar", "//h5[contains (text(), 'معلومات القطع')]");
            }});
            put("Confirm_Rejection_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Confirm rejection')]");
                put("ar", "//button[contains (text(), 'قم بتأكيد الرفض')]");
            }});
            put("Approve_Button", new HashMap<>() {{
                put("en", "//button[contains (text(), 'Approve')]");
                put("ar", "//button[contains (text(), 'اعتماد')]");
            }});
            put("Reject_Success_Message", new HashMap<>() {{
                put("en", "//app-reject-contract-success/descendant::span");
                put("ar", "//app-reject-contract-success/descendant::span");
            }});
            put("Rejected_Status", new HashMap<>() {{
                put("en", "(//app-alert/descendant::span[2])[1]");
                put("ar", "(//app-alert/descendant::span[2])[1]");
            }});
            put("Auction_Status_Dropdown", new HashMap<>() {{
                put("en", "//app-nsar-dropdown[@formcontrolname='auction_status']/descendant::ng-select");
                put("ar", "//app-nsar-dropdown[@formcontrolname='auction_status']/descendant::ng-select");
            }});
            put("Auction_Status_Dropdown_List", new HashMap<>() {{
                put("en", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']");
                put("ar", "//ng-dropdown-panel[@role='listbox']/descendant::div[@role='option']");
            }});
            put("Auction_Status", new HashMap<>() {{
                put("en", "//datatable-body/descendant::datatable-body-row[1]/descendant::datatable-body-cell[4]");
                put("ar", "//datatable-body/descendant::datatable-body-row[1]/descendant::datatable-body-cell[4]");
            }});
            put("Search_Button_For_Auction", new HashMap<>() {{
                put("en", "//button[@type='submit']");
                put("ar", "//button[@type='submit']");
            }});
            put("Auction_Start_Date_Input", new HashMap<>() {{
                put("en", "//app-hijri-datepicker[@formcontrolname='start_date']/descendant::input[@placeholder='YYYY/MM/DD']");
                put("ar", "//app-hijri-datepicker[@formcontrolname='start_date']/descendant::input[@placeholder='YYYY/MM/DD']");
            }});
            put("Auction_End_Date_Input", new HashMap<>() {{
                put("en", "//app-hijri-datepicker[@formcontrolname='end_date']/descendant::input[@placeholder='YYYY/MM/DD']");
                put("ar", "//app-hijri-datepicker[@formcontrolname='end_date']/descendant::input[@placeholder='YYYY/MM/DD']");
            }});
            put("Timer_CountDown", new HashMap<>() {{
                put("en", "//div[contains (@class,\"time-countdown\")]");
                put("ar", "//div[contains (@class,\"time-countdown\")]");
            }});
            put("Available_Unit_Label", new HashMap<>() {{
                put("en", "//h5[contains (text(), 'Land')]");
                put("ar", "//h5[contains (text(), 'أرض')]");
            }});
            put("Maximum_Area_Slider", new HashMap<>() {{
                put("en", "(//span[@class=\"thumb\"])[2]");
                put("ar", "(//span[@class=\"thumb\"])[2]");
            }});
            put("Minimum_Area_Slider", new HashMap<>() {{
                put("en", "(//span[@class=\"thumb\"])[1]");
                put("ar", "(//span[@class=\"thumb\"])[1]");
            }});
            put("Range_Line", new HashMap<>() {{
                put("en", "//div[@id=\"line\"]");
                put("ar", "//div[@id=\"line\"]");
            }});
            put("Max_Range_Input", new HashMap<>() {{
                put("en", "//input[@formcontrolname=\"high\"]");
                put("ar", "//input[@formcontrolname=\"high\"]");
            }});
            put("Maximize_Image", new HashMap<>() {{
                put("en", "(//app-thumbs-gallery-slider)[2]");
                put("ar", "(//app-thumbs-gallery-slider)[2]");
            }});
            put("Auction_Legal_Files", new HashMap<>() {{
                put("en", "(//input[@type = 'file'])[replaceText]");
                put("ar", "(//input[@type = 'file'])[replaceText]");
            }});
            put("Sign_Contract_Banner", new HashMap<>() {{
                put("en", "//h5[contains (text(), 'Sign contract')]");
                put("ar", "//h5[contains (text(), 'توقيع العقد')]");
            }});
            put("Sign_Contract_Approve_Message", new HashMap<>() {{
                put("en", "//span[contains (text(), 'Success')]");
                put("ar", "//span[contains (text(), 'نجاح')]");
            }});
        }
    };


    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    /////////////////////////////////////////////////////////////////////
    public static By selectAuctionFromSidebar() throws Exception {
        return By.xpath(get("Select-Auction-From-Sidebar"));
    }

    public static By AuctionProjects() throws Exception {
        return By.xpath(get("Auction_Projects"));
    }

    public static By AuctionProjectsPage() throws Exception {
        return By.xpath(get("Auction_Projects_Page"));
    }

    public static By AddNewAuctionButton() throws Exception {
        return By.xpath(get("Add_New_Auction_Button"));
    }

    public static By AuctionTypeDropdownList() throws Exception {
        return By.xpath(get("Auction_Type_Dropdown_List"));
    }

    public static By SelectedAuctionType() throws Exception {
        return By.xpath(get("Selected_Auction_Type"));
    }

    public static By ProjectNameInputField() throws Exception {
        return By.xpath(get("Project_Name_InputField"));
    }

    public static By RegionDropdownList() throws Exception {
        return By.xpath(get("Region_Dropdown_List"));
    }

    public static By SelectedRegion() throws Exception {
        return By.xpath(get("Selected_Region"));
    }

    public static By CityDropdownList() throws Exception {
        return By.xpath(get("City_Dropdown_List"));
    }

    public static By SelectedCity() throws Exception {
        return By.xpath(get("Selected_City"));
    }


    public static By selectAuctionListFromSidebar() throws Exception {
        return By.xpath(get("Select-Auction-List-From-Sidebar"));
    }

    public static By auctionHeading() throws Exception {
        return By.xpath(get("Auction-Heading"));
    }

    public static By addNewAuctionButton() throws Exception {
        return By.xpath(get("Add-New-Auction-Button"));
    }

    public static By CreateAuctionHeading() throws Exception {
        return By.xpath(get("Create-Auction-Heading"));
    }

    public static By auctionUnitCodeInput() throws Exception {
        return By.xpath(get("Auction-Unit-Code-Input"));
    }

    public static By auctionUnitCodeInput2() throws Exception {
        return By.xpath(get("Auction-Unit-Code-Input2"));
    }

    public static By getProjectCodeFromAuctionPage() throws Exception {
        return By.xpath(get("Get-Project-Code-Auction-Page"));
    }

    public static By auctionStartingPriceInput() throws Exception {
        return By.xpath(get("Auction-Starting-Price-Input"));
    }

    public static By auctionTargetedPriceInput() throws Exception {
        return By.xpath(get("Auction-Targeted-Price-Input"));
    }

    public static By valueErrorMsg() throws Exception {
        return By.xpath(get("Value-Error-Msg"));
    }

    public static By getYearList() throws Exception {
        return By.xpath(get("Get-Year-List"));
    }

    public static By getMonthList() throws Exception {
        return By.xpath(get("Get-Month-List"));
    }

    public static By getDayList() throws Exception {
        return By.xpath(get("Get-Day-List"));
    }

    public static By startAuctionDateIcon() throws Exception {
        return By.xpath(get("Start-Auction-Date-Icon"));
    }

    public static By endAuctionDateIcon() throws Exception {
        return By.xpath(get("End-Auction-Date-Icon"));
    }

    public static By inputStartAuctionHours() throws Exception {
        return By.xpath(get("Auction-Start-Hours"));
    }

    public static By inputStartAuctionMinutes() throws Exception {
        return By.xpath(get("Auction-Start-Minutes"));
    }

    public static By inputEndAuctionHours() throws Exception {
        return By.xpath(get("Auction-End-Hours"));
    }

    public static By inputEndAuctionMinutes() throws Exception {
        return By.xpath(get("Auction-End-Minutes"));
    }

    public static By inputAddTimeHours() throws Exception {
        return By.xpath(get("Add-Time-Hours"));
    }

    public static By inputAddTimeMinutes() throws Exception {
        return By.xpath(get("Add-Time-Minutes"));
    }

    public static By inputAddTimeSeconds() throws Exception {
        return By.xpath(get("Add-Time-Seconds"));
    }

    public static By periodTimePayFinalUnitInvoice() throws Exception {
        return By.xpath(get("Period-Time-Pay-Final-Unit-Invoice"));
    }

    public static By periodTimeAuctionWinnerTakeAction() throws Exception {
        return By.xpath(get("Period-Time-Auction-Winner-Take-Action"));
    }

    public static By fixedIncreaseNumber3() throws Exception {
        return By.xpath(get("Fixed-Increase-Number-3"));
    }

    public static By fixedIncreaseNumber2() throws Exception {
        return By.xpath(get("Fixed-Increase-Number-2"));
    }

    public static By fixedIncreaseNumber1() throws Exception {
        return By.xpath(get("Fixed-Increase-Number-1"));
    }

    public static By auctionIncreaseFeeAmount() throws Exception {
        return By.xpath(get("Auction-Increase-Fee-Amount"));
    }

    public static By applyGeneralSettingLabel() throws Exception {
        return By.xpath(get("Apply-General-Setting-Label"));
    }

    public static By ApplyFeeForAuctionUnitLabel() throws Exception {
        return By.xpath(get("Apply_Fee_For_Auction_Unit-Label"));
    }

    public static By deleteBTN() throws Exception {
        return By.xpath(get("Delete-Button"));
    }

    public static By saveBTN() throws Exception {
        return By.xpath(get("Save-Button"));
    }

    public static By cancelBTN() throws Exception {
        return By.xpath(get("Cancel-Button"));
    }

    public static By addMoreSectionBTN() throws Exception {
        return By.xpath(get("Add-More-Section"));
    }

    public static By auctionTab() throws Exception {
        return By.xpath(get("Auction-Tab"));
    }

    public static By viewButton() throws Exception {
        return By.xpath(get("View_Button"));
    }

    public static By availableUnitLabel() throws Exception {
        return By.xpath(get("Available-Unit-Label"));
    }

    public static By ExpiredOrClosedUnit() throws Exception {
        return By.xpath(get("Expired_Or_Closed_Unit"));
    }

    public static By getCurrentAuctionStatus() throws Exception {
        return By.xpath(get("Get-Current-Auction-Status"));
    }

    public static By viewAuctionLocation() throws Exception {
        return By.xpath(get("View-Auction-Location"));
    }

    public static By availableUnitsFilter() throws Exception {
        return By.xpath(get("Available-Units-Filter"));
    }

    public static By availableUnitsSearchResult() throws Exception {
        return By.xpath(get("Available-Units-Search-Result"));
    }

    public static By maximumAreaInputField() throws Exception {
        return By.xpath(get("Maximum-Area-Input-Field"));
    }

    public static By filterSearchButton() throws Exception {
        return By.xpath(get("Filter-Search-Button"));
    }

    public static By filterClearButton() throws Exception {
        return By.xpath(get("Filter-Clear-Button"));
    }

    public static By maximizeImageAuctionButton() throws Exception {
        return By.xpath(get("Maximize-Image-Auction-Button"));
    }

    public static By clickOnProjectTab() throws Exception {
        return By.xpath(get("Click-On-Project-Tab"));
    }

    public static By viewMasterPlanImage() throws Exception {
        return By.xpath(get("View-Master-Plan-Image"));
    }

    public static By projectDetailsLabel() throws Exception {
        return By.xpath(get("Project-Details-Label"));
    }

    public static By CloseBtnOnPopup() throws Exception {
        return By.xpath(get("Close_Btn_On_Popup"));
    }

    public static By UnitOpenForAuction() throws Exception {
        return By.xpath(get("Unit_Open_For_Auction"));
    }

    public static By UnitAuctionEndTimeText() throws Exception {
        return By.xpath(get("Unit_Auction_End_Time_Text"));
    }

    public static By ApplyForThisAuctionButton() throws Exception {
        return By.xpath(get("Apply_For_This_Auction_Button"));
    }

    public static By FeesApplyForTheBidPopupTitle() throws Exception {
        return By.xpath(get("Fees_Apply_For_The_Bid_Popup_Title"));
    }

    public static By AuctionFeesText() throws Exception {
        return By.xpath(get("Auction_Fees_Text"));
    }

    public static By MadaPaymentOptionCheckboxInput() throws Exception {
        return By.xpath(get("Mada_Payment_Option_Checkbox_Input"));
    }

    public static By MadaPaymentOption() throws Exception {
        return By.xpath(get("Mada_Payment_Option"));
    }

    public static By ConfirmButton() throws Exception {
        return By.xpath(get("Confirm_Button"));
    }

    public static By AgreeCheckbox() throws Exception {
        return By.xpath(get("Agree_Checkbox"));
    }

    public static By InvoiceSummaryTitle() throws Exception {
        return By.xpath(get("Invoice_Summary_Title"));
    }

    public static By TransactionsButton() throws Exception {
        return By.xpath(get("Transactions_Button"));
    }

    public static By PreviewInvoiceLink() throws Exception {
        return By.xpath(get("Preview_invoice_Link"));
    }

    public static By PayNowLink() throws Exception {
        return By.xpath(get("Pay_Now_Link"));
    }

    public static By TransactionsAndTransactionsHeading() throws Exception {
        return By.xpath(get("Transactions_And_Transactions_Heading"));
    }

    public static By InvoicePreviewPopupTitle(String text) throws Exception {
        return By.xpath(get("Invoice_Preview_Popup_Title").replace("replaceText", text));
    }

    public static By BackButton() throws Exception {
        return By.xpath(get("Back_Button"));
    }

    public static By StartBiddingButton() throws Exception {
        return By.xpath(get("Start_Bidding_Button"));
    }

    public static By TermsAndConditionsCheckbox() throws Exception {
        return By.xpath(get("Terms_And_Conditions_Checkbox"));
    }

    public static By JoinThisAuctionButton() throws Exception {
        return By.xpath(get("Join_This_Auction_Button"));
    }

    public static By TotalPriceOfAuction() throws Exception {
        return By.xpath(get("Total_Price_Of_Auction"));
    }

    public static By YourBidPrice() throws Exception {
        return By.xpath(get("Your_Bid_Price"));
    }

    public static By AuctionStartingStartingPrice() throws Exception {
        return By.xpath(get("Auction_Starting_Starting_Price"));
    }

    public static By IncreaseBidPriceButton() throws Exception {
        return By.xpath(get("Increase_Bid_Price_Button"));
    }

    public static By DecreaseBidPriceButton() throws Exception {
        return By.xpath(get("Decrease_Bid_Price_Button"));
    }

    public static By FixedIncreaseNumber() throws Exception {
        return By.xpath(get("Fixed_Increase_Number"));
    }

    public static By PlaceBidButton() throws Exception {
        return By.xpath(get("Place_Bid_Button"));
    }

    public static By SubmitBidButton() throws Exception {
        return By.xpath(get("Submit_Bid_Button"));
    }

    public static By AuctionBidSuccessPopupTitle() throws Exception {
        return By.xpath(get("Auction_Bid_Success_Popup_Title"));
    }

    public static By CongratulationMessageForHighestBid() throws Exception {
        return By.xpath(get("Congratulation_Message_For_Highest_Bid"));
    }

    public static By AuctionSideMenuButton() throws Exception {
        return By.xpath(get("Auction_Side_Menu_Button"));
    }

    public static By ActiveAuctionsTab() throws Exception {
        return By.xpath(get("Active_Auctions_Tab"));
    }

    public static By ClosedAuctionsTab() throws Exception {
        return By.xpath(get("Closed_Auctions_Tab"));
    }

    public static By ViewAuctionLink() throws Exception {
        return By.xpath(get("View_Auction_Link"));
    }

    public static By ContinueButton() throws Exception {
        return By.xpath(get("Continue_Button"));
    }

    public static By SignContractPageHeading() throws Exception {
        return By.xpath(get("Sign_Contract_Page_Heading"));
    }

    public static By DownloadContractLink() throws Exception {
        return By.xpath(get("Download_Contract_Link"));
    }

    public static By RejectButton() throws Exception {
        return By.xpath(get("Reject_Button"));
    }

    public static By RejectSignContractPageHeading() throws Exception {
        return By.xpath(get("Reject_Sign_Contract_Page_Heading"));

    }

    public static By PlotInformationHeadingText() throws Exception {
        return By.xpath(get("Plot_Information_Heading_Text"));
    }

    public static By ConfirmRejectionButton() throws Exception {
        return By.xpath(get("Confirm_Rejection_Button"));
    }

    public static By ApproveButton() throws Exception {
        return By.xpath(get("Approve_Button"));
    }

    public static By RejectSuccessMessage() throws Exception {
        return By.xpath(get("Reject_Success_Message"));
    }

    public static By RejectedStatus() throws Exception {
        return By.xpath(get("Rejected_Status"));
    }

    public static By AuctionStatusDropdown() throws Exception {
        return By.xpath(get("Auction_Status_Dropdown"));
    }

    public static By AuctionStatusDropdownList() throws Exception {
        return By.xpath(get("Auction_Status_Dropdown_List"));
    }

    public static By AuctionStatus() throws Exception {
        return By.xpath(get("Auction_Status"));
    }

    public static By SearchButtonForAuction() throws Exception {
        return By.xpath(get("Search_Button_For_Auction"));
    }

    public static By AuctionStartDateInput() throws Exception {
        return By.xpath(get("Auction_Start_Date_Input"));
    }

    public static By AuctionEndDateInput() throws Exception {
        return By.xpath(get("Auction_End_Date_Input"));
    }

    public static By TimerCountDown() throws Exception {
        return By.xpath(get("Timer_CountDown"));
    }

    public static By AvailableUnitLabel() throws Exception {
        return By.xpath(get("Available_Unit_Label"));
    }

    public static By maximumAreaSlider() throws Exception {
        return By.xpath(get("Maximum_Area_Slider"));
    }

    public static By MinimumAreaSlider() throws Exception {
        return By.xpath(get("Minimum_Area_Slider"));
    }

    public static By MaxRangeInput() throws Exception {
        return By.xpath(get("Max_Range_Input"));
    }

    public static By MaximizeImage() throws Exception {
        return By.xpath(get("Maximize_Image"));
    }

    public static By SearchButton() throws Exception {
        return By.xpath(("//button/span[contains(text(),'بحث')]"));
    }

    public static By AuctionStatusNew() throws Exception {
        return By.xpath("//mat-select[@formcontrolname=\"auction_status\"]/descendant::span[2]");
    }

    public static By ErrorMessage() throws Exception {
        return By.xpath("//mat-error[contains (@id, 'error')]");
    }

    public static By ProjectInformationLogs() throws Exception {
        return By.xpath("//span[contains (text(), 'سجل عمليات تحديث المشروع')]");
    }

    public static By ImportNewAuctionUnitButton() throws Exception {
        return By.xpath("//span[contains (text(), 'وحدة مزاد جديدة للاستيراد')]");
    }

    public static By UnitTypeDropdown() throws Exception {
        return By.xpath("//mat-select[@formcontrolname=\"unit_type\"]");
    }

    public static By UploadFile() throws Exception {
        return By.xpath("//input[@type = 'file']");
    }

    public static By AuctionLegalFiles(String text) throws Exception {
        return By.xpath(get("Auction_Legal_Files").replace("replaceText", text));
    }


    public static By DownloadTemplateButton() throws Exception {
        return By.xpath("//button[contains (text(), 'تنزيل النموذج المعتمد')]");
    }

    public static By DiscardImportButton() throws Exception {
        return By.xpath("//button [contains (text(), 'الغاء الاستيراد')]");
    }

    public static By AgreeButton() throws Exception {
        return By.xpath("//button[contains (text(), 'موافق')]");
    }

    public static By CommitButton() throws Exception {
        return By.xpath("//button[contains(text(),' اعتماد')]");
    }

    public static By ImportedUnit() throws Exception {
        return By.xpath("(//datatable-body-cell/descendant::div)[6]");
    }

    public static By UnitsModelPage() throws Exception {
        return By.xpath("//span[text() = 'حالة اعتماد نشر التصانيف']");
    }

    public static By UnitsModelPublishStatus() throws Exception {
        return By.xpath("//datatable-body-cell[2]/descendant::span");
    }

    public static By BasicInformationPage() throws Exception {
        return By.xpath("//span[contains (text(), 'المعلومات الأساسية')]");
    }

    public static By AuctionLegalTab() throws Exception {
        return By.xpath("//span[contains (text(), 'المزاد قانوني')]");
    }

    public static By DeleteIconFile() throws Exception {
        return By.xpath("//app-icon-delete-circle");
    }

    public static By AuctionSettingsTab() throws Exception {
        return By.xpath("//span[contains (text(), 'إعدادات المزاد')]");
    }

    public static By EditButton() throws Exception {
        return By.xpath("//button[contains (text(), 'تعديل')]");
    }

    public static By UpdateButton() throws Exception {
        return By.xpath("//span[contains (text(), 'تحديث')]");
    }

    public static By AuctionMediaTab() throws Exception {
        return By.xpath("//span[@class='mdc-tab__text-label']/child::span[contains(text(), 'وسائل الإعلام مشروع المزاد')]");
    }

    public static By LogoImage() throws Exception {
        return By.xpath("//h1[contains (text(), 'صورة الشعار')]/parent::div/following-sibling::div/child::input");
    }

    public static By NumberOfAssets() throws Exception {
        return By.xpath("//input[@formcontrolname=\"number_of_assets\"]");
    }

    public static By UnderSupervision() throws Exception {
        return By.xpath("//input[@formcontrolname=\"under_supervision\"]");
    }

    public static By CallNumber() throws Exception {
        return By.xpath("//input[@placeholder=\"رقم الاتصال\"]");
    }


    public static By CallNumberErrorMessage() throws Exception {
        return By.xpath("//label[contains (@class, 'invalid')]");
    }

    public static By WhatsAppNumber() throws Exception {
        return By.xpath("//input[@placeholder=\"المراسلة واتساب\"]");
    }

    public static By ValNumber() throws Exception {
        return By.xpath("//input[@formcontrolname=\"val_license\"]");
    }

    public static By SignContractBanner() throws Exception {
        return By.xpath(get("Sign_Contract_Banner"));
    }

    public static By SignContractApproveMessage() throws Exception {
        return By.xpath(get("Sign_Contract_Approve_Message"));
    }

    public static By SignContractStatus() {
        return By.xpath("//span[contains (text(), 'لقد وقعت على العقد بنجاح')]");
    }

    public static By ViewAuctionButton(String projName) {
        return By.xpath("//h5[text()= 'replaceText']/ancestor::app-collapse-box/descendant::span[contains (text(), ' عرض المزاد')]".replace("replaceText", projName));

    }

    public static By ViewInvoiceButton() {
        return By.xpath("//div[text() ='فاتورة']/parent::div/descendant::span[contains (text(), 'عرض')]");
    }

    public static By ViewContractButton() {
        return By.xpath("//div[text() ='العقد']/parent::div/descendant::span[contains (text(), 'عرض')]");
    }

    public static By ViewAcknowledgmentButton() {
        return By.xpath("//div[text() ='عرض اعترافي']/parent::div/descendant::span[contains (text(), 'عرض')]");
    }

    public static By AttachmentPopupViewerCloseButton() {
        return By.xpath("//app-modal//span");
    }
}