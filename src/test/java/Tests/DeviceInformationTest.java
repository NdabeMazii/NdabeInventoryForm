package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class DeviceInformationTest extends BaseTest {

    String quantity = "1";
    String address = "123 Test Street";

    @Test(dependsOnMethods = {"Tests.LogInTest.loginAndVerify",
            "Tests.WebAutomationAdvanceTest.navigateToWebAutomationAdvance"})
    public void selectDeviceInformation() throws InterruptedException {
        deviceInformationPage.selectDeviceType();
        Thread.sleep(1000);
        deviceInformationPage.selectBrand();
        Thread.sleep(1000);
        deviceInformationPage.selectStorage();
        Thread.sleep(1000);
        deviceInformationPage.selectColor();
        Thread.sleep(1000);
        deviceInformationPage.enterQuantity(quantity);
        Thread.sleep(1000);
        deviceInformationPage.enterAddress(address);
        Thread.sleep(1000);
        deviceInformationPage.clickNextButton();
        Thread.sleep(1000);
    }
}
