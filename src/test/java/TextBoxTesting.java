import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import java.util.List;

public class TextBoxTesting {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        Thread.sleep(3000);
    }

    @Test
    public void testTextBox(){
        WebElement textbox01 = driver.findElement(By.id("j_idt88:name"));
        textbox01.sendKeys("Thevindu rathnayake");

        driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" Indial");

        boolean textboxstatus  = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("text box is enabled :" + textboxstatus);

        WebElement cleartext = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        cleartext.clear();

        WebElement gettext = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt97']"));
        String value = gettext.getAttribute("value");
        System.out.println("the text is : " + value);

        WebElement nextelementg = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt99']"));
        nextelementg.sendKeys("thevindu@gmail.com" + Keys.TAB + "confirm control movement");
    }

}
