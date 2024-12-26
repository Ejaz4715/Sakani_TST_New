package sa.nhc.web.objects.exisitng;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class CheckEligibilityPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("DDL_Current_Region", new HashMap<>(){{
            put ("en", "//input[@formcontrolname='region_id']/preceding-sibling::app-region-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname='region_id']/preceding-sibling::app-region-selector/descendant::ng-select/div");
        }});
        put("DDL_Current_City", new HashMap<>(){{
            put ("en", "//input[@formcontrolname='city_id']/preceding-sibling::app-city-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname='city_id']/preceding-sibling::app-city-selector/descendant::ng-select/div");
        }});
        put("DDL_Preferred_Region", new HashMap<>(){{
            put ("en", "//input[@formcontrolname='preferred_region_id']/preceding-sibling::app-region-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname='preferred_region_id']/preceding-sibling::app-region-selector/descendant::ng-select/div");
        }});
        put("Clear_Preferred_Region", new HashMap<>(){{
            put ("en", "//input[@formcontrolname='preferred_region_id']/preceding-sibling::app-region-selector/descendant::ng-select/div//span[@title='Clear all']");
            put ("ar", "//input[@formcontrolname='preferred_region_id']/preceding-sibling::app-region-selector/descendant::ng-select/div//span[@title='حذف الكل']");
        }});
        put("DDL_Preferred_City", new HashMap<>(){{
            put ("en", "//input[@formcontrolname='preferred_city_id']/preceding-sibling::app-city-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname='preferred_city_id']/preceding-sibling::app-city-selector/descendant::ng-select/div");
        }});
        put("DDL_Preferred_District", new HashMap<>(){{
            put ("en", "//input[@formcontrolname='preferred_district_id']/preceding-sibling::app-district-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname='preferred_district_id']/preceding-sibling::app-district-selector/descendant::ng-select/div");
        }});
        put("DDL_Current_Hosing_Status", new HashMap<>(){{
            put ("en", "//app-dropdown[@formcontrolname='living_situation']/descendant::ng-select/div");
            put ("ar", "//app-dropdown[@formcontrolname=\"living_situation\"]/descendant::ng-select/div");
        }});
        put("BTN_Confirm", new HashMap<>(){{
            put ("en", "//button[@type=\"submit\"]");
            put ("ar", "//button[@type=\"submit\"]");
        }});

    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By DDLCurrentRegion () throws Exception{
        return By.xpath(get("DDL_Current_Region"));
    }

    public static By DDLCurrentCity () throws Exception{
        return By.xpath(get("DDL_Current_City"));
    }
    public static By DDLPreferredRegion () throws Exception{
        return By.xpath(get("DDL_Preferred_Region"));
    }
    public static By DDLPreferredCity () throws Exception{
        return By.xpath(get("DDL_Preferred_City"));
    }
    public static By DDLPreferredDistrict () throws Exception{
        return By.xpath(get("DDL_Preferred_District"));
    }
    public static By DDLCurrentHosingStatus () throws Exception{
        return By.xpath(get("DDL_Current_Hosing_Status"));
    }
}
