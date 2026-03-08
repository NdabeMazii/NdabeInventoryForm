package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class OrderInvoiceTest extends BaseTest {

    @Test(dependsOnMethods = {"Tests.LogInTest.loginAndVerify",
            "Tests.WebAutomationAdvanceTest.navigateToWebAutomationAdvance",
            "Tests.DeviceInformationTest.selectDeviceInformation", "Tests.OrderPreviewTest.completePurchase"})
        public void viewInvoice() throws InterruptedException {
            orderInvoicePage.clickViewInvoiceButton();
            Thread.sleep(1000);
            orderInvoicePage.clickViewInvoiceButtonByXpath();
            Thread.sleep(1000);
        }
}
