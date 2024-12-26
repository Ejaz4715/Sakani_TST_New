package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class PriceQuotationPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Apartment_Div", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Apartment')]");
                put("ar", "//h5[contains(text(),'شقة')]");
            }});
            put("ApartmentDiv_Loader", new HashMap<>() {{
                put("en", "//span[contains(text(),'Loading...')]");
                put("ar", "//span[contains(text(),'Loading...')]");
            }});
            put("ClickOnApartment_Div", new HashMap<>() {{
                put("en", "(//div[contains(@class,'unit-card-wrapper')])[1]");
                put("ar", "(//div[contains(@class,'unit-card-wrapper')])[1]");
            }});
            put("LowPowerWarning_MSG", new HashMap<>() {{
                put("en", "//span[contains(text(),'Purchasing power is low')]");
                put("ar", "//span[contains(text(),'القوة الشرائية منخفضة')]");
            }});
            put("ClickOnBookUnit_Button", new HashMap<>() {{
                put("en", "//span[contains(text(),'Book unit')]");
                put("ar", "//span[contains(text(),'حجز الوحدة السكنية')]");
            }});
            put("ClickOnMyActivities_BTN", new HashMap<>() {{
                put("en", "//span[contains(text(),'My activities')]");
                put("ar", "//span[contains(text(),'أنشطتي')]");
            }});
            put("ClickOnBookings_BTN", new HashMap<>() {{
                put("en", "//span[contains(text(),'Bookings')]");
                put("ar", "//span[contains(text(),'الحجوزات')]");
            }});
            put("ClickOnViewBookings_BTN", new HashMap<>() {{
                put("en", "//span[contains(text(),'View booking')]");
                put("ar", "//span[contains(text(),'عرض الحجز')]");
            }});
            put("ClickOnCancelForSignContract_BTN", new HashMap<>() {{
                put("en", "//button[contains(text(),'Cancel')]");
                put("ar", "//button[contains(text(),'إلغاء')]");
            }});
            put("PriceQuotation_Label", new HashMap<>() {{
                put("en", "//div[contains(text(),'Price quotation')]");
                put("ar", "//div[contains(text(),'عرض السعر')]");
            }});
            put("QuotationPriceView_BTN", new HashMap<>() {{
                put("en", "//div[contains(@class,'d-flex flex-row justify-content-between')]//child::span[contains(text(),'عرض')]");
                put("ar", "//div[contains(@class,'d-flex flex-row justify-content-between')]//child::span[contains(text(),'عرض')]");
            }});
            put("ClickOnApproveContract_BTN", new HashMap<>() {{
                put("en", "//button[contains(text(),'Approve')]");
                put("ar", "//button[contains(text(),'اعتماد')]");
            }});
            put("Success_MSG", new HashMap<>() {{
                put("en", "//h4[contains(text(),'Congratulation')]");
                put("ar", "//h4[contains(text(),'تهانينا')]");
            }});
            put("Contract_PopUp", new HashMap<>() {{
                put("en", "//p[contains(text(),'Price quotation')]");
                put("ar", "//p[contains(text(),'عرض السعر')]");
            }});
            put("ActionsAndDocuments_Title", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Actions & Documents')]");
                put("ar", "//h5[contains(text(),'الإجراءات والمستندات')]");
            }});
            put("DownloadDocument_Frame", new HashMap<>() {{
                put("en", "//iframe[contains(@src, 'blob:https://stg-sakani.housingapps.sa')]");
                put("ar", "//iframe[contains(@src, 'blob:https://stg-sakani.housingapps.sa')]");
            }});
            put("unit_Code", new HashMap<>() {{
                put("en", "(//div[contains(@class,'d-flex m-start')])[1]");
                put("ar", "(//div[contains(@class,'d-flex m-start')])[1]");
            }});
            put("ClickOnConfirmBooking_BTN", new HashMap<>() {{
                put("en", "//button//span[contains(text(),'Confirm Booking')]");
                put("ar", "//button//span[contains(text(), 'تأكيد الحجز')]");
            }});
            put("BookingConfirmed_MSG", new HashMap<>() {{
                put("en", "//h4[contains(text(),'Booking confirmed')]");
                put("ar", "//h4[contains(text(),'تاكيد الحجز')]");
            }});
            put("cLoseRatingPopUp_MSG", new HashMap<>() {{
                put("en", "//h4[contains(text(),'Tell us about your impression')]");
                put("ar", "//h4[contains(text(),'أخبرنا عن انطباعك')]");
            }});
            put("ratingCancel_BTN", new HashMap<>() {{
                put("en", "//button[normalize-space()='Cancel']");
                put("ar", "//button[normalize-space()='إلغاء']");
            }});
            put("EligibilityExistence_Title", new HashMap<>() {{
                put("en", "//h4[contains(text(),'Eligibility')]");
                put("ar", "//h4[contains(text(),'الاستحقاق')]");
            }});
            put("userIsEligible_Content", new HashMap<>() {{
                put("en", "//p[contains(text(),'You are eligible for housing support')]");
                put("ar", "//p[contains(text(),'تهانينا، أنت الآن مستحق للدعم السكني')]");
            }});
            put("priceExceedsFinancialWarning_MSG", new HashMap<>() {{
                put("en", "//span[contains(text(),'Price exceeds Financial Recommendations')]");
                put("ar", "//span[contains(text(),'السعر يتجاوز قيمة القدرة الشرائية')]");
            }});
            put("UpdateFinancialAdvisory_Link", new HashMap<>() {{
                put("en", "//span[contains(text(),'Update Financial Advisory')]");
                put("ar", "(//span[contains(text(),'تحديث القدرة الشرائية')])[2]");
            }});
            put("PersonalFinancial_Info", new HashMap<>() {{
                put("en", "//h2[contains(text(),'Personal & Financial')]");
                put("ar", "//h2[contains(text(),'المعلومات الشخصية والمالية')]");
            }});
            put("UpdateFinancialAdvisoryClickable_Link", new HashMap<>() {{
                put("en", "//a[contains(@class,'text-decoration-none align-items-center cursor-pointer ng-star-inserted')]");
                put("ar", "//a[contains(@class,'text-decoration-none align-items-center cursor-pointer ng-star-inserted')]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By ApartmentDiv() throws Exception {
        return By.xpath(get("Apartment_Div"));
    }

    public static By ApartmentDivLoader() throws Exception {
        return By.xpath(get("ApartmentDiv_Loader"));
    }

    public static By ClickOnApartment() throws Exception {
        return By.xpath(get("ClickOnApartment_Div"));
    }

    public static By LowPowerWarningMSG() throws Exception {
        return By.xpath(get("LowPowerWarning_MSG"));
    }

    public static By ClickOnBookUnitButton() throws Exception {
        return By.xpath(get("ClickOnBookUnit_Button"));
    }

    public static By ClickOnMyActivitiesBTN() throws Exception {
        return By.xpath(get("ClickOnMyActivities_BTN"));
    }

    public static By ClickOnBookingsBTN() throws Exception {
        return By.xpath(get("ClickOnBookings_BTN"));
    }

    public static By ClickOnViewBookingsBTN() throws Exception {
        return By.xpath(get("ClickOnViewBookings_BTN"));
    }

    public static By ClickOnCancelForSignContractBTN() throws Exception {
        return By.xpath(get("ClickOnCancelForSignContract_BTN"));
    }

    public static By PriceQuotationLabel() throws Exception {
        return By.xpath(get("PriceQuotation_Label"));
    }

    public static By QuotationPriceViewBTN() throws Exception {
        return By.xpath(get("QuotationPriceView_BTN"));
    }

    public static By ActionsAndDocumentsTitle() throws Exception {
        return By.xpath(get("ActionsAndDocuments_Title"));
    }

    public static By ClickOnApproveContractBTN() throws Exception {
        return By.xpath(get("ClickOnApproveContract_BTN"));
    }

    public static By ContractPopUp() throws Exception {
        return By.xpath(get("Contract_PopUp"));
    }

    public static By DownloadDocumentFrame() throws Exception {
        return By.xpath(get("DownloadDocument_Frame"));
    }

    public static By unitCode() throws Exception {
        return By.xpath(get("unit_Code"));
    }

    public static By ClickOnConfirmBookingBTN() throws Exception {
        return By.xpath(get("ClickOnConfirmBooking_BTN"));
    }

    public static By cLoseRatingPopUpMSG() throws Exception {
        return By.xpath(get("cLoseRatingPopUp_MSG"));
    }

    public static By ratingCancelBTN() throws Exception {
        return By.xpath(get("ratingCancel_BTN"));
    }

    public static By BookingConfirmedMSG() throws Exception {
        return By.xpath(get("BookingConfirmed_MSG"));
    }

    public static By EligibilityExistence() throws Exception {
        return By.xpath(get("EligibilityExistence_Title"));
    }

    public static By userIsEligible() throws Exception {
        return By.xpath(get("userIsEligible_Content"));
    }

    public static By priceExceedsFinancialWarningMSG() throws Exception {
        return By.xpath(get("priceExceedsFinancialWarning_MSG"));
    }

    public static By UpdateFinancialAdvisoryLink() throws Exception {
        return By.xpath(get("UpdateFinancialAdvisory_Link"));
    }

    public static By PersonalFinancialInfo() throws Exception {
        return By.xpath(get("PersonalFinancial_Info"));
    }

    public static By UpdateFinancialAdvisoryClickableLink() throws Exception {
        return By.xpath(get("UpdateFinancialAdvisoryClickable_Link"));
    }
}
