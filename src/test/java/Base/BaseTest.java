package Base;

import Pages.LogInPage;
import Pages.navigateToWebAutomationAdvancePage;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {

    BrowserFactory browserFactory = new BrowserFactory();
        public final String url = "https://ndosisimplifiedautomation.vercel.app/";
        public final String browserChoice = "chrome";

        public WebDriver driver = BrowserFactory.startBrowser(browserChoice, url);
        public LogInPage loginPage = PageFactory.initElements(driver, LogInPage.class);
        public navigateToWebAutomationAdvancePage navigateToWebAutomationAdvancePage = PageFactory.initElements(driver, navigateToWebAutomationAdvancePage.class);



}
