package Day2.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass {

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        WebDriver driver = new ChromeDriver();


        ObjectRepo or = new ObjectRepo(driver);
        driver.get(or.getUrl());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        or.getEmail().sendKeys("abc");
        or.getPassword().sendKeys("def");


    }


}
