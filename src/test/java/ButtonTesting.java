import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class ButtonTesting {
    WebDriver driver;

    @BeforeMethod
    public void openButtonTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/button.xhtml;jsessionid=node01k4pulefs01aa1oqkoda54b2nv5781569.node0");
    }

    @Test
    public void testButtons(){
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is wrong");
        }


        driver.navigate().back();

        WebElement getPossition = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']"));
        Point xypoint = getPossition.getLocation();
        int x = xypoint.getX();
        int y = xypoint.getY();
        System.out.println(" x location is " + x + " y location is " + y);

        WebElement findColor = driver.findElement(By.id("j_idt88:j_idt96"));
        String bgColor = findColor.getCssValue("background-color");
        System.out.println("color of the button is " + bgColor);

        WebElement findHnW = driver.findElement(By.id("j_idt88:j_idt100"));
        int height = findHnW.getSize().getHeight();
        int width = findHnW.getSize().getWidth();
        System.out.println("the height is " + height + " the width is " + width);
    }
}
