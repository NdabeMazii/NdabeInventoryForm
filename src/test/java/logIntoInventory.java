import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logIntoInventory {

    WebDriver driver;

    @Test
    public void logInAndVerify() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#practice");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#app-root > nav > div.nav-container > div.nav-user-section > button > span:nth-child(2)")).click();
        driver.findElement(By.id("login-email")).sendKeys("ndabemazii@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Mazii@053103");
        driver.findElement(By.id("login-submit")).click();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#dashboard");

        Thread.sleep(5000);

        String aboutUsText = driver.findElement(By.cssSelector("#app-root > nav > div.nav-container > div.nav-items > button:nth-child(2) > span:nth-child(2)")).getText();
        if (aboutUsText.equals("About Us")) {
            System.out.println("Test Passed: About Us text is correct.");
        } else {
            System.out.println("Test Failed: Expected 'About Us' but got '" + aboutUsText + "'.");
        }

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#app-root > nav > div.nav-container > div.nav-items > div:nth-child(4) > button > span.arrow")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#tab-btn-web")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#assessment-instructions > summary")).click();

    }
}
