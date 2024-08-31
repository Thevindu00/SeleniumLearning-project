import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import java.util.List;

public class LinkExample {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/link.xhtml");
    }


    @Test
    public void takeToDashboard(){
        WebElement homelink = driver.findElement(By.linkText("Go to Dashboard"));
        homelink.click();
        driver.navigate().back();

        WebElement wheretogo = driver.findElement(By.partialLinkText("Find the URL without clicking me."));
        String path = wheretogo.getAttribute("href");
        System.out.println("This link is going to : " + path);

        WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
        brokenlink.click();

        String title = driver.getTitle();
        if(title.contains("404")){
            System.out.println("this is a broken link");
        }
        else {
            System.out.println("this is not a broken link");
        }

        driver.navigate().back();

        WebElement homelink1 = driver.findElement(By.linkText("Go to Dashboard"));
        homelink1.click();

        List<WebElement> countpagelinks = driver.findElements(By.tagName("a"));
        int pagelinkcount = countpagelinks.size();
        System.out.println("link count : " + pagelinkcount);
    }



}
