package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class WorkingWithJSAlerts {

    WebDriver driver;

    @Test
    public void handlingAlerts(){
        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElements(By.tagName("button")).get(1).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.switchTo().alert();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

    }


}
