package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplementingParallelTesting {

    WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void setup(@Optional  String browser){
        if(browser.equalsIgnoreCase("CHROME")){
            System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("FIREFOX")){
            System.setProperty("webdriver.gecko.driver", "/Users/swati.kalra/Documents/Selenium-Appium/geckodriver");
            driver = new FirefoxDriver();
        }

    }

    @Test
    public void execute(){
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("test automation");
        driver.quit();
    }
}
