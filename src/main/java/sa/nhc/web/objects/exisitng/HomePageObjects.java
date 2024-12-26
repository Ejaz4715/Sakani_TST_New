package sa.nhc.web.objects.exisitng;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class HomePageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{
        put("Register_Your_interest_Close_BTN", new HashMap<>() {{
            put("en", "//span[@class='svg-icon icon-close-dark cursor-pointer']");
            put("ar", "//span[@class='svg-icon icon-close-dark cursor-pointer']");
        }});
        put("BTN_Home_Login", new HashMap<>(){{
            put ("en", "//span//a[@role='button']");
            put ("ar", "//span//a[@role='button']");
        }});
        put("ShowSearched_BTN", new HashMap<>() {{
            put("en", "//button[contains(text(),'View')]");
            put("ar", "//button[contains(text(),'عرض')]");
        }});
        put("SearchForProject_BTN", new HashMap<>() {{
            put("en", "(//div[contains(text(),'Select / Search')])[3]");
            put("ar", "(//div[contains(text(),'حدد / بحث')])[3]");
        }});
        put("SearchedProject", new HashMap<>() {{
            put("en", "//span[contains(text(),'مشاريع ال')]");
            put("ar", "//span[contains(text(),'مشاريع ال')]");
        }});
        put("Input_the_Project_Name_to_Search", new HashMap<>() {{
            put("en", "(//div[contains(text(),'حدد / بحث')])[3]/following-sibling::div/child::input");
            put("ar", "(//div[contains(text(),'حدد / بحث')])[3]/following-sibling::div/child::input");
        }});
        put("SearchedProjectFor_Tags", new HashMap<>() {{
            put("en", "(//span[contains(@class,'ng-option-label ng-star-inserted')])[1]");
            put("ar", "(//span[contains(@class,'ng-option-label ng-star-inserted')])[1]");
        }});
        put("ProjectDetails_tap", new HashMap<>() {{
            put("en", "//button[contains(text(),'Project details')]");
            put("ar", "//Button[contains(text(),'تفاصيل المشروع')]");
        }});
        put("alreadyRegisteredProject_MSG", new HashMap<>() {{
            put("en", "//span[contains(text(),'Project code is_taken')]");
            put("ar", "//span[contains(text(),'Project code is_taken')]");
        }});






        put("Cookies_BTN", new HashMap<>() {{
            put("en", "//button[@class='btn btn-primary cookie-accepted']");
            put("ar", "//button[@class='btn btn-primary cookie-accepted']");
        }});
        put("Visitor_ADV_BTN_Login", new HashMap<>() {{
            put("en", "(//span[contains(text(),'Login')])[3]");
            put("ar", "(//span[contains(text(),'تسجيل الدخول')])[3]");
        }});
        put("CloseIntroduction_BTN", new HashMap<>() {{
            put("en", "//a[@class='introjs-skipbutton']");
            put("ar", "//a[@class='introjs-skipbutton']");
        }});
        put("BTN_X", new HashMap<>() {{
            put("en", "//a[contains(@class,'skipbutton')]");
            put("ar", "//a[contains(@class,'skipbutton')]");
        }});

        put("FILTER_BTN", new HashMap<>() {{
            put("en", "//span[contains(text(),'Filter')]");
            put("ar", "//span[contains(text(),'تصفية النتائج')]");
        }});
        put("MarketPlace_BTN", new HashMap<>() {{
            put("en", "//a[contains(text(),'Marketplace')]");
            put("ar", "//a[contains(text(),'السوق العقاري')]");
        }});
        put("awareness_marketplace_closeBtn", new HashMap<>() {{
            put("en", "a.introjs-skipbutton");
            put("ar", "a.introjs-skipbutton");
        }});

        put("BTN_My_Profile", new HashMap<>() {{
            put("en", "//h6[contains(text(),'My Profile')]");
            put("ar", "//h6[contains(text(),'ملفي الشخصي')]");
        }});
        put("Result_Project", new HashMap<>() {{
            put("en", "//div[contains(text(),'مشروع الاراضي المميزة في ضاحية الفرسان')]");
            put("ar", "//div[contains(text(),'مشروع الاراضي المميزة في ضاحية الفرسان')]");
        }});
        put("ListOfApartments_BTN", new HashMap<>() {{
            put("en", "(//button[@dir='rtl'])[1]");
            put("ar", "(//button[@dir='rtl'])[1]");
        }});
        put("EmailButton_TXTBox", new HashMap<>() {{
            put("en", "//input[@placeholder='Enter your email address']");
            put("ar", "//input[@placeholder='البريد الإلكتروني']");
        }});
        put("Submit_BTn", new HashMap<>() {{
            put("en", "//span[contains(text(),'Submit')]/parent::button");
            put("ar", "//span[contains(text(),'إرسال')]/parent::button");
        }});
        put("Validation_MSG", new HashMap<>() {{
            put("en", "//p[contains(text(),'We’ll let you know when this project starts taking')]");
            put("ar", "//p[contains(text(),'سيتم تنبيهك عند تفعيل خاصية الحجز على المشروع')]");
        }});
        put("registerYourInterest_Label", new HashMap<>() {{
            put("en", "//h5[contains(text(),'سجل اهتمامك الان!')]");
            put("ar", "//h5[contains(text(),'سجل اهتمامك الان!')]");
        }});
        put("InvalidEmailValidation_MSG", new HashMap<>() {{
            put("en", "//span[contains(text(),'Extra info email_invalid')]");
            put("ar", "//span[contains(text(),'Extra info email_invalid')]");
        }});
        put("Profile_Hover", new HashMap<>() {{
            put("en", "//span[@class='svg-icon svg-icon--small icon-chevron-down d-inline-block align-middle']");
            put("ar", "//span[@class='svg-icon svg-icon--small icon-chevron-down d-inline-block align-middle']");
        }});
    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By Cookies_BTN () throws Exception{
        return By.xpath(get("Cookies_BTN"));
    }
    public static By Register_Your_interest_Close_BTN () throws Exception{
        return By.xpath(get("Register_Your_interest_Close_BTN"));
    }

    public static By BTNHomeLogin () throws Exception{
        return By.xpath(get("BTN_Home_Login"));
    }

    public static By SearchForProject() throws Exception {
        return By.xpath(get("SearchForProject_BTN"));
    }

    public static By SearchedProjectResult() throws Exception {
        return By.xpath(get("SearchedProject"));
    }

    public static By SearchedProjectForTags() throws Exception {
        return By.xpath(get("SearchedProjectFor_Tags"));
    }

    public static By InputProjectName() throws Exception {
        return By.xpath(get("Input_the_Project_Name_to_Search"));
    }

    public static By ShowSearchedBTN() throws Exception {
        return By.xpath(get("ShowSearched_BTN"));
    }

    public static By ProjectDetails() throws Exception {
        return By.xpath(get("ProjectDetails_tap"));
    }

    public static By alreadyRegisteredProjectMSG() throws Exception {
        return By.xpath(get("alreadyRegisteredProject_MSG"));
    }

    public static By CloseIntroductionBTN() throws Exception {
        return By.xpath(get("CloseIntroduction_BTN"));
    }

    public static By ProfileHover() throws Exception {
        return By.xpath(get("Profile_Hover"));
    }

    public static By Visitor_ADV_BTN_Login() throws Exception {
        return By.xpath(get("Visitor_ADV_BTN_Login"));
    }

    public static By BtnX() throws Exception {
        return By.xpath(get("BTN_X"));
    }

    public static By BTNMyProfile() throws Exception {
        return By.xpath(get("BTN_My_Profile"));
    }

    public static By FilterBTN() throws Exception {
        return By.xpath(get("FILTER_BTN"));
    }

    public static By MarketPlaceBTN() throws Exception {
        return By.xpath(get("MarketPlace_BTN"));
    }

    public static By awareness_marketplace_closeBtn() throws Exception {
        return By.cssSelector(get("awareness_marketplace_closeBtn"));
    }

    public static By Result_Project_dIV() throws Exception {
        return By.xpath(get("Result_Project"));
    }

    public static By ListOfApartments() throws Exception {
        return By.xpath(get("ListOfApartments_BTN"));
    }

    public static By EmailField() throws Exception {
        return By.xpath(get("EmailButton_TXTBox"));
    }

    public static By SubmitBTn() throws Exception {
        return By.xpath(get("Submit_BTn"));
    }

    public static By ValidationMSG() throws Exception {
        return By.xpath(get("Validation_MSG"));
    }

    public static By registerYourInterestLabel() throws Exception {
        return By.xpath(get("registerYourInterest_Label"));
    }

    public static By InvalidEmailValidationMSG() throws Exception {
        return By.xpath(get("InvalidEmailValidation_MSG"));
    }

}
