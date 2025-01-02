package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class SortingPageObject {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("sort_btn", new HashMap<>() {{
                put("en", "//span[contains(text(),'Sort by')]");
                put("ar", "//span[contains(text(),'ترتيب حسب')]");
            }});
            put("sort_popUp_header", new HashMap<>() {{
                put("en", "//h3[contains(text(),'Sort')]");
                put("ar", "//h3[contains(text(),'ترتيب حسب')]");
            }});
            put("close_sort_btn", new HashMap<>() {{
                put("en", "//span[contains(@class,'cursor-pointer')]");
                put("ar", "//span[contains(@class,'cursor-pointer')]");
            }});
            put("recommended_sort_option", new HashMap<>() {{
                put("en", "//app-marketplace-sort[1]/div[2]/div[1]");
                put("ar", "//app-marketplace-sort[1]/div[2]/div[1]");
            }});
            put("mostPop_sort_option", new HashMap<>() {{
                put("en", "//app-marketplace-sort[1]/div[2]/div[2]");
                put("ar", "//app-marketplace-sort[1]/div[2]/div[2]");
            }});
            put("newest_sort_option", new HashMap<>() {{
                put("en", "//app-marketplace-sort[1]/div[2]/div[3]");
                put("ar", "//app-marketplace-sort[1]/div[2]/div[3]");
            }});
            put("oldest_sort_option", new HashMap<>() {{
                put("en", "//app-marketplace-sort[1]/div[2]/div[4]");
                put("ar", "//app-marketplace-sort[1]/div[2]/div[4]");
            }});
            put("project_sort_option", new HashMap<>() {{
                put("en", "//app-marketplace-sort[1]/div[2]/div[5]");
                put("ar", "//app-marketplace-sort[1]/div[2]/div[5]");
            }});
            put("unit_sort_option", new HashMap<>() {{
                put("en", "//app-marketplace-sort[1]/div[2]/div[6]");
                put("ar", "//app-marketplace-sort[1]/div[2]/div[6]");
            }});
            put("highPrice_sort_option", new HashMap<>() {{
                put("en", "//app-marketplace-sort[1]/div[2]/div[7]");
                put("ar", "//app-marketplace-sort[1]/div[2]/div[7]");
            }});
            put("lowPrice_sort_option", new HashMap<>() {{
                put("en", "//app-marketplace-sort[1]/div[2]/div[8]");
                put("ar", "//app-marketplace-sort[1]/div[2]/div[8]");
            }});
            put("recommended_sorting_selected", new HashMap<>() {{
                put("en", "//span[contains(text(),'Recommended')]");
                put("ar", "//span[contains(text(),'موصى لك')]");
            }});
            put("mostPopular_sorting_selected", new HashMap<>() {{
                put("en", "//span[contains(text(),'Most popular')]");
                put("ar", "//span[contains(text(),'الأكثر شهرة')]");
            }});
            put("highPriceFirst_sorting_selected", new HashMap<>() {{
                put("en", "//span[contains(text(),'Price: High to low')]");
                put("ar", "//span[contains(text(),'السعر الاعلى الى الادنى')]");
            }});
            put("lowPriceFirst_sorting_selected", new HashMap<>() {{
                put("en", "//span[contains(text(),'Price: Low to high')]");
                put("ar", "//span[contains(text(),'السعر من الارخص للاعلى')]");
            }});
            put("promotedLabel", new HashMap<>() {{
                put("en", "//div[contains(text(),'Promoted')]");
                put("ar", "//div[contains(text(),'مميز')]");
            }});

            put("promotedLabel_1", new HashMap<>() {{
                put("en", "(//div[contains(text(),' Promoted ')])[1]");
                put("ar", "(//div[contains(text(),' مميز ')])[1]");
            }});
            put("promotedLabel_2", new HashMap<>() {{
                put("en", "(//div[contains(text(),'Promoted')])[2]");
                put("ar", "(//div[contains(text(),' مميز')])[2]");
            }});
            put("promotedLabel_3", new HashMap<>() {{
                put("en", "(//div[contains(text(),' Promoted ')])[3]");
                put("ar", "(//div[contains(text(),' مميز ')])[3]");
            }});
            put("promotedLabel_4", new HashMap<>() {{
                put("en", "(//div[contains(text(),' Promoted ')])[4]");
                put("ar", "(//div[contains(text(),' مميز ')])[4]");
            }});
            put("testProject", new HashMap<>() {{
                put("en", "//div[contains(text(),'Test Project - 5Jun')]");
                put("ar", "//div[contains(text(),'Test Project - 5Jun')]");
            }});
            put("projectTitle", new HashMap<>() {{
                put("en", "//span[contains(text(),'project')]");
                put("ar", "//span[contains(text(),'تحت الإنشاء')]");
            }});
            put("unitTitle", new HashMap<>() {{
                put("en", "(//app-breadcrumb/descendant::span)[2]");
                put("ar", "(//app-breadcrumb/descendant::span)[2]");
            }});
            put("numberOfViews", new HashMap<>() {{
                put("en", "(//span[@class='text-muted'])[1]");
                put("ar", "(//span[@class='text-muted'])[1]");
            }});
            put("marketplace_project_1", new HashMap<>() {{
                put("en", "//app-marketplace-card[1]");
                put("ar", "//app-marketplace-card[1]");
            }});
            put("marketplace_project_2", new HashMap<>() {{
                put("en", "//app-marketplace-card[2]");
                put("ar", "//app-marketplace-card[2]");
            }});
            put("marketplace_project_3", new HashMap<>() {{
                put("en", "//app-marketplace-card[3]");
                put("ar", "//app-marketplace-card[3]");
            }});
            put("marketplace_price_1", new HashMap<>() {{
                put("en", "(//span[@class='fw-bold ng-star-inserted'])[1]");
                put("ar", "(//span[@class='fw-bold ng-star-inserted'])[1]");
            }});
            put("marketplace_price_2", new HashMap<>() {{
                put("en", "(//span[@class='fw-bold ng-star-inserted'])[2]");
                put("ar", "(//span[@class='fw-bold ng-star-inserted'])[2]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }
    public static By sort_btn() throws Exception {
        return By.xpath(get("sort_btn"));
    }

    public static By sort_popUp_header() throws Exception {
        return By.xpath(get("sort_popUp_header"));
    }

    public static By ProjectDetails() throws Exception {
        return By.xpath(get("ProjectDetails_tap"));
    }

    public static By close_sort_btn() throws Exception {
        return By.xpath(get("close_sort_btn"));
    }

    public static By recommended_sort_option() throws Exception {
        return By.xpath(get("recommended_sort_option"));
    }

    public static By mostPop_sort_option() throws Exception {
        return By.xpath(get("mostPop_sort_option"));
    }

    public static By newest_sort_option() throws Exception {
        return By.xpath(get("newest_sort_option"));
    }

    public static By oldest_sort_option() throws Exception {
        return By.xpath(get("oldest_sort_option"));
    }

    public static By project_sort_option() throws Exception {
        return By.xpath(get("project_sort_option"));
    }

    public static By unit_sort_option() throws Exception {
        return By.xpath(get("unit_sort_option"));
    }

    public static By highPrice_sort_option() throws Exception {
        return By.xpath(get("highPrice_sort_option"));
    }

    public static By lowPrice_sort_option() throws Exception {
        return By.xpath(get("lowPrice_sort_option"));
    }

    public static By recommended_sorting_selected() throws Exception {
        return By.xpath(get("recommended_sorting_selected"));
    }

    public static By mostPopular_sorting_selected() throws Exception {
        return By.xpath(get("mostPopular_sorting_selected"));
    }

    public static By highPriceFirst_sorting_selected() throws Exception {
        return By.xpath(get("highPriceFirst_sorting_selected"));
    }

    public static By lowPriceFirst_sorting_selected() throws Exception {
        return By.xpath(get("lowPriceFirst_sorting_selected"));
    }

    public static By promotedLabel_1() throws Exception {
        return By.xpath(get("promotedLabel_1"));
    }

    public static By promotedLabel_2() throws Exception {
        return By.xpath(get("promotedLabel_2"));
    }

    public static By promotedLabel_3() throws Exception {
        return By.xpath(get("promotedLabel_3"));
    }

    public static By promotedLabel_4() throws Exception {
        return By.xpath(get("promotedLabel_4"));
    }

    public static By testProject() throws Exception {
        return By.xpath(get("testProject"));
    }

    public static By projectTitle() throws Exception {
        return By.xpath(get("projectTitle"));
    }

    public static By unitTitle() throws Exception {
        return By.xpath(get("unitTitle"));
    }

    public static By numberOfViews() throws Exception {
        return By.xpath(get("numberOfViews"));
    }

    public static By marketplace_project_1() throws Exception {
        return By.xpath(get("marketplace_project_1"));
    }

    public static By marketplace_project_2() throws Exception {
        return By.xpath(get("marketplace_project_2"));
    }

    public static By marketplace_project_3() throws Exception {
        return By.xpath(get("marketplace_project_3"));
    }

    public static By marketplace_price_1() throws Exception {
        return By.xpath(get("marketplace_price_1"));
    }

    public static By marketplace_price_2() throws Exception {
        return By.xpath(get("marketplace_price_2"));
    }
    public static By promotedLabel() throws Exception {
        return By.xpath(get("promotedLabel"));
    }

}
