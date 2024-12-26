package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class TagsPageObject {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("label", new HashMap<>() {{
                put("en", "//div[contains(@class, 'tag fw-bold tag--grey ng-star-inserted')]");
                put("ar", "//div[contains(@class, 'tag fw-bold tag--grey ng-star-inserted')]");
            }});
            put("BookingsOpen_Label", new HashMap<>() {{
                put("en", "//div[contains(text(),'Bookings open')]");
                put("ar", "//div[contains(text(),'متاح للحجز')]");
            }});
            put("NumberOfAvailableLands_Label", new HashMap<>() {{
                put("en", "//div[contains(text(), 'available plots')]");
                put("ar", "//div[contains(text(), 'قطع الأراضي')]");
            }});
            put("NumberOfAvailableUnits_Label", new HashMap<>() {{
                put("en", "//div[contains(text(), 'available units')]");
                put("ar", "//div[contains(text(), 'المتبقي من الوحدات')]");
            }});
            put("SoldOut_Label", new HashMap<>() {{
                put("en", "//div[contains(text(), 'Sold out')]");
                put("ar", "//div[contains(text(), 'نفدت')]");
            }});
            put("FullyBooked_Label", new HashMap<>() {{
                put("en", "//div[contains(text(), 'Fully booked')]");
                put("ar", "//div[contains(text(), 'محجوز بالكامل')]");
            }});
            put("Promoted_Label", new HashMap<>() {{
                put("en", "//div[contains(text(), 'Promoted')]");
                put("ar", "//div[contains(text(), 'مميز')]");
            }});
            put("RegisteringInterest_Label", new HashMap<>() {{
                put("en", "//div[contains(text(), 'Registering Interest')]");
                put("ar", "//div[contains(text(), 'تسجيل الاهتمام متاح')]");
            }});
            put("WaitingList_Label", new HashMap<>() {{
                put("en", "//div[contains(text(), 'Units available soon')]");
                put("ar", "//div[contains(text(), 'سيتم إتاحة الوحدات قريبًا')]");
            }});
            put("PromotedLabelsInFirst_index", new HashMap<>() {{
                put("en", "//div[contains(@class, 'tag fw-bold tag')]");
                put("ar", "//div[contains(@class, 'tag fw-bold tag')]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By LabelExistence() throws Exception {
        return By.xpath(get("label"));
    }

    public static By BookingsOpenLabel() throws Exception {
        return By.xpath(get("BookingsOpen_Label"));
    }

    public static By NumberOfAvailableLandsLabel() throws Exception {
        return By.xpath(get("NumberOfAvailableLands_Label"));
    }

    public static By NumberOfAvailableUnitsLabel() throws Exception {
        return By.xpath(get("NumberOfAvailableUnits_Label"));
    }

    public static By SoldOutLabel() throws Exception {
        return By.xpath(get("SoldOut_Label"));
    }

    public static By FullyBookedLabel() throws Exception {
        return By.xpath(get("FullyBooked_Label"));
    }

    public static By PromotedLabel() throws Exception {
        return By.xpath(get("Promoted_Label"));
    }

    public static By RegisteringInterestLabel() throws Exception {
        return By.xpath(get("RegisteringInterest_Label"));
    }

    public static By WaitingListLabel() throws Exception {
        return By.xpath(get("WaitingList_Label"));
    }

    public static By PromotedLabelsInFirstIndex() throws Exception {
        return By.xpath(get("PromotedLabelsInFirst_index"));
    }
}
