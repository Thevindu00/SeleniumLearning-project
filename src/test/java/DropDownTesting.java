import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTesting {

    WebDriver driver;

    @BeforeMethod
    public void openButtonTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/select.xhtml");
    }

    @Test
    public void dropDownTest(){
        WebElement dropDownSelect = driver.findElement(By.xpath("//*[@id='j_idt87']/div/div[1]/div[1]/div/div/select"));
        dropDownSelect.click();
        dropDownSelect.sendKeys(Keys.ARROW_DOWN);
        dropDownSelect.sendKeys(Keys.ENTER);


    }
}
