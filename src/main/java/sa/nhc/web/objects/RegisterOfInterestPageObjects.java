package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class RegisterOfInterestPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("ProjectName_TXTBOX", new HashMap<>() {{
                put("en", "//input[@formcontrolname='name']");
                put("ar", "//input[@formcontrolname='name']");
            }});
            put("ProjectStatus_DDL", new HashMap<>() {{
                put("en", "(//span[@class='ng-arrow-wrapper'])[4]");
                put("ar", "(//span[@class='ng-arrow-wrapper'])[4]");
            }});
            put("spinner_loader", new HashMap<>() {{
                put("en", "//span[contains(text(),'Loading...')]");
                put("ar", "//span[contains(text(),'Loading...')]");
            }});
            put("ProjectStatus_StoppedOption", new HashMap<>() {{
                put("en", "//span[contains(text(),'متوقف بشكل دائم')]");
                put("ar", "//span[contains(text(),'متوقف بشكل دائم')]");
            }});
            put("SearchProject_BTN", new HashMap<>() {{
                put("en", "//span[contains(text(),'Search')]");
                put("ar", "//span[contains(text(),'بحث')]");
            }});
            put("SearchedProject_Result", new HashMap<>() {{
                put("en", "//div[contains(text(),'مشروع الاراضي المميزة في ضاحية الفرسان')]");
                put("ar", "//div[contains(text(),'مشروع الاراضي المميزة في ضاحية الفرسان')]");
            }});
            put("bookableChecker_Area", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='bookable']/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname='bookable']/descendant::button");
            }});
            put("bookableChecker_Clicker", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='bookable']/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname='bookable']/descendant::button");
            }});
            put("RegisterYourInterestChecker_Area", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='use_register_interest_flag']/descendant::button");
                put("ar", "//mat-slide-toggle[@formcontrolname='use_register_interest_flag']/descendant::button");
            }});
            put("RegisterYourInterestChecker_Clicker", new HashMap<>() {{
                put("en", "//mat-slide-toggle[@formcontrolname='use_register_interest_flag']");
                put("ar", "//mat-slide-toggle[@formcontrolname='use_register_interest_flag']");
            }});
            put("RegisterYourInterest_Toggle", new HashMap<>() {{
                put("en", "//label[contains(text(),'تسجيل الاهتمام في المشروع')]");
                put("ar", "//label[contains(text(),'تسجيل الاهتمام في المشروع')]");
            }});
            put("saveChanges_BTN", new HashMap<>() {{
                put("en", "//button[contains(text(),'Save')]");
                put("ar", "//button[contains(text(),'حفظ')]");
            }});
            put("saveChanges_MSG", new HashMap<>() {{
                put("en", "//span[@class='mat-simple-snack-bar-content']");
                put("ar", "//span[@class='mat-simple-snack-bar-content']");
            }});
            put("AccessTheFirstSearchedProject_Cell", new HashMap<>() {{
                put("en", "(//datatable-body-cell)[1]");
                put("ar", "(//datatable-body-cell)[1]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By ProjectStatusDDL() throws Exception {
        return By.xpath(get("ProjectStatus_DDL"));
    }

    public static By projectsSpinnerLoader() throws Exception {
        return By.xpath(get("spinner_loader"));
    }

    public static By ProjectStatusStoppedOption() throws Exception {
        return By.xpath(get("ProjectStatus_StoppedOption"));
    }

    public static By SearchProjectBTN() throws Exception {
        return By.xpath(get("SearchProject_BTN"));
    }

    public static By AccessTheFirstSearchedProject() throws Exception {
        return By.xpath(get("AccessTheFirstSearchedProject_Cell"));
    }

    public static By SearchedProjectResult() throws Exception {
        return By.xpath(get("SearchedProject_Result"));
    }

    public static By bookableCheckerArea() throws Exception {
        return By.xpath(get("bookableChecker_Area"));
    }

    public static By bookableCheckerClicker() throws Exception {
        return By.xpath(get("bookableChecker_Clicker"));
    }

    public static By RegisterYourInterestCheckerArea() throws Exception {
        return By.xpath(get("RegisterYourInterestChecker_Area"));
    }

    public static By RegisterYourInterestCheckerClicker() throws Exception {
        return By.xpath(get("RegisterYourInterestChecker_Clicker"));
    }

    public static By registerYourInterestToggle() throws Exception {
        return By.xpath(get("RegisterYourInterest_Toggle"));
    }

    public static By saveChanges() throws Exception {
        return By.xpath(get("saveChanges_BTN"));
    }

    public static By saveChangesMSG() throws Exception {
        return By.xpath(get("saveChanges_MSG"));
    }

    public static By ProjectNameField() throws Exception {
        return By.xpath(get("ProjectName_TXTBOX"));
    }
}
