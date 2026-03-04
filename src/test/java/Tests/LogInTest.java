package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogInTest extends Base.BaseTest {

    @Test(dataProvider = "getData")
    public void loginAndVerify(String email, String password) throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(2000);
        loginPage.enterEmailAddress(email);
        loginPage.enterPassword(password);
        Thread.sleep(2000);
        loginPage.clickSubmitButton();
        Thread.sleep(5000);
        loginPage.verifyLoginSuccess("About Us");
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"ndabemazii@gmail.com", "Mazii@053103"},
        };
    }
}




