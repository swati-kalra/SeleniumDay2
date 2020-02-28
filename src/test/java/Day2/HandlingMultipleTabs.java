package Day2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingMultipleTabs {

    WebDriver driver;

    @Test
    public void handlingMultipleTabs(){

        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        System.out.println(driver.getWindowHandle());

        String currentHandle = driver.getWindowHandle();

        ((JavascriptExecutor)driver).executeScript("window.open()");

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        System.out.println(driver.getWindowHandle());

        Set<String> handles = driver.getWindowHandles();

        for(String actual: handles){
            if(!actual.equalsIgnoreCase(currentHandle)){
                driver.switchTo().window(actual);

                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                driver.get("https://example.com");
            }
        }


    }



}
