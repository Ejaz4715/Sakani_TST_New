package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class FiltersPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Buy_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Buy')]");
                put("ar", "//button[contains(text(),'الشراء')]");
            }});
            put("Location_Input_Filed", new HashMap<>() {{
                put("en", "//app-region-city-input/descendant::input | //app-city-district-input/descendant::input");
                put("ar", "//app-region-city-input/descendant::input | //app-city-district-input/descendant::input");
            }});
            put("Location_Dropdown_List", new HashMap<>() {{
                put("en", "//app-region-city-input/ng-select/div | //app-city-district-input/ng-select/div");
                put("ar", "//app-region-city-input/ng-select/div | //app-city-district-input/ng-select/div");
            }});
            put("Not_Found_Option", new HashMap<>() {{
                put("en", "//div[contains(@class,'option-disabled')]");
                put("ar", "//div[contains(@class,'option-disabled')]");
            }});
            put("Mega_Project_Input_Filed", new HashMap<>() {{
                put("en", "//app-mega-project-input/descendant::input");
                put("ar", "//app-mega-project-input/descendant::input");
            }});
            put("Mega_Project_Dropdown_List", new HashMap<>() {{
                put("en", "//app-mega-project-input/ng-select/div");
                put("ar", "//app-mega-project-input/ng-select/div");
            }});
            put("Project_Dropdown_List", new HashMap<>() {{
                put("en", "//app-marketplace-project-input/ng-select/div");
                put("ar", "//app-marketplace-project-input/ng-select/div");
            }});
            put("Target_Audience_Button", new HashMap<>() {{
                put("en", "//div//span[contains(@id,'select-one-group')]");
                put("ar", "//div//span[contains(@id,'select-one-group')]");
            }});
            put("Minimum_Price_Input_Field", new HashMap<>() {{
                put("en", "//app-range-slider[@formcontrolname='price_range']/descendant::input[@formcontrolname='low']");
                put("ar", "//app-range-slider[@formcontrolname='price_range']/descendant::input[@formcontrolname='low']");
            }});
            put("Maximum_Price_Input_Field", new HashMap<>() {{
                put("en", "//app-range-slider[@formcontrolname='price_range']/descendant::input[@formcontrolname=\"high\"]");
                put("ar", "//app-range-slider[@formcontrolname=\"price_range\"]/descendant::input[@formcontrolname=\"high\"]");
            }});
            put("Error_Message", new HashMap<>() {{
                put("en", "//div[@class=\"text-red error-message\"]/p");
                put("ar", "//div[@class=\"text-red error-message\"]/p");
            }});
            put("Units_Under_Construction_Project_Option", new HashMap<>() {{
                put("en", "//app-chip-input[@formcontrolname=\"project_type\"]/descendant::span[contains(text(),'Units Under Construction')]");
                put("ar", "//app-chip-input[@formcontrolname=\"project_type\"]/descendant::span[contains(text(),'مشاريع تحت الإنشاء')]");
            }});
            put("Apartment_Unit_Option", new HashMap<>() {{
                put("en", "//app-chip-input[@formcontrolname=\"unit_type\"]/descendant::span[contains(text(),'Apartment')]");
                put("ar", "//app-chip-input[@formcontrolname=\"unit_type\"]/descendant::span[contains(text(),'شقة')]");
            }});
            put("All_Units_Option", new HashMap<>() {{
                put("en", "//app-chip-input[@formcontrolname=\"unit_type\"]/descendant::span");
                put("ar", "//app-chip-input[@formcontrolname=\"unit_type\"]/descendant::span");
            }});
            put("ReadyMade_Units_Project_Option", new HashMap<>() {{
                put("en", "//app-chip-input[@formcontrolname=\"project_type\"]/descendant::span[contains(text(),'Readymade Units')]");
                put("ar", "//app-chip-input[@formcontrolname=\"project_type\"]/descendant::span[contains(text(),'وحدات جاهزة')]");
            }});
            put("Lands_Project_Option", new HashMap<>() {{
                put("en", "//app-chip-input[@formcontrolname=\"project_type\"]/descendant::span[contains(text(),'Lands')]");
                put("ar", "//app-chip-input[@formcontrolname=\"project_type\"]/descendant::span[contains(text(),'أراضي')]");
            }});
            put("All_Lands_Units_Option", new HashMap<>() {{
                put("en", "//app-single-option-input[@formcontrolname=\"land_type\"]/descendant::span");
                put("ar", "//app-single-option-input[@formcontrolname=\"land_type\"]/descendant::span");
            }});
            put("Minimum_Area_Input_Field", new HashMap<>() {{
                put("en", "//app-range-slider[@formcontrolname=\"area_range\"]/descendant::input[@formcontrolname=\"low\"]");
                put("ar", "//app-range-slider[@formcontrolname=\"area_range\"]/descendant::input[@formcontrolname=\"low\"]");
            }});
            put("Maximum_Area_Input_Field", new HashMap<>() {{
                put("en", "//app-range-slider[@formcontrolname=\"area_range\"]/descendant::input[@formcontrolname=\"high\"]");
                put("ar", "//app-range-slider[@formcontrolname=\"area_range\"]/descendant::input[@formcontrolname=\"high\"]");
            }});
            put("One_BedRoom_Option", new HashMap<>() {{
                put("en", "//app-chip-input[@formcontrolname=\"num_of_rooms\"]/descendant::span[contains(text(),'1')]");
                put("ar", "//app-chip-input[@formcontrolname=\"num_of_rooms\"]/descendant::span[contains(text(),'1')]");
            }});
            put("All_BedRooms_Option", new HashMap<>() {{
                put("en", "//app-chip-input[@formcontrolname=\"num_of_rooms\"]/descendant::span");
                put("ar", "//app-chip-input[@formcontrolname=\"num_of_rooms\"]/descendant::span");
            }});
            put("Apply_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Apply')]");
                put("ar", "//button[contains(text(),'بحث')]");
            }});
            put("Apply_Result", new HashMap<>() {{
                put("en", "//div[contains(@class,'address')]");
                put("ar", "//div[contains(@class,'address')]");
            }});
            put("Apply_Result_For_Project", new HashMap<>() {{
                put("en", "(//app-marketplace-project-card/descendant::a)[1]");
                put("ar", "(//app-marketplace-project-card/descendant::a)[1]");
            }});
            put("Close_X_Button", new HashMap<>() {{
                put("en", "//span[contains(@class,'icon-cross')]");
                put("ar", "//span[contains(@class,'icon-cross')]");
            }});
            put("No_Results_Message", new HashMap<>() {{
                put("en", "//app-marketplace-list/descendant::p");
                put("ar", "//app-marketplace-list/descendant::p");
            }});
            put("Rent_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Rent')]");
                put("ar", "//button[contains(text(),'إيجار')]");
            }});
            put("Auction_Button", new HashMap<>() {{
                put("en", "//button[contains(text(),'Auction')]");
                put("ar", "//button[contains(text(),'مزاد')]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By buyButton() throws Exception {
        return By.xpath(get("Buy_Button"));
    }

    public static By locationInputFiled() throws Exception {
        return By.xpath(get("Location_Input_Filed"));
    }

    public static By locationDropdownList() throws Exception {
        return By.xpath(get("Location_Dropdown_List"));
    }

    public static By notFoundOption() throws Exception {
        return By.xpath(get("Not_Found_Option"));
    }

    public static By megaProjectInputFiled() throws Exception {
        return By.xpath(get("Mega_Project_Input_Filed"));
    }

    public static By megaProjectDropdownList() throws Exception {
        return By.xpath(get("Mega_Project_Dropdown_List"));
    }

    public static By projectDropdownList() throws Exception {
        return By.xpath(get("Project_Dropdown_List"));
    }

    public static By targetAudienceButton() throws Exception {
        return By.xpath(get("Target_Audience_Button"));
    }

    public static By minimumPriceInputField() throws Exception {
        return By.xpath(get("Minimum_Price_Input_Field"));
    }

    public static By maximumPriceInputField() throws Exception {
        return By.xpath(get("Maximum_Price_Input_Field"));
    }

    public static By errorMessage() throws Exception {
        return By.xpath(get("Error_Message"));
    }

    public static By unitsUnderConstructionProjectOption() throws Exception {
        return By.xpath(get("Units_Under_Construction_Project_Option"));
    }

    public static By apartmentUnitOption() throws Exception {
        return By.xpath(get("Apartment_Unit_Option"));
    }

    public static By allUnitsOption() throws Exception {
        return By.xpath(get("All_Units_Option"));
    }

    public static By readyMadeUnitsProjectOption() throws Exception {
        return By.xpath(get("ReadyMade_Units_Project_Option"));
    }

    public static By landsProjectOption() throws Exception {
        return By.xpath(get("Lands_Project_Option"));
    }

    public static By allLandsUnitsOption() throws Exception {
        return By.xpath(get("All_Lands_Units_Option"));
    }

    public static By minimumAreaInputField() throws Exception {
        return By.xpath(get("Minimum_Area_Input_Field"));
    }

    public static By maximumAreaInputField() throws Exception {
        return By.xpath(get("Maximum_Area_Input_Field"));
    }

    public static By oneBedRoomOption() throws Exception {
        return By.xpath(get("One_BedRoom_Option"));
    }

    public static By allBedRoomsOption() throws Exception {
        return By.xpath(get("All_BedRooms_Option"));
    }

    public static By applyButton() throws Exception {
        return By.xpath(get("Apply_Button"));
    }

    public static By applyResult() throws Exception {
        return By.xpath(get("Apply_Result"));
    }

    public static By applyResultForProject() throws Exception {
        return By.xpath(get("Apply_Result_For_Project"));
    }

    public static By closeXButton() throws Exception {
        return By.xpath(get("Close_X_Button"));
    }

    public static By noResultsMessage() throws Exception {
        return By.xpath(get("No_Results_Message"));
    }

    public static By rentButton() throws Exception {
        return By.xpath(get("Rent_Button"));
    }

    public static By auctionButton() throws Exception {
        return By.xpath(get("Auction_Button"));
    }
}
