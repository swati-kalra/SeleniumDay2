package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class KeyboardAndMouseActions {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
    }

//    @Test
//    public void keyboardActions(){
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        WebElement email = driver.findElement(By.name("email"));
//        Actions actions = new Actions(driver);
//        actions.keyDown(email, Keys.SHIFT).sendKeys("a").build().perform();
//        //actions.keyDown(email, Keys.chord(Keys.SHIFT, Keys.ADD, "1")).build().perform();
//        //SwAtI, JiTeNdRa + Tab
//
//    }

    @Test
    public void mouseActions(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement email = driver.findElement(By.name("email"));
        Actions actions = new Actions(driver);
        email.sendKeys("Swati");
        actions.doubleClick(email).build().perform();
        actions.contextClick(email).build().perform();

    }
}
