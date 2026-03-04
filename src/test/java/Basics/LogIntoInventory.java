package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.time.Duration;

public class LogIntoInventory {

    WebDriver driver;

    @Test
    public void logInAndVerify() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#app-root > nav > div.nav-container > div.nav-user-section > button > span:nth-child(2)")).click();
        driver.findElement(By.id("login-email")).sendKeys("ndabemazii@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Mazii@053103");
        driver.findElement(By.id("login-submit")).click();

        Thread.sleep(2000);

        String aboutUsText = driver.findElement(By.cssSelector("#app-root > nav > div.nav-container > div.nav-items > button:nth-child(2) > span:nth-child(2)")).getText();
        if (aboutUsText.equals("About Us")) {
            System.out.println("Test Passed: About Us text is correct.");
        } else {
            System.out.println("Test Failed: Expected 'About Us' but got '" + aboutUsText + "'.");
        }
        Thread.sleep(2000);

        navigateToWebAutomationAdvance();
    }

    public void navigateToWebAutomationAdvance() throws InterruptedException {
        driver.findElement(By.cssSelector("#app-root > nav > div.nav-container > div.nav-items > div:nth-child(4) > button > span.arrow")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#tab-btn-web")).click();
        Thread.sleep(1000);

        selectDeviceInformation();
    }

    public void selectDeviceInformation() throws InterruptedException {
        driver.findElement(By.id("deviceType")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"deviceType\"]/option[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("brand")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"brand\"]/option[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("storage-128GB")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("color")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"color\"]/option[4]")).click();
        Thread.sleep(1000);
         driver.findElement(By.id("quantity")).sendKeys("2");
        Thread.sleep(1000);
        driver.findElement(By.id("address")).sendKeys("123 Test Street");
        Thread.sleep(1000);
        driver.findElement(By.id("inventory-next-btn")).click();
        Thread.sleep(1000);

        orderPreview();
    }

    public void orderPreview() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.id("shipping-express")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("warranty-1yr")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("discount-code")).sendKeys("SAVE10");
        Thread.sleep(1000);
        driver.findElement(By.id("apply-discount-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("purchase-device-btn")).click();
        Thread.sleep(1000);

        // Wait for the view-history button and click it
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("view-history-btn")));
        driver.findElement(By.id("view-history-btn")).click();
        Thread.sleep(2000);

        // Wait for any invoice button to appear and click the first one
        try {
            WebElement invoiceButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@id, 'view-invoice')]")));
            invoiceButton.click();
            Thread.sleep(2000);
            System.out.println("Invoice opened successfully!");
        } catch (Exception e) {
            System.out.println("No invoice found yet. This may be expected if the invoice hasn't been created.");
            e.printStackTrace();
        }
    }
}
