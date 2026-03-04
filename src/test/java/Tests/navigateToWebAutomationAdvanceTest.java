package Tests;

import org.testng.annotations.Test;

public class navigateToWebAutomationAdvanceTest extends Base.BaseTest{

    @Test
    public void navigateToWebAutomationAdvance() throws InterruptedException {
        navigateToWebAutomationAdvancePage.clickOnLearn();
        Thread.sleep(1000);
        navigateToWebAutomationAdvancePage.clickOnLearningMaterials();
        Thread.sleep(1000);
        navigateToWebAutomationAdvancePage.clickOnWebAutomationAdvance();
        Thread.sleep(1000);
    }


}
