package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TraversingAList {

    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/practice-form.html");
    }

    @Test
    public void test(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> listItems = driver.findElements(By.xpath("//ul[@class='wsb-navigation-rendered-top-level-menu ']/li"));

        Actions actions = new Actions(driver);
        for(WebElement li: listItems){
            actions.moveToElement(li).build().perform();

            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        }

    }
}
