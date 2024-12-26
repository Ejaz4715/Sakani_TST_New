package sa.nhc.web;

import sa.nhc.web.pages.*;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;
import sa.nhc.web.pages.exisitng.*;

import java.util.Map;

public class NHCWebApplication {

    /**
     * Test ENV
     */
    public final LoginPage loginPage;
    public final HomePage homePage;
    public final RegistrationPage registrationPage;

    /**
     * STG ENV
     */
    public final CardDetailsPage cardDetailsPage;
    public final EligibilityPage eligibilityPage;
    public final FiltersPage filtersPage;
    public final FullAuctionJourneyPage fullAuctionJourneyPage;
    public final FullBookingJourneyPage fullBookingJourneyPage;
    public final MOHLandBookingJourneyPage mohLandBookingJourneyPage;
    public final ObjectionPage objectionPage;
    public final PriceQuotationPage priceQuotationPage;
    public final QueueingOffPlanPage queueingOffPlanPage;
    public final RegisterOfInterestPage registerOfInterestPage;
    public final SalesContractPage salesContractPage;
    public final SortingPage sortingPage;
    public final TagsPage tagsPage;
    public final UploadAllLicensePage uploadAllLicensePage;
    public final WaiverPage waiverPage;

    public NHCWebApplication() {
        /*
         * Test ENV
         * */
        loginPage = new LoginPage();
        homePage = new HomePage();
        registrationPage = new RegistrationPage();

        /*
         * STG ENV
         * */
        cardDetailsPage = new CardDetailsPage();
        eligibilityPage = new EligibilityPage();
        filtersPage = new FiltersPage();
        fullAuctionJourneyPage = new FullAuctionJourneyPage();
        fullBookingJourneyPage = new FullBookingJourneyPage();
        mohLandBookingJourneyPage = new MOHLandBookingJourneyPage();
        objectionPage = new ObjectionPage();
        priceQuotationPage = new PriceQuotationPage();
        queueingOffPlanPage = new QueueingOffPlanPage();
        registerOfInterestPage = new RegisterOfInterestPage();
        salesContractPage = new SalesContractPage();
        sortingPage = new SortingPage();
        tagsPage = new TagsPage();
        uploadAllLicensePage = new UploadAllLicensePage();
        waiverPage = new WaiverPage();
    }

    public void openApplication(Map<String, String> data) throws Exception {
        if (data.get("URL") != null) {
            Browser.openUrl(data.get("URL"));
        } else {
            Browser.openUrl(TestConfigManager.getTestSettingsWebAppURL());
        }
    }
}
