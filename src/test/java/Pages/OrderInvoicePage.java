package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderInvoicePage {

    WebDriver driver;

    public OrderInvoicePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "view-history-btn")
    WebElement viewInvoiceButton;

    @FindBy(xpath = "//button[contains(@id, 'view-invoice')]")
    WebElement viewButton;

    public void clickViewInvoiceButton() {
        viewInvoiceButton.click();
    }

    public void clickViewInvoiceButtonByXpath() {
        viewButton.click();
    }
}
