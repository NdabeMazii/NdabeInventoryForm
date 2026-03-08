package Base;

import Pages.*;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {

    BrowserFactory browserFactory = new BrowserFactory();
        public static final String url = "https://ndosisimplifiedautomation.vercel.app/";
        public static final String browserChoice = "chrome";

        public static WebDriver driver = BrowserFactory.startBrowser(browserChoice, url);
        public static LogInPage loginPage = PageFactory.initElements(driver, LogInPage.class);
        public static WebAutomationAdvancePage navigateToWebAutomationAdvancePage = PageFactory.initElements(driver, WebAutomationAdvancePage.class);
        public static DeviceInformationPage deviceInformationPage = PageFactory.initElements(driver, DeviceInformationPage.class);
        public static OrderPreviewPage orderPreviewPage = PageFactory.initElements(driver, OrderPreviewPage.class);
        public static OrderInvoicePage orderInvoicePage = PageFactory.initElements(driver, OrderInvoicePage.class);



}
