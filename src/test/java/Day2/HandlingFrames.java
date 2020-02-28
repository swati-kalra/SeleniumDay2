package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HandlingFrames {
    WebDriver driver;

    @Test
    public void handlingFrames(){
        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);
        WebElement dragThis = driver.findElement(By.id("draggable"));
        WebElement dropItHere = driver.findElement(By.id("droppable"));

        actions.dragAndDrop(dragThis, dropItHere).build().perform();



    }
}
