package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

    WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "#app-root > nav > div.nav-container > div.nav-user-section > button > span:nth-child(2)")
    WebElement loginButton;

    @FindBy(id = "login-email")
    WebElement loginEmailField;

    @FindBy(id = "login-password")
    WebElement loginPasswordField;

    @FindBy(id = "login-submit")
    WebElement loginSubmitButton;

    public void clickLoginButton() {
        loginButton.click();
    }

    public void enterEmailAddress(String email) {
        loginEmailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        loginPasswordField.sendKeys(password);
    }

    public void clickSubmitButton() {
        loginSubmitButton.click();
    }
    
    public void verifyLoginSuccess(String expectedMessage) {
        WebElement aboutUsText = driver.findElements(By.cssSelector("#app-root > nav > div.nav-container > div.nav-items > button:nth-child(2) > span:nth-child(2)")).get(0);
        aboutUsText.isDisplayed();
        String actualMessage = aboutUsText.getText();
        if (!actualMessage.equals(expectedMessage)) {
            throw new AssertionError("About Us: " + expectedMessage + ", but got: " + actualMessage);
        }
    }
}
