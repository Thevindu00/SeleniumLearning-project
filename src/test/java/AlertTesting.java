import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTesting {

    WebDriver driver;

    @BeforeMethod
    public void alertTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/alert.xhtml");
    }

    @Test
    public void testAlerts() throws InterruptedException {
        WebElement simpleAlert = driver.findElement(By.id("j_idt88:j_idt91"));
        simpleAlert.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        driver.findElement(By.id("j_idt88:j_idt93")).click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.dismiss();

        driver.findElement(By.id("j_idt88:j_idt104")).click();
        Alert alert2 = driver.switchTo().alert();
        String alertText = alert2.getText();
        System.out.println(alertText);
        alert2.sendKeys("Siyaaraa");
        Thread.sleep(2000);
        alert2.accept();


    }


}
