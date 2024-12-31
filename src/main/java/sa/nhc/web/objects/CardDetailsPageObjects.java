package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class CardDetailsPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("ClickOnCard_Div", new HashMap<>() {{
                put("en", "//div[contains(@class,'project-name')]");
                put("ar", "//div[contains(@class,'project-name')]");
            }});

            put("TagLabelCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "//div[contains(@class,'d-flex flex-row gap-2 align-items-center')]");
                put("ar", "//div[contains(@class,'d-flex flex-row gap-2 align-items-center')]");
            }});
            put("ClickOnTheSearchedCard_Div", new HashMap<>() {{
                put("en", "//a[contains(@class,'cursor-pointer text-decoration-none ng-star-inserted')]");
                put("ar", "//a[contains(@class,'cursor-pointer text-decoration-none ng-star-inserted')]");
            }});
            put("NameLabel_Existence", new HashMap<>() {{
                put("en", "//div[contains(@class,'project-name')]");
                put("ar", "//div[contains(@class,'project-name')]");
            }});
            put("AddressLabel_Existence", new HashMap<>() {{
                put("en", "//div[contains(@class,'address one-line-text text-break')]");
                put("ar", "//div[contains(@class,'address one-line-text text-break')]");
            }});
            put("DetailsLabel_Existence", new HashMap<>() {{
                put("en", "//div[contains(@class,'text-neutral-n5 one-line-text ng-star-inserted')]");
                put("ar", "//div[contains(@class,'text-neutral-n5 one-line-text ng-star-inserted')]");
            }});
            put("NameLabelCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "//h2[contains(@class,'fs-2 fw-bold text-secondary m-0 ng-star-inserted')]");
                put("ar", "//h2[contains(@class,'fs-2 fw-bold text-secondary m-0 ng-star-inserted')]");
            }});
            put("AddressLabelCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "(//div[contains(@class,'d-flex align-items-center gap-2 fs-6 lh-base text-dark-gray mt-1')])[1]");
                put("ar", "(//div[contains(@class,'d-flex align-items-center gap-2 fs-6 lh-base text-dark-gray mt-1')])[1]");
            }});
            put("LandProjectAddress_Existence", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Location')]");
                put("ar", "//h5[contains(text(),'الموقع')]");
            }});
            put("LandProjectName_Existence", new HashMap<>() {{
                put("en", "//h2[contains(@class,'m-0 ng-star-inserted')]");
                put("ar", "//h2[contains(@class,'m-0 ng-star-inserted')]");
            }});
            put("DetailsLabelCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "//p[contains(@class,'mb-4 mt-4 fs-6 lh-base text-dark-gray ng-star-inserted')]");
                put("ar", "//p[contains(@class,'mb-4 mt-4 fs-6 lh-base text-dark-gray ng-star-inserted')]");
            }});
            put("LandProjectPlotList_Existence", new HashMap<>() {{
                put("en", "//div[contains(text(),'Plot list')]");
                put("ar", "//div[contains(text(),'المخطط')]");
            }});
            put("LandProjectDetails_Existence", new HashMap<>() {{
                put("en", "//div[contains(text(),'Project details')]");
                put("ar", "//div[contains(text(),'تفاصيل المشروع')]");
            }});
            put("TargetAudienceLabelCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "(//div[contains(@class,'d-flex gap-2 align-items-center mb-3')])[1]");
                put("ar", "(//div[contains(@class,'d-flex gap-2 align-items-center mb-3')])[1]");
            }});
            put("ProjectTypeLabelCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "//span[contains(@class,'text-secondary fw-bold fs-6 lh-base ng-star-inserted')]");
                put("ar", "//span[contains(@class,'text-secondary fw-bold fs-6 lh-base ng-star-inserted')]");
            }});
            put("LandProjectType_Existence", new HashMap<>() {{
                put("en", "(//h5[contains(@class,'text-secondary mb-1 ng-star-inserted')])");
                put("ar", "(//h5[contains(@class,'text-secondary mb-1 ng-star-inserted')])");
            }});
            put("MarketPriceLabelCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "(//p[contains(@class,'d-flex gap-1 mb-3 text-mid-gray fw-bold ng-star-inserted')])[1]");
                put("ar", "(//p[contains(@class,'d-flex gap-1 mb-3 text-mid-gray fw-bold ng-star-inserted')])[1]");
            }});
            put("SakaniBeneficiaryFromLabelCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "(//div[contains(@class,'d-flex gap-2 align-items-center text-primary ng-star-inserted')])[1]");
                put("ar", "(//div[contains(@class,'d-flex gap-2 align-items-center text-primary ng-star-inserted')])[1]");
            }});
            put("Tag", new HashMap<>() {{
                put("en", "(//div[contains(@class,'d-flex flex-row gap-2 align-items-center')])[1]");
                put("ar", "(//div[contains(@class,'d-flex flex-row gap-2 align-items-center')])[1]");
            }});
            put("EyeOfNumberOfViewsLabelCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "(//span[contains(@class,'svg-icon svg-icon--mid-gray icon-show')])[1]");
                put("ar", "(//span[contains(@class,'svg-icon svg-icon--mid-gray icon-show')])[1]");
            }});
            put("NumberOfViewsLabelCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "(//span[contains(@class,'text-muted')])[2]");
                put("ar", "(//span[contains(@class,'text-muted')])[2]");
            }});
            put("DirectionsButtonCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "//span[contains(text(),'Directions')]");
                put("ar", "//span[contains(text(),'الاتجاهات')]");
            }});
            put("IconOfDirectionsButtonsCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "(//span[contains(@class,'new-icon-map-view-secondary')])[1]");
                put("ar", "(//span[contains(@class,'new-icon-map-view-secondary')])[1]");
            }});
            put("ShareButtonsCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "//span[contains(text(),'Share')]");
                put("ar", "//span[contains(text(),'مشاركة')]");
            }});
            put("IconOfShareButtonCardDetailsPage_Existence", new HashMap<>() {{
                put("en", "(//span[contains(@class,'icon-shared')])[1]");
                put("ar", "(//span[contains(@class,'icon-shared')])[1]");
            }});
            put("ProjectDetails_Existence", new HashMap<>() {{
                put("en", "//button[contains(text(),'Project details')]");
                put("ar", "//button[contains(text(),'تفاصيل المشروع')]");
            }});
            put("UnitList_Existence", new HashMap<>() {{
                put("en", "//button[contains(text(),'Unit list')]");
                put("ar", "//button[contains(text(),'قائمة الوحدات')]");
            }});
            put("UnitListNumber_Existence", new HashMap<>() {{
                put("en", "//span[contains(@class,'rounded-pill text-white bg-smokey')]");
                put("ar", "//span[contains(@class,'rounded-pill text-white bg-smokey')]");
            }});
            put("BrochureView_Button", new HashMap<>() {{
                put("en", "(//span[contains(text(),'View')])[3]");
                put("ar", "(//span[contains(text(),'عرض')])[3]");
            }});
            put("MasterPlanView_Button", new HashMap<>() {{
                put("en", "(//span[contains(text(),'View')])[5]");
                put("ar", "(//span[contains(text(),'عرض')])[5]");
            }});
            put("BrochureAndMasterPlanView_Button", new HashMap<>() {{
                put("en", "(//button//span[contains(text(),'View')])[2]");
                put("ar", "(//button//span[contains(text(),'عرض')])[2]");
            }});
            put("BrochurePreview_PopUp_Existence", new HashMap<>() {{
                put("en", "//div[contains(@class,'my-5 mx-5')]");
                put("ar", "//div[contains(@class,'my-5 mx-5')]");
            }});
            put("MasterPlanPreview_PopUp_Existence", new HashMap<>() {{
                put("en", "//div[contains(@class,'d-flex justify-content-between')]");
                put("ar", "//div[contains(@class,'d-flex justify-content-between')]");
            }});
            put("BrochureAndMasterPlanPreview_PopUp_Existence", new HashMap<>() {{
                put("en", "//div[contains(@class,'modal-content')]");
                put("ar", "//div[contains(@class,'modal-content')]");
            }});
            put("UploadedFiles_Existence", new HashMap<>() {{
                put("en", "//app-thumbs-gallery");
                put("ar", "//app-thumbs-gallery");
            }});
            put("NumberOfUploadedFiles_Existence", new HashMap<>() {{
                put("en", "//span[contains(text() , 'Images')]");
                put("ar", "//span[contains(text() , 'صور')]");
            }});
            put("MediaButton_Expansion", new HashMap<>() {{
                put("en", "//div[contains(@class,'expand-section')]");
                put("ar", "//div[contains(@class,'expand-section')]");
            }});
            put("MediaPreviewPopUp_Existence", new HashMap<>() {{
                put("en", "(//app-thumbs-gallery-slider)[2]");
                put("ar", "(//app-thumbs-gallery-slider)[2]");
            }});
            put("PlotList_Existence", new HashMap<>() {{
                put("en", "//div[contains(text(),'Plot list')]");
                put("ar", "//div[contains(text(),'المخطط')]");
            }});
            put("Availability_Existence", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Availability')]");
                put("ar", "//h5[contains(text(),'توفر المنتج')]");
            }});
            put("Brochure_Existence", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Brochure & Masterplan')]");
                put("ar", "//h5[contains(text(),'عرض الكتيب')]");
            }});
            put("Masterplan_Existence", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Brochure & Masterplan')]");
                put("ar", "//h5[contains(text(),'عرض الكتيب')]");
            }});
            put("Facilities_Existence", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Facilities')]");
                put("ar", "//h5[contains(text(),'المرافق')]");
            }});
            put("OffplanUnits_Existence", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Offplan units')]");
                put("ar", "//h5[contains(text(),'وحدات تحت الإنشاء')]");
            }});
            put("ProjectDeveloper_Existence", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Project developer')]");
                put("ar", "//h5[contains(text(),'مطور المشروع')]");
            }});
            put("ParticipatingBanks_Existence", new HashMap<>() {{
                put("en", "//h5[contains(text(),'Participating banks')]");
                put("ar", "//h5[contains(text(),'البنوك المشاركة')]");
            }});
            put("FacilitiesNumber_Existence", new HashMap<>() {{
                put("en", "//div[@class='row flex-wrap gx-4']//span[contains(@class,'bg-light-purple')]");
                put("ar", "//div[@class='row flex-wrap gx-4']//span[contains(@class,'bg-light-purple')]");
            }});
            put("PlotListNumber_Existence", new HashMap<>() {{
                put("en", "//span[contains(@class,'bg-neutral-n5')]");
                put("ar", "//span[contains(@class,'bg-neutral-n5')]");
            }});
            put("BrochurePopUp_Closer", new HashMap<>() {{
                put("en", "//span[contains(@class,'svg-icon svg-icon--extra')]");
                put("ar", "//span[contains(@class,'svg-icon svg-icon--extra')]");
            }});
            put("LandProjectPrice_Existence", new HashMap<>() {{
                put("en", "//span[contains(text(),'Price')]");
                put("ar", "//span[contains(text(),'السعر')]");
            }});
            put("MediaSliderPagination_Locator", new HashMap<>() {{
                put("en", "//span[@class='text-white']");
                put("ar", "//span[@class='text-white']");
            }});
            put("MediaSlider_Button", new HashMap<>() {{
                put("en", "//div[@class='modal-content']//div[@class='swiper-button-next ng-star-inserted']");
                put("ar", "//div[@class='modal-content']//div[@class='swiper-button-next ng-star-inserted']");
            }});
            put("FirstMedia_Existence", new HashMap<>() {{
                put("en", "(//span[@class='swiper-pagination-bullet swiper-pagination-bullet-active'])[1]");
                put("ar", "(//span[@class='swiper-pagination-bullet swiper-pagination-bullet-active'])[1]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By ClickOnCardDiv() throws Exception {
        return By.xpath(get("ClickOnCard_Div"));
    }


    public static By ClickOnTheSearchedCard() throws Exception {
        return By.xpath(get("ClickOnTheSearchedCard_Div"));
    }

    public static By NameLabelExistence() throws Exception {
        return By.xpath(get("NameLabel_Existence"));
    }

    public static By AddressLabelExistence() throws Exception {
        return By.xpath(get("AddressLabel_Existence"));
    }

    public static By DetailsLabelExistence() throws Exception {
        return By.xpath(get("DetailsLabel_Existence"));
    }

    public static By NameLabelCardDetailsPageExistence() throws Exception {
        return By.xpath(get("NameLabelCardDetailsPage_Existence"));
    }

    public static By AddressLabelCardDetailsPageExistence() throws Exception {
        return By.xpath(get("AddressLabelCardDetailsPage_Existence"));
    }

    public static By LandProjectAddressExistence() throws Exception {
        return By.xpath(get("LandProjectAddress_Existence"));
    }

    public static By LandProjectNameExistence() throws Exception {
        return By.xpath(get("LandProjectName_Existence"));
    }

    public static By LandProjectDetailsExistence() throws Exception {
        return By.xpath(get("LandProjectDetails_Existence"));
    }

    public static By LandProjectPlotListExistence() throws Exception {
        return By.xpath(get("LandProjectPlotList_Existence"));
    }

    public static By DetailsLabelCardDetailsPageExistence() throws Exception {
        return By.xpath(get("DetailsLabelCardDetailsPage_Existence"));
    }

    public static By ProjectTypeLabelCardDetailsPageExistence() throws Exception {
        return By.xpath(get("ProjectTypeLabelCardDetailsPage_Existence"));
    }

    public static By LandProjectTypeExistence() throws Exception {
        return By.xpath(get("LandProjectType_Existence"));
    }

    public static By TargetAudienceLabelCardDetailsPageExistence() throws Exception {
        return By.xpath(get("TargetAudienceLabelCardDetailsPage_Existence"));
    }

    public static By MarketPriceFromLabelCardDetailsPageExistence() throws Exception {
        return By.xpath(get("MarketPriceLabelCardDetailsPage_Existence"));
    }

    public static By LandProjectPriceExistence() throws Exception {
        return By.xpath(get("LandProjectPrice_Existence"));
    }


    public static By SakaniBeneficiaryFromLabelCardDetailsPageExistence() throws Exception {
        return By.xpath(get("SakaniBeneficiaryFromLabelCardDetailsPage_Existence"));
    }

    public static By TagLabelCardDetailsPageExistence() throws Exception {
        return By.xpath(get("TagLabelCardDetailsPage_Existence"));
    }

    public static By NumberOfViewsLabelCardDetailsPageExistence() throws Exception {
        return By.xpath(get("NumberOfViewsLabelCardDetailsPage_Existence"));
    }

    public static By EyeOfNumberOfViewsLabelCardDetailsPageExistence() throws Exception {
        return By.xpath(get("EyeOfNumberOfViewsLabelCardDetailsPage_Existence"));
    }

    public static By DirectionsButtonCardDetailsPageExistence() throws Exception {
        return By.xpath(get("DirectionsButtonCardDetailsPage_Existence"));
    }

    public static By IconOfDirectionsButtonCardDetailsPageExistence() throws Exception {
        return By.xpath(get("IconOfDirectionsButtonsCardDetailsPage_Existence"));
    }

    public static By ShareButtonCardDetailsPageExistence() throws Exception {
        return By.xpath(get("ShareButtonsCardDetailsPage_Existence"));
    }

    public static By IconOfShareButtonCardDetailsPageExistence() throws Exception {
        return By.xpath(get("IconOfShareButtonCardDetailsPage_Existence"));
    }

    public static By ProjectDetailsExistence() throws Exception {
        return By.xpath(get("ProjectDetails_Existence"));
    }

    public static By UnitListExistence() throws Exception {
        return By.xpath(get("UnitList_Existence"));
    }

    public static By UnitListNumberExistence() throws Exception {
        return By.xpath(get("UnitListNumber_Existence"));
    }

    public static By BrochurePreviewPopUpExistence() throws Exception {
        return By.xpath(get("BrochurePreview_PopUp_Existence"));
    }

    public static By MasterPlanPreviewPopUpExistence() throws Exception {
        return By.xpath(get("MasterPlanPreview_PopUp_Existence"));
    }

    public static By BrochureAndMasterPlanPreviewPopUpExistence() throws Exception {
        return By.xpath(get("BrochureAndMasterPlanPreview_PopUp_Existence"));
    }

    public static By BrochureViewButton() throws Exception {
        return By.xpath(get("BrochureView_Button"));
    }

    public static By MasterPlanViewButton() throws Exception {
        return By.xpath(get("MasterPlanView_Button"));
    }

    public static By UploadedFilesExistence() throws Exception {
        return By.xpath(get("UploadedFiles_Existence"));
    }

    public static By NumberOfUploadedFilesExistence() throws Exception {
        return By.xpath(get("NumberOfUploadedFiles_Existence"));
    }

    public static By MediaButtonExpansion() throws Exception {
        return By.xpath(get("MediaButton_Expansion"));
    }

    public static By MediaPreviewPopUpExistence() throws Exception {
        return By.xpath(get("MediaPreviewPopUp_Existence"));
    }

    public static By PlotListExistence() throws Exception {
        return By.xpath(get("PlotList_Existence"));
    }

    public static By AvailabilityExistence() throws Exception {
        return By.xpath(get("Availability_Existence"));
    }

    public static By BrochureExistence() throws Exception {
        return By.xpath(get("Brochure_Existence"));
    }

    public static By MasterplanExistence() throws Exception {
        return By.xpath(get("Masterplan_Existence"));
    }

    public static By FacilitiesExistence() throws Exception {
        return By.xpath(get("Facilities_Existence"));
    }

    public static By BrochureAndMasterPlanViewButton() throws Exception {
        return By.xpath(get("BrochureAndMasterPlanView_Button"));
    }

    public static By FacilitiesNumberExistence() throws Exception {
        return By.xpath(get("FacilitiesNumber_Existence"));
    }

    public static By PlotListNumberExistence() throws Exception {
        return By.xpath(get("PlotListNumber_Existence"));
    }

    public static By ParticipatingBanksExistence() throws Exception {
        return By.xpath(get("ParticipatingBanks_Existence"));
    }

    public static By ProjectDeveloperExistence() throws Exception {
        return By.xpath(get("ProjectDeveloper_Existence"));
    }

    public static By OffplanUnitsExistence() throws Exception {
        return By.xpath(get("OffplanUnits_Existence"));
    }

    public static By BrochurePopUpCloser() throws Exception {
        return By.xpath(get("BrochurePopUp_Closer"));
    }

    public static By MediaSliderPaginationLocator() throws Exception {
        return By.xpath(get("MediaSliderPagination_Locator"));
    }

    public static By MediaSliderButton() throws Exception {
        return By.xpath(get("MediaSlider_Button"));
    }

    public static By FirstMediaExistence() throws Exception {
        return By.xpath(get("FirstMedia_Existence"));
    }
}
