package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebAutomationAdvancePage {

    WebDriver driver;

    public WebAutomationAdvancePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "#app-root > nav > div.nav-container > div.nav-items > div:nth-child(4) > button > span.arrow")
    WebElement LearnButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")
    WebElement LearningMaterialsButton;

    @FindBy(css = "#tab-btn-web")
    WebElement WebAutomationAdvanceButton;

    public void clickOnLearn() {
        LearnButton.click();
    }

    public void clickOnLearningMaterials() {
        LearningMaterialsButton.click();
    }

    public void clickOnWebAutomationAdvance() {
        WebAutomationAdvanceButton.click();
    }
}
