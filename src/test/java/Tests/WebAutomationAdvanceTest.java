package Tests;

import org.testng.annotations.Test;

public class WebAutomationAdvanceTest extends Base.BaseTest{

    @Test(dependsOnMethods = "Tests.LogInTest.loginAndVerify")
    public void navigateToWebAutomationAdvance() throws InterruptedException {
        navigateToWebAutomationAdvancePage.clickOnLearn();
        Thread.sleep(1000);
        navigateToWebAutomationAdvancePage.clickOnLearningMaterials();
        Thread.sleep(1000);
        navigateToWebAutomationAdvancePage.clickOnWebAutomationAdvance();
        Thread.sleep(1000);
    }


}
