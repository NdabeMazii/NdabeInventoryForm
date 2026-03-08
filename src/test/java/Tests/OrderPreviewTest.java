package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class OrderPreviewTest extends BaseTest {

    String code = "SAVE10";

    @Test(dependsOnMethods = {"Tests.LogInTest.loginAndVerify",
            "Tests.WebAutomationAdvanceTest.navigateToWebAutomationAdvance",
            "Tests.DeviceInformationTest.selectDeviceInformation"})
    public void completePurchase() throws InterruptedException {
        orderPreviewPage.selectExpressShipping();
        Thread.sleep(1000);
        orderPreviewPage.selectOneYearWarranty();
        Thread.sleep(1000);
        orderPreviewPage.enterDiscountCode(code);
        Thread.sleep(1000);
        orderPreviewPage.clickApplyDiscount();
        Thread.sleep(1000);
        orderPreviewPage.clickPurchaseDevice();
        Thread.sleep(1000);

    }


}
