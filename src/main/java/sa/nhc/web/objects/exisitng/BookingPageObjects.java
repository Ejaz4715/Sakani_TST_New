package sa.nhc.web.objects.exisitng;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;


public class BookingPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Project-Title", new HashMap<>() {{
                put("en", "//div[contains(@class,'project-name')]");
                put("ar", "//div[contains(@class,'project-name')]");
            }});
            put("Close-review", new HashMap<>() {{
                put("en", "//button[@aria-label='Close']");
                put("ar", "//button[@aria-label='Close']");
            }});
            put("PayNow-Title", new HashMap<>() {{
                put("en", "");
                put("ar", "//h4[contains(text(),'الدفع اللحظي')]");
            }});
            put("Holder-Name-Input-Txt", new HashMap<>() {{
                put("en", "");
                put("ar", "//form//input[@name='card.holder']");
            }});
            put("Expiry-Date-Input-Txt", new HashMap<>() {{
                put("en", "//form//input[@data-action='blur-card-expiry']");
                put("ar", "//form//input[@data-action='blur-card-expiry']");
            }});
            put("Cvv-Input-Txt", new HashMap<>() {{
                put("en", "//form//input[@name='card.cvv']");
                put("ar", "//form//input[@name='card.cvv']");
            }});
            put("PayNow-button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@aria-label='Pay now']");
            }});
            put("Other-Option", new HashMap<>() {{
                put("en", "//label/span[contains(text(),'Others')]");
                put("ar", "//label/span[contains(text(),'أخرى')]");
            }});
            put("Cancellation-Reason-Input", new HashMap<>() {{
                put("en", "//textarea[@formcontrolname='other_reason']");
                put("ar", "//textarea[@formcontrolname='other_reason']");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By projectTitle() throws Exception {
        return By.xpath(get("Project-Title"));
    }

    public static By closeReview() throws Exception {
        return By.xpath(get("Close-review"));
    }

    public static By payNowTitle() throws Exception {
        return By.xpath(get("PayNow-Title"));
    }

    public static By holderNameInputTxt() throws Exception {
        return By.xpath(get("Holder-Name-Input-Txt"));
    }

    public static By expiryDateInputTxt() throws Exception {
        return By.xpath(get("Expiry-Date-Input-Txt"));
    }

    public static By cvvInputTxt() throws Exception {
        return By.xpath(get("Cvv-Input-Txt"));
    }

    public static By payNowButton() throws Exception {
        return By.xpath(get("PayNow-button"));
    }

    public static By otherOption() throws Exception {
        return By.xpath(get("Other-Option"));
    }

    public static By cancellationReasonInput() throws Exception {
        return By.xpath(get("Cancellation-Reason-Input"));
    }
}